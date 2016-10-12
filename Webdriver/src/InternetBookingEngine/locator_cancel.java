package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locator_cancel {

	WebDriver driver;
	WebDriverWait wait;

	public locator_cancel(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 100);
	}
	// Element Locations
	@FindBy(id = "conCancel")
	private WebElement click_cancel_reservation;

	@FindBy(id = "cancelYes")
	private WebElement click_yes_to_cancel;



	// Get Element Locations
	public WebElement click_cancel_reservation() {
		return wait.until(elementToBeClickable(click_cancel_reservation)); 
	}
	
	public WebElement click_yes_to_cancel() {
		return wait.until(elementToBeClickable(click_yes_to_cancel)); 
	}
}
