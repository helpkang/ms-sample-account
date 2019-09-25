
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about pricing related to the booking flow
 * 
 * <p>Java class for PRICING_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRICING_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRICE_GUARANTEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="INVENTORY_BLOCKED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PRICING_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRICING_INFORMATIONType", propOrder = {
    "priceguarantee",
    "inventoryblocked",
    "pricingmandatory"
})
public class PRICINGINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "PRICE_GUARANTEE")
    protected Boolean priceguarantee;
    @XmlElement(name = "INVENTORY_BLOCKED")
    protected Boolean inventoryblocked;
    @XmlElement(name = "PRICING_MANDATORY")
    protected Object pricingmandatory;

    /**
     * Gets the value of the priceguarantee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRICEGUARANTEE() {
        return priceguarantee;
    }

    /**
     * Sets the value of the priceguarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRICEGUARANTEE(Boolean value) {
        this.priceguarantee = value;
    }

    /**
     * Gets the value of the inventoryblocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINVENTORYBLOCKED() {
        return inventoryblocked;
    }

    /**
     * Sets the value of the inventoryblocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINVENTORYBLOCKED(Boolean value) {
        this.inventoryblocked = value;
    }

    /**
     * Gets the value of the pricingmandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRICINGMANDATORY() {
        return pricingmandatory;
    }

    /**
     * Sets the value of the pricingmandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRICINGMANDATORY(Object value) {
        this.pricingmandatory = value;
    }

}
