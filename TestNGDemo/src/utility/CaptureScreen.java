package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreen
{
	
	public static void getScreenShot(WebDriver driver, String fileName) throws IOException
	{
	  TakesScreenshot screen = (TakesScreenshot)driver;
	  File screenShot = screen.getScreenshotAs(OutputType.FILE);
	  File path = new File("D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Screenshots\\" + fileName + ".png");
	  Files.copy(screenShot, path);
	}
	
	
	
	
}
