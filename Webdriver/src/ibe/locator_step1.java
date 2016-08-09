package ibe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class locator_step1 {

	private WebDriverWait wait;

	// Constructor
	public locator_step1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 25);
	}

	// Element Locations
	@FindBy(linkText = "7")
	private WebElement arrival;

	@FindBy(linkText = "11")
	private WebElement departure;

	@FindBy(id = "btnNext")
	private WebElement CTA;

	// Get Element Locations
	public WebElement arrival() {
		return wait.until(elementToBeClickable(arrival));
	}

	public WebElement departure() {
		return departure;
	}

	public WebElement CTA() {
		return CTA;
	}

}