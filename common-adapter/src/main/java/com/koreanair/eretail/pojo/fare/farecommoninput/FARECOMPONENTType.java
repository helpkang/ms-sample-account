
package com.koreanair.eretail.pojo.fare.farecommoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.TYPEDAMOUNTType;


/**
 * <p>Java class for FARE_COMPONENT_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_COMPONENT_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_COMPONENT_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT_REQUEST_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PRICE_AMOUNT_OVERRIDE_VALUE" type="{}TYPED_AMOUNT_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_COMPONENT_type", propOrder = {
    "farecomponentid",
    "farebasis",
    "listsegment",
    "priceamountoverridevalue"
})
public class FARECOMPONENTType
    implements Serializable
{

    @XmlElement(name = "FARE_COMPONENT_ID")
    protected Integer farecomponentid;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<SEGMENTREQUESTType> listsegment;
    @XmlElement(name = "PRICE_AMOUNT_OVERRIDE_VALUE")
    protected TYPEDAMOUNTType priceamountoverridevalue;

    /**
     * Gets the value of the farecomponentid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFARECOMPONENTID() {
        return farecomponentid;
    }

    /**
     * Sets the value of the farecomponentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFARECOMPONENTID(Integer value) {
        this.farecomponentid = value;
    }

    /**
     * Gets the value of the farebasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBASIS() {
        return farebasis;
    }

    /**
     * Sets the value of the farebasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBASIS(String value) {
        this.farebasis = value;
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
     * Gets the value of the priceamountoverridevalue property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getPRICEAMOUNTOVERRIDEVALUE() {
        return priceamountoverridevalue;
    }

    /**
     * Sets the value of the priceamountoverridevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setPRICEAMOUNTOVERRIDEVALUE(TYPEDAMOUNTType value) {
        this.priceamountoverridevalue = value;
    }

}
