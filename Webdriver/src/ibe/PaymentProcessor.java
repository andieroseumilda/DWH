package ibe;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;

public class PaymentProcessor {

	// Start webdriver
	WebDriver driver;
	private Page1 page1;
	private Page2 page2;
	private Page3 page3;
	private Page4 page4;
	private Page5 page5;
	private BrowserType browser;
	
	public PaymentProcessor() throws MalformedURLException{
		browser = new BrowserType();
		driver = browser.typeDriver();
		page1 = new Page1(driver);
		page2 = new Page2(driver);
		page3 = new Page3(driver);
		page4 = new Page4(driver);
		page5 = new Page5(driver);
		
	}

	public void reservation(String payProc, int no_rooms) {
		page1.urlStep1(payProc);
		page1.selectStayDates();
		page2.selectRoom(payProc, no_rooms);
		page3.goto_step3();
		page4.paymentPage(payProc);
		page5.confirmPage();
		closePage();
	}


	public void closePage() {
		driver.close();
		driver.quit();
	}

}
