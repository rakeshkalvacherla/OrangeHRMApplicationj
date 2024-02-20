package com.OrangeApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utitlity.Log;

public class LoginPage extends BaseTest{
	
	public LoginPage() {  //constructor_When a Class NAme is Similar to the method Name
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Object Repository Class
   //<div id="logInPanelHeading">LOGIN Panel</div>
	
	//1.Identification WebElements
	@FindBy(id="logInPanelHeading")
	WebElement loginpanelText;
	
	//2.Performing Operation on the WebElements-business logics(user defined Method)
	public void OrangeHRMAppllicationLoginPage_LoginpanelTextValidation() {
		String expected_OrangeApplicationLoginPageLoginPanelText="LOGIN Panel";
		Log.info("The Expected Text of the WebElement LoginPanel is:_"+expected_OrangeApplicationLoginPageLoginPanelText);
		String Actual_OrangeApplicationLoginpageLoginPanelText=loginpanelText.getText();
		Log.info("The Actual Text of the WebElement LoginPanel is:-"+Actual_OrangeApplicationLoginpageLoginPanelText);
		if(Actual_OrangeApplicationLoginpageLoginPanelText.equals(expected_OrangeApplicationLoginPageLoginPanelText)) 
		{
			Log.info("Login Panel Text Validation Successful:-pass");
		}
		else
		{
			Log.info("Login Panel Text validation Not Successful:-Fail");
			
		}
	}
		
		///html/body/div[1]/div/div[2]/div/img
		@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
		WebElement OrangeHRMApplicationLoginPageLogo;
		
		public void OrangeHRMApplicationLoginPageLogoValidation() {
			boolean flag=OrangeHRMApplicationLoginPageLogo.isDisplayed();
			if(flag) {
			Log.info("OrangeHRM Application Loginpage Logo  found:-Pass");
			}
			else {
				Log.info("OrangeHRM Application LoginPage Logo  Not Found:-fail");
			}
			
		}
	
	}

	