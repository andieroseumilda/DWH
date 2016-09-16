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
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		browser = new Browsers();
		driver = browser.firefoxDriver();
		dwhIbe = new GetAllPages(driver);
		env = new Environment(driver);
		env.openIbe("staging","DWH" , 1);
	}	
	
	@Test
	public void bookingEngine_DWH_Partial_NonRef() throws MalformedURLException {
		dwhIbe.makeReservation("staging", "DWH", 1 , "Partial Nonref", 2, false);
		// environment, payment_processor, step, no. of rooms
	}
//	
//	@Test
//	public void bookingEngine_DWH_Full_Ref() throws MalformedURLException {
//		dwhIbe.makeReservation("staging", "DWH", 1 , "Full Ref", 2, true);
		// environment, payment_processor, step, no. of rooms
//	}
	
//	@Test
//	public void bookingEngine_DWH_Full_Nonref() throws MalformedURLException {
//		dwhIbe.makeReservation("staging", "DWH", 1 , "Full Nonref", 2, true);
//		// environment, payment_processor, step, no. of rooms
//	}
//	
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}


//	@Test
//	public void bookingEngine_HPP() throws MalformedURLException {
//
//		PaymentProcessor dwhIbe = new PaymentProcessor();
//		dwhIbe.reservation("HPP", 3);
//	}
}
