
package com.koreanair.external.eretail.vo.fare.farecommoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR10741489
 * 
 * <p>Java class for SEGMENT_TRAVELLER_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENT_TRAVELLER_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}TRAVELLER_REQUEST_type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT_REQUEST_type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_DISCOUNT" type="{}PTC_Discount_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BREAK_POINT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENT_TRAVELLER_type", propOrder = {
    "listtraveller",
    "listsegment",
    "listdiscount",
    "farebasis",
    "farebreakpoint"
})
public class SEGMENTTRAVELLERType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<TRAVELLERREQUESTType> listtraveller;
    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<SEGMENTREQUESTType> listsegment;
    @XmlElement(name = "LIST_DISCOUNT")
    protected List<PTCDiscountType> listdiscount;
    @XmlElement(name = "FARE_BASIS")
    protected Object farebasis;
    @XmlElement(name = "FARE_BREAK_POINT")
    protected Object farebreakpoint;

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERREQUESTType }
     * 
     * 
     */
    public List<TRAVELLERREQUESTType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERREQUESTType>();
        }
        return this.listtraveller;
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
     * {@link SEGMENTREQUESTType }
     * 
     * 
     */
    public List<SEGMENTREQUESTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SEGMENTREQUESTType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the listdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCDiscountType }
     * 
     * 
     */
    public List<PTCDiscountType> getLISTDISCOUNT() {
        if (listdiscount == null) {
            listdiscount = new ArrayList<PTCDiscountType>();
        }
        return this.listdiscount;
    }

    /**
     * Gets the value of the farebasis property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFAREBASIS() {
        return farebasis;
    }

    /**
     * Sets the value of the farebasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFAREBASIS(Object value) {
        this.farebasis = value;
    }

    /**
     * Gets the value of the farebreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFAREBREAKPOINT() {
        return farebreakpoint;
    }

    /**
     * Sets the value of the farebreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFAREBREAKPOINT(Object value) {
        this.farebreakpoint = value;
    }

}
