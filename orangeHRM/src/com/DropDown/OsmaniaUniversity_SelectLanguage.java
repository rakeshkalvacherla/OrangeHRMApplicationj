package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OsmaniaUniversity_SelectLanguage {
	String	ApplicationUrlAddress ="https://www.osmania.ac.in/";
	WebDriver driver;
	public  void ApplicationLaunch()
	{
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		}
	
	public void gettingoptionalValuesofSelectLanguagesDropDown() {
		//id="gtranslate_selector"
	By	selectLanguagesproperty=By.id("gtranslate_selector");
	WebElement selectlanguages=driver.findElement(selectLanguagesproperty);
	//<option value="">Select Language</option>
	By dropdownproperty=By.tagName("option");
	List<WebElement>selectoptionalLanguages=selectlanguages.findElements(dropdownproperty);
    int	selectOptionalLanguagesCount=selectoptionalLanguages.size();
    System.out.println("The number of languages in the select Languages drop down is:-"+selectOptionalLanguagesCount);
	
	
    for(int index=0;index<selectOptionalLanguagesCount;index++) 
    {
    String languagename	=selectoptionalLanguages.get(index).getText();
    System.out.println(index+""+languagename);
    	}
	}
	
	public void gettingoptionalValuesofSelectLanguageDropDown() {
		By	selectLanguagesproperty=By.id("gtranslate_selector");
		WebElement selectlanguages=driver.findElement(selectLanguagesproperty);
		//<option value="en|te">Telugu</option>
		Select Language=new Select(selectlanguages);
		Language.selectByVisibleText("Telugu");
	}
    public  void Applicationclose() {
    	 driver.quit();
    }
  
    public static void main(String[] args) {
		OsmaniaUniversity_SelectLanguage launch=new OsmaniaUniversity_SelectLanguage();
		launch.ApplicationLaunch();
		launch.gettingoptionalValuesofSelectLanguagesDropDown();
		launch.gettingoptionalValuesofSelectLanguageDropDown();
		//launch.Applicationclose();
      }
}

