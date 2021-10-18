package com.qa.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.qa.testcasses.Login_Test_001;

public class Logging {

public void createlog(WebDriver driver, String message) {
		Logger log = LogManager.getLogger(Login_Test_001.class);
		log.info(message);
		log.error(message);
		
		
	}

}
