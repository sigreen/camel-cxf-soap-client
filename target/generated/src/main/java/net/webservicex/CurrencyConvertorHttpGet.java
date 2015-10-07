package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-10-07T10:39:34.876-04:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "CurrencyConvertorHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CurrencyConvertorHttpGet {

    @WebResult(name = "double", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    @WebMethod(operationName = "ConversionRate")
    public double conversionRate(
        @WebParam(partName = "FromCurrency", name = "FromCurrency", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String fromCurrency,
        @WebParam(partName = "ToCurrency", name = "ToCurrency", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String toCurrency
    );
}
