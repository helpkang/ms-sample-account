
package com.koreanair.external.eretail.vo.tripplan.rail;

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
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.RAILLOCATIONType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.RAILVIALOCATIONType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.TRAINCABINType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.TRAINCOMPANYType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.TRAINPRICEType;
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
 *         &lt;element name="SEGMENT_TATTOO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}SYSTEM_PROVIDER" minOccurs="0"/&gt;
 *         &lt;element name="BOOKABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="B_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="E_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="CONNECTION_TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="DIRECT"/&gt;
 *               &lt;enumeration value="VIA"/&gt;
 *               &lt;enumeration value="ALL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_VIA_LOCATION" type="{}RAIL_VIA_LOCATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_TICKETING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DURATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TICKET_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TCN" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type"/&gt;
 *                   &lt;element name="TRAIN_NUMBER"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DURATION" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="RAIL_COACH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="B_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *                   &lt;element name="B_PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="E_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *                   &lt;element name="E_PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="B_DATE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="E_DATE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EQUIPMENT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;minLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_SERVICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="RESERVATION_TYPE" minOccurs="0"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{}unprotectedStringType"&gt;
 *                           &lt;enumeration value="POSSIBLE"/&gt;
 *                           &lt;enumeration value="IMPOSSIBLE"/&gt;
 *                           &lt;enumeration value="MANDATORY"/&gt;
 *                           &lt;enumeration value="ADVISED"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="RESERVATION_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                     &lt;element name="RESERVATION_POSSIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="RAIL_INVENTORY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_SEATING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
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
 *                   &lt;element name="CLOSE_TO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="WAGON_NUMBER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="SEAT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MEAL" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;enumeration value="P"/&gt;
 *                                   &lt;enumeration value="M"/&gt;
 *                                   &lt;enumeration value="D"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PRICE_SUPPLEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="E_TICKETING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_Type" minOccurs="0"/&gt;
 *                   &lt;element name="SEASON_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CABIN" type="{}TRAIN_CABIN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_SEAT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CARRIAGE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="COMPARTMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SEAT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MEAL" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_SEATING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
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
 *         &lt;element name="ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" type="{}TRAIN_PRICE_Type" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="OFFER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;group ref="{}RulesDrivenInformation"/&gt;
 *         &lt;element name="JUSTIFICATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JUSTIFICATION_FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JUSTIFICATION_CODE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRN_CONFIRMATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_TRN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELSHOPPER_ELEMENT_REF" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELSHOPPER_TICKET" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_Type" minOccurs="0"/&gt;
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
    "segmenttattoo",
    "provideritemid",
    "systemprovider",
    "bookable",
    "blocation",
    "elocation",
    "connectiontype",
    "listvialocation",
    "bdate",
    "edate",
    "eticketing",
    "duration",
    "listsegment",
    "id",
    "listprice",
    "offerid",
    "boolisoutofpolicy",
    "displayrank",
    "justificationcode",
    "justificationfreetext",
    "justificationcodedesc",
    "trnconfirmationnumber",
    "istrn",
    "travelshopperelementref",
    "travelshopperticket",
    "traincabin"
})
@XmlRootElement(name = "RAIL")
public class RAIL
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
    protected RAIL.STATUS status;
    @XmlElement(name = "DESCRIPTION")
    protected RAIL.DESCRIPTION description;
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
    protected RAIL.PERMISSIONS permissions;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected RAIL.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PNR_INFORMATION")
    protected RAIL.PNRINFORMATION pnrinformation;
    @XmlElement(name = "ISSUE_DATE")
    protected RAIL.ISSUEDATE issuedate;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;
    @XmlElement(name = "ACTION_CODE")
    protected String actioncode;
    @XmlElement(name = "SEGMENT_TATTOO")
    protected BigInteger segmenttattoo;
    @XmlElement(name = "PROVIDER_ITEM_ID")
    protected BigInteger provideritemid;
    @XmlElement(name = "SYSTEM_PROVIDER")
    protected String systemprovider;
    @XmlElement(name = "BOOKABLE")
    protected Boolean bookable;
    @XmlElement(name = "B_LOCATION", required = true)
    protected RAILLOCATIONType blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected RAILLOCATIONType elocation;
    @XmlElement(name = "CONNECTION_TYPE", required = true)
    protected String connectiontype;
    @XmlElement(name = "LIST_VIA_LOCATION")
    protected List<RAILVIALOCATIONType> listvialocation;
    @XmlElement(name = "B_DATE", required = true)
    protected RAIL.BDATE bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected RAIL.EDATE edate;
    @XmlElement(name = "E_TICKETING")
    protected Boolean eticketing;
    @XmlElement(name = "DURATION")
    protected String duration;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<RAIL.LISTSEGMENT> listsegment;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "LIST_PRICE")
    protected List<TRAINPRICEType> listprice;
    @XmlElement(name = "OFFER_ID")
    protected String offerid;
    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "DISPLAY_RANK")
    protected String displayrank;
    @XmlElement(name = "JUSTIFICATION_CODE")
    protected String justificationcode;
    @XmlElement(name = "JUSTIFICATION_FREE_TEXT")
    protected String justificationfreetext;
    @XmlElement(name = "JUSTIFICATION_CODE_DESC")
    protected String justificationcodedesc;
    @XmlElement(name = "TRN_CONFIRMATION_NUMBER")
    protected String trnconfirmationnumber;
    @XmlElement(name = "IS_TRN")
    protected Boolean istrn;
    @XmlElement(name = "TRAVELSHOPPER_ELEMENT_REF")
    protected Byte travelshopperelementref;
    @XmlElement(name = "TRAVELSHOPPER_TICKET")
    protected Byte travelshopperticket;
    @XmlElement(name = "TRAIN_CABIN")
    protected TRAINCABINType traincabin;
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
     *     {@link RAIL.STATUS }
     *     
     */
    public RAIL.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.STATUS }
     *     
     */
    public void setSTATUS(RAIL.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link RAIL.DESCRIPTION }
     *     
     */
    public RAIL.DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(RAIL.DESCRIPTION value) {
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
     *     {@link RAIL.PERMISSIONS }
     *     
     */
    public RAIL.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(RAIL.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link RAIL.ELIGIBILITYINFORMATION }
     *     
     */
    public RAIL.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(RAIL.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the pnrinformation property.
     * 
     * @return
     *     possible object is
     *     {@link RAIL.PNRINFORMATION }
     *     
     */
    public RAIL.PNRINFORMATION getPNRINFORMATION() {
        return pnrinformation;
    }

    /**
     * Sets the value of the pnrinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.PNRINFORMATION }
     *     
     */
    public void setPNRINFORMATION(RAIL.PNRINFORMATION value) {
        this.pnrinformation = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link RAIL.ISSUEDATE }
     *     
     */
    public RAIL.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(RAIL.ISSUEDATE value) {
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
     * Gets the value of the segmenttattoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTTATTOO() {
        return segmenttattoo;
    }

    /**
     * Sets the value of the segmenttattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTTATTOO(BigInteger value) {
        this.segmenttattoo = value;
    }

    /**
     * Gets the value of the provideritemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPROVIDERITEMID() {
        return provideritemid;
    }

    /**
     * Sets the value of the provideritemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPROVIDERITEMID(BigInteger value) {
        this.provideritemid = value;
    }

    /**
     * Gets the value of the systemprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMPROVIDER() {
        return systemprovider;
    }

    /**
     * Sets the value of the systemprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMPROVIDER(String value) {
        this.systemprovider = value;
    }

    /**
     * Gets the value of the bookable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOKABLE() {
        return bookable;
    }

    /**
     * Sets the value of the bookable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOKABLE(Boolean value) {
        this.bookable = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setBLOCATION(RAILLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setELOCATION(RAILLOCATIONType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the connectiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONNECTIONTYPE() {
        return connectiontype;
    }

    /**
     * Sets the value of the connectiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONNECTIONTYPE(String value) {
        this.connectiontype = value;
    }

    /**
     * Gets the value of the listvialocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listvialocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTVIALOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAILVIALOCATIONType }
     * 
     * 
     */
    public List<RAILVIALOCATIONType> getLISTVIALOCATION() {
        if (listvialocation == null) {
            listvialocation = new ArrayList<RAILVIALOCATIONType>();
        }
        return this.listvialocation;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link RAIL.BDATE }
     *     
     */
    public RAIL.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.BDATE }
     *     
     */
    public void setBDATE(RAIL.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link RAIL.EDATE }
     *     
     */
    public RAIL.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIL.EDATE }
     *     
     */
    public void setEDATE(RAIL.EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the eticketing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETICKETING() {
        return eticketing;
    }

    /**
     * Sets the value of the eticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETICKETING(Boolean value) {
        this.eticketing = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURATION(String value) {
        this.duration = value;
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
     * {@link RAIL.LISTSEGMENT }
     * 
     * 
     */
    public List<RAIL.LISTSEGMENT> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<RAIL.LISTSEGMENT>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * {@link TRAINPRICEType }
     * 
     * 
     */
    public List<TRAINPRICEType> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<TRAINPRICEType>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the offerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFERID() {
        return offerid;
    }

    /**
     * Sets the value of the offerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFERID(String value) {
        this.offerid = value;
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
     * Gets the value of the displayrank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRANK() {
        return displayrank;
    }

    /**
     * Sets the value of the displayrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRANK(String value) {
        this.displayrank = value;
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
     * Gets the value of the trnconfirmationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNCONFIRMATIONNUMBER() {
        return trnconfirmationnumber;
    }

    /**
     * Sets the value of the trnconfirmationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNCONFIRMATIONNUMBER(String value) {
        this.trnconfirmationnumber = value;
    }

    /**
     * Gets the value of the istrn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISTRN() {
        return istrn;
    }

    /**
     * Sets the value of the istrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISTRN(Boolean value) {
        this.istrn = value;
    }

    /**
     * Gets the value of the travelshopperelementref property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTRAVELSHOPPERELEMENTREF() {
        return travelshopperelementref;
    }

    /**
     * Sets the value of the travelshopperelementref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTRAVELSHOPPERELEMENTREF(Byte value) {
        this.travelshopperelementref = value;
    }

    /**
     * Gets the value of the travelshopperticket property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTRAVELSHOPPERTICKET() {
        return travelshopperticket;
    }

    /**
     * Sets the value of the travelshopperticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTRAVELSHOPPERTICKET(Byte value) {
        this.travelshopperticket = value;
    }

    /**
     * Gets the value of the traincabin property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINCABINType }
     *     
     */
    public TRAINCABINType getTRAINCABIN() {
        return traincabin;
    }

    /**
     * Sets the value of the traincabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINCABINType }
     *     
     */
    public void setTRAINCABIN(TRAINCABINType value) {
        this.traincabin = value;
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
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
         * String type for value without CDATA
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
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
         * String type for value without CDATA
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
     *         &lt;element name="ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TICKET_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TCN" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type"/&gt;
     *         &lt;element name="TRAIN_NUMBER"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DURATION" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="RAIL_COACH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="B_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
     *         &lt;element name="B_PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="E_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
     *         &lt;element name="E_PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="B_DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="E_DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EQUIPMENT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;minLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_SERVICE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;choice&gt;
     *           &lt;element name="RESERVATION_TYPE" minOccurs="0"&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{}unprotectedStringType"&gt;
     *                 &lt;enumeration value="POSSIBLE"/&gt;
     *                 &lt;enumeration value="IMPOSSIBLE"/&gt;
     *                 &lt;enumeration value="MANDATORY"/&gt;
     *                 &lt;enumeration value="ADVISED"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="RESERVATION_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *           &lt;element name="RESERVATION_POSSIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="RAIL_INVENTORY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SEATING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
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
     *         &lt;element name="CLOSE_TO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="WAGON_NUMBER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="SEAT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MEAL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;enumeration value="P"/&gt;
     *                         &lt;enumeration value="M"/&gt;
     *                         &lt;enumeration value="D"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PRICE_SUPPLEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="E_TICKETING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_Type" minOccurs="0"/&gt;
     *         &lt;element name="SEASON_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CABIN" type="{}TRAIN_CABIN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_SEAT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CARRIAGE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="COMPARTMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SEAT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MEAL" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_SEATING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
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
        "id",
        "segmentid",
        "tickettype",
        "tcn",
        "linenumber",
        "itemid",
        "traincompany",
        "trainnumber",
        "duration",
        "railcoach",
        "blocation",
        "bplatform",
        "elocation",
        "eplatform",
        "bdate",
        "edate",
        "equipment",
        "listservice",
        "reservationtype",
        "reservationmandatory",
        "reservationpossible",
        "railinventoryid",
        "listseatinginfo",
        "closeto",
        "meal",
        "pricesupplement",
        "eticketing",
        "traincabin",
        "seasoninformation",
        "listcabin",
        "listtravellerseat"
    })
    public static class LISTSEGMENT
        implements Serializable
    {

        @XmlElement(name = "ID")
        protected String id;
        @XmlElement(name = "SEGMENT_ID", required = true)
        protected BigInteger segmentid;
        @XmlElement(name = "TICKET_TYPE")
        protected List<Object> tickettype;
        @XmlElement(name = "TCN")
        protected List<Object> tcn;
        @XmlElement(name = "LINE_NUMBER")
        protected BigInteger linenumber;
        @XmlElement(name = "ITEM_ID")
        protected BigInteger itemid;
        @XmlElement(name = "TRAIN_COMPANY", required = true)
        protected TRAINCOMPANYType traincompany;
        @XmlElement(name = "TRAIN_NUMBER", required = true)
        protected String trainnumber;
        @XmlElement(name = "DURATION", required = true)
        protected String duration;
        @XmlElement(name = "RAIL_COACH")
        protected String railcoach;
        @XmlElement(name = "B_LOCATION", required = true)
        protected RAILLOCATIONType blocation;
        @XmlElement(name = "B_PLATFORM")
        protected String bplatform;
        @XmlElement(name = "E_LOCATION", required = true)
        protected RAILLOCATIONType elocation;
        @XmlElement(name = "E_PLATFORM")
        protected String eplatform;
        @XmlElement(name = "B_DATE", required = true)
        protected RAIL.LISTSEGMENT.BDATE bdate;
        @XmlElement(name = "E_DATE", required = true)
        protected RAIL.LISTSEGMENT.EDATE edate;
        @XmlElement(name = "EQUIPMENT")
        protected RAIL.LISTSEGMENT.EQUIPMENT equipment;
        @XmlElement(name = "LIST_SERVICE")
        protected List<RAIL.LISTSEGMENT.LISTSERVICE> listservice;
        @XmlElement(name = "RESERVATION_TYPE")
        protected String reservationtype;
        @XmlElement(name = "RESERVATION_MANDATORY")
        protected Boolean reservationmandatory;
        @XmlElement(name = "RESERVATION_POSSIBLE")
        protected Boolean reservationpossible;
        @XmlElement(name = "RAIL_INVENTORY_ID")
        protected String railinventoryid;
        @XmlElement(name = "LIST_SEATING_INFO")
        protected List<RAIL.LISTSEGMENT.LISTSEATINGINFO> listseatinginfo;
        @XmlElement(name = "CLOSE_TO")
        protected RAIL.LISTSEGMENT.CLOSETO closeto;
        @XmlElement(name = "MEAL")
        protected RAIL.LISTSEGMENT.MEAL meal;
        @XmlElement(name = "PRICE_SUPPLEMENT")
        protected String pricesupplement;
        @XmlElement(name = "E_TICKETING")
        protected Boolean eticketing;
        @XmlElement(name = "TRAIN_CABIN")
        protected TRAINCABINType traincabin;
        @XmlElement(name = "SEASON_INFORMATION")
        protected String seasoninformation;
        @XmlElement(name = "LIST_CABIN")
        protected List<TRAINCABINType> listcabin;
        @XmlElement(name = "LIST_TRAVELLER_SEAT")
        protected List<RAIL.LISTSEGMENT.LISTTRAVELLERSEAT> listtravellerseat;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

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
         * Gets the value of the tickettype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tickettype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTICKETTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getTICKETTYPE() {
            if (tickettype == null) {
                tickettype = new ArrayList<Object>();
            }
            return this.tickettype;
        }

        /**
         * Gets the value of the tcn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tcn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTCN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getTCN() {
            if (tcn == null) {
                tcn = new ArrayList<Object>();
            }
            return this.tcn;
        }

        /**
         * Gets the value of the linenumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLINENUMBER() {
            return linenumber;
        }

        /**
         * Sets the value of the linenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLINENUMBER(BigInteger value) {
            this.linenumber = value;
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
         * Gets the value of the traincompany property.
         * 
         * @return
         *     possible object is
         *     {@link TRAINCOMPANYType }
         *     
         */
        public TRAINCOMPANYType getTRAINCOMPANY() {
            return traincompany;
        }

        /**
         * Sets the value of the traincompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRAINCOMPANYType }
         *     
         */
        public void setTRAINCOMPANY(TRAINCOMPANYType value) {
            this.traincompany = value;
        }

        /**
         * Gets the value of the trainnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAINNUMBER() {
            return trainnumber;
        }

        /**
         * Sets the value of the trainnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAINNUMBER(String value) {
            this.trainnumber = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDURATION() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDURATION(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the railcoach property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRAILCOACH() {
            return railcoach;
        }

        /**
         * Sets the value of the railcoach property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRAILCOACH(String value) {
            this.railcoach = value;
        }

        /**
         * Gets the value of the blocation property.
         * 
         * @return
         *     possible object is
         *     {@link RAILLOCATIONType }
         *     
         */
        public RAILLOCATIONType getBLOCATION() {
            return blocation;
        }

        /**
         * Sets the value of the blocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAILLOCATIONType }
         *     
         */
        public void setBLOCATION(RAILLOCATIONType value) {
            this.blocation = value;
        }

        /**
         * Gets the value of the bplatform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBPLATFORM() {
            return bplatform;
        }

        /**
         * Sets the value of the bplatform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBPLATFORM(String value) {
            this.bplatform = value;
        }

        /**
         * Gets the value of the elocation property.
         * 
         * @return
         *     possible object is
         *     {@link RAILLOCATIONType }
         *     
         */
        public RAILLOCATIONType getELOCATION() {
            return elocation;
        }

        /**
         * Sets the value of the elocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAILLOCATIONType }
         *     
         */
        public void setELOCATION(RAILLOCATIONType value) {
            this.elocation = value;
        }

        /**
         * Gets the value of the eplatform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEPLATFORM() {
            return eplatform;
        }

        /**
         * Sets the value of the eplatform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEPLATFORM(String value) {
            this.eplatform = value;
        }

        /**
         * Gets the value of the bdate property.
         * 
         * @return
         *     possible object is
         *     {@link RAIL.LISTSEGMENT.BDATE }
         *     
         */
        public RAIL.LISTSEGMENT.BDATE getBDATE() {
            return bdate;
        }

        /**
         * Sets the value of the bdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAIL.LISTSEGMENT.BDATE }
         *     
         */
        public void setBDATE(RAIL.LISTSEGMENT.BDATE value) {
            this.bdate = value;
        }

        /**
         * Gets the value of the edate property.
         * 
         * @return
         *     possible object is
         *     {@link RAIL.LISTSEGMENT.EDATE }
         *     
         */
        public RAIL.LISTSEGMENT.EDATE getEDATE() {
            return edate;
        }

        /**
         * Sets the value of the edate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAIL.LISTSEGMENT.EDATE }
         *     
         */
        public void setEDATE(RAIL.LISTSEGMENT.EDATE value) {
            this.edate = value;
        }

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link RAIL.LISTSEGMENT.EQUIPMENT }
         *     
         */
        public RAIL.LISTSEGMENT.EQUIPMENT getEQUIPMENT() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAIL.LISTSEGMENT.EQUIPMENT }
         *     
         */
        public void setEQUIPMENT(RAIL.LISTSEGMENT.EQUIPMENT value) {
            this.equipment = value;
        }

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
         * {@link RAIL.LISTSEGMENT.LISTSERVICE }
         * 
         * 
         */
        public List<RAIL.LISTSEGMENT.LISTSERVICE> getLISTSERVICE() {
            if (listservice == null) {
                listservice = new ArrayList<RAIL.LISTSEGMENT.LISTSERVICE>();
            }
            return this.listservice;
        }

        /**
         * Gets the value of the reservationtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESERVATIONTYPE() {
            return reservationtype;
        }

        /**
         * Sets the value of the reservationtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESERVATIONTYPE(String value) {
            this.reservationtype = value;
        }

        /**
         * Gets the value of the reservationmandatory property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRESERVATIONMANDATORY() {
            return reservationmandatory;
        }

        /**
         * Sets the value of the reservationmandatory property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRESERVATIONMANDATORY(Boolean value) {
            this.reservationmandatory = value;
        }

        /**
         * Gets the value of the reservationpossible property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRESERVATIONPOSSIBLE() {
            return reservationpossible;
        }

        /**
         * Sets the value of the reservationpossible property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRESERVATIONPOSSIBLE(Boolean value) {
            this.reservationpossible = value;
        }

        /**
         * Gets the value of the railinventoryid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRAILINVENTORYID() {
            return railinventoryid;
        }

        /**
         * Sets the value of the railinventoryid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRAILINVENTORYID(String value) {
            this.railinventoryid = value;
        }

        /**
         * Gets the value of the listseatinginfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listseatinginfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEATINGINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RAIL.LISTSEGMENT.LISTSEATINGINFO }
         * 
         * 
         */
        public List<RAIL.LISTSEGMENT.LISTSEATINGINFO> getLISTSEATINGINFO() {
            if (listseatinginfo == null) {
                listseatinginfo = new ArrayList<RAIL.LISTSEGMENT.LISTSEATINGINFO>();
            }
            return this.listseatinginfo;
        }

        /**
         * Gets the value of the closeto property.
         * 
         * @return
         *     possible object is
         *     {@link RAIL.LISTSEGMENT.CLOSETO }
         *     
         */
        public RAIL.LISTSEGMENT.CLOSETO getCLOSETO() {
            return closeto;
        }

        /**
         * Sets the value of the closeto property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAIL.LISTSEGMENT.CLOSETO }
         *     
         */
        public void setCLOSETO(RAIL.LISTSEGMENT.CLOSETO value) {
            this.closeto = value;
        }

        /**
         * Gets the value of the meal property.
         * 
         * @return
         *     possible object is
         *     {@link RAIL.LISTSEGMENT.MEAL }
         *     
         */
        public RAIL.LISTSEGMENT.MEAL getMEAL() {
            return meal;
        }

        /**
         * Sets the value of the meal property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAIL.LISTSEGMENT.MEAL }
         *     
         */
        public void setMEAL(RAIL.LISTSEGMENT.MEAL value) {
            this.meal = value;
        }

        /**
         * Gets the value of the pricesupplement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRICESUPPLEMENT() {
            return pricesupplement;
        }

        /**
         * Sets the value of the pricesupplement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRICESUPPLEMENT(String value) {
            this.pricesupplement = value;
        }

        /**
         * Gets the value of the eticketing property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isETICKETING() {
            return eticketing;
        }

        /**
         * Sets the value of the eticketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setETICKETING(Boolean value) {
            this.eticketing = value;
        }

        /**
         * Gets the value of the traincabin property.
         * 
         * @return
         *     possible object is
         *     {@link TRAINCABINType }
         *     
         */
        public TRAINCABINType getTRAINCABIN() {
            return traincabin;
        }

        /**
         * Sets the value of the traincabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRAINCABINType }
         *     
         */
        public void setTRAINCABIN(TRAINCABINType value) {
            this.traincabin = value;
        }

        /**
         * Gets the value of the seasoninformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEASONINFORMATION() {
            return seasoninformation;
        }

        /**
         * Sets the value of the seasoninformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEASONINFORMATION(String value) {
            this.seasoninformation = value;
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
         * {@link TRAINCABINType }
         * 
         * 
         */
        public List<TRAINCABINType> getLISTCABIN() {
            if (listcabin == null) {
                listcabin = new ArrayList<TRAINCABINType>();
            }
            return this.listcabin;
        }

        /**
         * Gets the value of the listtravellerseat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerseat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERSEAT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RAIL.LISTSEGMENT.LISTTRAVELLERSEAT }
         * 
         * 
         */
        public List<RAIL.LISTSEGMENT.LISTTRAVELLERSEAT> getLISTTRAVELLERSEAT() {
            if (listtravellerseat == null) {
                listtravellerseat = new ArrayList<RAIL.LISTSEGMENT.LISTTRAVELLERSEAT>();
            }
            return this.listtravellerseat;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
             * String type for value without CDATA
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
         *         &lt;element name="WAGON_NUMBER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="SEAT_NUMBER" type="{}unprotectedStringType"/&gt;
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
            "wagonnumber",
            "seatnumber"
        })
        public static class CLOSETO
            implements Serializable
        {

            @XmlElement(name = "WAGON_NUMBER", required = true)
            protected String wagonnumber;
            @XmlElement(name = "SEAT_NUMBER", required = true)
            protected String seatnumber;

            /**
             * Gets the value of the wagonnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWAGONNUMBER() {
                return wagonnumber;
            }

            /**
             * Sets the value of the wagonnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWAGONNUMBER(String value) {
                this.wagonnumber = value;
            }

            /**
             * Gets the value of the seatnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEATNUMBER() {
                return seatnumber;
            }

            /**
             * Sets the value of the seatnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEATNUMBER(String value) {
                this.seatnumber = value;
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
         *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
             * String type for value without CDATA
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;minLength value="2"/&gt;
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
        public static class EQUIPMENT
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
        public static class LISTSEATINGINFO
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
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
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
        public static class LISTSERVICE
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
         *         &lt;element name="CARRIAGE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="COMPARTMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SEAT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MEAL" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_SEATING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
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
            "carriagenumber",
            "compartmentnumber",
            "seatnumber",
            "meal",
            "listseatinginfo"
        })
        public static class LISTTRAVELLERSEAT
            implements Serializable
        {

            @XmlElement(name = "CARRIAGE_NUMBER", required = true)
            protected String carriagenumber;
            @XmlElement(name = "COMPARTMENT_NUMBER")
            protected String compartmentnumber;
            @XmlElement(name = "SEAT_NUMBER", required = true)
            protected String seatnumber;
            @XmlElement(name = "MEAL")
            protected RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.MEAL meal;
            @XmlElement(name = "LIST_SEATING_INFO")
            protected List<RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.LISTSEATINGINFO> listseatinginfo;

            /**
             * Gets the value of the carriagenumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCARRIAGENUMBER() {
                return carriagenumber;
            }

            /**
             * Sets the value of the carriagenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCARRIAGENUMBER(String value) {
                this.carriagenumber = value;
            }

            /**
             * Gets the value of the compartmentnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPARTMENTNUMBER() {
                return compartmentnumber;
            }

            /**
             * Sets the value of the compartmentnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPARTMENTNUMBER(String value) {
                this.compartmentnumber = value;
            }

            /**
             * Gets the value of the seatnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEATNUMBER() {
                return seatnumber;
            }

            /**
             * Sets the value of the seatnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEATNUMBER(String value) {
                this.seatnumber = value;
            }

            /**
             * Gets the value of the meal property.
             * 
             * @return
             *     possible object is
             *     {@link RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.MEAL }
             *     
             */
            public RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.MEAL getMEAL() {
                return meal;
            }

            /**
             * Sets the value of the meal property.
             * 
             * @param value
             *     allowed object is
             *     {@link RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.MEAL }
             *     
             */
            public void setMEAL(RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.MEAL value) {
                this.meal = value;
            }

            /**
             * Gets the value of the listseatinginfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listseatinginfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTSEATINGINFO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.LISTSEATINGINFO }
             * 
             * 
             */
            public List<RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.LISTSEATINGINFO> getLISTSEATINGINFO() {
                if (listseatinginfo == null) {
                    listseatinginfo = new ArrayList<RAIL.LISTSEGMENT.LISTTRAVELLERSEAT.LISTSEATINGINFO>();
                }
                return this.listseatinginfo;
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
            public static class LISTSEATINGINFO
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
             *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            public static class MEAL
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;enumeration value="P"/&gt;
         *               &lt;enumeration value="M"/&gt;
         *               &lt;enumeration value="D"/&gt;
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
        public static class MEAL
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
