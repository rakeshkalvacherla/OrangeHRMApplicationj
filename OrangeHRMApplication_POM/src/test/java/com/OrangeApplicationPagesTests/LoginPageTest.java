package com.OrangeApplicationPagesTests;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeApplicationPages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test(priority=1,description="Validating OrangeHRM Application LoginPage Loginpanel Test Text")
	public void OrangeHRMApplicationLoginPAgeLoginPanelValidation()
	{

      LoginPage loginpage=new LoginPage();
      loginpage.OrangeHRMAppllicationLoginPage_LoginpanelTextValidation();
	}
	@Test(priority=2,description="validating OrangeHRM Application Login page Logo  ")
	public void OrangeHRMApplicationLoginpage_LogoValidation() {
		LoginPage loginpage=new LoginPage();
		loginpage.OrangeHRMApplicationLoginPageLogoValidation();
		
	}
}