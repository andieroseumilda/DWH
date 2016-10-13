package InternetBookingEngine;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class Page3 {

	private LocatorStep3 step3;
	private Page3Values step3_values;

	public Page3(WebDriver driver) {
		step3 = new LocatorStep3(driver);
		step3_values = new Page3Values(driver);
	}

	public void clickGuestDetailsStep3() {
		step3.ctaStep3().click();	
	}
	
	public HashMap<Integer, String> getValuesInStep3(String payment_settings){
		return step3_values.step3Values(payment_settings);
	
	}

}