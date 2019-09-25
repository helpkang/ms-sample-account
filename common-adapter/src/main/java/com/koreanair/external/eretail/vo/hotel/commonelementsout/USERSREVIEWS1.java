
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for USERS_REVIEWS_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USERS_REVIEWS_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOURCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RETRIEVAL_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GLOBAL_REVIEW" type="{}GLOBAL_REVIEWS_1" minOccurs="0"/&gt;
 *         &lt;element name="LIST_REVIEW" type="{}LIST_REVIEW_1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USERS_REVIEWS_1", propOrder = {
    "source",
    "retrievaldate",
    "globalreview",
    "listreview"
})
public class USERSREVIEWS1
    implements Serializable
{

    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "RETRIEVAL_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrievaldate;
    @XmlElement(name = "GLOBAL_REVIEW")
    protected GLOBALREVIEWS1 globalreview;
    @XmlElement(name = "LIST_REVIEW")
    protected List<LISTREVIEW1> listreview;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the retrievaldate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRETRIEVALDATE() {
        return retrievaldate;
    }

    /**
     * Sets the value of the retrievaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRETRIEVALDATE(XMLGregorianCalendar value) {
        this.retrievaldate = value;
    }

    /**
     * Gets the value of the globalreview property.
     * 
     * @return
     *     possible object is
     *     {@link GLOBALREVIEWS1 }
     *     
     */
    public GLOBALREVIEWS1 getGLOBALREVIEW() {
        return globalreview;
    }

    /**
     * Sets the value of the globalreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALREVIEWS1 }
     *     
     */
    public void setGLOBALREVIEW(GLOBALREVIEWS1 value) {
        this.globalreview = value;
    }

    /**
     * Gets the value of the listreview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listreview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREVIEW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREVIEW1 }
     * 
     * 
     */
    public List<LISTREVIEW1> getLISTREVIEW() {
        if (listreview == null) {
            listreview = new ArrayList<LISTREVIEW1>();
        }
        return this.listreview;
    }

}
