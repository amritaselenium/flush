package org.DataDrivenAutomation.pages;

import org.DataDrivenAutomationDemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String uname) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(uname);
	}
	
	public void enterPassword(String passwd) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(passwd);
	}
	
	public void clickSignIn() throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).click();
	}
	
	public void enterSignupEmail(String email) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("signup_email_id"))).sendKeys(email);
	}
	
	public void enterSignupPassword(String signuppassword) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("signup_password_id"))).sendKeys(signuppassword);
	}
	
	public void clickSignUP() throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("signup_button_xpath"))).click();
	}
	
	
	
}
