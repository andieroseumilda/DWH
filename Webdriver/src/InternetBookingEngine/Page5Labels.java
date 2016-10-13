package InternetBookingEngine;

import java.util.*;

import org.openqa.selenium.WebDriver;

public class Page5Labels {

	private LocatorStep5 step5;
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
	private String label_prepayment;
	private String label_payable_at_the_hotel;

	public Page5Labels(WebDriver driver) {
		step5 = new LocatorStep5(driver);
	}

	public HashMap<Integer, String> get_confirmPage_labels(String payment_settings, String reservation_status) {

		/* Label */
		label_cnumber = step5.labelCardNumber().getText();
		label_transaction_id = step5.labelTransactionId().getText();
		label_guest_name = step5.labelGuestName().getText();
		label_email_add = step5.labelEmailAdd().getText();
		label_mobile_no = step5.labelMobileNo().getText();
		label_country = step5.labelCountry().getText();
		label_name_of_card_owner = step5.labelNameOfCardOwner().getText();
		label_card_number = step5.labelCardNumber().getText();
		label_credit_card_expiry = step5.labelCreditCardExpiry().getText();
		label_reservation_made_on = step5.labelReservationMadeOn().getText();
		label_reservation_details = step5.labelReservationDetails().getText();
		label_estimated_of_arrival = step5.labelEstimatedOfArrival().getText();
		label_check_in = step5.labelCheckIn().getText();
		label_check_out = step5.labelCheckOut().getText();
		label_room_cost = step5.labelRoomCost().getText();		
		label_taxes = step5.labelTaxes().getText();
		label_total_reservation_cost = step5.labelTotalReservationCost().getText();

		if(reservation_status=="Confirmed"){
			if(payment_settings=="DWH"){
				label_prepayment = step5.dwhLabelPrepaymentPaid().getText();
			}else{
				label_prepayment = step5.hppLabelPrepayment().getText(); 
			}
			label_payable_at_the_hotel = step5.labelPayableAtTheHotel().getText();
		}else{
			label_prepayment = "Prepayment - PAID:";
			label_payable_at_the_hotel = "Payable at the Hotel:";
		}

		/* Conditions		
		 */
		HashMap<Integer, String> list_of_label = new HashMap<Integer, String>();

		list_of_label.put(0, "Date Created");
		list_of_label.put(1, "Scenario");
		list_of_label.put(2, label_cnumber);
		list_of_label.put(3, label_transaction_id);
		list_of_label.put(4, label_guest_name);
		list_of_label.put(5, label_email_add);
		list_of_label.put(6, label_mobile_no);
		list_of_label.put(7, label_country);
		list_of_label.put(8, label_name_of_card_owner);
		list_of_label.put(9, label_card_number);
		list_of_label.put(10, label_credit_card_expiry);
		list_of_label.put(11, label_reservation_made_on);
		list_of_label.put(12, label_reservation_details);
		list_of_label.put(13, label_estimated_of_arrival);
		list_of_label.put(14, label_check_in);
		list_of_label.put(15, label_check_out);
		list_of_label.put(16, label_room_cost);
		list_of_label.put(17, label_taxes);
		list_of_label.put(18, label_total_reservation_cost);
		list_of_label.put(19, label_prepayment);
		list_of_label.put(20, label_payable_at_the_hotel);
		return list_of_label;
	}

}