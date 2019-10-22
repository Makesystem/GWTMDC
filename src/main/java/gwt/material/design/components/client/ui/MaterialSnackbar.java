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
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasText;

import gwt.material.design.components.client.base.mixin.ToggleStyleMixin;
import gwt.material.design.components.client.constants.CloseAction;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.HTMLAttributes;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.constants.Role;
import gwt.material.design.components.client.events.OpenEvent;
import gwt.material.design.components.client.events.OpeningEvent;
import gwt.material.design.components.client.events.CloseEvent;
import gwt.material.design.components.client.events.ClosingEvent;
import gwt.material.design.components.client.events.CloseEvent.CloseHandler;
import gwt.material.design.components.client.events.CloseEvent.HasCloseHandlers;
import gwt.material.design.components.client.events.ClosingEvent.ClosingHandler;
import gwt.material.design.components.client.events.ClosingEvent.HasClosingHandlers;
import gwt.material.design.components.client.events.OpenEvent.HasOpenHandlers;
import gwt.material.design.components.client.events.OpenEvent.OpenHandler;
import gwt.material.design.components.client.events.OpeningEvent.HasOpeningHandlers;
import gwt.material.design.components.client.events.OpeningEvent.OpeningHandler;
import gwt.material.design.components.client.ui.html.Button;
import gwt.material.design.components.client.ui.html.Div;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialSnackbar extends Div
		implements HasText, HasOpenHandlers, HasOpeningHandlers, HasCloseHandlers, HasClosingHandlers {
	
	protected final Div surface = new Div(CssName.MDC_SNACKBAR__SURFACE);
	protected final Div label = new Div(CssName.MDC_SNACKBAR__LABEL);
	protected final Div actions = new Div(CssName.MDC_SNACKBAR__ACTIONS);
	protected final Button action = new Button(CssName.MDC_BUTTON, CssName.MDC_SNACKBAR__ACTION);
	protected final MaterialIcon dismiss = new MaterialIcon(IconType.CLOSE, CssName.MDC_SNACKBAR__DISMISS);
	
	protected final ToggleStyleMixin<MaterialSnackbar> leadingMixin = new ToggleStyleMixin<>(this,
			CssName.MDC_SNACKBAR__LEADING);
	protected final ToggleStyleMixin<MaterialSnackbar> steakedMixin = new ToggleStyleMixin<>(this,
			CssName.MDC_SNACKBAR__STACKED);
	
	// Gets/sets the automatic dismiss timeout in milliseconds.
	// Value must be between 4000 and 10000 or an error will be thrown.
	// Defaults to 5000 (5 seconds).
	private int timeout = 4000;
	
	public MaterialSnackbar() {
		super(CssName.MDC_SNACKBAR);
	}
	
	@Override
	protected native JavaScriptObject jsInit(final Element element)/*-{
        return new $wnd.mdc.snackbar.MDCSnackbar(element);
	}-*/;
	
	@Override
	protected void onInitialize() {
		
		actions.add(action);
		actions.add(dismiss);
		
		surface.setRole(Role.STATUS);
		surface.setAttribute(HTMLAttributes.ARIA_LIVE, "polite");
		surface.add(label);
		surface.add(actions);
		add(surface);
		
		super.onInitialize();
		Window.addResizeHandler(event -> position());
		position();
		initEvents();
	}
	
	protected native void initEvents()/*-{
        var _this = this;
        var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;

        var fireOpening = function() {
	        _this.@gwt.material.design.components.client.ui.MaterialSnackbar::fireOpeningEvent()();
        };

        var fireOpen = function() {
	        _this.@gwt.material.design.components.client.ui.MaterialSnackbar::fireOpenEvent()();
        };

        var fireClosing = function(reason) {
	        _this.@gwt.material.design.components.client.ui.MaterialSnackbar::fireClosingEvent()();
        };

        var fireClose = function(reason) {
	        _this.@gwt.material.design.components.client.ui.MaterialSnackbar::fireCloseEvent()();
        };

        snackbar.listen('MDCSnackbar:opening', fireOpening);
        snackbar.listen('MDCSnackbar:opened', fireOpen);
        snackbar.listen('MDCSnackbar:closing', fireClosing);
        snackbar.listen('MDCSnackbar:closed', fireClose);
        
	}-*/;
	
	protected void fireOpenEvent() {
		OpenEvent.fire(MaterialSnackbar.this);
	}
	
	@Override
	public HandlerRegistration addOpenHandler(final OpenHandler handler) {
		return addHandler(handler, OpenEvent.getType());
	}
	
	protected void fireOpeningEvent() {
		OpeningEvent.fire(MaterialSnackbar.this);
	}
	
	@Override
	public HandlerRegistration addOpeningHandler(final OpeningHandler handler) {
		return addHandler(handler, OpeningEvent.getType());
	}
	
	protected void fireCloseEvent() {
		CloseEvent.fire(MaterialSnackbar.this, CloseAction.NONE);
	}
	
	@Override
	public HandlerRegistration addCloseHandler(final CloseHandler handler) {
		return addHandler(handler, CloseEvent.getType());
	}
	
	protected void fireClosingEvent() {
		ClosingEvent.fire(MaterialSnackbar.this, CloseAction.NONE);
	}
	
	@Override
	public HandlerRegistration addClosingHandler(final ClosingHandler handler) {
		return addHandler(handler, ClosingEvent.getType());
	}
	
	@Override
	public void setBackgroundColor(Color color) {
		setCssProperty(CssMixin.MDC_SNACKBAR__FILL_COLOR, color.getCssName());
	}
	
	@Override
	public void setColor(Color color) {
		setCssProperty(CssMixin.MDC_SNACKBAR__INK_COLOR, color.getCssName());
	}
	
	public void setActionColor(Color color) {
		setCssProperty(CssMixin.MDC_SNACKBAR__ACTION_INK_COLOR, color.getCssName());
	}
	
	@Override
	public void setText(final String text) {
		label.getElement().setInnerHTML(text);
	}
	
	@Override
	public String getText() {
		return label.getElement().getInnerText();
	}
	
	public void setActionText(final String text) {
		action.getElement().setInnerText(text);
	}
	
	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return action.addClickHandler(handler);
	}
	
	public void setLeading(final boolean leading) {
		leadingMixin.toggle(leading);
	}
	
	public void setSteaked(final boolean steaked) {
		steakedMixin.toggle(steaked);
	}
	
	public void setDismiss(final boolean dismiss) {
		setAttribute(HTMLAttributes.DISMISS, String.valueOf(dismiss).toLowerCase());
	}
	
	public int getTimeout() {
		return timeout;
	}
	
	/**
	 * Value must be between 4000 and 10000 or an error will be thrown.
	 * 
	 * @param timeout
	 */
	public void setTimeout(final int timeout) {
		
		if (timeout < 4000 || timeout > 10000)
			throw new IllegalArgumentException("The timeout must be between 4000 and 10000.");
		
		this.timeout = timeout;
	}
	
	public final void open() {
		_open();
		position();
	}
	
	protected final native void _open() /*-{
        var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (snackbar) {

	        // Gets/sets the automatic dismiss timeout in milliseconds. 
	        // Value must be between 4000 and 10000 or an error will be thrown. 
	        // Defaults to 5000 (5 seconds).
	        snackbar.timeoutMs = this.@gwt.material.design.components.client.ui.MaterialSnackbar::timeout;

	        snackbar.open();
        }
	}-*/;
	
	public final native void close() /*-{
        var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (snackbar)
	        snackbar.close("");
	}-*/;
	
	public final native boolean isOpen() /*-{
        var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (snackbar)
	        return snackbar.isOpen;
        else
	        return false;
	}-*/;
	
	public final native void position() /*-{

        var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;

        if (!snackbar || !snackbar.isOpen)
	        return;

        var snackbar_surface_class = "."
                + @gwt.material.design.components.client.constants.CssName::MDC_SNACKBAR__SURFACE;
        var fab_class = "."
                + @gwt.material.design.components.client.constants.CssName::MDC_FAB;

        var snackbar_element = this.@gwt.material.design.components.client.base.widget.MaterialWidget::getElement()();

        var snackbar_width = $wnd.jQuery(snackbar_element).find(
                snackbar_surface_class).outerWidth(true);
        var snackbar_height = $wnd.jQuery(snackbar_element).find(
                snackbar_surface_class).outerHeight(true);
        var snackbar_top = $wnd.jQuery(snackbar_element).offset().top;
        var snackbar_left = $wnd.jQuery(snackbar_element).offset().left;
        var snackbar_bottom = snackbar_top + snackbar_height;
        var snackbar_right = snackbar_left + snackbar_width;

        var bottom = 0;

        var for_fabs_function = function(index) {

	        var fab_width = $wnd.jQuery(this).outerWidth(true);
	        var fab_height = $wnd.jQuery(this).outerHeight(true);
	        var fab_top = $wnd.jQuery(this).offset().top;
	        var fab_left = $wnd.jQuery(this).offset().left;
	        var fab_bottom = fab_top + fab_height;
	        var fab_right = fab_left + fab_width;

	        var fab_inner_snackbar = fab_top > 0
	                && fab_left > 0
	                && ((fab_left >= snackbar_left && fab_left <= snackbar_right) || (fab_right >= snackbar_left && fab_right <= snackbar_right));

	        var adjust_bottom;

	        if (fab_inner_snackbar)
		        adjust_bottom = $wnd.jQuery($wnd).height() - fab_top;
	        else
		        adjust_bottom = 0;

	        if (bottom < adjust_bottom)
		        bottom = adjust_bottom;

        };

        $wnd.jQuery(fab_class).each(for_fabs_function);
        $wnd.jQuery(snackbar_element).css("bottom", bottom + "px");

	}-*/;
	
}
