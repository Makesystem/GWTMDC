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

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.events.SelectionEvent;
import gwt.material.design.components.client.events.SelectionEvent.HasSelectionHandlers;
import gwt.material.design.components.client.events.SelectionEvent.SelectionHandler;
import gwt.material.design.components.client.events.UnselectionEvent;
import gwt.material.design.components.client.events.UnselectionEvent.HasUnselectionHandlers;
import gwt.material.design.components.client.events.UnselectionEvent.UnselectionHandler;
import gwt.material.design.components.client.resources.message.IMessages;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Table;
import gwt.material.design.components.client.ui.misc.dataTable.FilterInput;
import gwt.material.design.components.client.ui.options.DataTableOptions;

/**
 * @see https://datatables.net/reference/option/pagingType
 * 
 *      <T> Row type
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialDataTable<T> extends Div
		implements HasSelectionHandlers<Collection<T>>, HasUnselectionHandlers<Collection<T>> {
	
	protected final Div header = new Div(CssName.MDC_DATA_TABLE__HEADER);
	protected final FilterInput filterInput = new FilterInput();
	protected final Table table = new Table(CssName.MDC_DATA_TABLE__TABLE, "display");
	
	protected DataTableOptions options = null;
	
	private final Collection<T> data = new LinkedList<>();
	private final Collection<T> selectedData = new LinkedList<>();
	
	private boolean showFilter = true;
	
	public MaterialDataTable() {
		super(CssName.MDC_DATA_TABLE, CssName.MDC_TYPOGRAPHY__BODY_2);
	}
	
	@Override
	protected JavaScriptObject jsInit(final Element element) {
		this.destroy();
		this.build();
		return jsElement;
	}
	
	@Override
	protected void onInitialize() {
		
		filterInput.addTypingHandler(event -> filter(event.getText()));
		filterInput.setPlaceholder(IMessages.INSTANCE.mdc_datatable__search());
		
		if (showFilter)
			header.insert(filterInput, 0);
		
		add(header);
		add(table);
		super.onInitialize();
	}
	
	@UiChild(tagname = "button")
	public void addButton(final Widget child) {
		header.add(child);
	}
	
	/* *************
	 * Events
	 * ************* */
	
	protected final void fireSelectionEvent(final int[] indexes) {
		final Collection<T> items = getData(indexes);
		select(items);
		SelectionEvent.fire(this, items);
	}
	
	@Override
	public HandlerRegistration addSelectionHandler(final SelectionHandler<Collection<T>> handler) {
		return addHandler(handler, SelectionEvent.getType());
	}
	
	protected final void fireUnselectionEvent(final int[] indexes) {
		final Collection<T> items = getData(indexes);
		unselect(items);
		UnselectionEvent.fire(this, items);
	}
	
	@Override
	public HandlerRegistration addUnselectionHandler(final UnselectionHandler<Collection<T>> handler) {
		return addHandler(handler, UnselectionEvent.getType());
	}
	
	/* *************
	 * Select
	 * ************* */
	
	protected void select(final Collection<T> items) {
		select(items, true);
	}
	
	protected void select(final Collection<T> items, final boolean fireEvent) {
		selectedData.addAll(items);
	}
	
	protected void unselect(final Collection<T> items) {
		unselect(items, true);
	}
	
	protected void unselect(final Collection<T> items, final boolean fireEvent) {
		selectedData.removeAll(items);
	}
	
	public boolean isSelected(final T item) {
		return selectedData.contains(item);
	}
	
	/* *************
	 * Data
	 * ************* */
	
	public void clear() {
		this.data.clear();
		this.selectedData.clear();
		this.rebuild();
	}
	
	public void setData(@SuppressWarnings("unchecked") final T... data) {
		this.setData(Arrays.asList(data));
	}
	
	public void setData(final Collection<T> data) {
		this.clear();
		this.data.addAll(data);
		this.rebuild();
	}
	
	public void addData(@SuppressWarnings("unchecked") final T... data) {
		this.addData(Arrays.asList(data));
	}
	
	public native void addData(final Collection<T> data)/*-{

        var _data = this.@gwt.material.design.components.client.ui.MaterialDataTable::data;
        _data.@java.util.Collection::addAll(Ljava/util/Collection;)(data);

        var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (dataTable) {
	        dataTable.rows.add(data);
	        dataTable.draw();

        }
	}-*/;
	
	public Collection<T> getData(final int... indexes) {
		if (indexes == null || indexes.length == 0 || this.data.isEmpty())
			return this.data;
		else {
			final LinkedList<T> linkedData = (LinkedList<T>) this.data;
			final Collection<T> values = new LinkedList<>();
			final int dataLength = linkedData.size();
			for (int index = 0; index < indexes.length; index++) {
				final int valueIndex = indexes[index];
				if (valueIndex < dataLength)
					values.add(linkedData.get(valueIndex));
			}
			return values;
		}
	}
	
	/* *************
	 * Filter
	 * ************* */
	
	public void filter(final String text) {
		filter(text, false, true, false);
	}
	
	public void filter(final String text, final boolean regex) {
		filter(text, regex, true, false);
	}
	
	public void filter(final String text, final boolean regex, final boolean caseSensitive) {
		filter(text, regex, true, !caseSensitive);
	}
	
	protected native void filter(final String text, final boolean regex, final boolean smart,
			final boolean caseSensitive) /*-{
        var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (dataTable)
	        dataTable.search(text, regex, smart, !caseSensitive).draw();
	}-*/;
	
	public void showFilter(final boolean showFilter) {
		this.showFilter = showFilter;
		if (initialized)
			if (showFilter)
				if (filterInput.getParent() == null)
					header.add(filterInput);
				else if (filterInput.getParent() != null)
					filterInput.removeFromParent();
	}
	
	/* *************
	 * Options
	 * ************* */
	
	public void setOptions(final DataTableOptions options) {
		this.options = options;
		this.rebuild();
	}
	
	/* *************
	 * Destroy
	 * ************* */
	
	public native void destroy()/*-{
        var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (dataTable) {
	        dataTable.off('select');
	        dataTable.off('deselect');
	        dataTable.destroy();
	        
	        var table = this.@gwt.material.design.components.client.ui.MaterialDataTable::table;
        	var element = table.@gwt.material.design.components.client.base.widget.MaterialWidget::getElement()();
	        $wnd.jQuery(element).empty(); // empty in case the columns change
        }
        this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement = null;
	}-*/;
	
	/* *************
	 * Build
	 * ************* */

	public native void build()/*-{

        var _this = this;

        var options = this.@gwt.material.design.components.client.ui.MaterialDataTable::options;

        if (!options)
	        return;

        options = options.@gwt.material.design.components.client.ui.options.DataTableOptions::toNative()();

        if (!options || !options.columns)
	        return;

		var data = this.@gwt.material.design.components.client.ui.MaterialDataTable::data;
		options.data = data.@java.util.Collection::toArray()();
		
        var table = this.@gwt.material.design.components.client.ui.MaterialDataTable::table;
        var element = table.@gwt.material.design.components.client.base.widget.MaterialWidget::getElement()();

        var dataTable = $wnd.jQuery(element).DataTable(options);
        //dataTable.select();

        var fireSelectionEvent = function(e, dt, type, indexes) {
	        if (type === 'row')
		        if (indexes && indexes.length > 0)
			        _this.@gwt.material.design.components.client.ui.MaterialDataTable::fireSelectionEvent([I)(indexes);
        };

        var fireUnselectionEvent = function(e, dt, type, indexes) {
	        if (type === 'row')
		        if (indexes && indexes.length > 0)
			        _this.@gwt.material.design.components.client.ui.MaterialDataTable::fireUnselectionEvent([I)(indexes);
        };

        dataTable.on('select', fireSelectionEvent);
        dataTable.on('deselect', fireUnselectionEvent);

        this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement = dataTable;

	}-*/;
	
	
	/* *************
	 * Rebuild
	 * ************* */
	
	public void rebuild() {
		if (initialized) {
			destroy();
			build();
		}
	}
	
	/* *************
	 * Draw
	 * ************* */
	
	public native void draw()/*-{
        var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (dataTable)
	        dataTable.draw();
	}-*/;
	
	public native void drawHold()/*-{
        var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (dataTable)
	        dataTable.draw('full-hold');
	}-*/;
	
	public native void drawPage()/*-{
        var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (dataTable)
	        dataTable.draw('page');
	}-*/;
	
	public native void adjust()/*-{
        var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
        if (dataTable)
	        dataTable.columns.adjust().draw();
	}-*/;
		
}
