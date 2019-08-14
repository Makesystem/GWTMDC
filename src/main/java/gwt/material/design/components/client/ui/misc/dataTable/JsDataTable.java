package gwt.material.design.components.client.ui.misc.dataTable;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsDataTable	 {

	@JsProperty
	public JsRow row;
	
	@JsMethod
	public native void adjust();
	
}
