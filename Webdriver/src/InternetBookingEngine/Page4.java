package InternetBookingEngine;

import org.openqa.selenium.WebDriver;

public class Page4 {

	private String first_name;
	private String last_name;
	private String email_add;
	private String email_confirm;
	private String country;
	private String cn_number;
	private String adult;
	private String special_request;
	private String cc_type;
	private String cc_number;
	private String cc_name;
	private String exp_month;
	private String exp_year;
	private String ccv;
	private LocatorStep4 step4;

	public Page4(WebDriver driver) {
		step4 = new LocatorStep4(driver);
	}

	public void paymentPage(String payment_settings, boolean cc_owner) {
		step4.firstName().sendKeys(getFirstName(payment_settings));
		step4.lastName().sendKeys(getLastName(payment_settings));
		step4.emailAdd().sendKeys(getEmailAdd(payment_settings));
		step4.emailConfirm().sendKeys(getEmailConfirm(payment_settings));
		step4.country().sendKeys(getCountry(payment_settings));
		step4.cnNumber().sendKeys(getCnNumber(payment_settings));
		step4.noOfAdult().sendKeys(getAdult(payment_settings));
		step4.sRequest().sendKeys(getSpecialRequest(payment_settings));
		step4.ccType().sendKeys(getCcType(payment_settings));
		step4.ccNumber().sendKeys(getCcNumber(payment_settings));
		if(cc_owner){
			step4.yesOwner().click();
		}else{
			step4.notOwner().click();
			step4.ccName().sendKeys(getCcName(payment_settings));
		}
		step4.expMonth().sendKeys(getExpMonth(payment_settings));
		step4.expYear().sendKeys(getExpYear(payment_settings));
		step4.ccV().sendKeys(getCcV(payment_settings));
		step4.agree().click();
		step4.btnConfirm().click();
	}

	private String getFirstName(String payment_settings) {

		switch (payment_settings) {
		case "DWH":
			first_name = "Test";
			break;
		case "HPP":
			first_name = "HPP";
			break;
		default:
			System.out.println("end");
		}
		return first_name;
	}

	private String getLastName(String payment_settings) {
		switch (payment_settings) {
		case "DWH":
			last_name = "Reservation";
			break;
		case "HPP":
			last_name = "HPP";
			break;
		default:
			System.out.println("end");
		}
		return last_name;
	}

	private String getEmailAdd(String payment_settings) {
		switch (payment_settings) {
		case "DWH":
			email_add = "dwh.testemail@gmail.com";
			break;
		case "HPP":
			email_add = "dwh.testemail@gmail.com";
			break;
		default:
			System.out.println("end");
		}
		return email_add;
	}
	
	private String getEmailConfirm(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			email_confirm = "dwh.testemail@gmail.com";
			break;
		case "HPP":
			email_confirm = "dwh.testemail@gmail.com";
			break;
		default:
			System.out.println("end");
		}		
		return email_confirm;
	}

	private String getCountry(String payment_settings){
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

	private String getCnNumber(String payment_settings){

		switch (payment_settings) {
		case "DWH":
			cn_number = "91345664217";
			break;
		case "HPP":
			cn_number = "12345678";
			break;
		default:
			System.out.println("end");
		}
		return cn_number;
	}

	private String getAdult(String payment_settings){
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

	private String getSpecialRequest(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			special_request = "DWH special request";
			break;
		case "HPP":
			special_request = "HPP  special request";
			break;
		default:
			System.out.println("end");
		}		
		return special_request;
	}
	
	private String getCcType(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			cc_type = "Visa";
			break;
		case "HPP":
			cc_type = "Visa";
			break;
		default:
			System.out.println("end");
		}		
		return cc_type;
	}
	
	private String getCcNumber(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			cc_number = "4111111111111111";
			break;
		case "HPP":
			cc_number = "4222222222222";
			break;
		default:
			System.out.println("end");
		}		
		return cc_number;
	}
	
	private String getCcName(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			cc_name = "On hold Prepayment";
			break;
		case "HPP":
			cc_name = "On hold Prepayment";
			break;
		default:
			System.out.println("end");
		}		
		return cc_name;
	}
	
	private String getExpMonth(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			exp_month = "5";
			break;
		case "HPP":
			exp_month = "8";
			break;
		default:
			System.out.println("end");
		}		
		return exp_month;
	}
	
	private String getExpYear(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			exp_year = "2017";
			break;
		case "HPP":
			exp_year = "2017";
			break;
		default:
			System.out.println("end");
		}		
		return exp_year;
	}
	
	private String getCcV(String payment_settings){
		switch (payment_settings) {
		case "DWH":
			ccv = "234";
			break;
		case "HPP":
			ccv = "654";
			break;
		default:
			System.out.println("end");
		}		
		return ccv;
	}
	
}
