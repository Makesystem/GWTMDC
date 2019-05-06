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
package gwt.material.design.components.client.ui.misc.datePicker.headers;

import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

import gwt.material.design.components.client.base.mixin.HasValueMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.utils.helper.ObjectHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public abstract class AbstractHeader<V> extends Div  implements HasValue<V>{

	protected final HasValueMixin<AbstractHeader<V>, V> valueMixin = new HasValueMixin<>(this);
	
	protected abstract void drawValue(final V value);
	
	public AbstractHeader() {
		super(CssName.MDC_DATEPICKER__HEADER);
	}

	public AbstractHeader(final String... initialClasses) {
		super(ObjectHelper.concat(new String[] { CssName.MDC_DATEPICKER__HEADER }, initialClasses));
	}
	
	@Override
	public HandlerRegistration addValueChangeHandler(ValueChangeHandler<V> handler) {
		return valueMixin.addValueChangeHandler(handler);
	}

	@Override
	public V getValue() {
		return valueMixin.getValue();
	}

	@Override
	public void setValue(V value) {
		drawValue(value);
		valueMixin.setValue(value);
	}

	@Override
	public void setValue(V value, boolean fireEvents) {
		drawValue(value);
		valueMixin.setValue(value, fireEvents);
	}
}
