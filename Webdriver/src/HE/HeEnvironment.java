package HE;

import org.openqa.selenium.WebDriver;

public class HeEnvironment {
	private WebDriver driver;
	private String environment_staging = "http://staging-";
	private String environment_dev = "http://dev-";
	private String environment_uat = "http://uat-";
	private String base_url = "hi.directwithhotels.com";
	private String select_test_server;
	
	public HeEnvironment(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openHe(String test_server){

		if (test_server == "staging"){
			select_test_server = environment_staging;
		}else if(test_server == "uat"){
			select_test_server = environment_uat;
		}else { 
			select_test_server = environment_dev;
		}
		
		driver.get(select_test_server + base_url);
	}
	
	
}
