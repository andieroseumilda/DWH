package InternetBookingEngine;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class Page3Values {
	
	private LocatorStep3 step3;
	private String step3_room_cost;
	private String step3_taxes;
//	private String step3_fees;
	private String step3_total_room_charges;
	private String step3_total_reservation_cost;
	private String step3_prepayment_charge;
	private String step3_payabale_at_the_hotel;
	


	public Page3Values(WebDriver driver) {
		step3 = new LocatorStep3(driver);
	}
	
	public HashMap<Integer, String> step3Values(String payment_settings){
		
		/* Label */
		step3_room_cost = step3.step3RoomCost().getText();
		step3_taxes = step3.step3Taxes().getText();
//		step3_fees = step3.step3Fees().getText();
		step3_total_room_charges = step3.step3TotalRoomCharges().getText();
		step3_total_reservation_cost = step3.step3TotalReservationCost().getText();
		if(payment_settings.equals("DWH")){
			step3_prepayment_charge = step3.step3DwhPrepaymentCharge().getText();
		}else{
			step3_prepayment_charge = step3.step3HppPrepaymentCharge().getText();
		}
		step3_payabale_at_the_hotel = step3.step3PayableAtTheHotel().getText();
		
		HashMap<Integer, String> step3_values = new HashMap<Integer, String>();
		step3_values.put(0, step3_room_cost);
		step3_values.put(1, step3_taxes);
//		step3_values.put(2, step3_fees);
		step3_values.put(2, step3_total_room_charges);
		step3_values.put(3, step3_total_reservation_cost);
		step3_values.put(4, step3_prepayment_charge);
		step3_values.put(5, step3_payabale_at_the_hotel);
		return step3_values;
	}
}
