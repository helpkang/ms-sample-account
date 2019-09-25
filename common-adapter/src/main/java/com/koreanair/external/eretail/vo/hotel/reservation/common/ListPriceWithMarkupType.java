
package com.koreanair.external.eretail.vo.hotel.reservation.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListPriceWithMarkupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListPriceWithMarkupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PRICE" type="{}PriceWithMarkupType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MARKUP" type="{}ListPriceType" minOccurs="0"/&gt;
 *         &lt;element name="MANUAL_MARKUP" type="{}ListPriceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListPriceWithMarkupType", propOrder = {
    "listprice",
    "markup",
    "manualmarkup"
})
public class ListPriceWithMarkupType
    implements Serializable
{

    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<PriceWithMarkupType> listprice;
    @XmlElement(name = "MARKUP")
    protected ListPriceType markup;
    @XmlElement(name = "MANUAL_MARKUP")
    protected ListPriceType manualmarkup;

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceWithMarkupType }
     * 
     * 
     */
    public List<PriceWithMarkupType> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<PriceWithMarkupType>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceType }
     *     
     */
    public ListPriceType getMARKUP() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceType }
     *     
     */
    public void setMARKUP(ListPriceType value) {
        this.markup = value;
    }

    /**
     * Gets the value of the manualmarkup property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceType }
     *     
     */
    public ListPriceType getMANUALMARKUP() {
        return manualmarkup;
    }

    /**
     * Sets the value of the manualmarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceType }
     *     
     */
    public void setMANUALMARKUP(ListPriceType value) {
        this.manualmarkup = value;
    }

}
