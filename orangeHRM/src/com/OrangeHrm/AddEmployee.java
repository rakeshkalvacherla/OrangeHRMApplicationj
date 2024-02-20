package com.OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployee {

	WebDriver driver;
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";	
	public void ApplicationLaunch() {
		
		System.setProperty("webdriver.chrome.driver","./browserdriverFiles/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(ApplicationUrlAddress);
        }
     public void WelcomeAdmin() {
   	 //id="txtUsername"
     String userNameTextdata="Rakesh";	 
     By  usernameProperty=By.id("txtUsername");
     WebElement username= driver.findElement(usernameProperty);
     username.sendKeys(userNameTextdata);
     //id="txtPassword"
     String passwordTextData="Rakesh@1996";
     By   passwordproperty =By.id("txtPassword");
     WebElement password=driver.findElement(passwordproperty);
     password.sendKeys(passwordTextData);
     //class="button"
      By Loginbuttonproperty = By.className("button");
      WebElement Login=driver.findElement(Loginbuttonproperty);
      Login.click();
     }
     public void PIMmousehover() {
    	 //id="menu_pim_viewPimModule"
     By PimProperty	= By.id("menu_pim_viewPimModule");
     WebElement pim =driver.findElement(PimProperty);   
     
     Actions MouseHoverAction=new Actions(driver);
     MouseHoverAction.moveToElement(pim).build().perform();
     }
     public void AddEmployee1() {
    	 //id="menu_pim_addEmployee"
     By AddEmployeeProperty= By.id("menu_pim_addEmployee");
     WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
     AddEmployee.click();
     }
     public void validationAddemployee() {
    	 //<label class="hasTopFieldHelp">Full Name</label>
    	 
     By FullnameProperty= By.className("hasTopFieldHelp");
     WebElement FullName=driver.findElement(FullnameProperty);
     
     String Expected_Fullnamevalue="Full Name";
     System.out.println("The Expected FullnameValue is:-"+Expected_Fullnamevalue);
     String Actual_FullNameValue=FullName.getText();
     System.out.println("The Actual FullNameValue is:-"+Actual_FullNameValue);
     if(Actual_FullNameValue.equals(Expected_Fullnamevalue)) {
    	 System.out.println("The AddEmployee page FullName is matched:-Pass");
     }
     else {
    	 System.out.println("The AddEmployee Page FullName Not Matched is :-Fail");
    	 }
     }
     public void addEmployeeFullNames() {
    	 //id="firstName;
    	 //id="middleName"
    	 //id="lastName"
    	 
    	 String expected_FirstNameData="Rakesh";
     By	FirstnameProperty= By.id("firstName");
     WebElement Firstname=driver.findElement(FirstnameProperty);
     Firstname.sendKeys(expected_FirstNameData);
     
     String expected_Middlenamedata="Prajapathi";
     By Middlenameproperty=By.id("middleName");
     WebElement middlename=driver.findElement(Middlenameproperty);
     middlename.sendKeys(expected_Middlenamedata); 
     
     String expected_LastnameData="Kalvacherla";
     By   Lastnameproperty=By.id("lastName");
     WebElement Lastname=driver.findElement(Lastnameproperty);
     Lastname.sendKeys(expected_LastnameData);
     
     //id="employeeId"
    By employeeidproperty=  By.id("employeeId");
    WebElement Employeeid=driver.findElement(employeeidproperty);
    
   String expected_EmployeeIdvalue=Employeeid.getAttribute("value");
   System.out.println("The Actual Employee id value is:-"+expected_EmployeeIdvalue);
   
   //id="btnSave"
    By  SaveButtonproperty=By.id("btnSave");
    WebElement SaveButton=driver.findElement(SaveButtonproperty);
    SaveButton.click();
      }
     public void validationAddEmployees()   {
    	 //id="personal_txtEmpFirstName"
    By	FirstnameProperty2=By.id("personal_txtEmpFirstName"); 
    WebElement FirstnameElement=driver.findElement(FirstnameProperty2);
    
    String expected_FirstNameData="Rakesh";
    String Actual_FirstnameElementvalue=FirstnameElement.getAttribute("value");
    if(Actual_FirstnameElementvalue.equals(expected_FirstNameData)) {
    System.out.println("The Actual AddEmployee Firstname Element value is:-Pass");
     }
    else {
    	System.out.println("The Actual AddEmployee Firstname Element value is:-Fail");
    }
      //id="personal_txtEmpMiddleName"
    By	MiddlenameProperty2=By.id("personal_txtEmpMiddleName"); 
    WebElement MiddlenameElement=driver.findElement(MiddlenameProperty2);

    String expected_MiddleNameData="Prajapathi";
    String Actual_MiddlenameElementvalue=MiddlenameElement.getAttribute("value");
    if(Actual_MiddlenameElementvalue.equals(expected_MiddleNameData)) {
    	System.out.println("The Actual AddEmployee Middle name value is:-Pass ");
    	}
    else {
    	System.out.println("The Actual AddEmployee Middle name value is:-FAil");
    }
    //id="personal_txtEmpLastName"
      By LastnameProperty2=By.id("personal_txtEmpLastName");
      WebElement LastNameElement=driver.findElement(LastnameProperty2);
      
      String expected_LastnameElementvalue="Kalvacherla";
      String Actual_LastnameElementvalue=LastNameElement.getAttribute("value");
      if(Actual_LastnameElementvalue.equals(expected_LastnameElementvalue)) {
      	System.out.println("The Actual AddEmployee Last name value is:-Pass ");
      	}
      else {
      	System.out.println("The Actual AddEmployee Last name value is:-FAil");
      }
      //id="personal_txtEmployeeId"
  
    	
    
      By EmployeeidProperty2 = By.id("personal_txtEmployeeId");//Actual Employee Id value
      WebElement Employeeidvalue=driver.findElement(EmployeeidProperty2);
      
      By employeeidproperty=  By.id("employeeId");//Expected Employee Id value
      WebElement Employeeid=driver.findElement(employeeidproperty);
      
     // String expected_EmployeeIdvalue=Employeeid.getAttribute("value");

      
      String Actual_Employeeidvalue=Employeeidvalue.getAttribute("value");
      System.out.println("The Actual Employee id value is :-"+Actual_Employeeidvalue);
     
      if(Actual_Employeeidvalue.equals(Employeeid)) 
      {
      	System.out.println("The Employee id value is matched:-Pass");
      }
      else 
      {
      	System.out.println("The Employee id value is Not Matched:-FAIL");
      }
      
      }
      
    	  
      
     
         public void welcomeAdminLogout() throws InterruptedException {
    	 By   WelcomeAdminProperty= By.partialLinkText("Welcome Admin");
         WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
         WelcomeAdmin.click();
         
         //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
        Thread.sleep(3000);
        By LogoutProperty=By.linkText("Logout");
        WebElement Logout=driver.findElement(LogoutProperty);
        Logout.click();
        }
     public void ApplicationClose() {
    	 driver.quit();
     }
    public static void main(String[] args) throws InterruptedException {
    	AddEmployee OrangeHrm=new AddEmployee();
    	OrangeHrm.ApplicationLaunch();
	    OrangeHrm.WelcomeAdmin();
	    OrangeHrm.PIMmousehover();
	    OrangeHrm.AddEmployee1();
	    OrangeHrm.validationAddemployee();
	    OrangeHrm.addEmployeeFullNames();
	    OrangeHrm.validationAddEmployees();
	    OrangeHrm.welcomeAdminLogout();
	    OrangeHrm.ApplicationClose();
}
   
}
