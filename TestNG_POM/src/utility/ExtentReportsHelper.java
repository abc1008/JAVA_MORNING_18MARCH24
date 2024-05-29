package utility;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import basePack.BaseTest;

public class ExtentReportsHelper extends BaseTest{
	
	static ExtentReports extentReports;
	ExtentSparkReporter extentSparkReporter;
	static ExtentTest extentTest;
	
	public ExtentReportsHelper()
	{
		extentReports = new ExtentReports();
		String projectPath = System.getProperty("user.dir"); 
		String reportPath = projectPath + "\\TestResults\\TestReport" + dateTimeStamp + ".html";
		extentSparkReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(extentSparkReporter);
	}
	
	
	
	public static void startTest(String testCaseName)
	{
		extentTest = extentReports.createTest(testCaseName);
		
	}
	
	public static void logPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void logFail(String message) throws IOException
	{
		extentTest.log(Status.FAIL, message,getScreenShot(driver,"TestSSName"));
	}
	
	
	public static void logSkip(String message)
	{
		extentTest.log(Status.SKIP, message);
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void logWarning(String message)
	{
		extentTest.log(Status.WARNING, message);
	}
	
	
	public static void endtest()
	{
		extentReports.flush();
	}
	

	
	public static Media getScreenShot(WebDriver driver, String fileName) throws IOException
	{
	  TakesScreenshot screen = (TakesScreenshot)driver;
	  String screenShot = screen.getScreenshotAs(OutputType.BASE64);
	  
//	  File path = new File("D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Screenshots\\" + fileName + ".png");
//	  Files.copy(screenShot, path);
	  
	   return MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot).build();
	}
	
	
}
