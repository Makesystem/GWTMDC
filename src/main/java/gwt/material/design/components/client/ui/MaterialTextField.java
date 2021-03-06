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

import com.google.gwt.event.shared.HandlerRegistration;

import gwt.material.design.components.client.base.interfaces.HasIcon;
import gwt.material.design.components.client.base.interfaces.HasIconPosition;
import gwt.material.design.components.client.base.interfaces.HasInputMask;
import gwt.material.design.components.client.base.interfaces.HasRequired;
import gwt.material.design.components.client.base.interfaces.HasType;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.IconPosition;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.constants.InputType;
import gwt.material.design.components.client.constants.TextFieldType;
import gwt.material.design.components.client.events.IconClickEvent.HasIconClickHandlers;
import gwt.material.design.components.client.events.IconClickEvent.IconClickHandler;
import gwt.material.design.components.client.ui.misc.input.MaterialInputBox;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialTextField extends MaterialInputBox implements HasRequired, HasType<TextFieldType>, HasInputMask, HasIcon, HasIconClickHandlers, HasIconPosition {

	@Override
	public IconType getIcon() {
		return input.getIcon();
	}

	@Override
	public void setIcon(IconType iconType) {
		input.setIcon(iconType);
	}

	@Override
	public void setIcon(IconType iconType, boolean animate) {
		input.setIcon(iconType, animate);
	}

	@Override
	public void setIconColor(Color color) {
		input.setIconColor(color);
	}

	@Override
	public IconPosition getIconPosition() {
		return input.getIconPosition();
	}

	@Override
	public void setIconPosition(IconPosition iconPosition) {
		input.setIconPosition(iconPosition);
	}

	@Override
	public HandlerRegistration addIconClickHandler(IconClickHandler handler) {
		return input.addIconClickHandler(handler);
	}

	@Override
	public void setType(TextFieldType type) {
		input.setType(type);
	}

	@Override
	public TextFieldType getType() {
		return input.getType();
	}

	public void setInputType(InputType type) {
		input.setInputType(type);
	}

	public InputType getInputType() {
		return input.getInputType();
	}

	@Override
	public void setRequired(boolean required) {
		input.setRequired(required);
	}

	@Override
	public boolean isRequired() {
		return input.isRequired();
	}

	@Override
	public void setInputMask(String inputMask) {
		input.setInputMask(inputMask);
	}

	@Override
	public String getInputMask() {
		return input.getInputMask();
	}

}
