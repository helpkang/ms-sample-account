
package com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elementUpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="elementUpdateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="KF"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "elementUpdateType")
@XmlEnum
public enum ElementUpdateType {


    /**
     * Used if the customer chooses to not change the element
     * 
     */
    K,

    /**
     * Used if the customer chooses to delete the element
     * 
     */
    D,

    /**
     * Used if the customer chooses to change the element
     * 
     */
    C,

    /**
     * Used if the customer chooses to keep the element and the base fare is not changed. This option is used if the option Keep the Fare is activated.
     * 
     */
    KF,

    /**
     * Used if the customer chooses to Upgrade the element. When set at bound level, means that all segments in the bound are being upgraded
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static ElementUpdateType fromValue(String v) {
        return valueOf(v);
    }

}
