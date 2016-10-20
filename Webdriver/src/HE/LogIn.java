package HE;

import org.openqa.selenium.WebDriver;

public class LogIn {

	private LocatorLogIn locator_login;

	public LogIn(WebDriver driver) {
		locator_login = new LocatorLogIn(driver);
	}

	public void logInPage(String payment_settings){
		locator_login.loginUsername().sendKeys(setDwhUsername(payment_settings));
		locator_login.loginPassword().sendKeys(setPassword());
		locator_login.loginButton().click();
	}

	public String setDwhUsername(String payment_settings){
		if(payment_settings.equals("DWH")){
			return "regression.dwh";	
		}else{
			return "regression.hpp";
		}		
	}

	public String setPassword(){
		return "regression";
	}
}
