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

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

import gwt.material.design.components.client.base.widget.MaterialWidget;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.constants.ThemeProperty;
import gwt.material.design.components.client.theme.Theme;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.utils.helper.StyleHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialThemeEditor extends Div {
	
	public static final IconType PREVIEW_ICON = IconType.DEFAULT;
	
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
	protected final Div contentColorPreview = new Div(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__PREVIEW);
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
	 * Misc content
	 */
	protected final Div contentActions = new Div(CssName.MDC_THEME_EDITOR__ACTIONS);
	protected final MaterialIconButton downloadStyle = new MaterialIconButton(IconType.FILE_DOWNLOAD);
	
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
		
		contentColor.add(contentColorPreview);
		
		content.add(contentColor);
		content.add(contentFont);
		content.add(contentMisc);
		
		downloadStyle.addClickHandler(event -> download());
		contentActions.add(downloadStyle);
		
		add(tabBar);
		add(content);
		add(colorChooser);
		add(contentActions);
		
		color(contentColorPreview);
		
		toggle(contentColor);
	}
	
	void download() {
		download("mdc_theme.css", theme.toString());
	}
	
	native void download(final String fileName, final String text) /*-{
	
		console.log(text);

        var element = document.createElement('a');
        element.setAttribute('href', 'data:text/css;charset=utf-8,'
                + encodeURIComponent(text));
        element.setAttribute('download', fileName);

        element.style.display = 'none';
        document.body.appendChild(element);

        element.click();

        document.body.removeChild(element);

	}-*/;
	
	void toggle(final Div content) {
		
		if (active != null && content == active)
			return;
		
		if (active != null)
			active.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW);
		active = content;
		active.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW);
	}
	
	void color(final Div previewContent) {
		
		previewContent.add(subheader("Theme color palete"));
		previewContent.add(color(ThemeProperty.MDC_THEME_PRIMARY, ThemeProperty.MDC_THEME_ON_PRIMARY));
		previewContent.add(color(ThemeProperty.MDC_THEME_SECONDARY, ThemeProperty.MDC_THEME_ON_SECONDARY));
		previewContent
				.add(color(ThemeProperty.MDC_THEME_BACKGROUND, ThemeProperty.MDC_THEME_TEXT_PRIMARY_ON_BACKGROUND));
		previewContent.add(color(ThemeProperty.MDC_THEME_SURFACE, ThemeProperty.MDC_THEME_ON_SURFACE));
		
		previewContent.add(subheader("States"));
		previewContent.add(color(ThemeProperty.MDC_THEME_SUCCESS, ThemeProperty.MDC_THEME_ON_SUCCESS));
		previewContent.add(color(ThemeProperty.MDC_THEME_WARNING, ThemeProperty.MDC_THEME_ON_WARNING));
		previewContent.add(color(ThemeProperty.MDC_THEME_ERROR, ThemeProperty.MDC_THEME_ON_ERROR));
		
		previewContent.add(subheader("Chart Series"));
		
		final ThemeProperty[] series = ThemeProperty.chartistSeries();
		final ThemeProperty[] labels = ThemeProperty.chartistLabels();
		IntStream.range(0, series.length).forEach(index -> previewContent.add(color(series[index], labels[index])));
		
	}
	
	MaterialWidget subheader(final String text) {
		final MaterialLabel subheader = new MaterialLabel("Theme color palete");
		subheader.setWidth("100%");
		subheader.setMarginTop(16);
		return subheader;
	}
	
	MaterialWidget color(final ThemeProperty colorProperty, final ThemeProperty onColorProperty) {
		
		final String color = var(colorProperty.getCssName());
		final String onColor = var(onColorProperty.getCssName());
		
		final MaterialIconButton item = new MaterialIconButton(PREVIEW_ICON);
		item.setCssProperty(CssMixin.MDC_ICON_BUTTON__INK_COLOR, onColor);
		item.setCssProperty("background-color", color);
		item.setTooltip(colorProperty.toString().replace("MDC_THEME_", "").replace("_", " "));
		item.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__PREVIEW_ITEM);
		item.setDataObject(Color.fromCssValue(StyleHelper.getCssProperty(colorProperty.getCssName())));
		
		item.addClickHandler(event -> {
			colorChooser.setProperty(colorProperty);
			colorChooser.setTarget(item);
			colorChooser.setValue(item.getDataObject(), false);
			colorChooser.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW);
		});
		
		colorPreviews.add(item);
		
		return item;
	}
	
	String var(final String property) {
		return "var(" + property + ")";
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
		
		protected final MaterialIconButton preview = new MaterialIconButton(PREVIEW_ICON);
		protected final MaterialLabel title = new MaterialLabel();
		protected final MaterialLabel value = new MaterialLabel();
		
		protected final Div paletteContent = new Div(CssName.MDC_THEME_EDITOR__CONTENT__COLOR_CHOOSER__PALETTE);
		protected final MaterialColorPalette palette = new MaterialColorPalette(false, true);
		
		private ThemeProperty property;
		private MaterialWidget target;
		
		public ColorChooser() {
			super(CssName.MDC_THEME_EDITOR__CONTENT__COLOR_CHOOSER);
			final Color primary = Color.fromCssValue(ThemeProperty.MDC_THEME_PRIMARY.load());
			setValue(primary, false);
		}
		
		@Override
		protected void onInitialize() {
			super.onInitialize();
			
			preview.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__PREVIEW_ITEM);
			preview.addClickHandler(event -> scrollTo(paletteContent.getElement(), palette.getValue().toString()));
			palette.addValueChangeHandler(event -> setValue(event.getValue(), false));
			
			previewContent.add(preview);
			previewContent.add(title);
			previewContent.add(value);
			
			paletteContent.add(palette);
			
			final MaterialIcon close = new MaterialIcon();
			close.setWidth("8px");
			close.setHeight("8px");
			close.setBackgroundColor(Color.MDC_THEME_ON_PRIMARY);
			close.setOpacity(.5);
			close.addClickHandler(event -> toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW));
			
			final Div closeContent = new Div();
			closeContent.setWidth("calc(100% - 8px)");
			closeContent.setBackgroundColor(Color.MDC_THEME_PRIMARY);
			closeContent.setPadding(4);
			closeContent.add(close);
			
			add(closeContent);
			add(previewContent);
			add(paletteContent);
			
		}
		
		native void scrollTo(final Element element, final String colorClass)/*-{
            var options = {
	            scrollTop : $wnd.jQuery('.' + colorClass).offset().top
	                    - $wnd.jQuery(element).offset().top
	                    + $wnd.jQuery(element).scrollTop()
            };
            $wnd.jQuery(element).animate(options, 'fast');
		}-*/;
		
		public void setProperty(final ThemeProperty property) {
			this.property = property;
			this.title.setText(this.property.toString().replace("MDC_", "").replace("THEME_", "").replace("_", " "));
		}
		
		public ThemeProperty getPropery() {
			return this.property;
		}
		
		public MaterialWidget getTarget() {
			return target;
		}
		
		public void setTarget(MaterialWidget target) {
			this.target = target;
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
			
			if (target != null)
				target.setDataObject(color);
			
			if (color == null) {
				
				value.setText("Not found");
				preview.setBackgroundColor(Color.TRANSLUCENT);
				preview.setColor(Color.TRANSLUCENT);
				
			} else {
				
				value.getElement().setInnerHTML(color.toString().replace("_", " ") + "<br/>" + color.asHex());
				preview.setBackgroundColor(color);
				preview.setColor(color.onColor());
				
			}
			
		}
	}
}
