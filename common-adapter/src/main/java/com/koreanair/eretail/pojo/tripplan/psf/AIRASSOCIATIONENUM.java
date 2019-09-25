
package com.koreanair.eretail.pojo.tripplan.psf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AIR_ASSOCIATION_ENUM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AIR_ASSOCIATION_ENUM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ONE"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="ANY"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="AIRLINE"/&gt;
 *     &lt;enumeration value="AIR_NOSEG"/&gt;
 *     &lt;enumeration value="AIR_GDS"/&gt;
 *     &lt;enumeration value="AIR_ANYSEG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AIR_ASSOCIATION_ENUM")
@XmlEnum
public enum AIRASSOCIATIONENUM {

    ONE,
    ALL,
    ANY,
    NONE,
    AIRLINE,
    AIR_NOSEG,
    AIR_GDS,
    AIR_ANYSEG;

    public String value() {
        return name();
    }

    public static AIRASSOCIATIONENUM fromValue(String v) {
        return valueOf(v);
    }

}
