
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FLIGHT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLIGHT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HIGHLIGHT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOOKABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}LIST_SEGMENT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLIGHT_Type", propOrder = {
    "highlight",
    "bookable",
    "itemid",
    "type",
    "listsegment"
})
public class FLIGHTType
    implements Serializable
{

    @XmlElement(name = "HIGHLIGHT")
    protected Boolean highlight;
    @XmlElement(name = "BOOKABLE")
    protected Boolean bookable;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<SEGMENTType> listsegment;

    /**
     * Gets the value of the highlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHIGHLIGHT() {
        return highlight;
    }

    /**
     * Sets the value of the highlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHIGHLIGHT(Boolean value) {
        this.highlight = value;
    }

    /**
     * Gets the value of the bookable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOKABLE() {
        return bookable;
    }

    /**
     * Sets the value of the bookable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOKABLE(Boolean value) {
        this.bookable = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the listsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTType }
     * 
     * 
     */
    public List<SEGMENTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SEGMENTType>();
        }
        return this.listsegment;
    }

}
