package InternetBookingEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectRatePlanAndRooms {
	
		private WebDriverWait wait;

		public SelectRatePlanAndRooms(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, 60);
		}

		// Element Locators
		/*         DWH		 */
		@FindBy(id = "room_22442_10433_0")
		private WebElement nightly_partial_nonref_fullCharge; //Nightly:Partial Nonref - Full chargeNightly:Partial Nonref - Full charge
	
		@FindBy(id = "room_22443_10434_0")
		private WebElement nightly_full_ref_fullCharge; //Nightly:Full Ref - Full Charge
		
		@FindBy(id = "room_22444_10434_0")
		private WebElement nightly_full_nonref_notAllowed; //Nightly:Full NonRef - Not Allowed
		
		/*         HPP		 */
		@FindBy(id = "room_22574_10468_0")
		private WebElement hpp_nightly_partial_ref_fullCharge; //Nightly:Partial Nonref - Full chargeNightly:Partial Nonref - Full charge
	
		@FindBy(id = "room_22575_10469_2")
		private WebElement hpp_nightly_partial_nonref_notAllowed; //Nightly:Partial Nonref - Full chargeNightly:Partial Nonref - Full charge
	
		@FindBy(id = "room_22572_10468_0")
		private WebElement hpp_nightly_full_ref_fullCharge; //Nightly:Full Ref - Full Charge
		
		@FindBy(id = "room_22573_10469_0")
		private WebElement hpp_nightly_full_nonref_notAllowed; //Nightly:Full NonRef - Not Allowed

		@FindBy(id = "room_22571_10468_0")
		private WebElement hpp_upon_arrival; //Nightly:Partial Nonref - Full chargeNightly:Partial Nonref - Full charge
	
		
		
		
		
		// Get Element Locators
		/*         DWH		 */
		public WebElement nightly_partial_nonref_fullcharge() {
			return wait.until(ExpectedConditions.visibilityOf(nightly_partial_nonref_fullCharge));
		}
		
		public WebElement nightly_full_ref_fullCharge() {
			return wait.until(ExpectedConditions.visibilityOf(nightly_full_ref_fullCharge));
		}
		
		public WebElement nightly_full_nonref_notAllowed() {
			return wait.until(ExpectedConditions.visibilityOf(nightly_full_nonref_notAllowed));
		}
		
		/*         HPP		 */
		public WebElement hpp_nightly_partial_ref_fullCharge() {
			return wait.until(ExpectedConditions.visibilityOf(hpp_nightly_partial_ref_fullCharge));
		}
		
		public WebElement hpp_nightly_partial_nonref_notAllowed() {
			return wait.until(ExpectedConditions.visibilityOf(hpp_nightly_partial_nonref_notAllowed));
		}
		
		public WebElement hpp_nightly_full_ref_fullCharge() {
			return wait.until(ExpectedConditions.visibilityOf(hpp_nightly_full_ref_fullCharge));
		}
		
		public WebElement hpp_nightly_full_nonref_notAllowed() {
			return wait.until(ExpectedConditions.visibilityOf(hpp_nightly_full_nonref_notAllowed));
		}
		
		public WebElement hpp_upon_arrival() {
			return wait.until(ExpectedConditions.visibilityOf(hpp_upon_arrival));
		}
	}


