
package com.koreanair.eretail.pojo.flexpricer.flexpricercommoninput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_SEGMENTS_TO_CHANGE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SEGMENTS_TO_CHANGE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SEGMENTS_TO_CHANGE_Type", propOrder = {
    "segmentnumber"
})
public class LISTSEGMENTSTOCHANGEType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_NUMBER", required = true)
    protected BigInteger segmentnumber;

    /**
     * Gets the value of the segmentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTNUMBER() {
        return segmentnumber;
    }

    /**
     * Sets the value of the segmentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTNUMBER(BigInteger value) {
        this.segmentnumber = value;
    }

}
