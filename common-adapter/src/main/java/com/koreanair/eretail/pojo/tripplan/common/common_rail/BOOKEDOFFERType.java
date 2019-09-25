
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOOKED_OFFER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_OFFER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}OFFER_Type_BASE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_OFFER_Type", propOrder = {
    "itemid"
})
public class BOOKEDOFFERType
    extends OFFERTypeBASE
    implements Serializable
{

    @XmlElement(name = "ITEM_ID")
    protected Integer itemid;

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setITEMID(Integer value) {
        this.itemid = value;
    }

}
