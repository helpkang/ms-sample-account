
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVAIL_DATA_SOURCE_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AVAIL_DATA_SOURCE_type"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="AIP"/&gt;
 *     &lt;enumeration value="AVD"/&gt;
 *     &lt;enumeration value="AVR"/&gt;
 *     &lt;enumeration value="DPP"/&gt;
 *     &lt;enumeration value="IAC"/&gt;
 *     &lt;enumeration value="LCA"/&gt;
 *     &lt;enumeration value="NDR"/&gt;
 *     &lt;enumeration value="XXX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AVAIL_DATA_SOURCE_type")
@XmlEnum
public enum AVAILDATASOURCEType {

    AIP,
    AVD,
    AVR,
    DPP,
    IAC,
    LCA,
    NDR,
    XXX;

    public String value() {
        return name();
    }

    public static AVAILDATASOURCEType fromValue(String v) {
        return valueOf(v);
    }

}
