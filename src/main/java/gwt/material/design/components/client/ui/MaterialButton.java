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

import com.google.gwt.user.client.ui.HasText;

import gwt.material.design.components.client.base.interfaces.HasDense;
import gwt.material.design.components.client.base.interfaces.HasHref;
import gwt.material.design.components.client.base.interfaces.HasIcon;
import gwt.material.design.components.client.base.interfaces.HasType;
import gwt.material.design.components.client.base.mixin.HrefMixin;
import gwt.material.design.components.client.base.mixin.TextMixin;
import gwt.material.design.components.client.base.mixin.ToggleStyleMixin;
import gwt.material.design.components.client.base.mixin.TypeMixin;
import gwt.material.design.components.client.constants.ButtonType;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.ui.html.Button;
import gwt.material.design.components.client.ui.html.Span;
import gwt.material.design.components.client.utils.helper.DOMHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialButton extends Button implements HasType<ButtonType>, HasHref, HasText, HasIcon, HasDense {

	protected final Span label = new Span();

	protected final TextMixin<Span> textMixin = new TextMixin<>(label);
	protected final HrefMixin<MaterialButton> hrefMixin = new HrefMixin<>(this);
	protected final TypeMixin<MaterialButton, ButtonType> typeMixin = new TypeMixin<>(this);
	protected final ToggleStyleMixin<MaterialButton> denseMixin = new ToggleStyleMixin<>(this, CssName.MDC_BUTTON__DENSE);
	protected final MaterialIcon icon = new MaterialIcon(CssName.MDC_BUTTON__ICON);

	public MaterialButton() {
		super(CssName.MDC_BUTTON);
	}

	@Override
	protected void onInitialize() {
		ripleMixin.initialize();
		add(label);
		addClickHandler(event -> DOMHelper.clearFocus());
		super.onInitialize();
	}

	@Override
	public String getText() {
		return textMixin.getText();
	}

	@Override
	public void setText(String text) {
		textMixin.setText(text);
	}

	@Override
	public void setHref(String href) {
		hrefMixin.setHref(href);
	}

	@Override
	public String getHref() {
		return hrefMixin.getHref();
	}

	@Override
	public void setTarget(String target) {
		hrefMixin.setTarget(target);
	}

	@Override
	public String getTarget() {
		return hrefMixin.getTarget();
	}

	@Override
	public void setType(ButtonType type) {
		typeMixin.setType(type);
	}

	@Override
	public ButtonType getType() {
		return typeMixin.getType();
	}

	@Override
	public IconType getIcon() {
		return icon == null ? null : icon.getType();
	}

	@Override
	public void setIcon(IconType iconType) {
		setIcon(iconType, false);
	}

	@Override
	public void setIcon(final IconType iconType, final boolean animate) {
		if (iconType == null) {
			if (icon.getParent() != null)
				icon.removeFromParent();
			return;
		}

		if (icon.getParent() == null)
			insert(icon, 0);

		icon.setType(iconType, animate);
	}

	@Override
	public void setDense(boolean dense) {
		denseMixin.toggle(dense);
	}

	@Override
	public boolean isDense() {
		return denseMixin.isApplied();
	}

	@Override
	public void setBackgroundColor(Color color) {
		setCssProperty(CssMixin.MDC_BUTTON__FILL_COLOR, color.getCssName());
		setCssProperty(CssMixin.MDC_BUTTON_RAISED__FILL_COLOR, color.getCssName());
	}

	@Override
	public void setColor(Color color) {
		setCssProperty(CssMixin.MDC_BUTTON__INK_COLOR, color.getCssName());
		setCssProperty(CssMixin.MDC_BUTTON__OUTLINE_COLOR, color.getCssName());
		setCssProperty(CssMixin.MDC_BUTTON_RAISED__INK_COLOR, color.getCssName());
	}

	@Override
	public void setIconColor(Color color) {
		icon.setTextColor(color);
	}
}
