
package com.koreanair.eretail.pojo.fare.farecommoninput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MILES"/&gt;
 *     &lt;enumeration value="MILESANDCASH"/&gt;
 *     &lt;enumeration value="COMPANION"/&gt;
 *     &lt;enumeration value="TRANSITIONAL_CERT"/&gt;
 *     &lt;enumeration value="PROMOTIONAL_CERT"/&gt;
 *     &lt;enumeration value="ECODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PricingType")
@XmlEnum
public enum PricingType {

    MILES,
    MILESANDCASH,
    COMPANION,
    TRANSITIONAL_CERT,
    PROMOTIONAL_CERT,
    ECODE;

    public String value() {
        return name();
    }

    public static PricingType fromValue(String v) {
        return valueOf(v);
    }

}
