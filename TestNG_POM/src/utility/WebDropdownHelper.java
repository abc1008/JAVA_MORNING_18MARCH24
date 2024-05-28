package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDropdownHelper {
	
	
	public static void selectDropdownByValue(WebElement ele, String valueToSelect)
	{
		Select s =  new Select(ele);
		s.selectByValue(valueToSelect);
	}
	
	public static void selectDropdownByText(WebElement ele, String textToSelect)
	{
		Select s =  new Select(ele);
		s.selectByVisibleText(textToSelect);
	}
	
	public static void selectDropdownByIndex(WebElement ele, int indexToSelect)
	{
		Select s =  new Select(ele);
		s.selectByIndex(indexToSelect);
	}
	
	

}
