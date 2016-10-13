package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetDate {
	
	private WebDriverWait wait;
	private int get_day_format = Calendar.DATE;
	private Calendar now;
	private String get_arrival_date;
	private String set_departure_date;
	private DateFormat date_format = new SimpleDateFormat("d");
	
	protected GetDate(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 60);
	
	}
	
	protected void selectArrivalDate(){
		this.now = Calendar.getInstance();
		now.add(get_day_format, 2);
		Date set_arrival_date = now.getTime();
		get_arrival_date = date_format.format(set_arrival_date); 
		WebElement arrival_date = wait.until(elementToBeClickable(By.linkText(String.valueOf(get_arrival_date))));
		arrival_date.click();
	}
	
	protected void selectDeparture(){
		this.now.add(get_day_format, 2);
		Date get_departure_date = now.getTime();
		set_departure_date = date_format.format(get_departure_date);  // added dates
		WebElement departure_date = wait.until(elementToBeClickable(By.linkText(String.valueOf(set_departure_date))));
		departure_date.click();
	}

}
