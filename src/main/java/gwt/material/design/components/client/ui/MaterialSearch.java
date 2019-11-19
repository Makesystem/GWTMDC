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

import gwt.material.design.components.client.base.interfaces.HasPlaceholder;
import gwt.material.design.components.client.base.mixin.PlaceholderMixin;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Input;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialSearch extends Div implements HasPlaceholder {

	protected final Input input = new Input(CssName.MDC_SEARCH__INPUT);
	protected final MaterialIconButton search = new MaterialIconButton(IconType.SEARCH);
	protected final MaterialIconButton options = new MaterialIconButton(IconType.ARROW_DROP_DOWN);
	
	protected final PlaceholderMixin<Input> placeholderMixin = new PlaceholderMixin<Input>(input);
	
	public MaterialSearch(){
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
}
