package gwt.material.design.components.client.ui.misc.dataTable;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsColumnDefs {

	
	@JsProperty
	public String width;
	
	@JsProperty
	public int[] targets;
	
	@JsProperty
	public boolean visible;
	
	@JsProperty
	public boolean searchable;
}
