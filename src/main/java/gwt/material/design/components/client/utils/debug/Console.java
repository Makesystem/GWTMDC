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
package gwt.material.design.components.client.utils.debug;

/**
 * 
 * @author Richeli Vargas
 *
 */
public final class Console {

	public static interface ConsoleWriter {
		public void write(final Object value);
	}

	static ConsoleWriter writer = Console::write;

	static native void write(Object text) /*-{
		console.log(text);
	}-*/;

	public static void setWriter(final ConsoleWriter writer) {
		Console.writer = writer;
		if (Console.writer == null)
			Console.writer = Console::write;
	}

	public static void log(Object value) {
		Console.writer.write(value);
	}
}
