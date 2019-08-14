package gwt.material.design.components.client.constants;

import gwt.material.design.components.client.utils.helper.EnumHelper;

public enum OrderBy implements CssType {
	
	NONE("none"), ASC("asc"), DESC("desc");
	
	private final String cssClass;
	
	OrderBy(final String cssClass) {
		this.cssClass = cssClass;
	}
	
	@Override
	public String getCssName() {
		return cssClass;
	}
	
	public static OrderBy fromStyleName(final String styleName) {
		return EnumHelper.fromStyleName(styleName, OrderBy.class, NONE);
	}
}
