package InternetBookingEngine;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.WebDriver;

public class Page5 {

	private locator_step5 step5;
	private String intro;
	private String disclaimer;

	private FileWriter writer;
	private Page5_Labels labels;
	private Page5_Values values;
	private Page5_Reservation_details get_csvFileName;
	private ArrayList<HashMap<Integer, String>> myListv1;
	private ArrayList<HashMap<Integer, String>> myListv2;
	private File fileExist;
	
	public Page5(WebDriver driver) {
		step5 = new locator_step5(driver);
		labels = new Page5_Labels(driver);
		values = new Page5_Values(driver);
		get_csvFileName = new Page5_Reservation_details();
	}

	public void confirmPage(String payment_settings, String room_name, boolean cc_owner) throws IOException {
		myListv1 = labels.get_confirmPage_labels();
		fileExist = new File(get_csvFileName.setCsvFile());
		writer = null;	
		
		intro = step5.introCpage().getText();
		System.out.println(intro);
		disclaimer = step5.label_disclaimer().getText();
		System.out.println(disclaimer);
		/*
		 * Conditions		
		 */

		try{	
			if(!fileExist.exists()){
				writer = new FileWriter(get_csvFileName.setCsvFile(),true);
				for(int cell_row = 0; cell_row < myListv1.size(); cell_row++){
					for(int cell_column = 0; cell_column < 20; cell_column++){
						writer.append(myListv1.get(cell_row).get(cell_column).toString().concat(","));	
					}
					writer.append("\r\n");
				}
				loopValues(payment_settings, room_name, cc_owner);

			} else {
				writer = new FileWriter(get_csvFileName.setCsvFile(), true);
				loopValues(payment_settings, room_name, cc_owner);
			}

		} catch(Exception e){
			e.printStackTrace();
		}

		System.out.println(disclaimer);
		writer.flush();
		writer.close();
	}
	
	private void loopValues(String payment_settings, String room_name, boolean cc_owner) throws IOException{
		myListv2 = values.get_confirmPage_values(payment_settings, room_name, cc_owner);
		for(int cell_row = 0; cell_row < myListv2.size(); cell_row++){
			for(int cell_column = 0; cell_column < 20; cell_column++){
				writer.append("\"");
				writer.append(myListv2.get(cell_row).get(cell_column).toString().concat("\","));	
			}
			writer.write("\r\n");
		}
	}

}
