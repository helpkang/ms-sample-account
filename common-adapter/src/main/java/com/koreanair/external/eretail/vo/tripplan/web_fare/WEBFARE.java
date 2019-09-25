
package com.koreanair.external.eretail.vo.tripplan.web_fare;

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
import com.koreanair.external.eretail.vo.farecommon.farecommon.FEEType;
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
 *         &lt;element name="LIST_BOOKING" type="{}WF_BOOKING" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RECOMMENDATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_MAX_CHECKED_BAGS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ITINERARY" maxOccurs="2"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="B_LOCATION" type="{}LOCATION_Type"/&gt;
 *                             &lt;element name="E_LOCATION" type="{}LOCATION_Type"/&gt;
 *                             &lt;element name="B_DATE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="E_DATE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AIRLINE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OTHER_AIRLINE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OP_FLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="FLIGHT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="LIST_CABIN" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                       &lt;element name="LIST_RBD" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
 *                             &lt;element name="CO2_UNITARY_VALUE" type="{}CO2_Type" minOccurs="0"/&gt;
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
 *         &lt;element name="CONFIRMATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PNR" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_TRAVELLER_TYPE" type="{}WF_TRAVELLER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_PNR_PRICE" maxOccurs="2"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
 *                             &lt;element ref="{}LIST_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="TOTAL_FEES" type="{}WFARE_FEE_Type" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="CURRENCY"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="TICKETING_TIME_LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REQUIRED_ADDITIONAL_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SERVICE" type="{}PRODUCT_SERVICE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IDENTIFICATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IS_USER_ACCOUNT_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="IS_USER_PASSWORD_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PAYMENT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LIST_ALLOWED_PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="PAYMENT_CARD" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="LIST_ALLOWED_CC_TYPE" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="CC_FEE"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="CURRENCY"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                                     &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="IS_CVV_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PAY_LATER" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TIME_LIMIT" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                 &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ADDRESS_BEHAVIOUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "listbooking",
    "recommendationid",
    "provider",
    "providercode",
    "providername",
    "providerurl",
    "providermaxcheckedbags",
    "listitinerary",
    "confirmationnumber",
    "listpnr",
    "ticketingtimelimit",
    "requiredadditionalinfo"
})
@XmlRootElement(name = "WEB_FARE")
public class WEBFARE
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
    protected WEBFARE.STATUS status;
    @XmlElement(name = "DESCRIPTION")
    protected WEBFARE.DESCRIPTION description;
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
    protected WEBFARE.PERMISSIONS permissions;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected WEBFARE.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PNR_INFORMATION")
    protected WEBFARE.PNRINFORMATION pnrinformation;
    @XmlElement(name = "ISSUE_DATE")
    protected WEBFARE.ISSUEDATE issuedate;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;
    @XmlElement(name = "ACTION_CODE")
    protected String actioncode;
    @XmlElement(name = "LIST_BOOKING", required = true)
    protected List<WFBOOKING> listbooking;
    @XmlElement(name = "RECOMMENDATION_ID")
    protected String recommendationid;
    @XmlElement(name = "PROVIDER")
    protected String provider;
    @XmlElement(name = "PROVIDER_CODE")
    protected String providercode;
    @XmlElement(name = "PROVIDER_NAME")
    protected String providername;
    @XmlElement(name = "PROVIDER_URL")
    protected String providerurl;
    @XmlElement(name = "PROVIDER_MAX_CHECKED_BAGS")
    protected Integer providermaxcheckedbags;
    @XmlElement(name = "LIST_ITINERARY", required = true)
    protected List<WEBFARE.LISTITINERARY> listitinerary;
    @XmlElement(name = "CONFIRMATION_NUMBER")
    protected String confirmationnumber;
    @XmlElement(name = "LIST_PNR")
    protected List<WEBFARE.LISTPNR> listpnr;
    @XmlElement(name = "TICKETING_TIME_LIMIT")
    protected String ticketingtimelimit;
    @XmlElement(name = "REQUIRED_ADDITIONAL_INFO")
    protected WEBFARE.REQUIREDADDITIONALINFO requiredadditionalinfo;
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
     *     {@link WEBFARE.STATUS }
     *     
     */
    public WEBFARE.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBFARE.STATUS }
     *     
     */
    public void setSTATUS(WEBFARE.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link WEBFARE.DESCRIPTION }
     *     
     */
    public WEBFARE.DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBFARE.DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(WEBFARE.DESCRIPTION value) {
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
     *     {@link WEBFARE.PERMISSIONS }
     *     
     */
    public WEBFARE.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBFARE.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(WEBFARE.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link WEBFARE.ELIGIBILITYINFORMATION }
     *     
     */
    public WEBFARE.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBFARE.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(WEBFARE.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the pnrinformation property.
     * 
     * @return
     *     possible object is
     *     {@link WEBFARE.PNRINFORMATION }
     *     
     */
    public WEBFARE.PNRINFORMATION getPNRINFORMATION() {
        return pnrinformation;
    }

    /**
     * Sets the value of the pnrinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBFARE.PNRINFORMATION }
     *     
     */
    public void setPNRINFORMATION(WEBFARE.PNRINFORMATION value) {
        this.pnrinformation = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link WEBFARE.ISSUEDATE }
     *     
     */
    public WEBFARE.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBFARE.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(WEBFARE.ISSUEDATE value) {
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
     * Gets the value of the listbooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOOKING().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WFBOOKING }
     * 
     * 
     */
    public List<WFBOOKING> getLISTBOOKING() {
        if (listbooking == null) {
            listbooking = new ArrayList<WFBOOKING>();
        }
        return this.listbooking;
    }

    /**
     * Gets the value of the recommendationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECOMMENDATIONID() {
        return recommendationid;
    }

    /**
     * Sets the value of the recommendationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECOMMENDATIONID(String value) {
        this.recommendationid = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDER() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDER(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the providercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERCODE() {
        return providercode;
    }

    /**
     * Sets the value of the providercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERCODE(String value) {
        this.providercode = value;
    }

    /**
     * Gets the value of the providername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERNAME() {
        return providername;
    }

    /**
     * Sets the value of the providername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERNAME(String value) {
        this.providername = value;
    }

    /**
     * Gets the value of the providerurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERURL() {
        return providerurl;
    }

    /**
     * Sets the value of the providerurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERURL(String value) {
        this.providerurl = value;
    }

    /**
     * Gets the value of the providermaxcheckedbags property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPROVIDERMAXCHECKEDBAGS() {
        return providermaxcheckedbags;
    }

    /**
     * Sets the value of the providermaxcheckedbags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPROVIDERMAXCHECKEDBAGS(Integer value) {
        this.providermaxcheckedbags = value;
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
     * {@link WEBFARE.LISTITINERARY }
     * 
     * 
     */
    public List<WEBFARE.LISTITINERARY> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<WEBFARE.LISTITINERARY>();
        }
        return this.listitinerary;
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
     * {@link WEBFARE.LISTPNR }
     * 
     * 
     */
    public List<WEBFARE.LISTPNR> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<WEBFARE.LISTPNR>();
        }
        return this.listpnr;
    }

    /**
     * Gets the value of the ticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINGTIMELIMIT() {
        return ticketingtimelimit;
    }

    /**
     * Sets the value of the ticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINGTIMELIMIT(String value) {
        this.ticketingtimelimit = value;
    }

    /**
     * Gets the value of the requiredadditionalinfo property.
     * 
     * @return
     *     possible object is
     *     {@link WEBFARE.REQUIREDADDITIONALINFO }
     *     
     */
    public WEBFARE.REQUIREDADDITIONALINFO getREQUIREDADDITIONALINFO() {
        return requiredadditionalinfo;
    }

    /**
     * Sets the value of the requiredadditionalinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBFARE.REQUIREDADDITIONALINFO }
     *     
     */
    public void setREQUIREDADDITIONALINFO(WEBFARE.REQUIREDADDITIONALINFO value) {
        this.requiredadditionalinfo = value;
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
     *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="B_LOCATION" type="{}LOCATION_Type"/&gt;
     *                   &lt;element name="E_LOCATION" type="{}LOCATION_Type"/&gt;
     *                   &lt;element name="B_DATE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="E_DATE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AIRLINE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OTHER_AIRLINE" minOccurs="0"&gt;
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
     *                   &lt;element name="OP_FLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="FLIGHT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="LIST_CABIN" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_RBD" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
     *                   &lt;element name="CO2_UNITARY_VALUE" type="{}CO2_Type" minOccurs="0"/&gt;
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
        "listsegment"
    })
    public static class LISTITINERARY
        implements Serializable
    {

        @XmlElement(name = "LIST_SEGMENT", required = true)
        protected List<WEBFARE.LISTITINERARY.LISTSEGMENT> listsegment;

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
         * {@link WEBFARE.LISTITINERARY.LISTSEGMENT }
         * 
         * 
         */
        public List<WEBFARE.LISTITINERARY.LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<WEBFARE.LISTITINERARY.LISTSEGMENT>();
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
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="B_LOCATION" type="{}LOCATION_Type"/&gt;
         *         &lt;element name="E_LOCATION" type="{}LOCATION_Type"/&gt;
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
         *         &lt;element name="AIRLINE"&gt;
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
         *         &lt;element name="OTHER_AIRLINE" minOccurs="0"&gt;
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
         *         &lt;element name="OP_FLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="FLIGHT_NUMBER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="LIST_CABIN" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_RBD" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
         *         &lt;element name="CO2_UNITARY_VALUE" type="{}CO2_Type" minOccurs="0"/&gt;
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
            "blocation",
            "elocation",
            "bdate",
            "edate",
            "airline",
            "otherairline",
            "opflag",
            "flightnumber",
            "listcabin",
            "co2UNITARYVALUE"
        })
        public static class LISTSEGMENT
            implements Serializable
        {

            @XmlElement(name = "SEGMENT_ID")
            protected BigInteger segmentid;
            @XmlElement(name = "B_LOCATION", required = true)
            protected LOCATIONType blocation;
            @XmlElement(name = "E_LOCATION", required = true)
            protected LOCATIONType elocation;
            @XmlElement(name = "B_DATE", required = true)
            protected WEBFARE.LISTITINERARY.LISTSEGMENT.BDATE bdate;
            @XmlElement(name = "E_DATE", required = true)
            protected WEBFARE.LISTITINERARY.LISTSEGMENT.EDATE edate;
            @XmlElement(name = "AIRLINE", required = true)
            protected WEBFARE.LISTITINERARY.LISTSEGMENT.AIRLINE airline;
            @XmlElement(name = "OTHER_AIRLINE")
            protected WEBFARE.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE otherairline;
            @XmlElement(name = "OP_FLAG")
            protected Boolean opflag;
            @XmlElement(name = "FLIGHT_NUMBER", required = true)
            protected String flightnumber;
            @XmlElement(name = "LIST_CABIN")
            protected List<WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN> listcabin;
            @XmlElement(name = "CO2_UNITARY_VALUE")
            protected CO2Type co2UNITARYVALUE;

            /**
             * Gets the value of the segmentid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSEGMENTID() {
                return segmentid;
            }

            /**
             * Sets the value of the segmentid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSEGMENTID(BigInteger value) {
                this.segmentid = value;
            }

            /**
             * Gets the value of the blocation property.
             * 
             * @return
             *     possible object is
             *     {@link LOCATIONType }
             *     
             */
            public LOCATIONType getBLOCATION() {
                return blocation;
            }

            /**
             * Sets the value of the blocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LOCATIONType }
             *     
             */
            public void setBLOCATION(LOCATIONType value) {
                this.blocation = value;
            }

            /**
             * Gets the value of the elocation property.
             * 
             * @return
             *     possible object is
             *     {@link LOCATIONType }
             *     
             */
            public LOCATIONType getELOCATION() {
                return elocation;
            }

            /**
             * Sets the value of the elocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LOCATIONType }
             *     
             */
            public void setELOCATION(LOCATIONType value) {
                this.elocation = value;
            }

            /**
             * Gets the value of the bdate property.
             * 
             * @return
             *     possible object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.BDATE }
             *     
             */
            public WEBFARE.LISTITINERARY.LISTSEGMENT.BDATE getBDATE() {
                return bdate;
            }

            /**
             * Sets the value of the bdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.BDATE }
             *     
             */
            public void setBDATE(WEBFARE.LISTITINERARY.LISTSEGMENT.BDATE value) {
                this.bdate = value;
            }

            /**
             * Gets the value of the edate property.
             * 
             * @return
             *     possible object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.EDATE }
             *     
             */
            public WEBFARE.LISTITINERARY.LISTSEGMENT.EDATE getEDATE() {
                return edate;
            }

            /**
             * Sets the value of the edate property.
             * 
             * @param value
             *     allowed object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.EDATE }
             *     
             */
            public void setEDATE(WEBFARE.LISTITINERARY.LISTSEGMENT.EDATE value) {
                this.edate = value;
            }

            /**
             * Gets the value of the airline property.
             * 
             * @return
             *     possible object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.AIRLINE }
             *     
             */
            public WEBFARE.LISTITINERARY.LISTSEGMENT.AIRLINE getAIRLINE() {
                return airline;
            }

            /**
             * Sets the value of the airline property.
             * 
             * @param value
             *     allowed object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.AIRLINE }
             *     
             */
            public void setAIRLINE(WEBFARE.LISTITINERARY.LISTSEGMENT.AIRLINE value) {
                this.airline = value;
            }

            /**
             * Gets the value of the otherairline property.
             * 
             * @return
             *     possible object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE }
             *     
             */
            public WEBFARE.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE getOTHERAIRLINE() {
                return otherairline;
            }

            /**
             * Sets the value of the otherairline property.
             * 
             * @param value
             *     allowed object is
             *     {@link WEBFARE.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE }
             *     
             */
            public void setOTHERAIRLINE(WEBFARE.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE value) {
                this.otherairline = value;
            }

            /**
             * Gets the value of the opflag property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOPFLAG() {
                return opflag;
            }

            /**
             * Sets the value of the opflag property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOPFLAG(Boolean value) {
                this.opflag = value;
            }

            /**
             * Gets the value of the flightnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLIGHTNUMBER() {
                return flightnumber;
            }

            /**
             * Sets the value of the flightnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLIGHTNUMBER(String value) {
                this.flightnumber = value;
            }

            /**
             * Gets the value of the listcabin property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcabin property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCABIN().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN }
             * 
             * 
             */
            public List<WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN> getLISTCABIN() {
                if (listcabin == null) {
                    listcabin = new ArrayList<WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN>();
                }
                return this.listcabin;
            }

            /**
             * Gets the value of the co2UNITARYVALUE property.
             * 
             * @return
             *     possible object is
             *     {@link CO2Type }
             *     
             */
            public CO2Type getCO2UNITARYVALUE() {
                return co2UNITARYVALUE;
            }

            /**
             * Sets the value of the co2UNITARYVALUE property.
             * 
             * @param value
             *     allowed object is
             *     {@link CO2Type }
             *     
             */
            public void setCO2UNITARYVALUE(CO2Type value) {
                this.co2UNITARYVALUE = value;
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
            public static class AIRLINE
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
             *         &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="LIST_RBD" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "cabin",
                "listrbd"
            })
            public static class LISTCABIN
                implements Serializable
            {

                @XmlElement(name = "CABIN")
                protected Object cabin;
                @XmlElement(name = "LIST_RBD")
                protected List<WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN.LISTRBD> listrbd;

                /**
                 * Gets the value of the cabin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCABIN() {
                    return cabin;
                }

                /**
                 * Sets the value of the cabin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCABIN(Object value) {
                    this.cabin = value;
                }

                /**
                 * Gets the value of the listrbd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listrbd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTRBD().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN.LISTRBD }
                 * 
                 * 
                 */
                public List<WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN.LISTRBD> getLISTRBD() {
                    if (listrbd == null) {
                        listrbd = new ArrayList<WEBFARE.LISTITINERARY.LISTSEGMENT.LISTCABIN.LISTRBD>();
                    }
                    return this.listrbd;
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
                 *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                    "rbd"
                })
                public static class LISTRBD
                    implements Serializable
                {

                    @XmlElement(name = "RBD", required = true)
                    protected Object rbd;

                    /**
                     * Gets the value of the rbd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getRBD() {
                        return rbd;
                    }

                    /**
                     * Sets the value of the rbd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setRBD(Object value) {
                        this.rbd = value;
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
            public static class OTHERAIRLINE
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
     *         &lt;element name="LIST_TRAVELLER_TYPE" type="{}WF_TRAVELLER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_PNR_PRICE" maxOccurs="2"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
     *                   &lt;element ref="{}LIST_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="TOTAL_FEES" type="{}WFARE_FEE_Type" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="CURRENCY"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "listtravellertype",
        "listpnrprice"
    })
    public static class LISTPNR
        implements Serializable
    {

        @XmlElement(name = "LIST_TRAVELLER_TYPE")
        protected List<WFTRAVELLERTYPE> listtravellertype;
        @XmlElement(name = "LIST_PNR_PRICE", required = true)
        protected List<WEBFARE.LISTPNR.LISTPNRPRICE> listpnrprice;

        /**
         * Gets the value of the listtravellertype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WFTRAVELLERTYPE }
         * 
         * 
         */
        public List<WFTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
            if (listtravellertype == null) {
                listtravellertype = new ArrayList<WFTRAVELLERTYPE>();
            }
            return this.listtravellertype;
        }

        /**
         * Gets the value of the listpnrprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpnrprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPNRPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WEBFARE.LISTPNR.LISTPNRPRICE }
         * 
         * 
         */
        public List<WEBFARE.LISTPNR.LISTPNRPRICE> getLISTPNRPRICE() {
            if (listpnrprice == null) {
                listpnrprice = new ArrayList<WEBFARE.LISTPNR.LISTPNRPRICE>();
            }
            return this.listpnrprice;
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
         *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
         *         &lt;element ref="{}LIST_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="TOTAL_FEES" type="{}WFARE_FEE_Type" minOccurs="0"/&gt;
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="CURRENCY"&gt;
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
            "totalamount",
            "amountwithouttax",
            "listfee",
            "totalfees",
            "amount",
            "currency"
        })
        public static class LISTPNRPRICE
            implements Serializable
        {

            @XmlElement(name = "TOTAL_AMOUNT")
            protected BigDecimal totalamount;
            @XmlElement(name = "AMOUNT_WITHOUT_TAX")
            protected BigDecimal amountwithouttax;
            @XmlElement(name = "LIST_FEE")
            protected List<FEEType> listfee;
            @XmlElement(name = "TOTAL_FEES")
            protected WFAREFEEType totalfees;
            @XmlElement(name = "AMOUNT", required = true)
            protected BigDecimal amount;
            @XmlElement(name = "CURRENCY", required = true)
            protected WEBFARE.LISTPNR.LISTPNRPRICE.CURRENCY currency;

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
             * Gets the value of the totalfees property.
             * 
             * @return
             *     possible object is
             *     {@link WFAREFEEType }
             *     
             */
            public WFAREFEEType getTOTALFEES() {
                return totalfees;
            }

            /**
             * Sets the value of the totalfees property.
             * 
             * @param value
             *     allowed object is
             *     {@link WFAREFEEType }
             *     
             */
            public void setTOTALFEES(WFAREFEEType value) {
                this.totalfees = value;
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
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link WEBFARE.LISTPNR.LISTPNRPRICE.CURRENCY }
             *     
             */
            public WEBFARE.LISTPNR.LISTPNRPRICE.CURRENCY getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link WEBFARE.LISTPNR.LISTPNRPRICE.CURRENCY }
             *     
             */
            public void setCURRENCY(WEBFARE.LISTPNR.LISTPNRPRICE.CURRENCY value) {
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
     *         &lt;element name="LIST_SERVICE" type="{}PRODUCT_SERVICE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IDENTIFICATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IS_USER_ACCOUNT_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="IS_USER_PASSWORD_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PAYMENT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_ALLOWED_PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="PAYMENT_CARD" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LIST_ALLOWED_CC_TYPE" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="CC_FEE"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="CURRENCY"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                           &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
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
     *                             &lt;element name="IS_CVV_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PAY_LATER" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TIME_LIMIT" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                       &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *         &lt;element name="ADDRESS_BEHAVIOUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "listservice",
        "identification",
        "payment",
        "addressbehaviour"
    })
    public static class REQUIREDADDITIONALINFO
        implements Serializable
    {

        @XmlElement(name = "LIST_SERVICE")
        protected List<PRODUCTSERVICE> listservice;
        @XmlElement(name = "IDENTIFICATION")
        protected WEBFARE.REQUIREDADDITIONALINFO.IDENTIFICATION identification;
        @XmlElement(name = "PAYMENT")
        protected WEBFARE.REQUIREDADDITIONALINFO.PAYMENT payment;
        @XmlElement(name = "ADDRESS_BEHAVIOUR", required = true)
        protected String addressbehaviour;

        /**
         * Gets the value of the listservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PRODUCTSERVICE }
         * 
         * 
         */
        public List<PRODUCTSERVICE> getLISTSERVICE() {
            if (listservice == null) {
                listservice = new ArrayList<PRODUCTSERVICE>();
            }
            return this.listservice;
        }

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link WEBFARE.REQUIREDADDITIONALINFO.IDENTIFICATION }
         *     
         */
        public WEBFARE.REQUIREDADDITIONALINFO.IDENTIFICATION getIDENTIFICATION() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link WEBFARE.REQUIREDADDITIONALINFO.IDENTIFICATION }
         *     
         */
        public void setIDENTIFICATION(WEBFARE.REQUIREDADDITIONALINFO.IDENTIFICATION value) {
            this.identification = value;
        }

        /**
         * Gets the value of the payment property.
         * 
         * @return
         *     possible object is
         *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT }
         *     
         */
        public WEBFARE.REQUIREDADDITIONALINFO.PAYMENT getPAYMENT() {
            return payment;
        }

        /**
         * Sets the value of the payment property.
         * 
         * @param value
         *     allowed object is
         *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT }
         *     
         */
        public void setPAYMENT(WEBFARE.REQUIREDADDITIONALINFO.PAYMENT value) {
            this.payment = value;
        }

        /**
         * Gets the value of the addressbehaviour property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSBEHAVIOUR() {
            return addressbehaviour;
        }

        /**
         * Sets the value of the addressbehaviour property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSBEHAVIOUR(String value) {
            this.addressbehaviour = value;
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
         *         &lt;element name="IS_USER_ACCOUNT_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="IS_USER_PASSWORD_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
            "isuseraccountsupported",
            "isuserpasswordsupported"
        })
        public static class IDENTIFICATION
            implements Serializable
        {

            @XmlElement(name = "IS_USER_ACCOUNT_SUPPORTED")
            protected boolean isuseraccountsupported;
            @XmlElement(name = "IS_USER_PASSWORD_SUPPORTED")
            protected boolean isuserpasswordsupported;

            /**
             * Gets the value of the isuseraccountsupported property.
             * 
             */
            public boolean isISUSERACCOUNTSUPPORTED() {
                return isuseraccountsupported;
            }

            /**
             * Sets the value of the isuseraccountsupported property.
             * 
             */
            public void setISUSERACCOUNTSUPPORTED(boolean value) {
                this.isuseraccountsupported = value;
            }

            /**
             * Gets the value of the isuserpasswordsupported property.
             * 
             */
            public boolean isISUSERPASSWORDSUPPORTED() {
                return isuserpasswordsupported;
            }

            /**
             * Sets the value of the isuserpasswordsupported property.
             * 
             */
            public void setISUSERPASSWORDSUPPORTED(boolean value) {
                this.isuserpasswordsupported = value;
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
         *         &lt;element name="LIST_ALLOWED_PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *         &lt;element name="PAYMENT_CARD" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LIST_ALLOWED_CC_TYPE" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="CC_FEE"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="CURRENCY"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="IS_CVV_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PAY_LATER" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TIME_LIMIT" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                             &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "listallowedpaymenttype",
            "paymentcard",
            "paylater"
        })
        public static class PAYMENT
            implements Serializable
        {

            @XmlElement(name = "LIST_ALLOWED_PAYMENT_TYPE", required = true)
            protected List<String> listallowedpaymenttype;
            @XmlElement(name = "PAYMENT_CARD")
            protected WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD paymentcard;
            @XmlElement(name = "PAY_LATER")
            protected WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER paylater;

            /**
             * Gets the value of the listallowedpaymenttype property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listallowedpaymenttype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTALLOWEDPAYMENTTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLISTALLOWEDPAYMENTTYPE() {
                if (listallowedpaymenttype == null) {
                    listallowedpaymenttype = new ArrayList<String>();
                }
                return this.listallowedpaymenttype;
            }

            /**
             * Gets the value of the paymentcard property.
             * 
             * @return
             *     possible object is
             *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD }
             *     
             */
            public WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD getPAYMENTCARD() {
                return paymentcard;
            }

            /**
             * Sets the value of the paymentcard property.
             * 
             * @param value
             *     allowed object is
             *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD }
             *     
             */
            public void setPAYMENTCARD(WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD value) {
                this.paymentcard = value;
            }

            /**
             * Gets the value of the paylater property.
             * 
             * @return
             *     possible object is
             *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER }
             *     
             */
            public WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER getPAYLATER() {
                return paylater;
            }

            /**
             * Sets the value of the paylater property.
             * 
             * @param value
             *     allowed object is
             *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER }
             *     
             */
            public void setPAYLATER(WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER value) {
                this.paylater = value;
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
             *         &lt;element name="TIME_LIMIT" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                   &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "timelimit"
            })
            public static class PAYLATER
                implements Serializable
            {

                @XmlElement(name = "TIME_LIMIT")
                protected WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER.TIMELIMIT timelimit;

                /**
                 * Gets the value of the timelimit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER.TIMELIMIT }
                 *     
                 */
                public WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER.TIMELIMIT getTIMELIMIT() {
                    return timelimit;
                }

                /**
                 * Sets the value of the timelimit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER.TIMELIMIT }
                 *     
                 */
                public void setTIMELIMIT(WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYLATER.TIMELIMIT value) {
                    this.timelimit = value;
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
                 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *         &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "units"
                })
                public static class TIMELIMIT
                    implements Serializable
                {

                    @XmlElement(name = "VALUE")
                    protected int value;
                    @XmlElement(name = "UNITS", required = true)
                    protected String units;

                    /**
                     * Gets the value of the value property.
                     * 
                     */
                    public int getVALUE() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     */
                    public void setVALUE(int value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the units property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUNITS() {
                        return units;
                    }

                    /**
                     * Sets the value of the units property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUNITS(String value) {
                        this.units = value;
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
             *         &lt;element name="LIST_ALLOWED_CC_TYPE" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="CC_FEE"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="CURRENCY"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *         &lt;element name="IS_CVV_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
                "listallowedcctype",
                "iscvvrequired"
            })
            public static class PAYMENTCARD
                implements Serializable
            {

                @XmlElement(name = "LIST_ALLOWED_CC_TYPE", required = true)
                protected List<WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE> listallowedcctype;
                @XmlElement(name = "IS_CVV_REQUIRED")
                protected boolean iscvvrequired;

                /**
                 * Gets the value of the listallowedcctype property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listallowedcctype property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTALLOWEDCCTYPE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE }
                 * 
                 * 
                 */
                public List<WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE> getLISTALLOWEDCCTYPE() {
                    if (listallowedcctype == null) {
                        listallowedcctype = new ArrayList<WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE>();
                    }
                    return this.listallowedcctype;
                }

                /**
                 * Gets the value of the iscvvrequired property.
                 * 
                 */
                public boolean isISCVVREQUIRED() {
                    return iscvvrequired;
                }

                /**
                 * Sets the value of the iscvvrequired property.
                 * 
                 */
                public void setISCVVREQUIRED(boolean value) {
                    this.iscvvrequired = value;
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
                 *         &lt;element name="CC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="CC_FEE"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="CURRENCY"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "cctype",
                    "ccfee"
                })
                public static class LISTALLOWEDCCTYPE
                    implements Serializable
                {

                    @XmlElement(name = "CC_TYPE")
                    protected String cctype;
                    @XmlElement(name = "CC_FEE", required = true)
                    protected WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE ccfee;

                    /**
                     * Gets the value of the cctype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCCTYPE() {
                        return cctype;
                    }

                    /**
                     * Sets the value of the cctype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCCTYPE(String value) {
                        this.cctype = value;
                    }

                    /**
                     * Gets the value of the ccfee property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE }
                     *     
                     */
                    public WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE getCCFEE() {
                        return ccfee;
                    }

                    /**
                     * Sets the value of the ccfee property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE }
                     *     
                     */
                    public void setCCFEE(WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE value) {
                        this.ccfee = value;
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
                     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="CURRENCY"&gt;
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
                    public static class CCFEE
                        implements Serializable
                    {

                        @XmlElement(name = "AMOUNT", required = true)
                        protected BigDecimal amount;
                        @XmlElement(name = "CURRENCY", required = true)
                        protected WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE.CURRENCY currency;

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
                         *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE.CURRENCY }
                         *     
                         */
                        public WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE.CURRENCY getCURRENCY() {
                            return currency;
                        }

                        /**
                         * Sets the value of the currency property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE.CURRENCY }
                         *     
                         */
                        public void setCURRENCY(WEBFARE.REQUIREDADDITIONALINFO.PAYMENT.PAYMENTCARD.LISTALLOWEDCCTYPE.CCFEE.CURRENCY value) {
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
