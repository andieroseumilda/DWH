package InternetBookingEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class SelectRatePlanAndRooms {
	
		private WebDriverWait wait;

		// Constructor
		public SelectRatePlanAndRooms(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, 60);
		}

		// Element Locators
		@FindBy(id = "room_22442_10433_0")
		private WebElement nightly_partial_nonref_fullCharge; //Nightly:Partial Nonref - Full chargeNightly:Partial Nonref - Full charge
	
		@FindBy(id = "room_22443_10434_0")
		private WebElement nightly_full_ref_fullCharge; //Nightly:Full Ref - Full Charge
		
		@FindBy(id = "room_22444_10434_0")
		private WebElement nightly_full_nonref_notAllowed; //Nightly:Full NonRef - Not Allowed
		
		
		
		// Get Element Locators
		public WebElement nightly_partial_nonref_fullcharge() {
			return wait.until(ExpectedConditions.visibilityOf(nightly_partial_nonref_fullCharge));
		}
		
		public WebElement nightly_full_ref_fullCharge() {
			return wait.until(ExpectedConditions.visibilityOf(nightly_full_ref_fullCharge));
		}
		
		public WebElement nightly_full_nonref_notAllowed() {
			return wait.until(ExpectedConditions.visibilityOf(nightly_full_nonref_notAllowed));
		}
		


	}


