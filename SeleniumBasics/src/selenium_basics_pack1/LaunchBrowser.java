package selenium_basics_pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String browserName = "Chrome";
		WebDriver driver;
		
//		WebDriver driver = new ChromeDriver(); 
		
		
		if(browserName.equals("Chrome"))
		{
			 driver = new ChromeDriver(); 						// launch chrome browser
		}
		else
		{
			 driver = new EdgeDriver();
		}
		
		
		
		
		
		
//		 Basic Commands in selenium:
		
		
		driver.manage().window().maximize();        // maximize the browser
		driver.get("https://www.google.com");		// hit URL
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		String title = driver.getTitle();   // title of the site
		
		System.out.println(title);
		
		String currentURL = driver.getCurrentUrl();    // returns the url of current browser
		System.out.println(currentURL);
		
		
		// to verify if title contains text "sign up"
		
		if(title.contains("sign up"))
		{
			System.out.println("Test Case Pass.");
		}
		else 
		{
			System.out.println("Test Case Fail.");
		}
		
		
		
		
		
		
		
	}
	
}
