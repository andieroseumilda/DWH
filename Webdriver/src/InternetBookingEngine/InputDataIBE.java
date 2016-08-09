package InternetBookingEngine;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

public class InputDataIBE {
	private GetAllPages dwhIbe;
	
	public InputDataIBE() throws MalformedURLException {
		dwhIbe = new GetAllPages();
	}
	
	@Test
	public void bookingEngine_DWH() throws MalformedURLException {
		dwhIbe.makeReservation("DWH", 2);
	}

//	@Test
//	public void bookingEngine_HPP() throws MalformedURLException {
//
//		PaymentProcessor dwhIbe = new PaymentProcessor();
//		dwhIbe.reservation("HPP", 3);
//	}
}
