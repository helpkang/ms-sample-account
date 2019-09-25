
package com.koreanair.eretail.pojo.tripplan.psf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STATUS_ENUM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="STATUS_ENUM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDED"/&gt;
 *     &lt;enumeration value="DELETED"/&gt;
 *     &lt;enumeration value="UPDATED"/&gt;
 *     &lt;enumeration value="INITIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "STATUS_ENUM")
@XmlEnum
public enum STATUSENUM {

    ADDED,
    DELETED,
    UPDATED,
    INITIAL;

    public String value() {
        return name();
    }

    public static STATUSENUM fromValue(String v) {
        return valueOf(v);
    }

}
