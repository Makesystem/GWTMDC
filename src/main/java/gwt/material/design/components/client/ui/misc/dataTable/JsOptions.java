package gwt.material.design.components.client.ui.misc.dataTable;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsOptions {

	
	@JsProperty
	public String pagingType;
	
	@JsProperty
	public boolean responsive;
	
	@JsProperty
	public boolean paging;
	
	@JsProperty
	public boolean lengthChange;
	
	@JsProperty
	public int[] lengthMenu;
	
	@JsProperty
	public JsLanguage language;
}
