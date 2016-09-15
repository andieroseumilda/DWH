package InternetBookingEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class locator_step4 {

	private WebDriverWait wait;

	// Constructor
	public locator_step4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 40);
	}

	// Element Locator
	@FindBy(id = "payment_first_name")
	private WebElement firstName;

	@FindBy(id = "payment_last_name")
	private WebElement lastName;

	@FindBy(id = "payment_email")
	private WebElement emailAdd;

	@FindBy(id = "payment_email_confirm")
	private WebElement emailConfirm;

	@FindBy(id = "payment_country")
	private WebElement country;

	@FindBy(id = "payment_contact_number")
	private WebElement cnNumber;

	@FindBy(id = "payment_adults")
	private WebElement no_of_adult;

	@FindBy(id = "payment_specialrequest")
	private WebElement sRequest;

	@FindBy(id = "payment_cc_type")
	private WebElement ccType;

	@FindBy(id = "payment_cc_number")
	private WebElement ccNumber;

	@FindBy(id = "opt_yes")
	private WebElement yesOwner;

	@FindBy(id = "payment_cc_exp_month")
	private WebElement expMonth;

	@FindBy(id = "payment_cc_exp_year")
	private WebElement expYear;

	@FindBy(id = "payment_cc_cvv")
	private WebElement ccV;

	@FindBy(id = "payment_agree")
	private WebElement agree;

	@FindBy(id = "btnconfirmbooking")
	private WebElement btnConfirm;

	// Get Element Locator
	public WebElement firstName() {
		return wait.until(elementToBeClickable(firstName));
	}

	public WebElement lastName() {
		return lastName;
	}

	public WebElement emailAdd() {
		return emailAdd;
	}

	public WebElement emailConfirm() {
		return emailConfirm;
	}

	public WebElement country() {
		return country;
	}

	public WebElement cnNumber() {
		return cnNumber;
	}

	public WebElement no_of_adult() {
		return no_of_adult;
	}

	public WebElement sRequest() {
		return sRequest;
	}

	public WebElement ccType() {
		return ccType;
	}

	public WebElement ccNumber() {
		return ccNumber;
	}

	public WebElement yesOwner() {
		return yesOwner;
	}

	public WebElement expMonth() {
		return expMonth;
	}

	public WebElement expYear() {
		return expYear;
	}

	public WebElement ccV() {
		return ccV;
	}

	public WebElement agree() {
		return agree;
	}

	public WebElement btnConfirm() {
		return btnConfirm;
	}

}
