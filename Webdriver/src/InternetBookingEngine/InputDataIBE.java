package InternetBookingEngine;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.Browsers;

public class InputDataIBE {
	private WebDriver driver;
	private Browsers browser;
	private GetAllPages dwhIbe;
	private String test_environment = "staging";
	private int start_from_this_page = 1;
	private HE.GetAllModule redirect_to_he;
	private LocatorStep5 step5;
	private String confirmation_no;
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		browser = new Browsers();
		driver = browser.firefoxDriver();
		dwhIbe = new GetAllPages(driver);
		redirect_to_he = new HE.GetAllModule(driver);
		step5 = new LocatorStep5(driver);
	}	
	
	/*
	Parameters for creating a reservation in order:
	environment, payment_settings, step, prepayment, no. of rooms, ccowner, upload_image 
	 */
	
	@Test
	public void bookingEngine_DWH_Partial_NonRef() throws IOException {
		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Partial Nonref", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"DWH", confirmation_no);
		
	}
	
	@Test
	public void bookingEngine_DWH_Full_Ref() throws IOException{
		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Ref", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"DWH", confirmation_no);
	}
	
	@Test
	public void bookingEngine_DWH_Full_Nonref() throws IOException {
		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Nonref", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"DWH", confirmation_no);
	}
	
	@Test
	public void bookingEngine_DWH_Full_Nonref_Onhold() throws IOException {
		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Nonref", 2, false, true, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"DWH", confirmation_no);
	}
	
	@Test
	public void bookingEngine_DWH_Full_Nonref_Onhold_pending() throws IOException {
		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Full Nonref", 2, false, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"DWH", confirmation_no);
	}

	@Test
	public void bookingEngine_HPP_Partial_NonRef() throws IOException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Partial Nonref", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"HPP", confirmation_no);
	}
	
	@Test
	public void bookingEngine_HPP_Partial_Ref() throws IOException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Partial Ref", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"HPP", confirmation_no);
	}

	@Test
	public void bookingEngine_HPP_Full_Ref() throws IOException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Full Ref", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"HPP", confirmation_no);
	}
	
	@Test
	public void bookingEngine_HPP_Full_NonRef() throws IOException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Full Nonref", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"HPP", confirmation_no);
	}
	
	@Test
	public void bookingEngine_HPP_Upon_Arrival() throws IOException {
		dwhIbe.makeReservation(test_environment, "HPP", start_from_this_page , "Upon Arrival", 2, true, false, "Confirmed");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"HPP", confirmation_no);
	}
	
	@Test
	public void bookingEngine_DWH_Partial_NonRef_Cancellation() throws IOException {
		dwhIbe.makeReservation(test_environment, "DWH", start_from_this_page , "Partial Nonref", 2, true, false, "Cancel");
		confirmation_no = step5.confirmationNumber().getText();
		System.out.println(confirmation_no + " input data module");
		redirect_to_he.accessInHe(test_environment,"DWH", confirmation_no);
	} 
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
		
}
