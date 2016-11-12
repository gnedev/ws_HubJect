
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eRoamingPushAuthenticationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eRoamingPushAuthenticationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="fullLoad"/>
 *               &lt;enumeration value="update"/>
 *               &lt;enumeration value="insert"/>
 *               &lt;enumeration value="delete"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProviderAuthenticationData" type="{http://www.hubject.com/b2b/services/authenticationdata/v2.0}ProviderAuthenticationDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eRoamingPushAuthenticationData", namespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0", propOrder = {
    "actionType",
    "providerAuthenticationData"
})
public class ERoamingPushAuthenticationData {

    @XmlElement(name = "ActionType", required = true)
    protected String actionType;
    @XmlElement(name = "ProviderAuthenticationData", required = true)
    protected ProviderAuthenticationDataType providerAuthenticationData;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the providerAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderAuthenticationDataType }
     *     
     */
    public ProviderAuthenticationDataType getProviderAuthenticationData() {
        return providerAuthenticationData;
    }

    /**
     * Sets the value of the providerAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderAuthenticationDataType }
     *     
     */
    public void setProviderAuthenticationData(ProviderAuthenticationDataType value) {
        this.providerAuthenticationData = value;
    }

}
