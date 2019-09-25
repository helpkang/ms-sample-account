
package com.koreanair.eretail.pojo.air.commonin;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SELECTION_UPDATE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SELECTION_UPDATE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SELECTED_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SEGMENT_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SELECTED_CABIN" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SELECTION_UPDATE_Type", propOrder = {
    "listselectedindex",
    "segmentindex",
    "selectedcabin"
})
public class SELECTIONUPDATEType
    implements Serializable
{

    @XmlElement(name = "LIST_SELECTED_INDEX", required = true)
    protected BigInteger listselectedindex;
    @XmlElement(name = "SEGMENT_INDEX")
    protected BigInteger segmentindex;
    @XmlElement(name = "SELECTED_CABIN")
    protected String selectedcabin;

    /**
     * Gets the value of the listselectedindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLISTSELECTEDINDEX() {
        return listselectedindex;
    }

    /**
     * Sets the value of the listselectedindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLISTSELECTEDINDEX(BigInteger value) {
        this.listselectedindex = value;
    }

    /**
     * Gets the value of the segmentindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTINDEX() {
        return segmentindex;
    }

    /**
     * Sets the value of the segmentindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTINDEX(BigInteger value) {
        this.segmentindex = value;
    }

    /**
     * Gets the value of the selectedcabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELECTEDCABIN() {
        return selectedcabin;
    }

    /**
     * Sets the value of the selectedcabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELECTEDCABIN(String value) {
        this.selectedcabin = value;
    }

}
