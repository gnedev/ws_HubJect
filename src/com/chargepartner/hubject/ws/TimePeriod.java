
package com.chargepartner.hubject.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimePeriod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimePeriod", namespace = "http://www.inubit.com/eMobility/SBP")
@XmlEnum
public enum TimePeriod {

    DAY,
    MONTH,
    YEAR;

    public String value() {
        return name();
    }

    public static TimePeriod fromValue(String v) {
        return valueOf(v);
    }

}
