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

import gwt.material.design.components.client.utils.helper.EnumHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public enum PagingType implements CssType {
	
	NUMBERS("numbers"), SIMPLE("simple"), SIMPLE_NUMBERS("simple_numbers"), FULL("full"), FULL_NUMBERS("full_numbers"),
	FIRST_LAST_NUMBERS("first_last_numbers");
	
	private final String cssClass;
	
	PagingType(final String cssClass) {
		this.cssClass = cssClass;
	}
	
	@Override
	public String getCssName() {
		return cssClass;
	}
	
	public static PagingType fromStyleName(final String styleName) {
		return EnumHelper.fromStyleName(styleName, PagingType.class, SIMPLE_NUMBERS);
	}
}
