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
	

	
	public ReservationsTab(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 60);
		reservation_tab = new LocatorReservationTab(driver);
	}
	
	public void reservationsTab(String confirmation_no){
		reservation_tab.reservationsTab().click();
		reservation_tab.searchButtonHeader().click();
		reservation_tab.confirmationNo().sendKeys(confirmation_no);
		reservation_tab.searchInsideThePanel().click();
		displayConfirmationNo(confirmation_no);
	}
	
	private WebElement displayConfirmationNo(String confirmation_no){
		WebElement confirm_no = wait.until(elementToBeClickable(By.xpath("//div[@id='gridReservations']//td//div[contains(.,'"+confirmation_no+"')]")));
		confirm_no.isDisplayed();
		return confirm_no;
		
	}
}
