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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

import gwt.material.design.components.client.base.interfaces.FromString;
import gwt.material.design.components.client.base.mixin.base.AttributeMixin;
import gwt.material.design.components.client.base.widget.MaterialSelectedField;
import gwt.material.design.components.client.constants.BorderRadius;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssAttribute;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.HtmlElements;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.utils.helper.StyleHelper;
	
/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialIconToggle extends MaterialSelectedField {

	protected final MaterialIcon onIcon = new MaterialIcon(CssName.MDC_ICON_BUTTON__ICON,
			CssName.MDC_ICON_BUTTON__ICON__ON);
	protected final MaterialIcon offIcon = new MaterialIcon(CssName.MDC_ICON_BUTTON__ICON);

	protected final AttributeMixin<MaterialIconToggle, Boolean> ariaPressedMixin = new AttributeMixin<>(this,
			CssAttribute.ARIA_PRESSED, FromString.TO_BOOLEAN);

	public MaterialIconToggle() {
		super(HtmlElements.BUTTON.createElement(), CssName.MDC_ICON_BUTTON);
		setAttribute(CssAttribute.ARIA_HIDDEN, true);
		setBorderRadius(BorderRadius.CIRCLE);
	}

	@Override
	protected native JavaScriptObject jsInit(final Element element)/*-{
		return new $wnd.mdc.iconButton.MDCIconButtonToggle(element);
	}-*/;

	@Override
	protected void onInitialize() {
		ripleMixin.initialize();
		onIcon.setColor(Color.MDC_THEME_SECONDARY);

		add(onIcon);
		add(offIcon);
		initializeChageEventListener();
		updateColor();
		
		super.onInitialize();
	}

	protected void updateColor() {
		if (isSelected())
			setCssProperty(CssMixin.MDC_ICON_BUTTON__INK_COLOR, StyleHelper.getCssProperty(onIcon, "color"));
		else
			setCssProperty(CssMixin.MDC_ICON_BUTTON__INK_COLOR,  StyleHelper.getCssProperty(offIcon, "color"));
	}

	public native void initializeChageEventListener()/*-{
		var _this = this;
		var element = this.@gwt.material.design.components.client.ui.MaterialIconToggle::getElement()();
		var onChange = function(detail) {
			_this.@gwt.material.design.components.client.ui.MaterialIconToggle::updateColor()();
			_this.@gwt.material.design.components.client.ui.MaterialIconToggle::fireSelectEvent()();
		};
		element.addEventListener('MDCIconButtonToggle:change', onChange);
	}-*/;

	public void setToggleOn(final IconType icon) {
		onIcon.setType(icon);
	}

	public void setToggleOff(final IconType icon) {
		offIcon.setType(icon);
	}

	@Override
	public void setSelected(boolean selected, boolean fireEvents) {
		this.ariaPressedMixin.setValue(selected);
		super.setSelected(selected, fireEvents);
	}

	@Override
	public boolean isSelected() {
		return ariaPressedMixin.getValue();
	}

	public void setColorOn(final Color colorOn) {
		onIcon.setColor(colorOn);
	}

	public void setColorOff(final Color colorOff) {
		offIcon.setColor(colorOff);
	}

	public void setBackgroundColorOn(final Color backgroundColorOn) {
		onIcon.setBackgroundColor(backgroundColorOn);
	}

	public void setBackgroundColorOff(final Color backgroundColorOff) {
		offIcon.setBackgroundColor(backgroundColorOff);
	}
}
