
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKFEEType;


/**
 * <p>Java class for LIST_ALTERNATE_TRAVELLER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ALTERNATE_TRAVELLER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}HAS_INFANT"/&gt;
 *         &lt;element ref="{}IS_PRIMARY_TRAVELLER"/&gt;
 *         &lt;element ref="{}REQUESTED_TRAVELLER_TYPE"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}REBOOK_FEE" minOccurs="0"/&gt;
 *         &lt;element ref="{}NO_SHOW_FEE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ALTERNATE_TRAVELLER_Type", propOrder = {
    "hasinfant",
    "isprimarytraveller",
    "requestedtravellertype",
    "travellerid",
    "rebookfee",
    "noshowfee"
})
public class LISTALTERNATETRAVELLERType
    implements Serializable
{

    @XmlElement(name = "HAS_INFANT")
    protected boolean hasinfant;
    @XmlElement(name = "IS_PRIMARY_TRAVELLER")
    protected boolean isprimarytraveller;
    @XmlElement(name = "REQUESTED_TRAVELLER_TYPE", required = true)
    protected TRAVELERType requestedtravellertype;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "REBOOK_FEE")
    protected REBOOKFEEType rebookfee;
    @XmlElement(name = "NO_SHOW_FEE")
    protected REBOOKFEEType noshowfee;

    /**
     * Gets the value of the hasinfant property.
     * 
     */
    public boolean isHASINFANT() {
        return hasinfant;
    }

    /**
     * Sets the value of the hasinfant property.
     * 
     */
    public void setHASINFANT(boolean value) {
        this.hasinfant = value;
    }

    /**
     * Gets the value of the isprimarytraveller property.
     * 
     */
    public boolean isISPRIMARYTRAVELLER() {
        return isprimarytraveller;
    }

    /**
     * Sets the value of the isprimarytraveller property.
     * 
     */
    public void setISPRIMARYTRAVELLER(boolean value) {
        this.isprimarytraveller = value;
    }

    /**
     * Gets the value of the requestedtravellertype property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELERType }
     *     
     */
    public TRAVELERType getREQUESTEDTRAVELLERTYPE() {
        return requestedtravellertype;
    }

    /**
     * Sets the value of the requestedtravellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELERType }
     *     
     */
    public void setREQUESTEDTRAVELLERTYPE(TRAVELERType value) {
        this.requestedtravellertype = value;
    }

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
     * Gets the value of the rebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getREBOOKFEE() {
        return rebookfee;
    }

    /**
     * Sets the value of the rebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setREBOOKFEE(REBOOKFEEType value) {
        this.rebookfee = value;
    }

    /**
     * Gets the value of the noshowfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getNOSHOWFEE() {
        return noshowfee;
    }

    /**
     * Sets the value of the noshowfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setNOSHOWFEE(REBOOKFEEType value) {
        this.noshowfee = value;
    }

}
