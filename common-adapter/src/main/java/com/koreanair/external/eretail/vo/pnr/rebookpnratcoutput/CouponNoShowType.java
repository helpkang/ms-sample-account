
package com.koreanair.external.eretail.vo.pnr.rebookpnratcoutput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for couponNoShowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="couponNoShowType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRUE"/&gt;
 *     &lt;enumeration value="FALSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "couponNoShowType")
@XmlEnum
public enum CouponNoShowType {

    TRUE,
    FALSE;

    public String value() {
        return name();
    }

    public static CouponNoShowType fromValue(String v) {
        return valueOf(v);
    }

}
