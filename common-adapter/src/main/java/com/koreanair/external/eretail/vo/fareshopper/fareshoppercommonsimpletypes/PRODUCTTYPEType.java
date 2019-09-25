
package com.koreanair.external.eretail.vo.fareshopper.fareshoppercommonsimpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCT_TYPE_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PRODUCT_TYPE_Type"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="CONSOLIDATORS"/&gt;
 *     &lt;enumeration value="WEBFARES"/&gt;
 *     &lt;enumeration value="STANDARD_AIR"/&gt;
 *     &lt;enumeration value="RAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PRODUCT_TYPE_Type")
@XmlEnum
public enum PRODUCTTYPEType {

    CONSOLIDATORS,
    WEBFARES,
    STANDARD_AIR,
    RAIL;

    public String value() {
        return name();
    }

    public static PRODUCTTYPEType fromValue(String v) {
        return valueOf(v);
    }

}
