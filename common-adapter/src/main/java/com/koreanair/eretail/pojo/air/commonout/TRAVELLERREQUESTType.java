
package com.koreanair.eretail.pojo.air.commonout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAVELLER_REQUEST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_REQUEST_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HAS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}DISCOUNT_CARD_INDEX" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_DISCOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVELLER_REQUEST_Type", propOrder = {
    "hasinfant",
    "discountcardindex",
    "travellerdiscount",
    "travellertype"
})
public class TRAVELLERREQUESTType
    implements Serializable
{

    @XmlElement(name = "HAS_INFANT")
    protected Boolean hasinfant;
    @XmlElement(name = "DISCOUNT_CARD_INDEX")
    protected BigInteger discountcardindex;
    @XmlElement(name = "TRAVELLER_DISCOUNT")
    protected String travellerdiscount;
    @XmlElement(name = "TRAVELLER_TYPE")
    protected String travellertype;

    /**
     * Gets the value of the hasinfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHASINFANT() {
        return hasinfant;
    }

    /**
     * Sets the value of the hasinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASINFANT(Boolean value) {
        this.hasinfant = value;
    }

    /**
     * Gets the value of the discountcardindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDISCOUNTCARDINDEX() {
        return discountcardindex;
    }

    /**
     * Sets the value of the discountcardindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDISCOUNTCARDINDEX(BigInteger value) {
        this.discountcardindex = value;
    }

    /**
     * Gets the value of the travellerdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERDISCOUNT() {
        return travellerdiscount;
    }

    /**
     * Sets the value of the travellerdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERDISCOUNT(String value) {
        this.travellerdiscount = value;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERTYPE(String value) {
        this.travellertype = value;
    }

}
