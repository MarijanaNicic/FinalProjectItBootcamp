package Pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetStoreMenuPage {

	private WebDriver driver;
	private Properties locators;
	private WebDriverWait waiter;
//	private List<WebElement> leftNavigationBar;
//	private List<WebElement> mainImage;
//	private List<WebElement> quickLinks;
//	private List<WebElement> MenuContent;

	public PetStoreMenuPage(WebDriver driver, Properties locators, WebDriverWait waiter) {
		this.driver = driver;
		this.locators = locators;
		this.waiter = waiter;
	}
	
	
	public WebElement getFishImgLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("fish_img_link")));
}
	public void clickFishImgLink(WebDriver driver) {
		this.getFishImgLink(driver).click();
	}

	public WebElement getDogsImgLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("dogs_img_link")));
	}

	public void clickDogsImgLink(WebDriver driver) {
		this.getDogsImgLink(driver).click();
	}

	public WebElement getCatsImgLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("cats_img_link")));
	}

	public void clickCatsImgLink(WebDriver driver) {
		this.getCatsImgLink(driver).click();
	}

	public WebElement getReptilesImgLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("reptiles_img_link")));
	}

	public void clickReptilesImgLink(WebDriver driver) {
		this.getReptilesImgLink(driver).click();
	}

	public WebElement getBirdsImgLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("birds_img_link")));
	}

	public void clickBirdsImgLink(WebDriver driver) {
		this.getBirdsImgLink(driver).click();
	}
	public WebElement getBirdsBigImgLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("birds_bigimg_link")));
	}

	public void clickBirdsBigImgLink(WebDriver driver) {
		this.getBirdsBigImgLink(driver).click();
	}

	public WebElement getFishOnTop(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("fish_onTop")));
	}

	public void clickFishOnTop(WebDriver driver) {
	this.getFishOnTop(driver).click();
}

	public WebElement getDogsOnTop(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("dogs_onTop")));
	}

	public void clickDogsOnTop(WebDriver driver) {
		this.getDogsOnTop(driver).click();
	}

	public WebElement getCatsOnTop(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("cats_onTop")));
}

	public void clickCatsOnTop(WebDriver driver) {
		this.getCatsOnTop(driver).click();
	}

	public WebElement getReptilesOnTop(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("reptiles_onTop")));
	}

	public void clickReptilesOnTop(WebDriver driver) {
		this.getReptilesOnTop(driver).click();
	}

	public WebElement getBirdsOnTop(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("birds_onTop")));
	}

	public void clickBirdsOnTop(WebDriver driver) {
		this.getBirdsOnTop(driver).click();
	}

	public WebElement getFishLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("fish_link")));
	}

	public void clickFishLink(WebDriver driver) {
	this.getFishLink(driver).click();
	}

	public WebElement getDogsLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("dogs_link")));
	}

	public void clickDogsLink(WebDriver driver) {
		this.getDogsLink(driver).click();
	}

	public WebElement getCatsLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("cats_link")));
	}

	public void clickCatsLink(WebDriver driver) {
		this.getCatsLink(driver).click();
	}

	public WebElement getReptilesLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("reptiles_link")));
	}

	public void clickReptilesLink(WebDriver driver) {
		this.getReptilesLink(driver).click();
	}
	
	public WebElement getBirdsLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("birds_link")));
	}

	public void clickBirdsLink(WebDriver driver) {
		this.getBirdsLink(driver).click();
	}

	public WebElement getCartLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("cart_link")));
	}

	public void clickCartLink(WebDriver driver) {
		this.getCartLink(driver).click();
	}
	
	public WebElement getSingInLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("singIn_link")));
	}

	public void clickSingInLink(WebDriver driver) {
		this.getSingInLink(driver).click();
	}

	public WebElement getHelpLink(WebDriver driver) {
		return this.driver.findElement(By.xpath(this.locators.getProperty("help_link")));
	}

	public void clickHelpLink(WebDriver driver) {
		this.getHelpLink(driver).click();
	}	}



