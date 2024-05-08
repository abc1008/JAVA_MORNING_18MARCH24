package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup
{
	
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://groww.in/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("ABCD");

	
	
	
	
}

}
