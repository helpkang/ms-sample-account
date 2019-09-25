
package com.koreanair.eretail.pojo.farecommon.farediscount;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListSegmentAssociated_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListSegmentAssociated_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_TATTOO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSegmentAssociated_Type", propOrder = {
    "segmenttattoo"
})
public class ListSegmentAssociatedType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_TATTOO", required = true)
    protected String segmenttattoo;

    /**
     * Gets the value of the segmenttattoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTTATTOO() {
        return segmenttattoo;
    }

    /**
     * Sets the value of the segmenttattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTTATTOO(String value) {
        this.segmenttattoo = value;
    }

}
