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
package gwt.material.design.components.client.theme;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.IntStream;

import com.google.gwt.event.shared.HandlerRegistration;

import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.ThemeProperty;
import gwt.material.design.components.client.utils.helper.ColorHelper;

/**
 *
 * @author Richeli Vargas
 *
 */
public class Theme implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4278232411600395883L;

	private final Collection<ChangeHandler> handlers = new LinkedList<>();
	private final Map<String, String> properties = new LinkedHashMap<>();

	public Theme() {
		Arrays.stream(ThemeProperty.values())
				.forEach(property -> properties.put(property.getCssName(), property.loadOrDefault()));
	}

	public Theme(final ChangeHandler handler) {
		this();
		addChangeHandler(handler);
	}

	public void set(final ThemeProperty property, final Color color) {
		set(property, color, 1);
	}

	public void set(final ThemeProperty property, final Color color, final double alpha) {

		if (color.toString().startsWith("MDC_"))
			throw new IllegalArgumentException("Unable to set theme property with other theme property.");

		set(property, color.getCssName(alpha));
	}

	public void set(final ThemeProperty property, final String value) {
		this.properties.put(property.getCssName(), value);
		this.fireChangeEvents(property, value);
	}

	@Override
	public String toString() {

		final StringBuilder string = new StringBuilder();

		string.append(":root {\n");
		properties.entrySet().forEach(entry -> string.append("\n\t").append(entry.getKey()).append(": ")
				.append(entry.getValue()).append(";"));
		string.append("\n}");

		return string.toString();
	}

	/**
	 * 
	 * @param property
	 * @param color
	 */
	public void setColor(final ThemeProperty property, final Color color) {
		switch (property) {
		case MDC_THEME_PRIMARY:
			setPrimary(color);
			break;
		case MDC_THEME_SECONDARY:
			setSecondary(color);
			break;
		case MDC_THEME_SURFACE:
			setSurface(color);
			break;
		case MDC_THEME_BACKGROUND:
			setBackground(color);
			break;
		case MDC_THEME_SUCCESS:
			setSuccess(color);
			break;
		case MDC_THEME_WARNING:
			setWarning(color);
			break;
		case MDC_THEME_ERROR:
			setError(color);
			break;
		default:
			set(property, color);
			break;
		}
	}

	/**
	 * It will set: <code>
	 * <pre>MDC_THEME_PRIMARY</pre>
	 * <pre>MDC_THEME_ON_PRIMARY</pre>
	 * </code>
	 * 
	 * @param color
	 */
	public void setPrimary(final Color color) {
		set(ThemeProperty.MDC_THEME_PRIMARY, color);
		set(ThemeProperty.MDC_THEME_ON_PRIMARY, color.onColor());
	}

	/**
	 * It will set: <code>
	 * <pre>MDC_THEME_SECONDARY</pre>
	 * <pre>MDC_THEME_ON_SECONDARY</pre>
	 * <pre>MDC_CHARTIST__SERIES_ ...</pre>
	 * <pre>MDC_CHARTIST__LABEL_ ...</pre>
	 * </code>
	 * 
	 * @param color
	 */
	public void setSecondary(final Color color) {

		set(ThemeProperty.MDC_THEME_SECONDARY, color);
		set(ThemeProperty.MDC_THEME_ON_SECONDARY, color.onColor());

		final ThemeProperty[] series = ThemeProperty.chartistSeries();
		final ThemeProperty[] labels = ThemeProperty.chartistLabels();

		final int numOfSeries = series.length;

		final String[] palette = ColorHelper.generatePalette(numOfSeries, color.getCssName(), 8);

		IntStream.range(0, numOfSeries).forEach(index -> {
			set(series[index], palette[index]);
			set(labels[index], ColorHelper.getColorIn(palette[index]));
		});
	}

	/**
	 * It will set: <code>
	 * <pre>MDC_THEME_SURFACE</pre>
	 * <pre>MDC_THEME_ON_SURFACE</pre>
	 * </code>
	 * 
	 * @param color
	 */
	public void setSurface(final Color color) {
		set(ThemeProperty.MDC_THEME_SURFACE, color);
		set(ThemeProperty.MDC_THEME_ON_SURFACE, color.onColor());
	}

	/**
	 * It will set: <code>
	 * <pre>MDC_THEME_BACKGROUND</pre>
	 * <pre>MDC_THEME_TEXT_PRIMARY_ON_BACKGROUND</pre>
	 * <pre>MDC_THEME_TEXT_SECONDARY_ON_BACKGROUND</pre>
	 * <pre>MDC_THEME_TEXT_HINT_ON_BACKGROUND</pre>
	 * <pre>MDC_THEME_TEXT_DISABLED_ON_BACKGROUND</pre>
	 * <pre>MDC_THEME_TEXT_ICON_ON_BACKGROUND</pre>
	 * </code>
	 * 
	 * @param color
	 */
	public void setBackground(final Color color) {
		set(ThemeProperty.MDC_THEME_BACKGROUND, color);
		set(ThemeProperty.MDC_THEME_TEXT_PRIMARY_ON_BACKGROUND, color.onColor(), .87);
		set(ThemeProperty.MDC_THEME_TEXT_SECONDARY_ON_BACKGROUND, color.onColor(), .54);
		set(ThemeProperty.MDC_THEME_TEXT_HINT_ON_BACKGROUND, color.onColor(), .12);
		set(ThemeProperty.MDC_THEME_TEXT_DISABLED_ON_BACKGROUND, color.onColor(), .38);
		set(ThemeProperty.MDC_THEME_TEXT_ICON_ON_BACKGROUND, color.onColor(), .38);
	}

	/**
	 * It will set: <code>
	 * <pre>MDC_THEME_SUCCESS</pre>
	 * <pre>MDC_THEME_ON_SUCCESS</pre>
	 * </code>
	 * 
	 * @param color
	 */
	public void setSuccess(final Color color) {
		set(ThemeProperty.MDC_THEME_SUCCESS, color);
		set(ThemeProperty.MDC_THEME_ON_SUCCESS, color.onColor());
	}

	/**
	 * It will set: <code>
	 * <pre>MDC_THEME_WARNING</pre>
	 * <pre>MDC_THEME_ON_WARNING</pre>
	 * </code>
	 * 
	 * @param color
	 */
	public void setWarning(final Color color) {
		set(ThemeProperty.MDC_THEME_WARNING, color);
		set(ThemeProperty.MDC_THEME_ON_WARNING, color.onColor());
	}

	/**
	 * It will set: <code>
	 * <pre>MDC_THEME_ERROR</pre>
	 * <pre>MDC_THEME_ON_ERROR</pre>
	 * </code>
	 * 
	 * @param color
	 */
	public void setError(final Color color) {
		set(ThemeProperty.MDC_THEME_ERROR, color);
		set(ThemeProperty.MDC_THEME_ON_ERROR, color.onColor());
	}

	protected void fireChangeEvents(final ThemeProperty property, final String value) {
		handlers.forEach(handler -> handler.onChange(property, value));
	}

	public HandlerRegistration addChangeHandler(final ChangeHandler handler) {
		handlers.add(handler);
		return () -> handlers.remove(handler);
	}

	public static interface ChangeHandler {
		public void onChange(final ThemeProperty property, final String value);
	}
}
