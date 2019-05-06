/*
 * #%L
 * Gwt Material Design Components
 * %%
 * Copyright (C) 2017 - 2017 Gwt Material Design Components
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.components.client.ui.misc.datePicker;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.components.client.base.interfaces.HasSelection;
import gwt.material.design.components.client.base.mixin.HasSelectionMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.DatePickerType;
import gwt.material.design.components.client.events.SelectionEvent.HasSelectionHandlers;
import gwt.material.design.components.client.events.SelectionEvent.SelectionHandler;
import gwt.material.design.components.client.lang.MdcDate;
import gwt.material.design.components.client.lang.MdcMonth;
import gwt.material.design.components.client.lang.MdcRange;
import gwt.material.design.components.client.lang.MdcYear;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.misc.datePicker.headers.AbstractHeader;
import gwt.material.design.components.client.ui.misc.datePicker.inlines.MonthYear;
import gwt.material.design.components.client.ui.misc.datePicker.inlines.YearRange;
import gwt.material.design.components.client.ui.misc.datePicker.selectors.day.Days;
import gwt.material.design.components.client.ui.misc.datePicker.selectors.month.Months;
import gwt.material.design.components.client.ui.misc.datePicker.selectors.year.Years;

/**
 * 
 * @author Richeli Vargas
 *
 */
public abstract class AbstractDatePicker<V, H extends AbstractHeader<V>> extends Div
		implements HasSelection<V>, HasSelectionHandlers<V> {

	protected final H header = initializeHeader();
	protected final MonthYear monthYear = new MonthYear();
	protected final YearRange yearRange = new YearRange();
	protected final Days days = new Days();
	protected final Months months = new Months();
	protected final Years years = new Years();

	protected final Div daysContent = new Div(CssName.MDC_DATEPICKER__BODY);
	protected final Div monthsContent = new Div(CssName.MDC_DATEPICKER__BODY);
	protected final Div yearsContent = new Div(CssName.MDC_DATEPICKER__BODY);
	protected final Div customActionsContent = new Div(CssName.MDC_DATEPICKER__CUSTOM_ELEMENTS_CONTENT);

	protected final HasSelectionMixin<AbstractDatePicker<V, H>, V> selectionMixin = new HasSelectionMixin<>(this);

	protected final DatePickerType type;

	public AbstractDatePicker(final DatePickerType type) {
		super(CssName.MDC_DATEPICKER);
		this.type = type;
	}

	protected abstract H initializeHeader();

	protected abstract void onDaysSelection(final Collection<MdcDate> selection);

	@Override
	protected void onInitialize() {
		super.onInitialize();

		days.setType(type);
		months.setAllowUnselect(false);
		years.setAllowUnselect(false);
		
		monthYear.addSelectionHandler(event -> onMonthYearSelection());
		yearRange.addSelectionHandler(event -> onYearRangeSelection());
		days.addSelectionHandler(event -> onDaysSelection());
		months.addSelectionHandler(event -> onMonthsSelection());
		years.addSelectionHandler(event -> onYearsSelection());

		daysContent.add(monthYear);
		daysContent.add(days);
		monthsContent.add(months);
		yearsContent.add(yearRange);
		yearsContent.add(years);

		super.add(header);
		super.add(daysContent);
		super.add(monthsContent);
		super.add(yearsContent);
		super.add(customActionsContent);

		final V date = getSelection();
		header.setValue(date);

		toggle(daysContent);
	}

	@Override
	public void add(Widget child) {
		customActionsContent.add(child);
	}

	protected final void toggle(final Widget widget) {
		toggle(widget.getElement());
	}

	protected final native void toggle(final Element element) /*-{
		var bodyClass = @gwt.material.design.components.client.constants.CssName::MDC_DATEPICKER__BODY;
		var parent = this.@gwt.material.design.components.client.ui.MaterialDatePicker::getElement()();

		$wnd.jQuery(parent).find("." + bodyClass).hide();
		$wnd.jQuery(element).show();

	}-*/;

	@Override
	public HandlerRegistration addSelectionHandler(SelectionHandler<V> handler) {
		return selectionMixin.addSelectionHandler(handler);
	}

	@Override
	public void setSelection(final V selected) {
		setSelection(selected, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setSelection(final V selected, boolean fireEvents) {
		selectionMixin.setSelection(selected, fireEvents);
		header.setValue(selected);

		final Collection<MdcDate> daysCollection;
		final Collection<MdcMonth> monthsCollection;
		final Collection<MdcYear> yearsCollections;

		if (selected instanceof MdcDate) {
			final MdcDate date = (MdcDate) selected;
			daysCollection = Arrays.asList(date);
			monthsCollection = Arrays.asList(new MdcMonth(date.getMonth()));
			yearsCollections = Arrays.asList(date.getMdcMonth().getMdcYear());
		} else if (selected instanceof MdcRange<?>) {

			final MdcRange<?> range = (MdcRange<?>) selected;
			final Object start = range.getStart();
			final Object end = range.getEnd();
			final MdcDate startDate = (MdcDate) start;
			final MdcDate endDate = (MdcDate) end;

			final MdcDate theCloset = (new MdcDate()).getTheClosest(startDate == null ? new MdcDate() : startDate, 
					endDate == null ? new MdcDate() : endDate);
			
			final MdcMonth month = new MdcMonth(theCloset.getMonth());
			final MdcYear year = theCloset.getMdcYear();

			daysCollection = Arrays.asList(startDate, endDate);
			monthsCollection = Arrays.asList(month);
			yearsCollections = Arrays.asList(year);

		} else if (selected instanceof Collection<?>) {
			daysCollection = (Collection<MdcDate>) selected;
			monthsCollection = Arrays.asList();
			yearsCollections = Arrays.asList();
		} else {
			daysCollection = Arrays.asList();
			monthsCollection = Arrays.asList();
			yearsCollections = Arrays.asList();
		}

		days.setSelection(daysCollection, false);
		if (!monthsCollection.isEmpty())
			months.setSelection(monthsCollection, false);
		if (!yearsCollections.isEmpty())
			years.setSelection(yearsCollections, false);
	}

	@Override
	public V getSelection() {
		return selectionMixin.getSelection();
	}

	public MdcDate getMinValue() {
		return days.getMinValue();
	}

	public void setMinValue(final MdcDate minValue) {
		days.setMinValue(minValue);
	}

	public MdcDate getMaxValue() {
		return days.getMaxValue();
	}

	public void setMaxValue(final MdcDate maxValue) {
		days.setMaxValue(maxValue);
	}

	public void clearTooltips(final MdcDate value) {
		days.clearTooltips(value);
	}

	public void addTooltips(final MdcDate value, final String... tooltip) {
		days.addTooltips(value, tooltip);
	}

	public void goTo() {
		goTo(new MdcMonth());
	}
	
	public void goTo(final MdcMonth month) {
		monthYear.setSelection(month);
	}
	
	public void showDays(final MdcMonth month) {
		toggle(daysContent);
	}

	public void showMonths() {
		toggle(monthsContent);
	}

	public void showYears() {
		toggle(yearsContent);
	}
	
	protected void onMonthYearSelection() {
		final MdcMonth month = monthYear.getSelection();
		days.draw(month);
		months.setSelection(Arrays.asList(new MdcMonth(month.getMonth())), false);
		years.setSelection(Arrays.asList(new MdcYear(month.getYear())), false);
	}

	protected void onYearRangeSelection() {
		final MdcYear year = yearRange.getSelection();
		years.draw(year.getYear());
	}

	protected void onDaysSelection() {
		final Collection<MdcDate> collection = days.getSelection().stream()
				.sorted((a, b) -> Integer.compare(a.getTimestamp(), b.getTimestamp())).collect(Collectors.toList());
		onDaysSelection(collection);
	}

	protected void onMonthsSelection() {
		final Collection<MdcMonth> collection = months.getSelection();
		final MdcMonth month = collection == null || collection.isEmpty() ? new MdcMonth()
				: collection.iterator().next();

		final MdcMonth visibleMonth = monthYear.getSelection() == null ? new MdcMonth() : monthYear.getSelection();
		visibleMonth.setMonth(month.getMonth());
		monthYear.setSelection(visibleMonth);

		toggle(daysContent);

	}

	protected void onYearsSelection() {

		final Collection<MdcYear> collection = years.getSelection();
		final MdcYear year = collection == null || collection.isEmpty() ? new MdcYear() : collection.iterator().next();

		yearRange.setSelection(new MdcYear(year.getYear()), false);

		final MdcMonth visibleMonth = monthYear.getSelection() == null ? new MdcMonth() : monthYear.getSelection();
		visibleMonth.setYear(year.getYear());
		monthYear.setSelection(visibleMonth);

		toggle(daysContent);
	}

}
