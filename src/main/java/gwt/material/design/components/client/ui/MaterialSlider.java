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
import com.google.gwt.event.shared.HandlerRegistration;

import gwt.material.design.components.client.base.interfaces.Converter;
import gwt.material.design.components.client.base.interfaces.FromString;
import gwt.material.design.components.client.base.interfaces.HasConverter;
import gwt.material.design.components.client.base.interfaces.HasType;
import gwt.material.design.components.client.base.mixin.TypeMixin;
import gwt.material.design.components.client.base.mixin.base.AttributeMixin;
import gwt.material.design.components.client.base.widget.MaterialValuedField;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.HTMLAttributes;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.Role;
import gwt.material.design.components.client.constants.SliderType;
import gwt.material.design.components.client.events.InputEvent;
import gwt.material.design.components.client.events.InputEvent.HasInputHandlers;
import gwt.material.design.components.client.events.InputEvent.InputHandler;
import gwt.material.design.components.client.resources.MaterialResources;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Span;

/**
 * Because MDCSlider updates its UI based on the values it reads in when it is
 * instantiated, there is potential for an incorrect first render before the
 * script containing the MDCSlider initialization logic executes.
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialSlider extends MaterialValuedField<Double>
		implements HasInputHandlers<Double>, HasType<SliderType>, HasConverter<MaterialSlider, Double, String> {

	// /////////////////////////////////////////////////////////////
	// Slider
	// /////////////////////////////////////////////////////////////
	protected final Div trackContainer = new Div(CssName.MDC_SLIDER__TRACK_CONTAINER);
	protected final Div track = new Div(CssName.MDC_SLIDER__TRACK);
	protected final Div markerContainer = new Div(CssName.MDC_SLIDER__TRACK_MARKER_CONTAINER);
	protected final Div thumbContainer = new Div(CssName.MDC_SLIDER__THUMB_CONTAINER);
	protected final Div focusRing = new Div(CssName.MDC_SLIDER__FOCUS_RING);
	protected final Div pin = new Div(CssName.MDC_SLIDER__PIN);
	protected final Span pinValueMarker = new Span(CssName.MDC_SLIDER__PIN_VALUE_MARKER);

	// /////////////////////////////////////////////////////////////
	// Mixins
	// /////////////////////////////////////////////////////////////
	protected final AttributeMixin<MaterialSlider, Double> valueminMixin = new AttributeMixin<>(this,
			HTMLAttributes.ARIA_VALUEMIN, 0.0, FromString.TO_DOUBLE);
	protected final AttributeMixin<MaterialSlider, Double> valuenowMixin = new AttributeMixin<>(this,
			HTMLAttributes.ARIA_VALUENOW, 5.0, FromString.TO_DOUBLE);
	protected final AttributeMixin<MaterialSlider, Double> valuemaxMixin = new AttributeMixin<>(this,
			HTMLAttributes.ARIA_VALUEMAX, 10.0, FromString.TO_DOUBLE);
	protected final AttributeMixin<MaterialSlider, Double> dataStepMixin = new AttributeMixin<>(this,
			HTMLAttributes.DATA_STEP, 1.0, FromString.TO_DOUBLE);
	protected final AttributeMixin<MaterialSlider, Boolean> enabledMixin = new AttributeMixin<>(this,
			HTMLAttributes.ARIA_DISABLED, FromString.TO_BOOLEAN);
	protected final TypeMixin<MaterialSlider, SliderType> typeMixin = new TypeMixin<>(this);

	private Converter<MaterialSlider, Double, String> converter;

	public MaterialSlider() {
		super(CssName.MDC_SLIDER);
		setRole(Role.SLIDER);
	}

	@Override
	protected native JavaScriptObject jsInit(final Element element)/*-{
		var _this = this;
		var slider = new $wnd.mdc.slider.MDCSlider(element);
		slider.foundation_.adapter_.setMarkerValue = function setMarkerValue(
				value) {
			_this.@gwt.material.design.components.client.ui.MaterialSlider::draw()();
		};
		return slider;
	}-*/;

	@Override
	protected void onInitialize() {

		trackContainer.add(track);
		trackContainer.add(markerContainer);

		pin.add(pinValueMarker);

		thumbContainer.getElement().setInnerHTML(MaterialResources.INSTANCE.mdcSliderThumb().getText());
		thumbContainer.add(pin);
		thumbContainer.add(focusRing);

		add(trackContainer);
		add(thumbContainer);

		initializeChageEventListener();
		initializeInputEventListener();

		super.onInitialize();

		addResizeHandler(event -> layout());
	}

	protected native void initializeChageEventListener()/*-{
		var _this = this;
		var element = this.@gwt.material.design.components.client.ui.MaterialSlider::getElement()();
		var milliseconds = 0;

		function onChange() {
			var now = new Date().getTime();
			if ((now - milliseconds) > 100) {
				milliseconds = now;
				_this.@gwt.material.design.components.client.ui.MaterialSlider::fireChangeEvent()();
			}
		}

		element.addEventListener('MDCSlider:change', onChange);

	}-*/;

	protected native void initializeInputEventListener()/*-{
		var _this = this;
		var element = this.@gwt.material.design.components.client.ui.MaterialSlider::getElement()();
		var milliseconds = 0;

		function onInput() {
			var now = new Date().getTime();
			if ((now - milliseconds) > 100) {
				milliseconds = now;
				_this.@gwt.material.design.components.client.ui.MaterialSlider::fireInputEvent()();
			}
		}

		element.addEventListener('MDCSlider:input', onInput);

	}-*/;

	protected native void draw()/*-{

		var pinMarker = this.@gwt.material.design.components.client.ui.MaterialSlider::pinValueMarker;
		var pinMarkerElement = pinMarker.@gwt.material.design.components.client.ui.html.Span::getElement()();
		var value = this.@gwt.material.design.components.client.ui.MaterialSlider::getValue()();
		var formattedValue = this.@gwt.material.design.components.client.ui.MaterialSlider::formatValue(D)(value);
		var valueLength = formattedValue.length;

		var fontSize;

		if (valueLength < 3)
			fontSize = '0.875rem';
		else if (valueLength == 3)
			fontSize = '0.745rem';
		else if (valueLength > 3)
			fontSize = '0.565rem';
		else
			fontSize = '0.875rem'; // Default size

		$wnd.jQuery(pinMarkerElement).css('font-size', fontSize);
		$wnd.jQuery(pinMarkerElement).html(formattedValue);

	}-*/;

	protected native void layout()/*-{
		var jsElement = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if (jsElement)
			jsElement.layout();
	}-*/;

	protected native void nativeSetValue(final Double value)/*-{
		var slider = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		slider.value = value;
	}-*/;
	
	protected String formatValue(final double value) {
		return converter == null ? String.valueOf((int) value) : converter.undo(this, value);
	}

	@Override
	public void setValue(Double value, boolean fireEvents) {
		valuenowMixin.setValue(value);
		super.setValue(value, fireEvents);
		if (initialized)
			nativeSetValue(value);
	}

	@Override
	public Double getValue() {
		return valuenowMixin.getValue();
	}

	@Override
	public Converter<MaterialSlider, Double, String> getConverter() {
		return converter;
	}

	@Override
	public void setConverter(Converter<MaterialSlider, Double, String> converter) {
		this.converter = converter;
	}

	public void setMin(final double min) {
		valueminMixin.setValue(min);
	}

	public double getMin() {
		return valueminMixin.getValue();
	}

	public void setMax(final double max) {
		valuemaxMixin.setValue(max);
	}

	public double getMax() {
		return valuemaxMixin.getValue();
	}

	protected void fireInputEvent() {
		InputEvent.fire(this, getValue());
	}

	@Override
	public HandlerRegistration addInputHandler(InputHandler<Double> handler) {
		return addHandler(handler, InputEvent.getType());
	}

	@Override
	public void setType(SliderType type) {
		typeMixin.setType(type);
	}

	@Override
	public SliderType getType() {
		return typeMixin.getType();
	}

	public void setStep(final Double step) {
		dataStepMixin.setValue(step);
		if (initialized)
			jsInit();
	}

	public Double getStep() {
		return dataStepMixin.getValue();
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		enabledMixin.setValue(!enabled);
	}

	public void setTrackColor(final Color color) {
		setCssProperty(CssMixin.MDC_SLIDER__TRACK_COLOR, color.getCssName());
	}

	public void setTrackFillColor(final Color color) {
		setCssProperty(CssMixin.MDC_SLIDER__TRACK_FILL_COLOR, color.getCssName());
	}

	public void setTickMarkerColor(final Color color) {
		setCssProperty(CssMixin.MDC_SLIDER__TICK_MARKER_COLOR, color.getCssName());
	}

	public void setSliderThumbColor(final Color color) {
		setCssProperty(CssMixin.MDC_SLIDER__SLIDER_THUMB_COLOR, color.getCssName());
	}

	public void setPinColor(final Color color) {
		setCssProperty(CssMixin.MDC_SLIDER__PIN_COLOR, color.getCssName());
	}

	public void setValuePinColor(final Color color) {
		setCssProperty(CssMixin.MDC_SLIDER__VALUE_PIN_COLOR, color.getCssName());
	}
	
	@Override
	public void focus() {
		thumbContainer.getElement().focus();
	}
	
	@Override
	public void blur() {
		thumbContainer.getElement().blur();
	}
}
