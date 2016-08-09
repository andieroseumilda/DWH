package ibe;

import org.openqa.selenium.WebDriver;

public class Page3 {

	private locator_step3 step3;

	public Page3(WebDriver driver) {
		step3 = new locator_step3(driver);
	}

	public void goto_step3() {
		step3.CTAstep3().click();

	}
}
