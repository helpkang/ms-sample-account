
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="genericChargeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Exclusive"/&gt;
 *     &lt;enumeration value="Inclusive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "genericChargeType")
@XmlEnum
public enum GenericChargeType {

    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive");
    private final String value;

    GenericChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenericChargeType fromValue(String v) {
        for (GenericChargeType c: GenericChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
