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
package gwt.material.design.components.client.ui.options;

import java.util.Arrays;

import com.google.gwt.core.client.JavaScriptObject;

import gwt.material.design.components.client.constants.ColumnType;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.CssType;
import gwt.material.design.components.client.constants.OrderBy;
import gwt.material.design.components.client.constants.PagingType;
import gwt.material.design.components.client.constants.RenderType;
import gwt.material.design.components.client.constants.TextAlign;
import gwt.material.design.components.client.resources.message.IMessages;
import gwt.material.design.components.client.ui.misc.dataTable.options.JsColumn;
import gwt.material.design.components.client.ui.misc.dataTable.options.JsLanguage;
import gwt.material.design.components.client.ui.misc.dataTable.options.JsLanguageAria;
import gwt.material.design.components.client.ui.misc.dataTable.options.JsLanguagePaginate;
import gwt.material.design.components.client.ui.misc.dataTable.options.JsLanguageSelect;
import gwt.material.design.components.client.ui.misc.dataTable.options.JsOptions;
import gwt.material.design.components.client.ui.misc.dataTable.options.JsSelect;
import gwt.material.design.components.client.utils.helper.EnumHelper;
import gwt.material.design.components.client.utils.helper.ObjectHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class DataTableOptions extends AbstractOptions<JsOptions> {
	
	private Column<?>[] columns;
	private PagingType pagingType = PagingType.FULL;
	private boolean paging = true;
	private boolean lengthChange = true;
	private int[] lengthMenu = { 10, 25, 50, 100 };
	private Order[] order;
	// /////////////////////////////////////////////////////////////////
	// Select settings
	// /////////////////////////////////////////////////////////////////
	private boolean select = true;
	private SelectType selectType = SelectType.OS;
	private boolean selectInfo = false;
	private boolean selectCheckbox = false;
	
	public void setColumns(final Column<?>... columns) {
		this.columns = columns;
	}
	
	public void setPagingType(final PagingType pagingType) {
		this.pagingType = pagingType;
	}
	
	public void setPaging(final boolean paging) {
		this.paging = paging;
	}
	
	public void setLengthChange(final boolean lengthChange) {
		this.lengthChange = lengthChange;
	}
	
	public void setLengthMenu(final int... lengthMenu) {
		this.lengthMenu = lengthMenu;
	}
	
	public void setOrder(final Order... order) {
		this.order = order;
	}
	
	public void setSelect(final boolean select) {
		this.select = select;
	}
	
	public void setSelectType(final SelectType selectType) {
		this.selectType = selectType;
	}
	
	public void setSelectInfo(final boolean selectInfo) {
		this.selectInfo = selectInfo;
	}

	public void setSelectCheckbox(boolean selectCheckbox) {
		this.selectCheckbox = selectCheckbox;
	}

	@Override
	public JsOptions toNative() {
		
		final JsOptions options = new JsOptions();
		
		options.dom = "<\"" + CssName.MDC_DATA_TABLE__HEADER + "\"r>t<\"" + CssName.MDC_DATA_TABLE__FOOTER + "\"lip>";
		options.autoWidth = true;
		options.scrollX = true;
		
		if (columns != null)
			options.columns = Arrays.stream(columns).map(column -> column.toNative()).toArray(JsColumn[]::new);
		
		if (order != null)
			options.order = Arrays.stream(order).map(_order -> _order.toNative()).toArray(JavaScriptObject[]::new);
		
		options.responsive = true;
		options.paging = paging;
		options.pagingType = (pagingType == null ? PagingType.FULL : pagingType).getCssName();
		options.lengthChange = lengthChange;
		
		if (lengthChange)
			options.lengthMenu = lengthMenu;
		
		if (select) {
			
			options.select = new JsSelect();
			options.select.items = "row";
			options.select.className = "selected";
			options.select.style = (selectType == null ? SelectType.OS : selectType).getCssName();
			options.select.info = selectInfo;
			
			if (selectCheckbox) {
				options.select.selector = "td:first-child";
				
				options.columns = ObjectHelper.concat(new JsColumn[] { new CheckboxColumn().toNative() },
						options.columns);
				
				if (order == null)
					options.order = new JavaScriptObject[] {new Order(1, OrderBy.ASC).toNative()};
					
			}
			
		}
		
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
		options.language.info = IMessages.INSTANCE.mdc_datatable__info("_START_", "_END_", "_TOTAL_");
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
		options.language.select.rows = selectLanguage(IMessages.INSTANCE.mdc_datatable__select__rows__zero_recoreds(),
				IMessages.INSTANCE.mdc_datatable__select__rows__one_recoreds(),
				IMessages.INSTANCE.mdc_datatable__select__rows__defauld());
		options.language.select.columns = selectLanguage(
				IMessages.INSTANCE.mdc_datatable__select__columns__zero_recoreds(),
				IMessages.INSTANCE.mdc_datatable__select__columns__one_recoreds(),
				IMessages.INSTANCE.mdc_datatable__select__columns__defauld());
		options.language.select.cells = selectLanguage(IMessages.INSTANCE.mdc_datatable__select__cells__zero_recoreds(),
				IMessages.INSTANCE.mdc_datatable__select__cells__one_recoreds(),
				IMessages.INSTANCE.mdc_datatable__select__cells__defauld());
		
		return options;
	}
	
	native JavaScriptObject selectLanguage(final String zero, final String one, final String more)/*-{
        return {
            _ : more,
            0 : '',
            1 : one
        };
	}-*/;
	
	/**
	 * 
	 *
	 * @author Richeli Vargas
	 *
	 */
	public static enum SelectType implements CssType {
		
		/**
		 * Selection can only be performed via the API
		 */
		API("api"),
		/**
		 * Only a single item can be selected, any other selected items will be
		 * automatically deselected when a new item is selected
		 */
		SINGLE("single"),
		/**
		 * Multiple items can be selected. Selection is performed by simply clicking on
		 * the items to be selected
		 */
		MULTI("multi"),
		/**
		 * Operating System (OS) style selection. This is the most comprehensive option
		 * and provides complex behaviours such as ctrl/cmd clicking to select /
		 * deselect individual items, shift clicking to select ranges and an unmodified
		 * click to select a single item.
		 */
		OS("os"),
		/**
		 * A hybrid between the os style and multi, allowing easy multi-row selection
		 * without immediate de-selection when clicking on a row.
		 */
		MULTI_SHIFT("multi+shift");
		
		private final String cssClass;
		
		SelectType(final String cssClass) {
			this.cssClass = cssClass;
		}
		
		@Override
		public String getCssName() {
			return cssClass;
		}
		
		public static SelectType fromStyleName(final String styleName) {
			return EnumHelper.fromStyleName(styleName, SelectType.class, API);
		}
	}
	
	/**
	 * 
	 *
	 * @author Richeli Vargas
	 *
	 */
	public static class Order extends Native<JavaScriptObject> {
		
		private final int column;
		private final OrderBy orderBy;
		
		public Order(final int column, final OrderBy orderBy) {
			this.column = column;
			this.orderBy = orderBy;
		}
		
		public int getColumn() {
			return column;
		}
		
		public OrderBy getOrderBy() {
			return orderBy;
		}
		
		@Override
		protected JavaScriptObject toNative() {
			return toNative(column, (orderBy == null ? OrderBy.NONE : orderBy).getCssName());
		}
		
		native JavaScriptObject toNative(final int column, final String order)/*-{
            return [ column, order ];
		}-*/;
		
	}
	
	public static interface IsColumn<J> {
	}
	
	/**
	 * 
	 *
	 * @author Richeli Vargas
	 *
	 * @param <D>
	 */
	public static class CheckboxColumn extends Native<JsColumn> implements IsColumn<JsColumn> {
		
		private String title;
		private String width = "48px";
		private String className;
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getWidth() {
			return width;
		}
		
		public void setWidth(String width) {
			this.width = width;
		}
		
		public String getClassName() {
			return className;
		}
		
		public void setClassName(String className) {
			this.className = className;
		}
		
		@Override
		protected JsColumn toNative() {
			
			final JsColumn jsColumn = new JsColumn();
			
			jsColumn.title = title;
			jsColumn.width = width;
			jsColumn.orderable = false;
			jsColumn.searchable = false;
			jsColumn.render = render();
			jsColumn.className = CssName.MDC_DATA_TABLE__SELECT__CHECKBOX + (className == null ? "" : " " + className);
			
			return jsColumn;
		}
		
		native JavaScriptObject render()/*-{
            return function(data, type, row_data, meta) {
	            return "";
            };
		}-*/;
		
	}
	
	/**
	 * 
	 *
	 * @author Richeli Vargas
	 *
	 * @param <D>
	 */
	public static class Column<D> extends Native<JsColumn> implements IsColumn<JsColumn> {
		
		public static interface Render<D> {
			public Object onRender(final String data, final RenderType type, final D rowData, final Integer rowIndex,
					final Integer columnIndex);
		}
		
		private String title;
		private String width;
		private String defaultContent;
		private boolean visible = true;
		private boolean orderable = true;
		private boolean searchable = true;
		private int[] orderData;
		private ColumnType type;
		private TextAlign textAlign;
		private Render<D> render;
		private String className;
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getWidth() {
			return width;
		}
		
		public void setWidth(String width) {
			this.width = width;
		}
		
		public String getDefaultContent() {
			return defaultContent;
		}
		
		public void setDefaultContent(String defaultContent) {
			this.defaultContent = defaultContent;
		}
		
		public boolean isVisible() {
			return visible;
		}
		
		public void setVisible(boolean visible) {
			this.visible = visible;
		}
		
		public boolean isOrderable() {
			return orderable;
		}
		
		public void setOrderable(boolean orderable) {
			this.orderable = orderable;
		}
		
		public boolean isSearchable() {
			return searchable;
		}
		
		public void setSearchable(boolean searchable) {
			this.searchable = searchable;
		}
		
		public int[] getOrderData() {
			return orderData;
		}
		
		public void setOrderData(int... orderData) {
			this.orderData = orderData;
		}
		
		public ColumnType getType() {
			return type;
		}
		
		public void setType(ColumnType type) {
			this.type = type;
		}
		
		public TextAlign getTextAlign() {
			return textAlign;
		}
		
		public void setTextAlign(TextAlign textAlign) {
			this.textAlign = textAlign;
		}
		
		public Render<D> getRender() {
			return render;
		}
		
		public void setRender(Render<D> render) {
			this.render = render;
		}
		
		public String getClassName() {
			return className;
		}
		
		public void setClassName(String className) {
			this.className = className;
		}
		
		@Override
		protected JsColumn toNative() {
			
			final JsColumn jsColumn = new JsColumn();
			
			jsColumn.title = title;
			jsColumn.width = width;
			jsColumn.defaultContent = defaultContent;
			jsColumn.type = type == null ? null : type.getCssName();
			jsColumn.visible = visible;
			jsColumn.orderable = orderable;
			jsColumn.searchable = searchable;
			jsColumn.render = toFunction(render);
			jsColumn.className = (textAlign == null ? className
					: textAlign.getCssName() + " " + (className == null ? "" : className));
			
			return jsColumn;
		}
		
		native JavaScriptObject toFunction(final Render<D> render)/*-{	
			if(!render)
				return null;
			
			var valueOf = @gwt.material.design.components.client.constants.RenderType::fromStyleName(Ljava/lang/String;);
			var callRender = render.@gwt.material.design.components.client.ui.options.DataTableOptions.Column.Render::onRender(
				Ljava/lang/String;
				Lgwt/material/design/components/client/constants/RenderType;
				Ljava/lang/Object;
				Ljava/lang/Integer;
				Ljava/lang/Integer;);
			
			return function (data, type, row_data, meta) {
				var render_type = valueOf(type);
				return callRender(data, render_type, row_data, meta.row, meta.col);			
			};	
			
		}-*/;
	}
}
