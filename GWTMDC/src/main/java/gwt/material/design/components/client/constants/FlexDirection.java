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
package gwt.material.design.components.client.constants;

import com.google.gwt.dom.client.Style.HasCssName;

/**
 * @author Richeli Vargas
 */
public enum FlexDirection implements BrowserPrefixCssType, HasCssName {
	ROW("row"), ROW_REVERSE("row-reverse"), COLUMN("column"), COLUMN_REVERSE("column-reverse");

	private String value;

	FlexDirection(final String value) {
		this.value = value;
	}

	@Override
	public String getIeValue() {
		return value;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getCssName() {
		return value;
	}
}
