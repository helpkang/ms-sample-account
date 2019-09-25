
package com.koreanair.external.eretail.vo.tripplan.common.common_price;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for amount_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="amount_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="BT"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="NET REMIT"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "amount_type")
@XmlEnum
public enum AmountType {

    STANDARD("STANDARD"),
    BT("BT"),
    IT("IT"),
    @XmlEnumValue("NET REMIT")
    NET_REMIT("NET REMIT"),
    ERROR("ERROR");
    private final String value;

    AmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountType fromValue(String v) {
        for (AmountType c: AmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
