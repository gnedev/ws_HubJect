
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoCoordinatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoCoordinatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Google" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}GeoCoordinatesGoogleType"/>
 *           &lt;element name="DecimalDegree" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}GeoCoordinatesDecimalDegreeType"/>
 *           &lt;element name="DegreeMinuteSeconds" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}GeoCoordinatesDegreeMinuteSecondsType"/>
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
@XmlType(name = "GeoCoordinatesType", propOrder = {
    "google",
    "decimalDegree",
    "degreeMinuteSeconds"
})
public class GeoCoordinatesType {

    @XmlElement(name = "Google")
    protected GeoCoordinatesGoogleType google;
    @XmlElement(name = "DecimalDegree")
    protected GeoCoordinatesDecimalDegreeType decimalDegree;
    @XmlElement(name = "DegreeMinuteSeconds")
    protected GeoCoordinatesDegreeMinuteSecondsType degreeMinuteSeconds;

    /**
     * Gets the value of the google property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinatesGoogleType }
     *     
     */
    public GeoCoordinatesGoogleType getGoogle() {
        return google;
    }

    /**
     * Sets the value of the google property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinatesGoogleType }
     *     
     */
    public void setGoogle(GeoCoordinatesGoogleType value) {
        this.google = value;
    }

    /**
     * Gets the value of the decimalDegree property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinatesDecimalDegreeType }
     *     
     */
    public GeoCoordinatesDecimalDegreeType getDecimalDegree() {
        return decimalDegree;
    }

    /**
     * Sets the value of the decimalDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinatesDecimalDegreeType }
     *     
     */
    public void setDecimalDegree(GeoCoordinatesDecimalDegreeType value) {
        this.decimalDegree = value;
    }

    /**
     * Gets the value of the degreeMinuteSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinatesDegreeMinuteSecondsType }
     *     
     */
    public GeoCoordinatesDegreeMinuteSecondsType getDegreeMinuteSeconds() {
        return degreeMinuteSeconds;
    }

    /**
     * Sets the value of the degreeMinuteSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinatesDegreeMinuteSecondsType }
     *     
     */
    public void setDegreeMinuteSeconds(GeoCoordinatesDegreeMinuteSecondsType value) {
        this.degreeMinuteSeconds = value;
    }

}
