package com.project1.webelements;

import org.openqa.selenium.By;

import com.wma.framework.common.ByFactory;
import com.wma.framework.common.ByType;
import com.wma.framework.common.PageElement;

import static com.wma.framework.common.ByType.*;

public enum Page1Elements implements PageElement {
	LEARN_HTML_LINK(LINK_TEXT, "LEARN HTML"),
	NEXT(XPATH, "//a[contains(text(), 'Next')]"),
	PREVIOUS(XPATH, "//a[contains(text(), 'Previous')]"),
	HOME(XPATH, "//a[contains(text(), 'Next')]"),
	;
	
	private final ByType BY_TYPE;
	private final String EXPRESSION;
	
	private Page1Elements(ByType byType, String expression) {
		this.BY_TYPE = byType;
		this.EXPRESSION = expression;
	}
	
	public By getBy(String... arg0) {
		return ByFactory.getBy(BY_TYPE, EXPRESSION, arg0);
	}

	public String getExpression() {
		return EXPRESSION;
	}

	public ByType getType() {
		return BY_TYPE;
	}

}
