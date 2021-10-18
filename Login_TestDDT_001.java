package com.qa.testcasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pageobjects.Login_QA_Page;
import com.qa.utilities.ExtentReport;
import com.qa.utilities.XLUtils;

public class Login_TestDDT_001 extends BaseClass{

	
	@Test(dataProvider = "ddtdata")
	public void loginddt(String username, String password) throws InterruptedException {
		
		
		Login_QA_Page dothis = new Login_QA_Page(driver);
		ExtentReport repocreate = new ExtentReport(driver, "./reports/newlogin.html");
		driver.get(baseurl);
		dothis.setusername(username);
		repocreate.createnew("inputuser");
		dothis.setpassword(password);
		repocreate.createnew("inputpass");
		dothis.clicklogin();
		repocreate.createnew("clicklogin");
		Thread.sleep(3000);
		dothis.pagelogout();
		repocreate.createnew("pagelogout");

		Thread.sleep(2000);
	}
	@DataProvider(name = "ddtdata")
	public Object[][] getdata() {
		XLUtils xlutils=new XLUtils(driver,"C:\\Users\\LENOVO\\eclipse-workspace\\ProjectDemoQA\\src\\test\\java\\com\\qa\\testdatas\\readme.xlsx" );
		int rc=xlutils.rowcount("Sheet1");
		int cc=xlutils.cellcount("Sheet1");
		Object[][] data=new Object[rc][cc];
	
	for(int i=0;i<rc;i++) {
		for(int j=0;j<cc;j++) {
	
			data[i][j]=xlutils.getdata("Sheet1", i, j);
		}
	}
	return data;
	}
}
