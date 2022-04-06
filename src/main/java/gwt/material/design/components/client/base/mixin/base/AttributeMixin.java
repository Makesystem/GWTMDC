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
 * WITHOUUIO WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.components.client.base.mixin.base;

import com.google.gwt.dom.client.Style.HasCssName;

import gwt.material.design.components.client.base.interfaces.FromString;
import gwt.material.design.components.client.base.widget.MaterialUIObject;

/**
 * @author Richeli Vargas
 */
public class AttributeMixin<UIO extends MaterialUIObject, V> extends AbstractMixin<UIO> {

	protected final String attribute;
	protected final FromString<V> fromString;

	public AttributeMixin(final UIO uiObject, final String attribute, final FromString<V> fromString) {
		super(uiObject);
		this.attribute = attribute;
		this.fromString = fromString;
	}

	public AttributeMixin(final UIO uiObject, final String attribute, V value, final FromString<V> converter) {
		this(uiObject, attribute, converter);
		setValue(value);
	}

	public String getAttribute() {
		return attribute;
	}

	public V getValue() {
		return fromString == null ? null : fromString.from(uiObject.getAttribute(attribute));
	}

	public void setValue(V value) {
		setValue(attribute, value, uiObject);
	}

	public void setValue(final String attribute, final V value, final MaterialUIObject uiObject) {

		final String var;

		if (value == null)
			var = null;
		else if (value instanceof Boolean)
			var = ((Boolean) value) ? value.toString() : null;
		else if (value instanceof HasCssName)
			var = ((HasCssName) value).getCssName();
		else
			var = value.toString();
		
		uiObject.setAttribute(attribute, var);
	}

}
