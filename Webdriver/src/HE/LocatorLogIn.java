package HE;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorLogIn {
	
	WebDriverWait wait;

	public LocatorLogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 50);
	}
	
	// Element Locations
	@FindBy(id = "loginUsername")
	private WebElement login_username;
	
	@FindBy(id = "loginPass")
	private WebElement login_password;

	@FindBy(id = "loginsubmit")
	private WebElement login_button;

	// Get Element Locators
	public WebElement loginUsername() {
		return wait.until(visibilityOf(login_username)); 
	}
	
	public WebElement loginPassword() {
		return wait.until(visibilityOf(login_password)); 
	}
	
	public WebElement loginButton() {
		return wait.until(elementToBeClickable(login_button)); 
	}
	
}
