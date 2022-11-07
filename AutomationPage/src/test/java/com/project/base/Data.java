package com.project.base;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public static String[][] getData() throws IOException
	{
		String[][] s=new String[1][12];
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Administrator\\git\\project1\\AutomationPage\\src\\test\\resources\\Data\\Project1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Project1");
		XSSFRow row = sheet.getRow(0);
		
		int col = row.getPhysicalNumberOfCells();
		
		for(int i=0;i<col;i++)
		{
			XSSFCell cell = row.getCell(i);
			String value = cell.getStringCellValue();
			s[0][i]=value;
		}
		
		
		return s;
	}

}
