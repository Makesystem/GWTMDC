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
package gwt.material.design.components.client.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

import gwt.material.design.components.client.constants.ScrollDirection;
import gwt.material.design.components.client.constants.ScrollOrientation;
import gwt.material.design.components.client.events.ScrollEvent.ScrollHandler;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class ScrollEvent extends GwtEvent<ScrollHandler> {

	public interface HasScrollHandlers extends HasHandlers {
		HandlerRegistration addScrollHandler(ScrollHandler handler);
	}

	public static interface ScrollHandler extends EventHandler {
		void onScroll(ScrollEvent event);
	}

	/**
	 * Handler type.
	 */
	public static final Type<ScrollHandler> TYPE = new Type<ScrollHandler>();

	/**
	 * Fires a value change event on all registered handlers in the handler
	 * manager. If no such handlers exist, this method will do nothing.
	 * 
	 * @param <T>
	 *            the old value type
	 * @param source
	 *            the source of the handlers
	 * @param value
	 *            the value
	 */
	public static void fire(final HasHandlers source,
			final ScrollOrientation orientation,
			final ScrollDirection direction, final int scrollPosition,
			final int scrollSize, final int gapSize, final boolean isInAreaEnds,
			final boolean isInAreaGap, final boolean infiniteScrollTrigger) {
		source.fireEvent(new ScrollEvent(orientation, direction, scrollPosition,
				scrollSize, gapSize, isInAreaEnds, isInAreaGap,
				infiniteScrollTrigger));
	}

	/**
	 * Gets the type associated with this event.
	 * 
	 * @return returns the handler type
	 */
	public static Type<ScrollHandler> getType() {
		return TYPE;
	}

	private final ScrollOrientation orientation;
	private final ScrollDirection direction;
	private final int scrollPosition;
	private final int scrollSize;
	private final int gapSize;
	private final boolean isInAreaEnds;
	private final boolean isInAreaGap;
	private final boolean infiniteScrollTrigger;

	/**
	 * Creates a value change event
	 * 
	 * @param orientation
	 * @param direction
	 * @param scrollPosition
	 * @param scrollSize
	 * @param gapSize
	 * @param isInAreaEnds
	 * @param isInAreaGap
	 * @param infiniteScrollTrigger
	 */
	public ScrollEvent(final ScrollOrientation orientation,
			final ScrollDirection direction, final int scrollPosition,
			final int scrollSize, final int gapSize, final boolean isInAreaEnds,
			final boolean isInAreaGap, final boolean infiniteScrollTrigger) {
		this.orientation = orientation;
		this.direction = direction;
		this.scrollPosition = scrollPosition;
		this.scrollSize = scrollSize;
		this.gapSize = gapSize;
		this.isInAreaEnds = isInAreaEnds;
		this.isInAreaGap = isInAreaGap;
		this.infiniteScrollTrigger = infiniteScrollTrigger;
	}

	public ScrollOrientation getOrientation() {
		return orientation;
	}

	public ScrollDirection getDirection() {
		return direction;
	}

	public int getScrollPosition() {
		return scrollPosition;
	}

	public int getScrollSize() {
		return scrollSize;
	}

	public int getGapSize() {
		return gapSize;
	}

	public boolean isInAreaEnds() {
		return isInAreaEnds;
	}

	public boolean isInAreaGap() {
		return isInAreaGap;
	}

	public boolean isInfiniteScrollTrigger() {
		return infiniteScrollTrigger;
	}

	// The instance knows its BeforeSelectionHandler is of type I, but the TYPE
	// field itself does not, so we have to do an unsafe cast here.
	@Override
	public final Type<ScrollHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ScrollHandler handler) {
		handler.onScroll(this);
	}

}
