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

import com.google.gwt.core.client.JavaScriptObject;

import gwt.material.design.components.client.constants.ColumnType;
import gwt.material.design.components.client.constants.RenderType;
import gwt.material.design.components.client.constants.TextAlign;
import gwt.material.design.components.client.ui.misc.dataTable.JsColumn;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialDataTableColumn<D> {
	
	public static interface Render<D> {		
		public String onRender(
				final String data, 
				final RenderType type, 
				final D rowData, 
				final Integer rowIndex,
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
		jsColumn.className = (textAlign == null ? className : textAlign.getCssName() + " " + (className == null ? "" : className));

		return jsColumn;
	}
	
	native JavaScriptObject toFunction(final Render<D> render)/*-{	
		if(!render)
			return null;
	
		var valueOf = @gwt.material.design.components.client.constants.RenderType::fromStyleName(Ljava/lang/String;);
		var callRender = render.@gwt.material.design.components.client.ui.MaterialDataTableColumn.Render::onRender(
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
