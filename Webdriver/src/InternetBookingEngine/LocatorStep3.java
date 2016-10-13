package InternetBookingEngine;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorStep3 {
	private WebDriverWait wait;

	public LocatorStep3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 10);
	}

	// Element Locators
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'Room Cost:')]/following::td[1]")
	private WebElement step3_room_cost;
	
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'Taxes:')]/following::td[1]")
	private WebElement step3_taxes;
	
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'Fees:')]/following::td[1]")
	private WebElement step3_fees;
	
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'Total Room Charges:')]/following::td[1]")
	private WebElement step3_total_room_charges;
	
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'Total Reservation Cost:')]/following::td[1]")
	private WebElement step3_total_reservation_cost;
	
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'PREPAYMENT CHARGE:')]/following::td[1]")
	private WebElement step3_hpp_prepayment_charge;
	
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'PREPAYMENT CHARGE - DUE NOW.')]/following::td[1]")
	private WebElement step3_dwh_prepayment_charge;
	
	@FindBy(xpath = "//div[@class='row clearfix']//td[contains(.,'PAYABLE AT THE HOTEL:')]/following::td[1]")
	private WebElement step3_payable_at_the_hotel;
	
	@FindBy(id = "btnguestdetails")
	private WebElement cta_step3;

	// Get Element
	public WebElement step3RoomCost() {
		return wait.until(elementToBeClickable(step3_room_cost));
	}
	
	public WebElement step3Taxes() {
		return wait.until(elementToBeClickable(step3_taxes));
	}
	
	public WebElement step3Fees() {
		return wait.until(elementToBeClickable(step3_fees));
	}
	
	public WebElement step3TotalRoomCharges() {
		return wait.until(elementToBeClickable(step3_total_room_charges));
	}
	
	public WebElement step3TotalReservationCost() {
		return wait.until(elementToBeClickable(step3_total_reservation_cost));
	}
	
	public WebElement step3HppPrepaymentCharge() {
		return wait.until(elementToBeClickable(step3_hpp_prepayment_charge));
	}

	public WebElement step3DwhPrepaymentCharge() {
		return wait.until(elementToBeClickable(step3_dwh_prepayment_charge));
	}

	public WebElement step3PayableAtTheHotel() {
		return wait.until(elementToBeClickable(step3_payable_at_the_hotel));
	}
	
	public WebElement ctaStep3() {
		return wait.until(elementToBeClickable(cta_step3));
	}
}
