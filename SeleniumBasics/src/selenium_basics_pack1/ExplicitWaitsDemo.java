package selenium_basics_pack1;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.TimeoutExceededException;

public class ExplicitWaitsDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		Thread.sleep(3000);
		
		// elementToBeClickable
		
//		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
//		
//		WebElement disabledButton = driver.findElement(By.xpath("//button[@id='disable']"));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(disabledButton));
//		
//		// after 10 secs, below line should be executed
//		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		
		
		
	// visibilityOf element
		
//		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
//		
//		WebElement hiddenButton = driver.findElement(By.xpath("//button[@id='hidden']"));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(hiddenButton));
//		
//		// after 10 secs, below line should be executed
//		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		
		
		// wait for alert to be displayed
		
//		driver.findElement(By.xpath("//button[@id='alert']")).click();   // timer starts
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		// after 5 secs,alert popup will be displayed
//		driver.switchTo().alert().accept();
		
		
		
		// textToBePresentInElement
		
//	driver.findElement(By.xpath("//button[@id='populate-text']")).click();   // timer starts
//	
//	WebElement textToVerify = driver.findElement(By.xpath("//h2[@id='h2']"));
//	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//	wait.until(ExpectedConditions.textToBePresentInElement(textToVerify, "Selenium Webdriver"));
//	
//	// after 10 secs, below line should be executed
//	driver.findElement(By.xpath("//button[@id='alert']")).click();
	
	
	
	// fluent wait 
		
	driver.findElement(By.xpath("//button[@id='populate-text']")).click();   // timer starts
	
	WebElement textToVerify = driver.findElement(By.xpath("//h2[@id='h2']"));
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(60))
			.pollingEvery(Duration.ofMillis(100))
			.ignoring(ArrayIndexOutOfBoundsException.class)
			.ignoring(NullPointerException.class)
			.ignoring(Exception.class);
	
	wait.until(ExpectedConditions.textToBePresentInElement(textToVerify, "Selenium Webdriver"));
	
	// after 10 secs, below line should be executed
	driver.findElement(By.xpath("//button[@id='alert']")).click();
	
	
		
		
		
		
		
		
	}
	
	
	
}
