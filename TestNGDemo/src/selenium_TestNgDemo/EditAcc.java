package selenium_TestNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EditAcc 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		
		WebElement emailBox = driver.findElement(By.cssSelector("input#input-email"));
		
		emailBox.sendKeys("ag89111@gmail.com");  // enter email id on UI
		

		WebElement passwordBox = driver.findElement(By.cssSelector("input.form-control[name='password']"));
		passwordBox.sendKeys("Login@123");   // enter password id on UI
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();   // click login method
		
		
		
		
		driver.findElement(By.xpath("//a[text()='Edit Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("XYZ");
		
		
		driver.findElement(By.xpath("//input[@value = 'Continue']")).click();
		
		
		
		WebElement alertMsg =  driver.findElement(By.xpath("//div[contains(text(),'Success: Your account has been successfully updated.')]"));
		
		
//		boolean isSuccessMsgDisplayed = alertMsg.isDisplayed();
//		
//		Assert.assertTrue(isSuccessMsgDisplayed);
		
		
		if(alertMsg.isDisplayed())
		{
			System.out.println("Account successfully updated.");
		}
		else {
			System.out.println("Account not successfully updated.");
		}
		
		
		
		
		Thread.sleep(3000);   // stop for 3 secs after login
		
		WebElement myAcc = driver.findElement(By.xpath("//a[@title='My Account']"));  // locate Webelement
		myAcc.click();  // click operation
		

		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
