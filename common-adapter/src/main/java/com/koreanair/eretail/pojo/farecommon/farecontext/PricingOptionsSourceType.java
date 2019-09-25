
package com.koreanair.eretail.pojo.farecommon.farecontext;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingOptionsSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingOptionsSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPUT_ONLY"/&gt;
 *     &lt;enumeration value="DB_ONLY"/&gt;
 *     &lt;enumeration value="BACKEND_ONLY"/&gt;
 *     &lt;enumeration value="MIXED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PricingOptionsSourceType")
@XmlEnum
public enum PricingOptionsSourceType {

    INPUT_ONLY,
    DB_ONLY,
    BACKEND_ONLY,
    MIXED;

    public String value() {
        return name();
    }

    public static PricingOptionsSourceType fromValue(String v) {
        return valueOf(v);
    }

}
