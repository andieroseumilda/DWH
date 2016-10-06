package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locator_onhold {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public locator_onhold(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 80);
	}
	
	// Element Locations
	@FindBy(id = "ccfraud_btn_continue")
	private WebElement btn_cc_Fraud_modal;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[4]/div/div[2]/div[7]/b/a")
	private WebElement click_skip_downloadCc;
	
	@FindBy(id = "front_file")
	private WebElement input_cc_front;
	
	@FindBy(id = "back_file")
	private WebElement input_cc_back;
	
	@FindBy(id = "photo_file")
	private WebElement input_id_front;
	
	@FindBy(id = "optional_file")
	private WebElement input_id_back;
	
	@FindBy(id = "btnUpload")
	private WebElement click_upload_and_continue;
	
	// Get Element Locations
	public WebElement btnCcFraudModal() {
		return wait.until(elementToBeClickable(btn_cc_Fraud_modal));
	}
	
	public WebElement clickSkipDownloadCc() {
		return wait.until(elementToBeClickable(click_skip_downloadCc));
	}
	
	public WebElement input_cc_front() {
		return wait.until(visibilityOf(input_cc_front));
	}
	
	public WebElement input_cc_back() {
		return wait.until(visibilityOf(input_cc_back));
	}
	
	public WebElement input_id_front() {
		return wait.until(visibilityOf(input_id_front));
	}
	
	public WebElement input_id_back() {
		return wait.until(visibilityOf(input_id_back));
	}
	
	public WebElement click_upload_and_continue() {
		return wait.until(elementToBeClickable(click_upload_and_continue));
	}
}
