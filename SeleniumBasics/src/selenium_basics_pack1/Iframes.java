package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://ui.vision/demo/webtest/frames/");
			
			Thread.sleep(3000);
			
			 WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
			
			driver.switchTo().frame(frame3);  // switch selenium focus from main page to iframe
			
			driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("ABCD");
			
			
			// *************  iframe inside  iframe
			
			WebElement humanIframe = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/forms/d/1yfUq-GO9B')]"));
			driver.switchTo().frame(humanIframe);
			
			Thread.sleep(3000);
			
			 WebElement radioButton = driver.findElement(By.xpath("//span[text()='I am a human']"));
			
			 JavascriptExecutor js =  (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView();", radioButton);
			
			 radioButton.click();
			 
			 // ***** update text in previous field
			 
//			 driver.switchTo().frame(frame3); 
			 
			 driver.switchTo().parentFrame();  //  to switch the focus of selenium to the parent frame of currently focused frame
			 
			driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("XYZ");
			 
			 
				
			
//			// *******************  handle another iframe 
//			 
//				Thread.sleep(3000);
//				
//			 driver.switchTo().defaultContent();   // switch focus of selenium to main page
//			 WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
//			
//			 driver.switchTo().frame(frame4);
//			 driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("PQRS");
			
			
		}
}
