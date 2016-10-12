package InternetBookingEngine;


import org.openqa.selenium.WebDriver;


public class CancelReservation {
	WebDriver driver;
	private locator_cancel cancel;

	public CancelReservation(WebDriver driver) {
		this.driver = driver;
		cancel = new locator_cancel(driver);
	}

	public void cancelReservation(){
		
		cancel.click_cancel_reservation().click();
		cancel.click_yes_to_cancel().click();
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(visibilityOf(cancel.click_cancel_reservation()));
//		} catch (Exception e) {
//			if (driver.getCurrentUrl().contains("reservation/details")) {
//			
//			}
//		}
	}
}

