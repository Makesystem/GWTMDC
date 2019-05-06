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
import gwt.material.design.components.client.lang.MdcRange;
import gwt.material.design.components.client.ui.misc.datePicker.AbstractDatePicker;
import gwt.material.design.components.client.ui.misc.datePicker.headers.RangeDateHeader;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialRangeDatePicker extends AbstractDatePicker<MdcRange<MdcDate>, RangeDateHeader> {

	public MaterialRangeDatePicker() {
		super(DatePickerType.RANGE);
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		header.addStartDateClickHandler(event -> onStartDayClick());
		header.addEndDateClickHandler(event -> onEndDayClick());
	}

	@Override
	protected RangeDateHeader initializeHeader() {
		return new RangeDateHeader();
	}

	@Override
	protected void onDaysSelection(final Collection<MdcDate> selection) {
		final MdcDate[] dates = selection.stream().toArray(MdcDate[]::new);
		final MdcDate start = dates.length > 0 ? dates[0] : null;
		final MdcDate end = dates.length >= 2 ? dates[dates.length - 1] : null;
		final MdcRange<MdcDate> range = new MdcRange<>(start, end);
		header.setValue(range);
	}

	protected void onStartDayClick() {
		final MdcRange<MdcDate> range = header.getValue();
		if (range != null && range.getStart() != null)
			goTo(range.getStart().getMdcMonth());
	}

	protected void onEndDayClick() {
		final MdcRange<MdcDate> range = header.getValue();
		if (range != null && range.getEnd() != null)
			goTo(range.getEnd().getMdcMonth());
	}

}
