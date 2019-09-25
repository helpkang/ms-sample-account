
package com.koreanair.eretail.pojo.tripplan.psf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ITEM_TYPE_ENUM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ITEM_TYPE_ENUM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SSR"/&gt;
 *     &lt;enumeration value="OSI"/&gt;
 *     &lt;enumeration value="RM"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="OP"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ITEM_TYPE_ENUM")
@XmlEnum
public enum ITEMTYPEENUM {

    SSR,
    OSI,
    RM,
    SK,
    OP,
    SVC;

    public String value() {
        return name();
    }

    public static ITEMTYPEENUM fromValue(String v) {
        return valueOf(v);
    }

}
