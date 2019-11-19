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
package gwt.material.design.components.client.utils.helper;

/**
 *
 * @author Richeli Vargas
 *
 */
public class StringHelper {
	
	/**
     * A String for a space character.
     *
     */
    public static final String SPACE = " ";
    
    /**
     * The underline String {@code "_"}.
     *
     */
    public static final String UL = "_";
    
    /**
     * The unserline String {@code "_"}.
     *
     */
    public static final String DOT = ".";
    
    /**
     * The double quotes String {@code """}.
     *
     */
    public static final String DQ = "\"";
    
    /**
     * The back slash String {@code "\"}.
     *
     */
    public static final String BS = "\\\\";
        
    /**
     * The empty String {@code ""}.
     *
     */
    public static final String EMPTY = "";
    
    /**
     * If value is null an empty String will be returned
     * 
     * @param value
     * @return
     */
    public final static String nullSafe(final String value) {
    	return value == null ? EMPTY : value;
    }
	
}
