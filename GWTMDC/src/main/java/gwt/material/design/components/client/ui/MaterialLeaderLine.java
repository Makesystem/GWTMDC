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
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.components.client.GwtMDC;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.LeaderLineEffectType;
import gwt.material.design.components.client.constants.LeaderLinePath;
import gwt.material.design.components.client.constants.PlugSocket;
import gwt.material.design.components.client.constants.PlugType;
import gwt.material.design.components.client.resources.MaterialResources;
import gwt.material.design.components.client.ui.misc.leaderLine.JsAnimationOptions;
import gwt.material.design.components.client.ui.misc.leaderLine.JsDash;
import gwt.material.design.components.client.ui.misc.leaderLine.JsLabelOptions;
import gwt.material.design.components.client.ui.misc.leaderLine.JsLeaderLine;
import gwt.material.design.components.client.ui.misc.leaderLine.JsOptions;
import gwt.material.design.components.client.ui.misc.leaderLine.JsShapeOptions;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialLeaderLine {

	static {
		GwtMDC.injectJs(MaterialResources.INSTANCE.leaderLineJs());
	}

	protected final Widget startElement;
	protected final Widget endElement;
	protected final JsOptions options = getDefaultOptions();
	protected final JsLabelOptions labelOptions = getDefaultLabelOptions();
	protected JsLeaderLine leaderLine;
	protected Effect showEffect = new Effect();
	protected Effect hideEffect = new Effect();

	public MaterialLeaderLine(final Widget startElement, final Widget endElement) {
		this.startElement = startElement;
		this.endElement = endElement;
		this.startElement.addAttachHandler(event -> {
			if (!event.isAttached())
				remove();
		});
		this.endElement.addAttachHandler(event -> {
			if (!event.isAttached())
				remove();
		});
	}

	public void draw() {
		if (this.leaderLine == null)
			this.leaderLine = draw(startElement.getElement(), endElement.getElement(), options);
		else
			this.leaderLine = this.leaderLine.setOptions(options);
	}

	public void position() {
		if (this.leaderLine != null)
			this.leaderLine.position();
	}

	public void remove() {
		if (this.leaderLine != null)
			this.leaderLine.remove();
		this.leaderLine = null;
	}

	public void show() {
		if (this.leaderLine != null) {
			this.leaderLine.position();
			this.leaderLine.show(showEffect.getName(), showEffect.getAnimationOptions());
		}
	}

	public void hide() {
		if (this.leaderLine != null)
			this.leaderLine.hide(hideEffect.getName(), hideEffect.getAnimationOptions());
	}

	public void setShowEffect(final LeaderLineEffectType effectType, final int effectDuration) {
		this.showEffect.setType(effectType);
		this.showEffect.setDuration(effectDuration);
	}

	public void setHideEffect(final LeaderLineEffectType effectType, final int effectDuration) {
		this.hideEffect.setType(effectType);
		this.hideEffect.setDuration(effectDuration);
	}

	// /////////////////////////////////////////////////////////////////
	// Line options
	// /////////////////////////////////////////////////////////////////
	public void setHide(final boolean hide) {
		options.hide = hide;
	}

	public void setColor(final Color color) {
		options.color = color.getCssName();
	}

	public void setSize(final int size) {
		options.size = size;
	}

	public void setOutline(final boolean outline) {
		options.outline = outline;
	}

	public void setOutlineSize(final double outlineSize) {
		options.outlineSize = outlineSize;
	}

	public void setPath(final LeaderLinePath path) {
		options.path = path.getCssName();
	}

	public void setGradient(final boolean gradient) {
		options.gradient = gradient;
	}

	public void setDropShadow(final double dropShadow) {
		options.dropShadow = dropShadow;
	}

	public void setDash(final boolean dash) {
		setDash(dash, false);
	}

	public void setDash(final boolean dash, final boolean animate) {
		setDash(dash, animate, 16, 8);
	}

	/**
	 * 
	 * @param dash    Default is false
	 * @param animate Default is false
	 * @param length  Default is 16
	 * @param gap     Default is 8
	 */
	public void setDash(final boolean dash, final boolean animate, final int length, final int gap) {
		if (dash) {
			options.dash = new JsDash();
			options.dash.animation = animate;
			options.dash.len = length;
			options.dash.gap = gap;
		} else
			options.dash = null;
	}

	// /////////////////////////////////////////////////////////////////
	// Label's options
	// /////////////////////////////////////////////////////////////////

	public void setStartLabel(final String label) {
		options.startLabel = labelPath(label, labelOptions);
	}

	public void setMiddleLabel(final String label) {
		options.middleLabel = labelPath(label, labelOptions);
	}

	public void setEndLabel(final String label) {
		options.endLabel = labelPath(label, labelOptions);
	}

	public void setLabelColor(final Color color) {
		labelOptions.color = color.getCssName();
	}

	// /////////////////////////////////////////////////////////////////
	// Start plug options
	// /////////////////////////////////////////////////////////////////

	public void setStartPlug(final PlugType plug) {
		options.startPlug = plug.getCssName();
	}

	public void setStartPlugColor(final Color color) {
		options.startPlugColor = color.getCssName();
	}

	public void setStartPlugSize(final double size) {
		options.startPlugSize = size;
	}

	public void setStartPlugOutline(final boolean outline) {
		options.startPlugOutline = outline;
	}

	public void setStartPlugOutlineColor(final Color color) {
		options.startPlugOutlineColor = color.getCssName();
	}

	public void setStartPlugOutlineSize(final double size) {
		options.startPlugOutlineSize = size;
	}

	public void setStartPlugSocket(final PlugSocket socket) {
		options.startSocket = socket.getCssName();
	}

	// /////////////////////////////////////////////////////////////////
	// End plug options
	// /////////////////////////////////////////////////////////////////

	public void setEndPlug(final PlugType plug) {
		options.endPlug = plug.getCssName();
	}

	public void setEndPlugColor(final Color color) {
		options.endPlugColor = color.getCssName();
	}

	public void setEndPlugSize(final double size) {
		options.endPlugSize = size;
	}

	public void setEndPlugOutline(final boolean outline) {
		options.endPlugOutline = outline;
	}

	public void setEndPlugOutlineColor(final Color color) {
		options.endPlugOutlineColor = color.getCssName();
	}

	public void setEndPlugOutlineSize(final double size) {
		options.endPlugOutlineSize = size;
	}

	public void setEndPlugSocket(final PlugSocket socket) {
		options.endSocket = socket.getCssName();
	}

	// /////////////////////////////////////////////////////////////////
	//
	// /////////////////////////////////////////////////////////////////

	protected native JsLeaderLine draw(final Element startElement, final Element endElement,
			final JsOptions options) /*-{

		var _this = this;
		var leaderLine = new $wnd.LeaderLine(startElement, endElement,options);
		leaderLine.positionByWindowResize = false;

		var onScroll = function() {
			var line = _this.@gwt.material.design.components.client.ui.MaterialLeaderLine::leaderLine;
			if (line) {
				_this.@gwt.material.design.components.client.ui.MaterialLeaderLine::position()();
			} else {
				$wnd.jQuery(startElement).parents().off('scroll', '*', onScroll);
				$wnd.jQuery(endElement).parents().off('scroll','*', onScroll);
			}
		};

		$wnd.jQuery(startElement).parents().on('scroll', onScroll);
		$wnd.jQuery(endElement).parents().on('scroll', onScroll);

		return leaderLine;

	}-*/;

	private final JsOptions getDefaultOptions() {

		final JsOptions options = new JsOptions();

		options.color = Color.MDC_THEME_ON_SURFACE.getCssName();
		options.size = 2;
		options.outlineColor = options.color;
		options.startPlugSize = 2;
		options.endPlug = PlugType.ARROW_2.getCssName();
		options.endPlugSize = 2;

		return options;
	}

	private final JsLabelOptions getDefaultLabelOptions() {
		final JsLabelOptions options = new JsLabelOptions();
		options.outlineColor = "rgba(0,0,0,0)";
		options.fontFamily = "var(--mdc-font-family)";
		options.fontWeight = "400";
		options.fontSize = "0.875rem";
		options.letterSpacing = "0.0333333333em";
		options.textDecoration = "inherit";
		return options;
	}

	private native JavaScriptObject labelPath(final String label, final JsLabelOptions options) /*-{
		options.text = label;
		if (label)
			return $wnd.LeaderLine.pathLabel(options);
		else
			return null;
	}-*/;

	private native Element shape(final JsShapeOptions shapeOptions) /*-{
		return $wnd.LeaderLine.areaAnchor(shapeOptions);
	}-*/;

	protected class Effect {

		private LeaderLineEffectType type = LeaderLineEffectType.DRAW;
		private final JsAnimationOptions options = new JsAnimationOptions();

		protected void setType(final LeaderLineEffectType type) {
			this.type = type == null ? LeaderLineEffectType.NONE : type;
		}

		protected void setDuration(final int duration) {
			options.duration = duration;
		}

		protected String getName() {
			return type.getCssName();
		}

		protected JsAnimationOptions getAnimationOptions() {
			return options;
		}
	}
}
