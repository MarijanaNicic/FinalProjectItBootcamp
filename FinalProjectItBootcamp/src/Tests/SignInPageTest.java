package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.SignInPage;
import Utilis.ExcelUtils;

public class SignInPageTest {
	private WebDriver driver;
	private Properties locators;
	private WebDriverWait waiter;

	@BeforeClass
	public void setup() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver_lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.locators = new Properties();
		locators.load(new FileInputStream("config/selectors.properties"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void SignInTest() throws InterruptedException {
		driver.navigate().to(this.locators.getProperty("signIn_url"));
	
		ExcelUtils.setExcell("pet-store-data.xlsx");
		ExcelUtils.setWorkSheet(1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SignInPage SingIn = new SignInPage(driver, locators, waiter);
		
		SignInPage.inputUserName(driver, ExcelUtils.getDataAt(1, 0));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SingIn.inputPassword(driver, ExcelUtils.getDataAt(1, 1));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SingIn.clickLoginButton(driver);
		SingIn.clickSignOut(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(),
				"catalog_url");
	
	
}
	@AfterClass
	public void afterClass() {
		
		ExcelUtils.closeExcell();
		driver.close();

	}	
}
