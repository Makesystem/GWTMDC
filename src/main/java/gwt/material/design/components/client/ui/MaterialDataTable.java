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
import gwt.material.design.components.client.constants.Typography;
import gwt.material.design.components.client.ui.html.Div;
import gwt.material.design.components.client.ui.html.Table;
import gwt.material.design.components.client.ui.html.Tbody;
import gwt.material.design.components.client.ui.html.Tfoot;
import gwt.material.design.components.client.ui.html.Th;
import gwt.material.design.components.client.ui.html.Thead;
import gwt.material.design.components.client.ui.html.Tr;
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
	
	protected final Thead thead = new Thead();
	protected final Tr thead_tr = new Tr();
	
	protected final Tbody tbody = new Tbody();
	
	protected final Tfoot tfoot = new Tfoot();
	protected final Tr tfoot_tr = new Tr();
	
	protected final JsOptions options = options();
	private PagingType pagingType = PagingType.SIMPLE;
	
	public MaterialDataTable() {
		super(CssName.MDC_DATA_TABLE);
	}
	
	@Override
	protected native JavaScriptObject jsInit(final Element element)/*-{
		return element;
	}-*/;
	
	public void layout() {
		
		options.pagingType = pagingType.getCssName();
		
		layout(table.getElement(), options);
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
		options.language.infoEmpty = "Showing 0 to 0 of 0 entries";
		options.language.infoFiltered = "(filtered from _MAX_ total entries)";
		options.language.infoPostFix = "";
		options.language.decimal = "";
		options.language.thousands = ".";
		options.language.lengthMenu = "Rows per page:  _MENU_";
		options.language.loadingRecords = "Loading...";
		options.language.processing = "Processing...";
		options.language.search = "Search:";
		options.language.searchPlaceholder = "";
		options.language.url = "";
		options.language.zeroRecords = "No matching records found";
		
		return options;
	}
	
	protected native Element layout(final Element element, final JsOptions opetions)/*-{
		$wnd.jQuery(element).DataTable(opetions);		
		
		var MATERIAL_ICONS = @gwt.material.design.components.client.constants.CssName::MATERIAL_ICONS;
		
		var MDC_DATA_TABLE__SELECT = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__SELECT;
		var MDC_TYPOGRAPHY__BODY_2 = @gwt.material.design.components.client.constants.CssName::MDC_TYPOGRAPHY__BODY_2;
		
		var MDC_DATA_TABLE__NUMBERS = @gwt.material.design.components.client.constants.CssName::MDC_DATA_TABLE__NUMBERS;		
				
		var parent = $wnd.jQuery(element).parent();		
		
		var select = parent.find("select");
		select.addClass(MDC_DATA_TABLE__SELECT);
		select.addClass(MDC_TYPOGRAPHY__BODY_2);
		
		var select = parent.find(".paging_simple_numbers").find("span").addClass(MDC_DATA_TABLE__NUMBERS);
		
		return parent;
		
	}-*/;
	
	@Override
	protected void onInitialize() {
		
		thead.add(thead_tr);
		tfoot.add(tfoot_tr);
		
		table.add(thead);
		table.add(tbody);
		table.add(tfoot);
		
		add(table);
		
		super.onInitialize();
	}
	
	public void setHeader(final String... data) {
		thead_tr.clear();
		Arrays.stream(data).forEach(header -> {
			final Th th = new Th(Typography.BODY_2.getCssName());
			th.getElement().setInnerHTML(header);
			thead_tr.add(th);
		});
	}
	
	public void addData(final String... data) {
		final Tr tr = new Tr();
		Arrays.stream(data).forEach(header -> {
			final Th th = new Th(Typography.BODY_2.getCssName());
			th.getElement().setInnerHTML(header);
			tr.add(th);
		});
		tbody.add(tr);
	}
	
	public void setFooter(final String... data) {
		tfoot_tr.clear();
		Arrays.stream(data).forEach(header -> {
			final Th th = new Th(Typography.BODY_2.getCssName());
			th.getElement().setInnerHTML(header);
			tfoot_tr.add(th);
		});
	}
}
