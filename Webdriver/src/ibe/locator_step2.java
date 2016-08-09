package ibe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class locator_step2 {

	private WebDriverWait wait;

	// Constructor
	public locator_step2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 25);
	}

	// Element Locators
	@FindBy(id = "room_20649_9728_1")
	private WebElement dwhRoom;

	@FindBy(id = "room_21048_8895_1")
	private WebElement hppRoom;

	@FindBy(id = "ctaReserve")
	private WebElement btnReserve;

	@FindBy(id = "rpName_20649")
	private WebElement fullRatePlan;

	// Get Element Locators
	public WebElement dwhRoom() {
		return wait.until(elementToBeClickable(dwhRoom));
	}

	public WebElement hppRoom() {
		return wait.until(elementToBeClickable(hppRoom));
	}

	public WebElement btnReserve() {
		return btnReserve;

	}
	public WebElement fullRatePlan(){
		return wait.until(elementToBeClickable(fullRatePlan));
	}
	
	
	

}