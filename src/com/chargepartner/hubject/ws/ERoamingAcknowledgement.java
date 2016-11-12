
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eRoamingAcknowledgement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eRoamingAcknowledgement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StatusCode" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}StatusCodeType"/>
 *         &lt;element name="SessionID" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}SessionIDType" minOccurs="0"/>
 *         &lt;element name="PartnerSessionID" type="{http://www.inubit.com/eMobility/SBP}String50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eRoamingAcknowledgement", propOrder = {
    "result",
    "statusCode",
    "sessionID",
    "partnerSessionID"
})
public class ERoamingAcknowledgement {

    @XmlElement(name = "Result")
    protected boolean result;
    @XmlElement(name = "StatusCode", required = true)
    protected StatusCodeType statusCode;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "PartnerSessionID")
    protected String partnerSessionID;

    /**
     * Gets the value of the result property.
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setStatusCode(StatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the partnerSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSessionID() {
        return partnerSessionID;
    }

    /**
     * Sets the value of the partnerSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSessionID(String value) {
        this.partnerSessionID = value;
    }

}
