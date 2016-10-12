package InternetBookingEngine;

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
	private Page5_Csv_Scenario get_csvFileName;

	public Page5_Values(WebDriver driver){ 
		step5 = new locator_step5(driver);
		get_csvFileName = new Page5_Csv_Scenario();
	}
	public HashMap<Integer, String> get_confirmPage_values(String payment_settings, String room_name, boolean cc_owner, String reservation_status) {
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
		if(reservation_status=="Confirmed"){
			if(payment_settings=="DWH"){
				prepayment_paid = step5.dwh_prepayment_paid().getText();	
			}else{
				prepayment_paid = step5.hpp_prepayment().getText();
			}
			payable_at_the_hotel = step5.payable_at_the_hotel().getText();		
		} else{
			prepayment_paid = " ";
			payable_at_the_hotel = " ";
		}
		
		HashMap<Integer, String> listOfValues = new HashMap<Integer, String>(); 
		listOfValues.put(0, get_csvFileName.reservationMadeOn());
		listOfValues.put(1, get_csvFileName.setPaymentName(payment_settings, room_name, cc_owner, reservation_status));
		listOfValues.put(2, confirmation_number);
		listOfValues.put(3, transact_id);
		listOfValues.put(4, guest_name);
		listOfValues.put(5, email_add);
		listOfValues.put(6, mobile_no);
		listOfValues.put(7, guest_country);
		listOfValues.put(8, name_of_card_owner);
		listOfValues.put(9, credit_card_number);
		listOfValues.put(10, credit_card_expiry);
		listOfValues.put(11, reservation_made_on);
		listOfValues.put(12, guest_reservation_details);
		listOfValues.put(13, estimated_of_arrival);
		listOfValues.put(14, guest_check_in);
		listOfValues.put(15, guest_check_out);
		listOfValues.put(16, room_cost);
		listOfValues.put(17, taxes);
		listOfValues.put(18, total_reservation_cost);
		listOfValues.put(19, prepayment_paid);
		listOfValues.put(20, payable_at_the_hotel);
		return listOfValues;	
	}
}
