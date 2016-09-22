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
	private String get_day;
	private String get_departure;
	private DateFormat date_format = new SimpleDateFormat("d");
	
	protected GetDate(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 60);
	
	}
	
	protected void selectArrivalDate(){
		this.now = Calendar.getInstance();
		now.add(get_day_format, 2);
		Date complete_date_1 = now.getTime();
		get_day = date_format.format(complete_date_1); 
		WebElement arrivalDate = wait.until(elementToBeClickable(By.linkText(String.valueOf(get_day))));
		arrivalDate.click();
	}
	
	protected void selectDeparture(){
		this.now.add(get_day_format, 2);
		Date complete_date_2 = now.getTime();
		get_departure = date_format.format(complete_date_2);  // added dates
		WebElement departureDate = wait.until(elementToBeClickable(By.linkText(String.valueOf(get_departure))));
		departureDate.click();
	}

}
