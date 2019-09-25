
package com.koreanair.eretail.pojo.hotel.reservation.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleTotalPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleTotalPricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOTAL_AMOUNT_TAX_INC" type="{}ListPriceWithMarkupType" minOccurs="0"/&gt;
 *         &lt;element name="BASE_PRICE" type="{}ListPriceWithMarkupType" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT_WITHOUT_TAX" type="{}ListPriceWithMarkupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleTotalPricingType", propOrder = {
    "totalamounttaxinc",
    "baseprice",
    "amountwithouttax"
})
@XmlSeeAlso({
    TotalPricingType.class
})
public class SimpleTotalPricingType
    implements Serializable
{

    @XmlElement(name = "TOTAL_AMOUNT_TAX_INC")
    protected ListPriceWithMarkupType totalamounttaxinc;
    @XmlElement(name = "BASE_PRICE")
    protected ListPriceWithMarkupType baseprice;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX")
    protected ListPriceWithMarkupType amountwithouttax;

    /**
     * Gets the value of the totalamounttaxinc property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceWithMarkupType }
     *     
     */
    public ListPriceWithMarkupType getTOTALAMOUNTTAXINC() {
        return totalamounttaxinc;
    }

    /**
     * Sets the value of the totalamounttaxinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceWithMarkupType }
     *     
     */
    public void setTOTALAMOUNTTAXINC(ListPriceWithMarkupType value) {
        this.totalamounttaxinc = value;
    }

    /**
     * Gets the value of the baseprice property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceWithMarkupType }
     *     
     */
    public ListPriceWithMarkupType getBASEPRICE() {
        return baseprice;
    }

    /**
     * Sets the value of the baseprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceWithMarkupType }
     *     
     */
    public void setBASEPRICE(ListPriceWithMarkupType value) {
        this.baseprice = value;
    }

    /**
     * Gets the value of the amountwithouttax property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceWithMarkupType }
     *     
     */
    public ListPriceWithMarkupType getAMOUNTWITHOUTTAX() {
        return amountwithouttax;
    }

    /**
     * Sets the value of the amountwithouttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceWithMarkupType }
     *     
     */
    public void setAMOUNTWITHOUTTAX(ListPriceWithMarkupType value) {
        this.amountwithouttax = value;
    }

}
