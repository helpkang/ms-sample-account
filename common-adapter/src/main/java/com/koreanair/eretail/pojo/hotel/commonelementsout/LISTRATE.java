
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}MARKUP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listprice",
    "markup"
})
@XmlRootElement(name = "LIST_RATE")
public class LISTRATE
    implements Serializable
{

    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<HTLPRICETYPE> listprice;
    @XmlElement(name = "MARKUP")
    protected MARKUP markup;

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
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link MARKUP }
     *     
     */
    public MARKUP getMARKUP() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKUP }
     *     
     */
    public void setMARKUP(MARKUP value) {
        this.markup = value;
    }

}
