package selenium_basics_pack1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexOfWinHandle
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/js_popup.asp");

		
		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		String parentWin = driver.getWindowHandle();
		System.out.println("parentWin : " + parentWin);
		
		// click to open new tab
		Thread.sleep(5000);
		alert.click();
		Thread.sleep(5000);
		confirm.click();
		Thread.sleep(5000);
		prompt.click();
		Thread.sleep(5000);
		line.click();
		Thread.sleep(5000);
		
		Set<String> allWins = driver.getWindowHandles();
		
		ArrayList<String> wins = new ArrayList<String>(allWins);
		
		System.out.println(wins.get(1));
		System.out.println(wins.get(2));
		System.out.println(wins.get(3));
		System.out.println(wins.get(4));
		
		System.out.println();
//		*****************
		System.out.println();
		
		Thread.sleep(5000);
		driver.switchTo().window(wins.get(1));
		System.out.println("Switched to winHandle : "+wins.get(1) +" : "+ driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.switchTo().window(wins.get(2));
		System.out.println("Switched to winHandle : "+wins.get(2) +" : "+driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.switchTo().window(wins.get(3));
		System.out.println("Switched to winHandle : "+wins.get(3) +" : "+driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.switchTo().window(wins.get(4));
		System.out.println("Switched to winHandle : "+wins.get(4) +" : "+driver.getCurrentUrl());
		Thread.sleep(5000);
		
	}
}
