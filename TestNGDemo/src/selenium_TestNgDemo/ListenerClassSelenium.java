package selenium_TestNgDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.CaptureScreen;

public class ListenerClassSelenium extends ListenerTestSelenium implements ITestListener
{
//	WebDriver driver;
	
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("onTestStart : "+result.getName());
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
		
		try
		{
			CaptureScreen.getScreenShot(driver, "ListenerScreenshot");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
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
