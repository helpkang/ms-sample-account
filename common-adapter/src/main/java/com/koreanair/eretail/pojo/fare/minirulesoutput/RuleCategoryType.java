
package com.koreanair.eretail.pojo.fare.minirulesoutput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RuleCategoryType"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="MX"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="VR"/&gt;
 *     &lt;enumeration value="VC"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="FL"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="TF"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RuleCategoryType")
@XmlEnum
public enum RuleCategoryType {

    AP,
    MN,
    MX,
    PE,
    VR,
    VC,
    SE,
    FL,
    SO,
    TF,
    BO,
    TE,
    CD,
    EL,
    SR;

    public String value() {
        return name();
    }

    public static RuleCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
