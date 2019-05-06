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
package gwt.material.design.components.client.ui;

import java.util.Arrays;
import java.util.Collection;

import gwt.material.design.components.client.constants.DatePickerType;
import gwt.material.design.components.client.lang.MdcDate;
import gwt.material.design.components.client.lang.MdcMonth;
import gwt.material.design.components.client.ui.misc.datePicker.AbstractDatePicker;
import gwt.material.design.components.client.ui.misc.datePicker.headers.SingleDateHeader;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialDatePicker extends AbstractDatePicker<MdcDate, SingleDateHeader> {

	public MaterialDatePicker() {
		super(DatePickerType.SINGLE);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		header.addDayClickHandler(event -> onHeaderDayClick());
		header.addMonthClickHandler(event -> onHeaderMonthClick());
		header.addYearClickHandler(event -> onHeaderYearClick());
				
		final MdcDate date = getSelection() == null ? new MdcDate() : getSelection();
		header.setValue(date);
		monthYear.setSelection(date.getMdcMonth());
	}

	@Override
	protected SingleDateHeader initializeHeader() {
		return new SingleDateHeader();
	}

	@Override
	protected void onDaysSelection(final Collection<MdcDate> selection) {
		final MdcDate date = selection.iterator().next();
		header.setValue(date);
		days.setSelection(Arrays.asList(date), false);
		months.setSelection(Arrays.asList(new MdcMonth(date.getMonth())), false);
		years.setSelection(Arrays.asList(date.getMdcMonth().getMdcYear()), false);
	}
	
	protected void onHeaderDayClick() {
		final MdcDate date = header.getValue();
		onHeaderDayClick(date == null ? null : date.getMdcMonth());
	}

	protected void onHeaderDayClick(final MdcMonth month) {
		if (month != null)
			monthYear.setSelection(month);
		toggle(daysContent);
	}

	protected void onHeaderMonthClick() {
		toggle(monthsContent);
	}

	protected void onHeaderYearClick() {
		years.draw(header.getValue().getYear());
		toggle(yearsContent);
	}
}
