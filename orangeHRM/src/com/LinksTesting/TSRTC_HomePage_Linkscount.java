package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_Linkscount {

	public static void main(String[] args) {
          String ApplictationURLAddress="http://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(ApplictationURLAddress);
		
	//<div class="menu-wrap">
//	<div class="menu">
//	<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
//	<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
//	<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
//	<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
//	<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
//	<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
//	<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
//	<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
//	<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
//</div>
//</div>
		/*
		       By linksProperty= By.className("menu");
		       List<WebElement>tsrtcApplictionHomepageLinks=driver.findElements(linksProperty);
		       
		        int tsrtcApplictionHomepageLinks_count=tsrtcApplictionHomepageLinks.size();
		        System.out.println("The Number of WebElements Which are of the TSRTC Application Hoome page is:-"+tsrtcApplictionHomepageLinks_count);
		       
		       for(int arrayindex=0;arrayindex<tsrtcApplictionHomepageLinks_count;arrayindex++)
		       {
		    	 String  tsrtcApplictionHomepageLinkName =tsrtcApplictionHomepageLinks.get(arrayindex).getText();
		    	 
		    	 System.out.println(arrayindex+"-"+tsrtcApplictionHomepageLinkName);
		       }
		    	 
		  		driver.quit();   
		  		*/
		             
		             /*
		               By BlockLocatorLinks  =By.className("menu-wrap");
		               WebElement BlockLocator=driver.findElement(BlockLocatorLinks);
		               
		               
		              By BlockLinksLocator  =By.tagName("a");
		              List<WebElement>BlockLinks=BlockLinksLocator.findElements(BlockLocator);
		              

		               int BlockLinks_count=BlockLinks.size();              
		               System.out.println("The Number of WebElements Which are of the TSRTC Appliction Home page is:-"+BlockLinks_count);
		               
		               for(int arrayindex=0;arrayindex<BlockLinks_count;arrayindex++) {
		               String tsrtcApplicationHomepageLinkName=BlockLinks.get(arrayindex).getText();
		               
		               System.out.println(arrayindex+"-"+tsrtcApplicationHomepageLinkName);
		               
		               BlockLinks.get(arrayindex).click();  
				        System.out.println( driver.getTitle() );
				        System.out.println( driver.getCurrentUrl());
				        System.out.println();
				         
				          
				         driver.navigate().back();
				               
				          BlockLocator=driver.findElement(BlockLocatorLinks);
				          BlockLinks=BlockLinksLocator.findElements(BlockLocator);
		               
				    }
		              */
		  By  tsrtcapplicationBlockLinksProperty  = By.className("menu-wrap");
		  WebElement tsrtcapplicationBlockLink=driver.findElement(tsrtcapplicationBlockLinksProperty);
		            
		                       
		  By  tsrtcapplicationBlockLinksLocator  = By.tagName("a");
		  List<WebElement>tsrtchomepageapplicationBlockLinks=tsrtcapplicationBlockLinksLocator.findElements(tsrtcapplicationBlockLink);
		            
		  int  tsrtchomepageBlockLintsrtchomepageapplicationBlockLinksks_count=tsrtchomepageapplicationBlockLinks.size();
		  System.out.println("The Number of Elements Which are of the TSRTC Application Home page is:-"+tsrtchomepageBlockLintsrtchomepageapplicationBlockLinksks_count);
		  
		  for(int arrayindex=0;arrayindex<tsrtchomepageBlockLintsrtchomepageapplicationBlockLinksks_count;arrayindex++)
		  {
			String tsrtchomepageapplicationBlockLinksName=tsrtchomepageapplicationBlockLinks.get(arrayindex).getText();
			
			System.out.println(arrayindex+"-"+tsrtchomepageapplicationBlockLinksName);
			
			String expected_webpageURLAddress=tsrtchomepageapplicationBlockLinks.get(arrayindex).getAttribute("href");
			tsrtchomepageapplicationBlockLinks.get(arrayindex).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			

			
		    
		    String Actual_webpageURLAddress=driver.getCurrentUrl();
			
			
			driver.navigate().back();
			
					    
			 tsrtcapplicationBlockLink=driver.findElement(tsrtcapplicationBlockLinksProperty);
			 tsrtchomepageapplicationBlockLinks=tsrtcapplicationBlockLinksLocator.findElements(tsrtcapplicationBlockLink);
		
					    
		    if(Actual_webpageURLAddress.equals(expected_webpageURLAddress))
		    {
		    	System.out.println("The  URLAddress is Matched :-Pass");
		    }
		    	else 
		    	{
		    		System.out.println("The  URLAddress is Not Matched :-Fail");
		    	}
	
		    }
		  driver.quit();
	}
			
}

