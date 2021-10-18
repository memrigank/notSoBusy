package com.qa.utilities;

import org.openqa.selenium.WebDriver;

public class WaitforScreens {

	public void belate(WebDriver driver, int timeout) throws InterruptedException {
		
		Thread.sleep(timeout);

	}
}
