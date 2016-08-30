package InternetBookingEngine;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetDate {
	WebDriver driver;
	public static int getDayFormat = Calendar.DATE;
	public Calendar now;
	public int getDay;
	public String getDeparture;
	
	
	public GetDate(WebDriver driver) {
		this.driver = driver;
	
	}
	public void selectArrivalDate(){
		now = Calendar.getInstance();
		getDay = now.get(getDayFormat); // current date	  	      
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[4]/div[2]/div/div/div/table/tbody/tr/td/a[contains(text(), '"+getDay+"')]")).click();
		return;
	}
	public void selectDeparture(){
		this.now.add(getDayFormat, 3);
		Date complete_date = now.getTime();
		DateFormat date_format = new SimpleDateFormat("d");
		getDeparture = date_format.format(complete_date);  // added dates
		//System.out.println(getDeparture);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[4]/div[2]/div/div/div/table/tbody/tr/td/a[contains(text(), '"+getDeparture+"')]")).click();
		return;

	}
}
