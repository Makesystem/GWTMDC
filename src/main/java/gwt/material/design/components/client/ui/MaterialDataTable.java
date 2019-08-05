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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.PagingType;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Table;
import gwt.material.design.components.client.ui.misc.dataTable.JsColumn;
import gwt.material.design.components.client.ui.misc.dataTable.JsFixedColumns;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguage;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguageAria;
import gwt.material.design.components.client.ui.misc.dataTable.JsLanguagePaginate;
import gwt.material.design.components.client.ui.misc.dataTable.JsOptions;

/**
 * @see https://datatables.net/reference/option/pagingType
 * 
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialDataTable extends Div {
	
	protected final Table table = new Table(CssName.MDC_DATA_TABLE__TABLE, "display");
		
	protected final JsOptions options = options();
	private PagingType pagingType = PagingType.SIMPLE;
	
	public MaterialDataTable() {
		super(CssName.MDC_DATA_TABLE, CssName.MDC_TYPOGRAPHY__BODY_2);
	}
	
	@Override
	protected JavaScriptObject jsInit(final Element element){
		options.pagingType = pagingType.getCssName();		
		return draw(table.getElement(), options);
	}
	
	public void draw() {
		jsInit(getElement());
	}
	
	
	JsOptions options() {
		
		final JsOptions options = new JsOptions();
		
		options.responsive = true;
		options.paging = true;
		options.pagingType = PagingType.SIMPLE.getCssName();
		options.lengthChange = true;
		
		final int[] lengthMenu = { 10, 25, 50, 100 };
		options.lengthMenu = lengthMenu;
		
		options.language = new JsLanguage();
		options.language.aria = new JsLanguageAria();
		options.language.aria.sortAscending = ": activate to sort column ascending";
		options.language.aria.sortDescending = ": activate to sort column descending";
		options.language.paginate = new JsLanguagePaginate();
		options.language.paginate.first = "First";
		options.language.paginate.last = "Last";
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
				
		return options;
	}
	
	protected native JavaScriptObject draw(final Element element, final JsOptions options)/*-{
	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable) {
			dataTable.destroy();			
			$wnd.jQuery(element).empty(); // empty in case the columns change
		}
		
		var MDC_DATA_TABLE__HEADER = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__HEADER;
		var MDC_DATA_TABLE__FOOTER = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__FOOTER;
	
		options.dom = '<"' + MDC_DATA_TABLE__HEADER + '"rf>t<"' + MDC_DATA_TABLE__FOOTER + '"lip>';
		options.scroller = true;	
		options.autoWidth = false;
	
		return $wnd.jQuery(element).DataTable(options);	
			
	}-*/;
	
	@Override
	protected void onInitialize() {		
		add(table);		
		super.onInitialize();
	}
	
	public void setColumns(final Column... columns) {
		options.columns = Arrays.stream(columns).map(Column::toNative).toArray(JsColumn[]::new);
		jsInit();
	}
	
	public native void addData(final String... data)/*-{	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable)
			dataTable.row.add(data).draw().node();
	}-*/;
	
	public native void adjust()/*-{	
		var dataTable = this.@gwt.material.design.components.client.base.widget.MaterialWidget::jsElement;
		if(dataTable)
			dataTable.columns.adjust().draw();
	}-*/;
	
	public static class Column {
		
		private final JsColumn jsColumn;
		
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
			jsColumn = new JsColumn();
			jsColumn.title = title;
			jsColumn.width = width;
			jsColumn.defaultContent = defaultContent;
			jsColumn.visible = visible;
			jsColumn.orderable = orderable;
			jsColumn.searchable = searchable;
		}
		
		protected JsColumn toNative() {
			return jsColumn;
		}
		
	}
}
