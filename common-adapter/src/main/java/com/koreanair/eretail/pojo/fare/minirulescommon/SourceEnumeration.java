
package com.koreanair.eretail.pojo.fare.minirulescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FARE"/&gt;
 *     &lt;enumeration value="TST"/&gt;
 *     &lt;enumeration value="RECORD_LOCATOR"/&gt;
 *     &lt;enumeration value="E-TICKET"/&gt;
 *     &lt;enumeration value="OFFER"/&gt;
 *     &lt;enumeration value="PRICING_SOLUTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SourceEnumeration")
@XmlEnum
public enum SourceEnumeration {

    FARE("FARE"),
    TST("TST"),
    RECORD_LOCATOR("RECORD_LOCATOR"),
    @XmlEnumValue("E-TICKET")
    E_TICKET("E-TICKET"),
    OFFER("OFFER"),
    PRICING_SOLUTION("PRICING_SOLUTION");
    private final String value;

    SourceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceEnumeration fromValue(String v) {
        for (SourceEnumeration c: SourceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
