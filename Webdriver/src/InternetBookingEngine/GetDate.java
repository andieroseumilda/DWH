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
	
//	private WebDriver driver;
	private WebDriverWait wait;
	private int getDayFormat = Calendar.DATE;
	private Calendar now;
	private String getDay;
	private String getDeparture;
	private DateFormat date_format = new SimpleDateFormat("d");
	
	protected GetDate(WebDriver driver) {
//		this.driver = driver;
		this.wait = new WebDriverWait(driver, 60);
	
	}
	
	protected void selectArrivalDate(){
		this.now = Calendar.getInstance();
		//getDay = now.get(getDayFormat); // current date
		now.add(getDayFormat, 0);
		Date complete_date_1 = now.getTime();
		getDay = date_format.format(complete_date_1); 
		WebElement arrivalDate = wait.until(elementToBeClickable(By.linkText(String.valueOf(getDay))));
		arrivalDate.click();
	}
	
	protected void selectDeparture(){
		this.now.add(getDayFormat, 2);
		Date complete_date_2 = now.getTime();
		getDeparture = date_format.format(complete_date_2);  // added dates
		WebElement departureDate = wait.until(elementToBeClickable(By.linkText(String.valueOf(getDeparture))));
		departureDate.click();
	}

}
