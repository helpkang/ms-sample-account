
package com.koreanair.eretail.pojo.farecommon.farediscount;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDiscountType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerDiscountType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER_TYPE_DISCOUNT"/&gt;
 *     &lt;enumeration value="FAMILIA_NUMEROSA"/&gt;
 *     &lt;enumeration value="SPANISH_RESIDENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerDiscountType_Type")
@XmlEnum
public enum CustomerDiscountTypeType {

    CUSTOMER_TYPE_DISCOUNT,
    FAMILIA_NUMEROSA,
    SPANISH_RESIDENT;

    public String value() {
        return name();
    }

    public static CustomerDiscountTypeType fromValue(String v) {
        return valueOf(v);
    }

}
