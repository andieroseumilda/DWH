package ibe;

import org.openqa.selenium.WebDriver;

public class Page4 {
	// Start webDriver
	private WebDriver driver;
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
	private String expMonth;
	private String expYear;
	private String ccV;

	public Page4(WebDriver driver) {
		this.driver = driver;
	}

	public void paymentPage(String paymentProcessor) {

		locator_step4 step4 = new locator_step4(driver);


		step4.firstName().sendKeys(get_firstname(paymentProcessor));
		step4.lastName().sendKeys(get_lastName(paymentProcessor));
		step4.emailAdd().sendKeys(get_emailAdd(paymentProcessor));
		step4.emailConfirm().sendKeys(get_emailConfirm(paymentProcessor));
		step4.country().sendKeys(get_country(paymentProcessor));
		step4.cnNumber().sendKeys(get_cnNumber(paymentProcessor));
		step4.adult().sendKeys(get_adult(paymentProcessor));
		step4.sRequest().sendKeys(get_sRequest(paymentProcessor));
		step4.ccType().sendKeys(get_ccType(paymentProcessor));
		step4.ccNumber().sendKeys(get_ccNumber(paymentProcessor));
		step4.yesOwn().click();
		step4.expMonth().sendKeys(get_expMonth(paymentProcessor));
		step4.expYear().sendKeys(get_expYear(paymentProcessor));
		step4.ccV().sendKeys(get_ccV(paymentProcessor));
		step4.agree().click();
		step4.btnConfirm().click();
	}

	private String get_firstname(String paymentProcessor) {

		switch (paymentProcessor) {
		case "DWH":
			firstName = "Andie";
			break;
		case "HPP":
			firstName = "HPP";
			break;
		default:
			System.out.println("end");
		}
		return firstName;
	}

	private String get_lastName(String paymentProcessor) {
		switch (paymentProcessor) {
		case "DWH":
			lastName = "Andie";
			break;
		case "HPP":
			lastName = "HPP";
			break;
		default:
			System.out.println("end");
		}
		return lastName;
	}

	private String get_emailAdd(String paymentProcessor) {
		switch (paymentProcessor) {
		case "DWH":
			emailAdd = "andielyne.umilda@directwithhotels.com";
			break;
		case "HPP":
			emailAdd = "andielyne.umilda@directwithhotels.com";
			break;
		default:
			System.out.println("end");
		}
		return emailAdd;
	}
	
	private String get_emailConfirm(String paymentProcessor){
		switch (paymentProcessor) {
		case "DWH":
			emailConfirm = "andielyne.umilda@directwithhotels.com";
			break;
		case "HPP":
			emailConfirm = "andielyne.umilda@directwithhotels.com";
			break;
		default:
			System.out.println("end");
		}		
		return emailConfirm;
	}

	private String get_country(String paymentProcessor){
		switch (paymentProcessor) {
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

	private String get_cnNumber(String paymentProcessor){

		switch (paymentProcessor) {
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

	private String get_adult(String paymentProcessor){
		switch (paymentProcessor) {
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

	private String get_sRequest(String paymentProcessor){
		switch (paymentProcessor) {
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
	
	private String get_ccType(String paymentProcessor){
		switch (paymentProcessor) {
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
	
	private String get_ccNumber(String paymentProcessor){
		switch (paymentProcessor) {
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
	
	private String get_expMonth(String paymentProcessor){
		switch (paymentProcessor) {
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
	
	private String get_expYear(String paymentProcessor){
		switch (paymentProcessor) {
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
	
	private String get_ccV(String paymentProcessor){
		switch (paymentProcessor) {
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
