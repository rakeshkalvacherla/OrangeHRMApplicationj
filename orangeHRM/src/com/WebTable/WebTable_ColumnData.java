package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




import org.testng.annotations.Test;

public class WebTable_ColumnData extends BaseTest{
	
	
	@Test
	public void DynamicTableData_exporttoexcel() throws IOException, InterruptedException {
		FileInputStream testdata=new FileInputStream("./src/WebTableExcel/WorldclockWebTabledata.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(testdata);
		XSSFSheet testdatasheet=Workbook.getSheet("Sheet1");
				
			
	By WebTableproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody");
	WebElement WebTable=driver.findElement(WebTableproperty);
	
	By WebTableRowProperty=By.tagName("tr");
	List<WebElement>rows=WebTable.findElements(WebTableRowProperty);
	
	 for (int rowIndex = 0; rowIndex < rows.size(); rowIndex++) {
         WebElement row = rows.get(rowIndex);
         Row rowData = testdatasheet.createRow(rowIndex);

         // Identify the cells in the current row
         By webTableRowOfCellProperty = By.tagName("td");
         List<WebElement> rowOfCellData = row.findElements(webTableRowOfCellProperty);

         // perform through all cells in the current row
         for (int cellIndex = 0; cellIndex < rowOfCellData.size(); cellIndex++) {
             WebElement webTableRowOfCell = rowOfCellData.get(cellIndex);

             // Get data from the cell
             String data = webTableRowOfCell.getText();
             System.out.print(data + " | ");

             // Write data to the corresponding cell in Excel
             Cell cellData = rowData.createCell(cellIndex);
             cellData.setCellValue(data);
         }
         System.out.println();
     }

	FileOutputStream testresultfile=new FileOutputStream("./src/WebTableExcel/WorldclockWebTabledata.xlsx");
	Workbook.write(testresultfile);
	
	}
	

}
