package InternetBookingEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public class LocatorStep2 {

	private WebDriverWait wait;

	// Constructor
	public LocatorStep2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 1);
	}

	// Element Locators
	@FindBy(xpath = "html/body/div[4]/div[2]/div/div/div[2]/ul/li[5]")
	private WebElement dwh_full_ref_modif;
	
	@FindBy(xpath = "html/body/div[4]/div[1]/a/i")
	private WebElement close_window;

	@FindBy(id = "ctaReserve")
	private WebElement click_reserve_now;
	
	
	// Get Element Locators
	public WebElement dwhFullRefModif(){
		return wait.until(elementToBeClickable(dwh_full_ref_modif));
	}
	
	public WebElement closeWindow() {
		return wait.until(elementToBeClickable(close_window));
	}

	public WebElement clickReserveNowStep2() {
		return wait.until(elementToBeClickable(click_reserve_now));
	}

}
