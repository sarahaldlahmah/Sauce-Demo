import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemo {

	WebDriver driver = new ChromeDriver();
	
@BeforeTest 
public void setup() {
	String URL = "https://www.saucedemo.com/";
	driver.get(URL);
	
}
@Test 
public void LoginwithValidCred () {
	String username = "standard_user";
	String password = "secret_sauce";
	
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.id("react-burger-menu-btn")).click();
	//driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
	logoutLink.click();
	
	
} 
	
	
	
	
	
	
	
	
}
