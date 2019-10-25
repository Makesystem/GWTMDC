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

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.IntStream;

import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

import gwt.material.design.components.client.base.widget.MaterialWidget;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.constants.ThemeAttribute;
import gwt.material.design.components.client.constants.ThemeProperty;
import gwt.material.design.components.client.theme.Theme;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.utils.helper.ColorHelper;
import gwt.material.design.components.client.utils.helper.StyleHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialThemeEditor extends Div {

	protected final MaterialTab colorTab = new MaterialTab(IconType.PALETTE);
	protected final MaterialTab fontTab = new MaterialTab(IconType.TEXT_FORMAT);
	protected final MaterialTab miscTab = new MaterialTab(IconType.ROUNDED_CORNER);
	protected final MaterialTabBar tabBar = new MaterialTabBar(colorTab, fontTab, miscTab);

	/*
	 * Body content
	 */
	protected final Div content = new Div(CssName.MDC_THEME_EDITOR__CONTENT);

	/*
	 * Color content
	 */
	protected final Div contentColor = new Div(CssName.MDC_THEME_EDITOR__CONTENT__COLOR);
	protected final ColorChooser colorChooser = new ColorChooser();
	protected final Collection<MaterialWidget> colorPreviews = new LinkedList<>();
	
	/*
	 * Font content
	 */
	protected final Div contentFont = new Div(CssName.MDC_THEME_EDITOR__CONTENT__FONT);

	/*
	 * Misc content
	 */
	protected final Div contentMisc = new Div(CssName.MDC_THEME_EDITOR__CONTENT__MISC);

	/*
	 * Ctrl
	 */
	protected Div active;

	protected final Theme theme = new Theme();

	public MaterialThemeEditor() {
		super(CssName.MDC_THEME_EDITOR);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		colorTab.addClickHandler(event -> toggle(contentColor));
		fontTab.addClickHandler(event -> toggle(contentFont));
		miscTab.addClickHandler(event -> toggle(contentMisc));
		colorChooser.addValueChangeHandler(event -> setProperty(colorChooser.getPropery(), colorChooser.getValue()));
		
		content.add(contentColor);
		content.add(contentFont);
		content.add(contentMisc);

		add(tabBar);
		add(content);

		color();

		toggle(contentColor);
	}

	void toggle(final Div content) {

		if (active != null && content == active)
			return;

		if (active != null)
			active.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW);
		active = content;
		active.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW);
	}

	void color() {

		final MaterialLabel colorPalette = new MaterialLabel("Theme color palete");
		colorPalette.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__SUBHEADER);
		contentColor.add(colorPalette);

		contentColor.add(color(ThemeProperty.MDC_THEME_PRIMARY, ThemeProperty.MDC_THEME_ON_PRIMARY));
		contentColor.add(color(ThemeProperty.MDC_THEME_SECONDARY, ThemeProperty.MDC_THEME_ON_SECONDARY));
		contentColor.add(color(ThemeProperty.MDC_THEME_BACKGROUND, ThemeProperty.MDC_THEME_TEXT_PRIMARY_ON_BACKGROUND));
		contentColor.add(color(ThemeProperty.MDC_THEME_SURFACE, ThemeProperty.MDC_THEME_ON_SURFACE));

		final MaterialLabel states = new MaterialLabel("States");
		states.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__SUBHEADER);
		contentColor.add(states);
		contentColor.add(color(ThemeProperty.MDC_THEME_SUCCESS, ThemeProperty.MDC_THEME_ON_SUCCESS));
		contentColor.add(color(ThemeProperty.MDC_THEME_WARNING, ThemeProperty.MDC_THEME_ON_WARNING));
		contentColor.add(color(ThemeProperty.MDC_THEME_ERROR, ThemeProperty.MDC_THEME_ON_ERROR));

		final MaterialLabel chartSeries = new MaterialLabel("Chart Series");
		chartSeries.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__SUBHEADER);
		contentColor.add(chartSeries);
		
		final ThemeProperty[] series = ThemeProperty.chartistSeries();
		final ThemeProperty[] labels = ThemeProperty.chartistLabels();
		IntStream.range(0, series.length).forEach(index -> contentColor.add(color(series[index], labels[index])));
	
		contentColor.add(colorChooser);
	}

	String var(final String property) {
		return "var(" + property + ")";
	}
	
	MaterialWidget color(final ThemeProperty colorProperty, final ThemeProperty onColorProperty) {

		final String color = var(colorProperty.getCssName());
		final String onColor = var(onColorProperty.getCssName());

		final MaterialIconButton item = new MaterialIconButton(IconType.INVERT_COLORS);
		item.setCssProperty(CssMixin.MDC_ICON_BUTTON__INK_COLOR, onColor);
		item.setCssProperty("background-color", color);
		item.setTooltip(colorProperty.toString().replace("MDC_THEME_", "").replace("_", " "));
		item.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__ITEM);

		
		
		
		

		item.addClickHandler(event -> {
			
			if (colorChooser.getPropery().equals(colorProperty)) {
				setProperty(colorChooser.getPropery(), colorChooser.getValue());
				item.setDataObject(colorChooser.getValue());
				item.setColor(colorChooser.getValue().onColor());
				item.setBackgroundColor(colorChooser.getValue());
			}
			
			colorChooser.setProperty(colorProperty);
			colorChooser.setValue(item.getDataObject() == null ? Color.fromCssValue(color) : item.getDataObject(),
					false);
			colorChooser.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW);
		});

		return item;
	}

	void setProperty(final ThemeProperty property, final Color color) {
		switch (property) {
		case MDC_THEME_PRIMARY:
			theme.setPrimary(color);
			break;

		case MDC_THEME_SECONDARY:
			theme.setSecondary(color);
			break;

		case MDC_THEME_SURFACE:
			theme.setSurface(color);
			break;

		case MDC_THEME_BACKGROUND:
			theme.setBackground(color);
			break;

		case MDC_THEME_SUCCESS:
			theme.setSuccess(color);
			break;

		case MDC_THEME_WARNING:
			theme.setSuccess(color);
			break;

		case MDC_THEME_ERROR:
			theme.setSuccess(color);
			break;

		default:
			theme.set(property, color);
			break;
		}
	}

	class ColorChooser extends Div implements HasValue<Color> {

		protected final Div previewContent = new Div(CssName.MDC_THEME_EDITOR__CONTENT__COLOR_CHOOSER__PREVIEW);

		protected final MaterialIconButton preview = new MaterialIconButton(IconType.INVERT_COLORS);
		protected final MaterialLabel title = new MaterialLabel();
		protected final MaterialLabel value = new MaterialLabel();

		protected final MaterialColorPalette palette = new MaterialColorPalette(false, true);

		private ThemeProperty property;

		public ColorChooser() {
			super(CssName.MDC_THEME_EDITOR__CONTENT__COLOR_CHOOSER);
			final Color primary = Color.fromCssValue(StyleHelper.getCssProperty(ThemeAttribute.MDC_THEME_PRIMARY));
			setValue(primary, false);
		}

		@Override
		protected void onInitialize() {
			super.onInitialize();

			preview.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__ITEM);
			preview.addClickHandler(event -> toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW));
			palette.addValueChangeHandler(event -> setValue(event.getValue(), false));

			previewContent.add(preview);
			previewContent.add(title);
			previewContent.add(value);

			add(previewContent);
			add(palette);
		}

		public void setProperty(final ThemeProperty property) {
			this.property = property;
			this.title.setText(this.property.toString().replace("MDC_THEME_", "").replace("_", " "));
		}

		public ThemeProperty getPropery() {
			return this.property;
		}

		@Override
		public HandlerRegistration addValueChangeHandler(ValueChangeHandler<Color> handler) {
			return palette.addValueChangeHandler(handler);
		}

		@Override
		public Color getValue() {
			return palette.getValue();
		}

		@Override
		public void setValue(final Color color) {
			setValue(color, true);
		}

		@Override
		public void setValue(final Color color, boolean fireEvents) {
			palette.setValue(color, fireEvents);
			if (color != null) {
				value.getElement().setInnerHTML(color.toString().replace("_", " ") + "<br/>" + color.asHex());
				preview.setBackgroundColor(color);
				preview.setColor(ColorHelper.isDark(color.getCssName()) ? Color.WHITE : Color.BLACK);
			}
		}
	}
}
