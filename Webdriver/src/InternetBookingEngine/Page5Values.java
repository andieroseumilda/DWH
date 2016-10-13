package InternetBookingEngine;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class Page5Values{

	private LocatorStep5 step5;
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
	private Page5CsvScenario get_csvFileName;

	public Page5Values(WebDriver driver){ 
		step5 = new LocatorStep5(driver);
		get_csvFileName = new Page5CsvScenario();
	}
	public HashMap<Integer, String> getConfirmPageValues(String payment_settings, String room_name, boolean cc_owner, String reservation_status) {
		/* Guest Information*/
		confirmation_number = step5.confirmationNumber().getText();
		transact_id = step5.transactionId().getText();
		guest_name = step5.guestName().getText();
		email_add = step5.emailAdd().getText();
		mobile_no = step5.mobileNo().getText();
		guest_country = step5.guestCountry().getText();
		name_of_card_owner = step5.nameOfCardOwner().getText();
		credit_card_number = step5.creditCardNumber().getText();
		credit_card_expiry = step5.creditCardExpiry().getText();
		reservation_made_on = step5.reservationMadeOn().getText();
		guest_reservation_details = step5.guestReservationDetails().getText();
		estimated_of_arrival = step5.estimatedOfArrival().getText();
		guest_check_in = step5.guestCheckIn().getText();
		guest_check_out = step5.guestCheckOut().getText();
		room_cost = step5.roomCost().getText();
		taxes = step5.taxes().getText();
		total_reservation_cost = step5.totalReservationCost().getText();
		if(reservation_status=="Confirmed"){
			if(payment_settings=="DWH"){
				prepayment_paid = step5.dwhPrepaymentPaid().getText();	
			}else{
				prepayment_paid = step5.hppPrepayment().getText();
			}
			payable_at_the_hotel = step5.payableAtTheHotel().getText();		
		} else{
			prepayment_paid = " ";
			payable_at_the_hotel = " ";
		}
		
		HashMap<Integer, String> list_of_value = new HashMap<Integer, String>(); 
		list_of_value.put(0, get_csvFileName.reservationMadeOn());
		list_of_value.put(1, get_csvFileName.setPaymentName(payment_settings, room_name, cc_owner, reservation_status));
		list_of_value.put(2, confirmation_number);
		list_of_value.put(3, transact_id);
		list_of_value.put(4, guest_name);
		list_of_value.put(5, email_add);
		list_of_value.put(6, mobile_no);
		list_of_value.put(7, guest_country);
		list_of_value.put(8, name_of_card_owner);
		list_of_value.put(9, credit_card_number);
		list_of_value.put(10, credit_card_expiry);
		list_of_value.put(11, reservation_made_on);
		list_of_value.put(12, guest_reservation_details);
		list_of_value.put(13, estimated_of_arrival);
		list_of_value.put(14, guest_check_in);
		list_of_value.put(15, guest_check_out);
		
		list_of_value.put(16, room_cost);
		list_of_value.put(17, taxes);	
		list_of_value.put(18, total_reservation_cost);
		list_of_value.put(19, prepayment_paid);
		list_of_value.put(20, payable_at_the_hotel);
		return list_of_value;	
	}
}
