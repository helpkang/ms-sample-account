
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PanelTypeCode"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PanelTypeCode")
@XmlEnum
public enum PanelTypeCode {

    A,
    U,
    C;

    public String value() {
        return name();
    }

    public static PanelTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
