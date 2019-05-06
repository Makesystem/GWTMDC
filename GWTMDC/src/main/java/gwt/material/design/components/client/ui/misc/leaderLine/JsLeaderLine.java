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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Richeli Vargas
 *
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsLeaderLine {

	@JsMethod
	public native void remove();

	/**
	 * none 
	 * fade 
	 * 		Default animOptions: {duration: 300, timing: 'linear'} 
	 * draw 
	 * 		Default animOptions: {duration: 500, timing: [0.58, 0, 0.42, 1]}
	 * 
	 * @param effectName
	 */
	@JsMethod
	public native void show(final String effectName, final JsAnimationOptions options);

	/**
	 * none 
	 * fade 
	 * 		Default animOptions: {duration: 300, timing: 'linear'} 
	 * draw 
	 * 		Default animOptions: {duration: 500, timing: [0.58, 0, 0.42, 1]}
	 * 
	 * @param effectName
	 */
	@JsMethod
	public native void hide(final String effectName, final JsAnimationOptions options);

	@JsMethod
	public native void position();

	@JsMethod
	public native JsLeaderLine setOptions(final JsOptions options);

}
