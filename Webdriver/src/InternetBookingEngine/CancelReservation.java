package InternetBookingEngine;


import org.openqa.selenium.WebDriver;


public class CancelReservation {
	WebDriver driver;
	private LocatorCancel cancel;

	public CancelReservation(WebDriver driver) {
		this.driver = driver;
		cancel = new LocatorCancel(driver);
	}

	public void cancelReservation(){
		
		cancel.clickCancelReservation().click();
		cancel.clickYesToCancel().click();
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

