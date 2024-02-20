package com.ValidatingURlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURlAddress {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ browserdriverfiles/chromedriver.exe");
		ChromeDriver chromebrowser=new ChromeDriver();
		chromebrowser.get("http:/google.com");
		String expected_googleHomepageurlAddress="google.com";
		System.out.println("The expected Url Address of the Google home page is:-"+expected_googleHomepageurlAddress);
		String Actual_googleHomepageurlAddress="google.com";
	    System.out.println("The ActualUrl Address of the Google home page is:-\"+Actual_googleHomepageurlAddress");
	    if(Actual_googleHomepageurlAddress.contains(expected_googleHomepageurlAddress)){
			System.out.println("Sucessfully Navigated to google Home page_Url Address found_pass");
		}
		else {
			System.out.println("Failed to Navigated Google Home page_Url Address Not Found_FAIL");
		}
		chromebrowser.close();
		

		
	}

}
