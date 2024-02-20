package com.AddEmployee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	
	String ApplicationUrlAdderss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Desktop\\Rakeshk\\orangeHRM\\browserdriverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAdderss);
		driver.manage().window().maximize();
		Log.info("successfully Navigated to OrangeHRM Application Login page");
		
		}
                                                                                    
    @AfterTest
	public void ApplicationClose() {
	driver.quit();
	Log.info("Chrome Browser Along With Orange Application closed Successfully");
	}
	
}
