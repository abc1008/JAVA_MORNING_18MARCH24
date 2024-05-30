package basePack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testScripts.LoginTestScript;
import utility.ExtentReportsHelper;

public class ListenerClass implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("onTestStart : "+result.getName());
		
		String currentTestCaseName = result.getName();
		
		ExtentReportsHelper.startTest(currentTestCaseName);
		
		LoginTestScript loginTestScript = new LoginTestScript();
		try 
		{
			loginTestScript.performLogin();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess : "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("onTestFailure : " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped : "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("onFinish");
	}
	
	
	
	

}
