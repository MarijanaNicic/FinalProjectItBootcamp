package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	private WebDriver driver;
	private Properties locators;
	private WebDriverWait waiter;

	public CartPage(WebDriver driver, Properties locators, WebDriverWait waiter) {
		this.driver = driver;
		this.locators = locators;
		this.waiter = waiter;
	}
	
	//remove
	public WebElement getRemoveFromCart() {
		return this.driver.findElement(By.xpath(locators.getProperty("removeFromCart")));
	}

	public void clickRemoveFromCart() {
		this.getRemoveFromCart().click();
	}
	
	//update cart
	public WebElement getUpdateCart() {
		return this.driver.findElement(By.xpath(locators.getProperty("updateCart")));
	}

	public void clickUpdateCart() {
		this.getUpdateCart().click();
	}
	//Proceed to Checkout
	public WebElement getProceedToCheckout() {
		return this.driver.findElement(By.xpath(locators.getProperty("ProceedToCheckout")));
	}

	public void clickProceedToCheckout() {
		this.getUpdateCart().click();
	}
	
}
