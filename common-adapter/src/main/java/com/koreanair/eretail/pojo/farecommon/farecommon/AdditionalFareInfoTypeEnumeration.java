
package com.koreanair.eretail.pojo.farecommon.farecommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalFareInfoTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalFareInfoTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BFA"/&gt;
 *     &lt;enumeration value="PND"/&gt;
 *     &lt;enumeration value="OCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalFareInfoTypeEnumeration")
@XmlEnum
public enum AdditionalFareInfoTypeEnumeration {

    BFA,
    PND,
    OCA;

    public String value() {
        return name();
    }

    public static AdditionalFareInfoTypeEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
