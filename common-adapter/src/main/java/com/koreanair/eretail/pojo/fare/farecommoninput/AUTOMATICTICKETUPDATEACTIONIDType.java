
package com.koreanair.eretail.pojo.fare.farecommoninput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUTOMATIC_TICKET_UPDATE_ACTION_ID_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUTOMATIC_TICKET_UPDATE_ACTION_ID_type"&gt;
 *   &lt;restriction base="{}unprotectedStringType"&gt;
 *     &lt;enumeration value="AutomaticTicketUpdate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AUTOMATIC_TICKET_UPDATE_ACTION_ID_type")
@XmlEnum
public enum AUTOMATICTICKETUPDATEACTIONIDType {

    @XmlEnumValue("AutomaticTicketUpdate")
    AUTOMATIC_TICKET_UPDATE("AutomaticTicketUpdate");
    private final String value;

    AUTOMATICTICKETUPDATEACTIONIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUTOMATICTICKETUPDATEACTIONIDType fromValue(String v) {
        for (AUTOMATICTICKETUPDATEACTIONIDType c: AUTOMATICTICKETUPDATEACTIONIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
