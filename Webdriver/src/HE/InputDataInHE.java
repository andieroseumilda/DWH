package HE;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Browser.Browsers;

public class InputDataInHE {
	private WebDriver driver;
	private Browsers browser;
	private GetAllModule dwhHe;
	private String test_environment = "staging";
	private String confirmation_no;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		browser = new Browsers();
		driver = browser.firefoxDriver();
		dwhHe = new GetAllModule(driver);
	}
	
	@Test
	public void LoginInHE() throws IOException {
		dwhHe.accessInHe(test_environment,"DWH",confirmation_no);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
