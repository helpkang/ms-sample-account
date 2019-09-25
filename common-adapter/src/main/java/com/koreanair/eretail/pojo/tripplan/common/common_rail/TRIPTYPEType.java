
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRIP_TYPE_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TRIP_TYPE_Type"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="ONE-WAY"/&gt;
 *     &lt;enumeration value="ROUND-TRIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TRIP_TYPE_Type")
@XmlEnum
public enum TRIPTYPEType {

    O("O"),
    R("R"),
    M("M"),
    @XmlEnumValue("ONE-WAY")
    ONE_WAY("ONE-WAY"),
    @XmlEnumValue("ROUND-TRIP")
    ROUND_TRIP("ROUND-TRIP");
    private final String value;

    TRIPTYPEType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRIPTYPEType fromValue(String v) {
        for (TRIPTYPEType c: TRIPTYPEType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
