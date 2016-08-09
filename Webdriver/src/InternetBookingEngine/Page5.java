package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page5 {

	// Variable
	WebDriver driver;
	private locator_step5 step5;
	// Constructor
	public Page5(WebDriver driver) {
		this.driver = driver;
		step5 = new locator_step5(driver);
	}

	// Method
	public void confirmPage() {
		String intro = step5.introCpage().getText();
		System.out.println(intro);
	}
}