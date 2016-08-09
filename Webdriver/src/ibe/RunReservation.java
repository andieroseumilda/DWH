package ibe;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

public class RunReservation {

//	@Test
//	public void bookingEngine_DWH() throws MalformedURLException {
//
//		paymentProcessor dwhIbe = new paymentProcessor();
//		dwhIbe.reservation("DWH", 2);
//	}

	@Test
	public void bookingEngine_HPP() throws MalformedURLException {

		PaymentProcessor dwhIbe = new PaymentProcessor();
		dwhIbe.reservation("DWH", 3);
	}
}
