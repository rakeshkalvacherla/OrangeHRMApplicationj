package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployee {

	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriver driver;
		String ApplicationUrlAdderss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(ApplicationUrlAdderss);
		
		FileInputStream  logintextdatafile=new FileInputStream("./src/com/ExcelOperations/AddEmployeeTestSheet.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(logintextdatafile);
		XSSFSheet AddEmployeeSheetdata=Workbook.getSheet("Sheet1");
		
		int rowcount=AddEmployeeSheetdata.getLastRowNum();//Finding cell count
		
		for(int rowindex=1;rowindex<=rowcount;rowindex++) {
		Row testdatasheetrow=AddEmployeeSheetdata.getRow(rowindex);
		Cell usernameTestdatacell=testdatasheetrow.getCell(3);//Getting username
		String userNametestdata=usernameTestdatacell.getStringCellValue();
		Cell  rowofcell =testdatasheetrow.getCell(4);//Getting Password
		String passwordtestdata=rowofcell.getStringCellValue();
	    Cell   rowoffcell= testdatasheetrow.getCell(0);//Getting loginpanel
	    String Loginpanel=rowoffcell.getStringCellValue();
	    Cell   FirstNameTextdatacell= testdatasheetrow.getCell(14);//Getting FirstName
	    String FirstNameTextdata=FirstNameTextdatacell.getStringCellValue();
	    Cell   MiddleNameTextdatacell=testdatasheetrow.getCell(15);//Getting MiddleName
	    String MiddleNameTextData=MiddleNameTextdatacell.getStringCellValue();
	    Cell   LastNameTextDatacell=testdatasheetrow.getCell(16);//Getting LastName
	    String LastNameTextData=LastNameTextDatacell.getStringCellValue();
	    
	    String expected_orangeapplicationLoginpagetext="LOGIN Panel";
	     System.out.println("The EXpected text of the orange Application is:-"+expected_orangeapplicationLoginpagetext);
	     //<div id="logInPanelHeading">LOGIN Panel</div>
	    By orangeapplicationLoginpagetextproperty = By.id("logInPanelHeading");
	    WebElement  orangeApplicationLoginpage= driver.findElement(orangeapplicationLoginpagetextproperty);
	    
	    String Actual_OrangeApplicationLoginpageText=orangeApplicationLoginpage.getText();
	    System.out.println("The Actual Text of the Orange Application login page is:-"+Actual_OrangeApplicationLoginpageText);
	    if(Actual_OrangeApplicationLoginpageText.equals(expected_orangeapplicationLoginpagetext)) {
	    	System.out.println("Text Found-Successfully Navigated to orange Application Login page is:-pass");
	    Cell	testrowofcell=testdatasheetrow.createCell(1);
	    testrowofcell.setCellValue("LOGIN Panel");
	    Cell testrowoffcell=testdatasheetrow.createCell(2);
	    testrowoffcell.setCellValue("Successfully Navigated to orange Application Login page is:-pass");
	      }
	    else {
	    	System.out.println("Text not Found_Failed Navigate to Orange Application login Page is :-Fail");
	    Cell testrowofcell=testdatasheetrow.createCell(1);
	    testrowofcell.setCellValue("Not Matched");
	    Cell testrowoffcell=testdatasheetrow.createCell(2);
	    testrowoffcell.setCellValue("Text Not Found_Failed Navigate to Orange Application login Page is :-Fail");
	     }
	    //id="txtUsername"
	    By  usernameProperty =By.id("txtUsername");
	    WebElement Username=driver.findElement(usernameProperty);
	    Username.sendKeys(userNametestdata);
	    
	    By PasswordProperty=By.id("txtPassword");
	    WebElement Password = driver.findElement(PasswordProperty);
	    Password.sendKeys(passwordtestdata);
	    
	    By LoginbuttonProperty= By.id("btnLogin");
	    WebElement LoginButton=driver.findElement(LoginbuttonProperty);
	    LoginButton.click();
	    
	    By  WelcomeAdminProperty= By.id("welcome");
	    WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
	    
	    String expected_OrangeApplicationHomepageText="Welcome";
	    System.out.println("The Expected Text of the Orange Application Homepage is:-"+expected_OrangeApplicationHomepageText);
	    
	    String Actual_OrangeApplicationPageText=WelcomeAdmin.getText();
	    System.out.println("The Actual Text of the orange Application HomePage is:-"+Actual_OrangeApplicationPageText);
	    
	    if(Actual_OrangeApplicationPageText.contains(expected_OrangeApplicationHomepageText)) {
	     System.out.println("Successfully Navigated to orange Application Homepage is:-pass");
	     Cell testrowofcell=testdatasheetrow.createCell(10);
	     testrowofcell.setCellValue("Successfully Navigated to orange Application Homepage is:-pass");
	     Cell testrowoffcell=testdatasheetrow.createCell(9);
	     testrowoffcell.setCellValue("Welcome");
	    }
	    else 
	    {
	    	System.out.println("Failed Navigate to OrangeHRM Application Home page is:-Fail");
	    	 Cell testrowofcell=testdatasheetrow.createCell(10);
	    	 testrowofcell.setCellValue("Failed Navigate to OrangeHRM Application Home page is:-Fail");
	    	 Cell testrowoffcell=testdatasheetrow.createCell(9);
	    	 testrowoffcell.setCellValue("Not Matched");
	     }
	    //id="menu_pim_viewPimModule"
	     By pimProperty=By.id("menu_pim_viewPimModule");
	     WebElement Pim=driver.findElement(pimProperty);
	     
	    Actions MouseHoveroperation=new Actions(driver);
	    MouseHoveroperation.moveToElement(Pim).build().perform();
		
	    //id="menu_pim_addEmployee"
	   By AddEmployeeProperty= By.id("menu_pim_addEmployee");
	   WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
	   AddEmployee.click();
		
	   //<label class="hasTopFieldHelp">Full Name</label>
	    By FullnamePageText=By.className("hasTopFieldHelp");
	    WebElement FullnamePage=driver.findElement(FullnamePageText);
	    
	   String expexted_FullNamepageText="Full Name";
	   System.out.println("The Expected Text of the Orange Application Webpage is:-"+expexted_FullNamepageText);
	   String Actual_FullNamepageText=FullnamePage.getText();
	   System.out.println("The Actual Text of the Orange Application Webpage is:-"+Actual_FullNamepageText);
	   if(Actual_FullNamepageText.equals(expexted_FullNamepageText)) {
		   System.out.println("Sucessfully Navigated to OrangeHrm Application FullName page is:-Pass");
		Cell  testrowofcell=testdatasheetrow.createCell(13);
		testrowofcell.setCellValue("Sucessfully Navigated to OrangeHrm Application FullName page is:-Pass");
		Cell   testrowoffcell=testdatasheetrow.createCell(12);
		testrowoffcell.setCellValue("Full Name");
	   }
	   else
	   {
		   System.out.println("Failed Navigated to OrangeHrm Application FullName page is:-Fail");
			Cell  testrowofcell=testdatasheetrow.createCell(13);
			testrowofcell.setCellValue("Failed Navigated to OrangeHrm Application FullName page is:-Fail");
			Cell   testrowoffcell=testdatasheetrow.createCell(12);
			testrowoffcell.setCellValue("Not Matched");
		}
	   //id="firstName"
	  
	   By  FirstnameProperty= By.id("firstName");
	   WebElement FirstName =driver.findElement(FirstnameProperty);
	   FirstName.sendKeys(FirstNameTextdata);
	 //id="middleName"
	  By MiddleNameProperty=By.id("middleName");
	  WebElement MiddleName=driver.findElement(MiddleNameProperty);
	  MiddleName.sendKeys(MiddleNameTextData);
	  //id="lastName"
	  By LastNameProperty=By.id("lastName");
	  WebElement LastName=driver.findElement(LastNameProperty);
	  LastName.sendKeys(LastNameTextData);
	  //id="employeeId"
	  By  EmployeeIdProperty=By.id("employeeId");
	  WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
	  
	  String expected_Employeeidvalue=EmployeeId.getAttribute("value");
	  System.out.println("The Text of the Expected WebElement employeeid value is:-"+expected_Employeeidvalue);
	  Cell testdatarowofcell=testdatasheetrow.createCell(17);
	  testdatarowofcell.setCellValue("Expected EmployeeId");
	  //id="btnSave"
	  By SaveButtonProperty=By.id("btnSave");
	  WebElement SaveButton=driver.findElement(SaveButtonProperty);
	  SaveButton.click();
	  
	  //class="hasTopFieldHelp"
	  By FullnameProperty=By.className("hasTopFieldHelp");
	  WebElement FullName=driver.findElement(FullnameProperty);
	  
	  String expected_FullNamePersonaldetailspage="Full Name";
	  System.out.println("The Text of the Expecxted orangeApplication FullName Details page is:-"+expected_FullNamePersonaldetailspage);
	  String Actual_FullNamePersonaldetailspage= FullName.getText();
	  System.out.println("The Text of the Actual Orange Application FullName details page is:-"+Actual_FullNamePersonaldetailspage);
	  if(Actual_FullNamePersonaldetailspage.equals(expected_FullNamePersonaldetailspage)) {
	  System.out.println("Successfully Navigated to Orange Application FullName ldetails page is:-Pass");
      Cell testrowofcell =testdatasheetrow.createCell(19);
      testrowofcell.setCellValue("Actual_FullNameDetailsPageText");
      Cell  testrowoffcell =testdatasheetrow.createCell(20);
      testrowoffcell.setCellValue("Successfully Navigated to Orange Application FullName details page is:-Pass");
      }
	  else {
		  System.out.println("Failed Navigated to Orange Application FullName Details page is:-Fail ");
	 Cell  testrowoffcell= testdatasheetrow.createCell(19);
	 testrowoffcell.setCellValue("Not Matched");
	 Cell testrowofcell=testdatasheetrow.createCell(20);
	 testrowofcell.setCellValue("Failed Navigated to Orange Application FullName Details page is:-Fail");
	  }
	  
	  //id="personal_txtEmpFirstName" 
	  String expected_firstNameTestData =FirstNameTextdata;
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
	   WebElement MiddleNameElement=driver.findElement(MiddleNameProperty2);
	   String Actual_MiddleNamevalue=MiddleNameElement.getAttribute("value");
	   System.out.println("The text of the Actual middle name  value is:-"+Actual_MiddleNamevalue);
	   if(Actual_MiddleNamevalue.equals(expected_middlenameTextdata)) {
		   System.out.println("The Employee MiddleName is Matched:-Pass");
	   Cell Middlenamecell=testdatasheetrow.createCell(23);
	   Middlenamecell.setCellValue("Actual_Middlenamevalue");
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
	   WebElement LastNameElement=driver.findElement(LastNameProperty2);
	   String Actual_Lastnamevalue=LastNameElement.getAttribute("value");
	   System.out.println("The Text of the Actual LastName value is:-"+Actual_Lastnamevalue);
	   if(Actual_Lastnamevalue.equals(expected_LastNamedata)) {
		   System.out.println("The Employee LastName is Matched:-Pass");
	   Cell	 Lastnamecell=testdatasheetrow.createCell(25);
	   Lastnamecell.setCellValue("Actual_LastNamevalue");
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
	        By Employeeid2=By.id("personal_txtEmployeeId");
	        WebElement Employee=driver.findElement(Employeeid2);
	        String Actual_Employeeidvalue=Employee.getAttribute("value");
	        System.out.println("The Text of the Actual Employeeid value is:-"+Actual_Employeeidvalue);
	        if(Actual_Employeeidvalue.equals(expected_Employeeidvalue)) {
	        	System.out.println("The EmployeeId Value is Matched:-Pass");
	        Cell testrowofcell=testdatasheetrow.createCell(27);
	        testrowofcell.setCellValue("Actual_Employeeid");
	        Cell testrowoffcell=testdatasheetrow.createCell(28);
	        testrowoffcell.setCellValue("The EmployeeId Value is Matched:-Pass");
	        }
	        else {
	        	System.out.println("The EmployeeId value is Not Matched:-Fail");
	        	 Cell testrowofcell=testdatasheetrow.createCell(27);
	 	        testrowofcell.setCellValue("Not Matched");
	 	        Cell testrowoffcell=testdatasheetrow.createCell(28);
	 	        testrowoffcell.setCellValue("The EmployeeId Value is Not Matched:-Fail");
	 	        }
		     //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	           WelcomeAdminProperty = By.partialLinkText("Welcome");
	            WelcomeAdmin= driver.findElement(WelcomeAdminProperty);
	            WelcomeAdmin.click();
	            
	            //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	            Thread.sleep(3000);
	          By LogoutProperty= By.linkText("Logout");
	          WebElement Logout=driver.findElement(LogoutProperty);
	          Logout.click();
	        
	        String expected_OrangeApplicationLoginpageText="LOGIN Panel";
	        System.out.println("The Expected Text of the Orange Application loginpage After logout is:-"+expected_OrangeApplicationLoginpageText);
	        //id="logInPanelHeading"
	         By LoginPanelProperty= By.id("logInPanelHeading");
	         WebElement LoginPanel=driver.findElement(LoginPanelProperty);
	         String Actual_OrangeApplicationLoginPageTest=LoginPanel.getText();
	         System.out.println("The Actual Text of the Orange Application Login Page After Logout is:-"+Actual_OrangeApplicationLoginPageTest);
	         if(Actual_OrangeApplicationLoginPageTest.equals(expected_OrangeApplicationLoginpageText)) {
	        	 System.out.println("Successfully Navigated to Orange Application Login page After Logout is:-Pass");
	        Cell testrowofcell=testdatasheetrow.createCell(30);
	        testrowofcell.setCellValue("Login Panel");
	        Cell testrowoffcell=testdatasheetrow.createCell(31);
	        testrowoffcell.setCellValue("Successfully Navigated to Orange Application Login page After Logout is:-Pass");
	         }
	         else {
	        	 System.out.println("Failed Navigated to Orange Application Login Page After  Logout is:-Fail");
	        	 Cell testrowofcell=testdatasheetrow.createCell(30);
	        	 testrowofcell.setCellValue("Not Matched");
	        	 Cell testrowoffcell=testdatasheetrow.createCell(31);
	        	 testrowoffcell.setCellValue("Failed Navigated to Orange Application Login Page After  Logout is:-Fail");
	         }
	         FileOutputStream testresultfile=new FileOutputStream("./src/AddEmPloyeeExcel/AddEmployeeTestSheet.xlsx");
	         Workbook.write(testresultfile);
	         
	         driver.quit();
	         
		}
		
		
		
		
		
		

	}

}
