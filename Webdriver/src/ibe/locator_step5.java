package ibe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class locator_step5 {

	private WebDriverWait wait;

	// Constructor
	public locator_step5(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 25);
	}

	// Elements
	@FindBy(xpath = "html/body/div[3]/h2/strong")
	private WebElement introCpage;

	// Get Element Locator
	public WebElement introCpage() {
		return wait.until(visibilityOf(introCpage));
	}
}
