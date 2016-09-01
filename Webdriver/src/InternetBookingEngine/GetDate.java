package InternetBookingEngine;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetDate {
	
	private WebDriver driver;
	private static int getDayFormat = Calendar.DATE;
	private Calendar now;
	private int getDay;
	private String getDeparture;
	private DateFormat date_format = new SimpleDateFormat("d");
	
	protected GetDate(WebDriver driver) {
		this.driver = driver;
	
	}
	
	protected void selectArrivalDate(){
		now = Calendar.getInstance();
		getDay = now.get(getDayFormat); // current date	  	      
		driver.findElement(By.linkText(String.valueOf(getDay))).click();
	}
	
	protected void selectDeparture(){
		this.now.add(getDayFormat, 2);
		Date complete_date = now.getTime();
		getDeparture = date_format.format(complete_date);  // added dates
		driver.findElement(By.linkText(String.valueOf(getDeparture))).click();
	}

}
