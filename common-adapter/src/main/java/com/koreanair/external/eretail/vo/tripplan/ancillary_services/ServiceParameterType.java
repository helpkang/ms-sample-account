
package com.koreanair.external.eretail.vo.tripplan.ancillary_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceParameterType"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="WEIGHT"/&gt;
 *     &lt;enumeration value="WIDTH"/&gt;
 *     &lt;enumeration value="LENGTH"/&gt;
 *     &lt;enumeration value="HEIGHT"/&gt;
 *     &lt;enumeration value="NUMBER"/&gt;
 *     &lt;enumeration value="SEAT_CHARACTERISTIC"/&gt;
 *     &lt;enumeration value="SEAT_ASSIGNMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "serviceParameterType")
@XmlEnum
public enum ServiceParameterType {

    WEIGHT,
    WIDTH,
    LENGTH,
    HEIGHT,
    NUMBER,
    SEAT_CHARACTERISTIC,
    SEAT_ASSIGNMENT;

    public String value() {
        return name();
    }

    public static ServiceParameterType fromValue(String v) {
        return valueOf(v);
    }

}
