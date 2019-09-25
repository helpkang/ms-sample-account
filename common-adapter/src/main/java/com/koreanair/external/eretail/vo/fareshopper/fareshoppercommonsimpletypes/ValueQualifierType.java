
package com.koreanair.external.eretail.vo.fareshopper.fareshoppercommonsimpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueQualifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueQualifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValueQualifierType")
@XmlEnum
public enum ValueQualifierType {

    P,
    A;

    public String value() {
        return name();
    }

    public static ValueQualifierType fromValue(String v) {
        return valueOf(v);
    }

}
