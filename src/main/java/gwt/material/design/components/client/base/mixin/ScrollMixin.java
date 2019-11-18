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

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.components.client.base.mixin.base.AbstractMixin;
import gwt.material.design.components.client.base.widget.MaterialUIObject;
import gwt.material.design.components.client.events.ScrollEvent;
import gwt.material.design.components.client.events.ScrollEvent.HasScrollHandlers;
import gwt.material.design.components.client.events.ScrollEvent.ScrollHandler;

/**
 * @author Richeli Vargas
 */
public class ScrollMixin<UIO extends MaterialUIObject> extends AbstractMixin<UIO> implements HasScrollHandlers {
	
	protected boolean valueChangeHandlerInitialized = false;
	
	public ScrollMixin(final UIO uiObject) {
		this(uiObject, 0, false);
	}
	
	public ScrollMixin(final UIO uiObject, final int gap) {
		this(uiObject, gap, false);
	}
	
	public ScrollMixin(final UIO uiObject, final int gap, final boolean percent) {
		super(uiObject);
		this.register(uiObject, gap, percent);
	}
	
	@Override
	public void fireEvent(GwtEvent<?> event) {
		uiObject.fireEvent(event);
	}
	
	@Override
	public HandlerRegistration addScrollHandler(ScrollHandler handler) {
		return uiObject.addHandler(handler, ScrollEvent.getType());
	}
	
	native void register(final Widget widget, final int max_gap, final boolean percent) /*-{

		var toScroll = widget.@com.google.gwt.user.client.ui.Widget::getElement()();
		var _this = this;
		var scroll_content = $wnd.jQuery(toScroll);

		var last_x_scroll = 0;
		var last_y_scroll = 0;

		var last_at_up_gap = true;
		var last_at_down_gap = true;
		var last_at_left_gap = true;
		var last_at_right_gap = true;
	
		var gap = .1;

		var infinetScroll = function() {

			var _this = $wnd.jQuery(document);

			var scroll_left = scroll_content.scrollLeft();
			var scroll_top = scroll_content.scrollTop();

			var to_up = last_y_scroll > scroll_top;
			var to_down = last_y_scroll < scroll_top;
			var to_left = last_x_scroll > scroll_left;
			var to_right = last_x_scroll < scroll_left;

			var is_vertical = to_up || to_down;
			var is_horizontal = to_left || to_right;

			last_y_scroll = scroll_top;
			last_x_scroll = scroll_left;

			// ///////////////////////////////////////////////////////////////////////////
			// Vertical scrolling
			// ///////////////////////////////////////////////////////////////////////////
			var height = scroll_content.height();
			var scroll_height = toScroll.scrollHeight;
			var gap_height = scroll_height * gap;
			if(gap_height > max_gap){
				gap_height = max_gap;
			}
			// To UP
			var at_up_ends = scroll_top == 0;
			var at_up_gap = scroll_top <= gap_height;
			var up_infinite_trigger = at_up_gap && !last_at_up_gap && to_up;
			last_at_up_gap = at_up_gap;
			// To DOWN
			var at_down_ends = scroll_height == (height + scroll_top);
			var at_down_gap = (scroll_top + height) >= scroll_height - gap_height;
			var down_infinite_trigger = at_down_gap && !last_at_down_gap
					&& to_down;
			last_at_down_gap = at_down_gap;

			// ///////////////////////////////////////////////////////////////////////////
			// Horizontal scrolling
			// ///////////////////////////////////////////////////////////////////////////
			var width = scroll_content.width();
			var scroll_width = toScroll.scrollWidth;
			var gap_width = scroll_width * gap;
			if(gap_width > max_gap){
				gap_width = max_gap;
			}
			// To LEFT
			var at_left_ends = scroll_left == 0;
			var at_left_gap = scroll_left <= gap_width;
			var left_infinite_trigger = at_left_gap && !last_at_left_gap
					&& to_left;
			last_at_left_gap = at_left_gap;
			// To RIGHT
			var at_right_ends = scroll_width == (width + scroll_left);
			var at_right_gap = (scroll_left + width) >= scroll_width - gap_width;
			var right_infinite_trigger = at_right_gap && !last_at_right_gap
					&& to_right;
			last_at_right_gap = at_right_gap;

			// ///////////////////////////////////////////////////////////////////////////
			// Normalize values to fire event
			// ///////////////////////////////////////////////////////////////////////////
			var orientation;
			var direction;
			var scrollPosition;
			var scrollSize;
			var gapSize;

			var isInAreaEnds;
			var isInAreaGap;
			var infiniteScrollTrigger;

			if (is_vertical) {
				orientation = @gwt.material.design.components.client.constants.ScrollOrientation::VERTICAL;
				scrollPosition = scroll_top;
				scrollSize = scroll_height;
				gapSize = gap_height;
			} else if (is_horizontal) {
				orientation = @gwt.material.design.components.client.constants.ScrollOrientation::HORIZONTAL;
				scrollPosition = scroll_left;
				scrollSize = scroll_width;
				gapSize = gap_width;
			}

			if (is_vertical && to_up) {
				direction = @gwt.material.design.components.client.constants.ScrollDirection::UP;
				isInAreaEnds = at_up_ends;
				isInAreaGap = at_up_gap;
				infiniteScrollTrigger = up_infinite_trigger;
			} else if (is_vertical && to_down) {
				direction = @gwt.material.design.components.client.constants.ScrollDirection::DOWN;
				isInAreaEnds = at_down_ends;
				isInAreaGap = at_down_gap;
				infiniteScrollTrigger = down_infinite_trigger;
			} else if (is_horizontal && to_left) {
				direction = @gwt.material.design.components.client.constants.ScrollDirection::LEFT;
				isInAreaEnds = at_left_ends;
				isInAreaGap = at_left_gap;
				infiniteScrollTrigger = left_infinite_trigger;
			} else if (is_horizontal && to_right) {
				direction = @gwt.material.design.components.client.constants.ScrollDirection::RIGHT;
				isInAreaEnds = at_right_ends;
				isInAreaGap = at_right_gap;
				infiniteScrollTrigger = right_infinite_trigger;
			}

			var eventData = {
				target : widget,
				orientation : orientation,
				direction : direction,
				scrollPosition : scrollPosition,
				scrollSize : scrollSize,
				gapSize : gapSize,
				isInAreaEnds : isInAreaEnds,
				isInAreaGap : isInAreaGap,
				infiniteScrollTrigger : infiniteScrollTrigger
			};
			
			// ///////////////////////////////////////////////////////////////////////////
			// Fire event
			// ///////////////////////////////////////////////////////////////////////////			
			@gwt.material.design.components.client.events.ScrollEvent::fire(Lcom/google/gwt/event/shared/HasHandlers;Lgwt/material/design/components/client/constants/ScrollOrientation;Lgwt/material/design/components/client/constants/ScrollDirection;IIIZZZ)(
				// Element with scroll
				eventData.target, 
				// Scroll orientation: VERTICAL or HORIZONTAL
				eventData.orientation, 
				// Scroll direction: UP, DOWN, LEFT or RIGHT
				eventData.direction,
				eventData.scrollPosition, 
				eventData.scrollSize, 
				eventData.gapSize,
				eventData.isInAreaEnds, 
				eventData.isInAreaGap,
				eventData.infiniteScrollTrigger);

		}

		scroll_content.scroll(infinetScroll);

	}-*/;
	
}
