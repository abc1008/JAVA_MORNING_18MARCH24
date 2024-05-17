package selenium_basics_pack1;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import utility.CaptureScreen;

public class Locators
{
	
	static ZonedDateTime dateTime = ZonedDateTime.now();
	static DateTimeFormatter TimeFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm_ss");
 static String formattedDate = dateTime.format(TimeFormatter);
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		Thread.sleep(12000);   // static wait 

		// ************ LOGIN *************
		
		// finding element on UI and storing it inside a variable
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		
//		      /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input

		Thread.sleep(2000);

		// enter data in a webelement located above
		emailTextBox.sendKeys("ag89111@gmail.com");
		

		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Login@123");
		
		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]"));
	
//		btnLogin.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",btnLogin );
		
		Thread.sleep(5000);              
		
//		WebElement mp3Players = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
	
//		js.executeScript("arguments[0].click();",mp3Players );
		
		
	
		// ************ LOGOUT *************
		
		// My Account Click
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		 List<WebElement> logoutButton = driver.findElements(By.xpath("(//a[text()='Logou'])[1]"));
		
		 int numOfEleInList = logoutButton.size();
		 System.out.println("numOfEleInList  : " + numOfEleInList);
		 
		 if(numOfEleInList > 0)
		 {
			 logoutButton.get(0).click();
		 }
		 else
		 {
				// Screenshot 
//			  TakesScreenshot screen = (TakesScreenshot)driver;
//			  File screenShot = screen.getScreenshotAs(OutputType.FILE);
//			  File path = new File("D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Screenshots\\TestScreenShot.png");
//			  Files.copy(screenShot, path);
			 
			 System.out.println("formattedDate : "+ formattedDate);
			 CaptureScreen.getScreenShot(driver, "TestScreen1"+ formattedDate);
			 
			 
			 
		 }
		 
		 
		 
		

	}

}
