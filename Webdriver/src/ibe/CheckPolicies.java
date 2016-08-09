package ibe;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckPolicies {
	WebDriver driver;
	private BrowserType browser;
	String paymentProcessor = "DWH";
	String fullChargeModifPol = "Modification: If you choose to modify, you will be charged the total room cost.";
	
	@Test
	public void dwhCopies() throws MalformedURLException {
		browser = new BrowserType();
		driver = browser.typeDriver();

		Page1 page1 = new Page1(driver);
		page1.urlStep1(paymentProcessor);
		page1.selectStayDates();

		locator_step2v1 step2 = new locator_step2v1(driver);
		step2.fullRatePlan().click();
		step2.clickReservationPolicies().click();
		String modifVal = step2.fullRefModif().getText();
		
		System.out.println(modifVal);
		System.out.println(fullChargeModifPol);
		
		if (fullChargeModifPol.equals(modifVal)){
		System.out.println("True");	
		}
		else{
			System.out.println("false");
		}

	}

}
