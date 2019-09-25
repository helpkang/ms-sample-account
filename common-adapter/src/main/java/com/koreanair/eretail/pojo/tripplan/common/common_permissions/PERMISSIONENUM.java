
package com.koreanair.eretail.pojo.tripplan.common.common_permissions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERMISSION_ENUM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PERMISSION_ENUM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESTRICTED"/&gt;
 *     &lt;enumeration value="READ"/&gt;
 *     &lt;enumeration value="WRITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PERMISSION_ENUM")
@XmlEnum
public enum PERMISSIONENUM {

    RESTRICTED,
    READ,
    WRITE;

    public String value() {
        return name();
    }

    public static PERMISSIONENUM fromValue(String v) {
        return valueOf(v);
    }

}
