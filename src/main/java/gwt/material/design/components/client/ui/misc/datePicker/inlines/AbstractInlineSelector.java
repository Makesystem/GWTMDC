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

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;

import gwt.material.design.components.client.base.interfaces.HasNext;
import gwt.material.design.components.client.base.interfaces.HasPrevious;
import gwt.material.design.components.client.base.interfaces.HasSelection;
import gwt.material.design.components.client.base.mixin.HasSelectionMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.IconType;
import gwt.material.design.components.client.events.SelectionEvent.HasSelectionHandlers;
import gwt.material.design.components.client.events.SelectionEvent.SelectionHandler;
import gwt.material.design.components.client.ui.MaterialIconButton;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Label;

/**
 * 
 * @author Richeli Vargas
 *
 */
public abstract class AbstractInlineSelector<V extends HasNext<V> & HasPrevious<V>> extends Div implements HasSelection<V>, HasSelectionHandlers<V> {

	protected final MaterialIconButton previousMonthAct = new MaterialIconButton(IconType.CHEVRON_LEFT);
	protected final Label label = new Label(CssName.MDC_DATEPICKER__INLINE_SELECTOR__LABEL, CssName.MDC_TYPOGRAPHY__BODY_2);
	protected final MaterialIconButton nextMonthAct = new MaterialIconButton(IconType.CHEVRON_RIGHT);
	
	protected final HasSelectionMixin<AbstractInlineSelector<V>, V> selectionMixin = new HasSelectionMixin<>(this);
	
	public AbstractInlineSelector() {
		super(CssName.MDC_DATEPICKER__INLINE_SELECTOR);
	}
	
	protected abstract String toString(final V value);

	@Override
	protected void onInitialize() {
		super.onInitialize();

		previousMonthAct.addClickHandler(event -> previous());
		nextMonthAct.addClickHandler(event -> next());

		add(previousMonthAct);
		add(label);
		add(nextMonthAct);
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		drawSelection(getSelection());
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return label.addClickHandler(handler);
	}

	protected void drawSelection(final V value) {
		if (initialized)
			label.setText(toString(value));
	}

	@Override
	public HandlerRegistration addSelectionHandler(SelectionHandler<V> handler) {
		return selectionMixin.addSelectionHandler(handler);
	}

	@Override
	public void setSelection(V selected) {
		drawSelection(selected);
		selectionMixin.setSelection(selected);
	}

	@Override
	public void setSelection(V selected, boolean fireEvents) {
		drawSelection(selected);
		selectionMixin.setSelection(selected, fireEvents);
	}

	@Override
	public V getSelection() {
		return selectionMixin.getSelection();
	}

	public void previous() {
		setSelection(getSelection().previous());
	}

	public void next() {
		setSelection(getSelection().next());
	}
}
