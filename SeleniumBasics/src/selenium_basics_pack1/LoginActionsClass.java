package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginActionsClass
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
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();     // Pressing Tab key on keyboard
		
		Thread.sleep(2000);
		act.sendKeys("Login@123").perform();
		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("Login@123");
		
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
//		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
	
	   
		

		
		
		
	
	}

}
