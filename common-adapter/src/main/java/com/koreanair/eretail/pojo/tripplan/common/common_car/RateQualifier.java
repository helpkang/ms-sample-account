
package com.koreanair.eretail.pojo.tripplan.common.common_car;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rateQualifier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PREPAID"/&gt;
 *     &lt;enumeration value="GUARANTEED"/&gt;
 *     &lt;enumeration value="QUOTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rateQualifier")
@XmlEnum
public enum RateQualifier {

    PREPAID,
    GUARANTEED,
    QUOTED;

    public String value() {
        return name();
    }

    public static RateQualifier fromValue(String v) {
        return valueOf(v);
    }

}
