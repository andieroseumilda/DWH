package HE;

import org.openqa.selenium.WebDriver;

public class GetAllModule {
	
	private HeEnvironment env;
	private LogIn login;
	private ReservationsTab reservation_tab;
		
	public GetAllModule(WebDriver driver) {
		env = new HeEnvironment(driver);
		login = new LogIn(driver);
		reservation_tab = new ReservationsTab(driver);
	}
	
	public void accessInHe(String test_server,String payment_settings, String confirmation_no){
		env.openHe(test_server);
		login.logInPage(payment_settings);		
		reservation_tab.reservationsTab(confirmation_no);
	}

}
