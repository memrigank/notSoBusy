package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_QA_Page {
	
	WebDriver driver;
	
	public Login_QA_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	
public void setusername(String usr) {
	
	driver.findElement(By.id("userName")).sendKeys(usr);
}
	
public void setpassword(String pwd) {
	
	driver.findElement(By.id("password")).sendKeys(pwd);
}

public void clicklogin() {
	driver.findElement(By.id("login")).click();
}
	public void pagelogout() {
		driver.findElement(By.id("submit")).click();
	}
}
