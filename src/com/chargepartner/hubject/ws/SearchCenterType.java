
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCenterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeoCoordinates" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}GeoCoordinatesType"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCenterType", propOrder = {
    "geoCoordinates",
    "radius"
})
public class SearchCenterType {

    @XmlElement(name = "GeoCoordinates", required = true)
    protected GeoCoordinatesType geoCoordinates;
    @XmlElement(name = "Radius", required = true)
    protected String radius;

    /**
     * Gets the value of the geoCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinatesType }
     *     
     */
    public GeoCoordinatesType getGeoCoordinates() {
        return geoCoordinates;
    }

    /**
     * Sets the value of the geoCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinatesType }
     *     
     */
    public void setGeoCoordinates(GeoCoordinatesType value) {
        this.geoCoordinates = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadius(String value) {
        this.radius = value;
    }

}
