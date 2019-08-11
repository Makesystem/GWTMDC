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
import java.util.concurrent.atomic.AtomicInteger;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.components.client.constants.ColumnType;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.PagingType;
import gwt.material.design.components.client.constants.RenderType;
import gwt.material.design.components.client.constants.TextAlign;
import gwt.material.design.components.client.events.SelectionEvent;
import gwt.material.design.components.client.events.SelectionEvent.HasSelectionHandlers;
import gwt.material.design.components.client.events.SelectionEvent.SelectionHandler;
import gwt.material.design.components.client.resources.message.IMessages;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Table;
import gwt.material.design.components.client.ui.misc.dataTable.FilterInput;
import gwt.material.design.components.client.ui.misc.dataTable.JsColumn;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguage;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguageAria;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguagePaginate;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguageSelect;
import gwt.material.design.components.client.ui.misc.dataTable.JsOptions;
import gwt.material.design.components.client.utils.helper.ObjectHelper;

/**
 * @see https://datatables.net/reference/option/pagingType
 * 
 * <T> Row type
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialDataTable<T> extends Div implements HasSelectionHandlers<T[]> {
	
	protected final Div header = new Div(CssName.MDC_DATA_TABLE__HEADER);
	protected final FilterInput filterInput = new FilterInput();
	protected final Table table = new Table(CssName.MDC_DATA_TABLE__TABLE, "display");
			
	protected final JsOptions options = options();
	private PagingType pagingType = PagingType.SIMPLE;
	
	private boolean showFilter = true;
	
	public MaterialDataTable() {
		super(CssName.MDC_DATA_TABLE, CssName.MDC_TYPOGRAPHY__BODY_2);
	}
	
	@Override
	protected JavaScriptObject jsInit(final Element element){
		return draw(table.getElement(), options);
	}
	
	protected final void fireSelectionEvent(final T[] value) {		
		SelectionEvent.fire(this, value);
	}
	
	@Override
	public HandlerRegistration addSelectionHandler(final SelectionHandler<T[]> handler) {
		return addHandler(handler, SelectionEvent.getType());
	}
	
	public void redraw() {
		jsInit();
	}
	
	protected native JavaScriptObject draw(final Element element, final JsOptions options)/*-{
	
		var _this = this;
		
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable) {
			dataTable.destroy();			
			$wnd.jQuery(element).empty(); // empty in case the columns change
		}
		
		if(!options.columns)
			return null;
		
		var MDC_DATA_TABLE__HEADER = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__HEADER;
		var MDC_DATA_TABLE__FOOTER = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__FOOTER;
	
		options.dom = '<"' + MDC_DATA_TABLE__HEADER + '"r>t<"' + MDC_DATA_TABLE__FOOTER + '"lip>';
		options.autoWidth = true;
		options.scrollX = true;
		options.select = {
			items: 'row',
            style: 'multi',
            info: true
        };
		
		dataTable = $wnd.jQuery(element).DataTable(options);
		dataTable.select();
		
		dataTable.on('select', function (e, dt, type, indexes ) {
			if ( type === 'row' ) {
        		var data = dataTable.rows(indexes).data();
        		console.log('antes: ' + data.length);
        		if(data && data.length > 0)
        			_this.@gwt.material.design.components.client.ui.MaterialDataTable::fireSelectionEvent([Ljava/lang/Object;)(data);        		
    		}
		});
		
		return dataTable;	
			
	}-*/;
	
	@Override
	protected void onInitialize() {
		
		filterInput.addTypingHandler(event -> filter(event.getText()));		
		filterInput.setPlaceholder(IMessages.INSTANCE.mdc_datatable__search());		
		
		if(showFilter)
			header.insert(filterInput, 0);
		
		add(header);
		add(table);		
		super.onInitialize();
	}
		
	@UiChild(tagname = "button")
	public void addButton(final Widget child) {
		header.add(child);
	}
	
	@SuppressWarnings("unchecked")
	public void setColumns(final Column<T>... columns) {
		final AtomicInteger index = new AtomicInteger(0);
		options.columns = Arrays.stream(columns).map(column -> column.setPosition(index.getAndIncrement()).toNative()).toArray(JsColumn[]::new);
		redraw();
	}
	
	public void clear() {
		options.data = null;
		redraw();
	}
	
	public void setData(@SuppressWarnings("unchecked") final T... data) {
		options.data = data;
		redraw();
	}
	
	public void addData(@SuppressWarnings("unchecked") final T... data) {		
		if (initialized && jsElement != null) {
			Arrays.stream(data).forEach(row -> addRow(jsElement, row));
			draw();
		}
		
		if (options.data == null)
			options.data = data;
		else
			options.data = ObjectHelper.concat(options.data, data);
	}
		
	protected native void addRow(final JavaScriptObject dataTable, final T data)/*-{	
		dataTable.row.add(data);
	}-*/;
	
	public native void draw()/*-{	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable)
			dataTable.draw();
	}-*/;
	
	public native void adjust()/*-{	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable)
			dataTable.columns.adjust().draw();
	}-*/;
	
	public void filter(final String text) {
		filter(text, false, true, false);
	}
	
	public void filter(final String text, final boolean regex) {
		filter(text, regex, true, false);
	}
	
	public void filter(final String text, final boolean regex, final boolean caseSensitive) {
		filter(text, regex, true, !caseSensitive);
	}
	
	protected native void filter(
			final String text, 
			final boolean regex, 
			final boolean smart, 
			final boolean caseSensitive) /*-{			
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable)
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
	
	
	
	JsOptions options() {
		
		final JsOptions options = new JsOptions();
		
		options.responsive = true;
		options.paging = true;
		options.pagingType = PagingType.FULL.getCssName();
		options.lengthChange = true;
		
		final int[] lengthMenu = { 10, 25, 50, 100 };
		options.lengthMenu = lengthMenu;
		
		options.language = new JsLanguage();
		options.language.aria = new JsLanguageAria();
		options.language.aria.sortAscending = IMessages.INSTANCE.mdc_datatable__aria__sort_ascending();
		options.language.aria.sortDescending = IMessages.INSTANCE.mdc_datatable__aria__sort_descending();
		options.language.paginate = new JsLanguagePaginate();
		options.language.paginate.first = "<i>first_page</i>";
		options.language.paginate.last = "<i>last_page</i>";
		options.language.paginate.next = "<i>navigate_next</i>";
		options.language.paginate.previous = "<i>navigate_before</i>";
		options.language.emptyTable = IMessages.INSTANCE.mdc_datatable__empty_table();
		options.language.info = IMessages.INSTANCE.mdc_datatable__info("_START_","_END_","_TOTAL_");
		options.language.infoEmpty = IMessages.INSTANCE.mdc_datatable__info_empty();
		options.language.infoFiltered = IMessages.INSTANCE.mdc_datatable__info_filtered();
		options.language.infoPostFix = IMessages.INSTANCE.mdc_datatable__info_post_fix();
		options.language.decimal = ",";
		options.language.thousands = ".";
		options.language.lengthMenu = IMessages.INSTANCE.mdc_datatable__length_menu("_MENU_");
		options.language.loadingRecords = IMessages.INSTANCE.mdc_datatable__loading_records();
		options.language.processing = IMessages.INSTANCE.mdc_datatable__processing();
		options.language.search = "";
		options.language.searchPlaceholder = IMessages.INSTANCE.mdc_datatable__search();
		options.language.url = "";
		options.language.zeroRecords = IMessages.INSTANCE.mdc_datatable__zero_records();		
	
		options.language.select = new JsLanguageSelect();
		options.language.select.rows = selectLanguage(
				IMessages.INSTANCE.mdc_datatable__select__rows__zero_recoreds(), 
				IMessages.INSTANCE.mdc_datatable__select__rows__one_recoreds(), 
				IMessages.INSTANCE.mdc_datatable__select__rows__defauld());
		options.language.select.columns = selectLanguage(
				IMessages.INSTANCE.mdc_datatable__select__columns__zero_recoreds(), 
				IMessages.INSTANCE.mdc_datatable__select__columns__one_recoreds(), 
				IMessages.INSTANCE.mdc_datatable__select__columns__defauld());
		options.language.select.cells = selectLanguage(
				IMessages.INSTANCE.mdc_datatable__select__cells__zero_recoreds(), 
				IMessages.INSTANCE.mdc_datatable__select__cells__one_recoreds(), 
				IMessages.INSTANCE.mdc_datatable__select__cells__defauld());
		
		return options;
	}
	
	native JavaScriptObject selectLanguage(final String zero, final String one, final String more)/*-{
		return {
			_: more,
            0: '',
            1: one            
		};
	}-*/;

	
	
	
	
	
	
	
	
	
	
	
	
	public static interface ColumnRender<D> {		
		public String render(
				final String data, 
				final RenderType type, 
				final D rowData, 
				final Integer rowIndex,
				final Integer columnIndex);		
	}
	
	public static class Column<D> {
		
		private final JsColumn jsColumn;
		private int position;
		
		public Column(
				final String title, final ColumnRender<D> render) {
			this(title, null, null, null, true, true, true, null, render);
		}
		
		public Column(
				final String title) {
			this(title, null, null, true, true, true);
		}		
		
		public Column(
				final String title, 
				final String defaultContent) {
			this(title, null, defaultContent, true, true, true);
		}
		
		public Column(
				final String title, 
				final String defaultContent, 
				final boolean visible, 
				final boolean orderable, 
				final boolean searchable) {
			this(title, null, defaultContent, visible, orderable, searchable);
		}
		
		public Column(
				final String title, 
				final String width, 
				final String defaultContent,
				final boolean visible, 
				final boolean orderable, 
				final boolean searchable) {
			this(title, width, defaultContent, null, visible, orderable, searchable, null, null);
		}
		
		public Column(
				final String title, 
				final String width, 
				final String defaultContent,
				final ColumnType type,
				final boolean visible, 
				final boolean orderable, 
				final boolean searchable, 
				final TextAlign textAlign,
				final ColumnRender<D> render) {
			
			jsColumn = new JsColumn();
			jsColumn.title = title;
			jsColumn.width = width;
			jsColumn.defaultContent = defaultContent;
			jsColumn.type = type == null ? null : type.getCssName();
			jsColumn.visible = visible;
			jsColumn.orderable = orderable;
			jsColumn.searchable = searchable;
			jsColumn.render = toFunction(render);
			jsColumn.className = (textAlign == null ? null : textAlign.getCssName());
					
		}
		
		protected JsColumn toNative() {
			return jsColumn;
		}
		
		protected int getPosition() {
			return position;
		}
		
		protected Column<D> setPosition(final int position) {
			this.position = position;
			return this;
		}
		
		protected native JavaScriptObject toFunction(final ColumnRender<D> render)/*-{
		
			if(!render)
				return null;
		
			return function (data, type, row_data, meta) {
							
				var render_type = @gwt.material.design.components.client.constants.RenderType::fromStyleName(Ljava/lang/String;)(type);
			
				return render.@gwt.material.design.components.client.ui.MaterialDataTable.ColumnRender::render(
      				Ljava/lang/String;
      				Lgwt/material/design/components/client/constants/RenderType;
      				Ljava/lang/Object;
      				Ljava/lang/Integer;
      				Ljava/lang/Integer;)
      				(data, render_type, row_data, meta.row, meta.col);
    		};
    		
		}-*/;

	}
}
