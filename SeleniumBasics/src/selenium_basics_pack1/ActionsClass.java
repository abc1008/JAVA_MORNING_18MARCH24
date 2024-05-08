package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{
		public static void main(String[] args) throws InterruptedException
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			Thread.sleep(2000);
			
			WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
			
			Actions act = new Actions(driver);   // object of actions class
			act.contextClick(rightClick).perform();      // right click 
			
			
			WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
			act.doubleClick(doubleClick).perform();
			
			
			act.moveToElement(doubleClick).build().perform();
			
			
			
			
			
			
		}
}
