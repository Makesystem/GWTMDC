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
package gwt.material.design.components.client.ui.misc.datePicker.headers;

import java.util.Collection;

import com.google.gwt.event.shared.HandlerRegistration;

import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.events.SelectionEvent;
import gwt.material.design.components.client.events.SelectionEvent.HasSelectionHandlers;
import gwt.material.design.components.client.events.SelectionEvent.SelectionHandler;
import gwt.material.design.components.client.lang.MdcDate;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MultiDateHeader extends AbstractHeader<Collection<MdcDate>> implements HasSelectionHandlers<MdcDate> {

	public MultiDateHeader() {
		super(CssName.MDC_DATEPICKER__HEADER__MULTI_DATE);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		drawValue(getValue());
	}

	@Override
	protected void drawValue(final Collection<MdcDate> range) {
		clear();
		if (range != null)
			range.stream().sorted((a, b) -> Integer.compare(a.getTimestamp(), b.getTimestamp()))
					.forEach(date -> {
						final SingleDateHeader widget = new SingleDateHeader(date);
						widget.setCompact(true);
						widget.addClickHandler(event -> fireSelectEvent(date));
						add(widget);
					});

	}

	protected void fireSelectEvent(final MdcDate value) {
		SelectionEvent.fire(this, value);
	}

	@Override
	public HandlerRegistration addSelectionHandler(final SelectionHandler<MdcDate> handler) {
		return addHandler(handler, SelectionEvent.getType());
	}
}
