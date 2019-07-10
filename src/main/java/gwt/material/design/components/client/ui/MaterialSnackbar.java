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
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.HTMLAttributes;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.constants.Role;
import gwt.material.design.components.client.ui.html.Button;
import gwt.material.design.components.client.ui.html.Div;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialSnackbar extends Div implements HasText {

	protected final Div surface = new Div(CssName.MDC_SNACKBAR__SURFACE);
	protected final Div label = new Div(CssName.MDC_SNACKBAR__LABEL);
	protected final Div actions = new Div(CssName.MDC_SNACKBAR__ACTIONS);
	protected final Button action = new Button(CssName.MDC_BUTTON, CssName.MDC_SNACKBAR__ACTION);
	protected final MaterialIcon dismiss = new MaterialIcon(IconType.CLOSE, CssName.MDC_SNACKBAR__DISMISS);

	protected final ToggleStyleMixin<MaterialSnackbar> leadingMixin = new ToggleStyleMixin<>(this, CssName.MDC_SNACKBAR__LEADING);
	protected final ToggleStyleMixin<MaterialSnackbar> steakedMixin = new ToggleStyleMixin<>(this, CssName.MDC_SNACKBAR__STACKED);
	
	public MaterialSnackbar() {
		super(CssName.MDC_SNACKBAR);
	}

	@Override
	protected native JavaScriptObject jsInit(final Element element)/*-{
		return new $wnd.mdc.snackbar.MDCSnackbar(element);
	}-*/;

	@Override
	protected void onInitialize() {
		
		surface.setRole(Role.STATUS);
		surface.setAttribute(HTMLAttributes.ARIA_LIVE, "polite");
		surface.add(label);
		surface.add(actions);
		surface.add(action);
		surface.add(dismiss);
		add(surface);
		
		super.onInitialize();
		Window.addResizeHandler(event -> position());
		position();
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
	
	public final native void open() /*-{	
		var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;		
		if(snackbar) {
			
			// Gets/sets the automatic dismiss timeout in milliseconds. 
			// Value must be between 4000 and 10000 or an error will be thrown. 
			// Defaults to 5000 (5 seconds).
			snackbar.timeoutMs = 4000;
			
			snackbar.open();
		}
	}-*/;
	
	public final native void close() /*-{	
		var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(snackbar)
			snackbar.close("");
	}-*/;

	public final native boolean isOpen() /*-{	
		var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(snackbar)
			return snackbar.isOpen;
		else 
			return false;
	}-*/;
	
	public final native void position() /*-{	
		
		var snackbar = this.@gwt.material.design.components.client.base.widget.MaterialWidget::getElement()();
		
		console.log("top: " + $wnd.jQuery(snackbar).offset().top);
		console.log("width: " + $wnd.jQuery(snackbar).children()[0].width());
		console.log("left: " + $wnd.jQuery(snackbar).offset().left);
		console.log("height: " + $wnd.jQuery(snackbar).children()[0].height());
	
		$wnd.jQuery(".mdc-fab").each(function( index ) {

  			console.log(index + " -- top: " + $wnd.jQuery(this).offset().top);
			console.log(index + " -- width: " + $wnd.jQuery(this).width());
			console.log(index + " -- left: " + $wnd.jQuery(this).offset().left);
			console.log(index + " -- height: " + $wnd.jQuery(this).height());

		});
	
	}-*/;

}
