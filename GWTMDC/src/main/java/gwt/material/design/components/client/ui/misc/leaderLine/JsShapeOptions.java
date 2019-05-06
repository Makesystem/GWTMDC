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
package gwt.material.design.components.client.ui.misc.leaderLine;

import com.google.gwt.dom.client.Element;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Richeli Vargas
 *
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsShapeOptions {

	@JsProperty
	public Element element;
	/**
	 * Default: 'rect'
	 * One of the following keywords to indicate the shape of the area:
	 * rect
	 * circle
	 * polygon
	 */
	@JsProperty
	public String shape;
	@JsProperty
	public String color;
	/**
	 * In percent
	 * 
	 * Default: -5%
	 */
	@JsProperty
	public String x;
	/**
	 * In percent
	 * 
	 * Default: -5%
	 */
	@JsProperty
	public String y;
	/**
	 * Default: 110%
	 */
	@JsProperty
	public String width;
	/**
	 * Default: 110%
	 */
	@JsProperty
	public String height;

}
