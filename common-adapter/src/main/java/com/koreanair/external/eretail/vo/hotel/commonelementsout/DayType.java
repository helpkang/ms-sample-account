
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dayType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MON"/&gt;
 *     &lt;enumeration value="TUE"/&gt;
 *     &lt;enumeration value="WED"/&gt;
 *     &lt;enumeration value="THU"/&gt;
 *     &lt;enumeration value="FRI"/&gt;
 *     &lt;enumeration value="SAT"/&gt;
 *     &lt;enumeration value="SUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dayType")
@XmlEnum
public enum DayType {

    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN;

    public String value() {
        return name();
    }

    public static DayType fromValue(String v) {
        return valueOf(v);
    }

}
