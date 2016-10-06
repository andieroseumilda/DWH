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

	public Page5(WebDriver driver) {
		step5 = new locator_step5(driver);
		labels = new Page5_Labels(driver);
		values = new Page5_Values(driver);
		get_csvFileName = new Page5_Reservation_details();
	}

	public void confirmPage(String payment_settings, String room_name, boolean cc_owner) throws IOException {
		intro = step5.introCpage().getText();
		System.out.println(intro);
		disclaimer = step5.label_disclaimer().getText();
		System.out.println(disclaimer);

		/*
		 * Conditions		
		 */
		ArrayList<HashMap<Integer, String>> myListv1 = labels.get_confirmPage_labels();
		ArrayList<HashMap<Integer, String>> myListv2 = values.get_confirmPage_values(payment_settings, room_name, cc_owner);

		writer = null;	

		File fileExist = new File(get_csvFileName.setCsvFile());

		try{	
			if(!fileExist.exists()){
				writer = new FileWriter(get_csvFileName.setCsvFile(),true);
				for(int i = 0; i < myListv1.size(); i++){
					for(int j = 0; j < 20; j++){
						writer.append(myListv1.get(i).get(j).toString().concat(","));	
					}
					writer.append("\r\n");
				}
				for(int i = 0; i < myListv2.size(); i++){
					for(int j = 0; j < 20; j++){
						writer.append("\"");
						writer.append(myListv2.get(i).get(j).toString().concat("\","));	
					}
					writer.write("\r\n");
				}

			} else {
				writer = new FileWriter(get_csvFileName.setCsvFile(), true);
				for(int i = 0; i < myListv2.size(); i++){
					for(int j = 0; j < 20; j++){
						writer.append("\"");
						writer.append(myListv2.get(i).get(j).toString().concat("\","));	
					}
					writer.write("\r\n");
				}
			}

		} catch(Exception e){
			e.printStackTrace();
		}



		System.out.println(disclaimer);
		writer.flush();
		writer.close();
	}

}
