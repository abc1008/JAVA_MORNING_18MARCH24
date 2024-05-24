package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
	WebDriver driver;
	
	//private variables :  xpath and web-elements 
	private final String textBoxEmailAddrByXpath = "//input[@id='input-email']";
	private final String textBoxPasswordByXpath = "//input[@id='input-password']";
	private final String buttonLoginByXpath = "//input[@value='Login']";
	
	@FindBy(xpath = textBoxEmailAddrByXpath )  
	private WebElement textBoxEmailAddr;
	
	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;
	
	
	// public constructor
	public LoginPage(WebDriver driver)
	{
			this.driver = driver;
			PageFactory.initElements(driver, this );   // refers to nonstatic variables of current class.
	}
	
	
	// public method
	public void login()
	{
		textBoxEmailAddr.sendKeys("ag89111@gmail.com");
		textBoxPassword.sendKeys("Login@123");
		buttonLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
