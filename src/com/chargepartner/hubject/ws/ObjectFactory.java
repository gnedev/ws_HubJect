
package com.chargepartner.hubject.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chargepartner.hubject.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ERoamingPullAuthenticationData_QNAME = new QName("http://www.hubject.com/b2b/services/authenticationdata/v2.0", "eRoamingPullAuthenticationData");
    private final static QName _ERoamingAcknowledgement_QNAME = new QName("http://www.hubject.com/b2b/services/commontypes/v2.0", "eRoamingAcknowledgement");
    private final static QName _ERoamingAuthenticationData_QNAME = new QName("http://www.hubject.com/b2b/services/authenticationdata/v2.0", "eRoamingAuthenticationData");
    private final static QName _ERoamingPushAuthenticationData_QNAME = new QName("http://www.hubject.com/b2b/services/authenticationdata/v2.0", "eRoamingPushAuthenticationData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chargepartner.hubject.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ERoamingAuthenticationData }
     * 
     */
    public ERoamingAuthenticationData createERoamingAuthenticationData() {
        return new ERoamingAuthenticationData();
    }

    /**
     * Create an instance of {@link ERoamingPullAuthenticationData }
     * 
     */
    public ERoamingPullAuthenticationData createERoamingPullAuthenticationData() {
        return new ERoamingPullAuthenticationData();
    }

    /**
     * Create an instance of {@link ERoamingPushAuthenticationData }
     * 
     */
    public ERoamingPushAuthenticationData createERoamingPushAuthenticationData() {
        return new ERoamingPushAuthenticationData();
    }

    /**
     * Create an instance of {@link ProviderAuthenticationDataType }
     * 
     */
    public ProviderAuthenticationDataType createProviderAuthenticationDataType() {
        return new ProviderAuthenticationDataType();
    }

    /**
     * Create an instance of {@link AuthenticationDataRecordType }
     * 
     */
    public AuthenticationDataRecordType createAuthenticationDataRecordType() {
        return new AuthenticationDataRecordType();
    }

    /**
     * Create an instance of {@link ERoamingAcknowledgement }
     * 
     */
    public ERoamingAcknowledgement createERoamingAcknowledgement() {
        return new ERoamingAcknowledgement();
    }

    /**
     * Create an instance of {@link GeoCoordinatesDecimalDegreeType }
     * 
     */
    public GeoCoordinatesDecimalDegreeType createGeoCoordinatesDecimalDegreeType() {
        return new GeoCoordinatesDecimalDegreeType();
    }

    /**
     * Create an instance of {@link AddressIso19773Type }
     * 
     */
    public AddressIso19773Type createAddressIso19773Type() {
        return new AddressIso19773Type();
    }

    /**
     * Create an instance of {@link GeoCoordinatesDegreeMinuteSecondsType }
     * 
     */
    public GeoCoordinatesDegreeMinuteSecondsType createGeoCoordinatesDegreeMinuteSecondsType() {
        return new GeoCoordinatesDegreeMinuteSecondsType();
    }

    /**
     * Create an instance of {@link StatusCodeType }
     * 
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link HashType }
     * 
     */
    public HashType createHashType() {
        return new HashType();
    }

    /**
     * Create an instance of {@link RFIDmifarefamilyIdentificationType }
     * 
     */
    public RFIDmifarefamilyIdentificationType createRFIDmifarefamilyIdentificationType() {
        return new RFIDmifarefamilyIdentificationType();
    }

    /**
     * Create an instance of {@link RemoteIdentificationType }
     * 
     */
    public RemoteIdentificationType createRemoteIdentificationType() {
        return new RemoteIdentificationType();
    }

    /**
     * Create an instance of {@link IdentificationType }
     * 
     */
    public IdentificationType createIdentificationType() {
        return new IdentificationType();
    }

    /**
     * Create an instance of {@link GeoCoordinatesType }
     * 
     */
    public GeoCoordinatesType createGeoCoordinatesType() {
        return new GeoCoordinatesType();
    }

    /**
     * Create an instance of {@link GeoCoordinatesGoogleType }
     * 
     */
    public GeoCoordinatesGoogleType createGeoCoordinatesGoogleType() {
        return new GeoCoordinatesGoogleType();
    }

    /**
     * Create an instance of {@link PlugAndChargeIdentificationType }
     * 
     */
    public PlugAndChargeIdentificationType createPlugAndChargeIdentificationType() {
        return new PlugAndChargeIdentificationType();
    }

    /**
     * Create an instance of {@link SearchCenterType }
     * 
     */
    public SearchCenterType createSearchCenterType() {
        return new SearchCenterType();
    }

    /**
     * Create an instance of {@link QRCodeIdentificationType }
     * 
     */
    public QRCodeIdentificationType createQRCodeIdentificationType() {
        return new QRCodeIdentificationType();
    }

    /**
     * Create an instance of {@link ERoamingAuthenticationData.AuthenticationData }
     * 
     */
    public ERoamingAuthenticationData.AuthenticationData createERoamingAuthenticationDataAuthenticationData() {
        return new ERoamingAuthenticationData.AuthenticationData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ERoamingPullAuthenticationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0", name = "eRoamingPullAuthenticationData")
    public JAXBElement<ERoamingPullAuthenticationData> createERoamingPullAuthenticationData(ERoamingPullAuthenticationData value) {
        return new JAXBElement<ERoamingPullAuthenticationData>(_ERoamingPullAuthenticationData_QNAME, ERoamingPullAuthenticationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ERoamingAcknowledgement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hubject.com/b2b/services/commontypes/v2.0", name = "eRoamingAcknowledgement")
    public JAXBElement<ERoamingAcknowledgement> createERoamingAcknowledgement(ERoamingAcknowledgement value) {
        return new JAXBElement<ERoamingAcknowledgement>(_ERoamingAcknowledgement_QNAME, ERoamingAcknowledgement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ERoamingAuthenticationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0", name = "eRoamingAuthenticationData")
    public JAXBElement<ERoamingAuthenticationData> createERoamingAuthenticationData(ERoamingAuthenticationData value) {
        return new JAXBElement<ERoamingAuthenticationData>(_ERoamingAuthenticationData_QNAME, ERoamingAuthenticationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ERoamingPushAuthenticationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0", name = "eRoamingPushAuthenticationData")
    public JAXBElement<ERoamingPushAuthenticationData> createERoamingPushAuthenticationData(ERoamingPushAuthenticationData value) {
        return new JAXBElement<ERoamingPushAuthenticationData>(_ERoamingPushAuthenticationData_QNAME, ERoamingPushAuthenticationData.class, null, value);
    }

}
