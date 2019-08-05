package gwt.material.design.components.client.ui.misc.dataTable;

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
	public String defaultContent;
		
	@JsProperty
	public boolean visible;

	@JsProperty
	public boolean orderable;
	
	@JsProperty
	public boolean searchable;
}
