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
package gwt.material.design.components.client.ui;

import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.google.gwt.event.dom.client.HasErrorHandlers;
import com.google.gwt.event.dom.client.HasLoadHandlers;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.HasCaption;

import gwt.material.design.components.client.base.interfaces.FromString;
import gwt.material.design.components.client.base.interfaces.HasImage;
import gwt.material.design.components.client.base.mixin.ImageMixin;
import gwt.material.design.components.client.base.mixin.base.AttributeMixin;
import gwt.material.design.components.client.constants.HTMLAttributes;
import gwt.material.design.components.client.ui.html.Img;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialImage extends Img implements HasCaption, HasImage, HasLoadHandlers, HasErrorHandlers {

	protected final ImageMixin<MaterialImage> imageMixin = new ImageMixin<>(this);
	protected final AttributeMixin<MaterialImage, String> captionMixin = new AttributeMixin<MaterialImage, String>(this, HTMLAttributes.DATA_CAPTION, FromString.TO_STRING);

	/**
	 * Creates an empty image.
	 */
	public MaterialImage() {
		super();
	}

	/**
	 * Creates a simple image.
	 */
	public MaterialImage(String url) {
		this();
		setUrl(url);
	}

	/**
	 * Creates an image from an ImageResource.
	 */
	public MaterialImage(ImageResource resource) {
		this();
		setResource(resource);
	}

	@Override
	public String getCaption() {
		return captionMixin.getValue();
	}

	@Override
	public void setCaption(String caption) {
		captionMixin.setValue(caption);
	}

	@Override
	public void setUrl(String url) {
		imageMixin.setUrl(url);
	}

	@Override
	public String getUrl() {
		return imageMixin.getUrl();
	}

	@Override
	public void setResource(ImageResource resource) {
		imageMixin.setResource(resource);
	}

	@Override
	public ImageResource getResource() {
		return imageMixin.getResource();
	}

	public int getWidth() {
		return ((ImageElement) getElement().cast()).getWidth();
	}

	public int getHeight() {
		return ((ImageElement) getElement().cast()).getHeight();
	}

	@Override
	public HandlerRegistration addLoadHandler(final LoadHandler handler) {
		return addDomHandler(handler, LoadEvent.getType());
	}

	@Override
	public HandlerRegistration addErrorHandler(final ErrorHandler handler) {
		return addDomHandler(handler, ErrorEvent.getType());
	}
}
