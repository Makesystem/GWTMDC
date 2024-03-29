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
package gwt.material.design.components.client.base.mixin.base;

import gwt.material.design.components.client.base.widget.MaterialUIObject;

/**
 * @author Richeli Vargas
 */
public abstract class ToggleStyleNameMixin<UIO extends MaterialUIObject> extends AbstractMixin<UIO> {

	protected final String cssClass;

	public ToggleStyleNameMixin(final UIO widget, final String cssClass) {
		super(widget);
		this.cssClass = cssClass;
	}

	protected void toggle(boolean apply) {		
		uiObject.toggleStyleName(apply, cssClass);
	}

	protected boolean isApplied() {
		return uiObject.hasStyleName(cssClass);
	}
}
