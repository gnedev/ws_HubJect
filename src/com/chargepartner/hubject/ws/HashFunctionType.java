
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HashFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HashFunctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MD5"/>
 *     &lt;enumeration value="SHA-1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HashFunctionType")
@XmlEnum
public enum HashFunctionType {

    @XmlEnumValue("MD5")
    MD_5("MD5"),
    @XmlEnumValue("SHA-1")
    SHA_1("SHA-1");
    private final String value;

    HashFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HashFunctionType fromValue(String v) {
        for (HashFunctionType c: HashFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
