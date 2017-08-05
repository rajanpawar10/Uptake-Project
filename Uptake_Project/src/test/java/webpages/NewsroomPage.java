package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewsroomPage {

	private WebDriver driver;

	@FindBy(linkText = "Newsroom")
	WebElement Newsroom;

	public NewsroomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Verify Newsroom webpage is opened
	public void isNewsroomPageOpened() {
		String expectedUrl = "https://uptake.com/newsroom/";
		driver.get(expectedUrl);
		try {
			Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
			System.out.println("Navigated to Newsroom webpage");
		} catch (Throwable pageNavigationError) {
			System.out.println("Did not navigate to Newsroom webpage");
		}
	}
}
