
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="RFIDmifarefamilyIdentification" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}RFIDmifarefamilyIdentificationType"/>
 *           &lt;element name="QRCodeIdentification" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}QRCodeIdentificationType"/>
 *           &lt;element name="PlugAndChargeIdentification" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}PlugAndChargeIdentificationType"/>
 *           &lt;element name="RemoteIdentification" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}RemoteIdentificationType"/>
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
@XmlType(name = "IdentificationType", propOrder = {
    "rfiDmifarefamilyIdentification",
    "qrCodeIdentification",
    "plugAndChargeIdentification",
    "remoteIdentification"
})
public class IdentificationType {

    @XmlElement(name = "RFIDmifarefamilyIdentification")
    protected RFIDmifarefamilyIdentificationType rfiDmifarefamilyIdentification;
    @XmlElement(name = "QRCodeIdentification")
    protected QRCodeIdentificationType qrCodeIdentification;
    @XmlElement(name = "PlugAndChargeIdentification")
    protected PlugAndChargeIdentificationType plugAndChargeIdentification;
    @XmlElement(name = "RemoteIdentification")
    protected RemoteIdentificationType remoteIdentification;

    /**
     * Gets the value of the rfiDmifarefamilyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link RFIDmifarefamilyIdentificationType }
     *     
     */
    public RFIDmifarefamilyIdentificationType getRFIDmifarefamilyIdentification() {
        return rfiDmifarefamilyIdentification;
    }

    /**
     * Sets the value of the rfiDmifarefamilyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFIDmifarefamilyIdentificationType }
     *     
     */
    public void setRFIDmifarefamilyIdentification(RFIDmifarefamilyIdentificationType value) {
        this.rfiDmifarefamilyIdentification = value;
    }

    /**
     * Gets the value of the qrCodeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeIdentificationType }
     *     
     */
    public QRCodeIdentificationType getQRCodeIdentification() {
        return qrCodeIdentification;
    }

    /**
     * Sets the value of the qrCodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeIdentificationType }
     *     
     */
    public void setQRCodeIdentification(QRCodeIdentificationType value) {
        this.qrCodeIdentification = value;
    }

    /**
     * Gets the value of the plugAndChargeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PlugAndChargeIdentificationType }
     *     
     */
    public PlugAndChargeIdentificationType getPlugAndChargeIdentification() {
        return plugAndChargeIdentification;
    }

    /**
     * Sets the value of the plugAndChargeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlugAndChargeIdentificationType }
     *     
     */
    public void setPlugAndChargeIdentification(PlugAndChargeIdentificationType value) {
        this.plugAndChargeIdentification = value;
    }

    /**
     * Gets the value of the remoteIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteIdentificationType }
     *     
     */
    public RemoteIdentificationType getRemoteIdentification() {
        return remoteIdentification;
    }

    /**
     * Sets the value of the remoteIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteIdentificationType }
     *     
     */
    public void setRemoteIdentification(RemoteIdentificationType value) {
        this.remoteIdentification = value;
    }

}
