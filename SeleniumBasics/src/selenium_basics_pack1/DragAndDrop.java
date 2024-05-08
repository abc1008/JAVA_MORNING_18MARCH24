package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{	
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/droppable");
			
			Thread.sleep(5000);
			
			 WebElement formsEle = driver.findElement(By.xpath("//div[text()='Forms']"));
			 
//			  to perform scroll
			 JavascriptExecutor js = (JavascriptExecutor)driver;   								 // tyecasting
			 js.executeScript("arguments[0].scrollIntoView();", formsEle);
			
			 WebElement dragEle = driver.findElement(By.xpath("//div[@id='draggable']"));
			 WebElement dropEle = driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@id='droppable']"));
			 
			 Actions act = new Actions(driver);
			 
			 Thread.sleep(2000);
			 act.clickAndHold(dragEle).perform();
			 
			 Thread.sleep(2000);
			 act.moveToElement(dropEle).click().build().perform();
			 
			 System.out.println("Completed");
			 
			
		}

}
