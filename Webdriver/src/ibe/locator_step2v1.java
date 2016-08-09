package ibe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class locator_step2v1 {

	private WebDriverWait wait;

	// Constructor
	public locator_step2v1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 25);
	}

	// Element Locators
	@FindBy(id = "room_20278_9729_0")
	private WebElement dwhRoom;

	@FindBy(id = "rpName_20649") // Full Ref, Full Charge
	private WebElement fullRatePlan;

	@FindBy(id = "ctaReserve")
	private WebElement btnReserve;

	@FindBy(xpath = "html/body/div[4]/div[2]/div/ul/li[2]/a")
	private WebElement clickReservationPolicies;

	@FindBy(xpath = "html/body/div[4]/div[2]/div/div/div[2]/ul/li[5]")
	private WebElement fullRefModif;

	// Get Element Locators
	public WebElement dwhRoom() {
		return wait.until(elementToBeClickable(dwhRoom));
	}

	public WebElement fullRatePlan(){
		return wait.until(elementToBeClickable(fullRatePlan));
	}

	public WebElement btnReserve() {
		return btnReserve;
	}

	public WebElement clickReservationPolicies(){
		return wait.until(elementToBeClickable(clickReservationPolicies));
	}

	public WebElement fullRefModif(){
		return fullRefModif;
	}
}