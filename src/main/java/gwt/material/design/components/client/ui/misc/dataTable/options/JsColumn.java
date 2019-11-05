package gwt.material.design.components.client.ui.misc.dataTable.options;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsColumn {

	@JsProperty
	public String title;
	
	@JsProperty
	public String width;
	
	@JsProperty
	public String minWidth;
	
	@JsProperty
	public String defaultContent;
		
	@JsProperty
	public boolean visible;

	@JsProperty
	public boolean orderable;
	
	@JsProperty
	public boolean searchable;
	
	@JsProperty
	public int[] orderData;
	
	@JsProperty
	public String type;
	
	@JsProperty
	public JavaScriptObject render;

	@JsProperty
	public String className;
}
