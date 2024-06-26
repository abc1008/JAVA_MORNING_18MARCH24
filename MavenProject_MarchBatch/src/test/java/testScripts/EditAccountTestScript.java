package testScripts;

import java.io.IOException;

import basePack.BaseTest;
import ecommAppPack.EcommApplication;
import pageClasses.EditAccountPage;
import utility.ExtentReportsHelper;

public class EditAccountTestScript extends BaseTest
{
	
	public boolean performEditAccount() throws IOException
	{
		boolean testResult;
		
//		EditAccountPage editAccountPage =  new EditAccountPage(driver);
//		testResult = editAccountPage.editAccunt();
		
		testResult = EcommApplication.editAccountPage().editAccunt();
		
		if(testResult)
		{
//			System.out.println("Successfully performed Edit Account test.");
			
			ExtentReportsHelper.logPass("Successfully performed Edit Account test.");
			testResult = true;
		}
		else 
		{
//			System.out.println("Failed to perform Edit Account test.");
			
			ExtentReportsHelper.logFail("Failed to perform Edit Account test.");
			testResult = false;
		}
		
		return testResult;
	}
	
	

}
