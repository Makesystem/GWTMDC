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
package gwt.material.design.components.client.ui;

import java.util.Collection;

import gwt.material.design.components.client.constants.DatePickerType;
import gwt.material.design.components.client.lang.MdcDate;
import gwt.material.design.components.client.ui.misc.datePicker.AbstractDatePicker;
import gwt.material.design.components.client.ui.misc.datePicker.headers.MultiDateHeader;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialMultiDatePicker extends AbstractDatePicker<Collection<MdcDate>, MultiDateHeader> {

	public MaterialMultiDatePicker() {
		super(DatePickerType.MULTIPLE);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		header.addSelectionHandler(event -> goTo(event.getValue().getMdcMonth()));
	}
	
	@Override
	protected MultiDateHeader initializeHeader() {
		return new MultiDateHeader();
	}

	@Override
	protected void onDaysSelection(final Collection<MdcDate> selection) {
		header.setValue(selection);
	}

}
