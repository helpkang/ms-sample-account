
package com.koreanair.external.eretail.vo.tripplan.air;

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.common.common.CUSTOMREGIONType;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.FEEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.REBOOKBALANCEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.REBOOKFEEType;
import com.koreanair.external.eretail.vo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.external.eretail.vo.taxexemption.taxexemption.TAXEXEMPTIONDATA;
import com.koreanair.external.eretail.vo.tripplan.common.common_fare.FareType;
import com.koreanair.external.eretail.vo.tripplan.common.common_grouping.LISTSEGMENTGROUPINGS;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.TripplanPriceType;
import com.koreanair.external.eretail.vo.tripplan.common.common_technical_ids.TechnicalIds;
import com.koreanair.external.eretail.vo.tripplan.list_itinerary.LISTITINERARY;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{}airGroup"/&gt;
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
    "type",
    "itemid",
    "activegds",
    "segmenttatoo",
    "tatooother",
    "status",
    "description",
    "initialelement",
    "deletedelement",
    "isreplacing",
    "tobereplaced",
    "bookedelement",
    "itemidtobereplaced",
    "listtravellerid",
    "permissions",
    "eligibilityinformation",
    "pnrinformation",
    "issuedate",
    "technicalids",
    "actioncode",
    "company",
    "blocation",
    "bdate",
    "elocation",
    "edate",
    "fulfillingairline",
    "listcommercialfarefamily",
    "listpnr",
    "ticketingtimelimit",
    "ticketingtimelimitgds",
    "ticketingtimelimitgmt",
    "listsegmentgroupings",
    "listcanceltimelimit",
    "listcancelwarntimelimit",
    "faringamountdifferentfrompricing",
    "listtripprice",
    "listoldtripprice",
    "listpriceinfo",
    "listrules",
    "highestfare",
    "lowestfare",
    "lowestfareinpolicy",
    "boolisoutofpolicy",
    "justificationcode",
    "justificationcodedesc",
    "justificationfreetext",
    "seatassignmentfee",
    "listtaxexemption",
    "flowsignature",
    "listappliedfarediscount",
    "listredemption",
    "ticketdesignator",
    "conjunction",
    "_class",
    "listitinerary",
    "isairticketed",
    "isrestricteditinerary"
})
@XmlRootElement(name = "AIR")
public class AIR
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "ACTIVE_GDS")
    protected String activegds;
    @XmlElement(name = "SEGMENT_TATOO")
    protected BigInteger segmenttatoo;
    @XmlElement(name = "TATOO_OTHER")
    protected BigInteger tatooother;
    @XmlElement(name = "STATUS")
    protected AIR.STATUS status;
    @XmlElement(name = "DESCRIPTION")
    protected AIR.DESCRIPTION description;
    @XmlElement(name = "INITIAL_ELEMENT")
    protected Boolean initialelement;
    @XmlElement(name = "DELETED_ELEMENT")
    protected Boolean deletedelement;
    @XmlElement(name = "IS_REPLACING")
    protected Boolean isreplacing;
    @XmlElement(name = "TO_BE_REPLACED")
    protected Boolean tobereplaced;
    @XmlElement(name = "BOOKED_ELEMENT")
    protected Boolean bookedelement;
    @XmlElement(name = "ITEM_ID_TO_BE_REPLACED")
    protected BigInteger itemidtobereplaced;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "PERMISSIONS")
    protected AIR.PERMISSIONS permissions;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected AIR.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PNR_INFORMATION")
    protected AIR.PNRINFORMATION pnrinformation;
    @XmlElement(name = "ISSUE_DATE")
    protected AIR.ISSUEDATE issuedate;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;
    @XmlElement(name = "ACTION_CODE")
    protected String actioncode;
    @XmlElement(name = "COMPANY")
    protected AIR.COMPANY company;
    @XmlElement(name = "B_LOCATION")
    protected AIR.BLOCATION blocation;
    @XmlElement(name = "B_DATE")
    protected AIR.BDATE bdate;
    @XmlElement(name = "E_LOCATION")
    protected AIR.ELOCATION elocation;
    @XmlElement(name = "E_DATE")
    protected AIR.EDATE edate;
    @XmlElement(name = "FULFILLING_AIRLINE")
    protected AIR.FULFILLINGAIRLINE fulfillingairline;
    @XmlElement(name = "LIST_COMMERCIAL_FARE_FAMILY")
    protected List<AIR.LISTCOMMERCIALFAREFAMILY> listcommercialfarefamily;
    @XmlElement(name = "LIST_PNR")
    protected List<FareType> listpnr;
    @XmlElement(name = "TICKETING_TIME_LIMIT")
    protected AIR.TICKETINGTIMELIMIT ticketingtimelimit;
    @XmlElement(name = "TICKETING_TIME_LIMIT_GDS")
    protected AIR.TICKETINGTIMELIMITGDS ticketingtimelimitgds;
    @XmlElement(name = "TICKETING_TIME_LIMIT_GMT")
    protected AIR.TICKETINGTIMELIMITGMT ticketingtimelimitgmt;
    @XmlElement(name = "LIST_SEGMENT_GROUPINGS")
    protected List<LISTSEGMENTGROUPINGS> listsegmentgroupings;
    @XmlElement(name = "LIST_CANCEL_TIME_LIMIT")
    protected List<AIR.LISTCANCELTIMELIMIT> listcanceltimelimit;
    @XmlElement(name = "LIST_CANCEL_WARN_TIME_LIMIT")
    protected List<AIR.LISTCANCELWARNTIMELIMIT> listcancelwarntimelimit;
    @XmlElement(name = "FARING_AMOUNT_DIFFERENT_FROM_PRICING")
    protected Boolean faringamountdifferentfrompricing;
    @XmlElement(name = "LIST_TRIP_PRICE")
    protected List<AIR.LISTTRIPPRICE> listtripprice;
    @XmlElement(name = "LIST_OLD_TRIP_PRICE")
    protected List<TripplanPriceType> listoldtripprice;
    @XmlElement(name = "LIST_PRICE_INFO")
    protected List<LISTPRICEINFOType> listpriceinfo;
    @XmlElement(name = "LIST_RULES")
    protected List<AIR.LISTRULES> listrules;
    @XmlElement(name = "HIGHEST_FARE")
    protected AIR.HIGHESTFARE highestfare;
    @XmlElement(name = "LOWEST_FARE")
    protected AIR.LOWESTFARE lowestfare;
    @XmlElement(name = "LOWEST_FARE_IN_POLICY")
    protected AIR.LOWESTFAREINPOLICY lowestfareinpolicy;
    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "JUSTIFICATION_CODE")
    protected String justificationcode;
    @XmlElement(name = "JUSTIFICATION_CODE_DESC")
    protected String justificationcodedesc;
    @XmlElement(name = "JUSTIFICATION_FREE_TEXT")
    protected String justificationfreetext;
    @XmlElement(name = "SEAT_ASSIGNMENT_FEE")
    protected AIR.SEATASSIGNMENTFEE seatassignmentfee;
    @XmlElement(name = "LIST_TAX_EXEMPTION")
    protected List<TAXEXEMPTIONDATA> listtaxexemption;
    @XmlElement(name = "FLOW_SIGNATURE")
    protected FLOWSIGNATUREType flowsignature;
    @XmlElement(name = "LIST_APPLIED_FARE_DISCOUNT")
    protected List<AIR.LISTAPPLIEDFAREDISCOUNT> listappliedfarediscount;
    @XmlElement(name = "LIST_REDEMPTION")
    protected List<AIR.LISTREDEMPTION> listredemption;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
    @XmlElement(name = "CONJUNCTION")
    protected String conjunction;
    @XmlElement(name = "CLASS")
    protected String _class;
    @XmlElement(name = "LIST_ITINERARY")
    protected List<LISTITINERARY> listitinerary;
    @XmlElement(name = "IS_AIR_TICKETED")
    protected Boolean isairticketed;
    @XmlElement(name = "IS_RESTRICTED_ITINERARY")
    protected Boolean isrestricteditinerary;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the activegds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVEGDS() {
        return activegds;
    }

    /**
     * Sets the value of the activegds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVEGDS(String value) {
        this.activegds = value;
    }

    /**
     * Gets the value of the segmenttatoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTTATOO() {
        return segmenttatoo;
    }

    /**
     * Sets the value of the segmenttatoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTTATOO(BigInteger value) {
        this.segmenttatoo = value;
    }

    /**
     * Gets the value of the tatooother property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTATOOOTHER() {
        return tatooother;
    }

    /**
     * Sets the value of the tatooother property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTATOOOTHER(BigInteger value) {
        this.tatooother = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.STATUS }
     *     
     */
    public AIR.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.STATUS }
     *     
     */
    public void setSTATUS(AIR.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.DESCRIPTION }
     *     
     */
    public AIR.DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(AIR.DESCRIPTION value) {
        this.description = value;
    }

    /**
     * Gets the value of the initialelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINITIALELEMENT() {
        return initialelement;
    }

    /**
     * Sets the value of the initialelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINITIALELEMENT(Boolean value) {
        this.initialelement = value;
    }

    /**
     * Gets the value of the deletedelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDELETEDELEMENT() {
        return deletedelement;
    }

    /**
     * Sets the value of the deletedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDELETEDELEMENT(Boolean value) {
        this.deletedelement = value;
    }

    /**
     * Gets the value of the isreplacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREPLACING() {
        return isreplacing;
    }

    /**
     * Sets the value of the isreplacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREPLACING(Boolean value) {
        this.isreplacing = value;
    }

    /**
     * Gets the value of the tobereplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTOBEREPLACED() {
        return tobereplaced;
    }

    /**
     * Sets the value of the tobereplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTOBEREPLACED(Boolean value) {
        this.tobereplaced = value;
    }

    /**
     * Gets the value of the bookedelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOKEDELEMENT() {
        return bookedelement;
    }

    /**
     * Sets the value of the bookedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOKEDELEMENT(Boolean value) {
        this.bookedelement = value;
    }

    /**
     * Gets the value of the itemidtobereplaced property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMIDTOBEREPLACED() {
        return itemidtobereplaced;
    }

    /**
     * Sets the value of the itemidtobereplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMIDTOBEREPLACED(BigInteger value) {
        this.itemidtobereplaced = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.PERMISSIONS }
     *     
     */
    public AIR.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(AIR.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.ELIGIBILITYINFORMATION }
     *     
     */
    public AIR.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(AIR.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the pnrinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.PNRINFORMATION }
     *     
     */
    public AIR.PNRINFORMATION getPNRINFORMATION() {
        return pnrinformation;
    }

    /**
     * Sets the value of the pnrinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.PNRINFORMATION }
     *     
     */
    public void setPNRINFORMATION(AIR.PNRINFORMATION value) {
        this.pnrinformation = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.ISSUEDATE }
     *     
     */
    public AIR.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(AIR.ISSUEDATE value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the technicalids property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalIds }
     *     
     */
    public TechnicalIds getTECHNICALIDS() {
        return technicalids;
    }

    /**
     * Sets the value of the technicalids property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalIds }
     *     
     */
    public void setTECHNICALIDS(TechnicalIds value) {
        this.technicalids = value;
    }

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIONCODE() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIONCODE(String value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.COMPANY }
     *     
     */
    public AIR.COMPANY getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.COMPANY }
     *     
     */
    public void setCOMPANY(AIR.COMPANY value) {
        this.company = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.BLOCATION }
     *     
     */
    public AIR.BLOCATION getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.BLOCATION }
     *     
     */
    public void setBLOCATION(AIR.BLOCATION value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.BDATE }
     *     
     */
    public AIR.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.BDATE }
     *     
     */
    public void setBDATE(AIR.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.ELOCATION }
     *     
     */
    public AIR.ELOCATION getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.ELOCATION }
     *     
     */
    public void setELOCATION(AIR.ELOCATION value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.EDATE }
     *     
     */
    public AIR.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.EDATE }
     *     
     */
    public void setEDATE(AIR.EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the fulfillingairline property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.FULFILLINGAIRLINE }
     *     
     */
    public AIR.FULFILLINGAIRLINE getFULFILLINGAIRLINE() {
        return fulfillingairline;
    }

    /**
     * Sets the value of the fulfillingairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.FULFILLINGAIRLINE }
     *     
     */
    public void setFULFILLINGAIRLINE(AIR.FULFILLINGAIRLINE value) {
        this.fulfillingairline = value;
    }

    /**
     * Gets the value of the listcommercialfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommercialfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMERCIALFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTCOMMERCIALFAREFAMILY }
     * 
     * 
     */
    public List<AIR.LISTCOMMERCIALFAREFAMILY> getLISTCOMMERCIALFAREFAMILY() {
        if (listcommercialfarefamily == null) {
            listcommercialfarefamily = new ArrayList<AIR.LISTCOMMERCIALFAREFAMILY>();
        }
        return this.listcommercialfarefamily;
    }

    /**
     * Gets the value of the listpnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareType }
     * 
     * 
     */
    public List<FareType> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<FareType>();
        }
        return this.listpnr;
    }

    /**
     * Gets the value of the ticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.TICKETINGTIMELIMIT }
     *     
     */
    public AIR.TICKETINGTIMELIMIT getTICKETINGTIMELIMIT() {
        return ticketingtimelimit;
    }

    /**
     * Sets the value of the ticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.TICKETINGTIMELIMIT }
     *     
     */
    public void setTICKETINGTIMELIMIT(AIR.TICKETINGTIMELIMIT value) {
        this.ticketingtimelimit = value;
    }

    /**
     * Gets the value of the ticketingtimelimitgds property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.TICKETINGTIMELIMITGDS }
     *     
     */
    public AIR.TICKETINGTIMELIMITGDS getTICKETINGTIMELIMITGDS() {
        return ticketingtimelimitgds;
    }

    /**
     * Sets the value of the ticketingtimelimitgds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.TICKETINGTIMELIMITGDS }
     *     
     */
    public void setTICKETINGTIMELIMITGDS(AIR.TICKETINGTIMELIMITGDS value) {
        this.ticketingtimelimitgds = value;
    }

    /**
     * Gets the value of the ticketingtimelimitgmt property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.TICKETINGTIMELIMITGMT }
     *     
     */
    public AIR.TICKETINGTIMELIMITGMT getTICKETINGTIMELIMITGMT() {
        return ticketingtimelimitgmt;
    }

    /**
     * Sets the value of the ticketingtimelimitgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.TICKETINGTIMELIMITGMT }
     *     
     */
    public void setTICKETINGTIMELIMITGMT(AIR.TICKETINGTIMELIMITGMT value) {
        this.ticketingtimelimitgmt = value;
    }

    /**
     * Gets the value of the listsegmentgroupings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentgroupings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTGROUPINGS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSEGMENTGROUPINGS }
     * 
     * 
     */
    public List<LISTSEGMENTGROUPINGS> getLISTSEGMENTGROUPINGS() {
        if (listsegmentgroupings == null) {
            listsegmentgroupings = new ArrayList<LISTSEGMENTGROUPINGS>();
        }
        return this.listsegmentgroupings;
    }

    /**
     * Gets the value of the listcanceltimelimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcanceltimelimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELTIMELIMIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTCANCELTIMELIMIT }
     * 
     * 
     */
    public List<AIR.LISTCANCELTIMELIMIT> getLISTCANCELTIMELIMIT() {
        if (listcanceltimelimit == null) {
            listcanceltimelimit = new ArrayList<AIR.LISTCANCELTIMELIMIT>();
        }
        return this.listcanceltimelimit;
    }

    /**
     * Gets the value of the listcancelwarntimelimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcancelwarntimelimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELWARNTIMELIMIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTCANCELWARNTIMELIMIT }
     * 
     * 
     */
    public List<AIR.LISTCANCELWARNTIMELIMIT> getLISTCANCELWARNTIMELIMIT() {
        if (listcancelwarntimelimit == null) {
            listcancelwarntimelimit = new ArrayList<AIR.LISTCANCELWARNTIMELIMIT>();
        }
        return this.listcancelwarntimelimit;
    }

    /**
     * Gets the value of the faringamountdifferentfrompricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFARINGAMOUNTDIFFERENTFROMPRICING() {
        return faringamountdifferentfrompricing;
    }

    /**
     * Sets the value of the faringamountdifferentfrompricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFARINGAMOUNTDIFFERENTFROMPRICING(Boolean value) {
        this.faringamountdifferentfrompricing = value;
    }

    /**
     * Gets the value of the listtripprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTTRIPPRICE }
     * 
     * 
     */
    public List<AIR.LISTTRIPPRICE> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<AIR.LISTTRIPPRICE>();
        }
        return this.listtripprice;
    }

    /**
     * Gets the value of the listoldtripprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoldtripprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOLDTRIPPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripplanPriceType }
     * 
     * 
     */
    public List<TripplanPriceType> getLISTOLDTRIPPRICE() {
        if (listoldtripprice == null) {
            listoldtripprice = new ArrayList<TripplanPriceType>();
        }
        return this.listoldtripprice;
    }

    /**
     * Gets the value of the listpriceinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpriceinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICEINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICEINFOType }
     * 
     * 
     */
    public List<LISTPRICEINFOType> getLISTPRICEINFO() {
        if (listpriceinfo == null) {
            listpriceinfo = new ArrayList<LISTPRICEINFOType>();
        }
        return this.listpriceinfo;
    }

    /**
     * Gets the value of the listrules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRULES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTRULES }
     * 
     * 
     */
    public List<AIR.LISTRULES> getLISTRULES() {
        if (listrules == null) {
            listrules = new ArrayList<AIR.LISTRULES>();
        }
        return this.listrules;
    }

    /**
     * Gets the value of the highestfare property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.HIGHESTFARE }
     *     
     */
    public AIR.HIGHESTFARE getHIGHESTFARE() {
        return highestfare;
    }

    /**
     * Sets the value of the highestfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.HIGHESTFARE }
     *     
     */
    public void setHIGHESTFARE(AIR.HIGHESTFARE value) {
        this.highestfare = value;
    }

    /**
     * Gets the value of the lowestfare property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.LOWESTFARE }
     *     
     */
    public AIR.LOWESTFARE getLOWESTFARE() {
        return lowestfare;
    }

    /**
     * Sets the value of the lowestfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.LOWESTFARE }
     *     
     */
    public void setLOWESTFARE(AIR.LOWESTFARE value) {
        this.lowestfare = value;
    }

    /**
     * Gets the value of the lowestfareinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.LOWESTFAREINPOLICY }
     *     
     */
    public AIR.LOWESTFAREINPOLICY getLOWESTFAREINPOLICY() {
        return lowestfareinpolicy;
    }

    /**
     * Sets the value of the lowestfareinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.LOWESTFAREINPOLICY }
     *     
     */
    public void setLOWESTFAREINPOLICY(AIR.LOWESTFAREINPOLICY value) {
        this.lowestfareinpolicy = value;
    }

    /**
     * Gets the value of the boolisoutofpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLISOUTOFPOLICY() {
        return boolisoutofpolicy;
    }

    /**
     * Sets the value of the boolisoutofpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLISOUTOFPOLICY(Boolean value) {
        this.boolisoutofpolicy = value;
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
     * Gets the value of the seatassignmentfee property.
     * 
     * @return
     *     possible object is
     *     {@link AIR.SEATASSIGNMENTFEE }
     *     
     */
    public AIR.SEATASSIGNMENTFEE getSEATASSIGNMENTFEE() {
        return seatassignmentfee;
    }

    /**
     * Sets the value of the seatassignmentfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIR.SEATASSIGNMENTFEE }
     *     
     */
    public void setSEATASSIGNMENTFEE(AIR.SEATASSIGNMENTFEE value) {
        this.seatassignmentfee = value;
    }

    /**
     * Gets the value of the listtaxexemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtaxexemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAXEXEMPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAXEXEMPTIONDATA }
     * 
     * 
     */
    public List<TAXEXEMPTIONDATA> getLISTTAXEXEMPTION() {
        if (listtaxexemption == null) {
            listtaxexemption = new ArrayList<TAXEXEMPTIONDATA>();
        }
        return this.listtaxexemption;
    }

    /**
     * Gets the value of the flowsignature property.
     * 
     * @return
     *     possible object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public FLOWSIGNATUREType getFLOWSIGNATURE() {
        return flowsignature;
    }

    /**
     * Sets the value of the flowsignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public void setFLOWSIGNATURE(FLOWSIGNATUREType value) {
        this.flowsignature = value;
    }

    /**
     * Gets the value of the listappliedfarediscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listappliedfarediscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPPLIEDFAREDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTAPPLIEDFAREDISCOUNT }
     * 
     * 
     */
    public List<AIR.LISTAPPLIEDFAREDISCOUNT> getLISTAPPLIEDFAREDISCOUNT() {
        if (listappliedfarediscount == null) {
            listappliedfarediscount = new ArrayList<AIR.LISTAPPLIEDFAREDISCOUNT>();
        }
        return this.listappliedfarediscount;
    }

    /**
     * Gets the value of the listredemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTREDEMPTION }
     * 
     * 
     */
    public List<AIR.LISTREDEMPTION> getLISTREDEMPTION() {
        if (listredemption == null) {
            listredemption = new ArrayList<AIR.LISTREDEMPTION>();
        }
        return this.listredemption;
    }

    /**
     * Gets the value of the ticketdesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETDESIGNATOR() {
        return ticketdesignator;
    }

    /**
     * Sets the value of the ticketdesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETDESIGNATOR(String value) {
        this.ticketdesignator = value;
    }

    /**
     * Gets the value of the conjunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONJUNCTION() {
        return conjunction;
    }

    /**
     * Sets the value of the conjunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONJUNCTION(String value) {
        this.conjunction = value;
    }

    /**
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASS(String value) {
        this._class = value;
    }

    /**
     * Gets the value of the listitinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARY }
     * 
     * 
     */
    public List<LISTITINERARY> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<LISTITINERARY>();
        }
        return this.listitinerary;
    }

    /**
     * Gets the value of the isairticketed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISAIRTICKETED() {
        return isairticketed;
    }

    /**
     * Sets the value of the isairticketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISAIRTICKETED(Boolean value) {
        this.isairticketed = value;
    }

    /**
     * Gets the value of the isrestricteditinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISRESTRICTEDITINERARY() {
        return isrestricteditinerary;
    }

    /**
     * Sets the value of the isrestricteditinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISRESTRICTEDITINERARY(Boolean value) {
        this.isrestricteditinerary = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
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
     *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CUSTOM_REGION" type="{}CUSTOM_REGION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "citycode",
        "cityname",
        "locationcode",
        "locationname",
        "statecode",
        "statename",
        "countrycode",
        "countryname",
        "listcustomregion"
    })
    public static class BLOCATION
        implements Serializable
    {

        @XmlElement(name = "CITY_CODE")
        protected String citycode;
        @XmlElement(name = "CITY_NAME")
        protected String cityname;
        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME")
        protected String locationname;
        @XmlElement(name = "STATE_CODE")
        protected String statecode;
        @XmlElement(name = "STATE_NAME")
        protected String statename;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;
        @XmlElement(name = "COUNTRY_NAME")
        protected String countryname;
        @XmlElement(name = "LIST_CUSTOM_REGION")
        protected List<CUSTOMREGIONType> listcustomregion;

        /**
         * Gets the value of the citycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * Sets the value of the citycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * Gets the value of the cityname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYNAME() {
            return cityname;
        }

        /**
         * Sets the value of the cityname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYNAME(String value) {
            this.cityname = value;
        }

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
        }

        /**
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

        /**
         * Gets the value of the statecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATECODE() {
            return statecode;
        }

        /**
         * Sets the value of the statecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATECODE(String value) {
            this.statecode = value;
        }

        /**
         * Gets the value of the statename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATENAME() {
            return statename;
        }

        /**
         * Sets the value of the statename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATENAME(String value) {
            this.statename = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

        /**
         * Gets the value of the countryname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYNAME() {
            return countryname;
        }

        /**
         * Sets the value of the countryname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYNAME(String value) {
            this.countryname = value;
        }

        /**
         * Gets the value of the listcustomregion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcustomregion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCUSTOMREGION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CUSTOMREGIONType }
         * 
         * 
         */
        public List<CUSTOMREGIONType> getLISTCUSTOMREGION() {
            if (listcustomregion == null) {
                listcustomregion = new ArrayList<CUSTOMREGIONType>();
            }
            return this.listcustomregion;
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
    public static class COMPANY
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
    public static class DESCRIPTION
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
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
     *         &lt;element name="IS_ELIGIBLE_FOR_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_ELIGIBLE_FOR_REBOOK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "iseligibleforupgrade",
        "iseligibleforrebook",
        "priceforupgradeinvouchers",
        "priceforupgradeinmiles"
    })
    public static class ELIGIBILITYINFORMATION
        implements Serializable
    {

        @XmlElement(name = "IS_ELIGIBLE_FOR_UPGRADE")
        protected Boolean iseligibleforupgrade;
        @XmlElement(name = "IS_ELIGIBLE_FOR_REBOOK")
        protected Boolean iseligibleforrebook;
        @XmlElement(name = "PRICE_FOR_UPGRADE_IN_VOUCHERS")
        protected BigInteger priceforupgradeinvouchers;
        @XmlElement(name = "PRICE_FOR_UPGRADE_IN_MILES")
        protected BigInteger priceforupgradeinmiles;

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
     *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CUSTOM_REGION" type="{}CUSTOM_REGION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "citycode",
        "cityname",
        "locationcode",
        "locationname",
        "statecode",
        "statename",
        "countrycode",
        "countryname",
        "listcustomregion"
    })
    public static class ELOCATION
        implements Serializable
    {

        @XmlElement(name = "CITY_CODE")
        protected String citycode;
        @XmlElement(name = "CITY_NAME")
        protected String cityname;
        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME")
        protected String locationname;
        @XmlElement(name = "STATE_CODE")
        protected String statecode;
        @XmlElement(name = "STATE_NAME")
        protected String statename;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;
        @XmlElement(name = "COUNTRY_NAME")
        protected String countryname;
        @XmlElement(name = "LIST_CUSTOM_REGION")
        protected List<CUSTOMREGIONType> listcustomregion;

        /**
         * Gets the value of the citycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * Sets the value of the citycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * Gets the value of the cityname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYNAME() {
            return cityname;
        }

        /**
         * Sets the value of the cityname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYNAME(String value) {
            this.cityname = value;
        }

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
        }

        /**
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

        /**
         * Gets the value of the statecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATECODE() {
            return statecode;
        }

        /**
         * Sets the value of the statecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATECODE(String value) {
            this.statecode = value;
        }

        /**
         * Gets the value of the statename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATENAME() {
            return statename;
        }

        /**
         * Sets the value of the statename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATENAME(String value) {
            this.statename = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

        /**
         * Gets the value of the countryname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYNAME() {
            return countryname;
        }

        /**
         * Sets the value of the countryname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYNAME(String value) {
            this.countryname = value;
        }

        /**
         * Gets the value of the listcustomregion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcustomregion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCUSTOMREGION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CUSTOMREGIONType }
         * 
         * 
         */
        public List<CUSTOMREGIONType> getLISTCUSTOMREGION() {
            if (listcustomregion == null) {
                listcustomregion = new ArrayList<CUSTOMREGIONType>();
            }
            return this.listcustomregion;
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
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class FULFILLINGAIRLINE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
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
     *         &lt;element name="LIST_TRIP_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded"/&gt;
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
        "listtripprice"
    })
    public static class HIGHESTFARE
        implements Serializable
    {

        @XmlElement(name = "LIST_TRIP_PRICE", required = true)
        protected List<TripplanPriceType> listtripprice;

        /**
         * Gets the value of the listtripprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtripprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRIPPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TripplanPriceType }
         * 
         * 
         */
        public List<TripplanPriceType> getLISTTRIPPRICE() {
            if (listtripprice == null) {
                listtripprice = new ArrayList<TripplanPriceType>();
            }
            return this.listtripprice;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ISSUEDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
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
     *         &lt;element ref="{}DISCOUNT_CODE"/&gt;
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
        "discountcode"
    })
    public static class LISTAPPLIEDFAREDISCOUNT
        implements Serializable
    {

        @XmlElement(name = "DISCOUNT_CODE", required = true)
        protected String discountcode;

        /**
         * Gets the value of the discountcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCOUNTCODE() {
            return discountcode;
        }

        /**
         * Sets the value of the discountcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCOUNTCODE(String value) {
            this.discountcode = value;
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
     *         &lt;element name="DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
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
        "date",
        "listsegment"
    })
    public static class LISTCANCELTIMELIMIT
        implements Serializable
    {

        @XmlElement(name = "DATE", required = true)
        protected AIR.LISTCANCELTIMELIMIT.DATE date;
        @XmlElement(name = "LIST_SEGMENT", required = true)
        protected List<AIR.LISTCANCELTIMELIMIT.LISTSEGMENT> listsegment;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTCANCELTIMELIMIT.DATE }
         *     
         */
        public AIR.LISTCANCELTIMELIMIT.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTCANCELTIMELIMIT.DATE }
         *     
         */
        public void setDATE(AIR.LISTCANCELTIMELIMIT.DATE value) {
            this.date = value;
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
         * {@link AIR.LISTCANCELTIMELIMIT.LISTSEGMENT }
         * 
         * 
         */
        public List<AIR.LISTCANCELTIMELIMIT.LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<AIR.LISTCANCELTIMELIMIT.LISTSEGMENT>();
            }
            return this.listsegment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DATE
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCode(XMLGregorianCalendar value) {
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
         *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
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
            "segmentid"
        })
        public static class LISTSEGMENT
            implements Serializable
        {

            @XmlElement(name = "SEGMENT_ID", required = true)
            protected List<BigInteger> segmentid;

            /**
             * Gets the value of the segmentid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the segmentid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSEGMENTID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getSEGMENTID() {
                if (segmentid == null) {
                    segmentid = new ArrayList<BigInteger>();
                }
                return this.segmentid;
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
     *         &lt;element name="DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
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
        "date",
        "listsegment"
    })
    public static class LISTCANCELWARNTIMELIMIT
        implements Serializable
    {

        @XmlElement(name = "DATE", required = true)
        protected AIR.LISTCANCELWARNTIMELIMIT.DATE date;
        @XmlElement(name = "LIST_SEGMENT", required = true)
        protected List<AIR.LISTCANCELWARNTIMELIMIT.LISTSEGMENT> listsegment;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTCANCELWARNTIMELIMIT.DATE }
         *     
         */
        public AIR.LISTCANCELWARNTIMELIMIT.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTCANCELWARNTIMELIMIT.DATE }
         *     
         */
        public void setDATE(AIR.LISTCANCELWARNTIMELIMIT.DATE value) {
            this.date = value;
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
         * {@link AIR.LISTCANCELWARNTIMELIMIT.LISTSEGMENT }
         * 
         * 
         */
        public List<AIR.LISTCANCELWARNTIMELIMIT.LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<AIR.LISTCANCELWARNTIMELIMIT.LISTSEGMENT>();
            }
            return this.listsegment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DATE
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCode(XMLGregorianCalendar value) {
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
         *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
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
            "segmentid"
        })
        public static class LISTSEGMENT
            implements Serializable
        {

            @XmlElement(name = "SEGMENT_ID", required = true)
            protected List<BigInteger> segmentid;

            /**
             * Gets the value of the segmentid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the segmentid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSEGMENTID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getSEGMENTID() {
                if (segmentid == null) {
                    segmentid = new ArrayList<BigInteger>();
                }
                return this.segmentid;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="PANEL_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SET_INDEX" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="BOUND_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "paneltype",
        "setindex",
        "boundid",
        "listelementid"
    })
    public static class LISTCOMMERCIALFAREFAMILY
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "PANEL_TYPE")
        protected String paneltype;
        @XmlElement(name = "SET_INDEX")
        protected String setindex;
        @XmlElement(name = "BOUND_ID")
        protected String boundid;
        @XmlElement(name = "LIST_ELEMENT_ID")
        protected List<BigInteger> listelementid;

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
         * Gets the value of the paneltype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPANELTYPE() {
            return paneltype;
        }

        /**
         * Sets the value of the paneltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPANELTYPE(String value) {
            this.paneltype = value;
        }

        /**
         * Gets the value of the setindex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETINDEX() {
            return setindex;
        }

        /**
         * Sets the value of the setindex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETINDEX(String value) {
            this.setindex = value;
        }

        /**
         * Gets the value of the boundid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOUNDID() {
            return boundid;
        }

        /**
         * Sets the value of the boundid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOUNDID(String value) {
            this.boundid = value;
        }

        /**
         * Gets the value of the listelementid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listelementid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTELEMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTELEMENTID() {
            if (listelementid == null) {
                listelementid = new ArrayList<BigInteger>();
            }
            return this.listelementid;
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
     *         &lt;element name="TYPE"&gt;
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
     *         &lt;element name="SUBTYPE" minOccurs="0"&gt;
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
     *         &lt;element name="ADDITIONAL_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ALL_INCLUSIVE_ELIGIBILITY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="MILES_OPEN_CONNECTOR_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "subtype",
        "additionalinformation"
    })
    public static class LISTREDEMPTION
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected AIR.LISTREDEMPTION.TYPE type;
        @XmlElement(name = "SUBTYPE")
        protected AIR.LISTREDEMPTION.SUBTYPE subtype;
        @XmlElement(name = "ADDITIONAL_INFORMATION")
        protected AIR.LISTREDEMPTION.ADDITIONALINFORMATION additionalinformation;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTREDEMPTION.TYPE }
         *     
         */
        public AIR.LISTREDEMPTION.TYPE getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTREDEMPTION.TYPE }
         *     
         */
        public void setTYPE(AIR.LISTREDEMPTION.TYPE value) {
            this.type = value;
        }

        /**
         * Gets the value of the subtype property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTREDEMPTION.SUBTYPE }
         *     
         */
        public AIR.LISTREDEMPTION.SUBTYPE getSUBTYPE() {
            return subtype;
        }

        /**
         * Sets the value of the subtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTREDEMPTION.SUBTYPE }
         *     
         */
        public void setSUBTYPE(AIR.LISTREDEMPTION.SUBTYPE value) {
            this.subtype = value;
        }

        /**
         * Gets the value of the additionalinformation property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTREDEMPTION.ADDITIONALINFORMATION }
         *     
         */
        public AIR.LISTREDEMPTION.ADDITIONALINFORMATION getADDITIONALINFORMATION() {
            return additionalinformation;
        }

        /**
         * Sets the value of the additionalinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTREDEMPTION.ADDITIONALINFORMATION }
         *     
         */
        public void setADDITIONALINFORMATION(AIR.LISTREDEMPTION.ADDITIONALINFORMATION value) {
            this.additionalinformation = value;
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
         *         &lt;element name="ALL_INCLUSIVE_ELIGIBILITY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="MILES_OPEN_CONNECTOR_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "allinclusiveeligibility",
            "milesopenconnectorstatus"
        })
        public static class ADDITIONALINFORMATION
            implements Serializable
        {

            @XmlElement(name = "ALL_INCLUSIVE_ELIGIBILITY", required = true)
            protected Object allinclusiveeligibility;
            @XmlElement(name = "MILES_OPEN_CONNECTOR_STATUS")
            protected String milesopenconnectorstatus;

            /**
             * Gets the value of the allinclusiveeligibility property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getALLINCLUSIVEELIGIBILITY() {
                return allinclusiveeligibility;
            }

            /**
             * Sets the value of the allinclusiveeligibility property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setALLINCLUSIVEELIGIBILITY(Object value) {
                this.allinclusiveeligibility = value;
            }

            /**
             * Gets the value of the milesopenconnectorstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMILESOPENCONNECTORSTATUS() {
                return milesopenconnectorstatus;
            }

            /**
             * Sets the value of the milesopenconnectorstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMILESOPENCONNECTORSTATUS(String value) {
                this.milesopenconnectorstatus = value;
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
        public static class SUBTYPE
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
        public static class TYPE
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
     *         &lt;element name="FARE_FAMILY"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DESCRIPTION" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
        "farefamily",
        "description"
    })
    public static class LISTRULES
        implements Serializable
    {

        @XmlElement(name = "FARE_FAMILY", required = true)
        protected AIR.LISTRULES.FAREFAMILY farefamily;
        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the farefamily property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTRULES.FAREFAMILY }
         *     
         */
        public AIR.LISTRULES.FAREFAMILY getFAREFAMILY() {
            return farefamily;
        }

        /**
         * Sets the value of the farefamily property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTRULES.FAREFAMILY }
         *     
         */
        public void setFAREFAMILY(AIR.LISTRULES.FAREFAMILY value) {
            this.farefamily = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class FAREFAMILY
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME", required = true)
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
     *         &lt;element name="LIST_FARE_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{}AMOUNT" minOccurs="0"/&gt;
     *                   &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
     *                   &lt;element ref="{}TAX" minOccurs="0"/&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="MILES_COST" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="ADDITIONAL_MILES_COST_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="TAX_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="REFUNDABLE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="EXPIRED" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TAX_DETAILS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GST_TAX" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="OTHER_TAX" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OLD_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="WEB_FARE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT_CARD_FEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="BLUEBIZ_CREDITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SERVICE_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="SURCHARGES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="REBOOK_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
     *         &lt;element name="NO_SHOW_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
     *         &lt;element name="COLLECT_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
     *         &lt;element name="REBOOK_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
     *         &lt;element name="REFUND_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
     *         &lt;element name="NON_REUSABLE_VALUE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{}LIST_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT_WITH_FEES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element ref="{}ESTIMATED_DISCOUNT_AMOUNT" minOccurs="0"/&gt;
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
        "listfareinfo",
        "amount",
        "milescost",
        "additionalmilescostinfo",
        "amountwithouttax",
        "tax",
        "taxdetails",
        "exchangerate",
        "currency",
        "oldprice",
        "webfarediscount",
        "paymentcardfee",
        "bluebizcredits",
        "servicefeeamount",
        "totalamount",
        "surcharges",
        "rebookfee",
        "noshowfee",
        "collectbalance",
        "rebookbalance",
        "refundbalance",
        "nonreusablevalue",
        "listfee",
        "amountwithfees",
        "estimateddiscountamount"
    })
    public static class LISTTRIPPRICE
        implements Serializable
    {

        @XmlElement(name = "LIST_FARE_INFO")
        protected List<AIR.LISTTRIPPRICE.LISTFAREINFO> listfareinfo;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "MILES_COST")
        protected Integer milescost;
        @XmlElement(name = "ADDITIONAL_MILES_COST_INFO")
        protected AIR.LISTTRIPPRICE.ADDITIONALMILESCOSTINFO additionalmilescostinfo;
        @XmlElement(name = "AMOUNT_WITHOUT_TAX")
        protected BigDecimal amountwithouttax;
        @XmlElement(name = "TAX")
        protected BigDecimal tax;
        @XmlElement(name = "TAX_DETAILS")
        protected AIR.LISTTRIPPRICE.TAXDETAILS taxdetails;
        @XmlElement(name = "EXCHANGE_RATE")
        protected BigDecimal exchangerate;
        @XmlElement(name = "CURRENCY")
        protected AIR.LISTTRIPPRICE.CURRENCY currency;
        @XmlElement(name = "OLD_PRICE")
        protected BigDecimal oldprice;
        @XmlElement(name = "WEB_FARE_DISCOUNT")
        protected BigDecimal webfarediscount;
        @XmlElement(name = "PAYMENT_CARD_FEE")
        protected BigDecimal paymentcardfee;
        @XmlElement(name = "BLUEBIZ_CREDITS")
        protected BigDecimal bluebizcredits;
        @XmlElement(name = "SERVICE_FEE_AMOUNT")
        protected BigDecimal servicefeeamount;
        @XmlElement(name = "TOTAL_AMOUNT", required = true)
        protected BigDecimal totalamount;
        @XmlElement(name = "SURCHARGES")
        protected BigDecimal surcharges;
        @XmlElement(name = "REBOOK_FEE")
        protected REBOOKFEEType rebookfee;
        @XmlElement(name = "NO_SHOW_FEE")
        protected REBOOKFEEType noshowfee;
        @XmlElement(name = "COLLECT_BALANCE")
        protected REBOOKBALANCEType collectbalance;
        @XmlElement(name = "REBOOK_BALANCE")
        protected REBOOKBALANCEType rebookbalance;
        @XmlElement(name = "REFUND_BALANCE")
        protected REBOOKBALANCEType refundbalance;
        @XmlElement(name = "NON_REUSABLE_VALUE")
        protected AIR.LISTTRIPPRICE.NONREUSABLEVALUE nonreusablevalue;
        @XmlElement(name = "LIST_FEE")
        protected List<FEEType> listfee;
        @XmlElement(name = "AMOUNT_WITH_FEES")
        protected BigDecimal amountwithfees;
        @XmlElement(name = "ESTIMATED_DISCOUNT_AMOUNT")
        protected BigDecimal estimateddiscountamount;

        /**
         * Gets the value of the listfareinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfareinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFAREINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AIR.LISTTRIPPRICE.LISTFAREINFO }
         * 
         * 
         */
        public List<AIR.LISTTRIPPRICE.LISTFAREINFO> getLISTFAREINFO() {
            if (listfareinfo == null) {
                listfareinfo = new ArrayList<AIR.LISTTRIPPRICE.LISTFAREINFO>();
            }
            return this.listfareinfo;
        }

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
         * Gets the value of the milescost property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMILESCOST() {
            return milescost;
        }

        /**
         * Sets the value of the milescost property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMILESCOST(Integer value) {
            this.milescost = value;
        }

        /**
         * Gets the value of the additionalmilescostinfo property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTTRIPPRICE.ADDITIONALMILESCOSTINFO }
         *     
         */
        public AIR.LISTTRIPPRICE.ADDITIONALMILESCOSTINFO getADDITIONALMILESCOSTINFO() {
            return additionalmilescostinfo;
        }

        /**
         * Sets the value of the additionalmilescostinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTTRIPPRICE.ADDITIONALMILESCOSTINFO }
         *     
         */
        public void setADDITIONALMILESCOSTINFO(AIR.LISTTRIPPRICE.ADDITIONALMILESCOSTINFO value) {
            this.additionalmilescostinfo = value;
        }

        /**
         * Gets the value of the amountwithouttax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNTWITHOUTTAX() {
            return amountwithouttax;
        }

        /**
         * Sets the value of the amountwithouttax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNTWITHOUTTAX(BigDecimal value) {
            this.amountwithouttax = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTAX() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTAX(BigDecimal value) {
            this.tax = value;
        }

        /**
         * Gets the value of the taxdetails property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTTRIPPRICE.TAXDETAILS }
         *     
         */
        public AIR.LISTTRIPPRICE.TAXDETAILS getTAXDETAILS() {
            return taxdetails;
        }

        /**
         * Sets the value of the taxdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTTRIPPRICE.TAXDETAILS }
         *     
         */
        public void setTAXDETAILS(AIR.LISTTRIPPRICE.TAXDETAILS value) {
            this.taxdetails = value;
        }

        /**
         * Gets the value of the exchangerate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXCHANGERATE() {
            return exchangerate;
        }

        /**
         * Sets the value of the exchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXCHANGERATE(BigDecimal value) {
            this.exchangerate = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTTRIPPRICE.CURRENCY }
         *     
         */
        public AIR.LISTTRIPPRICE.CURRENCY getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTTRIPPRICE.CURRENCY }
         *     
         */
        public void setCURRENCY(AIR.LISTTRIPPRICE.CURRENCY value) {
            this.currency = value;
        }

        /**
         * Gets the value of the oldprice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOLDPRICE() {
            return oldprice;
        }

        /**
         * Sets the value of the oldprice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOLDPRICE(BigDecimal value) {
            this.oldprice = value;
        }

        /**
         * Gets the value of the webfarediscount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWEBFAREDISCOUNT() {
            return webfarediscount;
        }

        /**
         * Sets the value of the webfarediscount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWEBFAREDISCOUNT(BigDecimal value) {
            this.webfarediscount = value;
        }

        /**
         * Gets the value of the paymentcardfee property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPAYMENTCARDFEE() {
            return paymentcardfee;
        }

        /**
         * Sets the value of the paymentcardfee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPAYMENTCARDFEE(BigDecimal value) {
            this.paymentcardfee = value;
        }

        /**
         * Gets the value of the bluebizcredits property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBLUEBIZCREDITS() {
            return bluebizcredits;
        }

        /**
         * Sets the value of the bluebizcredits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBLUEBIZCREDITS(BigDecimal value) {
            this.bluebizcredits = value;
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
         * Gets the value of the surcharges property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSURCHARGES() {
            return surcharges;
        }

        /**
         * Sets the value of the surcharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSURCHARGES(BigDecimal value) {
            this.surcharges = value;
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

        /**
         * Gets the value of the collectbalance property.
         * 
         * @return
         *     possible object is
         *     {@link REBOOKBALANCEType }
         *     
         */
        public REBOOKBALANCEType getCOLLECTBALANCE() {
            return collectbalance;
        }

        /**
         * Sets the value of the collectbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link REBOOKBALANCEType }
         *     
         */
        public void setCOLLECTBALANCE(REBOOKBALANCEType value) {
            this.collectbalance = value;
        }

        /**
         * Gets the value of the rebookbalance property.
         * 
         * @return
         *     possible object is
         *     {@link REBOOKBALANCEType }
         *     
         */
        public REBOOKBALANCEType getREBOOKBALANCE() {
            return rebookbalance;
        }

        /**
         * Sets the value of the rebookbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link REBOOKBALANCEType }
         *     
         */
        public void setREBOOKBALANCE(REBOOKBALANCEType value) {
            this.rebookbalance = value;
        }

        /**
         * Gets the value of the refundbalance property.
         * 
         * @return
         *     possible object is
         *     {@link REBOOKBALANCEType }
         *     
         */
        public REBOOKBALANCEType getREFUNDBALANCE() {
            return refundbalance;
        }

        /**
         * Sets the value of the refundbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link REBOOKBALANCEType }
         *     
         */
        public void setREFUNDBALANCE(REBOOKBALANCEType value) {
            this.refundbalance = value;
        }

        /**
         * Gets the value of the nonreusablevalue property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.LISTTRIPPRICE.NONREUSABLEVALUE }
         *     
         */
        public AIR.LISTTRIPPRICE.NONREUSABLEVALUE getNONREUSABLEVALUE() {
            return nonreusablevalue;
        }

        /**
         * Sets the value of the nonreusablevalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.LISTTRIPPRICE.NONREUSABLEVALUE }
         *     
         */
        public void setNONREUSABLEVALUE(AIR.LISTTRIPPRICE.NONREUSABLEVALUE value) {
            this.nonreusablevalue = value;
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
         * Gets the value of the amountwithfees property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNTWITHFEES() {
            return amountwithfees;
        }

        /**
         * Sets the value of the amountwithfees property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNTWITHFEES(BigDecimal value) {
            this.amountwithfees = value;
        }

        /**
         * Gets the value of the estimateddiscountamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getESTIMATEDDISCOUNTAMOUNT() {
            return estimateddiscountamount;
        }

        /**
         * Sets the value of the estimateddiscountamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setESTIMATEDDISCOUNTAMOUNT(BigDecimal value) {
            this.estimateddiscountamount = value;
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
         *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="TAX_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="REFUNDABLE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="EXPIRED" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
            "tax",
            "taxinclusive",
            "refundable",
            "expired"
        })
        public static class ADDITIONALMILESCOSTINFO
            implements Serializable
        {

            @XmlElement(name = "TAX")
            protected Integer tax;
            @XmlElement(name = "TAX_INCLUSIVE")
            protected Integer taxinclusive;
            @XmlElement(name = "REFUNDABLE")
            protected Integer refundable;
            @XmlElement(name = "EXPIRED")
            protected Integer expired;

            /**
             * Gets the value of the tax property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTAX() {
                return tax;
            }

            /**
             * Sets the value of the tax property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTAX(Integer value) {
                this.tax = value;
            }

            /**
             * Gets the value of the taxinclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTAXINCLUSIVE() {
                return taxinclusive;
            }

            /**
             * Sets the value of the taxinclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTAXINCLUSIVE(Integer value) {
                this.taxinclusive = value;
            }

            /**
             * Gets the value of the refundable property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getREFUNDABLE() {
                return refundable;
            }

            /**
             * Sets the value of the refundable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setREFUNDABLE(Integer value) {
                this.refundable = value;
            }

            /**
             * Gets the value of the expired property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEXPIRED() {
                return expired;
            }

            /**
             * Sets the value of the expired property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEXPIRED(Integer value) {
                this.expired = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
         *         &lt;element ref="{}AMOUNT" minOccurs="0"/&gt;
         *         &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
         *         &lt;element ref="{}TAX" minOccurs="0"/&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "amountwithouttax",
            "tax",
            "type"
        })
        public static class LISTFAREINFO
            implements Serializable
        {

            @XmlElement(name = "AMOUNT")
            protected BigDecimal amount;
            @XmlElement(name = "AMOUNT_WITHOUT_TAX")
            protected BigDecimal amountwithouttax;
            @XmlElement(name = "TAX")
            protected BigDecimal tax;
            @XmlElement(name = "TYPE", required = true)
            protected Object type;

            /**
             * The price amount.
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
             * The price amount without tax
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAMOUNTWITHOUTTAX() {
                return amountwithouttax;
            }

            /**
             * Sets the value of the amountwithouttax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAMOUNTWITHOUTTAX(BigDecimal value) {
                this.amountwithouttax = value;
            }

            /**
             * Tax amount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTAX() {
                return tax;
            }

            /**
             * Sets the value of the tax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTAX(BigDecimal value) {
                this.tax = value;
            }

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
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
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
            "currency"
        })
        public static class NONREUSABLEVALUE
            implements Serializable
        {

            @XmlElement(name = "AMOUNT", required = true)
            protected String amount;
            @XmlElement(name = "CURRENCY")
            protected CurrencyType currency;

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
         *         &lt;element name="GST_TAX" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="OTHER_TAX" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
            "gsttax",
            "othertax"
        })
        public static class TAXDETAILS
            implements Serializable
        {

            @XmlElement(name = "GST_TAX", required = true)
            protected BigDecimal gsttax;
            @XmlElement(name = "OTHER_TAX", required = true)
            protected BigDecimal othertax;

            /**
             * Gets the value of the gsttax property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getGSTTAX() {
                return gsttax;
            }

            /**
             * Sets the value of the gsttax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setGSTTAX(BigDecimal value) {
                this.gsttax = value;
            }

            /**
             * Gets the value of the othertax property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOTHERTAX() {
                return othertax;
            }

            /**
             * Sets the value of the othertax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOTHERTAX(BigDecimal value) {
                this.othertax = value;
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
     *         &lt;element name="LIST_TRIP_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="LOW_STR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CABIN_CONCATENATED_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CARRIER_CONCATENATED_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FARE_BASIS_CONCATENATED_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "listtripprice",
        "lowstr",
        "cabinconcatenatedcode",
        "carrierconcatenatedcode",
        "farebasisconcatenatedcode"
    })
    public static class LOWESTFARE
        implements Serializable
    {

        @XmlElement(name = "LIST_TRIP_PRICE", required = true)
        protected List<TripplanPriceType> listtripprice;
        @XmlElement(name = "LOW_STR")
        protected String lowstr;
        @XmlElement(name = "CABIN_CONCATENATED_CODE")
        protected String cabinconcatenatedcode;
        @XmlElement(name = "CARRIER_CONCATENATED_CODE")
        protected String carrierconcatenatedcode;
        @XmlElement(name = "FARE_BASIS_CONCATENATED_CODE")
        protected String farebasisconcatenatedcode;

        /**
         * Gets the value of the listtripprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtripprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRIPPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TripplanPriceType }
         * 
         * 
         */
        public List<TripplanPriceType> getLISTTRIPPRICE() {
            if (listtripprice == null) {
                listtripprice = new ArrayList<TripplanPriceType>();
            }
            return this.listtripprice;
        }

        /**
         * Gets the value of the lowstr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOWSTR() {
            return lowstr;
        }

        /**
         * Sets the value of the lowstr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOWSTR(String value) {
            this.lowstr = value;
        }

        /**
         * Gets the value of the cabinconcatenatedcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCABINCONCATENATEDCODE() {
            return cabinconcatenatedcode;
        }

        /**
         * Sets the value of the cabinconcatenatedcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCABINCONCATENATEDCODE(String value) {
            this.cabinconcatenatedcode = value;
        }

        /**
         * Gets the value of the carrierconcatenatedcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARRIERCONCATENATEDCODE() {
            return carrierconcatenatedcode;
        }

        /**
         * Sets the value of the carrierconcatenatedcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARRIERCONCATENATEDCODE(String value) {
            this.carrierconcatenatedcode = value;
        }

        /**
         * Gets the value of the farebasisconcatenatedcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAREBASISCONCATENATEDCODE() {
            return farebasisconcatenatedcode;
        }

        /**
         * Sets the value of the farebasisconcatenatedcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAREBASISCONCATENATEDCODE(String value) {
            this.farebasisconcatenatedcode = value;
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
     *         &lt;element name="LIST_TRIP_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="LOW_STR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "listtripprice",
        "lowstr"
    })
    public static class LOWESTFAREINPOLICY
        implements Serializable
    {

        @XmlElement(name = "LIST_TRIP_PRICE", required = true)
        protected List<TripplanPriceType> listtripprice;
        @XmlElement(name = "LOW_STR", required = true)
        protected String lowstr;

        /**
         * Gets the value of the listtripprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtripprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRIPPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TripplanPriceType }
         * 
         * 
         */
        public List<TripplanPriceType> getLISTTRIPPRICE() {
            if (listtripprice == null) {
                listtripprice = new ArrayList<TripplanPriceType>();
            }
            return this.listtripprice;
        }

        /**
         * Gets the value of the lowstr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOWSTR() {
            return lowstr;
        }

        /**
         * Sets the value of the lowstr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOWSTR(String value) {
            this.lowstr = value;
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
     *         &lt;element name="IS_MODIFICATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_CANCELLATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_DATE_CHANGE_ONLY_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_SCHEDULE_CHANGE_ACK_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "ismodificationallowed",
        "iscancellationallowed",
        "isdatechangeonlyallowed",
        "isschedulechangeackallowed"
    })
    public static class PERMISSIONS
        implements Serializable
    {

        @XmlElement(name = "IS_MODIFICATION_ALLOWED")
        protected Boolean ismodificationallowed;
        @XmlElement(name = "IS_CANCELLATION_ALLOWED")
        protected Boolean iscancellationallowed;
        @XmlElement(name = "IS_DATE_CHANGE_ONLY_ALLOWED")
        protected Boolean isdatechangeonlyallowed;
        @XmlElement(name = "IS_SCHEDULE_CHANGE_ACK_ALLOWED")
        protected Boolean isschedulechangeackallowed;

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
         * Gets the value of the isdatechangeonlyallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISDATECHANGEONLYALLOWED() {
            return isdatechangeonlyallowed;
        }

        /**
         * Sets the value of the isdatechangeonlyallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISDATECHANGEONLYALLOWED(Boolean value) {
            this.isdatechangeonlyallowed = value;
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
     *         &lt;element name="PARENT_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="IS_THIRD_PARTY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "parentpnrid",
        "isthirdparty"
    })
    public static class PNRINFORMATION
        implements Serializable
    {

        @XmlElement(name = "PARENT_PNR_ID", required = true)
        protected BigInteger parentpnrid;
        @XmlElement(name = "IS_THIRD_PARTY")
        protected Boolean isthirdparty;

        /**
         * Gets the value of the parentpnrid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPARENTPNRID() {
            return parentpnrid;
        }

        /**
         * Sets the value of the parentpnrid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPARENTPNRID(BigInteger value) {
            this.parentpnrid = value;
        }

        /**
         * Gets the value of the isthirdparty property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTHIRDPARTY() {
            return isthirdparty;
        }

        /**
         * Sets the value of the isthirdparty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTHIRDPARTY(Boolean value) {
            this.isthirdparty = value;
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
     *         &lt;element name="CURRENCY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;length value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "currency",
        "amount"
    })
    public static class SEATASSIGNMENTFEE
        implements Serializable
    {

        @XmlElement(name = "CURRENCY")
        protected AIR.SEATASSIGNMENTFEE.CURRENCY currency;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link AIR.SEATASSIGNMENTFEE.CURRENCY }
         *     
         */
        public AIR.SEATASSIGNMENTFEE.CURRENCY getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIR.SEATASSIGNMENTFEE.CURRENCY }
         *     
         */
        public void setCURRENCY(AIR.SEATASSIGNMENTFEE.CURRENCY value) {
            this.currency = value;
        }

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
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;length value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
    public static class STATUS
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TICKETINGTIMELIMIT
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TICKETINGTIMELIMITGDS
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TICKETINGTIMELIMITGMT
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }

}
