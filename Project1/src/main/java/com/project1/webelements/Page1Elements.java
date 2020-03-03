package com.project1.webelements;

import org.openqa.selenium.By;

import com.wma.framework.common.ByFactory;
import com.wma.framework.common.ByType;
import com.wma.framework.common.Frame;
import com.wma.framework.common.PageElement;

import static com.wma.framework.common.ByType.*;
import static com.wma.framework.common.Frame.*;

public enum Page1Elements implements PageElement {
	LEARN_HTML_LINK(LINK_TEXT, "LEARN HTML", DEFAULT),
	NEXT(XPATH, "//a[contains(text(), 'Next')]", DEFAULT),
	PREVIOUS(XPATH, "//a[contains(text(), 'Previous')]", DEFAULT),
	HOME(XPATH, "//a[contains(text(), 'Next')]", DEFAULT),
	;
	
	private final ByType BY_TYPE;
	private final Frame FRAME_NAME;
	private final String EXPRESSION;
	
	private Page1Elements(ByType byType, String expression, Frame frame) {
		this.BY_TYPE = byType;
		this.EXPRESSION = expression;
		this.FRAME_NAME = frame;
	}
	
	public By getBy(String... arg0) {
		return ByFactory.getBy(BY_TYPE, EXPRESSION, arg0);
	}

	public String getExpression() {
		return EXPRESSION;
	}

	public Frame getFrame() {
		return FRAME_NAME;
	}

	public ByType getType() {
		return BY_TYPE;
	}

}
