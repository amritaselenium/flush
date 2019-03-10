package org.DataDrivenAutomation.testcases;

import java.io.FileInputStream;
import org.DataDrivenAutomation.base.DriverInstance;
import org.DataDrivenAutomation.dataGenerator.DataGenerator;
import org.DataDrivenAutomation.pages.LoginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_validateLoginFunctionalityTest extends DriverInstance {
	
	@Test(dataProvider="Excel",dataProviderClass=DataGenerator.class)
	private void TC_001_loginFunctionality(String uname, String pwd) throws Exception 
	{
		LoginPage login=new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pwd);
		login.clickSignIn();
	}
}
