
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RAIL_VIA_LOCATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAIL_VIA_LOCATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}RAIL_LOCATION_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STOPOVER_DURATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RAIL_VIA_LOCATION_Type", propOrder = {
    "stopoverduration"
})
public class RAILVIALOCATIONType
    extends RAILLOCATIONType
    implements Serializable
{

    @XmlElement(name = "STOPOVER_DURATION")
    protected String stopoverduration;

    /**
     * Gets the value of the stopoverduration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPOVERDURATION() {
        return stopoverduration;
    }

    /**
     * Sets the value of the stopoverduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPOVERDURATION(String value) {
        this.stopoverduration = value;
    }

}
