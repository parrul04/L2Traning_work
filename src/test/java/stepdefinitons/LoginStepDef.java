package stepdefinitons;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//import static org.testng.Assert.*;

//import org.junit.Assert.*;
//import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObject;

public class LoginStepDef {
	
	String driverPath = "C:\\Users\\amity\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe";
	WebDriver driver;
	String baseUrl = "https://qa.max.com/home/";
	// Created page object using Page Factory
//	LoginPageObject loginPage = PageFactory.initElements(driver, LoginPageObject.class);
	LoginPageObject loginPage;
	
	
	//https://qaautomation.expert/2021/04/12/page-objects-with-selenium-and-cucumber/
//	
//	@Before
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(baseUrl);
////		Thread.sleep(4000);
//	}
	

	
	@Given("I am on login page")
	public void i_am_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		// navigate to login page
		//LoginPageObject loginPage = PageFactory.initElements(driver, LoginPageObject.class);
		loginPage = new LoginPageObject(driver);
		loginPage.click_LoginLink();
		Thread.sleep(4000);
		
	}

	@When("I entered valid username {string}")
	public void i_entered_valid_username(String userName) throws InterruptedException {
		loginPage.enter_userName(userName);
		Thread.sleep(4000);
	}

	@When("i entered valid password {string}")
	public void i_entered_valid_password(String password) throws InterruptedException {
		loginPage.enter_password(password);
		Thread.sleep(4000);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() throws InterruptedException {
		loginPage.click_loginButton();
		Thread.sleep(4000);
	}

	@Then("User should navigate to user Home Page")
	public void user_should_navigate_to_user_home_page() {
		boolean result = loginPage.verifySuccessfullLogin();
		//assertEquals(true, result );
		if(result) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login UnSuccessful");
		}
			
	
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
