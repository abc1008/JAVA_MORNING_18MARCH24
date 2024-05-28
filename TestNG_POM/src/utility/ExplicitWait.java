package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePack.BaseTest;

public class ExplicitWait extends BaseTest{
	
	
	public static boolean waitUntilElementIsVisible(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		if(ele.isDisplayed())
		{
			System.out.println("Given element located on UI.");
			return true;
		}
		else
		{
			System.out.println("Failed to locate given element on UI.");
			return false;
		}
	}
	
	public static boolean waitUntilVisibilityOfEleLocatedBy(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		
		WebElement ele = driver.findElement((By.xpath(xpath)));
		
		if(ele.isDisplayed())
		{
			System.out.println("Given element located on UI.");
			return true;
		}
		else
		{
			System.out.println("Failed to locate given element on UI.");
			return false;
		}
	}
	
	
	public static boolean waitUntilElementIsClickable(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		if(ele.isDisplayed())
		{
			System.out.println("Given element located on UI.");
			return true;
		}
		else
		{
			System.out.println("Failed to locate given element on UI.");
			return false;
		}
	}
	
	
	

}
