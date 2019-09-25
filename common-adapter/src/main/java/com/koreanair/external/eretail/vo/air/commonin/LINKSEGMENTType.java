
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A link between a requested segment and a booked element (optionnaly segment). If only element if specified, reference the whole element. If both element and segment are specified, reference only this segment of this element. Index start at 0 and implicit using input LIST_BOOKED_ELEMENTS/LIST_SEGMENT order.
 * 
 * <p>Java class for LINK_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINK_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BOOKED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BOOKED_SEGMENT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINK_SEGMENT_Type", propOrder = {
    "destination",
    "bookedelement",
    "bookedsegment"
})
public class LINKSEGMENTType
    implements Serializable
{

    @XmlElement(name = "DESTINATION", required = true)
    protected BigInteger destination;
    @XmlElement(name = "BOOKED_ELEMENT", required = true)
    protected BigInteger bookedelement;
    @XmlElement(name = "BOOKED_SEGMENT")
    protected BigInteger bookedsegment;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDESTINATION() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDESTINATION(BigInteger value) {
        this.destination = value;
    }

    /**
     * Gets the value of the bookedelement property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOOKEDELEMENT() {
        return bookedelement;
    }

    /**
     * Sets the value of the bookedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOOKEDELEMENT(BigInteger value) {
        this.bookedelement = value;
    }

    /**
     * Gets the value of the bookedsegment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOOKEDSEGMENT() {
        return bookedsegment;
    }

    /**
     * Sets the value of the bookedsegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOOKEDSEGMENT(BigInteger value) {
        this.bookedsegment = value;
    }

}
