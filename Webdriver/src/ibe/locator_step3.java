package ibe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

class locator_step3 {

	private WebDriverWait wait;

	public locator_step3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 25);
	}

	// Element Locators
	@FindBy(id = "btnguestdetails")
	private WebElement CTAstep3;

	// Get Element
	public WebElement CTAstep3() {
		return wait.until(elementToBeClickable(CTAstep3));
	}
}
