package testScripts;

import basePack.BaseTest;
import pageClasses.LoginPage;

public class LoginTestScript extends BaseTest
{
	public void performLogin()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
	
	public void LogoutTestScript()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.logout();
	}
	
	
	
	
	
	
}
