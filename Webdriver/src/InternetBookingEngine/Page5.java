package InternetBookingEngine;

import java.io.FileWriter;
import java.util.TreeMap;
import java.util.Map;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.WebDriver;

public class Page5 {

	private String csvFile = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\TestReservation2.csv";
	private locator_step5 step5;
	private String intro;
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
	private String disclaimer;

	public Page5(WebDriver driver) {
		step5 = new locator_step5(driver);
	}

	public void confirmPage() throws IOException {
		intro = step5.introCpage().getText();
		System.out.println(intro);


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
		label_prepayment_paid = step5.label_prepayment_paid().getText();
		label_payable_at_the_hotel = step5.label_payable_at_the_hotel().getText();

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
		disclaimer = step5.label_disclaimer().getText();
		/*
		 * Conditions		
		 */

		ArrayList<HashMap<String, String>> myList = new ArrayList<HashMap<String, String>>();
		
		
		HashMap<String, String> guestData = new HashMap<String, String>();
		guestData.put(label_cnumber, confirmation_number);
		guestData.put(label_transaction_id, transact_id);
		guestData.put(label_guest_name, guest_name);
		guestData.put(label_email_add, email_add);
		guestData.put(label_mobile_no, mobile_no);
		guestData.put(label_country, guest_country);
		guestData.put(label_name_of_card_owner, name_of_card_owner);
		guestData.put(label_card_number, credit_card_number);
		guestData.put(label_credit_card_expiry, credit_card_expiry);
		guestData.put(label_reservation_made_on, reservation_made_on);
		guestData.put(label_reservation_details, guest_reservation_details);
		guestData.put(label_estimated_of_arrival, estimated_of_arrival);
		guestData.put(label_check_in, guest_check_in);
		guestData.put(label_check_out, guest_check_out);
		guestData.put(label_room_cost, room_cost);
		guestData.put(label_taxes, taxes);
		guestData.put(label_total_reservation_cost, total_reservation_cost);
		guestData.put(label_prepayment_paid, prepayment_paid);
		guestData.put(label_payable_at_the_hotel, payable_at_the_hotel);
		myList.add(guestData);

		FileWriter writer;
		writer = new FileWriter(csvFile);
		
		for(int i = 0; i < myList.size(); i++){
			writer.write(myList.get(i).get(label_cnumber).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_transaction_id).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_guest_name).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_email_add).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_mobile_no).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_country).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_name_of_card_owner).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_card_number).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_credit_card_expiry).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_reservation_made_on).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_reservation_details).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_estimated_of_arrival).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_check_in).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_check_out).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_room_cost).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_taxes).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_total_reservation_cost).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_prepayment_paid).toString());
			writer.write(",");
			writer.write(myList.get(i).get(label_payable_at_the_hotel).toString());
			writer.write(",");
			writer.write("\r\n");
		}
		
		for(int i = 0; i < myList.size(); i++){
			writer.write(myList.get(i).get(confirmation_number).toString());
			writer.write(",");
			writer.write(myList.get(i).get(transact_id).toString());
			writer.write(",");
			writer.write(myList.get(i).get(guest_name).toString());
			writer.write(",");
			writer.write(myList.get(i).get(email_add).toString());
			writer.write(",");
			writer.write(myList.get(i).get(mobile_no).toString());
			writer.write(",");
			writer.write(myList.get(i).get(guest_country).toString());
			writer.write(",");
			writer.write(myList.get(i).get(name_of_card_owner).toString());
			writer.write(",");
			writer.write(myList.get(i).get(credit_card_number).toString());
			writer.write(",");
			writer.write(myList.get(i).get(credit_card_expiry).toString());
			writer.write(",");
			writer.write(myList.get(i).get(reservation_made_on).toString());
			writer.write(",");
			writer.write(myList.get(i).get(guest_reservation_details).toString());
			writer.write(",");
			writer.write(myList.get(i).get(estimated_of_arrival).toString());
			writer.write(",");
			writer.write(myList.get(i).get(guest_check_in).toString());
			writer.write(",");
			writer.write(myList.get(i).get(guest_check_out).toString());
			writer.write(",");
			writer.write(myList.get(i).get(room_cost).toString());
			writer.write(",");
			writer.write(myList.get(i).get(taxes).toString());
			writer.write(",");
			writer.write(myList.get(i).get(total_reservation_cost).toString());
			writer.write(",");
			writer.write(myList.get(i).get(prepayment_paid).toString());
			writer.write(",");
			writer.write(myList.get(i).get(payable_at_the_hotel).toString());
			writer.write(",");
		}
		System.out.println(disclaimer);
				writer.flush();
				writer.close();
	}
}