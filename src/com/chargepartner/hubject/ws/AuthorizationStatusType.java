
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Authorized"/>
 *     &lt;enumeration value="NotAuthorized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationStatusType")
@XmlEnum
public enum AuthorizationStatusType {

    @XmlEnumValue("Authorized")
    AUTHORIZED("Authorized"),
    @XmlEnumValue("NotAuthorized")
    NOT_AUTHORIZED("NotAuthorized");
    private final String value;

    AuthorizationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationStatusType fromValue(String v) {
        for (AuthorizationStatusType c: AuthorizationStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
