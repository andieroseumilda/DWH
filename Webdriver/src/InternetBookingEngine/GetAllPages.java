package InternetBookingEngine;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class GetAllPages {

	// Start WebDriver

	private Page1 page1;
	private Page2 page2;
	private Page3 page3;
	private Page4 page4;
	private Page5 page5;
	

	public GetAllPages(WebDriver driver) throws MalformedURLException{
		
		page1 = new Page1(driver);
		page2 = new Page2(driver);
		page3 = new Page3(driver);
		page4 = new Page4(driver);
		page5 = new Page5(driver);
	}

	public void makeReservation(String test_server, String payment_settings, int step, String room_name, int no_of_rooms, boolean ccOwner){
		if (step==1) {
			page1.selectStayDates();
		}
//		page2.dwhCopy();
		page2.selectRoom(test_server, payment_settings, room_name, no_of_rooms);
		page3.clickGuestDetailsStep3();
		page4.paymentPage(payment_settings, ccOwner);
		page5.confirmPage();
	}
	
}

