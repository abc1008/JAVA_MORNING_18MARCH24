package pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePack.BaseTest;
import utility.ExplicitWait;

public class EditAccountPage
{
	
	WebDriver driver;
	
	//private variables :  xpath and web-elements 
	private final String buttonEditAccountByXpath = "//a[text()='Edit Account']";
	private final String textBoxFnameByXpath = "//input[@id='input-firstname']";
	private final String textBoxLnameByXpath = "//input[@id='input-lastname']";
	private final String buttonContinueByXpath = "//input[@value = 'Continue']";
	private final String msgAlertByXpath = "//div[contains(text(),'Success: Your account has been successfully updated.')]";


	
	@FindBy(xpath = buttonEditAccountByXpath )  
	private WebElement buttonEditAccount;
	
	@FindBy(xpath = textBoxFnameByXpath)
	private WebElement textBoxFname;
	
	@FindBy(xpath = textBoxLnameByXpath)
	private WebElement textBoxLname;
	
	@FindBy(xpath =buttonContinueByXpath )
	private WebElement buttonContinue;
	
	@FindBy(xpath =msgAlertByXpath )
	private WebElement msgAlert;

	
	
	// public constructor
	public EditAccountPage(WebDriver driver)
	{
			this.driver = driver;
			PageFactory.initElements(driver, this );   // refers to nonstatic variables of current class.
	}
	
	
	
	// public method
	public boolean editAccunt()
	{
		boolean testResult;
		
		buttonEditAccount.click();
		textBoxFname.sendKeys("ABC");
		textBoxLname.sendKeys("XYZ");
		buttonContinue.click();
		
		ExplicitWait.waitUntilElementIsVisible(msgAlert);
		
			if(msgAlert.isDisplayed())
			{
				System.out.println("Account successfully updated.");
				testResult = true;
			}
			else 
			{
				System.out.println("Account not successfully updated.");
				testResult = false;
			}
			
			return testResult;
		
	}
	
	
	
	
	

}

