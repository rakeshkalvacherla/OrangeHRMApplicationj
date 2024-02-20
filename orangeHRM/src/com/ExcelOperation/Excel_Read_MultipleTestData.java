package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {
	public static void main(String[] args) throws IOException {
		
		FileInputStream testDataFile=new FileInputStream("./src/com/ExcelOperations/Excel Worksheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDatasheet=workbook.getSheet("TestDataSheet2");
		
	
	    int rowcount=testDatasheet.getLastRowNum();
	    
	    for(int rowindex=0;rowindex<=rowcount;rowindex++) 
	    {
	    Row   testDatasheetrow=testDatasheet.getRow(rowindex);
	    
	    int testDatarowofcellscount =testDatasheetrow.getLastCellNum();
	    
	    for(int rowofCellindex=0;rowofCellindex<testDatarowofcellscount;rowofCellindex++) {
	    	
	      Cell rowofcell=testDatasheetrow.getCell(rowofCellindex);
	      
	         String testData    = rowofcell.getStringCellValue();
	         System.out.print(testData+" ");
	         }
	    System.out.println();
	    }
	    
		
	//	FileInputStream testdataFile =new FileInputStream("./src/com/ExcelOperations/Excel Worksheet.xlsx");
	//	XSSFWorkbook workbook=new XSSFWorkbook(testdataFile);
		XSSFSheet testdatasheet=workbook.getSheet("TestDataSheet2");
	 //   int rowcount =  testdatasheet.getLastRowNum();
	    for(int rowindex=0;rowindex<=rowcount;rowindex++) {
	    Row	testdatasheetrow=testdatasheet.getRow(rowindex);
	    int  testdatarowofcellcount=testdatasheetrow.getLastCellNum();
	    for(int rowofcellindex=0;rowofcellindex<testdatarowofcellcount;rowofcellindex++) {
	    Cell  rowofcell= testdatasheetrow.getCell(rowofcellindex);
	    String testData=rowofcell.getStringCellValue();
	    System.out.print(testData+" ");
	    }
	    System.out.println();
	    }
		        
	}

}

