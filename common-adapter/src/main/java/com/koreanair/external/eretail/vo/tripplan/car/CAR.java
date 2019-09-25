
package com.koreanair.external.eretail.vo.tripplan.car;

import java.io.Serializable;
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
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.tripplan.common.common_car.CarAtlanticType;
import com.koreanair.external.eretail.vo.tripplan.common.common_technical_ids.TechnicalIds;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{}CarElementInformation"/&gt;
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
    "blocation",
    "elocation",
    "bdate",
    "edate",
    "frequentrentercards",
    "priceplan",
    "displaytype",
    "ratemarketinginfo",
    "car",
    "flightinfo",
    "travellerid",
    "bcarlocation",
    "ecarlocation",
    "remark",
    "confirmationnumber",
    "boolisoutofpolicy",
    "justificationcode",
    "justificationcodedesc",
    "justificationfreetext",
    "lowestrate",
    "specialequipmentpaid",
    "prepaidcancelfees",
    "paymentfreetext",
    "guarantee",
    "bookingsource",
    "evn",
    "vv",
    "evoucherallowed"
})
@XmlRootElement(name = "CAR")
public class CAR
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
    protected CAR.STATUS status;
    @XmlElement(name = "DESCRIPTION")
    protected CAR.DESCRIPTION description;
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
    protected CAR.PERMISSIONS permissions;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected CAR.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PNR_INFORMATION")
    protected CAR.PNRINFORMATION pnrinformation;
    @XmlElement(name = "ISSUE_DATE")
    protected CAR.ISSUEDATE issuedate;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;
    @XmlElement(name = "ACTION_CODE")
    protected String actioncode;
    @XmlElement(name = "B_LOCATION", required = true)
    protected CAR.BLOCATION blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected CAR.ELOCATION elocation;
    @XmlElement(name = "B_DATE", required = true)
    protected CAR.BDATE bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected CAR.EDATE edate;
    @XmlElement(name = "FREQUENT_RENTER_CARDS")
    protected CAR.FREQUENTRENTERCARDS frequentrentercards;
    @XmlElement(name = "PRICE_PLAN")
    protected CAR.PRICEPLAN priceplan;
    @XmlElement(name = "DISPLAY_TYPE")
    protected String displaytype;
    @XmlElement(name = "RATE_MARKETING_INFO")
    protected String ratemarketinginfo;
    @XmlElement(name = "CAR", required = true)
    protected CarAtlanticType car;
    @XmlElement(name = "FLIGHT_INFO")
    protected String flightinfo;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "B_CAR_LOCATION")
    protected CAR.BCARLOCATION bcarlocation;
    @XmlElement(name = "E_CAR_LOCATION")
    protected CAR.ECARLOCATION ecarlocation;
    @XmlElement(name = "REMARK")
    protected String remark;
    @XmlElement(name = "CONFIRMATION_NUMBER")
    protected String confirmationnumber;
    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "JUSTIFICATION_CODE")
    protected String justificationcode;
    @XmlElement(name = "JUSTIFICATION_CODE_DESC")
    protected String justificationcodedesc;
    @XmlElement(name = "JUSTIFICATION_FREE_TEXT")
    protected String justificationfreetext;
    @XmlElement(name = "LOWEST_RATE")
    protected CAR.LOWESTRATE lowestrate;
    @XmlElement(name = "SPECIAL_EQUIPMENT_PAID")
    protected Object specialequipmentpaid;
    @XmlElement(name = "PREPAID_CANCEL_FEES")
    protected Boolean prepaidcancelfees;
    @XmlElement(name = "PAYMENT_FREETEXT")
    protected String paymentfreetext;
    @XmlElement(name = "GUARANTEE")
    protected CAR.GUARANTEE guarantee;
    @XmlElement(name = "BOOKING_SOURCE")
    protected Object bookingsource;
    @XmlElement(name = "EVN")
    protected Object evn;
    @XmlElement(name = "VV")
    protected CAR.VV vv;
    @XmlElement(name = "EVOUCHER_ALLOWED")
    protected Object evoucherallowed;
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
     *     {@link CAR.STATUS }
     *     
     */
    public CAR.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.STATUS }
     *     
     */
    public void setSTATUS(CAR.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.DESCRIPTION }
     *     
     */
    public CAR.DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(CAR.DESCRIPTION value) {
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
     *     {@link CAR.PERMISSIONS }
     *     
     */
    public CAR.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(CAR.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.ELIGIBILITYINFORMATION }
     *     
     */
    public CAR.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(CAR.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the pnrinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.PNRINFORMATION }
     *     
     */
    public CAR.PNRINFORMATION getPNRINFORMATION() {
        return pnrinformation;
    }

    /**
     * Sets the value of the pnrinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.PNRINFORMATION }
     *     
     */
    public void setPNRINFORMATION(CAR.PNRINFORMATION value) {
        this.pnrinformation = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.ISSUEDATE }
     *     
     */
    public CAR.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(CAR.ISSUEDATE value) {
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
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.BLOCATION }
     *     
     */
    public CAR.BLOCATION getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.BLOCATION }
     *     
     */
    public void setBLOCATION(CAR.BLOCATION value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.ELOCATION }
     *     
     */
    public CAR.ELOCATION getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.ELOCATION }
     *     
     */
    public void setELOCATION(CAR.ELOCATION value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.BDATE }
     *     
     */
    public CAR.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.BDATE }
     *     
     */
    public void setBDATE(CAR.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.EDATE }
     *     
     */
    public CAR.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.EDATE }
     *     
     */
    public void setEDATE(CAR.EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the frequentrentercards property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.FREQUENTRENTERCARDS }
     *     
     */
    public CAR.FREQUENTRENTERCARDS getFREQUENTRENTERCARDS() {
        return frequentrentercards;
    }

    /**
     * Sets the value of the frequentrentercards property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.FREQUENTRENTERCARDS }
     *     
     */
    public void setFREQUENTRENTERCARDS(CAR.FREQUENTRENTERCARDS value) {
        this.frequentrentercards = value;
    }

    /**
     * Gets the value of the priceplan property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.PRICEPLAN }
     *     
     */
    public CAR.PRICEPLAN getPRICEPLAN() {
        return priceplan;
    }

    /**
     * Sets the value of the priceplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.PRICEPLAN }
     *     
     */
    public void setPRICEPLAN(CAR.PRICEPLAN value) {
        this.priceplan = value;
    }

    /**
     * Gets the value of the displaytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYTYPE() {
        return displaytype;
    }

    /**
     * Sets the value of the displaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYTYPE(String value) {
        this.displaytype = value;
    }

    /**
     * Gets the value of the ratemarketinginfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEMARKETINGINFO() {
        return ratemarketinginfo;
    }

    /**
     * Sets the value of the ratemarketinginfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEMARKETINGINFO(String value) {
        this.ratemarketinginfo = value;
    }

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link CarAtlanticType }
     *     
     */
    public CarAtlanticType getCAR() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarAtlanticType }
     *     
     */
    public void setCAR(CarAtlanticType value) {
        this.car = value;
    }

    /**
     * Gets the value of the flightinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTINFO() {
        return flightinfo;
    }

    /**
     * Sets the value of the flightinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTINFO(String value) {
        this.flightinfo = value;
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
     * Gets the value of the bcarlocation property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.BCARLOCATION }
     *     
     */
    public CAR.BCARLOCATION getBCARLOCATION() {
        return bcarlocation;
    }

    /**
     * Sets the value of the bcarlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.BCARLOCATION }
     *     
     */
    public void setBCARLOCATION(CAR.BCARLOCATION value) {
        this.bcarlocation = value;
    }

    /**
     * Gets the value of the ecarlocation property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.ECARLOCATION }
     *     
     */
    public CAR.ECARLOCATION getECARLOCATION() {
        return ecarlocation;
    }

    /**
     * Sets the value of the ecarlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.ECARLOCATION }
     *     
     */
    public void setECARLOCATION(CAR.ECARLOCATION value) {
        this.ecarlocation = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the confirmationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMATIONNUMBER() {
        return confirmationnumber;
    }

    /**
     * Sets the value of the confirmationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMATIONNUMBER(String value) {
        this.confirmationnumber = value;
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
     * Gets the value of the lowestrate property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.LOWESTRATE }
     *     
     */
    public CAR.LOWESTRATE getLOWESTRATE() {
        return lowestrate;
    }

    /**
     * Sets the value of the lowestrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.LOWESTRATE }
     *     
     */
    public void setLOWESTRATE(CAR.LOWESTRATE value) {
        this.lowestrate = value;
    }

    /**
     * Gets the value of the specialequipmentpaid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSPECIALEQUIPMENTPAID() {
        return specialequipmentpaid;
    }

    /**
     * Sets the value of the specialequipmentpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSPECIALEQUIPMENTPAID(Object value) {
        this.specialequipmentpaid = value;
    }

    /**
     * Gets the value of the prepaidcancelfees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPREPAIDCANCELFEES() {
        return prepaidcancelfees;
    }

    /**
     * Sets the value of the prepaidcancelfees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPREPAIDCANCELFEES(Boolean value) {
        this.prepaidcancelfees = value;
    }

    /**
     * Gets the value of the paymentfreetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTFREETEXT() {
        return paymentfreetext;
    }

    /**
     * Sets the value of the paymentfreetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTFREETEXT(String value) {
        this.paymentfreetext = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.GUARANTEE }
     *     
     */
    public CAR.GUARANTEE getGUARANTEE() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.GUARANTEE }
     *     
     */
    public void setGUARANTEE(CAR.GUARANTEE value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the bookingsource property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBOOKINGSOURCE() {
        return bookingsource;
    }

    /**
     * Sets the value of the bookingsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBOOKINGSOURCE(Object value) {
        this.bookingsource = value;
    }

    /**
     * Gets the value of the evn property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEVN() {
        return evn;
    }

    /**
     * Sets the value of the evn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEVN(Object value) {
        this.evn = value;
    }

    /**
     * Gets the value of the vv property.
     * 
     * @return
     *     possible object is
     *     {@link CAR.VV }
     *     
     */
    public CAR.VV getVV() {
        return vv;
    }

    /**
     * Sets the value of the vv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAR.VV }
     *     
     */
    public void setVV(CAR.VV value) {
        this.vv = value;
    }

    /**
     * Gets the value of the evoucherallowed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEVOUCHERALLOWED() {
        return evoucherallowed;
    }

    /**
     * Sets the value of the evoucherallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEVOUCHERALLOWED(Object value) {
        this.evoucherallowed = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPANY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_OPENING_HOURS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OPENING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CLOSING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "address",
        "companycode",
        "phonenumber",
        "faxnumber",
        "listopeninghours"
    })
    public static class BCARLOCATION
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "ADDRESS")
        protected String address;
        @XmlElement(name = "COMPANY_CODE")
        protected String companycode;
        @XmlElement(name = "PHONE_NUMBER")
        protected String phonenumber;
        @XmlElement(name = "FAX_NUMBER")
        protected String faxnumber;
        @XmlElement(name = "LIST_OPENING_HOURS")
        protected List<CAR.BCARLOCATION.LISTOPENINGHOURS> listopeninghours;

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
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESS(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the companycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPANYCODE() {
            return companycode;
        }

        /**
         * Sets the value of the companycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPANYCODE(String value) {
            this.companycode = value;
        }

        /**
         * Gets the value of the phonenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHONENUMBER() {
            return phonenumber;
        }

        /**
         * Sets the value of the phonenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHONENUMBER(String value) {
            this.phonenumber = value;
        }

        /**
         * Gets the value of the faxnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAXNUMBER() {
            return faxnumber;
        }

        /**
         * Sets the value of the faxnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAXNUMBER(String value) {
            this.faxnumber = value;
        }

        /**
         * Gets the value of the listopeninghours property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listopeninghours property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTOPENINGHOURS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CAR.BCARLOCATION.LISTOPENINGHOURS }
         * 
         * 
         */
        public List<CAR.BCARLOCATION.LISTOPENINGHOURS> getLISTOPENINGHOURS() {
            if (listopeninghours == null) {
                listopeninghours = new ArrayList<CAR.BCARLOCATION.LISTOPENINGHOURS>();
            }
            return this.listopeninghours;
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
         *         &lt;element name="OPENING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CLOSING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "openinghour",
            "closinghour"
        })
        public static class LISTOPENINGHOURS
            implements Serializable
        {

            @XmlElement(name = "OPENING_HOUR")
            protected String openinghour;
            @XmlElement(name = "CLOSING_HOUR")
            protected String closinghour;

            /**
             * Gets the value of the openinghour property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOPENINGHOUR() {
                return openinghour;
            }

            /**
             * Sets the value of the openinghour property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOPENINGHOUR(String value) {
                this.openinghour = value;
            }

            /**
             * Gets the value of the closinghour property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLOSINGHOUR() {
                return closinghour;
            }

            /**
             * Sets the value of the closinghour property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLOSINGHOUR(String value) {
                this.closinghour = value;
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
        "countryname"
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPANY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_OPENING_HOURS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OPENING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CLOSING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "address",
        "companycode",
        "phonenumber",
        "faxnumber",
        "listopeninghours"
    })
    public static class ECARLOCATION
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "ADDRESS")
        protected String address;
        @XmlElement(name = "COMPANY_CODE")
        protected String companycode;
        @XmlElement(name = "PHONE_NUMBER")
        protected String phonenumber;
        @XmlElement(name = "FAX_NUMBER")
        protected String faxnumber;
        @XmlElement(name = "LIST_OPENING_HOURS")
        protected List<CAR.ECARLOCATION.LISTOPENINGHOURS> listopeninghours;

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
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESS(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the companycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPANYCODE() {
            return companycode;
        }

        /**
         * Sets the value of the companycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPANYCODE(String value) {
            this.companycode = value;
        }

        /**
         * Gets the value of the phonenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHONENUMBER() {
            return phonenumber;
        }

        /**
         * Sets the value of the phonenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHONENUMBER(String value) {
            this.phonenumber = value;
        }

        /**
         * Gets the value of the faxnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAXNUMBER() {
            return faxnumber;
        }

        /**
         * Sets the value of the faxnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAXNUMBER(String value) {
            this.faxnumber = value;
        }

        /**
         * Gets the value of the listopeninghours property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listopeninghours property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTOPENINGHOURS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CAR.ECARLOCATION.LISTOPENINGHOURS }
         * 
         * 
         */
        public List<CAR.ECARLOCATION.LISTOPENINGHOURS> getLISTOPENINGHOURS() {
            if (listopeninghours == null) {
                listopeninghours = new ArrayList<CAR.ECARLOCATION.LISTOPENINGHOURS>();
            }
            return this.listopeninghours;
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
         *         &lt;element name="OPENING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CLOSING_HOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "openinghour",
            "closinghour"
        })
        public static class LISTOPENINGHOURS
            implements Serializable
        {

            @XmlElement(name = "OPENING_HOUR")
            protected String openinghour;
            @XmlElement(name = "CLOSING_HOUR")
            protected String closinghour;

            /**
             * Gets the value of the openinghour property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOPENINGHOUR() {
                return openinghour;
            }

            /**
             * Sets the value of the openinghour property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOPENINGHOUR(String value) {
                this.openinghour = value;
            }

            /**
             * Gets the value of the closinghour property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLOSINGHOUR() {
                return closinghour;
            }

            /**
             * Sets the value of the closinghour property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLOSINGHOUR(String value) {
                this.closinghour = value;
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
        "countryname"
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
     *         &lt;element name="CD_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PC_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ID_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="IT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="FT_NUMBER" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FT_COMPANY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="FT_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "cdnumber",
        "pcnumber",
        "idnumber",
        "itnumber",
        "ftnumber"
    })
    public static class FREQUENTRENTERCARDS
        implements Serializable
    {

        @XmlElement(name = "CD_NUMBER")
        protected String cdnumber;
        @XmlElement(name = "PC_NUMBER")
        protected String pcnumber;
        @XmlElement(name = "ID_NUMBER")
        protected String idnumber;
        @XmlElement(name = "IT_NUMBER")
        protected Object itnumber;
        @XmlElement(name = "FT_NUMBER")
        protected CAR.FREQUENTRENTERCARDS.FTNUMBER ftnumber;

        /**
         * Gets the value of the cdnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDNUMBER() {
            return cdnumber;
        }

        /**
         * Sets the value of the cdnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDNUMBER(String value) {
            this.cdnumber = value;
        }

        /**
         * Gets the value of the pcnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCNUMBER() {
            return pcnumber;
        }

        /**
         * Sets the value of the pcnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCNUMBER(String value) {
            this.pcnumber = value;
        }

        /**
         * Gets the value of the idnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDNUMBER() {
            return idnumber;
        }

        /**
         * Sets the value of the idnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDNUMBER(String value) {
            this.idnumber = value;
        }

        /**
         * Gets the value of the itnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getITNUMBER() {
            return itnumber;
        }

        /**
         * Sets the value of the itnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setITNUMBER(Object value) {
            this.itnumber = value;
        }

        /**
         * Gets the value of the ftnumber property.
         * 
         * @return
         *     possible object is
         *     {@link CAR.FREQUENTRENTERCARDS.FTNUMBER }
         *     
         */
        public CAR.FREQUENTRENTERCARDS.FTNUMBER getFTNUMBER() {
            return ftnumber;
        }

        /**
         * Sets the value of the ftnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link CAR.FREQUENTRENTERCARDS.FTNUMBER }
         *     
         */
        public void setFTNUMBER(CAR.FREQUENTRENTERCARDS.FTNUMBER value) {
            this.ftnumber = value;
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
         *         &lt;element name="FT_COMPANY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="FT_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "ftcompany",
            "ftcode"
        })
        public static class FTNUMBER
            implements Serializable
        {

            @XmlElement(name = "FT_COMPANY", required = true)
            protected Object ftcompany;
            @XmlElement(name = "FT_CODE", required = true)
            protected Object ftcode;

            /**
             * Gets the value of the ftcompany property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getFTCOMPANY() {
                return ftcompany;
            }

            /**
             * Sets the value of the ftcompany property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setFTCOMPANY(Object value) {
                this.ftcompany = value;
            }

            /**
             * Gets the value of the ftcode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getFTCODE() {
                return ftcode;
            }

            /**
             * Sets the value of the ftcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setFTCODE(Object value) {
                this.ftcode = value;
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
     *         &lt;element name="BILLING_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "billingnumber"
    })
    public static class GUARANTEE
        implements Serializable
    {

        @XmlElement(name = "BILLING_NUMBER", required = true)
        protected Object billingnumber;

        /**
         * Gets the value of the billingnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBILLINGNUMBER() {
            return billingnumber;
        }

        /**
         * Sets the value of the billingnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBILLINGNUMBER(Object value) {
            this.billingnumber = value;
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
     *         &lt;element name="NORMAL"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CAR" type="{}carAtlanticType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TOTAL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CAR" type="{}carAtlanticType"/&gt;
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
        "normal",
        "total"
    })
    public static class LOWESTRATE
        implements Serializable
    {

        @XmlElement(name = "NORMAL", required = true)
        protected CAR.LOWESTRATE.NORMAL normal;
        @XmlElement(name = "TOTAL")
        protected CAR.LOWESTRATE.TOTAL total;

        /**
         * Gets the value of the normal property.
         * 
         * @return
         *     possible object is
         *     {@link CAR.LOWESTRATE.NORMAL }
         *     
         */
        public CAR.LOWESTRATE.NORMAL getNORMAL() {
            return normal;
        }

        /**
         * Sets the value of the normal property.
         * 
         * @param value
         *     allowed object is
         *     {@link CAR.LOWESTRATE.NORMAL }
         *     
         */
        public void setNORMAL(CAR.LOWESTRATE.NORMAL value) {
            this.normal = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link CAR.LOWESTRATE.TOTAL }
         *     
         */
        public CAR.LOWESTRATE.TOTAL getTOTAL() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link CAR.LOWESTRATE.TOTAL }
         *     
         */
        public void setTOTAL(CAR.LOWESTRATE.TOTAL value) {
            this.total = value;
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
         *         &lt;element name="CAR" type="{}carAtlanticType"/&gt;
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
            "car"
        })
        public static class NORMAL
            implements Serializable
        {

            @XmlElement(name = "CAR", required = true)
            protected CarAtlanticType car;

            /**
             * Gets the value of the car property.
             * 
             * @return
             *     possible object is
             *     {@link CarAtlanticType }
             *     
             */
            public CarAtlanticType getCAR() {
                return car;
            }

            /**
             * Sets the value of the car property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarAtlanticType }
             *     
             */
            public void setCAR(CarAtlanticType value) {
                this.car = value;
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
         *         &lt;element name="CAR" type="{}carAtlanticType"/&gt;
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
            "car"
        })
        public static class TOTAL
            implements Serializable
        {

            @XmlElement(name = "CAR", required = true)
            protected CarAtlanticType car;

            /**
             * Gets the value of the car property.
             * 
             * @return
             *     possible object is
             *     {@link CarAtlanticType }
             *     
             */
            public CarAtlanticType getCAR() {
                return car;
            }

            /**
             * Sets the value of the car property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarAtlanticType }
             *     
             */
            public void setCAR(CarAtlanticType value) {
                this.car = value;
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
    public static class PRICEPLAN
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "value",
        "currency",
        "amount"
    })
    public static class VV
        implements Serializable
    {

        @XmlElement(name = "VALUE", required = true)
        protected String value;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;
        @XmlElement(name = "AMOUNT")
        protected String amount;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALUE() {
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
        public void setVALUE(String value) {
            this.value = value;
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

    }

}
