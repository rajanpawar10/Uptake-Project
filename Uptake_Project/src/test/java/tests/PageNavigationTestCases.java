package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webpages.RequestMoreInfoPage;
import webpages.NewsroomPage;
import webpages.HomePage;

public class PageNavigationTestCases {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		
		//Browser driver initialize   
		System.setProperty("webdriver.gecko.driver", "//Users//Rajan//Downloads//geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void requestInfoPageVerification() {
		HomePage home = new HomePage(driver);
		home.clickOnMoreInfo();

		RequestMoreInfoPage moreInfo = new RequestMoreInfoPage(driver);
		moreInfo.isRequestInfoPageOpened();
		Assert.assertTrue(moreInfo.isRequestInfoPageOpened(), "Request more info page not able to open");
	}
	
	@Test
	public void newsRoomPageVerification() {
		HomePage home = new HomePage(driver);
		home.clickOnNewsroom();

		NewsroomPage newsroom = new NewsroomPage(driver);
		newsroom.isNewsroomPageOpened();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
