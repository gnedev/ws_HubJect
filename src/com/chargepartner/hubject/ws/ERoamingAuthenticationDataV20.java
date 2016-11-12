
package com.chargepartner.hubject.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "eRoamingAuthenticationData_V2.0", targetNamespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0", wsdlLocation = "file:/opt/IdeaProjects/ws_HubJect/src/com/chargepartner/hubject/ws/WSDL/eRoamingAuthenticationData_V2.0_service-definition.wsdl")
public class ERoamingAuthenticationDataV20
    extends Service
{

    private final static URL EROAMINGAUTHENTICATIONDATAV20_WSDL_LOCATION;
    private final static WebServiceException EROAMINGAUTHENTICATIONDATAV20_EXCEPTION;
    private final static QName EROAMINGAUTHENTICATIONDATAV20_QNAME = new QName("http://www.hubject.com/b2b/services/authenticationdata/v2.0", "eRoamingAuthenticationData_V2.0");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/opt/IdeaProjects/ws_HubJect/src/com/chargepartner/hubject/ws/WSDL/eRoamingAuthenticationData_V2.0_service-definition.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EROAMINGAUTHENTICATIONDATAV20_WSDL_LOCATION = url;
        EROAMINGAUTHENTICATIONDATAV20_EXCEPTION = e;
    }

    public ERoamingAuthenticationDataV20() {
        super(__getWsdlLocation(), EROAMINGAUTHENTICATIONDATAV20_QNAME);
    }

    public ERoamingAuthenticationDataV20(WebServiceFeature... features) {
        super(__getWsdlLocation(), EROAMINGAUTHENTICATIONDATAV20_QNAME, features);
    }

    public ERoamingAuthenticationDataV20(URL wsdlLocation) {
        super(wsdlLocation, EROAMINGAUTHENTICATIONDATAV20_QNAME);
    }

    public ERoamingAuthenticationDataV20(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EROAMINGAUTHENTICATIONDATAV20_QNAME, features);
    }

    public ERoamingAuthenticationDataV20(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ERoamingAuthenticationDataV20(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ERoamingAuthenticationDataPortType
     */
    @WebEndpoint(name = "eRoamingAuthenticationData_V2.0Port")
    public ERoamingAuthenticationDataPortType getERoamingAuthenticationDataV20Port() {
        return super.getPort(new QName("http://www.hubject.com/b2b/services/authenticationdata/v2.0", "eRoamingAuthenticationData_V2.0Port"), ERoamingAuthenticationDataPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ERoamingAuthenticationDataPortType
     */
    @WebEndpoint(name = "eRoamingAuthenticationData_V2.0Port")
    public ERoamingAuthenticationDataPortType getERoamingAuthenticationDataV20Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.hubject.com/b2b/services/authenticationdata/v2.0", "eRoamingAuthenticationData_V2.0Port"), ERoamingAuthenticationDataPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EROAMINGAUTHENTICATIONDATAV20_EXCEPTION!= null) {
            throw EROAMINGAUTHENTICATIONDATAV20_EXCEPTION;
        }
        return EROAMINGAUTHENTICATIONDATAV20_WSDL_LOCATION;
    }

}
