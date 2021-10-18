package com.qa.utilities;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	ExtentHtmlReporter repo;
	ExtentReports ext;
	ExtentTest logger;
	
	public ExtentReport(WebDriver driver, String ReportPath) {
		
	repo = new ExtentHtmlReporter(ReportPath);
	ext = new ExtentReports();
	ext.attachReporter(repo);
	}
	
	public void createnew(String testName) {
		
		logger=ext.createTest(testName);
		logger.log(Status.INFO, "test reports initiated");
		ext.flush();
	}

}
