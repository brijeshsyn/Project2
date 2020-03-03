package com.project1.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.wma.framework.common.InitTest;
import com.wma.framework.report.TestRailAndExtentReporter;

public class TestCase1 extends InitTest {
	
	private TestRailAndExtentReporter tcLogger;
	
	@Test
	@Parameters("tcTitle")
	public void test1(String tcTitle) {
		tcLogger = TestRailAndExtentReporter.getInstance(config(), tcTitle, "Sample Test Case");
		tcLogger.log(Status.INFO, "Step 1");
		tcLogger.log(Status.PASS, "Step 1 PASSED");
		tcLogger.log(Status.INFO, "Step 2");
		tcLogger.log(Status.PASS, "Step 2 PASSED");
		tcLogger.log(Status.INFO, "Step 3");
		tcLogger.log(Status.FAIL, "Step 3 FAILED");
	}
	
	@AfterClass
	public void afterClass() {
		tcLogger.flush();
	}
	
}
