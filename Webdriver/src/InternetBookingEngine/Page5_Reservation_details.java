package InternetBookingEngine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Page5_Reservation_details {
	private String csvFile = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\";
	private String fileName;
	private String extension = ".csv";
	private String csvFileName;

	private Calendar now;
	private String get_time;
	private DateFormat date_format = new SimpleDateFormat("yyyyMMdd.HHmm");


	public String setCsvFile(String payment_settings, String room_name, boolean cc_owner){
		if (payment_settings=="DWH"){
			if(room_name == "Partial Nonref"){
				fileName = "DWH_Partial_Nonref";
			}else if(room_name == "Full Ref"){
				if(cc_owner){
					fileName = "DWH_Full Ref";
				}else{
					fileName = "DWH_Full_Ref_On_hold";
				}
			}else if(room_name == "Full Nonref"){
				if(cc_owner){
					fileName = "DWH_Full_Nonref";
				}else{
					fileName = "DWH_Full_Nonref_On_hold";
				}
			}else{
				System.err.println(" No rooms available");
			}
		}else if (payment_settings=="HPP"){
			if(room_name == "Partial Nonref"){
				fileName = "HPP_Partial_Nonref";
			}else if(room_name == "Partial Ref"){
				fileName = "HPP_Partial_ref";
			}else if(room_name == "Full Ref"){
				fileName = "HPP_Full_ref.csv";
			}else if(room_name == "Full Nonref"){
				fileName = "HPP_Full_Nonref";
			}else{
				fileName = "HPP_Upon_Arrival";
			}
		}else{
			System.out.println("No payment processor");
		}


		now = Calendar.getInstance();
		Date complete_date_1 = now.getTime();
		get_time = date_format.format(complete_date_1); 
		System.out.println(String.valueOf(get_time));		

		csvFileName = csvFile + fileName + "_" + get_time + extension;
		System.out.println(csvFileName);
		return csvFileName;
	}
}