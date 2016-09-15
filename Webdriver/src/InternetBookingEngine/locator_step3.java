package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locator_step3 {
	private WebDriverWait wait;

	public locator_step3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 60);
	}

	// Element Locators
	@FindBy(id = "btnguestdetails")
	private WebElement CTAstep3;

	// Get Element
	public WebElement CTAstep3() {
		return wait.until(elementToBeClickable(CTAstep3));
	}
}
