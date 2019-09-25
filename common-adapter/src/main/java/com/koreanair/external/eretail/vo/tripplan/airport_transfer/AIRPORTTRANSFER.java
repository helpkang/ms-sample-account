
package com.koreanair.external.eretail.vo.tripplan.airport_transfer;

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
 *       &lt;sequence&gt;
 *         &lt;group ref="{}CommonItinerary" minOccurs="0"/&gt;
 *         &lt;element name="AIR_ELEMENT_REF" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AIRPORT_TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_LOCATION"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_LOCATION"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="B_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CURRENCY_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="STATION"&gt;
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
 *         &lt;element name="TYPE_BOOK"&gt;
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
 *         &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="AGREEMENT_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LINE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
    "airelementref",
    "airporttype",
    "blocation",
    "elocation",
    "bdate",
    "edate",
    "travellerid",
    "price",
    "currencycode",
    "station",
    "typebook",
    "listprice",
    "agreementnumber",
    "linenumber"
})
@XmlRootElement(name = "AIRPORT_TRANSFER")
public class AIRPORTTRANSFER
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
    protected AIRPORTTRANSFER.STATUS status;
    @XmlElement(name = "DESCRIPTION")
    protected AIRPORTTRANSFER.DESCRIPTION description;
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
    protected AIRPORTTRANSFER.PERMISSIONS permissions;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected AIRPORTTRANSFER.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PNR_INFORMATION")
    protected AIRPORTTRANSFER.PNRINFORMATION pnrinformation;
    @XmlElement(name = "ISSUE_DATE")
    protected AIRPORTTRANSFER.ISSUEDATE issuedate;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;
    @XmlElement(name = "ACTION_CODE")
    protected String actioncode;
    @XmlElement(name = "AIR_ELEMENT_REF", required = true)
    protected BigInteger airelementref;
    @XmlElement(name = "AIRPORT_TYPE", required = true)
    protected String airporttype;
    @XmlElement(name = "B_LOCATION", required = true)
    protected AIRPORTTRANSFER.BLOCATION blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected AIRPORTTRANSFER.ELOCATION elocation;
    @XmlElement(name = "B_DATE", required = true)
    protected AIRPORTTRANSFER.BDATE bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected AIRPORTTRANSFER.EDATE edate;
    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;
    @XmlElement(name = "PRICE", required = true)
    protected BigDecimal price;
    @XmlElement(name = "CURRENCY_CODE", required = true)
    protected String currencycode;
    @XmlElement(name = "STATION", required = true)
    protected AIRPORTTRANSFER.STATION station;
    @XmlElement(name = "TYPE_BOOK", required = true)
    protected AIRPORTTRANSFER.TYPEBOOK typebook;
    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<AIRPORTTRANSFER.LISTPRICE> listprice;
    @XmlElement(name = "AGREEMENT_NUMBER")
    protected String agreementnumber;
    @XmlElement(name = "LINE_NUMBER")
    protected String linenumber;
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
     *     {@link AIRPORTTRANSFER.STATUS }
     *     
     */
    public AIRPORTTRANSFER.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.STATUS }
     *     
     */
    public void setSTATUS(AIRPORTTRANSFER.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.DESCRIPTION }
     *     
     */
    public AIRPORTTRANSFER.DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(AIRPORTTRANSFER.DESCRIPTION value) {
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
     *     {@link AIRPORTTRANSFER.PERMISSIONS }
     *     
     */
    public AIRPORTTRANSFER.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(AIRPORTTRANSFER.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.ELIGIBILITYINFORMATION }
     *     
     */
    public AIRPORTTRANSFER.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(AIRPORTTRANSFER.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the pnrinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.PNRINFORMATION }
     *     
     */
    public AIRPORTTRANSFER.PNRINFORMATION getPNRINFORMATION() {
        return pnrinformation;
    }

    /**
     * Sets the value of the pnrinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.PNRINFORMATION }
     *     
     */
    public void setPNRINFORMATION(AIRPORTTRANSFER.PNRINFORMATION value) {
        this.pnrinformation = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.ISSUEDATE }
     *     
     */
    public AIRPORTTRANSFER.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(AIRPORTTRANSFER.ISSUEDATE value) {
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
     * Gets the value of the airelementref property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAIRELEMENTREF() {
        return airelementref;
    }

    /**
     * Sets the value of the airelementref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAIRELEMENTREF(BigInteger value) {
        this.airelementref = value;
    }

    /**
     * Gets the value of the airporttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRPORTTYPE() {
        return airporttype;
    }

    /**
     * Sets the value of the airporttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRPORTTYPE(String value) {
        this.airporttype = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.BLOCATION }
     *     
     */
    public AIRPORTTRANSFER.BLOCATION getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.BLOCATION }
     *     
     */
    public void setBLOCATION(AIRPORTTRANSFER.BLOCATION value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.ELOCATION }
     *     
     */
    public AIRPORTTRANSFER.ELOCATION getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.ELOCATION }
     *     
     */
    public void setELOCATION(AIRPORTTRANSFER.ELOCATION value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.BDATE }
     *     
     */
    public AIRPORTTRANSFER.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.BDATE }
     *     
     */
    public void setBDATE(AIRPORTTRANSFER.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.EDATE }
     *     
     */
    public AIRPORTTRANSFER.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.EDATE }
     *     
     */
    public void setEDATE(AIRPORTTRANSFER.EDATE value) {
        this.edate = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICE(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the currencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYCODE() {
        return currencycode;
    }

    /**
     * Sets the value of the currencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYCODE(String value) {
        this.currencycode = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.STATION }
     *     
     */
    public AIRPORTTRANSFER.STATION getSTATION() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.STATION }
     *     
     */
    public void setSTATION(AIRPORTTRANSFER.STATION value) {
        this.station = value;
    }

    /**
     * Gets the value of the typebook property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTTRANSFER.TYPEBOOK }
     *     
     */
    public AIRPORTTRANSFER.TYPEBOOK getTYPEBOOK() {
        return typebook;
    }

    /**
     * Sets the value of the typebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTTRANSFER.TYPEBOOK }
     *     
     */
    public void setTYPEBOOK(AIRPORTTRANSFER.TYPEBOOK value) {
        this.typebook = value;
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
     * {@link AIRPORTTRANSFER.LISTPRICE }
     * 
     * 
     */
    public List<AIRPORTTRANSFER.LISTPRICE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<AIRPORTTRANSFER.LISTPRICE>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the agreementnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREEMENTNUMBER() {
        return agreementnumber;
    }

    /**
     * Sets the value of the agreementnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREEMENTNUMBER(String value) {
        this.agreementnumber = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINENUMBER(String value) {
        this.linenumber = value;
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
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
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
        @XmlElement(name = "LOCATION_CODE", required = true)
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
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
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
        @XmlElement(name = "LOCATION_CODE", required = true)
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
     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        "price",
        "currency"
    })
    public static class LISTPRICE
        implements Serializable
    {

        @XmlElement(name = "PRICE", required = true)
        protected BigDecimal price;
        @XmlElement(name = "CURRENCY")
        protected AIRPORTTRANSFER.LISTPRICE.CURRENCY currency;

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRICE() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRICE(BigDecimal value) {
            this.price = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link AIRPORTTRANSFER.LISTPRICE.CURRENCY }
         *     
         */
        public AIRPORTTRANSFER.LISTPRICE.CURRENCY getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIRPORTTRANSFER.LISTPRICE.CURRENCY }
         *     
         */
        public void setCURRENCY(AIRPORTTRANSFER.LISTPRICE.CURRENCY value) {
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
    public static class STATION
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
    public static class TYPEBOOK
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
