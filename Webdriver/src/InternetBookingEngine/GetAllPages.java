package InternetBookingEngine;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class GetAllPages {

	// Start WebDriver

	private Environment env;
	private Page1 page1;
	private Page2 page2;
	private Page3 page3;
	private Page4 page4;
	private Page5 page5;
	private Page5Values page5_values;
	private OnholdAndOnholdPending onhold;
	private LocatorOnHold onhold_modal;
	private CancelReservation cancel_reservation;
	private HashMap<Integer, String> get_page3_list;
	private HashMap<Integer, String> get_page5_list;
	private String get_breakdownOfReservation_inPage3;
	private String get_breakdownOfReservation_inPage5;
	private boolean step3_and_step5_are_equal;

	public GetAllPages(WebDriver driver) throws MalformedURLException {

		env = new Environment(driver);
		page1 = new Page1(driver);
		page2 = new Page2(driver);
		page3 = new Page3(driver);
		page4 = new Page4(driver);
		page5 = new Page5(driver);
		page5_values = new Page5Values(driver);
		onhold = new OnholdAndOnholdPending(driver);
		onhold_modal = new LocatorOnHold(driver);
		cancel_reservation = new CancelReservation(driver);
	}

	/* All page	 */
	public void makeReservation(String test_server, String payment_settings, int step, String room_name, int no_of_rooms, boolean cc_owner, boolean upload_image, String reservation_status) throws IOException {
		env.openIbe(test_server, payment_settings, step);
		if (step == 1) {
			page1.selectStayDates();
		}
		// page2.dwhCopy();
		page2.selectRoom(test_server, payment_settings, room_name, no_of_rooms);
		page3.getValuesInStep3(payment_settings, room_name);
		get_breakdownOfReservation_inPage3 = getPage3List(payment_settings, room_name);
		page3.clickGuestDetailsStep3();
		page4.paymentPage(payment_settings, cc_owner);
		step4PaymentSettings(payment_settings, room_name, cc_owner, upload_image);
		page5.confirmPage();
		cancelReservation(reservation_status);
		page5.generateCsv(payment_settings, room_name, cc_owner,
				reservation_status);
		get_breakdownOfReservation_inPage5 = getPage5List(payment_settings,
				room_name, cc_owner, reservation_status);
		step3_and_step5_are_equal = compareStep3andStep5(
				get_breakdownOfReservation_inPage3,
				get_breakdownOfReservation_inPage5);
		System.out.println(step3_and_step5_are_equal);
	}

	/* Conditions*/
	public boolean compareStep3andStep5(String step3, String step5) {
		return (step3.equals(step5)) ? true : false;
	}

	public String getPage3List(String payment_settings, String room_name) {
		String get_page3_values = null;
		get_page3_list = page3.getValuesInStep3(payment_settings, room_name);
		for (int i = 0; i < get_page3_list.size(); i++) {
			get_page3_values = get_page3_list.get(get_page3_list.keySet().toArray()[i]);
			if (i == 2) {
				get_page3_list.remove(2);
			}
			if(i==4 && room_name.equals("Upon Arrival")){
				get_page3_list.remove(4);
			}
			System.out.println(get_page3_values);
		}
		
		return get_page3_values;
	}

	public void step4PaymentSettings(String payment_settings, String room_name, boolean cc_owner, boolean upload_image) {
		if (payment_settings.equals("DWH")) {
			if (room_name == "Full Ref" || room_name == "Full Nonref") {
				if (!cc_owner) {
					onhold_modal.btnCcFraudModal().click();
					if (upload_image) {
						onhold.uploadImages();
						onhold.clickUploadAndContinue();
					} else {
						onhold.onholdPending();
					}
				}
			}
		}
	}

	public void cancelReservation(String reservation_status) {
		if (reservation_status.equals("Cancel")) {
			cancel_reservation.cancelReservation();
		}
		System.out.println(reservation_status);
	}

	public String getPage5List(String payment_settings, String room_name,	boolean cc_owner, String reservation_status) {
		String get_page5_values = null;
		get_page5_list = page5_values.getConfirmPageValues(payment_settings,
				room_name, cc_owner, reservation_status);
		for (int i = 16; i < 21; i++) {
			get_page5_values = get_page5_list.get(get_page5_list.keySet().toArray()[i]).replace("*", "");
		}
		return get_page5_values;
	}
}
