package InternetBookingEngine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Page5_Reservation_details {
	private String csvFile = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\";
	private String fileName = "Test_Reservation";
	private String extension = ".csv";
	private String csvFileName;
	private String room_type;

	private Calendar now;
	private String get_time;
	private DateFormat date_format = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	public String setCsvFile(){	
		csvFileName = csvFile + fileName + extension;
		System.out.println(csvFileName);
		return csvFileName;
		
	}
	
	public String reservationMadeOn(){
		now = Calendar.getInstance();
		Date complete_date_1 = now.getTime();
		get_time = date_format.format(complete_date_1); 	
		System.out.println(get_time);
		return get_time;
	}
	
	public String setPaymentName(String payment_settings, String room_name, boolean cc_owner){
		if (payment_settings=="DWH"){
			if(room_name == "Partial Nonref"){
				room_type = "DWH_Partial_NonRef";
			}else if(room_name == "Full Ref"){
				if(cc_owner){
				room_type = "DWH_Full_Ref";
				}else{
					room_type = "DWH_Full_Ref_ONHOLD";
				}
			}else if(room_name == "Full Nonref"){
				if(cc_owner){
					room_type = "DWH_Full_NonRef";
					}else{
						room_type = "DWH_Full_Nonref_ONHOLD";
					}
			}else{
				System.err.println(" No rooms available");
			}
		}else if (payment_settings=="HPP"){
			if(room_name == "Partial Nonref"){
				room_type = "HPP_Partial_Nonref";
			}else if(room_name == "Partial Ref"){
				room_type = "HPP_Partial_Ref";
			}else if(room_name == "Full Ref"){
				room_type = "HPP_Full_Ref";
			}else if(room_name == "Full Nonref"){
				room_type = "HPP_Full_Nonref";
			}else{
				room_type = "HPP_Upon_Arrival";
			}
		}else{
			System.out.println("No payment processor");
		}
		return room_type;	
		
	}
}