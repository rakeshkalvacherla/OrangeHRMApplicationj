package com.AddEmployee;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test(priority = 1)
public class AddEmployeeMultipleData_importtoExcel extends BaseTest {
	@Test(priority = 2)
	public void LoginFunctionality() {

		// id="txtUsername"
		String UsernameTextData = "Rakesh";
		By userNameProperty = By.id("txtUsername");
		WebElement username = driver.findElement(userNameProperty);
		username.sendKeys(UsernameTextData);

		// id="txtPassword"
		String passwordTextData = "Rakesh@1996";
		By Passwordproperty = By.id("txtPassword");
		WebElement Password = driver.findElement(Passwordproperty);
		Password.sendKeys(passwordTextData);

		// id="btnLogin"
		By LoginButtonProperty = By.id("btnLogin");
		WebElement LoginButton = driver.findElement(LoginButtonProperty);
		LoginButton.click();
	}

	@Test(priority = 3)
	public void Pim_MouseHover() {
		// id="menu_pim_viewPimModule"
		By PIMProperty = By.id("menu_pim_viewPimModule");
		WebElement Pim = driver.findElement(PIMProperty);
		Actions MouseHover = new Actions(driver);
		MouseHover.moveToElement(Pim).build().perform();

		// id="menu_pim_viewEmployeeList"
		By EmployeelistProperty = By.id("menu_pim_viewEmployeeList");
		WebElement Employeelist = driver.findElement(EmployeelistProperty);
		Employeelist.click();
	}

	@Test(priority = 4)
	public void Webtabledata() throws IOException, InterruptedException {
		// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		By webtableproperty = By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
		WebElement Webtabledata = driver.findElement(webtableproperty);

		By rowdataproperty = By.tagName("tr");
		List<WebElement> rowdata = Webtabledata.findElements(rowdataproperty);

		FileInputStream testdatafile = new FileInputStream("./src/AddEmPloyeeExcel/AddemployeeMultipleData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(testdatafile);
		XSSFSheet testdatasheet = workbook.getSheet("Sheet1");

		for (int rowindex = 0; rowindex < rowdata.size(); rowindex++) {
			WebElement row = rowdata.get(rowindex);
			Row rows = testdatasheet.createRow(rowindex);

			By rowofcellproperty = By.tagName("td");
			List<WebElement> rowofcelldata = row.findElements(rowofcellproperty);
			for (int rowofcell = 0; rowofcell < rowofcelldata.size(); rowofcell++) {
				WebElement cell = rowofcelldata.get(rowofcell);
				String data = cell.getText();
				System.out.print(data + " | ");
				Cell celldata = rows.createCell(rowofcell);
				celldata.setCellValue(data);
				// Thread.sleep(1000);
			}
			System.out.println();
			FileOutputStream TestresultFile = new FileOutputStream(
					"./src/AddEmPloyeeExcel/AddemployeeMultipleData.xlsx");
			workbook.write(TestresultFile);

		}

	}

}
