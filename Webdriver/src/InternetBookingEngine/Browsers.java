
package InternetBookingEngine;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browsers {
	private WebDriver driver;

	public WebDriver firefoxDriver() throws MalformedURLException{
		// Create instance of Firefox
		DesiredCapabilities dc = new DesiredCapabilities();
		FirefoxProfile fp = new FirefoxProfile();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		return driver;
	}
}
