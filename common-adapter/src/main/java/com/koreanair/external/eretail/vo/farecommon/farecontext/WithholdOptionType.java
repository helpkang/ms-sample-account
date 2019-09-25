
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithholdOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WithholdOptionType"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="SURCHARGE"/&gt;
 *     &lt;enumeration value="TAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WithholdOptionType")
@XmlEnum
public enum WithholdOptionType {

    SURCHARGE,
    TAX;

    public String value() {
        return name();
    }

    public static WithholdOptionType fromValue(String v) {
        return valueOf(v);
    }

}
