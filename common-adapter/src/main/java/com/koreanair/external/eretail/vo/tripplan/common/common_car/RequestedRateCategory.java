
package com.koreanair.external.eretail.vo.tripplan.common.common_car;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedRateCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestedRateCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEI"/&gt;
 *     &lt;enumeration value="CORPORATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "requestedRateCategory")
@XmlEnum
public enum RequestedRateCategory {


    /**
     * Leisure
     * 
     */
    LEI,
    CORPORATE;

    public String value() {
        return name();
    }

    public static RequestedRateCategory fromValue(String v) {
        return valueOf(v);
    }

}
