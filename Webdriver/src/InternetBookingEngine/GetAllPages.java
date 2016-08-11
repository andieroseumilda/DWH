package InternetBookingEngine;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;

public class GetAllPages {

	// Start WebDriver
	WebDriver driver;
	private Browsers browser;
	private Page1 page1;
	private Page2 page2;
	private Page3 page3;
	private Page4 page4;
	private Page5 page5;
	
	public GetAllPages() throws MalformedURLException{
		browser = new Browsers();
		driver = browser.firefoxDriver();
		page1 = new Page1(driver);
		page2 = new Page2(driver);
		page3 = new Page3(driver);
		page4 = new Page4(driver);
		page5 = new Page5(driver);
	}
	
	public void makeReservation(String test_server, String payment_settings, int no_of_rooms){
		page1.openIbe(test_server,payment_settings);
		page1.selectStayDates();
		page2.dwhCopy();
		page2.selectRoom(test_server, payment_settings, no_of_rooms);
		page3.clickGuestDetailsStep3();
		page4.paymentPage(payment_settings);
		page5.confirmPage();
		closePage();
		
	}
	
	public void closePage() {
		driver.close();
		driver.quit();
	}
}
