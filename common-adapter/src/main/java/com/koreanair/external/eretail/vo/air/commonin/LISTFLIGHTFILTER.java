
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="FILTER_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LAST_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "filtertype",
    "airline",
    "firstdate",
    "lastdate"
})
@XmlRootElement(name = "LIST_FLIGHT_FILTER")
public class LISTFLIGHTFILTER
    implements Serializable
{

    @XmlElement(name = "FILTER_TYPE")
    protected String filtertype;
    @XmlElement(name = "AIRLINE")
    protected String airline;
    @XmlElement(name = "FIRST_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstdate;
    @XmlElement(name = "LAST_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastdate;

    /**
     * Gets the value of the filtertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILTERTYPE() {
        return filtertype;
    }

    /**
     * Sets the value of the filtertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILTERTYPE(String value) {
        this.filtertype = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINE(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the firstdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFIRSTDATE() {
        return firstdate;
    }

    /**
     * Sets the value of the firstdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFIRSTDATE(XMLGregorianCalendar value) {
        this.firstdate = value;
    }

    /**
     * Gets the value of the lastdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTDATE() {
        return lastdate;
    }

    /**
     * Sets the value of the lastdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTDATE(XMLGregorianCalendar value) {
        this.lastdate = value;
    }

}
