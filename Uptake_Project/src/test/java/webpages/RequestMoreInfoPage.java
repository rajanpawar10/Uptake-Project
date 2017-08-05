package webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestMoreInfoPage {

	private WebDriver driver;

	@FindBy(xpath = "html/body/main/article/div[1]/div/form/div[1]/div")
	private WebElement title;

	@FindBy(id = "firstname-c391fd6c-db94-4e29-9166-598f28f48702")
	WebElement firstname;

	@FindBy(id = "lastname-c391fd6c-db94-4e29-9166-598f28f48702")
	WebElement lastname;

	@FindBy(id = "company-c391fd6c-db94-4e29-9166-598f28f48702")
	WebElement company;

	@FindBy(id = "email-c391fd6c-db94-4e29-9166-598f28f48702")
	WebElement email;

	@FindBy(id = "phone-c391fd6c-db94-4e29-9166-598f28f48702")
	WebElement phone;

	@FindBy(id = "lead_description__c-c391fd6c-db94-4e29-9166-598f28f48702")
	WebElement lead_description;
	
	@FindBy(className = "submit")
	WebElement submitButton;

	public RequestMoreInfoPage (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterFirstName(String firstName) {
		firstname.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastname.clear();
		lastname.sendKeys(lastName);
	}

	public void enterCompany(String companyName) {
		company.clear();
		company.sendKeys(companyName);
	}

	public void enterEmail(String emailid) {
		email.clear();
		email.sendKeys(emailid);
	}

	public void enterPhone(String phoneNo) {
		phone.clear();
		phone.sendKeys(phoneNo);
	}

	public void submitButton() {
		submitButton.click();
	}
	
	public void lead_Description(String lead_descriptionMessage) {
		lead_description.sendKeys(lead_descriptionMessage);
	}
	
	//Verifying Get info page opened 
	public boolean isRequestInfoPageOpened() {
		return title.getText().contains("Get in Touch");
	}

}
