package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData {

	public static void main(String[] args) throws IOException {
	/* FileInputStream testDataFile=new FileInputStream("./src/com/ExcelOperations/Excel Worksheet.xlsx");
      XSSFWorkbook workbook=new XSSFWorkbook(testDataFile);
      XSSFSheet testDataSheet=workbook.getSheet("TestDataSheet");
      Row  newrow        = testDataSheet.createRow(1);
      Cell   newrowofnewcell =   newrow.createCell(1);
      newrowofnewcell.setCellValue("Jai sriram");
     FileOutputStream testDataresultFile=new FileOutputStream("./src/com/OrangeHRM_Login_ResultFile/Result_sheet.xlsx");
     workbook.write(testDataresultFile);    */
		
		
	   	// Identify the file in the System  
				FileInputStream testDataFile = new FileInputStream("./src/com/ExcelOperations/Excel Worksheet.xlsx");

				// Identify the workBook in the File
				XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

				 // Identify the Sheet in the WorkBook
				XSSFSheet testDataSheet = workBook.getSheet("TestDataSheet");

				// create a particular Row in the Sheet
				Row newRow=testDataSheet.createRow(5);

				// Create a Particular Row of a Cell in the Row
				Cell newRowOfNewCell=newRow.createCell(6);

				// Sending the Test data into the New Row Of Cell Created
				newRowOfNewCell.setCellValue("Rakesh-9lakhs_package");

				// The Excel File along with the WorkBook should be saved
			//	FileOutputStream testDataResultFile = new FileOutputStream("./src/com/ExcelOperations/Excel Worksheet.xlsx");
			//	workBook.write(testDataResultFile);
				
				FileOutputStream testResultFile = new FileOutputStream("./src/com/OrangeHRM_Login_ResultFile_/OrangeHRMApplicationLogInTestResult.xlsx");
				workBook.write(testResultFile);
				
				
				

     
	}

}
