package selenium_basics_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns
{
	
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	
	Thread.sleep(3000);
//		driver.findElement(By.xpath("//select[@id='day']")).click();
//		Thread.sleep(3000);
//		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));
//		
//		for(   WebElement day  : days  )
//		{
//			  String dayNumber = day.getText();
//			  System.out.println(dayNumber);
//			  
//			  if(dayNumber.equals("20"))
//			  {
//			  		day.click();
//			  }
//		}
		
//		  **************  2nd Way to handle dropdowns *************
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel = new Select(month);
		sel.selectByIndex(5);   
		
		sel.selectByValue("9");
		
		sel.selectByVisibleText("Nov");
		
		
	
	
}
	
	
	
	
	

}
