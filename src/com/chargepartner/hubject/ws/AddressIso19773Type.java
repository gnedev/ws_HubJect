
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AddressIso19773Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressIso19773Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.hubject.com/b2b/services/commontypes/v2.0}CountryCodeType"/>
 *         &lt;element name="City" type="{http://www.inubit.com/eMobility/SBP}String1-50"/>
 *         &lt;element name="Street" type="{http://www.inubit.com/eMobility/SBP}String5-100"/>
 *         &lt;element name="PostalCode" type="{http://www.inubit.com/eMobility/SBP}String10" minOccurs="0"/>
 *         &lt;element name="HouseNum" type="{http://www.inubit.com/eMobility/SBP}String10" minOccurs="0"/>
 *         &lt;element name="Floor" type="{http://www.inubit.com/eMobility/SBP}String5" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.inubit.com/eMobility/SBP}String50" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.inubit.com/eMobility/SBP}String10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressIso19773Type", propOrder = {
    "country",
    "city",
    "street",
    "postalCode",
    "houseNum",
    "floor",
    "region",
    "timeZone"
})
public class AddressIso19773Type {

    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "City", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String city;
    @XmlElement(name = "Street", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String street;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "HouseNum")
    protected String houseNum;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "TimeZone")
    protected String timeZone;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the houseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNum() {
        return houseNum;
    }

    /**
     * Sets the value of the houseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNum(String value) {
        this.houseNum = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

}
