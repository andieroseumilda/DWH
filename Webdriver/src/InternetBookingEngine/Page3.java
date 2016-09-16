package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page3 {

	WebDriver driver;
	private locator_step3 step3;
	private locator_step4 step4;
	
	public Page3(WebDriver driver) {
		step3 = new locator_step3(driver);
		this.driver = driver;
	}

	public void clickGuestDetailsStep3() {
		step3.CTAstep3().click();	
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(visibilityOf(step4.firstName()));
		} catch (Exception e) {
			if (driver.getCurrentUrl().contains("reservation/payInfo")) {
				step3.CTAstep3().click();	
			}
		}
	}


}