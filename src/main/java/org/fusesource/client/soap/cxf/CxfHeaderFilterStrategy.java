package org.fusesource.client.soap.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultHeaderFilterStrategy;


public class CxfHeaderFilterStrategy extends DefaultHeaderFilterStrategy {

    @Override
    public boolean applyFilterToCamelHeaders(String headerName, Object headerValue, Exchange exchange) {
        return true;
    }
}
