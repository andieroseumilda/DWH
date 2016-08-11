package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page1 {
	WebDriver driver;
	private locator_step1 step1;
	private Environment testServer;

	public Page1(WebDriver driver) {
		this.driver = driver;
		step1 = new locator_step1(driver);
		testServer = new Environment(driver);
	}

	//
	public void openIbe(String test_server, String payment_settings) {
		testServer.selectUrl(test_server, payment_settings);
	}

	public void selectStayDates() {
		// Select arrival and departure dates
		step1.selectArrival().click();
		step1.selectDeparture().click();
		step1.clickViewRoomAndPrices().click();
	}

	

}
