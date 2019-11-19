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
package gwt.material.design.components.client.validation.validators;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class PasswordValidator {
	
	public final static String PARTNER__STRONG_PASSWORD = "^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$";
	public final static String PARTNER__MEDIUM_PASSWORD = "^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$";
	public final static String PARTNER__ENOUGH_PASSWORD = "(?=.{6,}).*";
	public final static String PARTNER__CHAR_SEQUENCE = "(01)|(12)|(23)|(34)|(45)|(56)|(67)|(78)|(89)|(AB)|(BC)|(CD)|(DE)|(EF)|(FG)|(GH)|(HI)|(IJ)|(JK)|(KL)|(LM)|(MN)|(NO)|(OP)|(PQ)|(QR)|(RS)|(ST)|(TU)|(UV)|(VW)|(WX)|(XY)|(YZ)|(ab)|(bc)|(cd)|(de)|(ef)|(fg)|(gh)|(hi)|(ij)|(jk)|(kl)|(lm)|(mn)|(no)|(op)|(pq)|(qr)|(rs)|(st)|(tu)|(uv)|(vw)|(wx)|(xy)|(yz)";
	
	/**
	 * 
	 * @param value
	 * @return 0 - Very weak 1 - Weak 2 - Medium 3 - Strong
	 */
	public static native int passwordLevel(final String value)/*-{

        var strongRegex = new RegExp(
                @gwt.material.design.components.client.validation.validators.PasswordValidator::PARTNER__STRONG_PASSWORD,
                "g");
        var mediumRegex = new RegExp(
                @gwt.material.design.components.client.validation.validators.PasswordValidator::PARTNER__MEDIUM_PASSWORD,
                "g");
        var enoughRegex = new RegExp(
                @gwt.material.design.components.client.validation.validators.PasswordValidator::PARTNER__ENOUGH_PASSWORD,
                "g");

        if (value.length == 0) {
	        // Empty
	        return -1;
        } else if (false == enoughRegex.test(value)) {
	        // Very Weak
	        return 0;
        } else if (strongRegex.test(value)) {
	        // Strong
	        return 3;
        } else if (mediumRegex.test(value)) {
	        // Medium
	        return 2;
        } else {
	        // Weak
	        return 1;
        }

	}-*/;
	
	public static native boolean hasCharSequence(final String value)/*-{
        var regExp = new RegExp(@gwt.material.design.components.client.validation.validators.PasswordValidator::PARTNER__CHAR_SEQUENCE, 'g');
        return regExp.test(value);
	}-*/;
}
