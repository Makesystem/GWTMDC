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
package gwt.material.design.components.client.base.mixin;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

import gwt.material.design.components.client.base.mixin.base.AbstractMixin;
import gwt.material.design.components.client.base.widget.MaterialUIObject;

/**
 * @author Richeli Vargas
 */
public class HasValueMixin<UIO extends MaterialUIObject & HasValue<T>, T>
		extends AbstractMixin<UIO> implements HasValue<T> {

	protected boolean valueChangeHandlerInitialized = false;
	protected T value;

	public HasValueMixin(final UIO widget) {
		super(widget);
	}

	@Override
	public void setValue(final T value) {
		setValue(value, true);
	}

	@Override
	public void setValue(final T value, boolean fireEvents) {
		this.value = value;
		if (fireEvents)
			fireChangeEvent();
	}

	@Override
	public T getValue() {
		return value;
	}

	public void fireChangeEvent() {
		ValueChangeEvent.fire(uiObject, uiObject.getValue());
	}

	@Override
	public HandlerRegistration addValueChangeHandler(final ValueChangeHandler<T> handler) {
		if (!valueChangeHandlerInitialized) {
			valueChangeHandlerInitialized = true;
			uiObject.addDomHandler(event -> {
				event.preventDefault();
				event.stopPropagation();
				fireChangeEvent();
			}, ChangeEvent.getType());
		}
		return uiObject.addHandler(handler, ValueChangeEvent.getType());
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		uiObject.fireEvent(event);
	}

}
