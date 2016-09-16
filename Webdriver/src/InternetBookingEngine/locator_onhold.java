package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
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
		this.wait = new WebDriverWait(driver, 60);
	}
	
	// Element Locations
	@FindBy(id = "ccfraud_btn_continue")
	private WebElement btn_cc_Fraud_modal;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[4]/div/div[2]/div[7]/b/a")
	private WebElement click_skip_downloadCc;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[4]/div/div[2]/div[1]/button[1]")
	private WebElement click_cc_front;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[4]/div/div[2]/div[2]/button[1]")
	private WebElement click_cc_back;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[4]/div/div[2]/div[3]/button[1]")
	private WebElement click_id_front;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[4]/div/div[2]/div[4]/button[1]")
	private WebElement click_id_back;
	
	// Get Element Locations
	public WebElement btnCcFraudModal() {
		return wait.until(elementToBeClickable(btn_cc_Fraud_modal));
	}
	
	public WebElement clickSkipDownloadCc() {
		return wait.until(elementToBeClickable(click_skip_downloadCc));
	}
	
	public WebElement click_cc_front() {
		return wait.until(elementToBeClickable(click_cc_front));
	}
	
	public WebElement click_cc_back() {
		return wait.until(elementToBeClickable(click_cc_back));
	}
	
	public WebElement click_id_front() {
		return wait.until(elementToBeClickable(click_id_front));
	}
	
	public WebElement click_id_back() {
		return wait.until(elementToBeClickable(click_id_back));
	}
}
