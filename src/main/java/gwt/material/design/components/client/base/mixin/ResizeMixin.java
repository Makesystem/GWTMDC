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

import gwt.material.design.components.client.base.interfaces.HasResize;
import gwt.material.design.components.client.base.mixin.base.AbstractMixin;
import gwt.material.design.components.client.base.widget.MaterialUIObject;
import gwt.material.design.components.client.constants.Resize;
import gwt.material.design.components.client.utils.helper.StyleHelper;

/**
 * 
 * @author Richeli Vargas
 */
public class ResizeMixin<UIO extends MaterialUIObject & HasResize> extends AbstractMixin<UIO> implements HasResize {
	
	private Resize resize;
	
	public ResizeMixin(final UIO uiObject) {
		this(uiObject, Resize.NONE);
	}
	
	public ResizeMixin(final UIO uiObject, final Resize resize) {
		super(uiObject);
		setResize(resize);
	}

	@Override
	public void setResize(Resize resize) {
		this.resize = resize == null ? Resize.NONE : resize;
		StyleHelper.setCssProperty(uiObject, "resize", resize.getCssName());
	}

	@Override
	public Resize getResize() {
		return resize;
	}

}
