package selenium_basics_pack1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiltipleWindowHandling
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(4000);
		
		
		String parentWindowHandle = driver.getWindowHandle();
		
		System.out.println("Parent Window :      " + parentWindowHandle);
		
		
	driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
	driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
	driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
	driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
	
	Thread.sleep(2000);
		
		System.out.println();
		System.out.println("**************************");
		System.out.println();
		
	   Set<String> allWindowsHandles = driver.getWindowHandles();
	   int numOfWindows = allWindowsHandles.size();
	   
//	   int counter = 1;
//	   
//	   for( String windowHandle : allWindowsHandles )
//	   {
//	  	 if(!(windowHandle.equals(parentWindowHandle)))
//	  	 {
//	  		 driver.switchTo().window(windowHandle);    // to switch the 
//	  		 System.out.println("switched " + counter  + ": " + windowHandle  );
//	  		 counter++;
//	  	 }
//	   }
//	   Thread.sleep(2000);
//	   
	   
		   // ArrayList 
	   
	   ArrayList<String> allWins = new ArrayList<String>(allWindowsHandles);
	   
	   Thread.sleep(2000);
	   int count = 0;
	   for(String w :allWins)
	   {
	  	 driver.switchTo().window(w);
	  	 System.out.println("Switched to : " + count +" " +w);
	  	 Thread.sleep(2000);
	  	 if(count == 0)
	  	 {
	  		 count++;
	  		 continue;
	  	 }
	  	 driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("Data : " + count);
	  	 System.out.println("Data entered");
	  	 count++;
	   }
	   
	   

	   
	   // to convert Set<String> into String array
	   //  1. create blank array of size same as Set
   	//   2. add each data from Set into Blank Array 
//	   String [] sArr  =  new String[numOfWindows];
//   // iterate over set
//   int counter = 0;
//   for(String ww : allWindowsHandles )
//   {
//  	 sArr[counter] = ww;
//  	 System.out.println("String Array data " +counter +" : "+ sArr[counter]);
//  	 counter++;
//   }
//   
//   String winToSwitch = sArr[2];
//   driver.switchTo().window(winToSwitch);
//   System.out.println("switched to window : "+ winToSwitch);
//   Thread.sleep(2000);
//   driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("Data : 2");
   
//   System.out.println("data from String Array");
//   
//   for(sArr)
   
	   
		   
	}
	
	
	

}
