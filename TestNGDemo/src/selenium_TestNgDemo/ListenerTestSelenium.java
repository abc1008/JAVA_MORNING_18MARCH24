package selenium_TestNgDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

@Listeners(selenium_TestNgDemo.ListenerClassSelenium.class)
public class ListenerTestSelenium
{
	 static WebDriver driver;
	
	@BeforeSuite
	public void initializeBrowser()
	{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu-right')]//a[text()='Login']")).click();
		
		// finding element on UI and storing it inside a variable
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		
		// enter data in a webelement located above
		emailTextBox.sendKeys("ag89111@gmail.com");

//		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Login@123");
		
//		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]"));
	
		btnLogin.click();
		
	Thread.sleep(2000);
	}
	
	@Test
	public void clickOnAddrBook()
	{
		driver.findElement(By.xpath("//aside//a[text()='Address Book']")).click();
		
	  WebElement breadCrumb = driver.findElement(By.xpath("//ul//a[text()='Address Book']"));
	  
	   boolean isWebElementDisplayed = breadCrumb.isDisplayed();
	  
	  org.testng.Assert.assertEquals(isWebElementDisplayed, false);
	  
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		// My Account Click
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 List<WebElement> logoutButton = driver.findElements(By.xpath("(//a[text()='Logout'])[1]"));
		
		 int numOfEleInList = logoutButton.size();
		 System.out.println("numOfEleInList  : " + numOfEleInList);
		 
		 if(numOfEleInList > 0)
		 {
			 Thread.sleep(2000);
			 logoutButton.get(0).click();
		 }
	}
	
	@AfterSuite
	public void closeBrowser()
	{
//		driver.close();  // close currently focused window
		driver.quit();  // close the entire browser
	}
	

}
