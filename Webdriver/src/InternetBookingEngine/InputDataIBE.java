package InternetBookingEngine;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputDataIBE {
	private WebDriver driver;
	private Browsers browser;
	private GetAllPages dwhIbe;
	private Environment env;
	private String test_environment = "staging";
	private int start_from_this_page = 1;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		browser = new Browsers();
		driver = browser.firefoxDriver();
		dwhIbe = new GetAllPages(driver);
		env = new Environment(driver);
//		env.openIbe(test_environment, "DWH", start_from_this_page);
		env.openIbe(test_environment, "HPP", start_from_this_page);
	}	
	
	/*
	Parameters for creating a reservation in order:
	environment, payment_settings, step, prepayment, no. of rooms, ccowner, upload_image 
	 */
	
//	@Test
//	public void bookingEngine_DWH_Partial_NonRef() throws MalformedURLException {
//		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Partial Nonref", 2, true, false);
//	}
//	
//	@Test
//	public void bookingEngine_DWH_Full_Ref() throws MalformedURLException{
//		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Ref", 2, true, false);
//	}
//	
//	@Test
//	public void bookingEngine_DWH_Full_Nonref() throws MalformedURLException {
//		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Nonref", 2, true, false);
//	}
//	
//	@Test
//	public void bookingEngine_DWH_Full_Nonref_Onhold() throws MalformedURLException {
//		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Nonref", 2, false, true);
//	}
//	
//	@Test
//	public void bookingEngine_DWH_Full_Nonref_Onhold_pending() throws MalformedURLException {
//		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Nonref", 2, false, false);
//	}

	@Test
	public void bookingEngine_HPP_Partial_NonRef() throws MalformedURLException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Partial Nonref", 2, true, false);
	}
	
	@Test
	public void bookingEngine_HPP_Partial_Ref() throws MalformedURLException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Partial Ref", 2, true, false);
	}
	
	@Test
	public void bookingEngine_HPP_Full_Ref() throws MalformedURLException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Full Ref", 2, true, false);
	}
	
	@Test
	public void bookingEngine_HPP_Full_NonRef() throws MalformedURLException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Full Nonref", 2, true, false);
	}
	
	@Test
	public void bookingEngine_HPP_Upon_Arrival() throws MalformedURLException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Upon Arrival", 2, true, false);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
