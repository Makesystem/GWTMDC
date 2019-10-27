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
package gwt.material.design.components.client.base.widget;

import com.google.gwt.dom.client.Element;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class JQueryElement {

	private final Element element;

	public JQueryElement(final Element element) {
		this.element = element;
	}

	public native void show() /*-{
		var element = this.@gwt.material.design.components.client.base.widget.JQueryElement::element;
		$wnd.jQuery(element).show();
	}-*/;

	public native void hide() /*-{
		var element = this.@gwt.material.design.components.client.base.widget.JQueryElement::element;
		$wnd.jQuery(element).toggle();
	}-*/;

	public native void toggle() /*-{
		var element = this.@gwt.material.design.components.client.base.widget.JQueryElement::element;
		$wnd.jQuery(element).toggle();
	}-*/;

	public native void toggle(final String className) /*-{
		var element = this.@gwt.material.design.components.client.base.widget.JQueryElement::element;
		$wnd.jQuery(element).toggleClass(className);
	}-*/;
}
