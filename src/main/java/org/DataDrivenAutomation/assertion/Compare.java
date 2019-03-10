package org.DataDrivenAutomation.assertion;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	public static boolean validatepageURL(WebDriver driver, String expextedURL)	
	{
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expextedURL))
		{
			flag=true;
		}
		
		return flag;
	}
	
	public static boolean validatepageTitle(WebDriver driver, String expextedTitle)	
	{
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase(expextedTitle))
		{
			flag=true;
		}
		
		return flag;
	}

}
