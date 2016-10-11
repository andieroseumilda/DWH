package InternetBookingEngine;

import java.util.*;

import org.openqa.selenium.WebDriver;

public class Page5_Labels {
	
	private locator_step5 step5;
	private String label_cnumber;
	private String label_transaction_id;
	private String label_guest_name;
	private String label_email_add;
	private String label_mobile_no;
	private String label_country;
	private String label_name_of_card_owner;
	private String label_card_number;
	private String label_credit_card_expiry;
	private String label_reservation_made_on;
	private String label_reservation_details;
	private String label_estimated_of_arrival;
	private String label_check_in;
	private String label_check_out;
	private String label_room_cost;
	private String label_taxes;
	private String label_total_reservation_cost;
	private String label_prepayment_paid;
	private String label_payable_at_the_hotel;

	public Page5_Labels(WebDriver driver) {
		step5 = new locator_step5(driver);
	}

	public ArrayList<HashMap<Integer, String>> get_confirmPage_labels(int cancel) {

		/* Label */
		label_cnumber = step5.label_cnumber().getText();
		label_transaction_id = step5.label_transaction_id().getText();
		label_guest_name = step5.label_guest_name().getText();
		label_email_add = step5.label_email_add().getText();
		label_mobile_no = step5.label_mobile_no().getText();
		label_country = step5.label_country().getText();
		label_name_of_card_owner = step5.label_name_of_card_owner().getText();
		label_card_number = step5.label_card_number().getText();
		label_credit_card_expiry = step5.label_credit_card_expiry().getText();
		label_reservation_made_on = step5.label_reservation_made_on().getText();
		label_reservation_details = step5.label_reservation_details().getText();
		label_estimated_of_arrival = step5.label_estimated_of_arrival().getText();
		label_check_in = step5.label_check_in().getText();
		label_check_out = step5.label_check_out().getText();
		label_room_cost = step5.label_room_cost().getText();		
		label_taxes = step5.label_taxes().getText();
		label_total_reservation_cost = step5.label_total_reservation_cost().getText();
		if(!(cancel==1)){
			label_prepayment_paid = step5.label_prepayment_paid().getText();
			label_payable_at_the_hotel = step5.label_payable_at_the_hotel().getText();
		}
		

		 /* Conditions		
		 */
		ArrayList<HashMap<Integer, String>> myListv1 = new ArrayList<HashMap<Integer, String>>();
		HashMap<Integer, String> listOfLabel = new HashMap<Integer, String>();

		listOfLabel.put(0, "Date Created");
		listOfLabel.put(1, "Scenario");
		listOfLabel.put(2, label_cnumber);
		listOfLabel.put(3, label_transaction_id);
		listOfLabel.put(4, label_guest_name);
		listOfLabel.put(5, label_email_add);
		listOfLabel.put(6, label_mobile_no);
		listOfLabel.put(7, label_country);
		listOfLabel.put(8, label_name_of_card_owner);
		listOfLabel.put(9, label_card_number);
		listOfLabel.put(10, label_credit_card_expiry);
		listOfLabel.put(11, label_reservation_made_on);
		listOfLabel.put(12, label_reservation_details);
		listOfLabel.put(13, label_estimated_of_arrival);
		listOfLabel.put(14, label_check_in);
		listOfLabel.put(15, label_check_out);
		listOfLabel.put(16, label_room_cost);
		listOfLabel.put(17, label_taxes);
		listOfLabel.put(18, label_total_reservation_cost);
		listOfLabel.put(19, label_prepayment_paid);
		listOfLabel.put(20, label_payable_at_the_hotel);
		myListv1.add(listOfLabel);
		
		return myListv1;
	}

}