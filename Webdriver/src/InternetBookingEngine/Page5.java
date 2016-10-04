package InternetBookingEngine;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.WebDriver;

public class Page5 {

	private String csvFile = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\TestReservation3.csv";
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
		ArrayList<HashMap<Integer, String>> myListv1 = new ArrayList<HashMap<Integer, String>>();
		HashMap<Integer, String> listOfLabel = new HashMap<Integer, String>(); 

		listOfLabel.put(0, label_cnumber);
		listOfLabel.put(1, label_transaction_id);
		listOfLabel.put(2, label_guest_name);
		listOfLabel.put(3, label_email_add);
		listOfLabel.put(4, label_mobile_no);
		listOfLabel.put(5, label_country);
		listOfLabel.put(6, label_name_of_card_owner);
		listOfLabel.put(7, label_card_number);
		listOfLabel.put(8, label_credit_card_expiry);
		listOfLabel.put(9, label_reservation_made_on);
		listOfLabel.put(10, label_reservation_details);
		listOfLabel.put(11, label_estimated_of_arrival);
		listOfLabel.put(12, label_check_in);
		listOfLabel.put(13, label_check_out);
		listOfLabel.put(14, label_room_cost);
		listOfLabel.put(15, label_taxes);
		listOfLabel.put(16, label_total_reservation_cost);
		listOfLabel.put(17, label_prepayment_paid);
		listOfLabel.put(18, label_payable_at_the_hotel);
		myListv1.add(listOfLabel);
		
		ArrayList<HashMap<Integer, String>> myListv2 = new ArrayList<HashMap<Integer, String>>();

		HashMap<Integer, String> guestData = new HashMap<Integer, String>(); 
		
		guestData.put(0, confirmation_number);
		guestData.put(1, transact_id);
		guestData.put(2, guest_name);
		guestData.put(3, email_add);
		guestData.put(4, mobile_no);
		guestData.put(5, guest_country);
		guestData.put(6, name_of_card_owner);
		guestData.put(7, credit_card_number);
		guestData.put(8, credit_card_expiry);
		guestData.put(9, reservation_made_on);
		guestData.put(10, guest_reservation_details);
		guestData.put(11, estimated_of_arrival);
		guestData.put(12, guest_check_in);
		guestData.put(13, guest_check_out);
		guestData.put(14, room_cost);
		guestData.put(15, taxes);
		guestData.put(16, total_reservation_cost);
		guestData.put(17, prepayment_paid);
		guestData.put(18, payable_at_the_hotel);
		myListv2.add(guestData);


		FileWriter writer;
		writer = new FileWriter(csvFile);
		
		
		for(int i = 0; i < myListv1.size(); i++){
			writer.write(myListv1.get(i).get(0).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(1).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(2).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(3).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(4).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(5).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(6).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(7).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(8).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(9).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(10).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(11).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(12).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(13).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(14).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(15).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(16).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(17).toString());
			writer.write(",");
			writer.write(myListv1.get(i).get(18).toString());
			writer.write(",");
			writer.write("\r\n");
		}
		
		
	
		for(int i = 0; i < myListv2.size(); i++){
			writer.append("\"");
			writer.append(myListv2.get(i).get(0).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(1).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(2).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(3).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(4).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(5).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(6).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(7).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(8).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(9).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(10).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(11).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(12).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(13).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(14).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(15).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(16).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(17).toString());
			writer.append("\"");
			writer.write(",");
			writer.append("\"");
			writer.append(myListv2.get(i).get(18).toString());
			writer.append("\"");
			writer.write(",");
			writer.write("\r\n");

		}
		

		System.out.println(disclaimer);
		writer.flush();
		writer.close();
	}

}
