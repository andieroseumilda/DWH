package ibe;

import org.openqa.selenium.WebDriver;

public class Page1 {

	private WebDriver driver;
	private String hotel_id;
	private String base_url = "http://staging-reservations.directwithhotels.com/reservation/selectDates/";
	private String dwh_web_page = "18977";
	private String hpp_web_page = "17371";
	
	public Page1(WebDriver driver) {
		this.driver = driver;
	}

	public void urlStep1(String paymentProcessor) {
		urlIbe(paymentProcessor);

	}
	public void urlIbe(String paymentProcessor){
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
	

	public void selectStayDates() {

		// Select arrival and departure dates
		locator_step1 step1 = new locator_step1(driver);
		step1.arrival().click();
		step1.departure().click();
		step1.CTA().click();
	}
}
