package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker
{
		public static void main(String[] args) throws InterruptedException
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Datepicker.html");
			
			Thread.sleep(3000);
			
			
			// date : 29 April 2021
			
			 WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker1']"));
			 datePicker.click();
			 
			 Thread.sleep(2000);
//			  WebElement previousButton = driver.findElement(By.xpath("//a[@title='Prev']"));
//			   WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
//			   monthYear.getText();
			   
//			   System.out.println(monthYear.getText());
			   int i = 0;
			   
			   while(i == 0)    // always true condition
			   {
			  	 WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			  	 
			  	 String monthYearText = monthYear.getText();
			  	 System.out.println(monthYearText);
			  	 
			  	 WebElement previousButton = driver.findElement(By.xpath("//a[@title='Prev']"));
			  	 
			  	 if(!(monthYear.getText().equals("April 2021")))
			  	 {
			  		 previousButton.click();
			  	 }
			  	 else
			  	 {
			  		 break;
			  	 }
			   }
			
			
			
		}
}

