package InternetBookingEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public class locator_step2 {

	private WebDriverWait wait;

	// Constructor
	public locator_step2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 60);
	}

	// Element Locators
	@FindBy(id = "room_20649_9728_1")
	private WebElement selectDwhRoom;

	@FindBy(id = "room_21048_8895_1")
	private WebElement selectHppRoom;

	@FindBy(id = "rpName_20649") // Full Ref, Full Charge
	private WebElement clickFullRatePlan;

	@FindBy(xpath = "html/body/div[4]/div[2]/div/ul/li[2]/a")
	private WebElement clickReservationPolicies;

	@FindBy(xpath = "html/body/div[4]/div[2]/div/div/div[2]/ul/li[5]")
	private WebElement dwhFullRefModif;
	
	@FindBy(xpath = "html/body/div[4]/div[1]/a/i")
	private WebElement closeWindow;

	@FindBy(id = "ctaReserve")
	private WebElement clickReserveNow;
	
	
	// Get Element Locators
	public WebElement selectDwhRoom() {
		return wait.until(ExpectedConditions.visibilityOf(selectDwhRoom));
		//return selectDwhRoom;
	}

	public WebElement selectHppRoom() {
		return selectHppRoom;
	}

	public WebElement dwhFullRefModif(){
		return wait.until(elementToBeClickable(dwhFullRefModif));
	}

	public WebElement clickFullRatePlan(){
		return wait.until(elementToBeClickable(clickFullRatePlan));
	}

	public WebElement clickReservationPolicies(){
		return wait.until(elementToBeClickable(clickReservationPolicies));
	}
	
	public WebElement closeWindow() {
		return wait.until(elementToBeClickable(closeWindow));
	}

	public WebElement clickReserveNowStep2() {
		return wait.until(elementToBeClickable(clickReserveNow));
	}

}
