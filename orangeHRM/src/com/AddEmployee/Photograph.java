package com.AddEmployee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Utility.Log;


public class Photograph extends BaseTest{
	FileInputStream propertiesFile;
	Properties proereties;
	@Test(priority=1,description="Validating OrangeHRM Application  Login Functionality")
	public void loginpageTest() throws IOException { 
		
		propertiesFile=new FileInputStream("./src/com/Config/OrangeHrmApplication.properties");
	    proereties=new Properties();
		proereties.load(propertiesFile);
		
		//id="txtUsername"
    By usernameProperty=By.id(proereties.getProperty("orangeHRMLoginPageUserNameProperty"));
    WebElement username=driver.findElement(usernameProperty);
    username.sendKeys("Rakesh");
    //id="txtPassword"
    By passwordproperty=By.id(proereties.getProperty("orangeHRMLoginpagePasswordProperty"));
    WebElement password=driver.findElement(passwordproperty);
    password.sendKeys("Rakesh@1996");
    //id="btnLogin"
    By LoginButtonProperty=By.id(proereties.getProperty("orangeHRMLoginpageLoginButtonProperty"));
    WebElement LoginButton=driver.findElement(LoginButtonProperty);
    LoginButton.click();
	}
	@Test(priority=2,description="validating OrangeHRM Orange Application HomePage Pim Functionality ")
	public void PimTest() {
		//id="menu_pim_viewPimModule"
	By 	pimProperty=By.id(proereties.getProperty("orangeHRMHomepagepimElementproperty"));
	WebElement pim=driver.findElement(pimProperty);
		
		Actions MouseHover=new Actions(driver);
		MouseHover.moveToElement(pim).build().perform();
		
	}
	@Test(priority=3,description="Validating OrangeHRM Application Pim-AddEmployee Functionality Test")
	public void pimAddEmployeeTest() {
		//id="menu_pim_addEmployee"
	By	AddemployeeProperty=By.id(proereties.getProperty("orangeHRMHomepageAddEmployeeElementproperty"));
	WebElement Addemployee =driver.findElement(AddemployeeProperty);
	Addemployee.click();
	}
	@Test(priority=4,description="Validating Orange Application AddEmployee Functionality Test")
	public void AddEmployeTest() throws InterruptedException, IOException {
		//id="firstName"
	By	FirstNameProperty=By.id(proereties.getProperty("orangeHRMAddEmployeeFirstNameElementProperty"));
	WebElement FirstName=driver.findElement(FirstNameProperty);
	FirstName.sendKeys("Kalvacherla");
	
	Actions KeyBoardActions=new Actions(driver);
	KeyBoardActions.sendKeys(Keys.TAB).build().perform();
	
	KeyBoardActions.sendKeys("Rakesh").build().perform();
	KeyBoardActions.sendKeys(Keys.TAB).build().perform();
	
	KeyBoardActions.sendKeys("sharma").build().perform();
	KeyBoardActions.sendKeys(Keys.TAB).build().perform();
	
	KeyBoardActions.sendKeys(Keys.TAB).build().perform();
	KeyBoardActions.sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(3000);
	
	java.lang.Runtime.getRuntime().exec("./AutoItTestScripts/photograph1.exe");
	Thread.sleep(3000);
	
	By SaveButtonproperty=By.id(proereties.getProperty("orangeHRMAddEmployeeSaveButtonProperty"));
	WebElement SaveButton=driver.findElement(SaveButtonproperty);
	SaveButton.click();
}
	@Test(priority=5,description="Validating Orange Application personalDetails Page Test")
	public void personalDetailsTest() {
		
	By	personaldetailspageimageProperty=By.id(proereties.getProperty("orangeHRMpersonalDetailspagePhotographElementProperty"));
	WebElement personaldetailsEmployeeimage=driver.findElement(personaldetailspageimageProperty);
	
	boolean flag=personaldetailsEmployeeimage.isDisplayed();
	if(flag) {
		Log.info("Employee photograph exixting:-pass ");
	}
	else {
		Log.info("Employee photograph Not Existing:-Fail");
	}
	}

}