package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class XLUtils {
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public XLUtils(WebDriver driver, String Filepath) {
		
		file = new File(Filepath);
		try {
		fis = new FileInputStream(file);
		wb= new XSSFWorkbook(fis);
	}catch(Exception e) {
		e.printStackTrace();
	}

}
	
	public int rowcount(String SheetName) {
		
		sheet=wb.getSheet(SheetName);
		int rc=sheet.getLastRowNum();
		return rc;
	}
	
	public int cellcount(String SheetName) {
		sheet=wb.getSheet(SheetName);
		int cc = sheet.getRow(0).getLastCellNum();
		return cc;
	}
	 
	public String getdata(String SheetName, int i, int j) {
		
		sheet=wb.getSheet(SheetName);
		String data = sheet.getRow(i).getCell(j).getStringCellValue();
		return data;
	}
}
