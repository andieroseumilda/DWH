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
	private ArrayList<HashMap<Integer, String>> get_label_list;
	private ArrayList<HashMap<Integer, String>> get_values_list;
	private File createFile;
	

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
	
	public void generateCsv(String payment_settings, String room_name, boolean cc_owner, int cancel) throws IOException {
		// Create and Write Reservation Details to CSV
		createFile = new File(filePath);		
		try {
			writer = new FileWriter(filePath, true);
			if(!file_has_reservationDetails_label()){
				get_label_list = labels.get_confirmPage_labels(cancel); 
				write_csv_reservationDetails(get_label_list);
			}
			get_values_list = values.get_confirmPage_values(payment_settings, room_name, cc_owner, cancel);
			write_csv_reservationDetails(get_values_list);
			
		} catch(Exception e){
			e.printStackTrace();
		}

		// Close CSV
		System.out.println(disclaimer);
		writer.flush();
		writer.close();
	}
	
	private void write_csv_reservationDetails(ArrayList<HashMap<Integer, String>> data) throws IOException {
		for(int cell_row = 0; cell_row < data.size(); cell_row++){
			for(int cell_column = 0; cell_column < 20; cell_column++){
				add_backslash_character(get_values_list);
				writer.append(data.get(cell_row).get(cell_column).toString());
				add_backslash_character(get_values_list);
				writer.append(",");
			}
			writer.write("\r\n");
		}		
		System.out.println("Succesfully Created!s");
	}
	
	private void add_backslash_character(ArrayList<HashMap<Integer, String>> data) throws IOException {
		if (get_values_list != null) {
			if (data.equals(get_values_list)) {
				writer.append("\"");					
			}			
		}
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
