package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	public WebDriver driver;
	String ApplicationURLAddress="https://echoecho.com/htmlforms10.htm";

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationURLAddress);
		driver.manage().window().maximize();
		}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
