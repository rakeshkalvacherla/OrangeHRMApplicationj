package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseTest {


WebDriver driver;

String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

@BeforeTest
public void setUp()
{

System.setProperty("webdriver.chrome.driver", "./browserdriverfiles/chromedriver.exe");
driver = new ChromeDriver();

driver.get(applicationUrlAddress);

driver.manage().window().maximize();

}
/*
@AfterMethod
public void applicationClose() {
 
        driver.quit();


}
*/
}
