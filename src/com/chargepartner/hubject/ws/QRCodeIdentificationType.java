
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodeIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QRCodeIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EVCOID" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}EvcoIDType"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="PIN" type="{http://www.inubit.com/eMobility/SBP}String20"/>
 *           &lt;element name="HashedPIN" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}HashType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QRCodeIdentificationType", propOrder = {
    "evcoid",
    "pin",
    "hashedPIN"
})
public class QRCodeIdentificationType {

    @XmlElement(name = "EVCOID", required = true)
    protected String evcoid;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "HashedPIN")
    protected HashType hashedPIN;

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

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the hashedPIN property.
     * 
     * @return
     *     possible object is
     *     {@link HashType }
     *     
     */
    public HashType getHashedPIN() {
        return hashedPIN;
    }

    /**
     * Sets the value of the hashedPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashType }
     *     
     */
    public void setHashedPIN(HashType value) {
        this.hashedPIN = value;
    }

}
