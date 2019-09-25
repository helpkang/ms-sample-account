
package com.koreanair.external.eretail.vo.converter.currencyconversioninput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyInputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currencyInputType"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="Location"/&gt;
 *     &lt;enumeration value="Country"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "currencyInputType")
@XmlEnum
public enum CurrencyInputType {

    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Country")
    COUNTRY("Country");
    private final String value;

    CurrencyInputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyInputType fromValue(String v) {
        for (CurrencyInputType c: CurrencyInputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
