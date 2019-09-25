
package com.koreanair.external.eretail.vo.fareshopper.fareshoppercommonsimpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareAdditionHandlingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareAdditionHandlingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareAdditionHandlingType")
@XmlEnum
public enum FareAdditionHandlingType {

    I,
    E,
    W;

    public String value() {
        return name();
    }

    public static FareAdditionHandlingType fromValue(String v) {
        return valueOf(v);
    }

}
