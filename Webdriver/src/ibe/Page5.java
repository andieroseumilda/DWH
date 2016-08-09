package ibe;

import org.openqa.selenium.WebDriver;

public class Page5 {

	// Variable
	private WebDriver driver;

	// Constructor
	public Page5(WebDriver driver) {
		this.driver = driver;
	}

	// Method
	public void confirmPage() {

		locator_step5 step5 = new locator_step5(driver);
		String intro = step5.introCpage().getText();
		System.out.println(intro);
	}

}
