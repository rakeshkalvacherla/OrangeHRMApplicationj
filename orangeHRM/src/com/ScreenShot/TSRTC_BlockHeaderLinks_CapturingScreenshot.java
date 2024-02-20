package com.ScreenShot;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_BlockHeaderLinks_CapturingScreenshot {
public static void main(String[] args) throws IOException {
   WebDriver driver;
   String	ApplicationurlAddress="https://www.tsrtconline.in/oprs-web/";
   System.setProperty("webdriver.chrome.driver","./browserDriverfiles/chromedriver.exe");
   driver=new ChromeDriver();
   driver.get(ApplicationurlAddress);
   
   
    //<div class="menu-wrap">
//  <div class="menu">
	//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//	Home</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		//<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		//<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
		//<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
		//<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
//</div>  
//</div>
        //identifying the property of the Header Block of the Webpage 
       By tsrtc_HeaderLinksProperty =By.className("menu-wrap");
       WebElement HeaderLinksProperty=  driver.findElement(tsrtc_HeaderLinksProperty);
       
       //identifying common Property of the Elements
        By tsrtc_HeaderblockLinksproperty= By.tagName("a");
        List<WebElement>tsrtcHeaderblockLinks= HeaderLinksProperty.findElements(tsrtc_HeaderblockLinksproperty);
        
        //Finding the Size of the Arraylist
        int tsrtc_HeaderBlockLinksCount =tsrtcHeaderblockLinks.size();
        System.out.println("The Number of Links in the Header block of TSRTC Application Home page is:-"+tsrtc_HeaderBlockLinksCount);
        
        for(int arrayindex=0;arrayindex<tsrtc_HeaderBlockLinksCount;arrayindex++) 
        {
        String	tsrtc_HeaderBlockLinkName=tsrtcHeaderblockLinks.get(arrayindex).getText();
        System.out.println(arrayindex+"-"+tsrtc_HeaderBlockLinkName);
        
        String   expected_HeaderBlockLinksUrlAddress= tsrtcHeaderblockLinks.get(arrayindex).getAttribute("href");
        System.out.println(expected_HeaderBlockLinksUrlAddress);
        
        tsrtcHeaderblockLinks.get(arrayindex).click();
        
        String   Actual_WebpageTitle= driver.getTitle();
        System.out.println(Actual_WebpageTitle); 
       
        String Actual_WebpageUrlAddress =driver.getCurrentUrl();
        System.out.println(Actual_WebpageUrlAddress);
        
        if(Actual_WebpageUrlAddress.equals(expected_HeaderBlockLinksUrlAddress)) 
        {
        	System.out.println("Sucecessfully Navigated to Link releted Webpage url Address:-Pass");
        }
        else {
        	System.out.println("Failed to Navigated to Link related Webpage url Address:-Fail");
        }
        
        //Capturing the ScreenShots of the current navigated webpage
        
         File   WebpageScreenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
         FileUtils.copyFile(WebpageScreenShot,new File("./ApplicatonScreenshots/"+arrayindex+tsrtc_HeaderBlockLinkName+".png"));
         
         HeaderLinksProperty=  driver.findElement(tsrtc_HeaderLinksProperty);
         tsrtcHeaderblockLinks= HeaderLinksProperty.findElements(tsrtc_HeaderblockLinksproperty);
         }
        
        
            
       driver.quit();

        

	

}
}
