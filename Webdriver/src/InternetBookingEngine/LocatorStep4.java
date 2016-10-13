package InternetBookingEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LocatorStep4 {

	private WebDriverWait wait;

	// Constructor
	public LocatorStep4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 40);
	}

	// Element Locator
	@FindBy(id = "payment_first_name")
	private WebElement first_name;

	@FindBy(id = "payment_last_name")
	private WebElement last_name;

	@FindBy(id = "payment_email")
	private WebElement email_add;

	@FindBy(id = "payment_email_confirm")
	private WebElement email_confirm;

	@FindBy(id = "payment_country")
	private WebElement country;

	@FindBy(id = "payment_contact_number")
	private WebElement confirmation_number;

	@FindBy(id = "payment_adults")
	private WebElement no_of_adult;

	@FindBy(id = "payment_specialrequest")
	private WebElement special_request;

	@FindBy(id = "payment_cc_type")
	private WebElement cc_type;

	@FindBy(id = "payment_cc_number")
	private WebElement cc_number;

	@FindBy(id = "opt_yes")
	private WebElement yes_owner;
	
	@FindBy(id = "opt_no")
	private WebElement not_owner;
	
	@FindBy(id = "payment_cc_name")
	private WebElement cc_name;

	@FindBy(id = "payment_cc_exp_month")
	private WebElement exp_month;

	@FindBy(id = "payment_cc_exp_year")
	private WebElement exp_year;

	@FindBy(id = "payment_cc_cvv")
	private WebElement ccv;

	@FindBy(id = "payment_agree")
	private WebElement agree;

	@FindBy(id = "btnconfirmbooking")
	private WebElement btn_confirm;

	
	// Get Element Locator
	public WebElement firstName() {
		return wait.until(visibilityOf(first_name));
	}

	public WebElement lastName() {
		return wait.until(visibilityOf(last_name));
	}

	public WebElement emailAdd() {
		return email_add;
	}

	public WebElement emailConfirm() {
		return email_confirm;
	}

	public WebElement country() {
		return country;
	}

	public WebElement cnNumber() {
		return confirmation_number;
	}

	public WebElement noOfAdult() {
		return no_of_adult;
	}

	public WebElement sRequest() {
		return special_request;
	}

	public WebElement ccType() {
		return cc_type;
	}

	public WebElement ccNumber() {
		return cc_number;
	}

	public WebElement yesOwner() {
		return yes_owner;
	}
	
	public WebElement notOwner() {
		return not_owner;
	}
	
	public WebElement ccName() {
		return cc_name;
	}

	public WebElement expMonth() {
		return exp_month;
	}

	public WebElement expYear() {
		return exp_year;
	}

	public WebElement ccV() {
		return ccv;
	}

	public WebElement agree() {
		return agree;
	}

	public WebElement btnConfirm() {
		return btn_confirm;
	}
}
