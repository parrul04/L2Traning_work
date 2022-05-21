package L2Traning.Basic_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage_TestingConcepts {
	
	WebDriver driver;
	String baseUrl = "https://qa.max.com/login/";
	

	
	@BeforeMethod
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amity\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	
	@Test(dataProvider="loginData")
	public void login(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@href='/login/']")).click();
		WebElement userName = driver.findElement(By.xpath("//input[@id='myusername']"));
		userName.clear();
		userName.sendKeys(username);
		WebElement userPassword = driver.findElement(By.xpath("//input[@id='mypassword']"));
		userPassword.clear();
		userPassword.sendKeys(password);
		WebElement clickButton = driver.findElement(By.xpath("//button[@id='submit']"));
		clickButton.click();

		Thread.sleep(10000);
		//System.out.println(driver.getCurrentUrl());
		
		Assert.assertTrue(driver.getCurrentUrl().equals("https://qa.max.com/"),"Login unsuccessful" );
		System.out.println("Login Successful");
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	


	@DataProvider(name="loginData")
	public Object[][] passData(){
		
		Object[][] data = new Object[4][2];
		
		data[0][0]  = "testuser04";
		data[0][1] = "Testuser@04";
		
		data[1][0] = "test04";
		data[1][1] = "Testuser@04";
		
		data[2][0]= "parul";
		data[2][1] = "agarwal";
		
		data[3][0] = "";
		data[3][1] = "";
		
		return data;
	}
}
