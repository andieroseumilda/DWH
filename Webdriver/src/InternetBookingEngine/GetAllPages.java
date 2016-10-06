package InternetBookingEngine;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class GetAllPages {

	// Start WebDriver
	
	private Environment env;
	private Page1 page1;
	private Page2 page2;
	private Page3 page3;
	private Page4 page4;
	private Page5 page5;
	private OnholdAndOnholdPending onhold;
	private locator_onhold onhold_modal;


	public GetAllPages(WebDriver driver) throws MalformedURLException{
		
		env = new Environment(driver);
		page1 = new Page1(driver);
		page2 = new Page2(driver);
		page3 = new Page3(driver);
		page4 = new Page4(driver);
		page5 = new Page5(driver);
		onhold = new OnholdAndOnholdPending(driver);
		onhold_modal = new locator_onhold(driver);
	}

	public void makeReservation(String test_server, String payment_settings, int step, String room_name, int no_of_rooms, boolean ccOwner, boolean upload_image) throws IOException{
		env.openIbe(test_server, payment_settings, step);
		if (step==1) {
			page1.selectStayDates();
		}
		//		page2.dwhCopy();
		page2.selectRoom(test_server, payment_settings, room_name, no_of_rooms);
		page3.clickGuestDetailsStep3();
		page4.paymentPage(payment_settings, ccOwner);

		if(payment_settings == "DWH"){
			if(room_name == "Full Ref" || room_name == "Full Nonref" ){
				if(!ccOwner){
					onhold_modal.btnCcFraudModal().click();
					if(upload_image){
						onhold.uploadImages();
						onhold.clickUploadAndContinue();;
					}else{
						onhold.onholdPending();

					}
				}
			}
		}
		
		page5.confirmPage(payment_settings, room_name, ccOwner);

	}

}

