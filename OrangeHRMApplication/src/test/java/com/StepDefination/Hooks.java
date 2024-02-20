package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
  public static WebDriver driver;
  
	@Before
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver =new ChromeDriver();
		Log.info("Chrome Browser Launched Successfully");
	}
	@After
	public static void tearDown() {
		driver.quit();
		Log.info("Browser Closed With Application Successfully");
		
	}

}
