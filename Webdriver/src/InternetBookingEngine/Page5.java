package InternetBookingEngine;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.WebDriver;

public class Page5 {
	private String file_path = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\Test_Reservation.csv";
	private LocatorStep5 step5;
	private String intro;
	private String disclaimer;
	private FileWriter writer;
	private Page5Labels labels;
	private Page5Values values;
	private File create_file;
	private HashMap<Integer, String> list_of_label;
	private HashMap<Integer, String> list_of_values;

	public Page5(WebDriver driver) {
		step5 = new LocatorStep5(driver);
		labels = new Page5Labels(driver);
		values = new Page5Values(driver);
	}

	public void confirmPage() throws IOException {
		intro = step5.introCpage().getText();
		System.out.println(intro);
		disclaimer = step5.labelDisclaimer().getText();
		System.out.println(disclaimer);
	}

	public void generateCsv(String payment_settings, String room_name, boolean cc_owner, String reservation_status) throws IOException {
		// Create and Write Reservation Details to CSV

		create_file = new File(file_path);
		try {
			writer = new FileWriter(file_path, true);
			if(!fileHasReservationDetailsLabel()){
				list_of_label = labels.get_confirmPage_labels(payment_settings, reservation_status);
				for(int label_keys : list_of_label.keySet()){
					writer.append(list_of_label.get(label_keys).toString().concat(","));		
				}
				writer.write("\r\n");
			}
			list_of_values = values.getConfirmPageValues(payment_settings, room_name, cc_owner, reservation_status);
			for(int value_keys : list_of_values.keySet()){
				writer.append("\"").append(list_of_values.get(value_keys).toString()).append("\"").append(",");
			}
			writer.write("\r\n");
		} catch(Exception e){
			e.printStackTrace();
		}
		// Close CSV
		writer.flush();
		writer.close();
	}

	private boolean fileHasReservationDetailsLabel() throws IOException {
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(create_file));
		return (reader.readLine() != null) ? true : false;
	}



}
