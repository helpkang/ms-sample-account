
package com.koreanair.external.eretail.vo.fare.minirulesoutput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DURATION_UNIT_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DURATION_UNIT_type"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="SECONDS"/&gt;
 *     &lt;enumeration value="MINUTES"/&gt;
 *     &lt;enumeration value="HOURS"/&gt;
 *     &lt;enumeration value="DAYS"/&gt;
 *     &lt;enumeration value="WEEKS"/&gt;
 *     &lt;enumeration value="MONTHS"/&gt;
 *     &lt;enumeration value="YEARS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DURATION_UNIT_type")
@XmlEnum
public enum DURATIONUNITType {

    SECONDS,
    MINUTES,
    HOURS,
    DAYS,
    WEEKS,
    MONTHS,
    YEARS;

    public String value() {
        return name();
    }

    public static DURATIONUNITType fromValue(String v) {
        return valueOf(v);
    }

}
