package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page5 {

	WebDriver driver;
	private locator_step5 step5;

	public Page5(WebDriver driver) {
		this.driver = driver;
		step5 = new locator_step5(driver);
	}

	public void confirmPage() {
		String intro = step5.introCpage().getText();
		System.out.println(intro);
	}
}