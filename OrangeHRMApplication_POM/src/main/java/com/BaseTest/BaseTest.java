package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Utitlity.Log;

public class BaseTest {
	
    public static WebDriver driver;
    String ApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
    @Test
	public void applicationLaunch() {
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationURLAddress);
		driver.manage().window().maximize();
		
		Log.info("Successfully Navigated to OrangeHRM Application LoginPage");
		}
   // @Test
	//public void applicationclose() {
		//driver.quit();
		//Log.info("ChromeBrowser Along With OrangeHRM Application closed Successfully");
	//}
	

}
