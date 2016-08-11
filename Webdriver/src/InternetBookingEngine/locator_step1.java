package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locator_step1 {

	private WebDriverWait wait;

	// Constructor
	public locator_step1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 60);
	}
	
	// Element Locations
	@FindBy(linkText = "14")
	private WebElement selectArrival;
	
	@FindBy(linkText = "16")
	private WebElement selectDeparture;

	@FindBy(id = "btnNext")
	private WebElement clickViewRoomAndPrices;
	
	// Get Element Locations
	public WebElement selectArrival() {
		return wait.until(elementToBeClickable(selectArrival));
	}

	public WebElement selectDeparture() {
		return selectDeparture;
	}

	public WebElement clickViewRoomAndPrices() {
		return clickViewRoomAndPrices;
	}
	

}
