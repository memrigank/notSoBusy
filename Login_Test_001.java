package com.qa.testcasses;

import org.testng.annotations.Test;

import com.qa.pageobjects.Login_QA_Page;
import com.qa.utilities.Logging;
import com.qa.utilities.Screenshot;
import com.qa.utilities.WaitforScreens;

public class Login_Test_001 extends BaseClass{

	@Test
	public void LoginTest() throws InterruptedException {
		
		driver.get(baseurl);
		Login_QA_Page dothis= new Login_QA_Page(driver);
		Logging log = new Logging();
		Screenshot sc= new Screenshot();
		dothis.setusername(usr);
		WaitforScreens wfs = new WaitforScreens();
		sc.get(driver, "userid");
		log.createlog(driver, "username provided");
		wfs.belate(driver, 2000);
		sc.get(driver, "password");
		dothis.setpassword(pwd);
		wfs.belate(driver, 2000);
		log.createlog(driver, "provided password");
		dothis.clicklogin();
		wfs.belate(driver, 2000);
		log.createlog(driver, "clicked login button");
		sc.get(driver, "loginpage");
		if(driver.getTitle().equals("ToolsQA")) {
			System.out.println("Inside the login page");
			log.createlog(driver, "Passed");
		}else {
			System.out.println("not in the login page");
		}
	}
}
