
package com.koreanair.eretail.pojo.common.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDS_CABIN_CODE_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GDS_CABIN_CODE_type"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GDS_CABIN_CODE_type")
@XmlEnum
public enum GDSCABINCODEType {

    F,
    C,
    Y,
    W,
    M;

    public String value() {
        return name();
    }

    public static GDSCABINCODEType fromValue(String v) {
        return valueOf(v);
    }

}
