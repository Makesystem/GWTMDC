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

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
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
	
	public MaterialThemeEditor() {
		super(CssName.MDC_THEME_EDITOR);
	}
	
	@Override
	protected void onLoad() {
		super.onLoad();
		
		colorTab.addClickHandler(event -> toggle(contentColor));
		fontTab.addClickHandler(event -> toggle(contentFont));
		miscTab.addClickHandler(event -> toggle(contentMisc));
		
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
			active.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW_ITEM);
		active = content;
		active.toggle(CssName.MDC_THEME_EDITOR__CONTENT__SHOW_ITEM);
	}
	
	void color() {
		
		GWT.log("aqui: " + StyleHelper.getCssProperty("--mdc-theme-primary"));
		
		final MaterialLabel colorPalette = new MaterialLabel("Theme color palete");
		colorPalette.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__SUBHEADER);
		contentColor.add(colorPalette);		
		contentColor.add(color("Primary", Color.MDC_THEME_ON_PRIMARY, Color.MDC_THEME_PRIMARY));
		contentColor.add(color("Secondary", Color.MDC_THEME_ON_SECONDARY, Color.MDC_THEME_SECONDARY));
		contentColor.add(color("Background", Color.MDC_THEME_TEXT_PRIMARY_ON_BACKGROUND, Color.MDC_THEME_BACKGROUND));
		contentColor.add(color("Surface", Color.MDC_THEME_ON_SURFACE, Color.MDC_THEME_SURFACE));
		
		final MaterialLabel states = new MaterialLabel("States");
		states.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__SUBHEADER);
		contentColor.add(states);
		contentColor.add(color("Success", Color.MDC_THEME_ON_SUCCESS, Color.MDC_THEME_SUCCESS));
		contentColor.add(color("Warning", Color.MDC_THEME_ON_WARNING, Color.MDC_THEME_WARNING));
		contentColor.add(color("Error", Color.MDC_THEME_ON_ERROR, Color.MDC_THEME_ERROR));
	}
	
	Widget color(final String text, final Color color, final Color background) {
		
		final MaterialIconButton item = new MaterialIconButton(IconType.INVERT_COLORS);
		item.setColor(color);
		item.setBackgroundColor(background);
		item.setTooltip(text);
		item.addStyleName(CssName.MDC_THEME_EDITOR__CONTENT__COLOR__ITEM);
		
		return item;
	}
}
