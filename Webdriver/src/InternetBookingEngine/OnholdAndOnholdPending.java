package InternetBookingEngine;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OnholdAndOnholdPending {

	private locator_onhold onhold;
	WebDriver driver;

	public OnholdAndOnholdPending(WebDriver driver) {
		onhold = new locator_onhold(driver);
		this.driver = driver;
	}

	public void onhold_pending(){
		onhold.clickSkipDownloadCc().click();		
	}

	public void click_upload_and_continue(){
		onhold.click_upload_and_continue().click();
	}

	public void upload_images(){
		((JavascriptExecutor)driver).executeScript("document.getElementsByName('CCF')[0].style.display=''");
		((JavascriptExecutor)driver).executeScript("document.getElementsByName('CCB')[0].style.display=''");
		((JavascriptExecutor)driver).executeScript("document.getElementsByName('IDF')[0].style.display=''");

		onhold.input_cc_front().sendKeys("C:\\Users\\Andielyne\\Desktop\\PICTURES\\TestPictures\\cc\\ccf.jpg");
		onhold.input_cc_back().sendKeys("C:\\Users\\Andielyne\\Desktop\\PICTURES\\TestPictures\\cc\\ccb.jpg");
		onhold.input_id_front().sendKeys("C:\\Users\\Andielyne\\Desktop\\PICTURES\\TestPictures\\cc\\idf.jpg");
		//onhold.input_id_back().sendKeys("C:\\Users\\Andielyne\\Desktop\\PICTURES\\TestPictures\\cc\\idb.jpg");

	}

}
