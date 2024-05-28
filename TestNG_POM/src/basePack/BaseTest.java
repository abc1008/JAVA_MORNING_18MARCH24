package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testScripts.LoginTestScript;

public class BaseTest
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void initBrowser()
	{
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo/");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	@BeforeMethod
	public void tc_124_LoginTest()
	{
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogin();
	}

	@AfterMethod
	public void tc_125_LogoutTest()
	{
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.LogoutTestScript();
	}
	
	
	
	

}
