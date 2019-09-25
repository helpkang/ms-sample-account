
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.FAREFAMILYFareType;


/**
 * <p>Java class for UPSOLD_SEGMENT_ID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPSOLD_SEGMENT_ID_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{}FARE_FAMILY_FareType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPSOLD_SEGMENT_ID_Type", propOrder = {
    "segmentid",
    "farefamily"
})
public class UPSOLDSEGMENTIDType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID", required = true)
    protected String segmentid;
    @XmlElement(name = "FARE_FAMILY", required = true)
    protected FAREFAMILYFareType farefamily;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTID(String value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public FAREFAMILYFareType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public void setFAREFAMILY(FAREFAMILYFareType value) {
        this.farefamily = value;
    }

}
