package com.qa.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void get(WebDriver driver, String Filename) {
		
		try {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshots/"+Filename+".jpg"));
		}catch (Exception e) {
			e.printStackTrace();
}
		
	}
	
}
