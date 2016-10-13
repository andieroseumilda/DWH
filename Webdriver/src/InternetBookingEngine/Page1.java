package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page1 {

	WebDriver driver;
	private GetDate selectStayDates;
	private LocatorStep1 step1;

	public Page1(WebDriver driver) {
		this.driver = driver;
		step1 = new LocatorStep1(driver);
		selectStayDates = new GetDate(driver);
	}

	public void selectStayDates() {
		selectStayDates.selectArrivalDate();	
		selectStayDates.selectDeparture();
		step1.clickViewRoomAndPrices().click();
	}

	

}
