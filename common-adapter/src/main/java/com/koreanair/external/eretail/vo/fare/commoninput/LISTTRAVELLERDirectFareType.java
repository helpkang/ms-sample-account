
package com.koreanair.external.eretail.vo.fare.commoninput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_TRAVELLER_DirectFare_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_DirectFare_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_TYPE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}CODE_Type"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}HAS_INFANT"/&gt;
 *         &lt;element ref="{}IS_PRIMARY_TRAVELLER"/&gt;
 *         &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_DirectFare_Type", propOrder = {
    "travellertype",
    "hasinfant",
    "isprimarytraveller",
    "travellerid"
})
public class LISTTRAVELLERDirectFareType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_TYPE", required = true)
    protected LISTTRAVELLERDirectFareType.TRAVELLERTYPE travellertype;
    @XmlElement(name = "HAS_INFANT")
    protected boolean hasinfant;
    @XmlElement(name = "IS_PRIMARY_TRAVELLER")
    protected boolean isprimarytraveller;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link LISTTRAVELLERDirectFareType.TRAVELLERTYPE }
     *     
     */
    public LISTTRAVELLERDirectFareType.TRAVELLERTYPE getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTTRAVELLERDirectFareType.TRAVELLERTYPE }
     *     
     */
    public void setTRAVELLERTYPE(LISTTRAVELLERDirectFareType.TRAVELLERTYPE value) {
        this.travellertype = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{}CODE_Type"/&gt;
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
        "code"
    })
    public static class TRAVELLERTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

    }

}
