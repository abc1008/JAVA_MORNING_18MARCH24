package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/checkboxes");
		
		Thread.sleep(5000);
		
		 WebElement chkbx = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		
		 chkbx.click();
		 
		 	
		
		 Thread.sleep(2000);
		
		 WebElement chkbx2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		 boolean isSelected = chkbx2.isSelected();      // method to check if checkbox is checked or not
		 System.out.println("Checkbox is checked ?  --> " + isSelected);
		 
		 Thread.sleep(2000);
		  boolean isCheckboxDisplayed = chkbx2.isDisplayed();   // method to check if checkbox is displayed or not
		  System.out.println("Checkbox is displayed ?  --> " + isCheckboxDisplayed);
		  
		  Thread.sleep(2000);
		  boolean isCheckboxEnabled = chkbx2.isEnabled();   // method to check if checkbox is enabled or not
		  System.out.println("Checkbox is enabled ?  --> " + isCheckboxEnabled);
		  
		  
		
	}
	
	

}
