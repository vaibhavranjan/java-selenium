package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static String getTestData(int row, int column) throws InvalidFormatException, IOException
	{
		//Creating file class object and passed the file path
		File file = new File("C:\\Users\\ranja\\Desktop\\Study\\TestData_Java_Selenium.xlsx");
		
		//Created Workbook object of excel xlsx format
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//created sheet object and get the sheet based on index number
		XSSFSheet sheet = book.getSheetAt(0);
		
		//get the cell value by passing the row and column number 
		// also passed the type of expected data type in the end
		return sheet.getRow(row).getCell(column).getStringCellValue();
		
	}

}
