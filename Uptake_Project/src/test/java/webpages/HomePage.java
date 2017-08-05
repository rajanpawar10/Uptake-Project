package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;

	@FindBy (xpath="html/body/header/div[1]/div[2]/button")
	private WebElement moreInfo;
	
	@FindBy(linkText = "Newsroom")
	WebElement Newsroom;
	
	//Page URL
	private static String URL = "https://uptake.com/";
	
	public HomePage (WebDriver driver){
		this.driver = driver;
		driver.get(URL);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMoreInfo() {
		System.out.println("......Clicking on Request More info tab.......");
		moreInfo.click();
	}

	public void clickOnNewsroom() {
		System.out.println("......Clicking on Newsroom tab.......");
		Newsroom.click();
	}
}
