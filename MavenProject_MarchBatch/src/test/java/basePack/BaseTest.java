package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testScripts.LoginTestScript;
import utility.ConfigReader;
import utility.ExtentReportsHelper;

public class BaseTest
{
	public static WebDriver driver;
	static ZonedDateTime dateTime = ZonedDateTime.now();
	static DateTimeFormatter TimeFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm_ss");
    public static String dateTimeStamp = "_" + dateTime.format(TimeFormatter);
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		 
		 if(ConfigReader.readData("BrowserType").equals("CHROME"))
		 {
			 driver = new ChromeDriver();
		 }
		 else if(ConfigReader.readData("BrowserType").equals("EDGE"))
		 {
			 driver = new EdgeDriver();
		 }
		 else
		 {
			 System.out.println("Browser name is incorrect.");
		 }
		 
		 ExtentReportsHelper extentReportsHelper = new ExtentReportsHelper(driver, dateTimeStamp);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get(ConfigReader.readData("TestSiteUrl"));
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		ExtentReportsHelper.endtest();
		driver.quit();
	}
	
	
	@BeforeMethod
	public void tc_124_LoginTest() throws IOException
	{
//		ExtentReportsHelper.startTest("MyFirstMethod");
//		
//		LoginTestScript loginTestScript = new LoginTestScript();
//		loginTestScript.performLogin();
	}

	@AfterMethod
	public void tc_125_LogoutTest() throws IOException
	{
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.LogoutTestScript();
	}
	
	
	
	

}
