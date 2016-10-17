package HE;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorReservationTab {

	WebDriverWait wait;
	
	public LocatorReservationTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 50);
	}
	
	// Element Locations
	@FindBy(xpath = "//ul//li//a/em/span/span[contains(.,'Reservations')]")
	private WebElement reservations_tab;
	
	@FindBy(xpath = "//tr/td/table/tbody//tr//td/em/button[contains(.,'Search')]")
	private WebElement search_button_header;

	@FindBy(xpath = "//div[@id='reservationFiltersPanel']//div//table/tbody//tr//td/em/button[contains(.,'Search')]")
	private WebElement search_inside_the_panel;
	
	@FindBy(xpath = "//div/input[contains(@name,'confirmation_no')]")
	private WebElement confirmation_no;

	
	// Get Element Locators
	public WebElement reservationsTab() {
		return wait.until(visibilityOf(reservations_tab)); 
	}
	
	public WebElement searchButtonHeader() {
		return wait.until(elementToBeClickable(search_button_header)); 
	}
	
	public WebElement searchInsideThePanel() {
		return wait.until(elementToBeClickable(search_inside_the_panel)); 
	}
	
	public WebElement confirmationNo() {
		return wait.until(elementToBeClickable(confirmation_no)); 
	}

}
