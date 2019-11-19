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

import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
	
	/**
	 * Remove these sequences: <code> 
	 * <br/> '123' 
	 * <br/> 'abc' <br/> 'ABC'
	 * <br/> 'aaa' <br/> 'AAA'
	 * </code>
	 *
	 * @param value
	 * @return
	 */
	public static final String stripSeqs(final String value) {
		final char[] chars = value.toCharArray();
		return streamToStrepSeq(value).mapToObj(index -> String.valueOf((char) chars[index]))
				.collect(Collectors.joining());
	}
	
	/**
	 * Remove these sequences: <code> 
	 * <br/> '123' 
	 * <br/> 'abc' <br/> 'ABC' <br/> 'AbCd' 
	 * <br/> 'aaa' <br/> 'AAA' <br/> 'AaAa'
	 * </code>
	 *
	 * @param value
	 * @return
	 */
	public static final String stripSeqsIgnoreCase(final String value) {
		final char[] chars = value.toCharArray();
		return streamToStrepSeq(value.toLowerCase()).mapToObj(index -> String.valueOf((char) chars[index]))
				.collect(Collectors.joining());
	}
	
	protected static final IntStream streamToStrepSeq(final String value) {
		final char[] chars = value.toCharArray();
		return IntStream.range(0, chars.length).filter(index -> {
			
			final int last = index > 0 ? (int) chars[index - 1] : -1;
			final int curr = chars[index];
			final int next = (index + 1) < chars.length ? (int) chars[index + 1] : -1;
			
			final boolean lastChar = Character.isLetterOrDigit((char) last);
			final boolean currChar = Character.isLetterOrDigit((char) curr);
			final boolean nextChar = Character.isLetterOrDigit((char) next);
			
			final boolean lastIsSeq = currChar && lastChar && (curr == (last + 1) || curr == last);
			final boolean nextIsSeq = currChar && nextChar && (curr == (next - 1) || curr == next);
			
			return !lastIsSeq && !nextIsSeq;
			
		});
	}
}
