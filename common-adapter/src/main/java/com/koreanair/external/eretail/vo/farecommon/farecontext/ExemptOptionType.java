
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExemptOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExemptOptionType"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="TAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExemptOptionType")
@XmlEnum
public enum ExemptOptionType {

    TAX;

    public String value() {
        return name();
    }

    public static ExemptOptionType fromValue(String v) {
        return valueOf(v);
    }

}
