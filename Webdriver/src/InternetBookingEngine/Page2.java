package InternetBookingEngine;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Page2 {

	private locator_step2 step2;
	Policies_copies copy;

	public Page2(WebDriver driver) {
		step2 = new locator_step2(driver);
	}

	public void get_room(String test_server, String payment_settings, int no_of_rooms) {
		WebElement room_type = null;

		if (payment_settings=="DWH"){
			room_type = step2.selectDwhRoom();
		}else {
			room_type = step2.selectHppRoom();
		}

		Select room = new Select(room_type);
		room.selectByIndex(no_of_rooms);		
		
		if(no_of_rooms!=0){
			clickReserveNow();
		}
	}

	public void dwhCopy() {
		copy = new Policies_copies();
		step2.clickFullRatePlan().click();
		step2.clickReservationPolicies().click();
		System.out.println(step2.dwhFullRefModif().getText() + copy.fullChargeModifPol());
		assertEquals(step2.dwhFullRefModif().getText(), copy.fullChargeModifPol());
		step2.closeWindow().click();
	}

	public void selectRoom(String test_server, String payment_settings, int no_of_rooms) {
		get_room(test_server, payment_settings, no_of_rooms);
		//step2.fullRatePlan().click();
	}

	public void clickReserveNow(){
		step2.btnReserve().click();
	}
}
