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
package gwt.material.design.components.client.utils.security;

import gwt.material.design.components.client.utils.helper.StringHelper;

/**
 *
 * @author Richeli Vargas
 *
 */
public class PasswordMeter {
	
	public final static String PARTNER__STRONG_PASSWORD = "^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$";
	public final static String PARTNER__MEDIUM_PASSWORD = "^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$";
	public final static String PARTNER__ENOUGH_PASSWORD = "(?=.{6,}).*";
	
	public PasswordScore getScore(final String value) {
		
		if (value == null)
			return PasswordScore.EMPYT;
		
		final String toMatch = StringHelper.stripSeqs(value);
		
		if (value.length() == 0)
			return PasswordScore.EMPYT;
		else if (false == match(toMatch, PARTNER__ENOUGH_PASSWORD))
			return PasswordScore.VERY_WEAK;
		else if (match(toMatch, PARTNER__STRONG_PASSWORD))
			return PasswordScore.STRONG;
		else if (match(toMatch, PARTNER__MEDIUM_PASSWORD))
			return PasswordScore.MEDIUM;
		else
			return PasswordScore.WEAK;
		
	}
	
	protected native boolean match(String value, String partner) /*-{
        return (new RegExp(partner, "g")).test(value);
	}-*/;
	
}
