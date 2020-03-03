package com.project1.library;


import org.openqa.selenium.WebDriver;

import com.project1.webelements.Page1Elements;
import com.wma.framework.common.CommonWebActions;

import static com.project1.webelements.Page1Elements.*;

public class WebPage1Actions extends CommonWebActions<Page1Elements>{
	
	WebDriver driver;

	public WebPage1Actions(WebDriver driver) {
		super(driver);		
	}

	public void login() {		
		System.out.println("User logged in successfully");
	}

	public boolean verifySuccessfulLogin() {
		return false;
	}	
	
	public void clickLearnHtml() {
		click(LEARN_HTML_LINK);
	}
	
	public void clickNext() {
		click(NEXT);
	}
	
	public void clickPrevious() {
		click(PREVIOUS);
	}
	
	public void clickHome() {
		click(HOME);
	}
	
	public boolean isPageTitle(String pageTitle) {
		return getPageTitle().equalsIgnoreCase(pageTitle);
	}
	
	
	

}
