package InternetBookingEngine;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.WebDriver;

public class Page5 {
	private String filePath = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\Test_Reservation.csv";
	private locator_step5 step5;
	private String intro;
	private String disclaimer;
	private FileWriter writer;
	private Page5_Labels labels;
	private Page5_Values values;
	private File createFile;
	private HashMap<Integer, String> listOfLabel;
	private HashMap<Integer, String> listOfValues;

	public Page5(WebDriver driver) {
		step5 = new locator_step5(driver);
		labels = new Page5_Labels(driver);
		values = new Page5_Values(driver);
	}

	public void confirmPage() throws IOException {
		intro = step5.introCpage().getText();
		System.out.println(intro);
		disclaimer = step5.label_disclaimer().getText();
		System.out.println(disclaimer);
	}

	public void generateCsv(String payment_settings, String room_name, boolean cc_owner, String reservation_status) throws IOException {
		// Create and Write Reservation Details to CSV

		createFile = new File(filePath);
		try {
			writer = new FileWriter(filePath, true);
			if(!file_has_reservationDetails_label()){
				listOfLabel = labels.get_confirmPage_labels(payment_settings, reservation_status);
				for(int label_keys : listOfLabel.keySet()){
					writer.append(listOfLabel.get(label_keys).toString().concat(","));		
				}
				writer.write("\r\n");
			}

			listOfValues = values.get_confirmPage_values(payment_settings, room_name, cc_owner, reservation_status);
			for(int value_keys : listOfValues.keySet()){
				writer.append("\"").append(listOfValues.get(value_keys).toString()).append("\"").append(",");
			}
			writer.write("\r\n");
		} catch(Exception e){
			e.printStackTrace();
		}
		// Close CSV
		System.out.println(disclaimer);
		writer.flush();
		writer.close();
	}

	private boolean file_has_reservationDetails_label() throws IOException {
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(createFile));
		if (reader.readLine() != null) {
			return true;
		} else {
			return false;
		}
	}



}
