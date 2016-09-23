package InternetBookingEngine;

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
		this.wait = new WebDriverWait(driver, 60);
	}

	// Elements 
	
	@FindBy(xpath = "html/body/div[3]/h2/strong")
	private WebElement intro_cpage;
	
	@FindBy(xpath = "html/body/div[3]/h3")
	private WebElement ce_intro;

	/*	 Label	 */
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]")
	private WebElement label_cnumber;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[1]")
	private WebElement label_transaction_id;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[1]")
	private WebElement label_guest_name;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[1]")
	private WebElement label_email_add;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[5]/td[1]")
	private WebElement label_mobile_no;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[6]/td[1]")
	private WebElement label_country;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[7]/td[1]")
	private WebElement label_name_of_card_owner;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[8]/td[1]")
	private WebElement label_card_number;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[9]/td[1]")
	private WebElement label_credit_card_expiry;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[10]/td[1]")
	private WebElement label_reservation_made_on;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[11]/td[1]")
	private WebElement label_reservation_details;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[12]/td[1]")
	private WebElement label_estimated_of_arrival;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[13]/td[1]")
	private WebElement label_check_in;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[14]/td[1]")
	private WebElement label_check_out;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[16]/td[1]")
	private WebElement label_room_cost;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[17]/td[1]")
	private WebElement label_taxes;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[18]/td[1]")
	private WebElement label_total_reservation_cost;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[19]/td[1]/a")
	private WebElement click_show_details_link;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[21]/td[1]")
	private WebElement label_prepayment_paid;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[22]/td[1]")
	private WebElement label_payable_at_the_hotel;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/p")
	private WebElement label_disclaimer;
	
	/*   Guest Reservation Details	 */
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]")
	private WebElement confirmation_number;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]")
	private WebElement transaction_id;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[2]")
	private WebElement guest_name;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]")
	private WebElement email_add;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[5]/td[2]")
	private WebElement mobile_no;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[6]/td[2]")
	private WebElement guest_country;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[7]/td[2]")
	private WebElement name_of_card_owner;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[8]/td[2]")
	private WebElement credit_card_number;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[9]/td[2]")
	private WebElement credit_card_expiry;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[10]/td[2]")
	private WebElement reservation_made_on;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[11]/td[2]")
	private WebElement guest_reservation_details;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[12]/td[2]")
	private WebElement estimated_of_arrival;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[13]/td[2]")
	private WebElement guest_check_in;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[14]/td[2]")
	private WebElement guest_check_out;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[16]/td[2]")
	private WebElement room_cost;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[17]/td[2]")
	private WebElement taxes;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[18]/td[2]")
	private WebElement total_reservation_cost;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[21]/td[2]")
	private WebElement prepayment_paid;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/table/tbody/tr[22]/td[2]")
	private WebElement payable_at_the_hotel;
	

	@FindBy(xpath = "html/body/div[3]/div[2]/div[2]/div[1]/p")
	private WebElement disclaimer;


	
	// Get Element Locator
	public WebElement introCpage() {
		return wait.until(visibilityOf(intro_cpage));
	}
	
	public WebElement getCeIntro() {
		return wait.until(visibilityOf(ce_intro));
	}
	

	public WebElement label_cnumber() {
		return wait.until(visibilityOf(label_cnumber));
	}
	
	public WebElement label_transaction_id() {
		return wait.until(visibilityOf(label_transaction_id));
	}
	
	public WebElement label_guest_name() {
		return wait.until(visibilityOf(label_guest_name));
	}
	
	public WebElement label_email_add() {
		return wait.until(visibilityOf(label_email_add));
	}
	
	public WebElement label_mobile_no() {
		return wait.until(visibilityOf(label_mobile_no));
	}
	
	public WebElement label_country() {
		return wait.until(visibilityOf(label_country));
	}
	
	public WebElement label_name_of_card_owner() {
		return wait.until(visibilityOf(label_name_of_card_owner));
	}
	
	public WebElement label_card_number() {
		return wait.until(visibilityOf(label_card_number));
	}
	
	public WebElement label_credit_card_expiry() {
		return wait.until(visibilityOf(label_credit_card_expiry));
	}
	
	public WebElement label_reservation_made_on() {
		return wait.until(visibilityOf(label_reservation_made_on));
	}
	
	public WebElement label_reservation_details() {
		return wait.until(visibilityOf(label_reservation_details));
	}
	
	public WebElement label_estimated_of_arrival() {
		return wait.until(visibilityOf(label_estimated_of_arrival));
	}
	
	public WebElement label_check_in() {
		return wait.until(visibilityOf(label_check_in));
	}
	
	public WebElement label_check_out() {
		return wait.until(visibilityOf(label_check_out));
	}
	
	public WebElement label_room_cost() {
		return wait.until(visibilityOf(label_room_cost));
	}
	
	public WebElement label_taxes() {
		return wait.until(visibilityOf(label_taxes));
	}
	
	public WebElement label_total_reservation_cost() {
		return wait.until(visibilityOf(label_total_reservation_cost));
	}
	
	public WebElement click_show_details_link() {
		return wait.until(visibilityOf(click_show_details_link));
	}
	
	public WebElement label_prepayment_paid() {
		return wait.until(visibilityOf(label_prepayment_paid));
	}
	
	public WebElement label_payable_at_the_hotel() {
		return wait.until(visibilityOf(label_payable_at_the_hotel));
	}
	
	public WebElement label_disclaimer() {
		return wait.until(visibilityOf(label_disclaimer));
	}
	
	/*   Guest Reservation Details	 */
	
	public WebElement confirmation_number() {
		return wait.until(visibilityOf(confirmation_number));
	}
	
	public WebElement transaction_id() {
		return wait.until(visibilityOf(transaction_id));
	}
	
	public WebElement guest_name() {
		return wait.until(visibilityOf(guest_name));
	}
	
	public WebElement email_add() {
		return wait.until(visibilityOf(email_add));
	}
	
	public WebElement mobile_no() {
		return wait.until(visibilityOf(mobile_no));
	}
	
	public WebElement guest_country() {
		return wait.until(visibilityOf(guest_country));
	}
	
	public WebElement name_of_card_owner() {
		return wait.until(visibilityOf(name_of_card_owner));
	}
	
	public WebElement credit_card_number() {
		return wait.until(visibilityOf(credit_card_number));
	}
	
	public WebElement credit_card_expiry() {
		return wait.until(visibilityOf(credit_card_expiry));
	}
	
	public WebElement reservation_made_on() {
		return wait.until(visibilityOf(reservation_made_on));
	}
	
	public WebElement guest_reservation_details() {
		return wait.until(visibilityOf(guest_reservation_details));
	}
	
	public WebElement estimated_of_arrival() {
		return wait.until(visibilityOf(estimated_of_arrival));
	}
	
	public WebElement guest_check_in() {
		return wait.until(visibilityOf(guest_check_in));
	}
	
	public WebElement guest_check_out() {
		return wait.until(visibilityOf(guest_check_out));
	}
	
	public WebElement room_cost() {
		return wait.until(visibilityOf(room_cost));
	}
	
	public WebElement taxes() {
		return wait.until(visibilityOf(taxes));
	}
	
	public WebElement total_reservation_cost() {
		return wait.until(visibilityOf(total_reservation_cost));
	}
	
	public WebElement prepayment_paid() {
		return wait.until(visibilityOf(prepayment_paid));
	}
	
	public WebElement payable_at_the_hotel() {
		return wait.until(visibilityOf(payable_at_the_hotel));
	}
	
}
