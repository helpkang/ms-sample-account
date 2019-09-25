
package com.koreanair.eretail.pojo.fare.commoninput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Additional and specific information associated to a traveller
 * 			
 * 
 * <p>Java class for LIST_TRAVELLER_INFO_DirectFare_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_INFO_DirectFare_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_INFO" type="{}DISCOUNT_INFO_DirectFare_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_INFO_DirectFare_Type", propOrder = {
    "travellerid",
    "isinfant",
    "discountinfo"
})
public class LISTTRAVELLERINFODirectFareType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;
    @XmlElement(name = "IS_INFANT")
    protected Boolean isinfant;
    @XmlElement(name = "DISCOUNT_INFO")
    protected DISCOUNTINFODirectFareType discountinfo;

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

    /**
     * Gets the value of the discountinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFODirectFareType }
     *     
     */
    public DISCOUNTINFODirectFareType getDISCOUNTINFO() {
        return discountinfo;
    }

    /**
     * Sets the value of the discountinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFODirectFareType }
     *     
     */
    public void setDISCOUNTINFO(DISCOUNTINFODirectFareType value) {
        this.discountinfo = value;
    }

}
