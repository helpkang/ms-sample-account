
package com.koreanair.external.eretail.vo.tripplan.pricing_options;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRICING_OPTIONS_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRICING_OPTIONS_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRICING_OPTION_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BREAKPOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PTC_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CORPORATE" maxOccurs="6" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LIST_SUPPLIER" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVELLER_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COUPON_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY_CONVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY_SELECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAX_HANDLING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRICING_OPTIONS_type", propOrder = {
    "pricingoptionid",
    "ptc",
    "farebasis",
    "farebreakpoint",
    "listfaretype",
    "ptcdiscount",
    "listcorporate",
    "travellerid",
    "couponid",
    "pos",
    "pot",
    "currencyconversion",
    "currencyselection",
    "taxhandling",
    "cff",
    "requestid"
})
public class PRICINGOPTIONSType
    implements Serializable
{

    @XmlElement(name = "PRICING_OPTION_ID")
    protected BigInteger pricingoptionid;
    @XmlElement(name = "PTC")
    protected String ptc;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "FARE_BREAKPOINT")
    protected String farebreakpoint;
    @XmlElement(name = "LIST_FARE_TYPE")
    protected List<String> listfaretype;
    @XmlElement(name = "PTC_DISCOUNT")
    protected String ptcdiscount;
    @XmlElement(name = "LIST_CORPORATE")
    protected List<PRICINGOPTIONSType.LISTCORPORATE> listcorporate;
    @XmlElement(name = "TRAVELLER_ID")
    protected String travellerid;
    @XmlElement(name = "COUPON_ID")
    protected String couponid;
    @XmlElement(name = "POS")
    protected String pos;
    @XmlElement(name = "POT")
    protected String pot;
    @XmlElement(name = "CURRENCY_CONVERSION")
    protected String currencyconversion;
    @XmlElement(name = "CURRENCY_SELECTION")
    protected String currencyselection;
    @XmlElement(name = "TAX_HANDLING")
    protected String taxhandling;
    @XmlElement(name = "CFF")
    protected String cff;
    @XmlElement(name = "REQUEST_ID")
    protected String requestid;

    /**
     * Gets the value of the pricingoptionid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRICINGOPTIONID() {
        return pricingoptionid;
    }

    /**
     * Sets the value of the pricingoptionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRICINGOPTIONID(BigInteger value) {
        this.pricingoptionid = value;
    }

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the farebasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBASIS() {
        return farebasis;
    }

    /**
     * Sets the value of the farebasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBASIS(String value) {
        this.farebasis = value;
    }

    /**
     * Gets the value of the farebreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBREAKPOINT() {
        return farebreakpoint;
    }

    /**
     * Sets the value of the farebreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBREAKPOINT(String value) {
        this.farebreakpoint = value;
    }

    /**
     * Gets the value of the listfaretype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfaretype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARETYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFARETYPE() {
        if (listfaretype == null) {
            listfaretype = new ArrayList<String>();
        }
        return this.listfaretype;
    }

    /**
     * Gets the value of the ptcdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTCDISCOUNT() {
        return ptcdiscount;
    }

    /**
     * Sets the value of the ptcdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTCDISCOUNT(String value) {
        this.ptcdiscount = value;
    }

    /**
     * Gets the value of the listcorporate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcorporate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCORPORATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRICINGOPTIONSType.LISTCORPORATE }
     * 
     * 
     */
    public List<PRICINGOPTIONSType.LISTCORPORATE> getLISTCORPORATE() {
        if (listcorporate == null) {
            listcorporate = new ArrayList<PRICINGOPTIONSType.LISTCORPORATE>();
        }
        return this.listcorporate;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERID(String value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the couponid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONID() {
        return couponid;
    }

    /**
     * Sets the value of the couponid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONID(String value) {
        this.couponid = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOS(String value) {
        this.pos = value;
    }

    /**
     * Gets the value of the pot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOT() {
        return pot;
    }

    /**
     * Sets the value of the pot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOT(String value) {
        this.pot = value;
    }

    /**
     * Gets the value of the currencyconversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYCONVERSION() {
        return currencyconversion;
    }

    /**
     * Sets the value of the currencyconversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYCONVERSION(String value) {
        this.currencyconversion = value;
    }

    /**
     * Gets the value of the currencyselection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYSELECTION() {
        return currencyselection;
    }

    /**
     * Sets the value of the currencyselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYSELECTION(String value) {
        this.currencyselection = value;
    }

    /**
     * Gets the value of the taxhandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXHANDLING() {
        return taxhandling;
    }

    /**
     * Sets the value of the taxhandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXHANDLING(String value) {
        this.taxhandling = value;
    }

    /**
     * Gets the value of the cff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFF() {
        return cff;
    }

    /**
     * Sets the value of the cff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFF(String value) {
        this.cff = value;
    }

    /**
     * Gets the value of the requestid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTID() {
        return requestid;
    }

    /**
     * Sets the value of the requestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTID(String value) {
        this.requestid = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LIST_SUPPLIER" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "code",
        "listsupplier"
    })
    public static class LISTCORPORATE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "LIST_SUPPLIER")
        protected List<String> listsupplier;

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

        /**
         * Gets the value of the listsupplier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsupplier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSUPPLIER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTSUPPLIER() {
            if (listsupplier == null) {
                listsupplier = new ArrayList<String>();
            }
            return this.listsupplier;
        }

    }

}
