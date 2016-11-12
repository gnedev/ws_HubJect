
package com.chargepartner.hubject.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eRoamingAuthenticationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eRoamingAuthenticationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderAuthenticationData" type="{http://www.hubject.com/b2b/services/authenticationdata/v2.0}ProviderAuthenticationDataType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StatusCode" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}StatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eRoamingAuthenticationData", namespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0", propOrder = {
    "authenticationData",
    "statusCode"
})
public class ERoamingAuthenticationData {

    @XmlElement(name = "AuthenticationData", required = true)
    protected ERoamingAuthenticationData.AuthenticationData authenticationData;
    @XmlElement(name = "StatusCode")
    protected StatusCodeType statusCode;

    /**
     * Gets the value of the authenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link ERoamingAuthenticationData.AuthenticationData }
     *     
     */
    public ERoamingAuthenticationData.AuthenticationData getAuthenticationData() {
        return authenticationData;
    }

    /**
     * Sets the value of the authenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ERoamingAuthenticationData.AuthenticationData }
     *     
     */
    public void setAuthenticationData(ERoamingAuthenticationData.AuthenticationData value) {
        this.authenticationData = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderAuthenticationData" type="{http://www.hubject.com/b2b/services/authenticationdata/v2.0}ProviderAuthenticationDataType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerAuthenticationData"
    })
    public static class AuthenticationData {

        @XmlElement(name = "ProviderAuthenticationData", namespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0")
        protected List<ProviderAuthenticationDataType> providerAuthenticationData;

        /**
         * Gets the value of the providerAuthenticationData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerAuthenticationData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderAuthenticationData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProviderAuthenticationDataType }
         * 
         * 
         */
        public List<ProviderAuthenticationDataType> getProviderAuthenticationData() {
            if (providerAuthenticationData == null) {
                providerAuthenticationData = new ArrayList<ProviderAuthenticationDataType>();
            }
            return this.providerAuthenticationData;
        }

    }

}
