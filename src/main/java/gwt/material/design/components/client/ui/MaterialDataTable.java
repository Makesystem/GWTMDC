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

import gwt.material.design.components.client.constants.ColumnType;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.PagingType;
import gwt.material.design.components.client.constants.RenderType;
import gwt.material.design.components.client.constants.TextAlign;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Table;
import gwt.material.design.components.client.ui.misc.dataTable.JsColumn;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguage;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguageAria;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguagePaginate;
import gwt.material.design.components.client.ui.misc.dataTable.JsOptions;

/**
 * @see https://datatables.net/reference/option/pagingType
 * 
 * <T> Row type
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialDataTable<T> extends Div {
	
	protected final Table table = new Table(CssName.MDC_DATA_TABLE__TABLE, "display");
		
	protected final JsOptions options = options();
	private PagingType pagingType = PagingType.SIMPLE;
	
	public MaterialDataTable() {
		super(CssName.MDC_DATA_TABLE, CssName.MDC_TYPOGRAPHY__BODY_2);
	}
	
	@Override
	protected JavaScriptObject jsInit(final Element element){
		return draw(table.getElement(), options);
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
		options.language.aria.sortAscending = ": activate to sort column ascending";
		options.language.aria.sortDescending = ": activate to sort column descending";
		options.language.paginate = new JsLanguagePaginate();
		options.language.paginate.first = "<i>first_page</i>";
		options.language.paginate.last = "<i>last_page</i>";
		options.language.paginate.next = "<i>navigate_next</i>";
		options.language.paginate.previous = "<i>navigate_before</i>";
		options.language.emptyTable = "No data available in table";
		options.language.info = "_START_ - _END_ of _TOTAL_";
		options.language.infoEmpty = "0 of ";
		options.language.infoFiltered = "_MAX_";
		options.language.infoPostFix = "";
		options.language.decimal = "";
		options.language.thousands = ".";
		options.language.lengthMenu = "Rows per page:  _MENU_";
		options.language.loadingRecords = "Loading...";
		options.language.processing = "Processing...";
		options.language.search = "";
		options.language.searchPlaceholder = "Search";
		options.language.url = "";
		options.language.zeroRecords = "No matching records found";		
/*
		// /////////////////////////
		// Fixed columns test
		// /////////////////////////
		options.fixedColumns = new JsFixedColumns();
		options.fixedColumns.leftColumns = 1;
		options.fixedColumns.rightColumns = 1;
		
		// /////////////////////////
		// Defs columns test
		// /////////////////////////		
		final JsColumn def = new JsColumn();
		def.defaultContent = "teste";
		
		final JsColumn def_width = new JsColumn();
		def_width.width = "96px";
		def_width.orderable = false;
		
		options.columns = new JsColumn[] {def, def_width}; 
*/				
		return options;
	}

	public void draw() {
		jsInit();
	}
	
	protected native JavaScriptObject draw(final Element element, final JsOptions options)/*-{
	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable) {
			console.log('teste');
			dataTable.destroy();			
			$wnd.jQuery(element).empty(); // empty in case the columns change
		}
		
		if(!options.columns)
			return null;
		
		var MDC_DATA_TABLE__HEADER = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__HEADER;
		var MDC_DATA_TABLE__FOOTER = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__FOOTER;
	
		options.dom = '<"' + MDC_DATA_TABLE__HEADER + '"rf>t<"' + MDC_DATA_TABLE__FOOTER + '"lip>';
		options.autoWidth = true;
		options.scrollX = true;
	
		return $wnd.jQuery(element).DataTable(options);	
			
	}-*/;
	
	@Override
	protected void onInitialize() {		
		add(table);		
		super.onInitialize();
	}
	
	@SuppressWarnings("unchecked")
	public void setColumns(final Column<T>... columns) {
		final AtomicInteger index = new AtomicInteger(0);
		options.columns = Arrays.stream(columns).map(column -> column.setPosition(index.getAndIncrement()).toNative()).toArray(JsColumn[]::new);
		draw();
	}
	
	public void setRows(@SuppressWarnings("unchecked") final T... data) {
		options.data = data;
		draw();
	}
	
	public native void addData(@SuppressWarnings("unchecked") final T... data)/*-{	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable)
			dataTable.row.add(data).draw().node();
	}-*/;
	
	public native void adjust()/*-{	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable)
			dataTable.columns.adjust().draw();
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
			jsColumn.className = (textAlign == null ? "" : textAlign.getCssName()) + " mdc-truncate";
					
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
