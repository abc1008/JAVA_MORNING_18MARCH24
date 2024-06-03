package pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ExplicitWait;
import utility.SeleniumEventHelpers;
import utility.WebDropdownHelper;

public class AddressBookPage
{
	
	WebDriver driver;
	
	//private variables :  xpath and web-elements 
	private final String buttonAddressBookByXpath = "//aside[@id='column-right']//a[text()='Address Book']";
	private final String buttonEditByXpath = "//td[@class='text-right']//a[text()='Edit']";
	private final String textboxAddr1ByXpath = "//input[@id='input-address-1']";
	private final String textboxAddr2ByXpath = "//input[@id='input-address-2']";
	private final String dropdownCoutryByXpath = "//select[@id='input-country']";
	private final String dropdownStateByXpath = "//select[@id='input-zone']";
	private final String buttonContinueByXpath = "//input[@value = 'Continue']";
	private final String msgAlertSuccessByXpath = "//div[contains(@class,'alert-success')]";

	
	@FindBy(xpath = buttonAddressBookByXpath )  
	private WebElement buttonAddressBook;
	
	@FindBy(xpath = buttonEditByXpath)
	private WebElement buttonEdit;
	
	@FindBy(xpath = textboxAddr1ByXpath)
	private WebElement textboxAddr1;
	
	@FindBy(xpath = textboxAddr2ByXpath)
	private WebElement textboxAddr2;
	
	@FindBy(xpath =dropdownCoutryByXpath )
	private WebElement dropdownCoutry;
	
	@FindBy(xpath =dropdownStateByXpath )
	private WebElement dropdownState;
	
	@FindBy(xpath =buttonContinueByXpath )
	private WebElement buttonContinue;
	
	@FindBy(xpath =msgAlertSuccessByXpath )
	private WebElement msgAlertSuccess;
	
	
	// public constructor
	public AddressBookPage(WebDriver driver)
	{
			this.driver = driver;
			PageFactory.initElements(driver, this );   // refers to nonstatic variables of current class.
	}
	
	
	// public method
	public boolean editAddress()
	{
		boolean testResult;
		
		buttonAddressBook.click();
		buttonEdit.click();
		textboxAddr1.sendKeys("ABC");
		textboxAddr2.sendKeys("XYZ");
		
		SeleniumEventHelpers.scrollTO(driver, dropdownCoutry);
		
		WebDropdownHelper.selectDropdownByIndex(dropdownCoutry, 3);
		WebDropdownHelper.selectDropdownByIndex(dropdownState, 5);
		
		buttonContinue.click();
		
		
		ExplicitWait.waitUntilElementIsVisible(driver, msgAlertSuccess);
		
		
			if(msgAlertSuccess.isDisplayed())
			{
				System.out.println("Account address successfully updated.");
				testResult = true;
			}
			else 
			{
				System.out.println("Account address not successfully updated.");
				testResult = false;
			}
		
			return testResult;
	}
	
	
	
	
	

}

