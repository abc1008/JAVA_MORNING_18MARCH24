package testSuites;

import org.testng.annotations.Test;

import basePack.BaseTest;
import testScripts.LoginTestScript;

public class LoginTestSuite extends BaseTest
{

	@Test
	public void tc_124_LoginTest()
	{
		LoginTestScript loginTestScript =  new LoginTestScript();
		loginTestScript.performLogin();
	}
	
	
	
	
	
	
	
}
