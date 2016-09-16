package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import static org.junit.Assert.assertEquals;

public class Page2 {

	private locator_step2 step2;
	private locator_step3 step3;
	//	private Policies_copies copy;
	private SelectRatePlanAndRooms select_room;
	WebDriver driver;
	boolean a = true;

	public Page2(WebDriver driver) {
		step2 = new locator_step2(driver);
		step3 = new locator_step3(driver);
		select_room = new SelectRatePlanAndRooms(driver);
		this.driver = driver;
	}

	public void get_room(String test_server, String payment_settings, String room_name, int no_of_rooms) {
		WebElement room_type = null;

		if (payment_settings=="DWH"){
			//room_type = select_room.nightly_partial_nonref_fullcharge();
			if(room_name == "Partial Nonref"){
				room_type = select_room.nightly_partial_nonref_fullcharge();
			}else if(room_name == "Full Ref"){
				room_type = select_room.nightly_full_ref_fullCharge();
			}else if(room_name == "Full Nonref"){
				room_type = select_room.nightly_partial_nonref_fullcharge();
			}else{
				System.out.println(" No rooms available");
			}
		}

		Select room = new Select(room_type);
		System.out.println(room);
		room.selectByIndex(no_of_rooms);
		clickReserveNow();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(visibilityOf(step3.CTAstep3()));
		} catch (Exception e) {
			if (driver.getCurrentUrl().contains("reservation/showRooms")) {
				clickReserveNow();
			}
		}


	}


	//public void dwhCopy() {
	//	copy = new Policies_copies();
	//	step2.clickFullRatePlan().click();
	//	step2.clickReservationPolicies().click();
	//	System.out.println(step2.dwhFullRefModif().getText() + copy.fullChargeModifPol());
	//	assertEquals(step2.dwhFullRefModif().getText(), copy.fullChargeModifPol());
	//	step2.closeWindow().click();
	//}


	public void selectRoom(String test_server, String payment_settings, String room_name, int no_of_rooms) {
		get_room(test_server, payment_settings, room_name, no_of_rooms);
	}

	public void clickReserveNow(){
		step2.clickReserveNowStep2().click();
	}


}
