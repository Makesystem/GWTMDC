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

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Richeli Vargas
 *
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsOptions {
	
	@JsProperty
	public boolean hide;
	/**
	 * Line size in pixel. Default: 4
	 */
	@JsProperty
	public int size;
	@JsProperty
	public String color;
	/**
	 * Default: false
	 */
	@JsProperty
	public boolean outline;
	/**
	 * Default: 1
	 */
	@JsProperty
	public double outlineSize;
	@JsProperty
	public String outlineColor;
	/**
	 * Default: false
	 */
	@JsProperty
	public boolean gradient;
	/**
	 * Default: behind
	 * 
	 * -- disc
	 * 		outlineMax: 4
	 * -- square
	 * 		outlineMax: 4
	 * -- arrow1
	 * 		outlineMax: 1.5
	 * -- arrow2
	 * 		outlineMax: 1.75
	 * -- arrow3
	 * 		outlineMax: 2.5
	 * -- hand
	 * 		startPlugOutline/endPlugOutline option is ignored
	 * 		startPlugColor/endPlugColor option is ignored
	 * -- crosshair
	 * 		startPlugOutline/endPlugOutline option is ignored
	 * -- behind
	 * 		startPlugOutline/endPlugOutline option is ignored
	 * 		startPlugColor/endPlugColor option is ignored
	 */
	@JsProperty
	public String startPlug;
	/**
	 * Default: false
	 */
	@JsProperty
	public boolean startPlugOutline;
	@JsProperty
	public String startPlugOutlineColor;
	/**
	 * Default: 1
	 */
	@JsProperty
	public double startPlugOutlineSize;
	/**
	 * Default: 1
	 */
	@JsProperty
	public double startPlugSize;
	@JsProperty
	public String startPlugColor;
	@JsProperty
	public String startSocket;
	/**
	 * Default: arrow1
	 * 
	 * -- disc
	 * 		outlineMax: 4
	 * -- square
	 * 		outlineMax: 4
	 * -- arrow1
	 * 		outlineMax: 1.5
	 * -- arrow2
	 * 		outlineMax: 1.75
	 * -- arrow3
	 * 		outlineMax: 2.5
	 * -- hand
	 * 		startPlugOutline/endPlugOutline option is ignored
	 * 		startPlugColor/endPlugColor option is ignored
	 * -- crosshair
	 * 		startPlugOutline/endPlugOutline option is ignored
	 * -- behind
	 * 		startPlugOutline/endPlugOutline option is ignored
	 * 		startPlugColor/endPlugColor option is ignored
	 */
	@JsProperty
	public String endPlug;
	/**
	 * Default: false
	 */
	@JsProperty
	public boolean endPlugOutline;
	@JsProperty
	public String endPlugOutlineColor;
	/**
	 * Default: 1
	 */
	@JsProperty
	public double endPlugOutlineSize;
	/**
	 * Default: 1
	 */
	@JsProperty
	public double endPlugSize;
	@JsProperty
	public String endPlugColor;
	@JsProperty
	public String endSocket;
	/**
	 * Type: string Default: 'fluid'
	 * 
	 * One of the following keywords to indicate how to draw the line:
	 * 
	 * straight 
	 * arc 
	 * fluid 
	 * magnet 
	 * grid
	 */
	@JsProperty
	public String path;
	@JsProperty
	public JsDash dash;
	@JsProperty
	public double dropShadow;	
	@JsProperty
	public JavaScriptObject startLabel;
	@JsProperty
	public JavaScriptObject middleLabel;
	@JsProperty
	public JavaScriptObject endLabel;
}
