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

import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

import gwt.material.design.components.client.base.interfaces.HasPlaceholder;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.events.TypingEvent.HasTypingHandlers;
import gwt.material.design.components.client.events.TypingEvent.TypingHandler;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.misc.search.MaterialSearchInput;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialSearch extends Div implements HasPlaceholder, HasTypingHandlers, HasValue<String> {
	
	protected final MaterialSearchInput input = new MaterialSearchInput();
	protected final MaterialIconButton search = new MaterialIconButton(IconType.SEARCH);
	protected final MaterialIconButton options = new MaterialIconButton(IconType.ARROW_DROP_DOWN);
	
	public MaterialSearch() {
		super(CssName.MDC_SEARCH);
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		input.addFocusHandler(event -> setAttribute("actived", "true"));
		input.addBlurHandler(event -> removeAttribute("actived"));
		
		search.addStyleName(CssName.MDC_SEARCH__SEARCH);
		options.addStyleName(CssName.MDC_SEARCH__OPTIONS);
		
		add(search);
		add(input);
		add(options);
	}
	
	@Override
	public void setPlaceholder(final String placeholder) {
		input.setPlaceholder(placeholder);
	}
	
	@Override
	public String getPlaceholder() {
		return input.getPlaceholder();
	}
	
	@Override
	public void setPlaceholderColor(final Color color) {
		input.setPlaceholderColor(color);
	}
	
	@Override
	public HandlerRegistration addValueChangeHandler(final ValueChangeHandler<String> handler) {
		return input.addValueChangeHandler(handler);
	}
	
	@Override
	public String getValue() {
		return input.getValue();
	}
	
	@Override
	public void setValue(final String value) {
		input.setValue(value);
	}
	
	@Override
	public void setValue(final String value, final boolean fireEvents) {
		input.setValue(value, fireEvents);
	}
	
	@Override
	public HandlerRegistration addTypingHandler(final TypingHandler handler) {
		return input.addTypingHandler(handler);
	}
	
	@Override
	public void setTypeingDelay(final int typingDelay) {
		input.setTypeingDelay(typingDelay);
	}
}
