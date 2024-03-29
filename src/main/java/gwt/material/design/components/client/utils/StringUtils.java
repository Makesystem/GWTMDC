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
package gwt.material.design.components.client.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class StringUtils {

	public static String capitalize(final String text) {
		return Arrays.asList(text.split(" ")).stream().map(word -> firstLetterToUpper(word))
				.collect(Collectors.joining(" "));
	}

	public static String firstLetterToUpper(final String text) {
		return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
	}

	public static String toString(final double value) {
		return String.valueOf(value);
	}
	
	public static boolean isBlank(final String sequence) {
		return sequence == null || sequence.isEmpty();
	}
	
	public static boolean isNotBlank(final String sequence) {
		return !isBlank(sequence);
	}
}
