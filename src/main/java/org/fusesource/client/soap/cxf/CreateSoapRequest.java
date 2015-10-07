package org.fusesource.client.soap.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.Header;

import net.webservicex.ConversionRate;
import net.webservicex.Currency;

public class CreateSoapRequest {
	
	public void createSoapBody(@Header("fromCurrency") String fromCurrency, @Header("toCurrency") String toCurrency, Exchange exchange) {
		ConversionRate request = new ConversionRate();
		request.setToCurrency(Currency.valueOf(toCurrency));
		request.setFromCurrency(Currency.valueOf(fromCurrency));
		exchange.getIn().setBody(request);
	}

}
