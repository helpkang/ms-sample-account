
package com.koreanair.external.eretail.vo.tripplan.trip;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.common.common.GENERICELIBILITY;
import com.koreanair.external.eretail.vo.common.common.TRAVELAPPROVER1;
import com.koreanair.external.eretail.vo.common.common.TRIPREASON;
import com.koreanair.external.eretail.vo.common.common.VALUENAMEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.FEEType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.PriceType;
import com.koreanair.external.eretail.vo.import_git.com_amadeus_jcp_objectmodel_pnr_rebooking_waiver.waiveritem.WaiverItem;
import com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing.TaxType;


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
 *         &lt;group ref="{}CommonTrip" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listpredefinedlocation",
    "nickname",
    "listtripplanprice",
    "listhotelprice",
    "listflightprice",
    "xactivesitecode",
    "listwebfareprice",
    "retrievesitecode",
    "isalreadyindb",
    "listofflinemodification",
    "iscreatedonline",
    "eligibilityinformation",
    "permissions",
    "travelapprover",
    "booltripoutofpolicy",
    "boolpnrcreatedoutofpolicy",
    "justificationcode",
    "justificationcodedesc",
    "justificationfreetext",
    "tripreason",
    "ispasttrip",
    "isreceivedtrip",
    "isschedulechange",
    "rebooking",
    "involuntaryrebooking",
    "upgrade",
    "split",
    "webreceipt",
    "downgrade",
    "usaergoimport",
    "importedbooking",
    "booldisableemailprocess",
    "ispnrdoublebooking",
    "listspecialprograms",
    "voucher",
    "splitpricingbypaxtype",
    "boolowairdisplaytype",
    "ismultiticket",
    "refund",
    "priority",
    "listeligibilitychecksdone",
    "isgrouppnr",
    "listcorporaterecognition"
})
@XmlRootElement(name = "TRIP")
public class TRIP
    implements Serializable
{

    @XmlElement(name = "LIST_PREDEFINED_LOCATION")
    protected List<TRIP.LISTPREDEFINEDLOCATION> listpredefinedlocation;
    @XmlElement(name = "NICKNAME")
    protected String nickname;
    @XmlElement(name = "LIST_TRIP_PLAN_PRICE")
    protected List<TRIP.LISTTRIPPLANPRICE> listtripplanprice;
    @XmlElement(name = "LIST_HOTEL_PRICE")
    protected List<TRIP.LISTHOTELPRICE> listhotelprice;
    @XmlElement(name = "LIST_FLIGHT_PRICE")
    protected List<TRIP.LISTFLIGHTPRICE> listflightprice;
    @XmlElement(name = "X_ACTIVE_SITE_CODE")
    protected String xactivesitecode;
    @XmlElement(name = "LIST_WEB_FARE_PRICE")
    protected List<TRIP.LISTWEBFAREPRICE> listwebfareprice;
    @XmlElement(name = "RETRIEVE_SITE_CODE")
    protected String retrievesitecode;
    @XmlElement(name = "IS_ALREADY_IN_DB")
    protected Boolean isalreadyindb;
    @XmlElement(name = "LIST_OFFLINE_MODIFICATION")
    protected List<TRIP.LISTOFFLINEMODIFICATION> listofflinemodification;
    @XmlElement(name = "IS_CREATED_ONLINE")
    protected Boolean iscreatedonline;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected TRIP.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PERMISSIONS")
    protected TRIP.PERMISSIONS permissions;
    @XmlElement(name = "TRAVEL_APPROVER")
    protected TRAVELAPPROVER1 travelapprover;
    @XmlElement(name = "BOOL_TRIP_OUT_OF_POLICY")
    protected Boolean booltripoutofpolicy;
    @XmlElement(name = "BOOL_PNR_CREATED_OUT_OF_POLICY")
    protected Boolean boolpnrcreatedoutofpolicy;
    @XmlElement(name = "JUSTIFICATION_CODE")
    protected String justificationcode;
    @XmlElement(name = "JUSTIFICATION_CODE_DESC")
    protected String justificationcodedesc;
    @XmlElement(name = "JUSTIFICATION_FREE_TEXT")
    protected String justificationfreetext;
    @XmlElement(name = "TRIP_REASON")
    protected TRIPREASON tripreason;
    @XmlElement(name = "IS_PAST_TRIP")
    protected Boolean ispasttrip;
    @XmlElement(name = "IS_RECEIVED_TRIP")
    protected Boolean isreceivedtrip;
    @XmlElement(name = "IS_SCHEDULE_CHANGE")
    protected Boolean isschedulechange;
    @XmlElement(name = "REBOOKING")
    protected TRIP.REBOOKING rebooking;
    @XmlElement(name = "INVOLUNTARY_REBOOKING")
    protected TRIP.INVOLUNTARYREBOOKING involuntaryrebooking;
    @XmlElement(name = "UPGRADE")
    protected TRIP.UPGRADE upgrade;
    @XmlElement(name = "SPLIT")
    protected GENERICELIBILITY split;
    @XmlElement(name = "WEB_RECEIPT")
    protected GENERICELIBILITY webreceipt;
    @XmlElement(name = "DOWNGRADE")
    protected GENERICELIBILITY downgrade;
    @XmlElement(name = "US_AERGO_IMPORT")
    protected String usaergoimport;
    @XmlElement(name = "IMPORTED_BOOKING")
    protected Boolean importedbooking;
    @XmlElement(name = "BOOL_DISABLE_EMAIL_PROCESS")
    protected Boolean booldisableemailprocess;
    @XmlElement(name = "IS_PNR_DOUBLE_BOOKING")
    protected Boolean ispnrdoublebooking;
    @XmlElement(name = "LIST_SPECIAL_PROGRAMS")
    protected TRIP.LISTSPECIALPROGRAMS listspecialprograms;
    @XmlElement(name = "VOUCHER")
    protected TRIP.VOUCHER voucher;
    @XmlElement(name = "SPLIT_PRICING_BY_PAX_TYPE")
    protected Boolean splitpricingbypaxtype;
    @XmlElement(name = "BOOL_OW_AIR_DISPLAY_TYPE")
    protected Boolean boolowairdisplaytype;
    @XmlElement(name = "IS_MULTI_TICKET")
    protected Boolean ismultiticket;
    @XmlElement(name = "REFUND")
    protected TRIP.REFUND refund;
    @XmlElement(name = "PRIORITY")
    protected TRIP.PRIORITY priority;
    @XmlElement(name = "LIST_ELIGIBILITY_CHECKS_DONE")
    protected List<TRIP.LISTELIGIBILITYCHECKSDONE> listeligibilitychecksdone;
    @XmlElement(name = "IS_GROUP_PNR")
    protected Boolean isgrouppnr;
    @XmlElement(name = "LIST_CORPORATE_RECOGNITION")
    protected List<TRIP.LISTCORPORATERECOGNITION> listcorporaterecognition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the listpredefinedlocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpredefinedlocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPREDEFINEDLOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTPREDEFINEDLOCATION }
     * 
     * 
     */
    public List<TRIP.LISTPREDEFINEDLOCATION> getLISTPREDEFINEDLOCATION() {
        if (listpredefinedlocation == null) {
            listpredefinedlocation = new ArrayList<TRIP.LISTPREDEFINEDLOCATION>();
        }
        return this.listpredefinedlocation;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICKNAME() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICKNAME(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the listtripplanprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripplanprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPPLANPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTTRIPPLANPRICE }
     * 
     * 
     */
    public List<TRIP.LISTTRIPPLANPRICE> getLISTTRIPPLANPRICE() {
        if (listtripplanprice == null) {
            listtripplanprice = new ArrayList<TRIP.LISTTRIPPLANPRICE>();
        }
        return this.listtripplanprice;
    }

    /**
     * Gets the value of the listhotelprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listhotelprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTHOTELPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTHOTELPRICE }
     * 
     * 
     */
    public List<TRIP.LISTHOTELPRICE> getLISTHOTELPRICE() {
        if (listhotelprice == null) {
            listhotelprice = new ArrayList<TRIP.LISTHOTELPRICE>();
        }
        return this.listhotelprice;
    }

    /**
     * Gets the value of the listflightprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTFLIGHTPRICE }
     * 
     * 
     */
    public List<TRIP.LISTFLIGHTPRICE> getLISTFLIGHTPRICE() {
        if (listflightprice == null) {
            listflightprice = new ArrayList<TRIP.LISTFLIGHTPRICE>();
        }
        return this.listflightprice;
    }

    /**
     * Gets the value of the xactivesitecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXACTIVESITECODE() {
        return xactivesitecode;
    }

    /**
     * Sets the value of the xactivesitecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXACTIVESITECODE(String value) {
        this.xactivesitecode = value;
    }

    /**
     * Gets the value of the listwebfareprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listwebfareprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTWEBFAREPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTWEBFAREPRICE }
     * 
     * 
     */
    public List<TRIP.LISTWEBFAREPRICE> getLISTWEBFAREPRICE() {
        if (listwebfareprice == null) {
            listwebfareprice = new ArrayList<TRIP.LISTWEBFAREPRICE>();
        }
        return this.listwebfareprice;
    }

    /**
     * Gets the value of the retrievesitecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETRIEVESITECODE() {
        return retrievesitecode;
    }

    /**
     * Sets the value of the retrievesitecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETRIEVESITECODE(String value) {
        this.retrievesitecode = value;
    }

    /**
     * Gets the value of the isalreadyindb property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISALREADYINDB() {
        return isalreadyindb;
    }

    /**
     * Sets the value of the isalreadyindb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISALREADYINDB(Boolean value) {
        this.isalreadyindb = value;
    }

    /**
     * Gets the value of the listofflinemodification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listofflinemodification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOFFLINEMODIFICATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTOFFLINEMODIFICATION }
     * 
     * 
     */
    public List<TRIP.LISTOFFLINEMODIFICATION> getLISTOFFLINEMODIFICATION() {
        if (listofflinemodification == null) {
            listofflinemodification = new ArrayList<TRIP.LISTOFFLINEMODIFICATION>();
        }
        return this.listofflinemodification;
    }

    /**
     * Gets the value of the iscreatedonline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISCREATEDONLINE() {
        return iscreatedonline;
    }

    /**
     * Sets the value of the iscreatedonline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISCREATEDONLINE(Boolean value) {
        this.iscreatedonline = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.ELIGIBILITYINFORMATION }
     *     
     */
    public TRIP.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(TRIP.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.PERMISSIONS }
     *     
     */
    public TRIP.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(TRIP.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the travelapprover property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELAPPROVER1 }
     *     
     */
    public TRAVELAPPROVER1 getTRAVELAPPROVER() {
        return travelapprover;
    }

    /**
     * Sets the value of the travelapprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELAPPROVER1 }
     *     
     */
    public void setTRAVELAPPROVER(TRAVELAPPROVER1 value) {
        this.travelapprover = value;
    }

    /**
     * Gets the value of the booltripoutofpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLTRIPOUTOFPOLICY() {
        return booltripoutofpolicy;
    }

    /**
     * Sets the value of the booltripoutofpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLTRIPOUTOFPOLICY(Boolean value) {
        this.booltripoutofpolicy = value;
    }

    /**
     * Gets the value of the boolpnrcreatedoutofpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPNRCREATEDOUTOFPOLICY() {
        return boolpnrcreatedoutofpolicy;
    }

    /**
     * Sets the value of the boolpnrcreatedoutofpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPNRCREATEDOUTOFPOLICY(Boolean value) {
        this.boolpnrcreatedoutofpolicy = value;
    }

    /**
     * Gets the value of the justificationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJUSTIFICATIONCODE() {
        return justificationcode;
    }

    /**
     * Sets the value of the justificationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJUSTIFICATIONCODE(String value) {
        this.justificationcode = value;
    }

    /**
     * Gets the value of the justificationcodedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJUSTIFICATIONCODEDESC() {
        return justificationcodedesc;
    }

    /**
     * Sets the value of the justificationcodedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJUSTIFICATIONCODEDESC(String value) {
        this.justificationcodedesc = value;
    }

    /**
     * Gets the value of the justificationfreetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJUSTIFICATIONFREETEXT() {
        return justificationfreetext;
    }

    /**
     * Sets the value of the justificationfreetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJUSTIFICATIONFREETEXT(String value) {
        this.justificationfreetext = value;
    }

    /**
     * Gets the value of the tripreason property.
     * 
     * @return
     *     possible object is
     *     {@link TRIPREASON }
     *     
     */
    public TRIPREASON getTRIPREASON() {
        return tripreason;
    }

    /**
     * Sets the value of the tripreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPREASON }
     *     
     */
    public void setTRIPREASON(TRIPREASON value) {
        this.tripreason = value;
    }

    /**
     * Gets the value of the ispasttrip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPASTTRIP() {
        return ispasttrip;
    }

    /**
     * Sets the value of the ispasttrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPASTTRIP(Boolean value) {
        this.ispasttrip = value;
    }

    /**
     * Gets the value of the isreceivedtrip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISRECEIVEDTRIP() {
        return isreceivedtrip;
    }

    /**
     * Sets the value of the isreceivedtrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISRECEIVEDTRIP(Boolean value) {
        this.isreceivedtrip = value;
    }

    /**
     * Gets the value of the isschedulechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSCHEDULECHANGE() {
        return isschedulechange;
    }

    /**
     * Sets the value of the isschedulechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSCHEDULECHANGE(Boolean value) {
        this.isschedulechange = value;
    }

    /**
     * Gets the value of the rebooking property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.REBOOKING }
     *     
     */
    public TRIP.REBOOKING getREBOOKING() {
        return rebooking;
    }

    /**
     * Sets the value of the rebooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.REBOOKING }
     *     
     */
    public void setREBOOKING(TRIP.REBOOKING value) {
        this.rebooking = value;
    }

    /**
     * Gets the value of the involuntaryrebooking property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.INVOLUNTARYREBOOKING }
     *     
     */
    public TRIP.INVOLUNTARYREBOOKING getINVOLUNTARYREBOOKING() {
        return involuntaryrebooking;
    }

    /**
     * Sets the value of the involuntaryrebooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.INVOLUNTARYREBOOKING }
     *     
     */
    public void setINVOLUNTARYREBOOKING(TRIP.INVOLUNTARYREBOOKING value) {
        this.involuntaryrebooking = value;
    }

    /**
     * Gets the value of the upgrade property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.UPGRADE }
     *     
     */
    public TRIP.UPGRADE getUPGRADE() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.UPGRADE }
     *     
     */
    public void setUPGRADE(TRIP.UPGRADE value) {
        this.upgrade = value;
    }

    /**
     * Gets the value of the split property.
     * 
     * @return
     *     possible object is
     *     {@link GENERICELIBILITY }
     *     
     */
    public GENERICELIBILITY getSPLIT() {
        return split;
    }

    /**
     * Sets the value of the split property.
     * 
     * @param value
     *     allowed object is
     *     {@link GENERICELIBILITY }
     *     
     */
    public void setSPLIT(GENERICELIBILITY value) {
        this.split = value;
    }

    /**
     * Gets the value of the webreceipt property.
     * 
     * @return
     *     possible object is
     *     {@link GENERICELIBILITY }
     *     
     */
    public GENERICELIBILITY getWEBRECEIPT() {
        return webreceipt;
    }

    /**
     * Sets the value of the webreceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GENERICELIBILITY }
     *     
     */
    public void setWEBRECEIPT(GENERICELIBILITY value) {
        this.webreceipt = value;
    }

    /**
     * Gets the value of the downgrade property.
     * 
     * @return
     *     possible object is
     *     {@link GENERICELIBILITY }
     *     
     */
    public GENERICELIBILITY getDOWNGRADE() {
        return downgrade;
    }

    /**
     * Sets the value of the downgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link GENERICELIBILITY }
     *     
     */
    public void setDOWNGRADE(GENERICELIBILITY value) {
        this.downgrade = value;
    }

    /**
     * Gets the value of the usaergoimport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSAERGOIMPORT() {
        return usaergoimport;
    }

    /**
     * Sets the value of the usaergoimport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSAERGOIMPORT(String value) {
        this.usaergoimport = value;
    }

    /**
     * Gets the value of the importedbooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPORTEDBOOKING() {
        return importedbooking;
    }

    /**
     * Sets the value of the importedbooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPORTEDBOOKING(Boolean value) {
        this.importedbooking = value;
    }

    /**
     * Gets the value of the booldisableemailprocess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDISABLEEMAILPROCESS() {
        return booldisableemailprocess;
    }

    /**
     * Sets the value of the booldisableemailprocess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDISABLEEMAILPROCESS(Boolean value) {
        this.booldisableemailprocess = value;
    }

    /**
     * Gets the value of the ispnrdoublebooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPNRDOUBLEBOOKING() {
        return ispnrdoublebooking;
    }

    /**
     * Sets the value of the ispnrdoublebooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPNRDOUBLEBOOKING(Boolean value) {
        this.ispnrdoublebooking = value;
    }

    /**
     * Gets the value of the listspecialprograms property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.LISTSPECIALPROGRAMS }
     *     
     */
    public TRIP.LISTSPECIALPROGRAMS getLISTSPECIALPROGRAMS() {
        return listspecialprograms;
    }

    /**
     * Sets the value of the listspecialprograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.LISTSPECIALPROGRAMS }
     *     
     */
    public void setLISTSPECIALPROGRAMS(TRIP.LISTSPECIALPROGRAMS value) {
        this.listspecialprograms = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.VOUCHER }
     *     
     */
    public TRIP.VOUCHER getVOUCHER() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.VOUCHER }
     *     
     */
    public void setVOUCHER(TRIP.VOUCHER value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the splitpricingbypaxtype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSPLITPRICINGBYPAXTYPE() {
        return splitpricingbypaxtype;
    }

    /**
     * Sets the value of the splitpricingbypaxtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSPLITPRICINGBYPAXTYPE(Boolean value) {
        this.splitpricingbypaxtype = value;
    }

    /**
     * Gets the value of the boolowairdisplaytype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLOWAIRDISPLAYTYPE() {
        return boolowairdisplaytype;
    }

    /**
     * Sets the value of the boolowairdisplaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLOWAIRDISPLAYTYPE(Boolean value) {
        this.boolowairdisplaytype = value;
    }

    /**
     * Gets the value of the ismultiticket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISMULTITICKET() {
        return ismultiticket;
    }

    /**
     * Sets the value of the ismultiticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISMULTITICKET(Boolean value) {
        this.ismultiticket = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.REFUND }
     *     
     */
    public TRIP.REFUND getREFUND() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.REFUND }
     *     
     */
    public void setREFUND(TRIP.REFUND value) {
        this.refund = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP.PRIORITY }
     *     
     */
    public TRIP.PRIORITY getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP.PRIORITY }
     *     
     */
    public void setPRIORITY(TRIP.PRIORITY value) {
        this.priority = value;
    }

    /**
     * Gets the value of the listeligibilitychecksdone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeligibilitychecksdone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELIGIBILITYCHECKSDONE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTELIGIBILITYCHECKSDONE }
     * 
     * 
     */
    public List<TRIP.LISTELIGIBILITYCHECKSDONE> getLISTELIGIBILITYCHECKSDONE() {
        if (listeligibilitychecksdone == null) {
            listeligibilitychecksdone = new ArrayList<TRIP.LISTELIGIBILITYCHECKSDONE>();
        }
        return this.listeligibilitychecksdone;
    }

    /**
     * Gets the value of the isgrouppnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISGROUPPNR() {
        return isgrouppnr;
    }

    /**
     * Sets the value of the isgrouppnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISGROUPPNR(Boolean value) {
        this.isgrouppnr = value;
    }

    /**
     * Gets the value of the listcorporaterecognition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcorporaterecognition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCORPORATERECOGNITION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIP.LISTCORPORATERECOGNITION }
     * 
     * 
     */
    public List<TRIP.LISTCORPORATERECOGNITION> getLISTCORPORATERECOGNITION() {
        if (listcorporaterecognition == null) {
            listcorporaterecognition = new ArrayList<TRIP.LISTCORPORATERECOGNITION>();
        }
        return this.listcorporaterecognition;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="IS_ELIGIBLE_FOR_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_ELIGIBLE_FOR_REBOOK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "iseligibleforupgrade",
        "iseligibleforrebook"
    })
    public static class ELIGIBILITYINFORMATION
        implements Serializable
    {

        @XmlElement(name = "IS_ELIGIBLE_FOR_UPGRADE")
        protected Boolean iseligibleforupgrade;
        @XmlElement(name = "IS_ELIGIBLE_FOR_REBOOK")
        protected Boolean iseligibleforrebook;

        /**
         * Gets the value of the iseligibleforupgrade property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISELIGIBLEFORUPGRADE() {
            return iseligibleforupgrade;
        }

        /**
         * Sets the value of the iseligibleforupgrade property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISELIGIBLEFORUPGRADE(Boolean value) {
            this.iseligibleforupgrade = value;
        }

        /**
         * Gets the value of the iseligibleforrebook property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISELIGIBLEFORREBOOK() {
            return iseligibleforrebook;
        }

        /**
         * Sets the value of the iseligibleforrebook property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISELIGIBLEFORREBOOK(Boolean value) {
            this.iseligibleforrebook = value;
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
     *         &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_DISRUPTION_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="IS_DISRUPTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DISRUPTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "eligibletorebooking",
        "noneligibilityreason",
        "listdisruptionbound"
    })
    public static class INVOLUNTARYREBOOKING
        implements Serializable
    {

        @XmlElement(name = "ELIGIBLE_TO_REBOOKING")
        protected boolean eligibletorebooking;
        @XmlElement(name = "NON_ELIGIBILITY_REASON")
        protected String noneligibilityreason;
        @XmlElement(name = "LIST_DISRUPTION_BOUND")
        protected List<TRIP.INVOLUNTARYREBOOKING.LISTDISRUPTIONBOUND> listdisruptionbound;

        /**
         * Gets the value of the eligibletorebooking property.
         * 
         */
        public boolean isELIGIBLETOREBOOKING() {
            return eligibletorebooking;
        }

        /**
         * Sets the value of the eligibletorebooking property.
         * 
         */
        public void setELIGIBLETOREBOOKING(boolean value) {
            this.eligibletorebooking = value;
        }

        /**
         * Gets the value of the noneligibilityreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNONELIGIBILITYREASON() {
            return noneligibilityreason;
        }

        /**
         * Sets the value of the noneligibilityreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNONELIGIBILITYREASON(String value) {
            this.noneligibilityreason = value;
        }

        /**
         * Gets the value of the listdisruptionbound property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdisruptionbound property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDISRUPTIONBOUND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.INVOLUNTARYREBOOKING.LISTDISRUPTIONBOUND }
         * 
         * 
         */
        public List<TRIP.INVOLUNTARYREBOOKING.LISTDISRUPTIONBOUND> getLISTDISRUPTIONBOUND() {
            if (listdisruptionbound == null) {
                listdisruptionbound = new ArrayList<TRIP.INVOLUNTARYREBOOKING.LISTDISRUPTIONBOUND>();
            }
            return this.listdisruptionbound;
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
         *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="IS_DISRUPTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DISRUPTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "itemid",
            "isdisrupted",
            "eligibletorebooking",
            "noneligibilityreason",
            "disruptiontype"
        })
        public static class LISTDISRUPTIONBOUND
            implements Serializable
        {

            @XmlElement(name = "ITEM_ID", required = true)
            protected String itemid;
            @XmlElement(name = "IS_DISRUPTED")
            protected boolean isdisrupted;
            @XmlElement(name = "ELIGIBLE_TO_REBOOKING")
            protected boolean eligibletorebooking;
            @XmlElement(name = "NON_ELIGIBILITY_REASON")
            protected String noneligibilityreason;
            @XmlElement(name = "DISRUPTION_TYPE")
            protected Object disruptiontype;

            /**
             * Gets the value of the itemid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITEMID() {
                return itemid;
            }

            /**
             * Sets the value of the itemid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITEMID(String value) {
                this.itemid = value;
            }

            /**
             * Gets the value of the isdisrupted property.
             * 
             */
            public boolean isISDISRUPTED() {
                return isdisrupted;
            }

            /**
             * Sets the value of the isdisrupted property.
             * 
             */
            public void setISDISRUPTED(boolean value) {
                this.isdisrupted = value;
            }

            /**
             * Gets the value of the eligibletorebooking property.
             * 
             */
            public boolean isELIGIBLETOREBOOKING() {
                return eligibletorebooking;
            }

            /**
             * Sets the value of the eligibletorebooking property.
             * 
             */
            public void setELIGIBLETOREBOOKING(boolean value) {
                this.eligibletorebooking = value;
            }

            /**
             * Gets the value of the noneligibilityreason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNONELIGIBILITYREASON() {
                return noneligibilityreason;
            }

            /**
             * Sets the value of the noneligibilityreason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNONELIGIBILITYREASON(String value) {
                this.noneligibilityreason = value;
            }

            /**
             * Gets the value of the disruptiontype property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDISRUPTIONTYPE() {
                return disruptiontype;
            }

            /**
             * Sets the value of the disruptiontype property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDISRUPTIONTYPE(Object value) {
                this.disruptiontype = value;
            }

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
     *         &lt;element name="AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CORPORATE_TIER_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE_CUSTOMER_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CORPORATE_PRIORITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "airlinecode",
        "identifier",
        "corporatetierlevel",
        "airlinecustomervalue",
        "corporateprioritycode"
    })
    public static class LISTCORPORATERECOGNITION
        implements Serializable
    {

        @XmlElement(name = "AIRLINE_CODE", required = true)
        protected String airlinecode;
        @XmlElement(name = "IDENTIFIER", required = true)
        protected String identifier;
        @XmlElement(name = "CORPORATE_TIER_LEVEL")
        protected String corporatetierlevel;
        @XmlElement(name = "AIRLINE_CUSTOMER_VALUE")
        protected String airlinecustomervalue;
        @XmlElement(name = "CORPORATE_PRIORITY_CODE")
        protected String corporateprioritycode;

        /**
         * Gets the value of the airlinecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRLINECODE() {
            return airlinecode;
        }

        /**
         * Sets the value of the airlinecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRLINECODE(String value) {
            this.airlinecode = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDENTIFIER() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDENTIFIER(String value) {
            this.identifier = value;
        }

        /**
         * Gets the value of the corporatetierlevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCORPORATETIERLEVEL() {
            return corporatetierlevel;
        }

        /**
         * Sets the value of the corporatetierlevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCORPORATETIERLEVEL(String value) {
            this.corporatetierlevel = value;
        }

        /**
         * Gets the value of the airlinecustomervalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRLINECUSTOMERVALUE() {
            return airlinecustomervalue;
        }

        /**
         * Sets the value of the airlinecustomervalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRLINECUSTOMERVALUE(String value) {
            this.airlinecustomervalue = value;
        }

        /**
         * Gets the value of the corporateprioritycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCORPORATEPRIORITYCODE() {
            return corporateprioritycode;
        }

        /**
         * Sets the value of the corporateprioritycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCORPORATEPRIORITYCODE(String value) {
            this.corporateprioritycode = value;
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
     *         &lt;element name="CHECK" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="EXCHANGE"/&gt;
     *               &lt;enumeration value="REFUND"/&gt;
     *               &lt;enumeration value="UPDATE"/&gt;
     *               &lt;enumeration value="AWARD"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
        "check"
    })
    public static class LISTELIGIBILITYCHECKSDONE
        implements Serializable
    {

        @XmlElement(name = "CHECK")
        protected String check;

        /**
         * Gets the value of the check property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECK() {
            return check;
        }

        /**
         * Sets the value of the check property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECK(String value) {
            this.check = value;
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
     *       &lt;group ref="{}PriceWithFeesGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount",
        "currency",
        "servicefeeamount",
        "listfee",
        "totalamount"
    })
    public static class LISTFLIGHTPRICE
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "SERVICE_FEE_AMOUNT")
        protected BigDecimal servicefeeamount;
        @XmlElement(name = "LIST_FEE")
        protected List<FEEType> listfee;
        @XmlElement(name = "TOTAL_AMOUNT", required = true)
        protected BigDecimal totalamount;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the servicefeeamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSERVICEFEEAMOUNT() {
            return servicefeeamount;
        }

        /**
         * Sets the value of the servicefeeamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSERVICEFEEAMOUNT(BigDecimal value) {
            this.servicefeeamount = value;
        }

        /**
         * Gets the value of the listfee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFEE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FEEType }
         * 
         * 
         */
        public List<FEEType> getLISTFEE() {
            if (listfee == null) {
                listfee = new ArrayList<FEEType>();
            }
            return this.listfee;
        }

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALAMOUNT(BigDecimal value) {
            this.totalamount = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="LIST_TOTAL_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="LIST_PRICE" type="{}PriceType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "type",
        "listtotalprice"
    })
    public static class LISTHOTELPRICE
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected Object type;
        @XmlElement(name = "LIST_TOTAL_PRICE")
        protected List<TRIP.LISTHOTELPRICE.LISTTOTALPRICE> listtotalprice;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the listtotalprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtotalprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTOTALPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.LISTHOTELPRICE.LISTTOTALPRICE }
         * 
         * 
         */
        public List<TRIP.LISTHOTELPRICE.LISTTOTALPRICE> getLISTTOTALPRICE() {
            if (listtotalprice == null) {
                listtotalprice = new ArrayList<TRIP.LISTHOTELPRICE.LISTTOTALPRICE>();
            }
            return this.listtotalprice;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="LIST_PRICE" type="{}PriceType" maxOccurs="unbounded"/&gt;
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
            "type",
            "listprice"
        })
        public static class LISTTOTALPRICE
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected Object type;
            @XmlElement(name = "LIST_PRICE", required = true)
            protected List<PriceType> listprice;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTYPE(Object value) {
                this.type = value;
            }

            /**
             * Gets the value of the listprice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listprice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPRICE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PriceType }
             * 
             * 
             */
            public List<PriceType> getLISTPRICE() {
                if (listprice == null) {
                    listprice = new ArrayList<PriceType>();
                }
                return this.listprice;
            }

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
     *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_RBD_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DEPARTURE_HAS_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ARRIVAL_HAS_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ARRIVAL_DATE_HAS_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DEPARTURE_DATE_HAS_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="FLIGHT_NUMBER_HAS_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DIFFERENT_NUMBER_SEGMENTS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="UNKNOWN_EXCEPTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "date",
        "code",
        "type",
        "elementid",
        "isrbdchange",
        "departurehaschanged",
        "arrivalhaschanged",
        "arrivaldatehaschanged",
        "departuredatehaschanged",
        "flightnumberhaschanged",
        "differentnumbersegments",
        "unknownexception"
    })
    public static class LISTOFFLINEMODIFICATION
        implements Serializable
    {

        @XmlElement(name = "DATE")
        protected String date;
        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "ELEMENT_ID")
        protected String elementid;
        @XmlElement(name = "IS_RBD_CHANGE")
        protected Boolean isrbdchange;
        @XmlElement(name = "DEPARTURE_HAS_CHANGED")
        protected Boolean departurehaschanged;
        @XmlElement(name = "ARRIVAL_HAS_CHANGED")
        protected Boolean arrivalhaschanged;
        @XmlElement(name = "ARRIVAL_DATE_HAS_CHANGED")
        protected Boolean arrivaldatehaschanged;
        @XmlElement(name = "DEPARTURE_DATE_HAS_CHANGED")
        protected Boolean departuredatehaschanged;
        @XmlElement(name = "FLIGHT_NUMBER_HAS_CHANGED")
        protected Boolean flightnumberhaschanged;
        @XmlElement(name = "DIFFERENT_NUMBER_SEGMENTS")
        protected Boolean differentnumbersegments;
        @XmlElement(name = "UNKNOWN_EXCEPTION")
        protected Boolean unknownexception;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATE(String value) {
            this.date = value;
        }

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setELEMENTID(String value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the isrbdchange property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISRBDCHANGE() {
            return isrbdchange;
        }

        /**
         * Sets the value of the isrbdchange property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISRBDCHANGE(Boolean value) {
            this.isrbdchange = value;
        }

        /**
         * Gets the value of the departurehaschanged property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDEPARTUREHASCHANGED() {
            return departurehaschanged;
        }

        /**
         * Sets the value of the departurehaschanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDEPARTUREHASCHANGED(Boolean value) {
            this.departurehaschanged = value;
        }

        /**
         * Gets the value of the arrivalhaschanged property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isARRIVALHASCHANGED() {
            return arrivalhaschanged;
        }

        /**
         * Sets the value of the arrivalhaschanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setARRIVALHASCHANGED(Boolean value) {
            this.arrivalhaschanged = value;
        }

        /**
         * Gets the value of the arrivaldatehaschanged property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isARRIVALDATEHASCHANGED() {
            return arrivaldatehaschanged;
        }

        /**
         * Sets the value of the arrivaldatehaschanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setARRIVALDATEHASCHANGED(Boolean value) {
            this.arrivaldatehaschanged = value;
        }

        /**
         * Gets the value of the departuredatehaschanged property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDEPARTUREDATEHASCHANGED() {
            return departuredatehaschanged;
        }

        /**
         * Sets the value of the departuredatehaschanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDEPARTUREDATEHASCHANGED(Boolean value) {
            this.departuredatehaschanged = value;
        }

        /**
         * Gets the value of the flightnumberhaschanged property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFLIGHTNUMBERHASCHANGED() {
            return flightnumberhaschanged;
        }

        /**
         * Sets the value of the flightnumberhaschanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFLIGHTNUMBERHASCHANGED(Boolean value) {
            this.flightnumberhaschanged = value;
        }

        /**
         * Gets the value of the differentnumbersegments property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDIFFERENTNUMBERSEGMENTS() {
            return differentnumbersegments;
        }

        /**
         * Sets the value of the differentnumbersegments property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDIFFERENTNUMBERSEGMENTS(Boolean value) {
            this.differentnumbersegments = value;
        }

        /**
         * Gets the value of the unknownexception property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUNKNOWNEXCEPTION() {
            return unknownexception;
        }

        /**
         * Sets the value of the unknownexception property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUNKNOWNEXCEPTION(Boolean value) {
            this.unknownexception = value;
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
     *         &lt;element name="PREDEFINED_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="BOUND" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "predefinedid",
        "elementid",
        "type",
        "bound"
    })
    public static class LISTPREDEFINEDLOCATION
        implements Serializable
    {

        @XmlElement(name = "PREDEFINED_ID", required = true)
        protected String predefinedid;
        @XmlElement(name = "ELEMENT_ID", required = true)
        protected BigInteger elementid;
        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "BOUND", required = true)
        protected String bound;

        /**
         * Gets the value of the predefinedid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPREDEFINEDID() {
            return predefinedid;
        }

        /**
         * Sets the value of the predefinedid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPREDEFINEDID(String value) {
            this.predefinedid = value;
        }

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setELEMENTID(BigInteger value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the bound property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOUND() {
            return bound;
        }

        /**
         * Sets the value of the bound property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOUND(String value) {
            this.bound = value;
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
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IMAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LOGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "name",
        "image",
        "code",
        "logo"
    })
    public static class LISTSPECIALPROGRAMS
        implements Serializable
    {

        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "IMAGE")
        protected String image;
        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "LOGO")
        protected String logo;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the image property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMAGE() {
            return image;
        }

        /**
         * Sets the value of the image property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMAGE(String value) {
            this.image = value;
        }

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
         * Gets the value of the logo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOGO() {
            return logo;
        }

        /**
         * Sets the value of the logo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOGO(String value) {
            this.logo = value;
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
     *         &lt;element ref="{}AMOUNT" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
     *         &lt;element name="SERVICE_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element ref="{}LIST_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{}TOTAL_AMOUNT" minOccurs="0"/&gt;
     *         &lt;element name="AWARD_PRICE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IS_FLY_SMART" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="PRICE_FOR_ALL_PAX_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="PRICE_FOR_ALL_PAX_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_PRICE_PER_TYPE_OF_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="PRICE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="PRICE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_PRICE_PER_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DCC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_REBOOK_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "amount",
        "currency",
        "servicefeeamount",
        "listfee",
        "totalamount",
        "awardprice",
        "exchangerate",
        "dccid",
        "totalrebookbalance"
    })
    public static class LISTTRIPPLANPRICE
        implements Serializable
    {

        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;
        @XmlElement(name = "SERVICE_FEE_AMOUNT")
        protected BigDecimal servicefeeamount;
        @XmlElement(name = "LIST_FEE")
        protected List<FEEType> listfee;
        @XmlElement(name = "TOTAL_AMOUNT")
        protected BigDecimal totalamount;
        @XmlElement(name = "AWARD_PRICE")
        protected TRIP.LISTTRIPPLANPRICE.AWARDPRICE awardprice;
        @XmlElement(name = "EXCHANGE_RATE")
        protected String exchangerate;
        @XmlElement(name = "DCC_ID")
        protected String dccid;
        @XmlElement(name = "TOTAL_REBOOK_BALANCE")
        protected BigDecimal totalrebookbalance;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the servicefeeamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSERVICEFEEAMOUNT() {
            return servicefeeamount;
        }

        /**
         * Sets the value of the servicefeeamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSERVICEFEEAMOUNT(BigDecimal value) {
            this.servicefeeamount = value;
        }

        /**
         * Gets the value of the listfee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFEE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FEEType }
         * 
         * 
         */
        public List<FEEType> getLISTFEE() {
            if (listfee == null) {
                listfee = new ArrayList<FEEType>();
            }
            return this.listfee;
        }

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALAMOUNT(BigDecimal value) {
            this.totalamount = value;
        }

        /**
         * Gets the value of the awardprice property.
         * 
         * @return
         *     possible object is
         *     {@link TRIP.LISTTRIPPLANPRICE.AWARDPRICE }
         *     
         */
        public TRIP.LISTTRIPPLANPRICE.AWARDPRICE getAWARDPRICE() {
            return awardprice;
        }

        /**
         * Sets the value of the awardprice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRIP.LISTTRIPPLANPRICE.AWARDPRICE }
         *     
         */
        public void setAWARDPRICE(TRIP.LISTTRIPPLANPRICE.AWARDPRICE value) {
            this.awardprice = value;
        }

        /**
         * Gets the value of the exchangerate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEXCHANGERATE() {
            return exchangerate;
        }

        /**
         * Sets the value of the exchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEXCHANGERATE(String value) {
            this.exchangerate = value;
        }

        /**
         * Gets the value of the dccid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCCID() {
            return dccid;
        }

        /**
         * Sets the value of the dccid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCCID(String value) {
            this.dccid = value;
        }

        /**
         * Gets the value of the totalrebookbalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALREBOOKBALANCE() {
            return totalrebookbalance;
        }

        /**
         * Sets the value of the totalrebookbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALREBOOKBALANCE(BigDecimal value) {
            this.totalrebookbalance = value;
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
         *         &lt;element name="IS_FLY_SMART" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="PRICE_FOR_ALL_PAX_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="PRICE_FOR_ALL_PAX_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="LIST_PRICE_PER_TYPE_OF_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="PRICE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="PRICE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_PRICE_PER_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "isflysmart",
            "priceforallpaxinvouchers",
            "priceforallpaxinmiles",
            "listpricepertypeofpax",
            "listpriceperpax"
        })
        public static class AWARDPRICE
            implements Serializable
        {

            @XmlElement(name = "IS_FLY_SMART")
            protected Boolean isflysmart;
            @XmlElement(name = "PRICE_FOR_ALL_PAX_IN_VOUCHERS")
            protected BigInteger priceforallpaxinvouchers;
            @XmlElement(name = "PRICE_FOR_ALL_PAX_IN_MILES")
            protected BigInteger priceforallpaxinmiles;
            @XmlElement(name = "LIST_PRICE_PER_TYPE_OF_PAX")
            protected List<TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERTYPEOFPAX> listpricepertypeofpax;
            @XmlElement(name = "LIST_PRICE_PER_PAX")
            protected List<TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERPAX> listpriceperpax;

            /**
             * Gets the value of the isflysmart property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISFLYSMART() {
                return isflysmart;
            }

            /**
             * Sets the value of the isflysmart property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISFLYSMART(Boolean value) {
                this.isflysmart = value;
            }

            /**
             * Gets the value of the priceforallpaxinvouchers property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPRICEFORALLPAXINVOUCHERS() {
                return priceforallpaxinvouchers;
            }

            /**
             * Sets the value of the priceforallpaxinvouchers property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPRICEFORALLPAXINVOUCHERS(BigInteger value) {
                this.priceforallpaxinvouchers = value;
            }

            /**
             * Gets the value of the priceforallpaxinmiles property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPRICEFORALLPAXINMILES() {
                return priceforallpaxinmiles;
            }

            /**
             * Sets the value of the priceforallpaxinmiles property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPRICEFORALLPAXINMILES(BigInteger value) {
                this.priceforallpaxinmiles = value;
            }

            /**
             * Gets the value of the listpricepertypeofpax property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listpricepertypeofpax property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPRICEPERTYPEOFPAX().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERTYPEOFPAX }
             * 
             * 
             */
            public List<TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERTYPEOFPAX> getLISTPRICEPERTYPEOFPAX() {
                if (listpricepertypeofpax == null) {
                    listpricepertypeofpax = new ArrayList<TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERTYPEOFPAX>();
                }
                return this.listpricepertypeofpax;
            }

            /**
             * Gets the value of the listpriceperpax property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listpriceperpax property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPRICEPERPAX().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERPAX }
             * 
             * 
             */
            public List<TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERPAX> getLISTPRICEPERPAX() {
                if (listpriceperpax == null) {
                    listpriceperpax = new ArrayList<TRIP.LISTTRIPPLANPRICE.AWARDPRICE.LISTPRICEPERPAX>();
                }
                return this.listpriceperpax;
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
             *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
                "travellerid",
                "travellertype",
                "priceforupgradeinvouchers",
                "priceforupgradeinmiles"
            })
            public static class LISTPRICEPERPAX
                implements Serializable
            {

                @XmlElement(name = "TRAVELLER_ID", required = true)
                protected BigInteger travellerid;
                @XmlElement(name = "TRAVELLER_TYPE", required = true)
                protected String travellertype;
                @XmlElement(name = "PRICE_FOR_UPGRADE_IN_VOUCHERS")
                protected BigInteger priceforupgradeinvouchers;
                @XmlElement(name = "PRICE_FOR_UPGRADE_IN_MILES")
                protected BigInteger priceforupgradeinmiles;

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

                /**
                 * Gets the value of the priceforupgradeinvouchers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPRICEFORUPGRADEINVOUCHERS() {
                    return priceforupgradeinvouchers;
                }

                /**
                 * Sets the value of the priceforupgradeinvouchers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPRICEFORUPGRADEINVOUCHERS(BigInteger value) {
                    this.priceforupgradeinvouchers = value;
                }

                /**
                 * Gets the value of the priceforupgradeinmiles property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPRICEFORUPGRADEINMILES() {
                    return priceforupgradeinmiles;
                }

                /**
                 * Sets the value of the priceforupgradeinmiles property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPRICEFORUPGRADEINMILES(BigInteger value) {
                    this.priceforupgradeinmiles = value;
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
             *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="PRICE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="PRICE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
                "travellertype",
                "priceinvouchers",
                "priceinmiles"
            })
            public static class LISTPRICEPERTYPEOFPAX
                implements Serializable
            {

                @XmlElement(name = "TRAVELLER_TYPE", required = true)
                protected String travellertype;
                @XmlElement(name = "PRICE_IN_VOUCHERS")
                protected BigInteger priceinvouchers;
                @XmlElement(name = "PRICE_IN_MILES")
                protected BigInteger priceinmiles;

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

                /**
                 * Gets the value of the priceinvouchers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPRICEINVOUCHERS() {
                    return priceinvouchers;
                }

                /**
                 * Sets the value of the priceinvouchers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPRICEINVOUCHERS(BigInteger value) {
                    this.priceinvouchers = value;
                }

                /**
                 * Gets the value of the priceinmiles property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPRICEINMILES() {
                    return priceinmiles;
                }

                /**
                 * Sets the value of the priceinmiles property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPRICEINMILES(BigInteger value) {
                    this.priceinmiles = value;
                }

            }

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
     *         &lt;group ref="{}PriceWithFeesGroup"/&gt;
     *         &lt;element name="TOTAL_REBOOK_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "amount",
        "currency",
        "servicefeeamount",
        "listfee",
        "totalamount",
        "totalrebookbalance"
    })
    public static class LISTWEBFAREPRICE
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "SERVICE_FEE_AMOUNT")
        protected BigDecimal servicefeeamount;
        @XmlElement(name = "LIST_FEE")
        protected List<FEEType> listfee;
        @XmlElement(name = "TOTAL_AMOUNT", required = true)
        protected BigDecimal totalamount;
        @XmlElement(name = "TOTAL_REBOOK_BALANCE")
        protected BigDecimal totalrebookbalance;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the servicefeeamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSERVICEFEEAMOUNT() {
            return servicefeeamount;
        }

        /**
         * Sets the value of the servicefeeamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSERVICEFEEAMOUNT(BigDecimal value) {
            this.servicefeeamount = value;
        }

        /**
         * Gets the value of the listfee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFEE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FEEType }
         * 
         * 
         */
        public List<FEEType> getLISTFEE() {
            if (listfee == null) {
                listfee = new ArrayList<FEEType>();
            }
            return this.listfee;
        }

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALAMOUNT(BigDecimal value) {
            this.totalamount = value;
        }

        /**
         * Gets the value of the totalrebookbalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALREBOOKBALANCE() {
            return totalrebookbalance;
        }

        /**
         * Sets the value of the totalrebookbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALREBOOKBALANCE(BigDecimal value) {
            this.totalrebookbalance = value;
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
     *         &lt;element name="IS_CANCELLATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CANCELLATION_NON_ELIGIBILTY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_CANC_ALLOWED_JUST_AFTER_BOOK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_MODIFICATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="MODIFICATION_NON_ELIGIBILTY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_DIVIDE_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_APPROVE_REJECT_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_SCHEDULE_CHANGE_ACK_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_MOP_MODIFICATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TRIP_LIMITED_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="USE_PENDING_TRIPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_PENDING_CONFIRMATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PERMISSION_BY_ELEMENT_TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADD_DISABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="ALLOW_MODIFY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="ALLOW_DELETE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="MODIFY_REFUSAL_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SERVICING" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IS_ELIGIBLE_FOR_SERVICING" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
     *                   &lt;element name="IS_ELIGIBLE_FOR_SERVICING_SPECIAL_REQUEST" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
     *                   &lt;element name="IS_ELIGIBLE_FOR_SERVICING_SEAT" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
     *                   &lt;element name="IS_ELIGIBLE_FOR_SERVICING_CHARGEABLE_SERVICES" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
     *                   &lt;element name="IS_ELIGIBLE_FOR_NAME_UPDATE" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VOUCHER" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IS_REDEMPTION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="UNUSED_TICKET_VOUCHER" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WL_CONFIRMATION" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
     *         &lt;element name="IS_REFUND_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SELF_SERVICE_CHECK_IN" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CHANNEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SCHEDULE_CHANGE_ACK_NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "iscancellationallowed",
        "cancellationnoneligibiltyreason",
        "iscancallowedjustafterbook",
        "ismodificationallowed",
        "modificationnoneligibiltyreason",
        "isdivideallowed",
        "isapproverejectallowed",
        "isschedulechangeackallowed",
        "ismopmodificationallowed",
        "triplimiteddisplay",
        "usependingtrips",
        "ispendingconfirmationallowed",
        "permissionbyelementtype",
        "servicing",
        "voucher",
        "wlconfirmation",
        "isrefundallowed",
        "listselfservicecheckin",
        "schedulechangeacknoneligibilityreason"
    })
    public static class PERMISSIONS
        implements Serializable
    {

        @XmlElement(name = "IS_CANCELLATION_ALLOWED")
        protected Boolean iscancellationallowed;
        @XmlElement(name = "CANCELLATION_NON_ELIGIBILTY_REASON")
        protected String cancellationnoneligibiltyreason;
        @XmlElement(name = "IS_CANC_ALLOWED_JUST_AFTER_BOOK")
        protected Boolean iscancallowedjustafterbook;
        @XmlElement(name = "IS_MODIFICATION_ALLOWED")
        protected Boolean ismodificationallowed;
        @XmlElement(name = "MODIFICATION_NON_ELIGIBILTY_REASON")
        protected String modificationnoneligibiltyreason;
        @XmlElement(name = "IS_DIVIDE_ALLOWED")
        protected Boolean isdivideallowed;
        @XmlElement(name = "IS_APPROVE_REJECT_ALLOWED")
        protected Boolean isapproverejectallowed;
        @XmlElement(name = "IS_SCHEDULE_CHANGE_ACK_ALLOWED")
        protected Boolean isschedulechangeackallowed;
        @XmlElement(name = "IS_MOP_MODIFICATION_ALLOWED")
        protected Boolean ismopmodificationallowed;
        @XmlElement(name = "TRIP_LIMITED_DISPLAY")
        protected Boolean triplimiteddisplay;
        @XmlElement(name = "USE_PENDING_TRIPS")
        protected Boolean usependingtrips;
        @XmlElement(name = "IS_PENDING_CONFIRMATION_ALLOWED")
        protected Boolean ispendingconfirmationallowed;
        @XmlElement(name = "PERMISSION_BY_ELEMENT_TYPE")
        protected List<TRIP.PERMISSIONS.PERMISSIONBYELEMENTTYPE> permissionbyelementtype;
        @XmlElement(name = "SERVICING")
        protected TRIP.PERMISSIONS.SERVICING servicing;
        @XmlElement(name = "VOUCHER")
        protected TRIP.PERMISSIONS.VOUCHER voucher;
        @XmlElement(name = "WL_CONFIRMATION")
        protected GENERICELIBILITY wlconfirmation;
        @XmlElement(name = "IS_REFUND_ALLOWED")
        protected Object isrefundallowed;
        @XmlElement(name = "LIST_SELF_SERVICE_CHECK_IN")
        protected List<TRIP.PERMISSIONS.LISTSELFSERVICECHECKIN> listselfservicecheckin;
        @XmlElement(name = "SCHEDULE_CHANGE_ACK_NON_ELIGIBILITY_REASON")
        protected String schedulechangeacknoneligibilityreason;

        /**
         * Gets the value of the iscancellationallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCANCELLATIONALLOWED() {
            return iscancellationallowed;
        }

        /**
         * Sets the value of the iscancellationallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCANCELLATIONALLOWED(Boolean value) {
            this.iscancellationallowed = value;
        }

        /**
         * Gets the value of the cancellationnoneligibiltyreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCANCELLATIONNONELIGIBILTYREASON() {
            return cancellationnoneligibiltyreason;
        }

        /**
         * Sets the value of the cancellationnoneligibiltyreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCANCELLATIONNONELIGIBILTYREASON(String value) {
            this.cancellationnoneligibiltyreason = value;
        }

        /**
         * Gets the value of the iscancallowedjustafterbook property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCANCALLOWEDJUSTAFTERBOOK() {
            return iscancallowedjustafterbook;
        }

        /**
         * Sets the value of the iscancallowedjustafterbook property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCANCALLOWEDJUSTAFTERBOOK(Boolean value) {
            this.iscancallowedjustafterbook = value;
        }

        /**
         * Gets the value of the ismodificationallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISMODIFICATIONALLOWED() {
            return ismodificationallowed;
        }

        /**
         * Sets the value of the ismodificationallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISMODIFICATIONALLOWED(Boolean value) {
            this.ismodificationallowed = value;
        }

        /**
         * Gets the value of the modificationnoneligibiltyreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMODIFICATIONNONELIGIBILTYREASON() {
            return modificationnoneligibiltyreason;
        }

        /**
         * Sets the value of the modificationnoneligibiltyreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMODIFICATIONNONELIGIBILTYREASON(String value) {
            this.modificationnoneligibiltyreason = value;
        }

        /**
         * Gets the value of the isdivideallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISDIVIDEALLOWED() {
            return isdivideallowed;
        }

        /**
         * Sets the value of the isdivideallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISDIVIDEALLOWED(Boolean value) {
            this.isdivideallowed = value;
        }

        /**
         * Gets the value of the isapproverejectallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISAPPROVEREJECTALLOWED() {
            return isapproverejectallowed;
        }

        /**
         * Sets the value of the isapproverejectallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISAPPROVEREJECTALLOWED(Boolean value) {
            this.isapproverejectallowed = value;
        }

        /**
         * Gets the value of the isschedulechangeackallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISSCHEDULECHANGEACKALLOWED() {
            return isschedulechangeackallowed;
        }

        /**
         * Sets the value of the isschedulechangeackallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISSCHEDULECHANGEACKALLOWED(Boolean value) {
            this.isschedulechangeackallowed = value;
        }

        /**
         * Gets the value of the ismopmodificationallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISMOPMODIFICATIONALLOWED() {
            return ismopmodificationallowed;
        }

        /**
         * Sets the value of the ismopmodificationallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISMOPMODIFICATIONALLOWED(Boolean value) {
            this.ismopmodificationallowed = value;
        }

        /**
         * Gets the value of the triplimiteddisplay property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTRIPLIMITEDDISPLAY() {
            return triplimiteddisplay;
        }

        /**
         * Sets the value of the triplimiteddisplay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTRIPLIMITEDDISPLAY(Boolean value) {
            this.triplimiteddisplay = value;
        }

        /**
         * Gets the value of the usependingtrips property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUSEPENDINGTRIPS() {
            return usependingtrips;
        }

        /**
         * Sets the value of the usependingtrips property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUSEPENDINGTRIPS(Boolean value) {
            this.usependingtrips = value;
        }

        /**
         * Gets the value of the ispendingconfirmationallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPENDINGCONFIRMATIONALLOWED() {
            return ispendingconfirmationallowed;
        }

        /**
         * Sets the value of the ispendingconfirmationallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPENDINGCONFIRMATIONALLOWED(Boolean value) {
            this.ispendingconfirmationallowed = value;
        }

        /**
         * Gets the value of the permissionbyelementtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permissionbyelementtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPERMISSIONBYELEMENTTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.PERMISSIONS.PERMISSIONBYELEMENTTYPE }
         * 
         * 
         */
        public List<TRIP.PERMISSIONS.PERMISSIONBYELEMENTTYPE> getPERMISSIONBYELEMENTTYPE() {
            if (permissionbyelementtype == null) {
                permissionbyelementtype = new ArrayList<TRIP.PERMISSIONS.PERMISSIONBYELEMENTTYPE>();
            }
            return this.permissionbyelementtype;
        }

        /**
         * Gets the value of the servicing property.
         * 
         * @return
         *     possible object is
         *     {@link TRIP.PERMISSIONS.SERVICING }
         *     
         */
        public TRIP.PERMISSIONS.SERVICING getSERVICING() {
            return servicing;
        }

        /**
         * Sets the value of the servicing property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRIP.PERMISSIONS.SERVICING }
         *     
         */
        public void setSERVICING(TRIP.PERMISSIONS.SERVICING value) {
            this.servicing = value;
        }

        /**
         * Gets the value of the voucher property.
         * 
         * @return
         *     possible object is
         *     {@link TRIP.PERMISSIONS.VOUCHER }
         *     
         */
        public TRIP.PERMISSIONS.VOUCHER getVOUCHER() {
            return voucher;
        }

        /**
         * Sets the value of the voucher property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRIP.PERMISSIONS.VOUCHER }
         *     
         */
        public void setVOUCHER(TRIP.PERMISSIONS.VOUCHER value) {
            this.voucher = value;
        }

        /**
         * Gets the value of the wlconfirmation property.
         * 
         * @return
         *     possible object is
         *     {@link GENERICELIBILITY }
         *     
         */
        public GENERICELIBILITY getWLCONFIRMATION() {
            return wlconfirmation;
        }

        /**
         * Sets the value of the wlconfirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link GENERICELIBILITY }
         *     
         */
        public void setWLCONFIRMATION(GENERICELIBILITY value) {
            this.wlconfirmation = value;
        }

        /**
         * Gets the value of the isrefundallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getISREFUNDALLOWED() {
            return isrefundallowed;
        }

        /**
         * Sets the value of the isrefundallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setISREFUNDALLOWED(Object value) {
            this.isrefundallowed = value;
        }

        /**
         * Gets the value of the listselfservicecheckin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listselfservicecheckin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSELFSERVICECHECKIN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.PERMISSIONS.LISTSELFSERVICECHECKIN }
         * 
         * 
         */
        public List<TRIP.PERMISSIONS.LISTSELFSERVICECHECKIN> getLISTSELFSERVICECHECKIN() {
            if (listselfservicecheckin == null) {
                listselfservicecheckin = new ArrayList<TRIP.PERMISSIONS.LISTSELFSERVICECHECKIN>();
            }
            return this.listselfservicecheckin;
        }

        /**
         * Gets the value of the schedulechangeacknoneligibilityreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCHEDULECHANGEACKNONELIGIBILITYREASON() {
            return schedulechangeacknoneligibilityreason;
        }

        /**
         * Sets the value of the schedulechangeacknoneligibilityreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCHEDULECHANGEACKNONELIGIBILITYREASON(String value) {
            this.schedulechangeacknoneligibilityreason = value;
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
         *         &lt;element name="CHANNEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "channel",
            "iseligible",
            "noneligibilityreason"
        })
        public static class LISTSELFSERVICECHECKIN
            implements Serializable
        {

            @XmlElement(name = "CHANNEL")
            protected String channel;
            @XmlElement(name = "IS_ELIGIBLE")
            protected String iseligible;
            @XmlElement(name = "NON_ELIGIBILITY_REASON")
            protected String noneligibilityreason;

            /**
             * Gets the value of the channel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHANNEL() {
                return channel;
            }

            /**
             * Sets the value of the channel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHANNEL(String value) {
                this.channel = value;
            }

            /**
             * Gets the value of the iseligible property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISELIGIBLE() {
                return iseligible;
            }

            /**
             * Sets the value of the iseligible property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISELIGIBLE(String value) {
                this.iseligible = value;
            }

            /**
             * Gets the value of the noneligibilityreason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNONELIGIBILITYREASON() {
                return noneligibilityreason;
            }

            /**
             * Sets the value of the noneligibilityreason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNONELIGIBILITYREASON(String value) {
                this.noneligibilityreason = value;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADD_DISABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="ALLOW_MODIFY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="ALLOW_DELETE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="MODIFY_REFUSAL_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "type",
            "adddisabled",
            "allowmodify",
            "allowdelete",
            "modifyrefusalreason"
        })
        public static class PERMISSIONBYELEMENTTYPE
            implements Serializable
        {

            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "ADD_DISABLED")
            protected Boolean adddisabled;
            @XmlElement(name = "ALLOW_MODIFY")
            protected Boolean allowmodify;
            @XmlElement(name = "ALLOW_DELETE")
            protected Boolean allowdelete;
            @XmlElement(name = "MODIFY_REFUSAL_REASON")
            protected String modifyrefusalreason;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the adddisabled property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isADDDISABLED() {
                return adddisabled;
            }

            /**
             * Sets the value of the adddisabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setADDDISABLED(Boolean value) {
                this.adddisabled = value;
            }

            /**
             * Gets the value of the allowmodify property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isALLOWMODIFY() {
                return allowmodify;
            }

            /**
             * Sets the value of the allowmodify property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setALLOWMODIFY(Boolean value) {
                this.allowmodify = value;
            }

            /**
             * Gets the value of the allowdelete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isALLOWDELETE() {
                return allowdelete;
            }

            /**
             * Sets the value of the allowdelete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setALLOWDELETE(Boolean value) {
                this.allowdelete = value;
            }

            /**
             * Gets the value of the modifyrefusalreason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMODIFYREFUSALREASON() {
                return modifyrefusalreason;
            }

            /**
             * Sets the value of the modifyrefusalreason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMODIFYREFUSALREASON(String value) {
                this.modifyrefusalreason = value;
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
         *         &lt;element name="IS_ELIGIBLE_FOR_SERVICING" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
         *         &lt;element name="IS_ELIGIBLE_FOR_SERVICING_SPECIAL_REQUEST" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
         *         &lt;element name="IS_ELIGIBLE_FOR_SERVICING_SEAT" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
         *         &lt;element name="IS_ELIGIBLE_FOR_SERVICING_CHARGEABLE_SERVICES" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
         *         &lt;element name="IS_ELIGIBLE_FOR_NAME_UPDATE" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
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
            "iseligibleforservicing",
            "iseligibleforservicingspecialrequest",
            "iseligibleforservicingseat",
            "iseligibleforservicingchargeableservices",
            "iseligiblefornameupdate"
        })
        public static class SERVICING
            implements Serializable
        {

            @XmlElement(name = "IS_ELIGIBLE_FOR_SERVICING")
            protected GENERICELIBILITY iseligibleforservicing;
            @XmlElement(name = "IS_ELIGIBLE_FOR_SERVICING_SPECIAL_REQUEST")
            protected GENERICELIBILITY iseligibleforservicingspecialrequest;
            @XmlElement(name = "IS_ELIGIBLE_FOR_SERVICING_SEAT")
            protected GENERICELIBILITY iseligibleforservicingseat;
            @XmlElement(name = "IS_ELIGIBLE_FOR_SERVICING_CHARGEABLE_SERVICES")
            protected GENERICELIBILITY iseligibleforservicingchargeableservices;
            @XmlElement(name = "IS_ELIGIBLE_FOR_NAME_UPDATE")
            protected GENERICELIBILITY iseligiblefornameupdate;

            /**
             * Gets the value of the iseligibleforservicing property.
             * 
             * @return
             *     possible object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public GENERICELIBILITY getISELIGIBLEFORSERVICING() {
                return iseligibleforservicing;
            }

            /**
             * Sets the value of the iseligibleforservicing property.
             * 
             * @param value
             *     allowed object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public void setISELIGIBLEFORSERVICING(GENERICELIBILITY value) {
                this.iseligibleforservicing = value;
            }

            /**
             * Gets the value of the iseligibleforservicingspecialrequest property.
             * 
             * @return
             *     possible object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public GENERICELIBILITY getISELIGIBLEFORSERVICINGSPECIALREQUEST() {
                return iseligibleforservicingspecialrequest;
            }

            /**
             * Sets the value of the iseligibleforservicingspecialrequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public void setISELIGIBLEFORSERVICINGSPECIALREQUEST(GENERICELIBILITY value) {
                this.iseligibleforservicingspecialrequest = value;
            }

            /**
             * Gets the value of the iseligibleforservicingseat property.
             * 
             * @return
             *     possible object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public GENERICELIBILITY getISELIGIBLEFORSERVICINGSEAT() {
                return iseligibleforservicingseat;
            }

            /**
             * Sets the value of the iseligibleforservicingseat property.
             * 
             * @param value
             *     allowed object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public void setISELIGIBLEFORSERVICINGSEAT(GENERICELIBILITY value) {
                this.iseligibleforservicingseat = value;
            }

            /**
             * Gets the value of the iseligibleforservicingchargeableservices property.
             * 
             * @return
             *     possible object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public GENERICELIBILITY getISELIGIBLEFORSERVICINGCHARGEABLESERVICES() {
                return iseligibleforservicingchargeableservices;
            }

            /**
             * Sets the value of the iseligibleforservicingchargeableservices property.
             * 
             * @param value
             *     allowed object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public void setISELIGIBLEFORSERVICINGCHARGEABLESERVICES(GENERICELIBILITY value) {
                this.iseligibleforservicingchargeableservices = value;
            }

            /**
             * Gets the value of the iseligiblefornameupdate property.
             * 
             * @return
             *     possible object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public GENERICELIBILITY getISELIGIBLEFORNAMEUPDATE() {
                return iseligiblefornameupdate;
            }

            /**
             * Sets the value of the iseligiblefornameupdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public void setISELIGIBLEFORNAMEUPDATE(GENERICELIBILITY value) {
                this.iseligiblefornameupdate = value;
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
         *         &lt;element name="IS_REDEMPTION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="UNUSED_TICKET_VOUCHER" type="{}GENERIC_ELIBILITY" minOccurs="0"/&gt;
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
            "isredemptionallowed",
            "unusedticketvoucher"
        })
        public static class VOUCHER
            implements Serializable
        {

            @XmlElement(name = "IS_REDEMPTION_ALLOWED")
            protected Boolean isredemptionallowed;
            @XmlElement(name = "UNUSED_TICKET_VOUCHER")
            protected GENERICELIBILITY unusedticketvoucher;

            /**
             * Gets the value of the isredemptionallowed property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISREDEMPTIONALLOWED() {
                return isredemptionallowed;
            }

            /**
             * Sets the value of the isredemptionallowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISREDEMPTIONALLOWED(Boolean value) {
                this.isredemptionallowed = value;
            }

            /**
             * Gets the value of the unusedticketvoucher property.
             * 
             * @return
             *     possible object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public GENERICELIBILITY getUNUSEDTICKETVOUCHER() {
                return unusedticketvoucher;
            }

            /**
             * Sets the value of the unusedticketvoucher property.
             * 
             * @param value
             *     allowed object is
             *     {@link GENERICELIBILITY }
             *     
             */
            public void setUNUSEDTICKETVOUCHER(GENERICELIBILITY value) {
                this.unusedticketvoucher = value;
            }

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
     *         &lt;element name="LIST_CATEGORY" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="LIST_FEATURE" type="{}VALUE_NAMEType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "listcategory"
    })
    public static class PRIORITY
        implements Serializable
    {

        @XmlElement(name = "LIST_CATEGORY", required = true)
        protected List<TRIP.PRIORITY.LISTCATEGORY> listcategory;

        /**
         * Gets the value of the listcategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCATEGORY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.PRIORITY.LISTCATEGORY }
         * 
         * 
         */
        public List<TRIP.PRIORITY.LISTCATEGORY> getLISTCATEGORY() {
            if (listcategory == null) {
                listcategory = new ArrayList<TRIP.PRIORITY.LISTCATEGORY>();
            }
            return this.listcategory;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="LIST_FEATURE" type="{}VALUE_NAMEType" maxOccurs="unbounded"/&gt;
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
            "name",
            "listfeature"
        })
        public static class LISTCATEGORY
            implements Serializable
        {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "LIST_FEATURE", required = true)
            protected List<VALUENAMEType> listfeature;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the listfeature property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listfeature property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTFEATURE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VALUENAMEType }
             * 
             * 
             */
            public List<VALUENAMEType> getLISTFEATURE() {
                if (listfeature == null) {
                    listfeature = new ArrayList<VALUENAMEType>();
                }
                return this.listfeature;
            }

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
     *         &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_NON_ELIGIBILITY_REASON" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_ELIGIBILITY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_WAIVER_INFORMATION_PER_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_WAIVER_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_WAIVER_CODES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_WAIVER" type="{}waiverItem" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_REBOOKING_FLOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_REISSUE_WITH_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_REISSUE_WITHOUT_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_REVALIDATION_WITH_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_REVALIDATION_WITHOUT_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_AMOUNT_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_AMOUNT_ADD_COLLECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_AMOUNT_REFUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_ORIGIN_AND_DESTINATION_CHANGE_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "eligibletorebooking",
        "noneligibilityreason",
        "listnoneligibilityreason",
        "listeligibilitytype",
        "listwaiverinformationperticket",
        "listwaiver",
        "numberofrebooking",
        "numberofrebookingflown",
        "numberofreissuewithpenalty",
        "numberofreissuewithoutpenalty",
        "numberofrevalidationwithpenalty",
        "numberofrevalidationwithoutpenalty",
        "totalamountpenalty",
        "totalamountaddcollection",
        "totalamountrefund",
        "isoriginanddestinationchangeallowed"
    })
    public static class REBOOKING
        implements Serializable
    {

        @XmlElement(name = "ELIGIBLE_TO_REBOOKING")
        protected Boolean eligibletorebooking;
        @XmlElement(name = "NON_ELIGIBILITY_REASON")
        protected String noneligibilityreason;
        @XmlElement(name = "LIST_NON_ELIGIBILITY_REASON")
        protected List<TRIP.REBOOKING.LISTNONELIGIBILITYREASON> listnoneligibilityreason;
        @XmlElement(name = "LIST_ELIGIBILITY_TYPE")
        protected List<String> listeligibilitytype;
        @XmlElement(name = "LIST_WAIVER_INFORMATION_PER_TICKET")
        protected List<TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET> listwaiverinformationperticket;
        @XmlElement(name = "LIST_WAIVER")
        protected List<WaiverItem> listwaiver;
        @XmlElement(name = "NUMBER_OF_REBOOKING")
        protected String numberofrebooking;
        @XmlElement(name = "NUMBER_OF_REBOOKING_FLOWN")
        protected String numberofrebookingflown;
        @XmlElement(name = "NUMBER_OF_REISSUE_WITH_PENALTY")
        protected String numberofreissuewithpenalty;
        @XmlElement(name = "NUMBER_OF_REISSUE_WITHOUT_PENALTY")
        protected String numberofreissuewithoutpenalty;
        @XmlElement(name = "NUMBER_OF_REVALIDATION_WITH_PENALTY")
        protected String numberofrevalidationwithpenalty;
        @XmlElement(name = "NUMBER_OF_REVALIDATION_WITHOUT_PENALTY")
        protected String numberofrevalidationwithoutpenalty;
        @XmlElement(name = "TOTAL_AMOUNT_PENALTY")
        protected String totalamountpenalty;
        @XmlElement(name = "TOTAL_AMOUNT_ADD_COLLECTION")
        protected String totalamountaddcollection;
        @XmlElement(name = "TOTAL_AMOUNT_REFUND")
        protected String totalamountrefund;
        @XmlElement(name = "IS_ORIGIN_AND_DESTINATION_CHANGE_ALLOWED")
        protected Boolean isoriginanddestinationchangeallowed;

        /**
         * Gets the value of the eligibletorebooking property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isELIGIBLETOREBOOKING() {
            return eligibletorebooking;
        }

        /**
         * Sets the value of the eligibletorebooking property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setELIGIBLETOREBOOKING(Boolean value) {
            this.eligibletorebooking = value;
        }

        /**
         * Gets the value of the noneligibilityreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNONELIGIBILITYREASON() {
            return noneligibilityreason;
        }

        /**
         * Sets the value of the noneligibilityreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNONELIGIBILITYREASON(String value) {
            this.noneligibilityreason = value;
        }

        /**
         * Gets the value of the listnoneligibilityreason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listnoneligibilityreason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTNONELIGIBILITYREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.REBOOKING.LISTNONELIGIBILITYREASON }
         * 
         * 
         */
        public List<TRIP.REBOOKING.LISTNONELIGIBILITYREASON> getLISTNONELIGIBILITYREASON() {
            if (listnoneligibilityreason == null) {
                listnoneligibilityreason = new ArrayList<TRIP.REBOOKING.LISTNONELIGIBILITYREASON>();
            }
            return this.listnoneligibilityreason;
        }

        /**
         * Gets the value of the listeligibilitytype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listeligibilitytype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTELIGIBILITYTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTELIGIBILITYTYPE() {
            if (listeligibilitytype == null) {
                listeligibilitytype = new ArrayList<String>();
            }
            return this.listeligibilitytype;
        }

        /**
         * Gets the value of the listwaiverinformationperticket property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listwaiverinformationperticket property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTWAIVERINFORMATIONPERTICKET().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET }
         * 
         * 
         */
        public List<TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET> getLISTWAIVERINFORMATIONPERTICKET() {
            if (listwaiverinformationperticket == null) {
                listwaiverinformationperticket = new ArrayList<TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET>();
            }
            return this.listwaiverinformationperticket;
        }

        /**
         * Gets the value of the listwaiver property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listwaiver property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTWAIVER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WaiverItem }
         * 
         * 
         */
        public List<WaiverItem> getLISTWAIVER() {
            if (listwaiver == null) {
                listwaiver = new ArrayList<WaiverItem>();
            }
            return this.listwaiver;
        }

        /**
         * Gets the value of the numberofrebooking property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBEROFREBOOKING() {
            return numberofrebooking;
        }

        /**
         * Sets the value of the numberofrebooking property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBEROFREBOOKING(String value) {
            this.numberofrebooking = value;
        }

        /**
         * Gets the value of the numberofrebookingflown property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBEROFREBOOKINGFLOWN() {
            return numberofrebookingflown;
        }

        /**
         * Sets the value of the numberofrebookingflown property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBEROFREBOOKINGFLOWN(String value) {
            this.numberofrebookingflown = value;
        }

        /**
         * Gets the value of the numberofreissuewithpenalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBEROFREISSUEWITHPENALTY() {
            return numberofreissuewithpenalty;
        }

        /**
         * Sets the value of the numberofreissuewithpenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBEROFREISSUEWITHPENALTY(String value) {
            this.numberofreissuewithpenalty = value;
        }

        /**
         * Gets the value of the numberofreissuewithoutpenalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBEROFREISSUEWITHOUTPENALTY() {
            return numberofreissuewithoutpenalty;
        }

        /**
         * Sets the value of the numberofreissuewithoutpenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBEROFREISSUEWITHOUTPENALTY(String value) {
            this.numberofreissuewithoutpenalty = value;
        }

        /**
         * Gets the value of the numberofrevalidationwithpenalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBEROFREVALIDATIONWITHPENALTY() {
            return numberofrevalidationwithpenalty;
        }

        /**
         * Sets the value of the numberofrevalidationwithpenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBEROFREVALIDATIONWITHPENALTY(String value) {
            this.numberofrevalidationwithpenalty = value;
        }

        /**
         * Gets the value of the numberofrevalidationwithoutpenalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBEROFREVALIDATIONWITHOUTPENALTY() {
            return numberofrevalidationwithoutpenalty;
        }

        /**
         * Sets the value of the numberofrevalidationwithoutpenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBEROFREVALIDATIONWITHOUTPENALTY(String value) {
            this.numberofrevalidationwithoutpenalty = value;
        }

        /**
         * Gets the value of the totalamountpenalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALAMOUNTPENALTY() {
            return totalamountpenalty;
        }

        /**
         * Sets the value of the totalamountpenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALAMOUNTPENALTY(String value) {
            this.totalamountpenalty = value;
        }

        /**
         * Gets the value of the totalamountaddcollection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALAMOUNTADDCOLLECTION() {
            return totalamountaddcollection;
        }

        /**
         * Sets the value of the totalamountaddcollection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALAMOUNTADDCOLLECTION(String value) {
            this.totalamountaddcollection = value;
        }

        /**
         * Gets the value of the totalamountrefund property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALAMOUNTREFUND() {
            return totalamountrefund;
        }

        /**
         * Sets the value of the totalamountrefund property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALAMOUNTREFUND(String value) {
            this.totalamountrefund = value;
        }

        /**
         * Gets the value of the isoriginanddestinationchangeallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISORIGINANDDESTINATIONCHANGEALLOWED() {
            return isoriginanddestinationchangeallowed;
        }

        /**
         * Sets the value of the isoriginanddestinationchangeallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISORIGINANDDESTINATIONCHANGEALLOWED(Boolean value) {
            this.isoriginanddestinationchangeallowed = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "name"
        })
        public static class LISTNONELIGIBILITYREASON
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;

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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
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
         *         &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIST_WAIVER_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_WAIVER_CODES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "documentnumber",
            "listwaiverinformation"
        })
        public static class LISTWAIVERINFORMATIONPERTICKET
            implements Serializable
        {

            @XmlElement(name = "DOCUMENT_NUMBER")
            protected String documentnumber;
            @XmlElement(name = "LIST_WAIVER_INFORMATION")
            protected List<TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET.LISTWAIVERINFORMATION> listwaiverinformation;

            /**
             * Gets the value of the documentnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCUMENTNUMBER() {
                return documentnumber;
            }

            /**
             * Sets the value of the documentnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCUMENTNUMBER(String value) {
                this.documentnumber = value;
            }

            /**
             * Gets the value of the listwaiverinformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listwaiverinformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTWAIVERINFORMATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET.LISTWAIVERINFORMATION }
             * 
             * 
             */
            public List<TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET.LISTWAIVERINFORMATION> getLISTWAIVERINFORMATION() {
                if (listwaiverinformation == null) {
                    listwaiverinformation = new ArrayList<TRIP.REBOOKING.LISTWAIVERINFORMATIONPERTICKET.LISTWAIVERINFORMATION>();
                }
                return this.listwaiverinformation;
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
             *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="LIST_WAIVER_CODES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "segmentid",
                "listwaivercodes"
            })
            public static class LISTWAIVERINFORMATION
                implements Serializable
            {

                @XmlElement(name = "SEGMENT_ID")
                protected String segmentid;
                @XmlElement(name = "LIST_WAIVER_CODES")
                protected List<String> listwaivercodes;

                /**
                 * Gets the value of the segmentid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSEGMENTID() {
                    return segmentid;
                }

                /**
                 * Sets the value of the segmentid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSEGMENTID(String value) {
                    this.segmentid = value;
                }

                /**
                 * Gets the value of the listwaivercodes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listwaivercodes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTWAIVERCODES().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getLISTWAIVERCODES() {
                    if (listwaivercodes == null) {
                        listwaivercodes = new ArrayList<String>();
                    }
                    return this.listwaivercodes;
                }

            }

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
     *         &lt;element name="FARE_RESTRICTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="SEARCH_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="IS_REFUNDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="INS_HANDLING_CONFIRMED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="REFUND_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_REFUND_AMOUNTS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REFUND_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_REFUND_AMOUNT_BY_PAX_TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TRAVELLER_TYPE"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TRAVELLER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PAID_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PAID_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PAID_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LIST_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TICKET_NUMBER" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="PAX_TATOO_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_NON_REF_TAXES" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_EMD_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PAID_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PAID_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PAID_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LIST_EMD_NUMBER" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_NON_REF_TAXES" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "farerestriction",
        "searchtype",
        "isrefunded",
        "inshandlingconfirmed",
        "refundtype",
        "listrefundamounts"
    })
    public static class REFUND
        implements Serializable
    {

        @XmlElement(name = "FARE_RESTRICTION")
        protected Object farerestriction;
        @XmlElement(name = "SEARCH_TYPE")
        protected Object searchtype;
        @XmlElement(name = "IS_REFUNDED")
        protected Boolean isrefunded;
        @XmlElement(name = "INS_HANDLING_CONFIRMED")
        protected Boolean inshandlingconfirmed;
        @XmlElement(name = "REFUND_TYPE")
        protected String refundtype;
        @XmlElement(name = "LIST_REFUND_AMOUNTS")
        protected List<TRIP.REFUND.LISTREFUNDAMOUNTS> listrefundamounts;

        /**
         * Gets the value of the farerestriction property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFARERESTRICTION() {
            return farerestriction;
        }

        /**
         * Sets the value of the farerestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFARERESTRICTION(Object value) {
            this.farerestriction = value;
        }

        /**
         * Gets the value of the searchtype property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSEARCHTYPE() {
            return searchtype;
        }

        /**
         * Sets the value of the searchtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSEARCHTYPE(Object value) {
            this.searchtype = value;
        }

        /**
         * Gets the value of the isrefunded property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISREFUNDED() {
            return isrefunded;
        }

        /**
         * Sets the value of the isrefunded property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISREFUNDED(Boolean value) {
            this.isrefunded = value;
        }

        /**
         * Gets the value of the inshandlingconfirmed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isINSHANDLINGCONFIRMED() {
            return inshandlingconfirmed;
        }

        /**
         * Sets the value of the inshandlingconfirmed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setINSHANDLINGCONFIRMED(Boolean value) {
            this.inshandlingconfirmed = value;
        }

        /**
         * Gets the value of the refundtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFUNDTYPE() {
            return refundtype;
        }

        /**
         * Sets the value of the refundtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFUNDTYPE(String value) {
            this.refundtype = value;
        }

        /**
         * Gets the value of the listrefundamounts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrefundamounts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTREFUNDAMOUNTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIP.REFUND.LISTREFUNDAMOUNTS }
         * 
         * 
         */
        public List<TRIP.REFUND.LISTREFUNDAMOUNTS> getLISTREFUNDAMOUNTS() {
            if (listrefundamounts == null) {
                listrefundamounts = new ArrayList<TRIP.REFUND.LISTREFUNDAMOUNTS>();
            }
            return this.listrefundamounts;
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
         *         &lt;element name="REFUND_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_REFUND_AMOUNT_BY_PAX_TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TRAVELLER_TYPE"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TRAVELLER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PAID_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PAID_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PAID_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LIST_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TICKET_NUMBER" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="PAX_TATOO_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_NON_REF_TAXES" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_EMD_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PAID_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PAID_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PAID_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LIST_EMD_NUMBER" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_NON_REF_TAXES" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "refundtype",
            "refundfeeamount",
            "currency",
            "listrefundamountbypaxtype",
            "listemdamount"
        })
        public static class LISTREFUNDAMOUNTS
            implements Serializable
        {

            @XmlElement(name = "REFUND_TYPE", required = true)
            protected String refundtype;
            @XmlElement(name = "REFUND_FEE_AMOUNT")
            protected String refundfeeamount;
            @XmlElement(name = "CURRENCY")
            protected TRIP.REFUND.LISTREFUNDAMOUNTS.CURRENCY currency;
            @XmlElement(name = "LIST_REFUND_AMOUNT_BY_PAX_TYPE")
            protected List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE> listrefundamountbypaxtype;
            @XmlElement(name = "LIST_EMD_AMOUNT")
            protected List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT> listemdamount;

            /**
             * Gets the value of the refundtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFUNDTYPE() {
                return refundtype;
            }

            /**
             * Sets the value of the refundtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFUNDTYPE(String value) {
                this.refundtype = value;
            }

            /**
             * Gets the value of the refundfeeamount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFUNDFEEAMOUNT() {
                return refundfeeamount;
            }

            /**
             * Sets the value of the refundfeeamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFUNDFEEAMOUNT(String value) {
                this.refundfeeamount = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.CURRENCY }
             *     
             */
            public TRIP.REFUND.LISTREFUNDAMOUNTS.CURRENCY getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.CURRENCY }
             *     
             */
            public void setCURRENCY(TRIP.REFUND.LISTREFUNDAMOUNTS.CURRENCY value) {
                this.currency = value;
            }

            /**
             * Gets the value of the listrefundamountbypaxtype property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listrefundamountbypaxtype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTREFUNDAMOUNTBYPAXTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE }
             * 
             * 
             */
            public List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE> getLISTREFUNDAMOUNTBYPAXTYPE() {
                if (listrefundamountbypaxtype == null) {
                    listrefundamountbypaxtype = new ArrayList<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE>();
                }
                return this.listrefundamountbypaxtype;
            }

            /**
             * Gets the value of the listemdamount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listemdamount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTEMDAMOUNT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT }
             * 
             * 
             */
            public List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT> getLISTEMDAMOUNT() {
                if (listemdamount == null) {
                    listemdamount = new ArrayList<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT>();
                }
                return this.listemdamount;
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
             *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "name"
            })
            public static class CURRENCY
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;

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
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
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
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PAID_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PAID_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PAID_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="CURRENCY" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="LIST_EMD_NUMBER" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="LIST_NON_REF_TAXES" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "amount",
                "paidamount",
                "totalamount",
                "paidtotalamount",
                "tax",
                "paidtax",
                "currency",
                "listemdnumber",
                "refundfeeamount",
                "listnonreftaxes"
            })
            public static class LISTEMDAMOUNT
                implements Serializable
            {

                @XmlElement(name = "AMOUNT")
                protected String amount;
                @XmlElement(name = "PAID_AMOUNT")
                protected String paidamount;
                @XmlElement(name = "TOTAL_AMOUNT")
                protected String totalamount;
                @XmlElement(name = "PAID_TOTAL_AMOUNT")
                protected String paidtotalamount;
                @XmlElement(name = "TAX")
                protected String tax;
                @XmlElement(name = "PAID_TAX")
                protected String paidtax;
                @XmlElement(name = "CURRENCY")
                protected TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.CURRENCY currency;
                @XmlElement(name = "LIST_EMD_NUMBER")
                protected List<String> listemdnumber;
                @XmlElement(name = "REFUND_FEE_AMOUNT")
                protected String refundfeeamount;
                @XmlElement(name = "LIST_NON_REF_TAXES")
                protected List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.LISTNONREFTAXES> listnonreftaxes;

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAMOUNT() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAMOUNT(String value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the paidamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAIDAMOUNT() {
                    return paidamount;
                }

                /**
                 * Sets the value of the paidamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAIDAMOUNT(String value) {
                    this.paidamount = value;
                }

                /**
                 * Gets the value of the totalamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTOTALAMOUNT() {
                    return totalamount;
                }

                /**
                 * Sets the value of the totalamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTOTALAMOUNT(String value) {
                    this.totalamount = value;
                }

                /**
                 * Gets the value of the paidtotalamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAIDTOTALAMOUNT() {
                    return paidtotalamount;
                }

                /**
                 * Sets the value of the paidtotalamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAIDTOTALAMOUNT(String value) {
                    this.paidtotalamount = value;
                }

                /**
                 * Gets the value of the tax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTAX() {
                    return tax;
                }

                /**
                 * Sets the value of the tax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTAX(String value) {
                    this.tax = value;
                }

                /**
                 * Gets the value of the paidtax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAIDTAX() {
                    return paidtax;
                }

                /**
                 * Sets the value of the paidtax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAIDTAX(String value) {
                    this.paidtax = value;
                }

                /**
                 * Gets the value of the currency property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.CURRENCY }
                 *     
                 */
                public TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.CURRENCY getCURRENCY() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.CURRENCY }
                 *     
                 */
                public void setCURRENCY(TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.CURRENCY value) {
                    this.currency = value;
                }

                /**
                 * Gets the value of the listemdnumber property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listemdnumber property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTEMDNUMBER().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getLISTEMDNUMBER() {
                    if (listemdnumber == null) {
                        listemdnumber = new ArrayList<String>();
                    }
                    return this.listemdnumber;
                }

                /**
                 * Gets the value of the refundfeeamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFUNDFEEAMOUNT() {
                    return refundfeeamount;
                }

                /**
                 * Sets the value of the refundfeeamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFUNDFEEAMOUNT(String value) {
                    this.refundfeeamount = value;
                }

                /**
                 * Gets the value of the listnonreftaxes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listnonreftaxes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTNONREFTAXES().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.LISTNONREFTAXES }
                 * 
                 * 
                 */
                public List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.LISTNONREFTAXES> getLISTNONREFTAXES() {
                    if (listnonreftaxes == null) {
                        listnonreftaxes = new ArrayList<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTEMDAMOUNT.LISTNONREFTAXES>();
                    }
                    return this.listnonreftaxes;
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
                 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
                 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "name"
                })
                public static class CURRENCY
                    implements Serializable
                {

                    @XmlElement(name = "CODE", required = true)
                    protected String code;
                    @XmlElement(name = "NAME")
                    protected String name;

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
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNAME() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNAME(String value) {
                        this.name = value;
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
                 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
                public static class LISTNONREFTAXES
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
             *         &lt;element name="TRAVELLER_TYPE"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TRAVELLER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PAID_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PAID_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PAID_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="CURRENCY" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="LIST_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TICKET_NUMBER" type="{}unprotectedStringType"/&gt;
             *                   &lt;element name="PAX_TATOO_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="REFUND_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="LIST_NON_REF_TAXES" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "travellertype",
                "travellernumber",
                "amount",
                "paidamount",
                "totalamount",
                "paidtotalamount",
                "tax",
                "paidtax",
                "currency",
                "listticket",
                "refundfeeamount",
                "listnonreftaxes"
            })
            public static class LISTREFUNDAMOUNTBYPAXTYPE
                implements Serializable
            {

                @XmlElement(name = "TRAVELLER_TYPE", required = true)
                protected TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.TRAVELLERTYPE travellertype;
                @XmlElement(name = "TRAVELLER_NUMBER", required = true)
                protected String travellernumber;
                @XmlElement(name = "AMOUNT")
                protected String amount;
                @XmlElement(name = "PAID_AMOUNT")
                protected String paidamount;
                @XmlElement(name = "TOTAL_AMOUNT")
                protected String totalamount;
                @XmlElement(name = "PAID_TOTAL_AMOUNT")
                protected String paidtotalamount;
                @XmlElement(name = "TAX")
                protected String tax;
                @XmlElement(name = "PAID_TAX")
                protected String paidtax;
                @XmlElement(name = "CURRENCY")
                protected TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.CURRENCY currency;
                @XmlElement(name = "LIST_TICKET")
                protected List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTTICKET> listticket;
                @XmlElement(name = "REFUND_FEE_AMOUNT")
                protected String refundfeeamount;
                @XmlElement(name = "LIST_NON_REF_TAXES")
                protected List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTNONREFTAXES> listnonreftaxes;

                /**
                 * Gets the value of the travellertype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.TRAVELLERTYPE }
                 *     
                 */
                public TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.TRAVELLERTYPE getTRAVELLERTYPE() {
                    return travellertype;
                }

                /**
                 * Sets the value of the travellertype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.TRAVELLERTYPE }
                 *     
                 */
                public void setTRAVELLERTYPE(TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.TRAVELLERTYPE value) {
                    this.travellertype = value;
                }

                /**
                 * Gets the value of the travellernumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTRAVELLERNUMBER() {
                    return travellernumber;
                }

                /**
                 * Sets the value of the travellernumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTRAVELLERNUMBER(String value) {
                    this.travellernumber = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAMOUNT() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAMOUNT(String value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the paidamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAIDAMOUNT() {
                    return paidamount;
                }

                /**
                 * Sets the value of the paidamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAIDAMOUNT(String value) {
                    this.paidamount = value;
                }

                /**
                 * Gets the value of the totalamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTOTALAMOUNT() {
                    return totalamount;
                }

                /**
                 * Sets the value of the totalamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTOTALAMOUNT(String value) {
                    this.totalamount = value;
                }

                /**
                 * Gets the value of the paidtotalamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAIDTOTALAMOUNT() {
                    return paidtotalamount;
                }

                /**
                 * Sets the value of the paidtotalamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAIDTOTALAMOUNT(String value) {
                    this.paidtotalamount = value;
                }

                /**
                 * Gets the value of the tax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTAX() {
                    return tax;
                }

                /**
                 * Sets the value of the tax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTAX(String value) {
                    this.tax = value;
                }

                /**
                 * Gets the value of the paidtax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAIDTAX() {
                    return paidtax;
                }

                /**
                 * Sets the value of the paidtax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAIDTAX(String value) {
                    this.paidtax = value;
                }

                /**
                 * Gets the value of the currency property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.CURRENCY }
                 *     
                 */
                public TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.CURRENCY getCURRENCY() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.CURRENCY }
                 *     
                 */
                public void setCURRENCY(TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.CURRENCY value) {
                    this.currency = value;
                }

                /**
                 * Gets the value of the listticket property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listticket property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTTICKET().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTTICKET }
                 * 
                 * 
                 */
                public List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTTICKET> getLISTTICKET() {
                    if (listticket == null) {
                        listticket = new ArrayList<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTTICKET>();
                    }
                    return this.listticket;
                }

                /**
                 * Gets the value of the refundfeeamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFUNDFEEAMOUNT() {
                    return refundfeeamount;
                }

                /**
                 * Sets the value of the refundfeeamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFUNDFEEAMOUNT(String value) {
                    this.refundfeeamount = value;
                }

                /**
                 * Gets the value of the listnonreftaxes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listnonreftaxes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTNONREFTAXES().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTNONREFTAXES }
                 * 
                 * 
                 */
                public List<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTNONREFTAXES> getLISTNONREFTAXES() {
                    if (listnonreftaxes == null) {
                        listnonreftaxes = new ArrayList<TRIP.REFUND.LISTREFUNDAMOUNTS.LISTREFUNDAMOUNTBYPAXTYPE.LISTNONREFTAXES>();
                    }
                    return this.listnonreftaxes;
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
                 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
                 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "name"
                })
                public static class CURRENCY
                    implements Serializable
                {

                    @XmlElement(name = "CODE", required = true)
                    protected String code;
                    @XmlElement(name = "NAME")
                    protected String name;

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
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNAME() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNAME(String value) {
                        this.name = value;
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
                 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
                public static class LISTNONREFTAXES
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
                 *         &lt;element name="TICKET_NUMBER" type="{}unprotectedStringType"/&gt;
                 *         &lt;element name="PAX_TATOO_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "ticketnumber",
                    "paxtatoonumber"
                })
                public static class LISTTICKET
                    implements Serializable
                {

                    @XmlElement(name = "TICKET_NUMBER", required = true)
                    protected String ticketnumber;
                    @XmlElement(name = "PAX_TATOO_NUMBER", required = true)
                    protected String paxtatoonumber;

                    /**
                     * Gets the value of the ticketnumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTICKETNUMBER() {
                        return ticketnumber;
                    }

                    /**
                     * Sets the value of the ticketnumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTICKETNUMBER(String value) {
                        this.ticketnumber = value;
                    }

                    /**
                     * Gets the value of the paxtatoonumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPAXTATOONUMBER() {
                        return paxtatoonumber;
                    }

                    /**
                     * Sets the value of the paxtatoonumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPAXTATOONUMBER(String value) {
                        this.paxtatoonumber = value;
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
                 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
                 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "name"
                })
                public static class TRAVELLERTYPE
                    implements Serializable
                {

                    @XmlElement(name = "CODE", required = true)
                    protected String code;
                    @XmlElement(name = "NAME")
                    protected String name;

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
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNAME() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNAME(String value) {
                        this.name = value;
                    }

                }

            }

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
     *         &lt;element name="ELIGIBLE_TO_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ELIGIBLE_TO_WL_CONFIRMATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="WL_CONFIRMATION_NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EMD_UPGRADE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="REVENUE" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AWARD" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_UPGRADE" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="LIST_UPGRADE_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                                       &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                                       &lt;element name="CURRENCY"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="EMD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                                       &lt;element name="ORIGINAL_RBD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "eligibletoupgrade",
        "noneligibilityreason",
        "eligibletowlconfirmation",
        "wlconfirmationnoneligibilityreason",
        "emdupgrade"
    })
    public static class UPGRADE
        implements Serializable
    {

        @XmlElement(name = "ELIGIBLE_TO_UPGRADE")
        protected Boolean eligibletoupgrade;
        @XmlElement(name = "NON_ELIGIBILITY_REASON")
        protected String noneligibilityreason;
        @XmlElement(name = "ELIGIBLE_TO_WL_CONFIRMATION")
        protected Boolean eligibletowlconfirmation;
        @XmlElement(name = "WL_CONFIRMATION_NON_ELIGIBILITY_REASON")
        protected String wlconfirmationnoneligibilityreason;
        @XmlElement(name = "EMD_UPGRADE")
        protected TRIP.UPGRADE.EMDUPGRADE emdupgrade;

        /**
         * Gets the value of the eligibletoupgrade property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isELIGIBLETOUPGRADE() {
            return eligibletoupgrade;
        }

        /**
         * Sets the value of the eligibletoupgrade property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setELIGIBLETOUPGRADE(Boolean value) {
            this.eligibletoupgrade = value;
        }

        /**
         * Gets the value of the noneligibilityreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNONELIGIBILITYREASON() {
            return noneligibilityreason;
        }

        /**
         * Sets the value of the noneligibilityreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNONELIGIBILITYREASON(String value) {
            this.noneligibilityreason = value;
        }

        /**
         * Gets the value of the eligibletowlconfirmation property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isELIGIBLETOWLCONFIRMATION() {
            return eligibletowlconfirmation;
        }

        /**
         * Sets the value of the eligibletowlconfirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setELIGIBLETOWLCONFIRMATION(Boolean value) {
            this.eligibletowlconfirmation = value;
        }

        /**
         * Gets the value of the wlconfirmationnoneligibilityreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWLCONFIRMATIONNONELIGIBILITYREASON() {
            return wlconfirmationnoneligibilityreason;
        }

        /**
         * Sets the value of the wlconfirmationnoneligibilityreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWLCONFIRMATIONNONELIGIBILITYREASON(String value) {
            this.wlconfirmationnoneligibilityreason = value;
        }

        /**
         * Gets the value of the emdupgrade property.
         * 
         * @return
         *     possible object is
         *     {@link TRIP.UPGRADE.EMDUPGRADE }
         *     
         */
        public TRIP.UPGRADE.EMDUPGRADE getEMDUPGRADE() {
            return emdupgrade;
        }

        /**
         * Sets the value of the emdupgrade property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRIP.UPGRADE.EMDUPGRADE }
         *     
         */
        public void setEMDUPGRADE(TRIP.UPGRADE.EMDUPGRADE value) {
            this.emdupgrade = value;
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
         *         &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="REVENUE" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="AWARD" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_UPGRADE" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="LIST_UPGRADE_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                             &lt;element name="CURRENCY"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="EMD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                             &lt;element name="ORIGINAL_RBD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "eligibility",
            "listupgrade"
        })
        public static class EMDUPGRADE
            implements Serializable
        {

            @XmlElement(name = "ELIGIBILITY")
            protected TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY eligibility;
            @XmlElement(name = "LIST_UPGRADE")
            protected List<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE> listupgrade;

            /**
             * Gets the value of the eligibility property.
             * 
             * @return
             *     possible object is
             *     {@link TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY }
             *     
             */
            public TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY getELIGIBILITY() {
                return eligibility;
            }

            /**
             * Sets the value of the eligibility property.
             * 
             * @param value
             *     allowed object is
             *     {@link TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY }
             *     
             */
            public void setELIGIBILITY(TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY value) {
                this.eligibility = value;
            }

            /**
             * Gets the value of the listupgrade property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listupgrade property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTUPGRADE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE }
             * 
             * 
             */
            public List<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE> getLISTUPGRADE() {
                if (listupgrade == null) {
                    listupgrade = new ArrayList<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE>();
                }
                return this.listupgrade;
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
             *         &lt;element name="REVENUE" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="AWARD" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "revenue",
                "award"
            })
            public static class ELIGIBILITY
                implements Serializable
            {

                @XmlElement(name = "REVENUE")
                protected TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.REVENUE revenue;
                @XmlElement(name = "AWARD")
                protected TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.AWARD award;

                /**
                 * Gets the value of the revenue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.REVENUE }
                 *     
                 */
                public TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.REVENUE getREVENUE() {
                    return revenue;
                }

                /**
                 * Sets the value of the revenue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.REVENUE }
                 *     
                 */
                public void setREVENUE(TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.REVENUE value) {
                    this.revenue = value;
                }

                /**
                 * Gets the value of the award property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.AWARD }
                 *     
                 */
                public TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.AWARD getAWARD() {
                    return award;
                }

                /**
                 * Sets the value of the award property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.AWARD }
                 *     
                 */
                public void setAWARD(TRIP.UPGRADE.EMDUPGRADE.ELIGIBILITY.AWARD value) {
                    this.award = value;
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
                 *         &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "eligibletoemdupgrade",
                    "noneligibilityreason"
                })
                public static class AWARD
                    implements Serializable
                {

                    @XmlElement(name = "ELIGIBLE_TO_EMD_UPGRADE")
                    protected Boolean eligibletoemdupgrade;
                    @XmlElement(name = "NON_ELIGIBILITY_REASON")
                    protected String noneligibilityreason;

                    /**
                     * Gets the value of the eligibletoemdupgrade property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isELIGIBLETOEMDUPGRADE() {
                        return eligibletoemdupgrade;
                    }

                    /**
                     * Sets the value of the eligibletoemdupgrade property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setELIGIBLETOEMDUPGRADE(Boolean value) {
                        this.eligibletoemdupgrade = value;
                    }

                    /**
                     * Gets the value of the noneligibilityreason property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNONELIGIBILITYREASON() {
                        return noneligibilityreason;
                    }

                    /**
                     * Sets the value of the noneligibilityreason property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNONELIGIBILITYREASON(String value) {
                        this.noneligibilityreason = value;
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
                 *         &lt;element name="ELIGIBLE_TO_EMD_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "eligibletoemdupgrade",
                    "noneligibilityreason"
                })
                public static class REVENUE
                    implements Serializable
                {

                    @XmlElement(name = "ELIGIBLE_TO_EMD_UPGRADE")
                    protected Boolean eligibletoemdupgrade;
                    @XmlElement(name = "NON_ELIGIBILITY_REASON")
                    protected String noneligibilityreason;

                    /**
                     * Gets the value of the eligibletoemdupgrade property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isELIGIBLETOEMDUPGRADE() {
                        return eligibletoemdupgrade;
                    }

                    /**
                     * Sets the value of the eligibletoemdupgrade property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setELIGIBLETOEMDUPGRADE(Boolean value) {
                        this.eligibletoemdupgrade = value;
                    }

                    /**
                     * Gets the value of the noneligibilityreason property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNONELIGIBILITYREASON() {
                        return noneligibilityreason;
                    }

                    /**
                     * Sets the value of the noneligibilityreason property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNONELIGIBILITYREASON(String value) {
                        this.noneligibilityreason = value;
                    }

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
             *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="LIST_UPGRADE_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *                   &lt;element name="CURRENCY"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="EMD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *                   &lt;element name="ORIGINAL_RBD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                "type",
                "listupgradeprice",
                "emdnumber",
                "status",
                "listsegment",
                "travellerid"
            })
            public static class LISTUPGRADE
                implements Serializable
            {

                @XmlElement(name = "TYPE", required = true)
                protected Object type;
                @XmlElement(name = "LIST_UPGRADE_PRICE")
                protected List<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE> listupgradeprice;
                @XmlElement(name = "EMD_NUMBER")
                protected Object emdnumber;
                @XmlElement(name = "STATUS", required = true)
                protected Object status;
                @XmlElement(name = "LIST_SEGMENT", required = true)
                protected List<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTSEGMENT> listsegment;
                @XmlElement(name = "TRAVELLER_ID")
                protected Object travellerid;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getTYPE() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setTYPE(Object value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the listupgradeprice property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listupgradeprice property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTUPGRADEPRICE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE }
                 * 
                 * 
                 */
                public List<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE> getLISTUPGRADEPRICE() {
                    if (listupgradeprice == null) {
                        listupgradeprice = new ArrayList<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE>();
                    }
                    return this.listupgradeprice;
                }

                /**
                 * Gets the value of the emdnumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getEMDNUMBER() {
                    return emdnumber;
                }

                /**
                 * Sets the value of the emdnumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setEMDNUMBER(Object value) {
                    this.emdnumber = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSTATUS() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSTATUS(Object value) {
                    this.status = value;
                }

                /**
                 * Gets the value of the listsegment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listsegment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTSEGMENT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTSEGMENT }
                 * 
                 * 
                 */
                public List<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTSEGMENT> getLISTSEGMENT() {
                    if (listsegment == null) {
                        listsegment = new ArrayList<TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTSEGMENT>();
                    }
                    return this.listsegment;
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                 *         &lt;element name="ORIGINAL_RBD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                    "segmentid",
                    "originalrbd"
                })
                public static class LISTSEGMENT
                    implements Serializable
                {

                    @XmlElement(name = "SEGMENT_ID", required = true)
                    protected Object segmentid;
                    @XmlElement(name = "ORIGINAL_RBD")
                    protected Object originalrbd;

                    /**
                     * Gets the value of the segmentid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getSEGMENTID() {
                        return segmentid;
                    }

                    /**
                     * Sets the value of the segmentid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setSEGMENTID(Object value) {
                        this.segmentid = value;
                    }

                    /**
                     * Gets the value of the originalrbd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getORIGINALRBD() {
                        return originalrbd;
                    }

                    /**
                     * Sets the value of the originalrbd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setORIGINALRBD(Object value) {
                        this.originalrbd = value;
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
                 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                 *         &lt;element name="CURRENCY"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
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
                    "type",
                    "amount",
                    "currency"
                })
                public static class LISTUPGRADEPRICE
                    implements Serializable
                {

                    @XmlElement(name = "TYPE", required = true)
                    protected Object type;
                    @XmlElement(name = "AMOUNT", required = true)
                    protected Object amount;
                    @XmlElement(name = "CURRENCY", required = true)
                    protected TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE.CURRENCY currency;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getTYPE() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setTYPE(Object value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getAMOUNT() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setAMOUNT(Object value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the currency property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE.CURRENCY }
                     *     
                     */
                    public TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE.CURRENCY getCURRENCY() {
                        return currency;
                    }

                    /**
                     * Sets the value of the currency property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE.CURRENCY }
                     *     
                     */
                    public void setCURRENCY(TRIP.UPGRADE.EMDUPGRADE.LISTUPGRADE.LISTUPGRADEPRICE.CURRENCY value) {
                        this.currency = value;
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
                     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                        "name"
                    })
                    public static class CURRENCY
                        implements Serializable
                    {

                        @XmlElement(name = "CODE", required = true)
                        protected Object code;
                        @XmlElement(name = "NAME")
                        protected Object name;

                        /**
                         * Gets the value of the code property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getCODE() {
                            return code;
                        }

                        /**
                         * Sets the value of the code property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setCODE(Object value) {
                            this.code = value;
                        }

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getNAME() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setNAME(Object value) {
                            this.name = value;
                        }

                    }

                }

            }

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
     *         &lt;element name="TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GIFT_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="VALIDITY_LIMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="REDEMPTION_FEE" type="{}taxType" minOccurs="0"/&gt;
     *         &lt;element name="ADDITIONAL_REDEMPTION_FEE" type="{}taxType" minOccurs="0"/&gt;
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
        "type",
        "giftmessage",
        "validitylimitdate",
        "redemptionfee",
        "additionalredemptionfee"
    })
    public static class VOUCHER
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected TRIP.VOUCHER.TYPE type;
        @XmlElement(name = "GIFT_MESSAGE")
        protected Object giftmessage;
        @XmlElement(name = "VALIDITY_LIMIT_DATE")
        protected Object validitylimitdate;
        @XmlElement(name = "REDEMPTION_FEE")
        protected TaxType redemptionfee;
        @XmlElement(name = "ADDITIONAL_REDEMPTION_FEE")
        protected TaxType additionalredemptionfee;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link TRIP.VOUCHER.TYPE }
         *     
         */
        public TRIP.VOUCHER.TYPE getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRIP.VOUCHER.TYPE }
         *     
         */
        public void setTYPE(TRIP.VOUCHER.TYPE value) {
            this.type = value;
        }

        /**
         * Gets the value of the giftmessage property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getGIFTMESSAGE() {
            return giftmessage;
        }

        /**
         * Sets the value of the giftmessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setGIFTMESSAGE(Object value) {
            this.giftmessage = value;
        }

        /**
         * Gets the value of the validitylimitdate property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVALIDITYLIMITDATE() {
            return validitylimitdate;
        }

        /**
         * Sets the value of the validitylimitdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVALIDITYLIMITDATE(Object value) {
            this.validitylimitdate = value;
        }

        /**
         * Gets the value of the redemptionfee property.
         * 
         * @return
         *     possible object is
         *     {@link TaxType }
         *     
         */
        public TaxType getREDEMPTIONFEE() {
            return redemptionfee;
        }

        /**
         * Sets the value of the redemptionfee property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxType }
         *     
         */
        public void setREDEMPTIONFEE(TaxType value) {
            this.redemptionfee = value;
        }

        /**
         * Gets the value of the additionalredemptionfee property.
         * 
         * @return
         *     possible object is
         *     {@link TaxType }
         *     
         */
        public TaxType getADDITIONALREDEMPTIONFEE() {
            return additionalredemptionfee;
        }

        /**
         * Sets the value of the additionalredemptionfee property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxType }
         *     
         */
        public void setADDITIONALREDEMPTIONFEE(TaxType value) {
            this.additionalredemptionfee = value;
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "name",
            "subtype"
        })
        public static class TYPE
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected BigInteger code;
            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "SUBTYPE")
            protected String subtype;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCODE(BigInteger value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the subtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUBTYPE() {
                return subtype;
            }

            /**
             * Sets the value of the subtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUBTYPE(String value) {
                this.subtype = value;
            }

        }

    }

}
