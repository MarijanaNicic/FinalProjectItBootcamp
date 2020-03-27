package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.SignInPage;
import Utilis.ExcelUtils;

public class SignInPageTest {
	private WebDriver driver;
	private Properties locators;
	private WebDriverWait waiter;
	WebElement tempWE = null;
	String tempS = "";

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
		public void signInTestOneUserExcel()throws InterruptedException  {
			
			driver.navigate().to(this.locators.getProperty("signIn_url"));

			ExcelUtils.setExcell("data/pet-store-data.xlsx");
			ExcelUtils.setWorkSheet(1);
			String username = ExcelUtils.getDataAt(1, 0);
			String password = ExcelUtils.getDataAt(1, 1);
			SoftAssert sa = new SoftAssert();
			SignInPage.inputUserName(driver, username);
			tempWE = SignInPage.getUserName(driver);
			sa.assertEquals(tempWE.getAttribute("value"), username);

			SignInPage.inputPassword(driver, password);
			tempWE = SignInPage.getPassword(driver);
			sa.assertEquals(tempWE.getAttribute("value"), password);

			SignInPage.clickLoginButton(driver);
			String currUrl = driver.getCurrentUrl();
			currUrl = driver.getCurrentUrl();
			currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action");

			sa.assertAll();
		}

		@Test
		public void signInTestAllUserExcel() throws InterruptedException {
			SoftAssert sa = new SoftAssert();
			ExcelUtils.setExcell("data/pet-store-data.xlsx");
			ExcelUtils.setWorkSheet(1);

			for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
				driver.getCurrentUrl();

				String username = ExcelUtils.getDataAt(i, 0);
				String password = ExcelUtils.getDataAt(i, 1);
				
				
				
				SignInPage.inputUserName(driver, username);
				tempWE = SignInPage.getUserName(driver);
				sa.assertEquals(tempWE.getAttribute("value"), username);

				SignInPage.inputPassword(driver, password);
				tempWE = SignInPage.getPassword(driver);
				sa.assertEquals(tempWE.getAttribute("value"), password);

				SignInPage.clickLoginButton(driver);
				String currUrl = driver.getCurrentUrl();
				currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
				sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action");

				SignInPage.clickSignOut(driver);
				currUrl = driver.getCurrentUrl();
				currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
				sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action");

				sa.assertAll();
			}
		
	
		
	
	
}
	@AfterClass
	public void afterClass() {
		
		ExcelUtils.closeExcell();
		driver.close();

	}	
}
