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
package gwt.material.design.components.client.ui.misc.datePicker.inlines;

import gwt.material.design.components.client.lang.MdcYear;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class YearRange extends AbstractInlineSelector<MdcYear> {

	public YearRange() {
		super();
		setSelection(new MdcYear());
	}
	
	@Override
	protected String toString(final MdcYear value) {
		return (value.getYear() - 12) + " ~ " + (value.getYear() + 12);
	}

	@Override
	public void previous() {
		setSelection(new MdcYear(getSelection().getYear() - 25));
	}

	@Override
	public void next() {
		setSelection(new MdcYear(getSelection().getYear() + 25));
	}
}
