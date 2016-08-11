package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Environment {

	WebDriver driver;
	private String hotel_id;
	private String select_test_server;
	private String environment_staging = "http://staging-";
	private String environment_dev = "http://dev-";
	private String environment_uat = "http://uat-";
	private String base_url = "reservations.directwithhotels.com/reservation/selectDates/";
	private String dwh_web_page = "18977";
	private String hpp_web_page = "17371";

	public Environment(WebDriver driver) {
		this.driver = driver;
	}


	public void selectUrl(String test_server, String payment_settings){

		if (test_server == "staging"){
			select_test_server = environment_staging;
			if (payment_settings == "DWH"){
				hotel_id = dwh_web_page;
			}else {
				hotel_id = hpp_web_page;
			}
			
		}else if(test_server == "uat"){
			select_test_server = environment_uat;
			if (payment_settings == "DWH"){
				hotel_id = dwh_web_page;
			}else {
				hotel_id = hpp_web_page;
			}
		}else { 
			select_test_server = environment_dev;
			if (payment_settings == "DWH"){
				hotel_id = dwh_web_page;
			}else {
				hotel_id = hpp_web_page;
			}
		}

		driver.get(select_test_server + base_url + hotel_id);
		
	}

}