package InternetBookingEngine;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.WebDriver;

public class Environment {

	WebDriver driver;
	private int hotel_id;
	private String select_test_server;
	private String environment_staging = "http://staging-";
	private String environment_dev = "http://dev-";
	private String environment_uat = "http://uat-";
	private String base_url = "reservations.directwithhotels.com/reservation/";
	private int dwh_web_page = 19130; //19130
	private int hpp_web_page = 19152; //17371
	private String page1 = "selectDates/";
	private String page2 = "showRooms/";
	private Calendar now;
	private SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
	private int get_day_format = Calendar.DATE;
	private String get_day;
	private String get_departure;

	public Environment(WebDriver driver) {
		this.driver = driver;
	}

	public void openIbe(String test_server, String payment_settings,  int step) {
		
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

		if (step == 1){
			driver.get(select_test_server + base_url + page1 + hotel_id);
		}else{	
			now = Calendar.getInstance();
			now.add(get_day_format, 1);
			Date complete_date_1 = now.getTime();
			get_day = date_format.format(complete_date_1); 

			now.add(get_day_format, 3);
			Date complete_date_2 = now.getTime();
			get_departure = date_format.format(complete_date_2);  // added dates

			driver.get(select_test_server + base_url + page2  + hotel_id + "/" + get_day + "/" + get_departure + "/en/0/0/0/0");
		}		
	}



}