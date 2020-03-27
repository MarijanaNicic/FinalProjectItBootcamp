package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	private WebDriver driver;
	private static Properties locators;
	private WebDriverWait waiter;

	public SignInPage(WebDriver driver, Properties locators, WebDriverWait waiter) {
		this.driver = driver;
		this.locators = locators;
		this.waiter = waiter;
	}
	
	//username
	public static WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.xpath(locators.getProperty("username")));
	}
	public static void inputUserName(WebDriver driver, String userId) {
		getUserName(driver).click();
		getUserName(driver).clear();
		getUserName(driver).sendKeys(userId);
	}
	
	//password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(locators.getProperty("password")));
	}
	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).click();
		getPassword(driver).clear();
		getPassword(driver).sendKeys(data);
	}
	
	//log in button
	
	public static WebElement getLoginButton(WebDriver driver) {
		return driver.
				findElement(By.xpath(locators.getProperty("login")));
	}
	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}
	//Registration link
	
	public static WebElement getRegistrationLink(WebDriver driver) {
		return driver.
				findElement(By.xpath(locators.getProperty("registerButton")));
	}
	public static void clickRegistrationLink (WebDriver driver) {
		getRegistrationLink(driver).click();
	}
	//Sign out
	
	public static WebElement getSignOut (WebDriver driver) {
		return driver.
				findElement(By.xpath(locators.getProperty("signOut")));
	}
	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}

}
