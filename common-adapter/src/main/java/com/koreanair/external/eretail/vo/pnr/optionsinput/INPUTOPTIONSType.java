
package com.koreanair.external.eretail.vo.pnr.optionsinput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INPUT_OPTIONS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INPUT_OPTIONS_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GENERAL_OPTIONS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BASKET_MODE_FLOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="FORCE_CLEAN_WHEN_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="FORCE_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="CLEAN_ERRORS_BEFORE_BOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="RESTORE_TST_WHEN_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="RETRIEVE_TST_EXTENDED_SUMMARY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="KEEP_BASKET" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="WAIVE_RT_SECURITY_CHECKS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="BOOK_AFTER_IMPORT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNR_OPTIONS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MODIFY_ASSOCIATED_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVELLER_OPTIONS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_FQTU_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_FQTR_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_NAME_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_PARTIAL_TST_UPDATE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISPLAY_CARRY_OVER_STATUS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INPUT_OPTIONS_Type", propOrder = {
    "generaloptions",
    "pnroptions",
    "travelleroptions",
    "ispartialtstupdate",
    "displaycarryoverstatus"
})
public class INPUTOPTIONSType
    implements Serializable
{

    @XmlElement(name = "GENERAL_OPTIONS")
    protected INPUTOPTIONSType.GENERALOPTIONS generaloptions;
    @XmlElement(name = "PNR_OPTIONS")
    protected INPUTOPTIONSType.PNROPTIONS pnroptions;
    @XmlElement(name = "TRAVELLER_OPTIONS")
    protected List<INPUTOPTIONSType.TRAVELLEROPTIONS> travelleroptions;
    @XmlElement(name = "IS_PARTIAL_TST_UPDATE")
    protected Boolean ispartialtstupdate;
    @XmlElement(name = "DISPLAY_CARRY_OVER_STATUS")
    protected Boolean displaycarryoverstatus;

    /**
     * Gets the value of the generaloptions property.
     * 
     * @return
     *     possible object is
     *     {@link INPUTOPTIONSType.GENERALOPTIONS }
     *     
     */
    public INPUTOPTIONSType.GENERALOPTIONS getGENERALOPTIONS() {
        return generaloptions;
    }

    /**
     * Sets the value of the generaloptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTOPTIONSType.GENERALOPTIONS }
     *     
     */
    public void setGENERALOPTIONS(INPUTOPTIONSType.GENERALOPTIONS value) {
        this.generaloptions = value;
    }

    /**
     * Gets the value of the pnroptions property.
     * 
     * @return
     *     possible object is
     *     {@link INPUTOPTIONSType.PNROPTIONS }
     *     
     */
    public INPUTOPTIONSType.PNROPTIONS getPNROPTIONS() {
        return pnroptions;
    }

    /**
     * Sets the value of the pnroptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTOPTIONSType.PNROPTIONS }
     *     
     */
    public void setPNROPTIONS(INPUTOPTIONSType.PNROPTIONS value) {
        this.pnroptions = value;
    }

    /**
     * Gets the value of the travelleroptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelleroptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLEROPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INPUTOPTIONSType.TRAVELLEROPTIONS }
     * 
     * 
     */
    public List<INPUTOPTIONSType.TRAVELLEROPTIONS> getTRAVELLEROPTIONS() {
        if (travelleroptions == null) {
            travelleroptions = new ArrayList<INPUTOPTIONSType.TRAVELLEROPTIONS>();
        }
        return this.travelleroptions;
    }

    /**
     * Gets the value of the ispartialtstupdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPARTIALTSTUPDATE() {
        return ispartialtstupdate;
    }

    /**
     * Sets the value of the ispartialtstupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPARTIALTSTUPDATE(Boolean value) {
        this.ispartialtstupdate = value;
    }

    /**
     * Gets the value of the displaycarryoverstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYCARRYOVERSTATUS() {
        return displaycarryoverstatus;
    }

    /**
     * Sets the value of the displaycarryoverstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYCARRYOVERSTATUS(Boolean value) {
        this.displaycarryoverstatus = value;
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
     *         &lt;element name="BASKET_MODE_FLOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="FORCE_CLEAN_WHEN_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="FORCE_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CLEAN_ERRORS_BEFORE_BOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="RESTORE_TST_WHEN_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="RETRIEVE_TST_EXTENDED_SUMMARY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="KEEP_BASKET" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="WAIVE_RT_SECURITY_CHECKS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="BOOK_AFTER_IMPORT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "basketmodeflow",
        "forcecleanwhenrefresh",
        "forcerefresh",
        "cleanerrorsbeforebooking",
        "restoretstwhenrefresh",
        "retrievetstextendedsummary",
        "keepbasket",
        "waivertsecuritychecks",
        "bookafterimport"
    })
    public static class GENERALOPTIONS
        implements Serializable
    {

        @XmlElement(name = "BASKET_MODE_FLOW")
        protected Boolean basketmodeflow;
        @XmlElement(name = "FORCE_CLEAN_WHEN_REFRESH")
        protected Boolean forcecleanwhenrefresh;
        @XmlElement(name = "FORCE_REFRESH")
        protected Boolean forcerefresh;
        @XmlElement(name = "CLEAN_ERRORS_BEFORE_BOOKING")
        protected Boolean cleanerrorsbeforebooking;
        @XmlElement(name = "RESTORE_TST_WHEN_REFRESH")
        protected Boolean restoretstwhenrefresh;
        @XmlElement(name = "RETRIEVE_TST_EXTENDED_SUMMARY")
        protected Boolean retrievetstextendedsummary;
        @XmlElement(name = "KEEP_BASKET")
        protected Boolean keepbasket;
        @XmlElement(name = "WAIVE_RT_SECURITY_CHECKS")
        protected Boolean waivertsecuritychecks;
        @XmlElement(name = "BOOK_AFTER_IMPORT")
        protected Boolean bookafterimport;

        /**
         * Gets the value of the basketmodeflow property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBASKETMODEFLOW() {
            return basketmodeflow;
        }

        /**
         * Sets the value of the basketmodeflow property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBASKETMODEFLOW(Boolean value) {
            this.basketmodeflow = value;
        }

        /**
         * Gets the value of the forcecleanwhenrefresh property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFORCECLEANWHENREFRESH() {
            return forcecleanwhenrefresh;
        }

        /**
         * Sets the value of the forcecleanwhenrefresh property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFORCECLEANWHENREFRESH(Boolean value) {
            this.forcecleanwhenrefresh = value;
        }

        /**
         * Gets the value of the forcerefresh property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFORCEREFRESH() {
            return forcerefresh;
        }

        /**
         * Sets the value of the forcerefresh property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFORCEREFRESH(Boolean value) {
            this.forcerefresh = value;
        }

        /**
         * Gets the value of the cleanerrorsbeforebooking property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCLEANERRORSBEFOREBOOKING() {
            return cleanerrorsbeforebooking;
        }

        /**
         * Sets the value of the cleanerrorsbeforebooking property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCLEANERRORSBEFOREBOOKING(Boolean value) {
            this.cleanerrorsbeforebooking = value;
        }

        /**
         * Gets the value of the restoretstwhenrefresh property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRESTORETSTWHENREFRESH() {
            return restoretstwhenrefresh;
        }

        /**
         * Sets the value of the restoretstwhenrefresh property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRESTORETSTWHENREFRESH(Boolean value) {
            this.restoretstwhenrefresh = value;
        }

        /**
         * Gets the value of the retrievetstextendedsummary property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRETRIEVETSTEXTENDEDSUMMARY() {
            return retrievetstextendedsummary;
        }

        /**
         * Sets the value of the retrievetstextendedsummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRETRIEVETSTEXTENDEDSUMMARY(Boolean value) {
            this.retrievetstextendedsummary = value;
        }

        /**
         * Gets the value of the keepbasket property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isKEEPBASKET() {
            return keepbasket;
        }

        /**
         * Sets the value of the keepbasket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setKEEPBASKET(Boolean value) {
            this.keepbasket = value;
        }

        /**
         * Gets the value of the waivertsecuritychecks property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWAIVERTSECURITYCHECKS() {
            return waivertsecuritychecks;
        }

        /**
         * Sets the value of the waivertsecuritychecks property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWAIVERTSECURITYCHECKS(Boolean value) {
            this.waivertsecuritychecks = value;
        }

        /**
         * Gets the value of the bookafterimport property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBOOKAFTERIMPORT() {
            return bookafterimport;
        }

        /**
         * Sets the value of the bookafterimport property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBOOKAFTERIMPORT(Boolean value) {
            this.bookafterimport = value;
        }

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
     *         &lt;element name="MODIFY_ASSOCIATED_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "modifyassociatedpnr"
    })
    public static class PNROPTIONS
        implements Serializable
    {

        @XmlElement(name = "MODIFY_ASSOCIATED_PNR")
        protected Boolean modifyassociatedpnr;

        /**
         * Gets the value of the modifyassociatedpnr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMODIFYASSOCIATEDPNR() {
            return modifyassociatedpnr;
        }

        /**
         * Sets the value of the modifyassociatedpnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMODIFYASSOCIATEDPNR(Boolean value) {
            this.modifyassociatedpnr = value;
        }

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
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="IS_FQTU_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_FQTR_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="IS_NAME_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "elementid",
        "isfqtuneeded",
        "isfqtrneeded",
        "travellerid",
        "isnamechanged"
    })
    public static class TRAVELLEROPTIONS
        implements Serializable
    {

        @XmlElement(name = "ELEMENT_ID")
        protected Object elementid;
        @XmlElement(name = "IS_FQTU_NEEDED")
        protected Boolean isfqtuneeded;
        @XmlElement(name = "IS_FQTR_NEEDED")
        protected Boolean isfqtrneeded;
        @XmlElement(name = "TRAVELLER_ID")
        protected Object travellerid;
        @XmlElement(name = "IS_NAME_CHANGED")
        protected Boolean isnamechanged;

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setELEMENTID(Object value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the isfqtuneeded property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISFQTUNEEDED() {
            return isfqtuneeded;
        }

        /**
         * Sets the value of the isfqtuneeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISFQTUNEEDED(Boolean value) {
            this.isfqtuneeded = value;
        }

        /**
         * Gets the value of the isfqtrneeded property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISFQTRNEEDED() {
            return isfqtrneeded;
        }

        /**
         * Sets the value of the isfqtrneeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISFQTRNEEDED(Boolean value) {
            this.isfqtrneeded = value;
        }

        /**
         * Gets the value of the travellerid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRAVELLERID() {
            return travellerid;
        }

        /**
         * Sets the value of the travellerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRAVELLERID(Object value) {
            this.travellerid = value;
        }

        /**
         * Gets the value of the isnamechanged property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISNAMECHANGED() {
            return isnamechanged;
        }

        /**
         * Sets the value of the isnamechanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISNAMECHANGED(Boolean value) {
            this.isnamechanged = value;
        }

    }

}
