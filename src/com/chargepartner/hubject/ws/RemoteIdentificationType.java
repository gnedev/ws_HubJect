
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoteIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EVCOID" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}EvcoIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteIdentificationType", propOrder = {
    "evcoid"
})
public class RemoteIdentificationType {

    @XmlElement(name = "EVCOID", required = true)
    protected String evcoid;

    /**
     * Gets the value of the evcoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVCOID() {
        return evcoid;
    }

    /**
     * Sets the value of the evcoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVCOID(String value) {
        this.evcoid = value;
    }

}
