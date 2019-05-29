package gwt.material.design.components.client.base.mixin.base;

import com.google.gwt.dom.client.Style.HasCssName;

import gwt.material.design.components.client.base.widget.MaterialUIObject;

public abstract class CssAttributeMixin<UIO extends MaterialUIObject> extends AbstractMixin<UIO>{

	private final String cssAttribute;
	
	protected CssAttributeMixin(UIO uiObject, final String cssAttribute) {
		super(uiObject);
		this.cssAttribute = cssAttribute;
	}
	
	protected void setPropertyValue(final HasCssName value) {
		uiObject.setCssProperty(cssAttribute, value);
	}

	protected void setPropertyValue(final String value) {
		uiObject.setCssProperty(cssAttribute, value);
	}
}
