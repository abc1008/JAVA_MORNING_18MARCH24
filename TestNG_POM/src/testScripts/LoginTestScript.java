package testScripts;

import java.io.IOException;

import basePack.BaseTest;
import pageClasses.LoginPage;

public class LoginTestScript extends BaseTest
{
	public void performLogin() throws IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
	
	public void LogoutTestScript() throws IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.logout();
	}
	
	
	
	
	
	
}
