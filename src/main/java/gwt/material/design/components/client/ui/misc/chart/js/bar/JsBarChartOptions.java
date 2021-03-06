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
package gwt.material.design.components.client.ui.misc.chart.js.bar;

import gwt.material.design.components.client.ui.misc.chart.js.base.JsAxis;
import gwt.material.design.components.client.ui.misc.chart.js.base.JsChartOptions;
import gwt.material.design.components.client.ui.misc.chart.js.base.JsChartPadding;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Richeli Vargas
 *
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsBarChartOptions extends JsChartOptions {

    @JsProperty
    public JsChartPadding chartPadding;

	@JsProperty
	public JsAxis axisX;
	
	@JsProperty
	public JsAxis axisY;
    
	@JsProperty
    public double referenceValue;
	
	@JsProperty
	public boolean showGridBackground;
	
	@JsProperty
	public boolean distributeSeries;
	
	@JsProperty
	public boolean horizontalBars;
	
	@JsProperty
    public int seriesBarDistance;
	
	@JsProperty
	public boolean stackBars;
	
	@JsProperty
	public String stackMode;	
	
}
