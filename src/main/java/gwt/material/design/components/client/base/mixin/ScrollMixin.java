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
package gwt.material.design.components.client.base.mixin;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import gwt.material.design.components.client.base.mixin.base.AbstractMixin;
import gwt.material.design.components.client.base.widget.MaterialUIObject;
import gwt.material.design.components.client.constants.ScrollDirection;
import gwt.material.design.components.client.constants.ScrollOrientation;
import gwt.material.design.components.client.events.ScrollEvent;
import gwt.material.design.components.client.events.ScrollEvent.HasScrollHandlers;
import gwt.material.design.components.client.events.ScrollEvent.ScrollHandler;

/**
 * @author Richeli Vargas
 */
public class ScrollMixin<UIO extends MaterialUIObject>
		extends
			AbstractMixin<UIO>
		implements
			HasScrollHandlers {

	protected boolean valueChangeHandlerInitialized = false;

	public ScrollMixin(final UIO uiObject) {
		super(uiObject);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		uiObject.fireEvent(event);
	}

	protected void fireScrollEvent(final boolean isVeritical,
			final boolean isHorizontal, final boolean isUp,
			final boolean isDown, final boolean isLeft, final boolean isRight,
			final int scrollPosition, final int scrollSize, final int gapSize,
			final boolean isInAreaEnds, final boolean isInAreaGap,
			final boolean infiniteScrollTrigger) {

		final ScrollOrientation orientation = isVeritical
				? ScrollOrientation.VERTICAL
				: ScrollOrientation.HORIZONTAL;
		
		final ScrollDirection direction = isUp
				? ScrollDirection.UP
				: (isDown
						? ScrollDirection.DOWN
						: (isLeft
								? ScrollDirection.LEFT
								: ScrollDirection.RIGHT));
		
		ScrollEvent.fire(uiObject, orientation, direction, scrollPosition,
				scrollSize, gapSize, isInAreaEnds, isInAreaGap,
				infiniteScrollTrigger);
	}

	@Override
	public HandlerRegistration addScrollHandler(ScrollHandler handler) {
		return uiObject.addHandler(handler, ScrollEvent.getType());
	}

	native void infinite(final Element toScroll) /*-{

		var _this = this;
		var gap = .1;
		var sroll_content = $wnd.jQuery(toScroll);

		var last_x_scroll = 0;
		var last_y_scroll = 0;

		var last_at_up_gap = false;
		var last_at_down_gap = false;
		var last_at_left_gap = false;
		var last_at_right_gap = false;

		var infinetScroll = function() {

			var _this = $wnd.jQuery(document);

			var scroll_left = sroll_content.scrollLeft();
			var scroll_top = sroll_content.scrollTop();

			var to_up = last_y_scroll > scroll_top;
			var to_down = last_y_scroll < scroll_top;
			var to_left = last_x_scroll > scroll_left;
			var to_rigth = last_x_scroll < scroll_left;

			var is_vertical = to_up || to_down;
			var is_horizontal = to_left || to_rigth;

			last_y_scroll = scroll_top;
			last_x_scroll = scroll_left;

			// ///////////////////////////////////////////////////////////////////////////
			// Vertical scrolling
			// ///////////////////////////////////////////////////////////////////////////
			var height = scroll_content.height();
			var scroll_height = toScroll.scrollHeight;
			var gap_height = scroll_height * gap_;
			// To UP
			var at_up_ends = scroll_top == 0;
			var at_up_gap = scroll_top <= gap_height;
			var up_infinite_trigger = at_up_gap && !last_at_up_gap && to_up;
			last_at_up_gap = at_up_gap;
			// To DOWN
			var at_down_ends = scroll_height == (height + scroll_top);
			var at_down_gap = scroll_top <= gap_height;
			var down_infinite_trigger = at_down_gap && !last_at_down_gap
					&& to_down;
			last_at_down_gap = at_down_gap;

			// ///////////////////////////////////////////////////////////////////////////
			// Horizontal scrolling
			// ///////////////////////////////////////////////////////////////////////////
			var width = scroll_content.width();
			var scroll_width = toScroll.scrollWidth;
			var gap_width = scroll_width * gap_;
			// To LEFT
			var at_left_ends = scroll_left == 0;
			var at_left_gap = scroll_left <= gap_width;
			var left_infinite_trigger = at_left_gap && !last_at_left_gap
					&& to_left;
			last_at_left_gap = at_left_gap;
			// To RIGHT
			var at_right_ends = scroll_width == (width + scroll_left);
			var at_right_gap = scroll_left <= gap_width;
			var right_infinite_trigger = at_right_gap && !last_at_right_gap
					&& to_right;
			last_at_right_gap = at_right_gap;

		}

		sroll_content.scroll(infinetScroll);

	}-*/;

}
