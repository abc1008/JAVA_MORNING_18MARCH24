package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigReader;
import utility.ExplicitWait;
import utility.ExtentReportsHelper;

public class LoginPage {

	WebDriver driver;

	// private variables : xpath and web-elements
	private final String textBoxEmailAddrByXpath = "//input[@id='input-email']";
	private final String textBoxPasswordByXpath = "//input[@id='input-password']";
	private final String buttonLoginByXpath = "//input[@value='Login']";
	private final String buttonMyAccountByXpath = "//span[text()='My Account']";
	private final String buttonLogoutByXpath = "(//a[text()='Logout'])[1]";
	private final String msgLogoutConfirmByXpath = "//p[contains(text(),'You have been logged off your account.')]";
	private final String buttonLoginFromDropdownByXpath = "//a[text()='Login']";
	
	
	@FindBy(xpath = textBoxEmailAddrByXpath)
	private WebElement textBoxEmailAddr;

	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;

	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;

	@FindBy(xpath = buttonMyAccountByXpath)
	private WebElement buttonMyAccount;

	@FindBy(xpath = buttonLogoutByXpath)
	private WebElement buttonLogout;

	@FindBy(xpath = msgLogoutConfirmByXpath)
	private WebElement msgLogoutConfirm;
	
	@FindBy(xpath = buttonLoginFromDropdownByXpath)
	private WebElement buttonLoginFromDropdown;
	

	// public constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // refers to nonstatic variables of current class.
	}

	// public method
	public void login() throws IOException {
		
		buttonMyAccount.click();
		buttonLoginFromDropdown.click();
		
		ExplicitWait.waitUntilElementIsVisible(driver,buttonLogin);
		
		textBoxEmailAddr.sendKeys(ConfigReader.readData("UserID"));
		ExtentReportsHelper.logInfo("Data entered in 'UserID' field.");
		
		textBoxPassword.sendKeys(ConfigReader.readData("Password"));
		ExtentReportsHelper.logInfo("Data entered in 'Password' field.");
		
		buttonLogin.click();
		ExtentReportsHelper.logInfo("Clicked on 'Login' button.");

		String titleOfHomePage = driver.getTitle();

		if (titleOfHomePage.equals("My Account")) 
		{
//			System.out.println("Login is successful.");
			ExtentReportsHelper.logPass("Login is successful.");
		} 
		else 
		{
//			System.out.println("Failed to Login.");
			ExtentReportsHelper.logFail("Failed to Login.");
		}

	}

	public void logout() throws IOException {
		buttonMyAccount.click();
		ExtentReportsHelper.logInfo("Clicked on 'My Account'.");
		
		buttonLogout.click();
		ExtentReportsHelper.logInfo("Clicked on 'Logout'.");

		ExplicitWait.waitUntilElementIsVisible(driver,msgLogoutConfirm);

		if (msgLogoutConfirm.isDisplayed()) 
		{
//			System.out.println("Logout is successful.");
			ExtentReportsHelper.logPass("Logout is successful.");
		} 
		else 
		{
//			System.out.println("Failed to Logout.");
			ExtentReportsHelper.logFail("Failed to Logout.");
		}

	}

}
