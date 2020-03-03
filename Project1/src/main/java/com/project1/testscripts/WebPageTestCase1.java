package com.project1.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.project1.library.WebPage1Actions;
import com.wma.framework.common.InitTest;
import com.wma.framework.report.TestRailAndExtentReporter;

public class WebPageTestCase1 extends InitTest {
	private TestRailAndExtentReporter tcLogger;

	@Test
	@Parameters("TCTitle")
	public void test1(@Optional String tcTitle) {
		System.out.println("Inside test method");
		tcLogger = TestRailAndExtentReporter.getInstance(config(), tcTitle, "Sample Test Case");
		try {
			tcLogger.log(Status.INFO, "Step 1: Launch application");
			WebPage1Actions p1 = new WebPage1Actions(getWebDriver());

			tcLogger.log(Status.INFO, "Step 2: Click on 'LEARN HTML' link");
			p1.clickLearnHtml();

			tcLogger.log(Status.INFO, "Step 3: Click on 'Next' link");
			p1.clickNext();

			String pgTitle = "Introduction to HTML";
			tcLogger.log(Status.INFO, "Step 4: Verify page title is " + pgTitle);
			if(p1.isPageTitle(pgTitle))
				tcLogger.log(Status.PASS, "Page title verification passed");
			else
				throw new Exception( "Page title verification failed");

			tcLogger.log(Status.INFO, "Step 5: Click on 'Previous' link");
			p1.clickPrevious();

			tcLogger.log(Status.INFO, "Step 6: Click on 'Home' link");
			p1.clickHome();

			pgTitle = "W3Schools Online Web Tutorials";
			tcLogger.log(Status.INFO, "Step 7: Verify page title is " + pgTitle);
			if(p1.isPageTitle(pgTitle))
				tcLogger.log(Status.PASS, "Home Page title verification passed");
			else
				throw new Exception("Home Page title verification failed");
		}
		catch(Exception e) {
			e.printStackTrace();
			tcLogger.log(Status.FAIL, e.getMessage());			
		} finally {
			finallyMethod(tcTitle, null, null, false, tcLogger);
		}
	}

	@AfterClass
	public void afterClass() {
		tcLogger.flush();
		quitDriver();
		
	}

}
