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

import gwt.material.design.components.client.base.interfaces.HasHref;
import gwt.material.design.components.client.base.interfaces.HasIcon;
import gwt.material.design.components.client.base.mixin.HrefMixin;
import gwt.material.design.components.client.base.mixin.TextMixin;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.ui.html.Anchor;
import gwt.material.design.components.client.ui.html.Span;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialLink extends Anchor implements HasHref, HasText, HasIcon {

	protected final Span label = new Span(CssName.MDC_LINK__LABEL);

	protected final TextMixin<Span> textMixin = new TextMixin<>(label);
	protected final HrefMixin<MaterialLink> hrefMixin = new HrefMixin<>(this);

	protected MaterialIcon icon;

	public MaterialLink() {
		super(CssName.MDC_LINK);
	}

	@Override
	protected void onInitialize() {
		ripleMixin.initialize();
		add(label);
		super.onInitialize();
	}

	protected MaterialIcon getIconElement() {
		if (icon == null)
			icon = new MaterialIcon(CssName.MDC_LINK__ICON);
		return icon;
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
	public IconType getIcon() {
		return icon == null ? null : icon.getType();
	}

	@Override
	public void setIcon(final IconType iconType) {
		setIcon(iconType, false);
	}

	@Override
	public void setIcon(final IconType iconType, final boolean animate) {

		final MaterialIcon icon = getIconElement();

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
	public void setColor(final Color color) {
		setCssProperty(CssMixin.MDC_LINK__INK_COLOR, color.getCssName());
	}

	@Override
	public void setIconColor(final Color color) {
		icon.setTextColor(color);
	}
}
