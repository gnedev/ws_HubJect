
package com.chargepartner.hubject.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderAuthenticationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderAuthenticationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderID" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}ProviderIDType"/>
 *         &lt;element name="AuthenticationDataRecord" type="{http://www.hubject.com/b2b/services/authenticationdata/v2.0}AuthenticationDataRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderAuthenticationDataType", namespace = "http://www.hubject.com/b2b/services/authenticationdata/v2.0", propOrder = {
    "providerID",
    "authenticationDataRecord"
})
public class ProviderAuthenticationDataType {

    @XmlElement(name = "ProviderID", required = true)
    protected String providerID;
    @XmlElement(name = "AuthenticationDataRecord")
    protected List<AuthenticationDataRecordType> authenticationDataRecord;

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the authenticationDataRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationDataRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationDataRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationDataRecordType }
     * 
     * 
     */
    public List<AuthenticationDataRecordType> getAuthenticationDataRecord() {
        if (authenticationDataRecord == null) {
            authenticationDataRecord = new ArrayList<AuthenticationDataRecordType>();
        }
        return this.authenticationDataRecord;
    }

}
