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

import com.google.gwt.dom.client.Style;

import gwt.material.design.components.client.base.interfaces.HasFlexbox;
import gwt.material.design.components.client.base.mixin.base.AbstractMixin;
import gwt.material.design.components.client.base.widget.MaterialUIObject;
import gwt.material.design.components.client.constants.Display;
import gwt.material.design.components.client.constants.Flex;
import gwt.material.design.components.client.constants.FlexAlignContent;
import gwt.material.design.components.client.constants.FlexAlignItems;
import gwt.material.design.components.client.constants.FlexAlignSelf;
import gwt.material.design.components.client.constants.FlexDirection;
import gwt.material.design.components.client.constants.FlexJustifyContent;
import gwt.material.design.components.client.constants.FlexWrap;
import gwt.material.design.components.client.utils.helper.BrowserPrefixHelper;
import gwt.material.design.components.client.utils.helper.StyleHelper;

/**
 * @author Richeli Vargas
 */
public class FlexboxMixin<UIO extends MaterialUIObject & HasFlexbox> extends AbstractMixin<UIO> implements HasFlexbox {

	public FlexboxMixin(UIO uiObject) {
		super(uiObject);
	}

	private Display displayValueBeforeHidden;

	@Override
	public void setGwtDisplay(Style.Display display) {
		setDisplay(Display.parse(display));
	}

	@Override
	public void setDisplay(Display display) {
		if (display == null) {
			displayValueBeforeHidden = null;
			StyleHelper.removeCssProperty(uiObject, "display");
			return;
		}

		if (display != Display.NONE)
			displayValueBeforeHidden = display;

		if (display.equals(Display.FLEX)) {
			String[] displayValues = { "-webkit-box", "-moz-box", "-ms-box", "-webkit-flex", "-moz-flex", "flex" };
			for (String d : displayValues)
				StyleHelper.setCssProperty(uiObject, "display", d);
			return;
		}

		if (display.getGwtDisplay() == null)
			StyleHelper.removeCssProperty(uiObject, "display");
		else
			StyleHelper.setCssProperty(uiObject, "display", display.getGwtDisplay());
	}

	@Override
	public void setVisible(boolean visible) {
		uiObject.setVisible(visible);

		// setVisible(false) sets display:none, if the control is flex before hidden
		// we need to reset to display:flex when the control is made visible again
		if (displayValueBeforeHidden != null && visible)
			setDisplay(displayValueBeforeHidden);
	}

	@Override
	public void setFlexDirection(FlexDirection flexDirection) {
		boolean isCurrentlyVisible = uiObject.isVisible();

		if (flexDirection != null)
			setDisplay(Display.FLEX);

		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(),
				new String[] { "MsFlexDirection", "WebkitFlexDirection", "MozFlexDirection", "flexDirection" },
				flexDirection != null ? flexDirection.getValue() : null);

		// Updating the display to Flex will set display:flex and override the
		// visibility of the control
		// this ensures that if you setVisible(false) it will not become visible unless
		// calling setVisible(true)
		if (!isCurrentlyVisible)
			setVisible(false);
	}

	@Override
	public void setFlex(Flex flex) {
		if (flex == null) {
			setFlexGrow(null);
			setFlexShrink(null);
			setFlexBasis(null);
			return;
		}

		setFlexGrow(flex.getGrow());
		setFlexShrink(flex.getShrink());
		setFlexBasis(flex.getBasis());
	}

	@Override
	public void setFlexGrow(Integer flexGrow) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(),
				new String[] { "MsFlexGrow", "WebkitFlexGrow", "MozFlexGrow", "flexGrow" },
				flexGrow != null ? flexGrow.toString() : null);
	}

	@Override
	public void setFlexShrink(Integer flexShrink) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(),
				new String[] { "MsFlexShrink", "WebkitFlexShrink", "MozFlexShrink", "flexShrink" },
				flexShrink != null ? flexShrink.toString() : null);
	}

	@Override
	public void setFlexBasis(String flexBasis) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(),
				new String[] { "MsFlexBasis", "WebkitFlexBasis", "MozFlexBasis", "flexBasis" }, flexBasis);
	}

	@Override
	public void setFlexOrder(Integer flexOrder) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(),
				new String[] { "MsFlexOrder", "WebkitOrder", "MozFlexOrder", "order" },
				flexOrder != null ? flexOrder.toString() : null);
	}

	@Override
	public void setFlexWrap(FlexWrap flexWrap) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(),
				new String[] { "MsFlexWrap", "WebkitFlexWrap", "MozFlexWrap", "flexWrap" },
				flexWrap != null ? flexWrap.getValue() : null);
	}

	@Override
	public void setFlexAlignContent(FlexAlignContent flexAlignContent) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(), "MsFlexLinePack",
				new String[] { "WebkitAlignContent", "MozFlexAlignContent", "alignContent" }, flexAlignContent);
	}

	@Override
	public void setFlexAlignSelf(FlexAlignSelf flexAlignSelf) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(), "MsFlexItemAlign",
				new String[] { "WebkitAlignSelf", "MozFlexItemAlign", "alignSelf" }, flexAlignSelf);
	}

	@Override
	public void setFlexAlignItems(FlexAlignItems flexAlignItems) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(), "MsFlexAlign",
				new String[] { "WebkitAlignItems", "MozFlexAlign", "alignItems" }, flexAlignItems);
	}

	@Override
	public void setFlexJustifyContent(FlexJustifyContent flexJustifyContent) {
		BrowserPrefixHelper.updateStyleProperties(uiObject.getElement(), "MsFlexPack",
				new String[] { "WebkitJustifyContent", "MozJustifyContent", "justifyContent" }, flexJustifyContent);
	}
}
