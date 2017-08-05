package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import webpages.HomePage;
import webpages.RequestMoreInfoPage;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestMoreInfoTestCases {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "//Users//Rajan//Downloads//geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void enterPersonalDetails() {
		HomePage home = new HomePage(driver);
		home.clickOnMoreInfo();
		
		RequestMoreInfoPage moreInfo = new RequestMoreInfoPage(driver);
		// Verify if request info page is opened
		Assert.assertTrue(moreInfo.isRequestInfoPageOpened(),"Request info Page is not displayed");

		// Fill up data
		moreInfo.enterEmail("Abcef@gmail.com");
		moreInfo.enterFirstName("Rajan");
		moreInfo.enterLastName("Pawar");
		moreInfo.enterPhone("313-818-9834");
		moreInfo.lead_Description("Hi how are you doing today?");
		moreInfo.enterCompany("Uptake");
		moreInfo.submitButton();
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}
