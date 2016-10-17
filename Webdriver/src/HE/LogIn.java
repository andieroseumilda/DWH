package HE;

import org.openqa.selenium.WebDriver;

public class LogIn {
	
	private LocatorLogIn locator_login;
	
	public LogIn(WebDriver driver) {
		locator_login = new LocatorLogIn(driver);
	}
	
	public void logInPage(){
		locator_login.loginUsername().sendKeys(setFirstName());
		locator_login.loginPassword().sendKeys(setPassword());
		locator_login.loginButton().click();
	}
	
	public String setFirstName(){
		return "regression.hpp";
	}
	
	public String setPassword(){
		return "regression";
	}
}
