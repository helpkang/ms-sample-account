
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transportChargeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Return"/&gt;
 *     &lt;enumeration value="One-Way"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transportChargeType")
@XmlEnum
public enum TransportChargeType {

    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("One-Way")
    ONE_WAY("One-Way");
    private final String value;

    TransportChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportChargeType fromValue(String v) {
        for (TransportChargeType c: TransportChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
