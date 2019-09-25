
package com.koreanair.eretail.pojo.fare.minirulesoutput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituationEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituationEnumeration"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="BEFORE_DEPARTURE"/&gt;
 *     &lt;enumeration value="BEFORE_DEPARTURE_NO_SHOW"/&gt;
 *     &lt;enumeration value="AFTER_DEPARTURE"/&gt;
 *     &lt;enumeration value="AFTER_DEPARTURE_NO_SHOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SituationEnumeration")
@XmlEnum
public enum SituationEnumeration {

    BEFORE_DEPARTURE,
    BEFORE_DEPARTURE_NO_SHOW,
    AFTER_DEPARTURE,
    AFTER_DEPARTURE_NO_SHOW;

    public String value() {
        return name();
    }

    public static SituationEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
