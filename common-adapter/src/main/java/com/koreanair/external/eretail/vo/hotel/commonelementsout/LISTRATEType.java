
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Item for a LIST_RATE list. This item is a significant price info for the hotel or the room (min price, max price, average price...).
 * 
 * <p>Java class for LIST_RATEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_RATEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RATING_MODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_RATEType", propOrder = {
    "listprice",
    "ratingmode"
})
public class LISTRATEType
    implements Serializable
{

    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<HTLPRICETYPE> listprice;
    @XmlElement(name = "RATING_MODE", required = true)
    protected String ratingmode;

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
     * {@link HTLPRICETYPE }
     * 
     * 
     */
    public List<HTLPRICETYPE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<HTLPRICETYPE>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the ratingmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATINGMODE() {
        return ratingmode;
    }

    /**
     * Sets the value of the ratingmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATINGMODE(String value) {
        this.ratingmode = value;
    }

}
