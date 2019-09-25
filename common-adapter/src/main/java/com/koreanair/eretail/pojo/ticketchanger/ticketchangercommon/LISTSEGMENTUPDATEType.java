
package com.koreanair.eretail.pojo.ticketchanger.ticketchangercommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of change requested on a Segment. The SEGMENT_ID is the id of the segment into the bound.
 * 
 * <p>Java class for LIST_SEGMENT_UPDATE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SEGMENT_UPDATE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}elementUpdateType" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SEGMENT_UPDATE_Type", propOrder = {
    "type",
    "segmentid"
})
public class LISTSEGMENTUPDATEType
    implements Serializable
{

    @XmlElement(name = "TYPE")
    @XmlSchemaType(name = "string")
    protected ElementUpdateType type;
    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ElementUpdateType }
     *     
     */
    public ElementUpdateType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementUpdateType }
     *     
     */
    public void setTYPE(ElementUpdateType value) {
        this.type = value;
    }

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

}
