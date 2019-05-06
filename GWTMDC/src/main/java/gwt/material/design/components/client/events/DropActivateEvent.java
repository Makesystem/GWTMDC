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
import com.google.gwt.event.shared.HasHandlers;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class DropActivateEvent extends GwtEvent<DropActivateEvent.DropActivateHandler> {

    public interface DropActivateHandler extends EventHandler {
        void onDropActivate(DropActivateEvent event);
    }

    public static final Type<DropActivateHandler> TYPE = new Type<>();

    public static Type<DropActivateHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source) {
        source.fireEvent(new DropActivateEvent());
    }

    @Override
    public Type<DropActivateHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(DropActivateHandler handler) {
        handler.onDropActivate(this);
    }
}