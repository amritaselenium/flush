package org.DataDrivenAutomation.base;

import org.DataDrivenAutomationDemo.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverInstance {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void initiatedriverInstance() throws Exception 
	{
		if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			
		}		
				
		
		driver.get(Utility.fetchProperty("applicationURL").toString());		
	}
	
	@AfterMethod
	public void closedriverInstance()
	{
		driver.quit();
	}
	
}
