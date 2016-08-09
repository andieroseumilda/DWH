package ibe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page2 {

	private locator_step2 step2;

	public Page2(WebDriver driver) {
		step2 = new locator_step2(driver);
	}

	public void selectRoom(String paymentProcessor, int no_of_rooms) {
		get_room(paymentProcessor, no_of_rooms);
		step2.btnReserve().click();
		//step2.fullRatePlan().click();
	}

	public void get_room(String paymentProcessor, int no_of_rooms) {
		WebElement room_type = null;

		switch (paymentProcessor) {
		case "DWH":
			room_type = step2.dwhRoom();
			break;		
		default : 
			room_type = step2.hppRoom();
			break;
		}
		Select room = new Select(room_type);
		room.selectByIndex(no_of_rooms);
	}

}
