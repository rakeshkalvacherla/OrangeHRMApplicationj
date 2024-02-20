package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelopertion_test {
	
	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream testDataFile=new FileInputStream("./src/com/ExcelOperations/Excel Worksheet.xlsx");
		XSSFWorkbook  workbook=new XSSFWorkbook(testDataFile);
		XSSFSheet testdataSheet=workbook.getSheet("TestDataSheet");
	    Row  testdatasheetrow  	=testdataSheet.getRow(1);
		 Cell      testdatarowofcell   = testdatasheetrow.getCell(1);
		  String testdata    = testdatarowofcell.getStringCellValue();
	      System.out.println(testdata);
		}
	
	

}
