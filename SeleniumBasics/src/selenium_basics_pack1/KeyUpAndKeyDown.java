package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");

		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Thread.sleep(2000);

		Actions act = new Actions(driver);
	
		act.sendKeys("ABCD").perform();
		
		// ctrl + a   select data 
		// ctrl + c   copy 
		// tab         go to next field
		// ctrl + v   paste
		
		
		Thread.sleep(2000); 
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000); 
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000); 
		act.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(2000); 
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000); 
		System.out.println("Completed");
		
	
	}

}
