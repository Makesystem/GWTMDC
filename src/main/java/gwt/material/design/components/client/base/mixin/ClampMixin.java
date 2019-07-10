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
package gwt.material.design.components.client.base.mixin;

import gwt.material.design.components.client.base.interfaces.HasClamp;
import gwt.material.design.components.client.base.mixin.base.AbstractMixin;
import gwt.material.design.components.client.base.widget.MaterialUIObject;
import gwt.material.design.components.client.constants.CssMixin;
import gwt.material.design.components.client.constants.CssName;

/**
 * @author Richeli Vargas
 */
public class ClampMixin<UIO extends MaterialUIObject> extends AbstractMixin<UIO> implements HasClamp {

	protected final ToggleStyleMixin<UIO> clampStyleMixin;
	
	private int clamp;
	
	public ClampMixin(final UIO uiObject) {
		super(uiObject);
		clampStyleMixin = new ToggleStyleMixin<>(uiObject, CssName.MDC_CLAMP);
	}

	@Override
	public int getClamp() {
		return clamp;
	}

	@Override
	public void setClamp(final int clamp) {
		this.clamp = clamp;		
		clampStyleMixin.toggle(clamp > -1);
		uiObject.setCssProperty(CssMixin.MDC_CLAMP, String.valueOf(clamp));
	}

}
