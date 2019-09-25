
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilityinputtype;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.LISTREDEMPTIONOPTIONS;
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTCLID;
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTCORPORATENUMBER;
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTTRAVELLERPRICINGOPTIONSType;


/**
 * 
 * 				Contains parameters used for faring/pricing command
 * 			
 * 
 * <p>Java class for LIST_PRICING_OPTIONS_TypeFlex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PRICING_OPTIONS_TypeFlex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}RequestedFareOptionsGroupFlex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PRICING_OPTIONS_TypeFlex", propOrder = {
    "typeofcorporatefare",
    "listcorporatenumber",
    "listclid",
    "fareconversion",
    "targetpartnerflights",
    "ispricebyinput",
    "promotioncode",
    "converttomiles",
    "listredemptionoptions",
    "typeoffare",
    "listtravellerpricingoptions",
    "listdiscounts",
    "allowmultiptc",
    "ispenaltywaived",
    "forceptc",
    "pointofsale",
    "pointofticketing",
    "withholdoptiontax",
    "withholdoptionsurcharges",
    "includeobfee"
})
public class LISTPRICINGOPTIONSTypeFlex
    implements Serializable
{

    @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
    protected BigInteger typeofcorporatefare;
    @XmlElement(name = "LIST_CORPORATE_NUMBER")
    protected List<LISTCORPORATENUMBER> listcorporatenumber;
    @XmlElement(name = "LIST_CLID")
    protected List<LISTCLID> listclid;
    @XmlElement(name = "FARE_CONVERSION")
    protected String fareconversion;
    @XmlElement(name = "TARGET_PARTNER_FLIGHTS")
    protected Boolean targetpartnerflights;
    @XmlElement(name = "IS_PRICE_BY_INPUT")
    protected Boolean ispricebyinput;
    @XmlElement(name = "PROMOTION_CODE")
    protected String promotioncode;
    @XmlElement(name = "CONVERT_TO_MILES")
    protected Boolean converttomiles;
    @XmlElement(name = "LIST_REDEMPTION_OPTIONS")
    protected List<LISTREDEMPTIONOPTIONS> listredemptionoptions;
    @XmlElement(name = "TYPE_OF_FARE")
    protected BigInteger typeoffare;
    @XmlElement(name = "LIST_TRAVELLER_PRICING_OPTIONS")
    protected List<LISTTRAVELLERPRICINGOPTIONSType> listtravellerpricingoptions;
    @XmlElement(name = "LIST_DISCOUNTS")
    protected List<LISTPRICINGOPTIONSTypeFlex.LISTDISCOUNTS> listdiscounts;
    @XmlElement(name = "ALLOW_MULTI_PTC")
    protected Object allowmultiptc;
    @XmlElement(name = "IS_PENALTY_WAIVED")
    protected Object ispenaltywaived;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "POINT_OF_SALE")
    protected String pointofsale;
    @XmlElement(name = "POINT_OF_TICKETING")
    protected String pointofticketing;
    @XmlElement(name = "WITHHOLD_OPTION_TAX")
    protected Boolean withholdoptiontax;
    @XmlElement(name = "WITHHOLD_OPTION_SURCHARGES")
    protected Boolean withholdoptionsurcharges;
    @XmlElement(name = "INCLUDE_OB_FEE")
    protected Boolean includeobfee;

    /**
     * Gets the value of the typeofcorporatefare property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFCORPORATEFARE() {
        return typeofcorporatefare;
    }

    /**
     * Sets the value of the typeofcorporatefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFCORPORATEFARE(BigInteger value) {
        this.typeofcorporatefare = value;
    }

    /**
     * Gets the value of the listcorporatenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcorporatenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCORPORATENUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCORPORATENUMBER }
     * 
     * 
     */
    public List<LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
        if (listcorporatenumber == null) {
            listcorporatenumber = new ArrayList<LISTCORPORATENUMBER>();
        }
        return this.listcorporatenumber;
    }

    /**
     * Gets the value of the listclid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listclid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCLID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCLID }
     * 
     * 
     */
    public List<LISTCLID> getLISTCLID() {
        if (listclid == null) {
            listclid = new ArrayList<LISTCLID>();
        }
        return this.listclid;
    }

    /**
     * Gets the value of the fareconversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECONVERSION() {
        return fareconversion;
    }

    /**
     * Sets the value of the fareconversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECONVERSION(String value) {
        this.fareconversion = value;
    }

    /**
     * Gets the value of the targetpartnerflights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTARGETPARTNERFLIGHTS() {
        return targetpartnerflights;
    }

    /**
     * Sets the value of the targetpartnerflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTARGETPARTNERFLIGHTS(Boolean value) {
        this.targetpartnerflights = value;
    }

    /**
     * Gets the value of the ispricebyinput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPRICEBYINPUT() {
        return ispricebyinput;
    }

    /**
     * Sets the value of the ispricebyinput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPRICEBYINPUT(Boolean value) {
        this.ispricebyinput = value;
    }

    /**
     * Gets the value of the promotioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMOTIONCODE() {
        return promotioncode;
    }

    /**
     * Sets the value of the promotioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMOTIONCODE(String value) {
        this.promotioncode = value;
    }

    /**
     * Gets the value of the converttomiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCONVERTTOMILES() {
        return converttomiles;
    }

    /**
     * Sets the value of the converttomiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCONVERTTOMILES(Boolean value) {
        this.converttomiles = value;
    }

    /**
     * Gets the value of the listredemptionoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemptionoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTIONOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREDEMPTIONOPTIONS }
     * 
     * 
     */
    public List<LISTREDEMPTIONOPTIONS> getLISTREDEMPTIONOPTIONS() {
        if (listredemptionoptions == null) {
            listredemptionoptions = new ArrayList<LISTREDEMPTIONOPTIONS>();
        }
        return this.listredemptionoptions;
    }

    /**
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFFARE(BigInteger value) {
        this.typeoffare = value;
    }

    /**
     * Gets the value of the listtravellerpricingoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerpricingoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERPRICINGOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERPRICINGOPTIONSType }
     * 
     * 
     */
    public List<LISTTRAVELLERPRICINGOPTIONSType> getLISTTRAVELLERPRICINGOPTIONS() {
        if (listtravellerpricingoptions == null) {
            listtravellerpricingoptions = new ArrayList<LISTTRAVELLERPRICINGOPTIONSType>();
        }
        return this.listtravellerpricingoptions;
    }

    /**
     * Gets the value of the listdiscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONSTypeFlex.LISTDISCOUNTS }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONSTypeFlex.LISTDISCOUNTS> getLISTDISCOUNTS() {
        if (listdiscounts == null) {
            listdiscounts = new ArrayList<LISTPRICINGOPTIONSTypeFlex.LISTDISCOUNTS>();
        }
        return this.listdiscounts;
    }

    /**
     * Gets the value of the allowmultiptc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getALLOWMULTIPTC() {
        return allowmultiptc;
    }

    /**
     * Sets the value of the allowmultiptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setALLOWMULTIPTC(Object value) {
        this.allowmultiptc = value;
    }

    /**
     * Gets the value of the ispenaltywaived property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISPENALTYWAIVED() {
        return ispenaltywaived;
    }

    /**
     * Sets the value of the ispenaltywaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISPENALTYWAIVED(Object value) {
        this.ispenaltywaived = value;
    }

    /**
     * Gets the value of the forceptc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCEPTC() {
        return forceptc;
    }

    /**
     * Sets the value of the forceptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCEPTC(Boolean value) {
        this.forceptc = value;
    }

    /**
     * Gets the value of the pointofsale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOINTOFSALE() {
        return pointofsale;
    }

    /**
     * Sets the value of the pointofsale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOINTOFSALE(String value) {
        this.pointofsale = value;
    }

    /**
     * Gets the value of the pointofticketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOINTOFTICKETING() {
        return pointofticketing;
    }

    /**
     * Sets the value of the pointofticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOINTOFTICKETING(String value) {
        this.pointofticketing = value;
    }

    /**
     * Gets the value of the withholdoptiontax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWITHHOLDOPTIONTAX() {
        return withholdoptiontax;
    }

    /**
     * Sets the value of the withholdoptiontax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWITHHOLDOPTIONTAX(Boolean value) {
        this.withholdoptiontax = value;
    }

    /**
     * Gets the value of the withholdoptionsurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWITHHOLDOPTIONSURCHARGES() {
        return withholdoptionsurcharges;
    }

    /**
     * Sets the value of the withholdoptionsurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWITHHOLDOPTIONSURCHARGES(Boolean value) {
        this.withholdoptionsurcharges = value;
    }

    /**
     * Gets the value of the includeobfee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINCLUDEOBFEE() {
        return includeobfee;
    }

    /**
     * Sets the value of the includeobfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINCLUDEOBFEE(Boolean value) {
        this.includeobfee = value;
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
     *         &lt;element name="DISCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "discounttype"
    })
    public static class LISTDISCOUNTS
        implements Serializable
    {

        @XmlElement(name = "DISCOUNT_TYPE", required = true)
        protected Object discounttype;

        /**
         * Gets the value of the discounttype property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDISCOUNTTYPE() {
            return discounttype;
        }

        /**
         * Sets the value of the discounttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDISCOUNTTYPE(Object value) {
            this.discounttype = value;
        }

    }

}
