
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Segment identifier. Optional some identifier has to be define, the old format and the new format.
 * 
 * <p>Java class for SEGMENT_IDENTIFICATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENT_IDENTIFICATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SEGMENT_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENT_IDENTIFICATION_Type", propOrder = {
    "segmentidentifier",
    "segmentid"
})
public class SEGMENTIDENTIFICATIONType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_IDENTIFIER")
    protected BigInteger segmentidentifier;
    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;

    /**
     * Gets the value of the segmentidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTIDENTIFIER() {
        return segmentidentifier;
    }

    /**
     * Sets the value of the segmentidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTIDENTIFIER(BigInteger value) {
        this.segmentidentifier = value;
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
