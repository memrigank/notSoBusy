package com.qa.testcasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.utilities.readconfig;

public class BaseClass {
	readconfig read = new readconfig();
	
	public WebDriver driver;
	public String baseurl=read.getappurl();
	public String usr=read.getusername();
	public String pwd=read.getpassword();

	
@BeforeClass	
public void setup() {
	
	System.setProperty("webdriver.chrome.driver",read.getpath());
	driver=new ChromeDriver();
	driver.manage().window().maximize();


}

@AfterClass
public void teardown() throws InterruptedException {
	Thread.sleep(3000);	
	driver.close();
	driver.quit();
	
	
}
}
