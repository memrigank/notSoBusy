package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	File file;
	FileInputStream fis;
	Properties pro;

	public readconfig(){ {
		
		file = new File("./Configuration/config.properties");
		try {
		fis = new FileInputStream(file);
		pro = new Properties();
		pro.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


public String getusername() {
	
	String usr =pro.getProperty("usr");
	return usr;
	
}

public String getappurl() {
	
	String baseurl=pro.getProperty("baseurl");
	return baseurl;
}

public String getpassword() {
	String pwd = pro.getProperty("pwd");
	return pwd;
}

public String getpath() {
	
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
}
}