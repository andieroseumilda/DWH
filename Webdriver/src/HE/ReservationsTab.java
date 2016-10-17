package HE;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservationsTab {
	
	private WebDriverWait wait;
	WebDriver driver;
	private LocatorReservationTab reservation_tab;
	private String confirmation_no;
	

	
	public ReservationsTab(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 60);
		reservation_tab = new LocatorReservationTab(driver);
	}
	
	public void reservationsTab(){
		reservation_tab.reservationsTab().click();
		reservation_tab.searchButtonHeader().click();
		reservation_tab.confirmationNo().sendKeys(getConfirmationNo());
		reservation_tab.searchInsideThePanel().click();
		displayConfirmationNo();
	}
	
	private String getConfirmationNo(){
		return "4273718";
	}
	
	
	private WebElement displayConfirmationNo(){
		confirmation_no = "4273718";
		WebElement confirm_no = wait.until(elementToBeClickable(By.xpath("//div[@id='gridReservations']//td//div[contains(.,'"+confirmation_no+"')]")));
		confirm_no.isDisplayed();
		return confirm_no;
		
	}
}
