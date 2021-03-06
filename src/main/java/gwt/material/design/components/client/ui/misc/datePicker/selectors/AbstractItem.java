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
package gwt.material.design.components.client.ui.misc.datePicker.selectors;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import gwt.material.design.components.client.base.mixin.ToggleStyleMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.ui.MaterialLabel;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.utils.helper.ObjectHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public abstract class AbstractItem<T> extends Div {
	
	protected final ToggleStyleMixin<AbstractItem<T>> todayMixin = new ToggleStyleMixin<>(this, CssName.MDC_DATEPICKER__TODAY);
	
	protected final MaterialLabel label = new MaterialLabel(CssName.MDC_TYPOGRAPHY__CAPTION);
	protected final Div tooltipIndicator = new Div(CssName.MDC_DATEPICKER__TOOLTIP_INDICATOR);

	protected final Collection<String> tooltips = new LinkedList<>();
	
	public AbstractItem(final T dataObject) {
		super(CssName.MDC_DATEPICKER__ITEM);
		setDataObject(dataObject);
	}

	public AbstractItem(final T dataObject, final String... initialClasses) {
		super(ObjectHelper.concat(new String[] {CssName.MDC_DATEPICKER__ITEM}, initialClasses));
		setDataObject(dataObject);
	}
	
	@Override
	protected void onInitialize() {
		ripleMixin.initialize();
		super.onInitialize();		
		label.setText(dataToString(getDataObject()));		
		add(label);		
		add(tooltipIndicator);
	}
	
	@Override
	protected void onLoad() {
		super.onLoad();
		drawTooltips();
	}

	public void addTooltip(final String... tooltips) {
		this.tooltips.addAll(Arrays.asList(tooltips));
		drawTooltips();
	}

	public void removeTooltip(final String tooltip) {
		this.tooltips.remove(tooltip);
		drawTooltips();
	}

	public void clearTooltips() {
		this.tooltips.clear();
		drawTooltips();
	}

	protected void drawTooltips() {
		if (initialized) {
			setAttribute("count_tooltips", String.valueOf(this.tooltips.size()));
			if (this.tooltips.isEmpty())
				setTooltip(null);
			else
				setTooltip("<div style=\"text-align: left;\">" + this.tooltips.stream()
						.map(tooltip -> "&#8226; " + tooltip).collect(Collectors.joining("<br/>")) + "</div>");
		}
	}

	protected abstract String dataToString(final T data);
}
