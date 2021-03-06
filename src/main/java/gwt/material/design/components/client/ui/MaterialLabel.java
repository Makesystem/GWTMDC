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

import gwt.material.design.components.client.base.interfaces.HasClamp;
import gwt.material.design.components.client.base.interfaces.HasWordBreak;
import gwt.material.design.components.client.base.mixin.ClampMixin;
import gwt.material.design.components.client.base.mixin.WordBreakMixin;
import gwt.material.design.components.client.constants.CssName;
import gwt.material.design.components.client.constants.Typography;
import gwt.material.design.components.client.constants.WordBreak;
import gwt.material.design.components.client.ui.html.Label;

/**
 * 
 * @author Richeli Vargas
 *
 */
public class MaterialLabel extends Label implements HasClamp, HasWordBreak {

	protected final ClampMixin<MaterialLabel> clampMixin = new ClampMixin<MaterialLabel>(this);
	protected final WordBreakMixin<MaterialLabel> wordBreakMixin = new WordBreakMixin<>(this);
	
	public MaterialLabel() {
		super(CssName.MDC_TYPOGRAPHY);
	}

	public MaterialLabel(final String text) {
		this();
		setText(text);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		if (getTypography() == null)
			setTypography(Typography.BODY_2);

	}

	@Override
	public void setClamp(final int clamp) {
		clampMixin.setClamp(clamp);
	}

	@Override
	public int getClamp() {
		return clampMixin.getClamp();
	}
	
	@Override
	public void setWordBreak(final WordBreak wordBreak) {
		wordBreakMixin.setWordBreak(wordBreak);
	}
	
	@Override
	public WordBreak getWordBreak() {
		return wordBreakMixin.getWordBreak();
	}
}
