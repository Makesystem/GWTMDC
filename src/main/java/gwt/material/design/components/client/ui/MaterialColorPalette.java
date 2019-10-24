package gwt.material.design.components.client.ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

import gwt.material.design.components.client.base.widget.MaterialValuedField;
import gwt.material.design.components.client.constants.Color;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.ui.html.Div;

@SuppressWarnings("unchecked")
public class MaterialColorPalette extends MaterialValuedField<Color> {
	
	protected static final String[] COLORS_NAMES;
	protected static final Color[][] COLORS;
	protected static final int[] COMPACT_RANGE = { 1, 11 };
	
	static {
		
		final Collection<String> prefixes = new LinkedHashSet<String>();
		final Map<String, Collection<Color>> colors = new LinkedHashMap<>();
		
		Arrays.stream(Color.values()).filter(color -> !color.toString().startsWith("MDC_")).forEach(color -> {
			
			final String toString = color.toString();
			final String colorKey;
			final String[] parts = toString.split("_", -1);
			final String lastPart = parts[parts.length - 1];
			
			if (parts.length == 1 || !hasNumber(lastPart)) {
				colorKey = toString;
				prefixes.add("");
			} else {
				colorKey = Arrays.stream(parts, 0, parts.length - 1).collect(Collectors.joining("_"));
				prefixes.add(lastPart);
			}
			
			colors.putIfAbsent(colorKey, new LinkedList<>());
			final Collection<Color> collection = colors.get(colorKey);
			collection.add(color);
			
		});
		
		COLORS_NAMES = prefixes.stream().toArray(String[]::new);
		COLORS = new Color[colors.size()][];
		final Collection<Color>[] values = colors.values().stream().toArray(LinkedList[]::new);
		IntStream.range(0, COLORS.length)
				.forEach(index -> COLORS[index] = values[index].stream().toArray(Color[]::new));
		
	}
	
	protected final Div headerContent = new Div();
	protected final Div bodyContent = new Div();
	
	private boolean showHeader = false;
	private boolean compact = true;
	
	public MaterialColorPalette() {
		super(CssName.MDC_COLOR_PALETTE);
	}
	
	public MaterialColorPalette(final boolean compact) {
		this();
		this.compact = compact;
	}
	
	public MaterialColorPalette(final boolean showHeader, final boolean compact) {
		this();
		this.showHeader = showHeader;
		this.compact = compact;
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(headerContent);
		add(bodyContent);
		draw();
	}
	
	@Override
	protected native JavaScriptObject jsInit(final Element element)/*-{
        return element;
	}-*/;
	
	void draw() {
		drawHeader();
		drawItems();
	}
	
	void drawHeader() {
		drawHeader(headerContent.getElement(), COLORS_NAMES, compact, showHeader);
	}
	
	native void drawHeader(final Element parent, final String[] colors, final boolean compact,
			final boolean showHeader)/*-{

        $wnd.jQuery(parent).empty();

        if (!showHeader)
	        return;

        var _this = this;
        var group_class = @gwt.material.design.components.client.constants.CssName::MDC_COLOR_PALETTE__BUTTON_GROUP;
        var item_class = @gwt.material.design.components.client.constants.CssName::MDC_COLOR_PALETTE__LABEL;

        var content = $doc.createElement('div');
        $wnd.jQuery(content).addClass(group_class);

        var append = function(color) {
	        var item = $doc.createElement('button');
	        $wnd.jQuery(item).addClass(item_class);
	        $wnd.jQuery(item).html(color);
	        $wnd.jQuery(content).append(item);
        };

        if (compact) {
	        var start = @gwt.material.design.components.client.ui.MaterialColorPalette::COMPACT_RANGE[0];
	        var end = @gwt.material.design.components.client.ui.MaterialColorPalette::COMPACT_RANGE[1];
	        colors.slice(start, end).forEach(append);
        } else
	        colors.forEach(append);

        $wnd.jQuery(parent).append(content);

	}-*/;
	
	void drawItems() {
		drawItems(bodyContent.getElement(), COLORS, compact);
		setValue(getValue(), false);
	}
	
	native void drawItems(final Element parent, final Color[][] colors, final boolean compact)/*-{

        $wnd.jQuery(parent).empty();

        var _this = this;
        var group_class = @gwt.material.design.components.client.constants.CssName::MDC_COLOR_PALETTE__BUTTON_GROUP;
        var item_class = @gwt.material.design.components.client.constants.CssName::MDC_COLOR_PALETTE__BUTTON;

        var setValue = function(color) {
	        _this.@gwt.material.design.components.client.ui.MaterialColorPalette::setValue(Lgwt/material/design/components/client/constants/Color;)(color);
        };

        var generateItem = function(color) {

	        var color_name = color.@gwt.material.design.components.client.constants.Color::toString()();
	        var color_css = color.@gwt.material.design.components.client.constants.Color::getCssName()();
	        var on_color_css;
	        var luminance = $wnd.chroma(color_css).luminance();
	        if (luminance > 0.5) {
		        on_color_css = '#000';
	        } else {
		        on_color_css = '#fff';
	        }

	        var item = $doc.createElement('button');
	        $wnd.jQuery(item).addClass(item_class);
	        $wnd.jQuery(item).addClass(color_name);
	        $wnd.jQuery(item).css('background-color', color_css);
	        $wnd.jQuery(item).css('color', on_color_css);
	        $wnd.jQuery(item).attr('color', color_css);
	        $wnd.jQuery(item).click(function() {
		        setValue(color);
	        });

	        return item;

        };

        var filter = function(colorsGroup) {
	        var colors_group_length = colorsGroup.length;
	        return !compact || colors_group_length > 1;
        };

        var draw = function(colorsGroup) {

	        var colors_group_length = colorsGroup.length;

	        var content = $doc.createElement('div');
	        $wnd.jQuery(content).addClass(group_class);

	        var append = function(color) {
		        $wnd.jQuery(content).append(generateItem(color));
	        };

	        if (compact) {
		        var start = @gwt.material.design.components.client.ui.MaterialColorPalette::COMPACT_RANGE[0];
		        var end = @gwt.material.design.components.client.ui.MaterialColorPalette::COMPACT_RANGE[1];
		        colorsGroup.slice(start, end).forEach(append);
	        } else
		        colorsGroup.forEach(append);

	        $wnd.jQuery(parent).append(content);

        };

        colors.filter(filter).forEach(draw);

	}-*/;
	
	
	public boolean isShowHeader() {
		return showHeader;
	}

	public void setShowHeader(boolean showHeader) {
		this.showHeader = showHeader;
		if (initialized)
			drawHeader();
	}

	public boolean isCompact() {
		return compact;
	}
	
	public void setCompact(boolean compact) {
		this.compact = compact;
		if (initialized)
			draw();
	}
	
	@Override
	public void setValue(Color value) {
		setValue(value, true);
	}
	
	@Override
	public void setValue(Color value, boolean fireEvents) {
		unselect(getValue());
		select(value);
		super.setValue(value, fireEvents);
	}	
	
	void unselect(Color color) {
		if (color != null)
			unselect(getElement(), color.toString(), CssName.MDC_COLOR_PALETTE__BUTTON_SELECTED);
	}
	
	void select(Color color) {
		if (color != null)
			select(getElement(), color.toString(), CssName.MDC_COLOR_PALETTE__BUTTON_SELECTED);
	}
	
	native void unselect(final Element element, final String colorClass, final String style)/*-{
        $wnd.jQuery(element).find('.' + colorClass).removeClass(style);
	}-*/;
	
	native void select(final Element element, final String colorClass, final String style)/*-{
        $wnd.jQuery(element).find('.' + colorClass).addClass(style);
	}-*/;
	
	static final native boolean hasNumber(final String value)/*-{
        return /\d/.test(value);
	}-*/;
	
}
