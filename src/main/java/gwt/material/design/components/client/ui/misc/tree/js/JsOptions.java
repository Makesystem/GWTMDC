package gwt.material.design.components.client.ui.misc.tree.js;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsOptions {

	/**
	 * Without selection
	 * <code>none</code> or <code>null</code>
	 * 
	 * Checkbox selection
	 * <code>filter</code>
	 * 
	 * Radio button selection
	 * <code>choice</code>
	 */
	@JsProperty
	public String selectionType;
	
	@JsProperty
	public String expandIcon;
	
	@JsProperty
	public String collapseIcon;
	
	@JsProperty
	public JavaScriptObject onSelect;
	
	@JsProperty
	public JavaScriptObject onFilter;

	@JsProperty
	public int maxToAutoExpand;
}
