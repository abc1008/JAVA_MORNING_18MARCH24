package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait{
	
	
	public static boolean waitUntilElementIsVisible(WebDriver driver, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		if(ele.isDisplayed())
		{
			ExtentReportsHelper.logInfo("Given element located on UI.");
			return true;
		}
		else
		{
			System.out.println("Failed to locate given element on UI.");
			ExtentReportsHelper.logInfo("Failed to locate given element on UI.");
			return false;
		}
	}
	
	public static boolean waitUntilVisibilityOfEleLocatedBy(WebDriver driver,String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		
		WebElement ele = driver.findElement((By.xpath(xpath)));
		
		if(ele.isDisplayed())
		{
			ExtentReportsHelper.logInfo("Given element located on UI.");
			return true;
		}
		else
		{
			ExtentReportsHelper.logInfo("Failed to locate given element on UI.");
			return false;
		}
	}
	
	
	public static boolean waitUntilElementIsClickable(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		if(ele.isDisplayed())
		{
			ExtentReportsHelper.logInfo("Given element located on UI.");
			return true;
		}
		else
		{
			ExtentReportsHelper.logInfo("Failed to locate given element on UI.");
			return false;
		}
	}
	
	
	

}
