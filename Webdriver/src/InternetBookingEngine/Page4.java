package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page4 {

	private String firstName;
	private String lastName;
	private String emailAdd;
	private String emailConfirm;
	private String country;
	private String cnNumber;
	private String adult;
	private String sRequest;
	private String ccType;
	private String ccNumber;
	private String ccName;
	private String expMonth;
	private String expYear;
	private String ccV;
	private locator_step4 step4;

	public Page4(WebDriver driver) {
		step4 = new locator_step4(driver);
	}

	public void paymentPage(String payment_settings, boolean cc_owner) {
		step4.firstName().sendKeys(get_firstname(payment_settings));
		step4.lastName().sendKeys(get_lastName(payment_settings));
		step4.emailAdd().sendKeys(get_emailAdd(payment_settings));
		step4.emailConfirm().sendKeys(get_emailConfirm(payment_settings));
		step4.country().sendKeys(get_country(payment_settings));
		step4.cnNumber().sendKeys(get_cnNumber(payment_settings));
		step4.no_of_adult().sendKeys(get_adult(payment_settings));
		step4.sRequest().sendKeys(get_sRequest(payment_settings));
		step4.ccType().sendKeys(get_ccType(payment_settings));
		step4.ccNumber().sendKeys(get_ccNumber(payment_settings));
		if(cc_owner){
			step4.yesOwner().click();
		}else{
			step4.notOwner().click();
			step4.ccName().sendKeys(get_ccName(payment_settings));
		}
		step4.expMonth().sendKeys(get_expMonth(payment_settings));
		step4.expYear().sendKeys(get_expYear(payment_settings));
		step4.ccV().sendKeys(get_ccV(payment_settings));
		step4.agree().click();
		step4.btnConfirm().click();
	}

	private String get_firstname(String payment_settings) {

		switch (payment_settings) {
		case "DWH":
			firstName = "Test";
			break;
		case "HPP":
			firstName = "HPP";
			break;
		default:
			System.out.println("end");
		}
		return firstName;
	}

	private String get_lastName(String payment_settings) {
		switch (payment_settings) {
		case "DWH":
			lastName = "Reservation";
			break;
		case "HPP":
			lastName = "HPP";
			break;
		default:
			System.out.println("end");
		}
		return lastName;
	}

	private String get_emailAdd(String payment_settings) {
		switch (payment_settings) {
		case "DWH":
			emailAdd = "dwh.testemail@gmail.com";
			break;
		case "HPP":
			emailAdd = "dwh.testemail@gmail.com";
			break;
		default:
			System.out.println("end");
		}
		return emailAdd;
	}
	
	private String get_emailConfirm(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			emailConfirm = "dwh.testemail@gmail.com";
			break;
		case "HPP":
			emailConfirm = "dwh.testemail@gmail.com";
			break;
		default:
			System.out.println("end");
		}		
		return emailConfirm;
	}

	private String get_country(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			country = "Philippines";
			break;
		case "HPP":
			country = "Japan";
			break;
		default:
			System.out.println("end");
		}		
		return country;
	}

	private String get_cnNumber(String payment_settings){

		switch (payment_settings) {
		case "DWH":
			cnNumber = "91345664217";
			break;
		case "HPP":
			cnNumber = "12345678";
			break;
		default:
			System.out.println("end");
		}
		return cnNumber;
	}

	private String get_adult(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			adult = "1";
			break;
		case "HPP":
			adult = "2";
			break;
		default:
			System.out.println("end");
		}		
		return adult;
	}

	private String get_sRequest(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			sRequest = "DWH special request";
			break;
		case "HPP":
			sRequest = "HPP  special request";
			break;
		default:
			System.out.println("end");
		}		
		return sRequest;
	}
	
	private String get_ccType(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			ccType = "Visa";
			break;
		case "HPP":
			ccType = "Visa";
			break;
		default:
			System.out.println("end");
		}		
		return ccType;
	}
	
	private String get_ccNumber(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			ccNumber = "4111111111111111";
			break;
		case "HPP":
			ccNumber = "4222222222222";
			break;
		default:
			System.out.println("end");
		}		
		return ccNumber;
	}
	
	private String get_ccName(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			ccName = "On hold Prepayment";
			break;
		case "HPP":
			ccName = "On hold Prepayment";
			break;
		default:
			System.out.println("end");
		}		
		return ccName;
	}
	
	private String get_expMonth(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			expMonth = "5";
			break;
		case "HPP":
			expMonth = "8";
			break;
		default:
			System.out.println("end");
		}		
		return expMonth;
	}
	
	private String get_expYear(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			expYear = "2017";
			break;
		case "HPP":
			expYear = "2017";
			break;
		default:
			System.out.println("end");
		}		
		return expYear;
	}
	
	private String get_ccV(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			ccV = "234";
			break;
		case "HPP":
			ccV = "654";
			break;
		default:
			System.out.println("end");
		}		
		return ccV;
	}
	
}
