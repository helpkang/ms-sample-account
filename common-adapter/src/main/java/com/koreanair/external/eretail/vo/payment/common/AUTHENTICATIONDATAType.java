
package com.koreanair.external.eretail.vo.payment.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUTHENTICATION_DATAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUTHENTICATION_DATAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAVV" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AVV" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COMMERCE_INDICATOR" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="UCAF_COLLECTION_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ECI" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="XID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUTHENTICATION_DATAType", propOrder = {
    "cavv",
    "avv",
    "commerceindicator",
    "ucafcollectionindicator",
    "eci",
    "xid"
})
public class AUTHENTICATIONDATAType
    implements Serializable
{

    @XmlElement(name = "CAVV")
    protected String cavv;
    @XmlElement(name = "AVV")
    protected String avv;
    @XmlElement(name = "COMMERCE_INDICATOR", required = true)
    protected String commerceindicator;
    @XmlElement(name = "UCAF_COLLECTION_INDICATOR")
    protected String ucafcollectionindicator;
    @XmlElement(name = "ECI")
    protected String eci;
    @XmlElement(name = "XID")
    protected String xid;

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAVV() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAVV(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the avv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVV() {
        return avv;
    }

    /**
     * Sets the value of the avv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVV(String value) {
        this.avv = value;
    }

    /**
     * Gets the value of the commerceindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMERCEINDICATOR() {
        return commerceindicator;
    }

    /**
     * Sets the value of the commerceindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMERCEINDICATOR(String value) {
        this.commerceindicator = value;
    }

    /**
     * Gets the value of the ucafcollectionindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCAFCOLLECTIONINDICATOR() {
        return ucafcollectionindicator;
    }

    /**
     * Sets the value of the ucafcollectionindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCAFCOLLECTIONINDICATOR(String value) {
        this.ucafcollectionindicator = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECI() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECI(String value) {
        this.eci = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXID() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXID(String value) {
        this.xid = value;
    }

}
