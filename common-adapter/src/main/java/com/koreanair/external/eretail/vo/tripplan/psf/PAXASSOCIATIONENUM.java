
package com.koreanair.external.eretail.vo.tripplan.psf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PAX_ASSOCIATION_ENUM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PAX_ASSOCIATION_ENUM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ONE"/&gt;
 *     &lt;enumeration value="ONE_N"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="ANY"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PAX_ASSOCIATION_ENUM")
@XmlEnum
public enum PAXASSOCIATIONENUM {

    ONE,
    ONE_N,
    ALL,
    ANY,
    NONE;

    public String value() {
        return name();
    }

    public static PAXASSOCIATIONENUM fromValue(String v) {
        return valueOf(v);
    }

}
