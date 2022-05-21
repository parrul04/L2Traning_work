package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//  The initElements method is used to initialize web elements.
		// PageFactory. initElements() static method takes the driver instance of the given class and the class type,
		//and returns a Page Object with its fields fully initialized.
	}

	// Locators

	@FindBy(xpath = "//li[@class='dropdown']/a")  //"//a[@href='/login/']"
	@CacheLookup
	WebElement loginLink;

	@FindBy(xpath = "//input[@id='myusername']")
	@CacheLookup
	WebElement userName;
	

	@FindBy(xpath = "//input[@id='mypassword']")
	@CacheLookup
	WebElement userPassword;

	@FindBy(xpath = "//button[@id='submit']")
	@CacheLookup
	WebElement loginButton;

	// Action Methods

	public void click_LoginLink() {
		loginLink.click();
	}

	public void enter_userName(String username) {
		userName.sendKeys(username);
	}

	public void enter_password(String password) {
		userPassword.sendKeys(password);
	}

	public void click_loginButton() {
		loginButton.click();
	}	
	
	public boolean verifySuccessfullLogin() {
		
		if(!driver.getCurrentUrl().equals("https://qa.max.com/")) {
			return false;
		}
		return true;
	}
	


}
