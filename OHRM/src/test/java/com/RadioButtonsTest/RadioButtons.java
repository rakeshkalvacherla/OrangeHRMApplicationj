package com.RadioButtonsTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Utility.Log;


public class RadioButtons extends BaseTest {
	@Test
	public void RadioButtonsTesting() throws InterruptedException {
		
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group1" value="Cheese">
		
		//<input type="radio" name="group2" value="Water">
		//<input type="radio" name="group2" value="Beer">
		//<input type="radio" name="group2" value="Wine" checked="">
		
	By	Group1RadioButonProperty=By.name("group1");
	List<WebElement>Group1RadioButton= driver.findElements(Group1RadioButonProperty);
	
	By Group2RadioButtonsProperty=By.name("group2");
	List<WebElement>Group2RadioButton=driver.findElements(Group2RadioButtonsProperty);
	 
	int Group1RadioButtonsCount=Group1RadioButton.size();
	int Group2RadioButtonsCount=Group2RadioButton.size();
	
    Log.info("The Number of Radio Buttons Group1 are:-"+Group1RadioButtonsCount);
    Log.info("The Number of Radio Buttons Group2 are:-"+Group2RadioButtonsCount);
    
    //Combine both groups into a single list
    List<WebElement>AllRadioButtons= new ArrayList<>();
    AllRadioButtons.addAll(Group1RadioButton);
    AllRadioButtons.addAll(Group2RadioButton);
    
    
    for(WebElement RadioButton:AllRadioButtons) {
    String	RadioButtonName=RadioButton.getAttribute("value");
    Log.info(RadioButtonName);
    RadioButton.click();
    Thread.sleep(3000);
    
    
    for(WebElement RadioButtonStatus:AllRadioButtons) {
    	Log.info(RadioButtonStatus.getAttribute("value") +""+RadioButtonStatus.getAttribute("checked"));
    }
    }
	
	
	
	
	}

}
