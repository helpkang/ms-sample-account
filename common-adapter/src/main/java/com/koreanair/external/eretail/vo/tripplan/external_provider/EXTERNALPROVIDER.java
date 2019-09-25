
package com.koreanair.external.eretail.vo.tripplan.external_provider;

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
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
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
 *         &lt;element name="EXTERNAL_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RESERVATION_TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVATION_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOGO_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RESERVATION_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="B_LOCATION" type="{}LOCATION" minOccurs="0"/&gt;
 *         &lt;element name="E_LOCATION" type="{}LOCATION" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OPERATOR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" type="{}PRICE_BREAKDOWN_TYPE" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                     &lt;element name="AGE" type="{}AGE_TYPE" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="REFERENCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXTERNAL_PAYMENT_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REQUIRED_PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CVV_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXTERNAL_DELIVERY_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DELIVERY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DELIVERY_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADDITIONAL_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNAL_INFORMATION_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNAL_INFORMATION_LINK_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_EXTERNAL_INFORMATION_LINK" type="{}LINK_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PNR_LINE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LINE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LINE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESERVATION_PARAMETERS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CANCEL_IS_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="PENDING_BOOKING_IS_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETING_TIME_LIMIT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ADDITIONAL_FIELD" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KEY" type="{}CODE_NAME"/&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PERSISTENT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="FORWARD" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MAIN_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "externalprovider",
    "reservationtitle",
    "reservationdescription",
    "logoreference",
    "reservationnumber",
    "reservationstatus",
    "blocation",
    "elocation",
    "bdate",
    "edate",
    "listsegment",
    "operatorname",
    "listprice",
    "listtraveller",
    "externalpaymentinformation",
    "externaldeliveryinformation",
    "additionalinformation",
    "externalinformationurl",
    "externalinformationlinktext",
    "listexternalinformationlink",
    "listpnrline",
    "reservationparameters",
    "listadditionalfield",
    "listmsg",
    "maintype"
})
@XmlRootElement(name = "EXTERNAL_PROVIDER")
public class EXTERNALPROVIDER
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
    protected EXTERNALPROVIDER.STATUS status;
    @XmlElement(name = "DESCRIPTION")
    protected EXTERNALPROVIDER.DESCRIPTION description;
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
    protected EXTERNALPROVIDER.PERMISSIONS permissions;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected EXTERNALPROVIDER.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PNR_INFORMATION")
    protected EXTERNALPROVIDER.PNRINFORMATION pnrinformation;
    @XmlElement(name = "ISSUE_DATE")
    protected EXTERNALPROVIDER.ISSUEDATE issuedate;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;
    @XmlElement(name = "ACTION_CODE")
    protected String actioncode;
    @XmlElement(name = "EXTERNAL_PROVIDER", required = true)
    protected String externalprovider;
    @XmlElement(name = "RESERVATION_TITLE")
    protected String reservationtitle;
    @XmlElement(name = "RESERVATION_DESCRIPTION")
    protected String reservationdescription;
    @XmlElement(name = "LOGO_REFERENCE")
    protected String logoreference;
    @XmlElement(name = "RESERVATION_NUMBER", required = true)
    protected String reservationnumber;
    @XmlElement(name = "RESERVATION_STATUS")
    protected Object reservationstatus;
    @XmlElement(name = "B_LOCATION")
    protected LOCATION blocation;
    @XmlElement(name = "E_LOCATION")
    protected LOCATION elocation;
    @XmlElement(name = "B_DATE")
    protected EXTERNALPROVIDER.BDATE bdate;
    @XmlElement(name = "E_DATE")
    protected EXTERNALPROVIDER.EDATE edate;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<SEGMENT> listsegment;
    @XmlElement(name = "OPERATOR_NAME")
    protected String operatorname;
    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<PRICEBREAKDOWNTYPE> listprice;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<EXTERNALPROVIDER.LISTTRAVELLER> listtraveller;
    @XmlElement(name = "EXTERNAL_PAYMENT_INFORMATION")
    protected EXTERNALPROVIDER.EXTERNALPAYMENTINFORMATION externalpaymentinformation;
    @XmlElement(name = "EXTERNAL_DELIVERY_INFORMATION")
    protected EXTERNALPROVIDER.EXTERNALDELIVERYINFORMATION externaldeliveryinformation;
    @XmlElement(name = "ADDITIONAL_INFORMATION")
    protected List<String> additionalinformation;
    @XmlElement(name = "EXTERNAL_INFORMATION_URL")
    protected String externalinformationurl;
    @XmlElement(name = "EXTERNAL_INFORMATION_LINK_TEXT")
    protected String externalinformationlinktext;
    @XmlElement(name = "LIST_EXTERNAL_INFORMATION_LINK")
    protected List<LINKTYPE> listexternalinformationlink;
    @XmlElement(name = "LIST_PNR_LINE")
    protected List<EXTERNALPROVIDER.LISTPNRLINE> listpnrline;
    @XmlElement(name = "RESERVATION_PARAMETERS")
    protected EXTERNALPROVIDER.RESERVATIONPARAMETERS reservationparameters;
    @XmlElement(name = "LIST_ADDITIONAL_FIELD")
    protected List<EXTERNALPROVIDER.LISTADDITIONALFIELD> listadditionalfield;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "MAIN_TYPE")
    protected String maintype;
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
     *     {@link EXTERNALPROVIDER.STATUS }
     *     
     */
    public EXTERNALPROVIDER.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.STATUS }
     *     
     */
    public void setSTATUS(EXTERNALPROVIDER.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.DESCRIPTION }
     *     
     */
    public EXTERNALPROVIDER.DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(EXTERNALPROVIDER.DESCRIPTION value) {
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
     *     {@link EXTERNALPROVIDER.PERMISSIONS }
     *     
     */
    public EXTERNALPROVIDER.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(EXTERNALPROVIDER.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.ELIGIBILITYINFORMATION }
     *     
     */
    public EXTERNALPROVIDER.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(EXTERNALPROVIDER.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the pnrinformation property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.PNRINFORMATION }
     *     
     */
    public EXTERNALPROVIDER.PNRINFORMATION getPNRINFORMATION() {
        return pnrinformation;
    }

    /**
     * Sets the value of the pnrinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.PNRINFORMATION }
     *     
     */
    public void setPNRINFORMATION(EXTERNALPROVIDER.PNRINFORMATION value) {
        this.pnrinformation = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.ISSUEDATE }
     *     
     */
    public EXTERNALPROVIDER.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(EXTERNALPROVIDER.ISSUEDATE value) {
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
     * Gets the value of the externalprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALPROVIDER() {
        return externalprovider;
    }

    /**
     * Sets the value of the externalprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALPROVIDER(String value) {
        this.externalprovider = value;
    }

    /**
     * Gets the value of the reservationtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVATIONTITLE() {
        return reservationtitle;
    }

    /**
     * Sets the value of the reservationtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVATIONTITLE(String value) {
        this.reservationtitle = value;
    }

    /**
     * Gets the value of the reservationdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVATIONDESCRIPTION() {
        return reservationdescription;
    }

    /**
     * Sets the value of the reservationdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVATIONDESCRIPTION(String value) {
        this.reservationdescription = value;
    }

    /**
     * Gets the value of the logoreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOGOREFERENCE() {
        return logoreference;
    }

    /**
     * Sets the value of the logoreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOGOREFERENCE(String value) {
        this.logoreference = value;
    }

    /**
     * Gets the value of the reservationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVATIONNUMBER() {
        return reservationnumber;
    }

    /**
     * Sets the value of the reservationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVATIONNUMBER(String value) {
        this.reservationnumber = value;
    }

    /**
     * Gets the value of the reservationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRESERVATIONSTATUS() {
        return reservationstatus;
    }

    /**
     * Sets the value of the reservationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRESERVATIONSTATUS(Object value) {
        this.reservationstatus = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION }
     *     
     */
    public LOCATION getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION }
     *     
     */
    public void setBLOCATION(LOCATION value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION }
     *     
     */
    public LOCATION getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION }
     *     
     */
    public void setELOCATION(LOCATION value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.BDATE }
     *     
     */
    public EXTERNALPROVIDER.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.BDATE }
     *     
     */
    public void setBDATE(EXTERNALPROVIDER.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.EDATE }
     *     
     */
    public EXTERNALPROVIDER.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.EDATE }
     *     
     */
    public void setEDATE(EXTERNALPROVIDER.EDATE value) {
        this.edate = value;
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
     * {@link SEGMENT }
     * 
     * 
     */
    public List<SEGMENT> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SEGMENT>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the operatorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATORNAME() {
        return operatorname;
    }

    /**
     * Sets the value of the operatorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATORNAME(String value) {
        this.operatorname = value;
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
     * {@link PRICEBREAKDOWNTYPE }
     * 
     * 
     */
    public List<PRICEBREAKDOWNTYPE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<PRICEBREAKDOWNTYPE>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXTERNALPROVIDER.LISTTRAVELLER }
     * 
     * 
     */
    public List<EXTERNALPROVIDER.LISTTRAVELLER> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<EXTERNALPROVIDER.LISTTRAVELLER>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the externalpaymentinformation property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.EXTERNALPAYMENTINFORMATION }
     *     
     */
    public EXTERNALPROVIDER.EXTERNALPAYMENTINFORMATION getEXTERNALPAYMENTINFORMATION() {
        return externalpaymentinformation;
    }

    /**
     * Sets the value of the externalpaymentinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.EXTERNALPAYMENTINFORMATION }
     *     
     */
    public void setEXTERNALPAYMENTINFORMATION(EXTERNALPROVIDER.EXTERNALPAYMENTINFORMATION value) {
        this.externalpaymentinformation = value;
    }

    /**
     * Gets the value of the externaldeliveryinformation property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.EXTERNALDELIVERYINFORMATION }
     *     
     */
    public EXTERNALPROVIDER.EXTERNALDELIVERYINFORMATION getEXTERNALDELIVERYINFORMATION() {
        return externaldeliveryinformation;
    }

    /**
     * Sets the value of the externaldeliveryinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.EXTERNALDELIVERYINFORMATION }
     *     
     */
    public void setEXTERNALDELIVERYINFORMATION(EXTERNALPROVIDER.EXTERNALDELIVERYINFORMATION value) {
        this.externaldeliveryinformation = value;
    }

    /**
     * Gets the value of the additionalinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADDITIONALINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getADDITIONALINFORMATION() {
        if (additionalinformation == null) {
            additionalinformation = new ArrayList<String>();
        }
        return this.additionalinformation;
    }

    /**
     * Gets the value of the externalinformationurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALINFORMATIONURL() {
        return externalinformationurl;
    }

    /**
     * Sets the value of the externalinformationurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALINFORMATIONURL(String value) {
        this.externalinformationurl = value;
    }

    /**
     * Gets the value of the externalinformationlinktext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALINFORMATIONLINKTEXT() {
        return externalinformationlinktext;
    }

    /**
     * Sets the value of the externalinformationlinktext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALINFORMATIONLINKTEXT(String value) {
        this.externalinformationlinktext = value;
    }

    /**
     * Gets the value of the listexternalinformationlink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalinformationlink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALINFORMATIONLINK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINKTYPE }
     * 
     * 
     */
    public List<LINKTYPE> getLISTEXTERNALINFORMATIONLINK() {
        if (listexternalinformationlink == null) {
            listexternalinformationlink = new ArrayList<LINKTYPE>();
        }
        return this.listexternalinformationlink;
    }

    /**
     * Gets the value of the listpnrline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpnrline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPNRLINE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXTERNALPROVIDER.LISTPNRLINE }
     * 
     * 
     */
    public List<EXTERNALPROVIDER.LISTPNRLINE> getLISTPNRLINE() {
        if (listpnrline == null) {
            listpnrline = new ArrayList<EXTERNALPROVIDER.LISTPNRLINE>();
        }
        return this.listpnrline;
    }

    /**
     * Gets the value of the reservationparameters property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALPROVIDER.RESERVATIONPARAMETERS }
     *     
     */
    public EXTERNALPROVIDER.RESERVATIONPARAMETERS getRESERVATIONPARAMETERS() {
        return reservationparameters;
    }

    /**
     * Sets the value of the reservationparameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALPROVIDER.RESERVATIONPARAMETERS }
     *     
     */
    public void setRESERVATIONPARAMETERS(EXTERNALPROVIDER.RESERVATIONPARAMETERS value) {
        this.reservationparameters = value;
    }

    /**
     * Gets the value of the listadditionalfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXTERNALPROVIDER.LISTADDITIONALFIELD }
     * 
     * 
     */
    public List<EXTERNALPROVIDER.LISTADDITIONALFIELD> getLISTADDITIONALFIELD() {
        if (listadditionalfield == null) {
            listadditionalfield = new ArrayList<EXTERNALPROVIDER.LISTADDITIONALFIELD>();
        }
        return this.listadditionalfield;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the maintype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINTYPE() {
        return maintype;
    }

    /**
     * Sets the value of the maintype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINTYPE(String value) {
        this.maintype = value;
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
     *         &lt;element name="DELIVERY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DELIVERY_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "deliverytype",
        "deliverydetails"
    })
    public static class EXTERNALDELIVERYINFORMATION
        implements Serializable
    {

        @XmlElement(name = "DELIVERY_TYPE", required = true)
        protected String deliverytype;
        @XmlElement(name = "DELIVERY_DETAILS")
        protected String deliverydetails;

        /**
         * Gets the value of the deliverytype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDELIVERYTYPE() {
            return deliverytype;
        }

        /**
         * Sets the value of the deliverytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDELIVERYTYPE(String value) {
            this.deliverytype = value;
        }

        /**
         * Gets the value of the deliverydetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDELIVERYDETAILS() {
            return deliverydetails;
        }

        /**
         * Sets the value of the deliverydetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDELIVERYDETAILS(String value) {
            this.deliverydetails = value;
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
     *         &lt;element name="PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REQUIRED_PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CVV_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "paymenttype",
        "paymentdetails",
        "requiredpaymentdetails",
        "cvvrequired"
    })
    public static class EXTERNALPAYMENTINFORMATION
        implements Serializable
    {

        @XmlElement(name = "PAYMENT_TYPE", required = true)
        protected String paymenttype;
        @XmlElement(name = "PAYMENT_DETAILS")
        protected String paymentdetails;
        @XmlElement(name = "REQUIRED_PAYMENT_DETAILS")
        protected String requiredpaymentdetails;
        @XmlElement(name = "CVV_REQUIRED")
        protected Boolean cvvrequired;

        /**
         * Gets the value of the paymenttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTTYPE() {
            return paymenttype;
        }

        /**
         * Sets the value of the paymenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTTYPE(String value) {
            this.paymenttype = value;
        }

        /**
         * Gets the value of the paymentdetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTDETAILS() {
            return paymentdetails;
        }

        /**
         * Sets the value of the paymentdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTDETAILS(String value) {
            this.paymentdetails = value;
        }

        /**
         * Gets the value of the requiredpaymentdetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUIREDPAYMENTDETAILS() {
            return requiredpaymentdetails;
        }

        /**
         * Sets the value of the requiredpaymentdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUIREDPAYMENTDETAILS(String value) {
            this.requiredpaymentdetails = value;
        }

        /**
         * Gets the value of the cvvrequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCVVREQUIRED() {
            return cvvrequired;
        }

        /**
         * Sets the value of the cvvrequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCVVREQUIRED(Boolean value) {
            this.cvvrequired = value;
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
     *         &lt;element name="KEY" type="{}CODE_NAME"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PERSISTENT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="FORWARD" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "key",
        "value",
        "persistent",
        "forward"
    })
    public static class LISTADDITIONALFIELD
        implements Serializable
    {

        @XmlElement(name = "KEY", required = true)
        protected CODENAME key;
        @XmlElement(name = "VALUE", required = true)
        protected String value;
        @XmlElement(name = "PERSISTENT")
        protected boolean persistent;
        @XmlElement(name = "FORWARD")
        protected boolean forward;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAME }
         *     
         */
        public CODENAME getKEY() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAME }
         *     
         */
        public void setKEY(CODENAME value) {
            this.key = value;
        }

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
         * Gets the value of the persistent property.
         * 
         */
        public boolean isPERSISTENT() {
            return persistent;
        }

        /**
         * Sets the value of the persistent property.
         * 
         */
        public void setPERSISTENT(boolean value) {
            this.persistent = value;
        }

        /**
         * Gets the value of the forward property.
         * 
         */
        public boolean isFORWARD() {
            return forward;
        }

        /**
         * Sets the value of the forward property.
         * 
         */
        public void setFORWARD(boolean value) {
            this.forward = value;
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
     *         &lt;element name="LINE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LINE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "linetype",
        "linetext"
    })
    public static class LISTPNRLINE
        implements Serializable
    {

        @XmlElement(name = "LINE_TYPE", required = true)
        protected String linetype;
        @XmlElement(name = "LINE_TEXT", required = true)
        protected String linetext;

        /**
         * Gets the value of the linetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINETYPE() {
            return linetype;
        }

        /**
         * Sets the value of the linetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINETYPE(String value) {
            this.linetype = value;
        }

        /**
         * Gets the value of the linetext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINETEXT() {
            return linetext;
        }

        /**
         * Sets the value of the linetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINETEXT(String value) {
            this.linetext = value;
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
     *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *           &lt;element name="AGE" type="{}AGE_TYPE" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="REFERENCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "title",
        "lastname",
        "firstname",
        "dateofbirth",
        "age",
        "referenceid"
    })
    public static class LISTTRAVELLER
        implements Serializable
    {

        @XmlElement(name = "TITLE")
        protected String title;
        @XmlElement(name = "LAST_NAME", required = true)
        protected String lastname;
        @XmlElement(name = "FIRST_NAME", required = true)
        protected String firstname;
        @XmlElement(name = "DATE_OF_BIRTH")
        protected Object dateofbirth;
        @XmlElement(name = "AGE")
        protected AGETYPE age;
        @XmlElement(name = "REFERENCE_ID")
        protected String referenceid;

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTITLE() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTITLE(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTNAME(String value) {
            this.lastname = value;
        }

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTNAME() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTNAME(String value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the dateofbirth property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDATEOFBIRTH() {
            return dateofbirth;
        }

        /**
         * Sets the value of the dateofbirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDATEOFBIRTH(Object value) {
            this.dateofbirth = value;
        }

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link AGETYPE }
         *     
         */
        public AGETYPE getAGE() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link AGETYPE }
         *     
         */
        public void setAGE(AGETYPE value) {
            this.age = value;
        }

        /**
         * Gets the value of the referenceid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCEID() {
            return referenceid;
        }

        /**
         * Sets the value of the referenceid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCEID(String value) {
            this.referenceid = value;
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
     *         &lt;element name="CANCEL_IS_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="PENDING_BOOKING_IS_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TICKETING_TIME_LIMIT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "cancelisallowed",
        "pendingbookingisallowed",
        "ticketingtimelimit"
    })
    public static class RESERVATIONPARAMETERS
        implements Serializable
    {

        @XmlElement(name = "CANCEL_IS_ALLOWED")
        protected boolean cancelisallowed;
        @XmlElement(name = "PENDING_BOOKING_IS_ALLOWED")
        protected Boolean pendingbookingisallowed;
        @XmlElement(name = "TICKETING_TIME_LIMIT")
        protected EXTERNALPROVIDER.RESERVATIONPARAMETERS.TICKETINGTIMELIMIT ticketingtimelimit;

        /**
         * Gets the value of the cancelisallowed property.
         * 
         */
        public boolean isCANCELISALLOWED() {
            return cancelisallowed;
        }

        /**
         * Sets the value of the cancelisallowed property.
         * 
         */
        public void setCANCELISALLOWED(boolean value) {
            this.cancelisallowed = value;
        }

        /**
         * Gets the value of the pendingbookingisallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPENDINGBOOKINGISALLOWED() {
            return pendingbookingisallowed;
        }

        /**
         * Sets the value of the pendingbookingisallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPENDINGBOOKINGISALLOWED(Boolean value) {
            this.pendingbookingisallowed = value;
        }

        /**
         * Gets the value of the ticketingtimelimit property.
         * 
         * @return
         *     possible object is
         *     {@link EXTERNALPROVIDER.RESERVATIONPARAMETERS.TICKETINGTIMELIMIT }
         *     
         */
        public EXTERNALPROVIDER.RESERVATIONPARAMETERS.TICKETINGTIMELIMIT getTICKETINGTIMELIMIT() {
            return ticketingtimelimit;
        }

        /**
         * Sets the value of the ticketingtimelimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link EXTERNALPROVIDER.RESERVATIONPARAMETERS.TICKETINGTIMELIMIT }
         *     
         */
        public void setTICKETINGTIMELIMIT(EXTERNALPROVIDER.RESERVATIONPARAMETERS.TICKETINGTIMELIMIT value) {
            this.ticketingtimelimit = value;
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

}
