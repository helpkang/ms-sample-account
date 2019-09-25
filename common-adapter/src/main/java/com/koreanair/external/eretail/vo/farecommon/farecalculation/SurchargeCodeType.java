
package com.koreanair.external.eretail.vo.farecommon.farecalculation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurchargeCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurchargeCode_Type"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="PFC"/&gt;
 *     &lt;enumeration value="TZP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurchargeCode_Type")
@XmlEnum
public enum SurchargeCodeType {

    S,
    Q,
    PFC,
    TZP;

    public String value() {
        return name();
    }

    public static SurchargeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
