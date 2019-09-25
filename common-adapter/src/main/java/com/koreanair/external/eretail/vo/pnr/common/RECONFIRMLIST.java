
package com.koreanair.external.eretail.vo.pnr.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="LOCAL_CONTACT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RECONFIRM_STATUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "", propOrder = {
    "localcontact",
    "reconfirmstatus",
    "segmentid"
})
@XmlRootElement(name = "RECONFIRM_LIST")
public class RECONFIRMLIST {

    @XmlElement(name = "LOCAL_CONTACT", required = true)
    protected String localcontact;
    @XmlElement(name = "RECONFIRM_STATUS")
    protected boolean reconfirmstatus;
    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;

    /**
     * Gets the value of the localcontact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALCONTACT() {
        return localcontact;
    }

    /**
     * Sets the value of the localcontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALCONTACT(String value) {
        this.localcontact = value;
    }

    /**
     * Gets the value of the reconfirmstatus property.
     * 
     */
    public boolean isRECONFIRMSTATUS() {
        return reconfirmstatus;
    }

    /**
     * Sets the value of the reconfirmstatus property.
     * 
     */
    public void setRECONFIRMSTATUS(boolean value) {
        this.reconfirmstatus = value;
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
