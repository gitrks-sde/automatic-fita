package com.letsshop;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExternalDataReader {

	
	public static String readUsername() throws InvalidFormatException, IOException
	{
		File f=new File(System.getProperty("user.dir")+"/data_sheets/testdata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(1);
		
		String username=row.getCell(0).toString();
		return username;
		

	}
	
	public static String readPassword() throws InvalidFormatException, IOException
	{
		File f=new File(System.getProperty("user.dir")+"/data_sheets/testdata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(1);
		String password=row.getCell(1).toString();
		return password;

	}
}
