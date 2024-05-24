package selenium_basics_pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups
{
	
	
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();

	
	
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	
	Thread.sleep(2000);
	driver.switchTo().alert().accept();     // click on OK button in alert popup
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();    // click on Cancel button in alert popup
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	Thread.sleep(2000);
	
	
	  Alert alertPopup = driver.switchTo().alert();
	
	 System.out.println(alertPopup.getText());
	Thread.sleep(2000);
	 alertPopup.accept();

	
	
}

}
