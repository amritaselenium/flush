package org.DataDrivenAutomation.testcases;

import org.DataDrivenAutomation.base.DriverInstance;
import org.DataDrivenAutomation.dataGenerator.DataGenerator;
import org.DataDrivenAutomation.pages.LoginPage;
import org.testng.annotations.Test;

public class TC_001_validateSignUPFunctionalityTest extends DriverInstance {

	@Test(dataProvider="Excel",dataProviderClass=DataGenerator.class)
	public void TC_001_signUpFunctionality(String signupemail, String signuppwd) throws Exception
	{
		LoginPage loginsignup= new LoginPage(driver);
		
		loginsignup.enterSignupEmail(signupemail);
		loginsignup.enterPassword(signuppwd);
		loginsignup.clickSignUP();
		
	}
}
