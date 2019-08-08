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
package gwt.material.design.components.client.ui.misc.dataTable;

import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

import gwt.material.design.components.client.base.interfaces.HasPlaceholder;
import gwt.material.design.components.client.base.mixin.HasValueMixin;
import gwt.material.design.components.client.base.mixin.PlaceholderMixin;
import gwt.material.design.components.client.base.mixin.TypingMixin;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.InputType;
import gwt.material.design.components.client.events.TypingEvent.HasTypingHandlers;
import gwt.material.design.components.client.events.TypingEvent.TypingHandler;
import gwt.material.design.components.client.ui.html.Input;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class FilterInput extends Input implements HasTypingHandlers, HasValue<String>, HasPlaceholder {

	protected final HasValueMixin<FilterInput, String> hasValueMixin = new HasValueMixin<>(this);
	protected final TypingMixin<FilterInput> typingMixin = new TypingMixin<>(this);
	protected final PlaceholderMixin<FilterInput> placeholderMixin = new PlaceholderMixin<>(this);

	public FilterInput() {
		super(InputType.SEARCH, CssName.MDC_DATA_TABLE__FILTER__INPUT, CssName.MDC_TYPOGRAPHY__BODY_2);
	}

	@Override
	public HandlerRegistration addValueChangeHandler(final ValueChangeHandler<String> handler) {
		return hasValueMixin.addValueChangeHandler(handler);
	}

	@Override
	public void setPlaceholder(final String placeholder) {
		placeholderMixin.setPlaceholder(placeholder);
	}

	@Override
	public String getPlaceholder() {
		return placeholderMixin.getPlaceholder();
	}

	@Override
	public void setPlaceholderColor(final Color color) {
		placeholderMixin.setPlaceholderColor(color);
	}

	@Override
	public String getValue() {
		return getElement().getInnerText();
	}

	@Override
	public void setValue(final String value) {
		hasValueMixin.setValue(value);
		getElement().setInnerText(value);
	}

	@Override
	public void setValue(final String value, final boolean fireEvents) {
		hasValueMixin.setValue(value, fireEvents);
		getElement().setInnerText(value);
	}

	@Override
	public HandlerRegistration addTypingHandler(final TypingHandler handler) {
		return typingMixin.addTypingHandler(handler);
	}

	@Override
	public void setTypeingDelay(final int typingDelay) {
		typingMixin.setTypeingDelay(typingDelay);
	}
}
