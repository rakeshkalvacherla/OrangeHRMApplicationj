package com.OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PIM {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver;
    String	ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(ApplicationUrlAddress);
    
    //<input name="txtUsername" id="txtUsername" type="text">
    
     String userNameTextData="Rakesh";
     By    UsernameProperty= By.id("txtUsername");
     WebElement Username= driver.findElement(UsernameProperty);
     Username.sendKeys(userNameTextData);
     //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
      String PasswordTextData="Rakesh@1996";
      By  PasswordProperty= By.id("txtPassword");
      WebElement  password= driver.findElement(PasswordProperty);
      password.sendKeys(PasswordTextData);
     
    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN"> 
      By  LoginProperty= By.id("btnLogin");
      WebElement Login=driver.findElement(LoginProperty);
      Login.click();
     
     //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
       By  pimProperty =  By.id("menu_pim_viewPimModule");
       WebElement pim= driver.findElement(pimProperty);
         
       Actions MouseHoverOperation=new Actions(driver);
       MouseHoverOperation.moveToElement(pim) .build().perform(); 
     
     //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
      By  addEmployeeProperty= By.id("menu_pim_addEmployee");
      WebElement    addEmployee=  driver.findElement(addEmployeeProperty);
      addEmployee.click();
      //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
      String Expected_FristNameTextData="Rakesh";
      By  Firstnameproperty =By.id("firstName");
      WebElement     Firstname=driver.findElement(Firstnameproperty);
      Firstname.sendKeys(Expected_FristNameTextData);
      //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
      String Expected_MiddleNameTextDaa="Prajapathi";
      By  middlenameproperty= By.id("middleName");
      WebElement meddlename=driver.findElement(middlenameproperty);
      meddlename.sendKeys(Expected_MiddleNameTextDaa);
      //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
       String Expected_LastNAmeTextData="Kalvacherla";
       By Lastnameproperty =By.id("lastName");
       WebElement Lastname=driver.findElement(Lastnameproperty);
       Lastname.sendKeys(Expected_LastNAmeTextData);
      //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
       By EmployeeidProperty=By.id("employeeId");
       WebElement Employeeid=driver.findElement(EmployeeidProperty);
       
       String Expected_Employeeidvalue=Employeeid.getAttribute("value");
       System.out.println("The Text of the Expected webElement employee id is:-"+Expected_Employeeidvalue);
       //<input type="button" class="" id="btnSave" value="Save">
       By SaveButtonProperty=By.id("btnSave");
       WebElement Savebutton=driver.findElement(SaveButtonProperty);
       Savebutton.click();
       //id="personal_txtEmpFirstName"
       By FirstNameproperty2=By.id("personal_txtEmpFirstName");
       WebElement FirstNameElement=driver.findElement(FirstNameproperty2);
       
       
       
       
       String Actual_FirsnameElementValue=FirstNameElement.getAttribute("value");
       System.out.println("The Actual value of the First name is:-"+Actual_FirsnameElementValue);
        if(Actual_FirsnameElementValue.equals(Expected_FristNameTextData))
        {
        System.out.println("The Employee First NAme value is Matched:-PASS");
        }
        else
        {
        System.out.println("The Employee first NAme value is Not Matched:-FAIL");	 	
        }
      //id="personal_txtEmpMiddleName"
        By MiddleNameProperty2 = By.id("personal_txtEmpMiddleName");
        WebElement MiddleNameElement=driver.findElement(MiddleNameProperty2);
        
        String Actual_MiddleNameELementValue=MiddleNameElement.getAttribute("value");
        System.out.println("The Actual value of the middle name is :-"+Actual_MiddleNameELementValue);
        
        if(Actual_MiddleNameELementValue.equals(Expected_MiddleNameTextDaa)) 
        {
        	System.out.println("The Employee MiddleNAme value is Matched:-Pass");
        }
        else
        {
        	System.out.println("The Employe MiddleNAme value is Not matched :-Fail");
        	 }
        
      //id="personal_txtEmpLastName"
        By LastNAmeProperty2=By.id("personal_txtEmpLastName");
        WebElement LastNameElement=driver.findElement(LastNAmeProperty2);
        
        String Actual_LastNameElementValue=LastNameElement.getAttribute("value");
        System.out.println("The Actual value of the Last name is :-"+Actual_LastNameElementValue);
        
        if(Actual_LastNameElementValue.equals(Expected_LastNAmeTextData)) 
        {
        	System.out.println("The Employee Last Name value is MAtched:-Pass");
         }
        else
        {
        	System.out.println("The Employee Last Name Value iss not Matched:-Fail");
         }
         //id="personal_txtEmployeeId"
        By EmployeeidProperty2 = By.id("personal_txtEmployeeId");
        WebElement Employeeidvalue=driver.findElement(EmployeeidProperty2);
        
        String Actual_Employeeidvalue=Employeeidvalue.getAttribute("value");
        System.out.println("The Actual Employee id value is :-"+Actual_Employeeidvalue);
       
        if(Actual_Employeeidvalue.equals(Expected_Employeeidvalue)) 
        {
        	System.out.println("The Employee id value is matched:-Pass");
        }
        else 
        {
        	System.out.println("The Employee id value is Not Matched:-FAIL");
        }
       
       //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
        By   WelcomeAdminProperty= By.partialLinkText("Welcome Admin");
        WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
        WelcomeAdmin.click();
        
        //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
       Thread.sleep(3000);
       By LogoutProperty=By.linkText("Logout");
       WebElement Logout=driver.findElement(LogoutProperty);
       Logout.click();
       
       driver.quit();
	}
        
}
