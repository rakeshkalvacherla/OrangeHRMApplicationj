package com.AddEmployee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Multiple_AddEmployeeTestData extends BaseTest{
	
	FileInputStream excelTestDataFile;
	XSSFWorkbook Workbook;
	XSSFSheet excelsheet;
	Row testdatarow;
	@Test(priority=1,description="validating OrangeHRM Application Login Webpage"  )
	public void LoginPageTest() throws IOException  {
			
	 excelTestDataFile=new  FileInputStream("./src/AddEmPloyeeExcel/AddEmployee.xlsx");
	 Workbook=new XSSFWorkbook(excelTestDataFile);
	 excelsheet=Workbook.getSheet("Sheet1");
	 testdatarow=excelsheet.getRow(2);
    Cell rowofcell=testdatarow.getCell(0);//Getting LoginPanel
    String	LoginPanel=rowofcell.getStringCellValue();
    
    String expected_OrangeApplicationLoginpageText="LOGIN Panel";
    System.out.println("The Expected Text of the Orange Application Login page is:-"+expected_OrangeApplicationLoginpageText);
    //id="logInPanelHeading"
    By LoginpanelProperty=By.id("logInPanelHeading");
    WebElement OrangeApplicationLoginpage=driver.findElement(LoginpanelProperty);
    String Actual_OrangeApplicationloginPageText=OrangeApplicationLoginpage.getText();
    System.out.println("The Actual Text Of the Orange Application Login page is:-"+Actual_OrangeApplicationloginPageText);
    if(Actual_OrangeApplicationloginPageText.equals(expected_OrangeApplicationLoginpageText)){
    	System.out.println("Successfully Navigated to Orange Hrm Application Login page is:-Pass");
    Cell LoginpaneltestRowofCell=testdatarow.createCell(1);
    LoginpaneltestRowofCell.setCellValue(LoginPanel);
    LoginpaneltestRowofCell=testdatarow.createCell(2);
    LoginpaneltestRowofCell.setCellValue("Successfully Navigated to Orange Hrm Application Login page is:-Pass");
    }
    else {
    	System.out.println("Failed Navigated to Orange Hrm Appliction login page is:-Fail");
    	 Cell LoginpaneltestRowofCell=testdatarow.createCell(1);
    	    LoginpaneltestRowofCell.setCellValue("Not Matched");
    	    LoginpaneltestRowofCell=testdatarow.createCell(2);
    	    LoginpaneltestRowofCell.setCellValue("Failed Navigated to Orange Hrm Appliction login page is:-Fail");
    }
     Cell rowOfcell=testdatarow.getCell(3);//Getting OrangeHRM
     String OrangeHrm=rowOfcell.getStringCellValue();
     String expected_OrangeHrmApplicationpageTitle="OrangeHRM";
     System.out.println("The Expected Title of the Orange HRM Application Login Web Page is:-"+expected_OrangeHrmApplicationpageTitle);
     String Actual_OrangeApplicationpageTitle=driver.getTitle();
     System.out.println("The Actual Title Of the Orange HRM Application Login Web Page is:-"+Actual_OrangeApplicationpageTitle);
     if(Actual_OrangeApplicationpageTitle.equals(expected_OrangeHrmApplicationpageTitle)) {
    	 System.out.println("Successfully Navigated to Orange HRM Application Web page:-Pass");
     Cell	testrowofcell= testdatarow.createCell(4);
     testrowofcell.setCellValue("OrangeHRM");
     Cell testRowofcell=testdatarow.createCell(5);
     testRowofcell.setCellValue("Successfully Navigated to Orange HRM Application Web page:-Pass");
     }
     else {
    	 System.out.println("Failed Navigated to Orange HRM Application Web page:-Fail");
    	 Cell	testrowofcell= testdatarow.createCell(4);
         testrowofcell.setCellValue("Not Matched");
         Cell testRowofcell=testdatarow.createCell(5);
         testRowofcell.setCellValue("Failed Navigated to Orange HRM Application Web page:-Fail");
         }
     Cell UserNameDatacell=testdatarow.getCell(6);//Getting Username
     String UserNameTextData= UserNameDatacell.getStringCellValue();
      //id="txtUsername"
     By UserNameProperty=By.id("txtUsername");
     WebElement UserNameElement=driver.findElement(UserNameProperty);
     UserNameElement.sendKeys(UserNameTextData);
     Cell Passwordatacell=testdatarow.getCell(7);
     String PasswordTextData=Passwordatacell.getStringCellValue();
     //id="txtPassword"
     By  PasswordProperty=By.id("txtPassword");
     WebElement PasswordElement=driver.findElement(PasswordProperty);
     PasswordElement.sendKeys(PasswordTextData);
     //id="btnLogin"
     By LoginButtonProperty=By.id("btnLogin");
     WebElement LoginButton=driver.findElement(LoginButtonProperty);
     LoginButton.click();
     //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
     By WelcomeAdminProperty=By.partialLinkText("Admin");
     WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
     String expected_OrangeApplicationHomePageText="Welcome";
     System.out.println("The Expected Text of the Orange Application HomePage is:-"+expected_OrangeApplicationHomePageText);
     String Actual_OrangeApplicationHomePageText=WelcomeAdmin.getText();
     System.out.println("The Actual Text of the Orange Application HomePage is:-"+Actual_OrangeApplicationHomePageText);
     if(Actual_OrangeApplicationHomePageText.contains(expected_OrangeApplicationHomePageText)) {
    	 System.out.println("Successfully Navigated to Orange Application HomePage is:-Pass");
     Cell AdminTextrowofcell=testdatarow.createCell(9);
     AdminTextrowofcell.setCellValue("Admin");
     Cell AdminTextRowofcell=testdatarow.createCell(10);
     AdminTextRowofcell.setCellValue("Successfully Navigated to Orange Application HomePage is:-Pass");
     }
     else {
    	 System.out.println("Failed Navigated to Orange Application Home page is:-Fail");
    	 Cell AdminTextrowofcell=testdatarow.createCell(9);
         AdminTextrowofcell.setCellValue("Not Matched");
         Cell AdminTextRowofcell=testdatarow.createCell(10);
         AdminTextRowofcell.setCellValue("Failed Navigated to Orange Application HomePage is:-fail");
     }
     }
	@Test(priority=2,description="Validating OrangeHRM Application HomePage PIM Functionality")
	public void  pim_Text() {
		//id="menu_pim_viewPimModule"
	By	PIMproperty=By.id("menu_pim_viewPimModule");
	WebElement pIm=driver.findElement(PIMproperty);
	Actions MouseHover=new Actions(driver);
	MouseHover.moveToElement(pIm).build().perform();
	}
	@Test(priority=3,description="validating OrangeHRM Application HomePage PIM-AddEmployee Functionality")
	public void add_EmployeeText() {
		//id="menu_pim_addEmployee"
	By	addEmployeeproperty=By.id("menu_pim_addEmployee");
	WebElement AddEmployee=driver.findElement(addEmployeeproperty);
	AddEmployee.click();
	}
	

	@Test(priority=6,description="validation Logout Functionality")
	public void Loginpanelafterlogout() throws InterruptedException, IOException {
		//id="welcome"
	By	welcomeAdminproperty=By.id("welcome");
	WebElement Welcome=driver.findElement(welcomeAdminproperty);
	Welcome.click();
	
	Thread.sleep(3000);
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	By LogoutButtonProperty=By.linkText("Logout");
	WebElement LogoutButton=driver.findElement(LogoutButtonProperty);
	LogoutButton.click();
	
	
	String expected_OrangeApplicationLoginpageText="LOGIN Panel";
    System.out.println("The Expected Text of the Orange Application Login page is:-"+expected_OrangeApplicationLoginpageText);
    //id="logInPanelHeading"
    By LoginpanelProperty=By.id("logInPanelHeading");
    WebElement OrangeApplicationLoginpage=driver.findElement(LoginpanelProperty);
    String Actual_OrangeApplicationloginPageText=OrangeApplicationLoginpage.getText();
    System.out.println("The Actual Text Of the Orange Application Login page is:-"+Actual_OrangeApplicationloginPageText);
    if(Actual_OrangeApplicationloginPageText.equals(expected_OrangeApplicationLoginpageText)){
    	System.out.println("Successfully Navigated to Orange Hrm Application Login page is:-Pass");
    Cell LoginpaneltestRowofCell=testdatarow.createCell(30);
    LoginpaneltestRowofCell.setCellValue("LoginPanel");
    LoginpaneltestRowofCell=testdatarow.createCell(31);
    LoginpaneltestRowofCell.setCellValue("Successfully Navigated to Orange Hrm Application Login page is:-Pass");
    }
    else {
    	System.out.println("Failed Navigated to Orange Hrm Appliction login page is:-Fail");
    	 Cell LoginpaneltestRowofCell=testdatarow.createCell(30);
    	    LoginpaneltestRowofCell.setCellValue("Not Matched");
    	    LoginpaneltestRowofCell=testdatarow.createCell(31);
    	    LoginpaneltestRowofCell.setCellValue("Failed Navigated to Orange Hrm Appliction login page is:-Fail");
    }
    FileOutputStream TestdataResultFile=new FileOutputStream("./src/AddEmPloyeeExcel/AddEmployee.xlsx");
    Workbook.write(TestdataResultFile);      
		
	}
	FileOutputStream TestdataResultFile;
	Row testdatasheetrow;
	String FirstNameTextData;
	 String MiddleNameTextData;
	 String LastNameTextData;
	 String expected_employeeid;
	@Test(priority=4,description="validating OrangeHRM Application AddEmployee Functionality Test")
	public void add_NewEmployeeTest() throws  InterruptedException, IOException {
		
		 excelTestDataFile=new  FileInputStream("./src/AddEmPloyeeExcel/AddEmployee.xlsx");
		 Workbook=new XSSFWorkbook(excelTestDataFile);
		 excelsheet=Workbook.getSheet("Sheet1");
		
		
	 for(int rowindex=2;rowindex<5;rowindex++)
	 {
	 Row testdatasheetrow=excelsheet.getRow(rowindex);
	 
	 Cell Firstnametextdatacell=testdatasheetrow.getCell(14);
	 String FirstNameTextData=Firstnametextdatacell.getStringCellValue();
	 Cell MiddleNameTextdataCell=testdatasheetrow.getCell(15);
	 String MiddleNameTextData=MiddleNameTextdataCell.getStringCellValue();				
	 Cell LastnameTextDatacell=testdatasheetrow.getCell(16);
	 String LastNameTextData=LastnameTextDatacell.getStringCellValue();
	 //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
     By	 FirstNameProperty=By.id("firstName");
     WebElement FirstNameElement=driver.findElement(FirstNameProperty);
     FirstNameElement.sendKeys(FirstNameTextData);
     //id="middleName"
     By middleNameProperty=By.id("middleName");
     WebElement MiddleNameElement=driver.findElement(middleNameProperty);
     MiddleNameElement.sendKeys(MiddleNameTextData);
    // Thread.sleep(1000);
     //id="lastName"
     By LastNameProperty=By.id("lastName");
     WebElement LastNameElement=driver.findElement(LastNameProperty);
     LastNameElement.sendKeys(LastNameTextData);
    // Thread.sleep(1000 );
     //id="employeeId"
    By EmployeeIdProperty =By.id("employeeId");
    WebElement Employeeid=driver.findElement(EmployeeIdProperty);
    String expected_employeeid=Employeeid.getAttribute("value");
    System.out.println("The Text of the Expected WebElement Employee id is:-"+expected_employeeid);
    Cell testrowofcell=testdatasheetrow.createCell(17);
    testrowofcell.setCellValue(expected_employeeid);
    
    Cell AddEmployeeTextdatacell=testdatarow.getCell(11);
    String AddemployeeTextdata=AddEmployeeTextdatacell.getStringCellValue();
    
    ///html/body/div[1]/div[3]/div/div[1]/h1
    String expected_OrangeHrmFullNameText=AddemployeeTextdata;
    System.out.println("The Expected Text of the Orange Application Login page is:-"+expected_OrangeHrmFullNameText);
    WebElement HeadingElement =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1"));
    String Actual_OrangeApplicationFullNameText=HeadingElement.getText();
    System.out.println(Actual_OrangeApplicationFullNameText);
    System.out.println("The Actual Text of the Orange Application Login Page is:-"+Actual_OrangeApplicationFullNameText);
    if(Actual_OrangeApplicationFullNameText.equals(expected_OrangeHrmFullNameText)) {
    	System.out.println("Text Found-Successfully Navigated to Orange Application AddEmployee Page is:-PASS");
    Cell testRowofcell=testdatarow.createCell(12);
    testRowofcell.setCellValue(Actual_OrangeApplicationFullNameText);
    Cell  testrowoffcell=testdatarow.createCell(13);
    testrowoffcell.setCellValue("Successfully Navigated to Orange Application AddEmployee Page is:-PASS");
    }
    else {
    	System.out.println("Failed NAvigated to Orange Application AddEmployee page is:-Fail");
        Cell testRowofcell=testdatarow.createCell(12);
        testRowofcell.setCellValue("Not Matched");
        Cell  testrowoffcell=testdatarow.createCell(13);
        testrowoffcell.setCellValue("Failed NAvigated to Orange Application AddEmployee page is:-Fail");
    	}
       
    
    //id="btnSave"
    By SaveButtonProperty=By.id("btnSave");
    WebElement SaveButton=driver.findElement(SaveButtonProperty);
    SaveButton.click();
    }
	
	 
        Cell   personaltextdatacell=testdatarow.getCell(18);
     String personalTestData=personaltextdatacell.getStringCellValue();//Getting PersonalDetails
    // /html/body/div[1]/div[3]/div/div[2]/div[1]/h1
     String expected_orangeHrmpersonaldetailsText=personalTestData;
     System.out.println("The Expected Text of the Orange Application Personal Page is :-"+expected_orangeHrmpersonaldetailsText);
     WebElement PesonalDetailsheadingElement=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1"));
     String Actual_orangeHrmpersonaldetailsText=PesonalDetailsheadingElement.getText();
     System.out.println("The Actual Text of the Orange Application Personal page us:-"+Actual_orangeHrmpersonaldetailsText);
     if(Actual_orangeHrmpersonaldetailsText.equals(expected_orangeHrmpersonaldetailsText)) {
    	 System.out.println("Text Found_Successfully Navigated to Orange Application Personal Details page:-Pass");
     Cell  testRowofcell=testdatarow.createCell(19);
     testRowofcell.setCellValue(Actual_orangeHrmpersonaldetailsText);
     Cell testrowofCell=testdatarow.createCell(20);
     testrowofCell.setCellValue("Successfully Navigated to Orange Application Personal Details page:-Pass");
     }
     else {
    	 System.out.println("Failed Navigated to Orange Application personal Details Page:-Fail");
    	 Cell  testRowofcell=testdatarow.createCell(19);
         testRowofcell.setCellValue("Not Matched");
         Cell testrowofCell=testdatarow.createCell(20);
         testrowofCell.setCellValue("Failed Navigated to Orange Application personal Details Page:-Fail");
     }
    
	  
	  //id="personal_txtEmpFirstName" 
	  String expected_firstNameTestData =FirstNameTextData;
		By firstNameProperty2 = By.id("personal_txtEmpFirstName");
		WebElement firstNameElement = driver.findElement(firstNameProperty2);
		String Actual_firstNameValue = firstNameElement.getAttribute("value");
		System.out.println("The Actual value of the first name is: " + Actual_firstNameValue);
         if(Actual_firstNameValue.equals(expected_firstNameTestData)){
			System.out.println("The Employee First Name Is Matched :-Pass");
			Cell FirstNameCell=testdatasheetrow.createCell(21);
			FirstNameCell.setCellValue (Actual_firstNameValue);
			Cell FirstNameRowOfCell=testdatasheetrow.createCell(22);
			FirstNameRowOfCell.setCellValue("The Employee First Name Is Matched :-Pass");
  }
	  else
	  {
		  System.out.println("The Employee FirstName is Not Matched:-Fail");
		 Cell FirstNamecell=testdatasheetrow.createCell(21);
		 FirstNamecell.setCellValue("Not Matched");
		 Cell FirstNamerowoffcell=testdatasheetrow.createCell(22);
		 FirstNamerowoffcell.setCellValue("The Employee FirstName is Not Matched:-Fail");
	  }
	  
	  
	//id="personal_txtEmpMiddleName"
	   String expected_middlenameTextdata=MiddleNameTextData;
	   By MiddleNameProperty2=By.id("personal_txtEmpMiddleName");
	   WebElement MiddlenameElement=driver.findElement(MiddleNameProperty2);
	   String Actual_MiddleNamevalue=MiddlenameElement.getAttribute("value");
	   System.out.println("The text of the Actual middle name  value is:-"+Actual_MiddleNamevalue);
	   if(Actual_MiddleNamevalue.equals(expected_middlenameTextdata)) {
		   System.out.println("The Employee MiddleName is Matched:-Pass");
	   Cell Middlenamecell=testdatasheetrow.createCell(23);
	   Middlenamecell.setCellValue(Actual_MiddleNamevalue);
	   Cell Middlenamerowofcell=testdatasheetrow.createCell(24);
	   Middlenamerowofcell.setCellValue("The Employee MiddleName is Matched:-Pass");
	   }
	   else {
		   System.out.println("The Employee middlename is not matched:-Fail");
	   Cell Middlenamecell=testdatasheetrow.createCell(23);
	   Middlenamecell.setCellValue("Not Matched");
	   Cell Middlenamerowofcell=testdatasheetrow.createCell(24);
	   Middlenamerowofcell.setCellValue("The Employee middlename is not matched:-Fail");
	   }
	   
	   //id="personal_txtEmpLastName"
	   String expected_LastNamedata=LastNameTextData;
	   By LastNameProperty2=By.id("personal_txtEmpLastName");
	   WebElement LastnameElement=driver.findElement(LastNameProperty2);
	   String Actual_Lastnamevalue=LastnameElement.getAttribute("value");
	   System.out.println("The Text of the Actual LastName value is:-"+Actual_Lastnamevalue);
	   if(Actual_Lastnamevalue.equals(expected_LastNamedata)) {
		   System.out.println("The Employee LastName is Matched:-Pass");
	   Cell	 Lastnamecell=testdatasheetrow.createCell(25);
	   Lastnamecell.setCellValue(Actual_Lastnamevalue);
	   Cell Lastnamerowofcell=testdatasheetrow.createCell(26);
	   Lastnamerowofcell.setCellValue("The Employee LastName is Matched:-Pass");
	   }
	   else {
		   System.out.println("The Employee LastName is Not Matched:-Fail");
		   Cell	 Lastnamecell=testdatasheetrow.createCell(25);
		   Lastnamecell.setCellValue("Not Matched");
		   Cell Lastnamerowofcell=testdatasheetrow.createCell(26);
		   Lastnamerowofcell.setCellValue("The Employee LastName is Not Matched:-Fail");
		   }
	  
	     //id="personal_txtEmployeeId"
          By   employeidproperty2=By.id("personal_txtEmployeeId");
          WebElement Employeeid2=driver.findElement(employeidproperty2);
          String Actual_Employeeidvalue=Employeeid2.getAttribute("value");
          System.out.println("The Actual Text of the WebElemnt Value is:-"+Actual_Employeeidvalue);
      
		if(Actual_Employeeidvalue.equals(expected_employeeid)) {
        	  System.out.println("The Employee id is Matches:-pass");
        	Cell  testRowofcell=testdatarow.createCell(27);
        	testRowofcell.setCellValue(Actual_Employeeidvalue);
        	Cell testrowoffcell=testdatarow.createCell(28);
        	testrowoffcell.setCellValue("The Employee Id is Matched:-Pass");
          }
          else {
        	  System.out.println("The Employee id is Not Matched:-Fail");
        	  Cell  testRowofcell=testdatarow.createCell(27);
          	testRowofcell.setCellValue("Not matched");
          	Cell testrowoffcell=testdatarow.createCell(28);
          	testrowoffcell.setCellValue("The Employee Id is Not Matched:-Fail");
           }
          Thread.sleep(1000);
          driver.navigate().back();
          driver.navigate().refresh();
          
          FileOutputStream TestdataResultFile=new FileOutputStream("./src/AddEmPloyeeExcel/AddEmployee.xlsx");
          Workbook.write(TestdataResultFile);      
          }
	 
	 
	
	}
	
	
	
