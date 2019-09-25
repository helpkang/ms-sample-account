
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TX_STATUS_Train_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TX_STATUS_Train_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="FAIL-TECHNICAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TX_STATUS_Train_Type")
@XmlEnum
public enum TXSTATUSTrainType {

    SUCCESS("SUCCESS"),
    FAIL("FAIL"),
    @XmlEnumValue("FAIL-TECHNICAL")
    FAIL_TECHNICAL("FAIL-TECHNICAL");
    private final String value;

    TXSTATUSTrainType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TXSTATUSTrainType fromValue(String v) {
        for (TXSTATUSTrainType c: TXSTATUSTrainType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
