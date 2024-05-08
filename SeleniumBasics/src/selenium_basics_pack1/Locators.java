package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		Thread.sleep(2000);

		// ************ LOGIN *************
		
		// finding element on UI and storing it inside a variable
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		
//		      /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input

		Thread.sleep(2000);

		// enter data in a webelement located above
		emailTextBox.sendKeys("ag89111@gmail.com");
		

		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Login@123");
		
		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]"));
	
//		btnLogin.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",btnLogin );
		
		Thread.sleep(5000);              
		
//		WebElement mp3Players = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
	
//		js.executeScript("arguments[0].click();",mp3Players );
		
		
	
		// ************ LOGOUT *************
		
		// My Account Click
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
		
		
	
	}

}
