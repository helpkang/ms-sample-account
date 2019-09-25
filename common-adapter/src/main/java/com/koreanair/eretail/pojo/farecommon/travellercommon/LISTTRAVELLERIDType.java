
package com.koreanair.eretail.pojo.farecommon.travellercommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_TRAVELLER_ID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_ID_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}TravellerIdentificationGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_ID_Type", propOrder = {
    "travellerid",
    "travellerexternalid",
    "isinfant"
})
public class LISTTRAVELLERIDType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "TRAVELLER_EXTERNAL_ID")
    protected BigInteger travellerexternalid;
    @XmlElement(name = "IS_INFANT")
    protected Boolean isinfant;

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the travellerexternalid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLEREXTERNALID() {
        return travellerexternalid;
    }

    /**
     * Sets the value of the travellerexternalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLEREXTERNALID(BigInteger value) {
        this.travellerexternalid = value;
    }

    /**
     * Gets the value of the isinfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINFANT() {
        return isinfant;
    }

    /**
     * Sets the value of the isinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINFANT(Boolean value) {
        this.isinfant = value;
    }

}
