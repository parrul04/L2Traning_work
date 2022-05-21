package L2Traning.Basic_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amity\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qa.max.com/home/");
		
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		driver.findElement(By.xpath("//a[text()='Create your Account.']")).click();
		driver.findElement(By.xpath("//button[text()='Shop and Join']")).click();
		
		//Thread.sleep(3000);
		////div[@data-checkoutid='2981']//a[@id='2981']
		
		
		driver.findElement(By.xpath("//a[text()=' Weight Management ']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		//js.executeScript("window.scrollBy(0, 350)");
		
		driver.findElement(By.xpath("//a[@data-prod_id='DENUSA002002']")).click();
		
		js.executeScript("window.scrollBy(0, 500)");
		
		driver.findElement(By.xpath("//div[@id='checkoutbutton_header6']//a")).click();
		
		WebElement mayBELAter = driver.findElement(By.xpath("//button[@id='btn-autoship-disagree']"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(mayBELAter).click().perform();
		
		
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0, 200)");
		
		// ACCOUNT HOLDER
		
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#firstName']")).sendKeys("user_firstName");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#lastName']")).sendKeys("user_lastName");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#email']")).sendKeys("test04@test.com");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#repeat-email']")).sendKeys("test04@test.com");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#phone-number']")).sendKeys("111-111-1111");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#mobile-number']")).sendKeys("123-123-1234");
		driver.findElement(By.xpath("//input[@data-validation-confirm='username']")).sendKeys("test14");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#password']")).sendKeys("Testuser@04");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#password-confirmation']")).sendKeys("Testuser@04");
		
		//How did you hear about
		
		driver.findElement(By.xpath("//a[@class='dont-have-sponsorid']")).click();
		
		// Billing Information
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#billing-info-name']")).sendKeys("User_FristName");
		WebElement cardDetail = driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#creditcard']"));
		cardDetail.clear();
		cardDetail.sendKeys("4769001082871436");
		driver.findElement(By.xpath("//input[@data-validation-error-msg=' Expire month required. ']")).sendKeys("01");
		driver.findElement(By.xpath("//input[@data-validation-error-msg=' Expire year required. ']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#billing-info-cvv']")).sendKeys("389");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#billing-info-address-one']")).sendKeys("Avenue 234");
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#billing-info-city']")).sendKeys("Brampton");
		WebElement state = driver.findElement(By.xpath("//select[@data-validation-error-msg-container='#billing-info-state']"));
		Select sc = new Select(state);
		sc.selectByValue("AL");
		
		driver.findElement(By.xpath("//input[@data-validation-error-msg-container='#billing-info-postal']")).sendKeys("75025");
		
		js.executeScript("window.scrollBy(0, 150)");
		
		driver.findElement(By.xpath("//label[text()=' I Agree ']")).click();
		driver.findElement(By.xpath("//input[@id='shipping-details']")).click();
		
		
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0, 250)");
		
		WebElement Shipping = driver.findElement(By.xpath("//select[@id='ship_method_choice']"));
		Select sc1 = new Select(Shipping);
		sc1.selectByValue("14");
		js.executeScript("window.scrollBy(0, 100)");
		driver.findElement(By.xpath("//button[@id='review-order-button']")).click();
		//driver.close();
		
		

	}

}
