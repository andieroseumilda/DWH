package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page1 {
	private WebDriver driver;
	private String hotel_id;
	private String base_url = "http://staging-reservations.directwithhotels.com/reservation/selectDates/";
	private String dwh_web_page = "18977";
	private String hpp_web_page = "17371";
	private locator_step1 step1;

	public Page1(WebDriver driver) {
		this.driver = driver;
		step1 = new locator_step1(driver);
	}

	//
	public void openIbe(String paymentProcessor) {
		selectUrl(paymentProcessor);
	}

	public void selectStayDates() {
		// Select arrival and departure dates
		step1.selectArrival().click();
		step1.selectDeparture().click();
		step1.clickViewRoomAndPrices().click();
	}

	public void selectUrl(String paymentProcessor){
		switch(paymentProcessor){
		case "DWH" :
			hotel_id = dwh_web_page;
			break;
		default :			
			hotel_id = hpp_web_page;
			break;
		}
		driver.get(base_url + hotel_id);
	}

}
