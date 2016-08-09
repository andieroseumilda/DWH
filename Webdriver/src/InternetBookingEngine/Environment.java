package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Environment {
	
	
	private WebDriver driver;
	private String hotel_id;
	private String environment = "http://staging";
	private String base_url = "reservations.directwithhotels.com/reservation/selectDates/";
	private String dwh_web_page = "18977";
	private String hpp_web_page = "17371";
	
	public Environment(WebDriver driver) {
		this.driver = driver;
	}
	public void openUrlStep1(String paymentProcessor) {
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
		driver.get(environment + base_url + hotel_id);
	}
	
	
	
	
}
