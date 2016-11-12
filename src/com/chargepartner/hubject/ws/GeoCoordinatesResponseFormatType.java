
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoCoordinatesResponseFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoCoordinatesResponseFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Google"/>
 *     &lt;enumeration value="DegreeMinuteSeconds"/>
 *     &lt;enumeration value="DecimalDegree"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoCoordinatesResponseFormatType")
@XmlEnum
public enum GeoCoordinatesResponseFormatType {

    @XmlEnumValue("Google")
    GOOGLE("Google"),
    @XmlEnumValue("DegreeMinuteSeconds")
    DEGREE_MINUTE_SECONDS("DegreeMinuteSeconds"),
    @XmlEnumValue("DecimalDegree")
    DECIMAL_DEGREE("DecimalDegree");
    private final String value;

    GeoCoordinatesResponseFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeoCoordinatesResponseFormatType fromValue(String v) {
        for (GeoCoordinatesResponseFormatType c: GeoCoordinatesResponseFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
