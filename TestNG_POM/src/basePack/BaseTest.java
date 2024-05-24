package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void initBrowser()
	{
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		 
	}
	
	
	
//	@AfterSuite
//	public void closeBrowser()
//	{
//		driver.quit();
//	}
	
	
	
	
	
	
	

}
