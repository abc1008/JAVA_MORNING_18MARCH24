package selenium_TestNgDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class LoginSelenium
{
	WebDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
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
		
	Thread.sleep(4000);
	}
	
	@Test
	public void clickOnAddrBook()
	{
		driver.findElement(By.xpath("//aside//a[text()='Address Book']")).click();
		
	  WebElement breadCrumb = driver.findElement(By.xpath("//ul//a[text()='Address Book']"));
	  
	   boolean isWebElementDisplayed = breadCrumb.isDisplayed();
	  
	  org.testng.Assert.assertEquals(isWebElementDisplayed, true);
	  
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
	
	
	

}
