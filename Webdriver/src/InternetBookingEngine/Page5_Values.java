package InternetBookingEngine;


import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;


public class Page5_Values{

	private locator_step5 step5;
	private String confirmation_number;
	private String transact_id;
	private String guest_name;
	private String email_add;
	private String mobile_no;
	private String guest_country;
	private String name_of_card_owner;
	private String credit_card_number;
	private String credit_card_expiry;
	private String reservation_made_on;
	private String guest_reservation_details;
	private String estimated_of_arrival;
	private String guest_check_in;
	private String guest_check_out;
	private String room_cost;
	private String taxes;
	private String total_reservation_cost;
	private String prepayment_paid;
	private String payable_at_the_hotel;
	private Page5_Reservation_details get_csvFileName;


	public Page5_Values(WebDriver driver){ 
		step5 = new locator_step5(driver);
		get_csvFileName = new Page5_Reservation_details();
	}
	public ArrayList<HashMap<Integer, String>> get_confirmPage_values(String payment_settings, String room_name, boolean cc_owner) {
		/* Guest Information*/
		confirmation_number = step5.confirmation_number().getText();
		transact_id = step5.transaction_id().getText();
		guest_name = step5.guest_name().getText();
		email_add = step5.email_add().getText();
		mobile_no = step5.mobile_no().getText();
		guest_country = step5.guest_country().getText();
		name_of_card_owner = step5.name_of_card_owner().getText();
		credit_card_number = step5.credit_card_number().getText();
		credit_card_expiry = step5.credit_card_expiry().getText();
		reservation_made_on = step5.reservation_made_on().getText();
		guest_reservation_details = step5.guest_reservation_details().getText();
		estimated_of_arrival = step5.estimated_of_arrival().getText();
		guest_check_in = step5.guest_check_in().getText();
		guest_check_out = step5.guest_check_out().getText();
		room_cost = step5.room_cost().getText();
		taxes = step5.taxes().getText();
		total_reservation_cost = step5.total_reservation_cost().getText();
		prepayment_paid = step5.prepayment_paid().getText();
		payable_at_the_hotel = step5.payable_at_the_hotel().getText();
	
		ArrayList<HashMap<Integer, String>> myListv2 = new ArrayList<HashMap<Integer, String>>();

		HashMap<Integer, String> guestData = new HashMap<Integer, String>(); 

		guestData.put(0, get_csvFileName.reservationMadeOn());
		guestData.put(1, get_csvFileName.setPaymentName(payment_settings, room_name, cc_owner));
		guestData.put(2, confirmation_number);
		guestData.put(3, transact_id);
		guestData.put(4, guest_name);
		guestData.put(5, email_add);
		guestData.put(6, mobile_no);
		guestData.put(7, guest_country);
		guestData.put(8, name_of_card_owner);
		guestData.put(9, credit_card_number);
		guestData.put(10, credit_card_expiry);
		guestData.put(11, reservation_made_on);
		guestData.put(12, guest_reservation_details);
		guestData.put(13, estimated_of_arrival);
		guestData.put(14, guest_check_in);
		guestData.put(15, guest_check_out);
		guestData.put(16, room_cost);
		guestData.put(17, taxes);
		guestData.put(18, total_reservation_cost);
		guestData.put(19, prepayment_paid);
		guestData.put(20, payable_at_the_hotel);
		myListv2.add(guestData);
		return myListv2;	
	}
}
