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
package gwt.material.design.components.client.constants;

import java.util.Arrays;

import gwt.material.design.components.client.utils.helper.EnumHelper;
import gwt.material.design.components.client.utils.helper.StyleHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public enum ThemeProperty implements CssType {
	
	//
	// Main
	//
	MDC_THEME_PRIMARY("--mdc-theme-primary", Color.BLUE), MDC_THEME_SECONDARY("--mdc-theme-secondary", Color.PINK),
	MDC_THEME_SURFACE("--mdc-theme-surface", Color.WHITE), MDC_THEME_BACKGROUND("--mdc-theme-background", Color.WHITE),
	//
	MDC_THEME_ON_PRIMARY("--mdc-theme-on-primary", Color.WHITE),
	MDC_THEME_ON_SECONDARY("--mdc-theme-on-secondary", Color.WHITE),
	MDC_THEME_ON_SURFACE("--mdc-theme-on-surface", Color.BLACK),
	//
	MDC_THEME_TEXT_PRIMARY_ON_BACKGROUND("--mdc-theme-text-primary-on-background", Color.BLACK, .87),
	MDC_THEME_TEXT_SECONDARY_ON_BACKGROUND("--mdc-theme-text-secondary-on-background", Color.BLACK, .54),
	MDC_THEME_TEXT_HINT_ON_BACKGROUND("--mdc-theme-text-hint-on-background", Color.BLACK, .12),
	MDC_THEME_TEXT_DISABLED_ON_BACKGROUND("--mdc-theme-text-disabled-on-background", Color.BLACK, .38),
	MDC_THEME_TEXT_ICON_ON_BACKGROUND("--mdc-theme-text-icon-on-background", Color.BLACK, .38),
	//
	MDC_THEME_SUCCESS("--mdc-state--success", Color.GREEN_600),
	MDC_THEME_WARNING("--mdc-state--warning", Color.YELLOW_600), MDC_THEME_ERROR("--mdc-state--error", Color.RED_600),
	//
	MDC_THEME_ON_SUCCESS("--mdc-state--on-success", Color.WHITE),
	MDC_THEME_ON_WARNING("--mdc-state--on-warning", Color.BLACK),
	MDC_THEME_ON_ERROR("--mdc-state--on-error", Color.WHITE),
	//
	// Chart
	//
	MDC_CHARTIST__SERIES_A("--mdc-chartist--series_a", Color.PINK_A200),
	MDC_CHARTIST__LABEL_A("--mdc-chartist--label_a", Color.WHITE),
	MDC_CHARTIST__SERIES_B("--mdc-chartist--series_b", "#fd568f"),
	MDC_CHARTIST__LABEL_B("--mdc-chartist--label_b", Color.WHITE),
	MDC_CHARTIST__SERIES_C("--mdc-chartist--series_c", "#fb6c9c"),
	MDC_CHARTIST__LABEL_C("--mdc-chartist--label_c", Color.WHITE),
	MDC_CHARTIST__SERIES_D("--mdc-chartist--series_d", "#f981aa"),
	MDC_CHARTIST__LABEL_D("--mdc-chartist--label_d", Color.WHITE),
	MDC_CHARTIST__SERIES_E("--mdc-chartist--series_e", "#f797b8"),
	MDC_CHARTIST__LABEL_E("--mdc-chartist--label_e", Color.WHITE),
	MDC_CHARTIST__SERIES_F("--mdc-chartist--series_f", "#f4adc5"),
	MDC_CHARTIST__LABEL_F("--mdc-chartist--label_f", Color.BLACK),
	MDC_CHARTIST__SERIES_G("--mdc-chartist--series_g", "#f2c3d3"),
	MDC_CHARTIST__LABEL_G("--mdc-chartist--label_g", Color.BLACK),
	MDC_CHARTIST__SERIES_H("--mdc-chartist--series_h", "#f0d8e0"),
	MDC_CHARTIST__LABEL_H("--mdc-chartist--label_h", Color.BLACK),
	MDC_CHARTIST__SERIES_I("--mdc-chartist--series_i", "#ff4081"),
	MDC_CHARTIST__LABEL_I("--mdc-chartist--label_i", Color.WHITE),
	MDC_CHARTIST__SERIES_J("--mdc-chartist--series_j", "#fd568f"),
	MDC_CHARTIST__LABEL_J("--mdc-chartist--label_j", Color.WHITE),
	MDC_CHARTIST__SERIES_K("--mdc-chartist--series_k", "#fb6c9c"),
	MDC_CHARTIST__LABEL_K("--mdc-chartist--label_k", Color.WHITE),
	MDC_CHARTIST__SERIES_L("--mdc-chartist--series_l", "#f981aa"),
	MDC_CHARTIST__LABEL_L("--mdc-chartist--label_l", Color.WHITE),
	MDC_CHARTIST__SERIES_M("--mdc-chartist--series_m", "#f797b8"),
	MDC_CHARTIST__LABEL_M("--mdc-chartist--label_m", Color.WHITE),
	MDC_CHARTIST__SERIES_N("--mdc-chartist--series_n", "#f4adc5"),
	MDC_CHARTIST__LABEL_N("--mdc-chartist--label_n", Color.BLACK),
	MDC_CHARTIST__SERIES_O("--mdc-chartist--series_o", "#f2c3d3"),
	MDC_CHARTIST__LABEL_O("--mdc-chartist--label_o", Color.BLACK),
	MDC_CHARTIST__SERIES_P("--mdc-chartist--series_p", "#f0d8e0"),
	MDC_CHARTIST__LABEL_P("--mdc-chartist--label_p", Color.BLACK),
	MDC_CHARTIST__SERIES_Q("--mdc-chartist--series_q", "#ff4081"),
	MDC_CHARTIST__LABEL_Q("--mdc-chartist--label_q", Color.WHITE),
	MDC_CHARTIST__SERIES_R("--mdc-chartist--series_r", "#fd568f"),
	MDC_CHARTIST__LABEL_R("--mdc-chartist--label_r", Color.WHITE),
	MDC_CHARTIST__SERIES_S("--mdc-chartist--series_s", "#fb6c9c"),
	MDC_CHARTIST__LABEL_S("--mdc-chartist--label_s", Color.WHITE),
	MDC_CHARTIST__SERIES_T("--mdc-chartist--series_t", "#f981aa"),
	MDC_CHARTIST__LABEL_T("--mdc-chartist--label_t", Color.WHITE),
	MDC_CHARTIST__SERIES_U("--mdc-chartist--series_u", "#f797b8"),
	MDC_CHARTIST__LABEL_U("--mdc-chartist--label_u", Color.WHITE),
	MDC_CHARTIST__SERIES_V("--mdc-chartist--series_v", "#f4adc5"),
	MDC_CHARTIST__LABEL_V("--mdc-chartist--label_v", Color.BLACK),
	MDC_CHARTIST__SERIES_W("--mdc-chartist--series_w", "#f2c3d3"),
	MDC_CHARTIST__LABEL_W("--mdc-chartist--label_w", Color.BLACK),
	MDC_CHARTIST__SERIES_X("--mdc-chartist--series_x", "#f0d8e0"),
	MDC_CHARTIST__LABEL_X("--mdc-chartist--label_x", Color.BLACK),
	MDC_CHARTIST__SERIES_Y("--mdc-chartist--series_y", "#ff4081"),
	MDC_CHARTIST__LABEL_Y("--mdc-chartist--label_y", Color.WHITE),
	MDC_CHARTIST__SERIES_Z("--mdc-chartist--series_z", "#fd568f"),
	MDC_CHARTIST__LABEL_Z("--mdc-chartist--label_z", Color.WHITE),
	//
	// MaterialCode
	//
	MDC_THEME_CODE_BACKGROUND("--mdc-theme-code-background", "#272822"),
	MDC_THEME_CODE_COLOR("--mdc-theme-code-color", "#f5f5f5"),
	MDC_THEME_CODE_TOKEN_COMMENT("--mdc-theme-code-token-comment", "slategray"),
	MDC_THEME_CODE_TOKEN_PROLOG("--mdc-theme-code-token-prolog", "slategray"),
	MDC_THEME_CODE_TOKEN_DOCTYPE("--mdc-theme-code-token-doctype", "slategray"),
	MDC_THEME_CODE_TOKEN_CDATA("--mdc-theme-code-token-cdata", "slategray"),
	MDC_THEME_CODE_TOKEN_PUNCTUATION("--mdc-theme-code-token-punctuation", "#f8f8f2"),
	MDC_THEME_CODE_TOKEN_PROPERTY("--mdc-theme-code-token-property", "#f92672"),
	MDC_THEME_CODE_TOKEN_TAG("--mdc-theme-code-token-tag", "#f92672"),
	MDC_THEME_CODE_TOKEN_CONSTANT("--mdc-theme-code-token-constant", "#f92672"),
	MDC_THEME_CODE_TOKEN_SYMBOL("--mdc-theme-code-token-symbol", "#f92672"),
	MDC_THEME_CODE_TOKEN_DELETED("--mdc-theme-code-token-deleted", "#f92672"),
	MDC_THEME_CODE_TOKEN_BOOLEAN("--mdc-theme-code-token-boolean", "#ae81ff"),
	MDC_THEME_CODE_TOKEN_NUMBER("--mdc-theme-code-token-number", "#ae81ff"),
	MDC_THEME_CODE_TOKEN_SELECTOR("--mdc-theme-code-token-selector", "#a6e22e"),
	MDC_THEME_CODE_TOKEN_ATTR_NAME("--mdc-theme-code-token-attr-name", "#a6e22e"),
	MDC_THEME_CODE_TOKEN_STRING("--mdc-theme-code-token-string", "#a6e22e"),
	MDC_THEME_CODE_TOKEN_CHAR("--mdc-theme-code-token-char", "#a6e22e"),
	MDC_THEME_CODE_TOKEN_BUILTIN("--mdc-theme-code-token-builtin", "#a6e22e"),
	MDC_THEME_CODE_TOKEN_INSERTED("--mdc-theme-code-token-inserted", "#a6e22e"),
	MDC_THEME_CODE_TOKEN_OPERATOR("--mdc-theme-code-token-operator", "#f8f8f2"),
	MDC_THEME_CODE_TOKEN_ENTITY("--mdc-theme-code-token-entity", "#f8f8f2"),
	MDC_THEME_CODE_TOKEN_URL("--mdc-theme-code-token-url", "#f8f8f2"),
	MDC_THEME_CODE_TOKEN_VARIABLE("--mdc-theme-code-token-variable", "#f8f8f2"),
	MDC_THEME_CODE_TOKEN_ATRULE("--mdc-theme-code-token-atrule", "#e6db74"),
	MDC_THEME_CODE_TOKEN_ATTR_VALUE("--mdc-theme-code-token-attr-value", "#e6db74"),
	MDC_THEME_CODE_TOKEN_FUNCTION("--mdc-theme-code-token-function", "#e6db74"),
	MDC_THEME_CODE_TOKEN_KEYWORD("--mdc-theme-code-token-keyword", "#66d9ef"),
	MDC_THEME_CODE_TOKEN_REGEX("--mdc-theme-code-token-regex", "#fd971f"),
	MDC_THEME_CODE_TOKEN_IMPORTANT("--mdc-theme-code-token-important", "#fd971f");
	
	private final String cssClass;
	private final String defaultValue;
	
	ThemeProperty(final String cssClass, final Color color) {
		this(cssClass, color.getCssName());
	}
	
	ThemeProperty(final String cssClass, final Color color, final double alpha) {
		this(cssClass, color.getCssName(alpha));
	}
	
	ThemeProperty(final String cssClass, final String defaultValue) {
		this.cssClass = cssClass;
		this.defaultValue = defaultValue;
	}
	
	@Override
	public String getCssName() {
		return cssClass;
	}
	
	public String getDefaultValue() {
		return defaultValue;
	}
	
	public String load() {
		return StyleHelper.getCssProperty(cssClass);
	}
	
	public String loadOrDefault() {
		return loadOrDefault(defaultValue);
	}
	
	public String loadOrDefault(final String defaultValue) {
		final String value = StyleHelper.getCssProperty(cssClass);
		return value == null || value.trim().isEmpty() ? defaultValue : value;
	}
	
	public static final ThemeProperty[] chartistSeries() {
		return Arrays.stream(ThemeProperty.values())
				.filter(property -> property.getCssName().startsWith("--mdc-chartist--series_"))
				.toArray(ThemeProperty[]::new);
	}
	
	public static final ThemeProperty[] chartistLabels() {
		return Arrays.stream(ThemeProperty.values())
				.filter(property -> property.getCssName().startsWith("--mdc-chartist--label_"))
				.toArray(ThemeProperty[]::new);
	}
	
	public static final ThemeProperty[] codeToken() {
		return Arrays.stream(ThemeProperty.values())
				.filter(property -> property.getCssName().startsWith("--mdc-theme-code-token-"))
				.toArray(ThemeProperty[]::new);
	}
	
	public static final ThemeProperty fromStyleName(final String styleName) {
		return EnumHelper.fromStyleName(styleName, ThemeProperty.class, null);
	}
}
