package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page1 {
	WebDriver driver;
	private GetDate selectStayDates;
	private locator_step1 step1;
	private Environment testServer;

	public Page1(WebDriver driver) {
		this.driver = driver;
		step1 = new locator_step1(driver);
		testServer = new Environment(driver);
		selectStayDates = new GetDate(driver);
	}

	//
	public void openIbe(String test_server, String payment_settings) {
		testServer.selectUrl(test_server, payment_settings);
	}

	public void selectStayDates() {
		selectStayDates.selectArrivalDate();	
		selectStayDates.selectDeparture();
		step1.clickViewRoomAndPrices().click();
	}

	

}
