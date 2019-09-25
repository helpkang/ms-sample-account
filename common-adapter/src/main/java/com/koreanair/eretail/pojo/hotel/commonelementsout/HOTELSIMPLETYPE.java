
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel simple type
 * 
 * <p>Java class for HOTEL_SIMPLE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_SIMPLE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}HOTEL_ITEM_SIMPLE_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_SIMPLE_TYPE", propOrder = {
    "status"
})
@XmlSeeAlso({
    HOTELITEMCONTACTDETAILSTYPE.class
})
public class HOTELSIMPLETYPE
    extends HOTELITEMSIMPLETYPE
    implements Serializable
{

    @XmlElement(name = "STATUS")
    protected String status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

}
