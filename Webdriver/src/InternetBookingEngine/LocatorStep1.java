package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorStep1 {

	private WebDriverWait wait;
	

	// Constructor
	public LocatorStep1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 60);
	}
	
	// Element Locations
	@FindBy(id = "btnNext")
	private WebElement click_view_room_and_prices;

	// Get Element Locations
	public WebElement clickViewRoomAndPrices() {
		return wait.until(elementToBeClickable(click_view_room_and_prices));
	}
}
