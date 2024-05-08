package selenium_basics_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		
		WebElement mp3Players = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);   // object of actions class
		act.moveToElement(mp3Players).perform();   // to hover over element and the click on another element
		
		WebElement showAllMp3Players = driver.findElement(By.xpath("//a[text()='Show AllMP3 Players']"));
		Thread.sleep(2000);
		showAllMp3Players.click();
		
	}

}
