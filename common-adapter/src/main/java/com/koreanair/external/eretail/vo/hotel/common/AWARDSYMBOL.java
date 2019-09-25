
package com.koreanair.external.eretail.vo.hotel.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AWARD_SYMBOL.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AWARD_SYMBOL"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STAR"/&gt;
 *     &lt;enumeration value="DIAMOND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AWARD_SYMBOL")
@XmlEnum
public enum AWARDSYMBOL {

    STAR,
    DIAMOND;

    public String value() {
        return name();
    }

    public static AWARDSYMBOL fromValue(String v) {
        return valueOf(v);
    }

}
