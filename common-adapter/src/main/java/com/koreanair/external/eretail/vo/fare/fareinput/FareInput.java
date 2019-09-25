
package com.koreanair.external.eretail.vo.fare.fareinput;

import java.io.Serializable;
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
import com.koreanair.external.eretail.vo.fare.commoninput.CFFType;
import com.koreanair.external.eretail.vo.fare.commoninput.CORPORATENUMBERType;
import com.koreanair.external.eretail.vo.fare.commoninput.LISTDISCOUNT;
import com.koreanair.external.eretail.vo.fare.commoninput.PARAMETERIDType;
import com.koreanair.external.eretail.vo.fare.commoninput.SATURNEDISCOUNTCARD;
import com.koreanair.external.eretail.vo.fare.farecommoninput.LISTPRICEBYINPUTType;
import com.koreanair.external.eretail.vo.fare.farecommoninput.LISTRECOMMENDATIONIDTYPE;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTITINERARYMILESCOST;
import com.koreanair.external.eretail.vo.farecommon.farecommon.PROMOTIONBasicType;
import com.koreanair.external.eretail.vo.farecommon.farecommonpricingoptionsinput.LISTPRICINGOPTIONS;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListResidentDiscountType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTLISTTRAVELLERType;
import com.koreanair.external.eretail.vo.taxexemption.taxexemption.TAXEXEMPTIONDATA;
import com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommoninput.LISTTICKETFORREPRICEType;
import com.koreanair.external.eretail.vo.tripplan.traveller_information.TRAVELLERINFORMATION;


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
 *         &lt;element name="TRANSACTION_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}PAGE_TICKET"/&gt;
 *         &lt;element ref="{}SITE"/&gt;
 *         &lt;element ref="{}LANGUAGE"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}ROW_1" minOccurs="0"/&gt;
 *             &lt;element ref="{}ROW_2" minOccurs="0"/&gt;
 *             &lt;element ref="{}RECOMMENDATION_ID_1" minOccurs="0"/&gt;
 *             &lt;element ref="{}RECOMMENDATION_ID_2" minOccurs="0"/&gt;
 *             &lt;element ref="{}FLIGHT_ID_1" minOccurs="0"/&gt;
 *             &lt;element ref="{}FLIGHT_ID_2" minOccurs="0"/&gt;
 *             &lt;element ref="{}LIST_RECOMMENDATION_ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="TRIP_FARE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}RECOMM_REF" minOccurs="0"/&gt;
 *         &lt;element name="FEATURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_DESIGNATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}RESTRICTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}COMPANION_MODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}USE_VALUE_PRICER" minOccurs="0"/&gt;
 *         &lt;element ref="{}TYPE_OF_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}TYPE_OF_BACKUP_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_PARAMETER" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_BACKUP_PARAMETER" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="FARE_COMMAND_OPTIONS_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_COMMAND_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}BACKUP_FARE_COMMAND_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}FORCE_PTC" minOccurs="0"/&gt;
 *         &lt;element ref="{}USE_CABIN_OPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}BACKUP_CABIN_OPTION_VALUE" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN_OPTION_VALUE" minOccurs="0"/&gt;
 *         &lt;element ref="{}USE_CROSS_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}USE_BACKUP_CABIN_OPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}USE_BACKUP_CROSS_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}FAMILY_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_LOGIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}IS_STRUCTURED_XML" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER_OF_PROFILES" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRAVELLER_INFORMATION" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element ref="{}SATURNE_DISCOUNT_CARD" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_DISCOUNT" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_RESIDENT_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_DISCOUNT_CREDENTIALS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TAX_EXEMPTION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ITINERARY_MILES_COST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TICKET_FOR_REPRICE" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY_TO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}VALIDATING_CARRIER" minOccurs="0"/&gt;
 *         &lt;element ref="{}PROPOSE_BUYUP" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}APPEND_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PRICE_BY_INPUT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PRICING_OPTIONS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;element name="PROMOTION" type="{}PROMOTION_basic_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CORPORATE_NUMBER" type="{}CORPORATE_NUMBER_Type" maxOccurs="6" minOccurs="0"/&gt;
 *         &lt;element name="BACKUP_LIST_CORPORATE_NUMBER" type="{}CORPORATE_NUMBER_Type" maxOccurs="6" minOccurs="0"/&gt;
 *         &lt;element name="CLEAN_PTC_CONTEXT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_UPSELL_CFF" maxOccurs="6" minOccurs="0"/&gt;
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
    "transactionid",
    "pageticket",
    "site",
    "language",
    "listtraveller",
    "row1",
    "row2",
    "recommendationid1",
    "recommendationid2",
    "flightid1",
    "flightid2",
    "listrecommendationid",
    "tripfareid",
    "recommref",
    "feature",
    "cabin",
    "ticketdesignator",
    "restriction",
    "companionmode",
    "usevaluepricer",
    "typeoffare",
    "typeofbackupfare",
    "listfareparameter",
    "listfarebackupparameter",
    "farecommandoptionsid",
    "farecommandid",
    "backupfarecommandid",
    "forceptc",
    "usecabinoption",
    "backupcabinoptionvalue",
    "cabinoptionvalue",
    "usecrosscabin",
    "usebackupcabinoption",
    "usebackupcrosscabin",
    "familyfare",
    "directlogin",
    "isstructuredxml",
    "numberofprofiles",
    "travellerinformation",
    "saturnediscountcard",
    "listdiscount",
    "listresidentdiscount",
    "listdiscountcredentials",
    "listtaxexemption",
    "listitinerarymilescost",
    "listticketforreprice",
    "currencyto",
    "validatingcarrier",
    "proposebuyup",
    "tickettype",
    "appendfare",
    "listpricebyinput",
    "listpricingoptions",
    "listexternalid",
    "frompage",
    "requestinfo",
    "cleanoverrideonsiteswitch",
    "apischeckview",
    "apischeckcategory",
    "apischeckmandatory",
    "apischeckoptional",
    "apischeckstructure",
    "apischeckstructurepassenger",
    "promotion",
    "listcorporatenumber",
    "backuplistcorporatenumber",
    "cleanptccontext",
    "listupsellcff"
})
@XmlRootElement(name = "FareInput")
public class FareInput
    implements Serializable
{

    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<INPUTLISTTRAVELLERType> listtraveller;
    @XmlElement(name = "ROW_1")
    protected BigInteger row1;
    @XmlElement(name = "ROW_2")
    protected BigInteger row2;
    @XmlElement(name = "RECOMMENDATION_ID_1")
    protected BigInteger recommendationid1;
    @XmlElement(name = "RECOMMENDATION_ID_2")
    protected BigInteger recommendationid2;
    @XmlElement(name = "FLIGHT_ID_1")
    protected BigInteger flightid1;
    @XmlElement(name = "FLIGHT_ID_2")
    protected BigInteger flightid2;
    @XmlElement(name = "LIST_RECOMMENDATION_ID")
    protected List<LISTRECOMMENDATIONIDTYPE> listrecommendationid;
    @XmlElement(name = "TRIP_FARE_ID")
    protected Object tripfareid;
    @XmlElement(name = "RECOMM_REF")
    protected BigInteger recommref;
    @XmlElement(name = "FEATURE")
    protected Object feature;
    @XmlElement(name = "CABIN")
    protected String cabin;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
    @XmlElement(name = "RESTRICTION")
    protected Boolean restriction;
    @XmlElement(name = "COMPANION_MODE")
    protected String companionmode;
    @XmlElement(name = "USE_VALUE_PRICER")
    protected Boolean usevaluepricer;
    @XmlElement(name = "TYPE_OF_FARE")
    protected BigInteger typeoffare;
    @XmlElement(name = "TYPE_OF_BACKUP_FARE")
    protected BigInteger typeofbackupfare;
    @XmlElement(name = "LIST_FARE_PARAMETER")
    protected List<PARAMETERIDType> listfareparameter;
    @XmlElement(name = "LIST_FARE_BACKUP_PARAMETER")
    protected List<PARAMETERIDType> listfarebackupparameter;
    @XmlElement(name = "FARE_COMMAND_OPTIONS_ID")
    protected Object farecommandoptionsid;
    @XmlElement(name = "FARE_COMMAND_ID")
    protected BigInteger farecommandid;
    @XmlElement(name = "BACKUP_FARE_COMMAND_ID")
    protected BigInteger backupfarecommandid;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "USE_CABIN_OPTION")
    protected Boolean usecabinoption;
    @XmlElement(name = "BACKUP_CABIN_OPTION_VALUE")
    protected Object backupcabinoptionvalue;
    @XmlElement(name = "CABIN_OPTION_VALUE")
    protected Object cabinoptionvalue;
    @XmlElement(name = "USE_CROSS_CABIN")
    protected Boolean usecrosscabin;
    @XmlElement(name = "USE_BACKUP_CABIN_OPTION")
    protected Boolean usebackupcabinoption;
    @XmlElement(name = "USE_BACKUP_CROSS_CABIN")
    protected Boolean usebackupcrosscabin;
    @XmlElement(name = "FAMILY_FARE")
    protected Boolean familyfare;
    @XmlElement(name = "DIRECT_LOGIN")
    protected String directlogin;
    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "NUMBER_OF_PROFILES")
    protected BigInteger numberofprofiles;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "SATURNE_DISCOUNT_CARD")
    protected SATURNEDISCOUNTCARD saturnediscountcard;
    @XmlElement(name = "LIST_DISCOUNT")
    protected LISTDISCOUNT listdiscount;
    @XmlElement(name = "LIST_RESIDENT_DISCOUNT")
    protected List<ListResidentDiscountType> listresidentdiscount;
    @XmlElement(name = "LIST_DISCOUNT_CREDENTIALS")
    protected List<ListDiscountCredentialsType> listdiscountcredentials;
    @XmlElement(name = "LIST_TAX_EXEMPTION")
    protected List<TAXEXEMPTIONDATA> listtaxexemption;
    @XmlElement(name = "LIST_ITINERARY_MILES_COST")
    protected List<LISTITINERARYMILESCOST> listitinerarymilescost;
    @XmlElement(name = "LIST_TICKET_FOR_REPRICE")
    protected List<LISTTICKETFORREPRICEType> listticketforreprice;
    @XmlElement(name = "CURRENCY_TO")
    protected String currencyto;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected String validatingcarrier;
    @XmlElement(name = "PROPOSE_BUYUP")
    protected Boolean proposebuyup;
    @XmlElement(name = "TICKET_TYPE")
    protected String tickettype;
    @XmlElement(name = "APPEND_FARE")
    protected String appendfare;
    @XmlElement(name = "LIST_PRICE_BY_INPUT")
    protected List<LISTPRICEBYINPUTType> listpricebyinput;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<LISTPRICINGOPTIONS> listpricingoptions;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected FareInput.REQUESTINFO requestinfo;
    @XmlElement(name = "CLEAN_OVERRIDE_ON_SITE_SWITCH")
    protected Boolean cleanoverrideonsiteswitch;
    @XmlElement(name = "APIS_CHECK_VIEW")
    protected Object apischeckview;
    @XmlElement(name = "APIS_CHECK_CATEGORY")
    protected Object apischeckcategory;
    @XmlElement(name = "APIS_CHECK_MANDATORY")
    protected Object apischeckmandatory;
    @XmlElement(name = "APIS_CHECK_OPTIONAL")
    protected Object apischeckoptional;
    @XmlElement(name = "APIS_CHECK_STRUCTURE")
    protected Object apischeckstructure;
    @XmlElement(name = "APIS_CHECK_STRUCTURE_PASSENGER")
    protected List<FareInput.APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "PROMOTION")
    protected List<PROMOTIONBasicType> promotion;
    @XmlElement(name = "LIST_CORPORATE_NUMBER")
    protected List<CORPORATENUMBERType> listcorporatenumber;
    @XmlElement(name = "BACKUP_LIST_CORPORATE_NUMBER")
    protected List<CORPORATENUMBERType> backuplistcorporatenumber;
    @XmlElement(name = "CLEAN_PTC_CONTEXT")
    protected Boolean cleanptccontext;
    @XmlElement(name = "LIST_UPSELL_CFF")
    protected List<CFFType> listupsellcff;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONID() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONID(String value) {
        this.transactionid = value;
    }

    /**
     * Gets the value of the pageticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGETICKET() {
        return pageticket;
    }

    /**
     * Sets the value of the pageticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGETICKET(String value) {
        this.pageticket = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITE(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
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
     * {@link INPUTLISTTRAVELLERType }
     * 
     * 
     */
    public List<INPUTLISTTRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<INPUTLISTTRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the row1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROW1() {
        return row1;
    }

    /**
     * Sets the value of the row1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROW1(BigInteger value) {
        this.row1 = value;
    }

    /**
     * Gets the value of the row2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROW2() {
        return row2;
    }

    /**
     * Sets the value of the row2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROW2(BigInteger value) {
        this.row2 = value;
    }

    /**
     * Gets the value of the recommendationid1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECOMMENDATIONID1() {
        return recommendationid1;
    }

    /**
     * Sets the value of the recommendationid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECOMMENDATIONID1(BigInteger value) {
        this.recommendationid1 = value;
    }

    /**
     * Gets the value of the recommendationid2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECOMMENDATIONID2() {
        return recommendationid2;
    }

    /**
     * Sets the value of the recommendationid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECOMMENDATIONID2(BigInteger value) {
        this.recommendationid2 = value;
    }

    /**
     * Gets the value of the flightid1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLIGHTID1() {
        return flightid1;
    }

    /**
     * Sets the value of the flightid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLIGHTID1(BigInteger value) {
        this.flightid1 = value;
    }

    /**
     * Gets the value of the flightid2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLIGHTID2() {
        return flightid2;
    }

    /**
     * Sets the value of the flightid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLIGHTID2(BigInteger value) {
        this.flightid2 = value;
    }

    /**
     * Gets the value of the listrecommendationid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrecommendationid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRECOMMENDATIONID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRECOMMENDATIONIDTYPE }
     * 
     * 
     */
    public List<LISTRECOMMENDATIONIDTYPE> getLISTRECOMMENDATIONID() {
        if (listrecommendationid == null) {
            listrecommendationid = new ArrayList<LISTRECOMMENDATIONIDTYPE>();
        }
        return this.listrecommendationid;
    }

    /**
     * Gets the value of the tripfareid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTRIPFAREID() {
        return tripfareid;
    }

    /**
     * Sets the value of the tripfareid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTRIPFAREID(Object value) {
        this.tripfareid = value;
    }

    /**
     * Gets the value of the recommref property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECOMMREF() {
        return recommref;
    }

    /**
     * Sets the value of the recommref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECOMMREF(BigInteger value) {
        this.recommref = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFEATURE() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFEATURE(Object value) {
        this.feature = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABIN() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABIN(String value) {
        this.cabin = value;
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
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESTRICTION() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESTRICTION(Boolean value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the companionmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANIONMODE() {
        return companionmode;
    }

    /**
     * Sets the value of the companionmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANIONMODE(String value) {
        this.companionmode = value;
    }

    /**
     * Gets the value of the usevaluepricer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEVALUEPRICER() {
        return usevaluepricer;
    }

    /**
     * Sets the value of the usevaluepricer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEVALUEPRICER(Boolean value) {
        this.usevaluepricer = value;
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
     * Gets the value of the typeofbackupfare property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFBACKUPFARE() {
        return typeofbackupfare;
    }

    /**
     * Sets the value of the typeofbackupfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFBACKUPFARE(BigInteger value) {
        this.typeofbackupfare = value;
    }

    /**
     * Gets the value of the listfareparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREPARAMETER() {
        if (listfareparameter == null) {
            listfareparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfareparameter;
    }

    /**
     * Gets the value of the listfarebackupparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarebackupparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREBACKUPPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREBACKUPPARAMETER() {
        if (listfarebackupparameter == null) {
            listfarebackupparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfarebackupparameter;
    }

    /**
     * Gets the value of the farecommandoptionsid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFARECOMMANDOPTIONSID() {
        return farecommandoptionsid;
    }

    /**
     * Sets the value of the farecommandoptionsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFARECOMMANDOPTIONSID(Object value) {
        this.farecommandoptionsid = value;
    }

    /**
     * Gets the value of the farecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFARECOMMANDID() {
        return farecommandid;
    }

    /**
     * Sets the value of the farecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFARECOMMANDID(BigInteger value) {
        this.farecommandid = value;
    }

    /**
     * Gets the value of the backupfarecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBACKUPFARECOMMANDID() {
        return backupfarecommandid;
    }

    /**
     * Sets the value of the backupfarecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBACKUPFARECOMMANDID(BigInteger value) {
        this.backupfarecommandid = value;
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
     * Gets the value of the usecabinoption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSECABINOPTION() {
        return usecabinoption;
    }

    /**
     * Sets the value of the usecabinoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSECABINOPTION(Boolean value) {
        this.usecabinoption = value;
    }

    /**
     * Gets the value of the backupcabinoptionvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBACKUPCABINOPTIONVALUE() {
        return backupcabinoptionvalue;
    }

    /**
     * Sets the value of the backupcabinoptionvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBACKUPCABINOPTIONVALUE(Object value) {
        this.backupcabinoptionvalue = value;
    }

    /**
     * Gets the value of the cabinoptionvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCABINOPTIONVALUE() {
        return cabinoptionvalue;
    }

    /**
     * Sets the value of the cabinoptionvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCABINOPTIONVALUE(Object value) {
        this.cabinoptionvalue = value;
    }

    /**
     * Gets the value of the usecrosscabin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSECROSSCABIN() {
        return usecrosscabin;
    }

    /**
     * Sets the value of the usecrosscabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSECROSSCABIN(Boolean value) {
        this.usecrosscabin = value;
    }

    /**
     * Gets the value of the usebackupcabinoption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEBACKUPCABINOPTION() {
        return usebackupcabinoption;
    }

    /**
     * Sets the value of the usebackupcabinoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEBACKUPCABINOPTION(Boolean value) {
        this.usebackupcabinoption = value;
    }

    /**
     * Gets the value of the usebackupcrosscabin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEBACKUPCROSSCABIN() {
        return usebackupcrosscabin;
    }

    /**
     * Sets the value of the usebackupcrosscabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEBACKUPCROSSCABIN(Boolean value) {
        this.usebackupcrosscabin = value;
    }

    /**
     * Gets the value of the familyfare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFAMILYFARE() {
        return familyfare;
    }

    /**
     * Sets the value of the familyfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFAMILYFARE(Boolean value) {
        this.familyfare = value;
    }

    /**
     * Gets the value of the directlogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTLOGIN() {
        return directlogin;
    }

    /**
     * Sets the value of the directlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTLOGIN(String value) {
        this.directlogin = value;
    }

    /**
     * Gets the value of the isstructuredxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSTRUCTUREDXML() {
        return isstructuredxml;
    }

    /**
     * Sets the value of the isstructuredxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSTRUCTUREDXML(String value) {
        this.isstructuredxml = value;
    }

    /**
     * Gets the value of the numberofprofiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFPROFILES() {
        return numberofprofiles;
    }

    /**
     * Sets the value of the numberofprofiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFPROFILES(BigInteger value) {
        this.numberofprofiles = value;
    }

    /**
     * Gets the value of the travellerinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLERINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERINFORMATION }
     * 
     * 
     */
    public List<TRAVELLERINFORMATION> getTRAVELLERINFORMATION() {
        if (travellerinformation == null) {
            travellerinformation = new ArrayList<TRAVELLERINFORMATION>();
        }
        return this.travellerinformation;
    }

    /**
     * Gets the value of the saturnediscountcard property.
     * 
     * @return
     *     possible object is
     *     {@link SATURNEDISCOUNTCARD }
     *     
     */
    public SATURNEDISCOUNTCARD getSATURNEDISCOUNTCARD() {
        return saturnediscountcard;
    }

    /**
     * Sets the value of the saturnediscountcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SATURNEDISCOUNTCARD }
     *     
     */
    public void setSATURNEDISCOUNTCARD(SATURNEDISCOUNTCARD value) {
        this.saturnediscountcard = value;
    }

    /**
     * Gets the value of the listdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link LISTDISCOUNT }
     *     
     */
    public LISTDISCOUNT getLISTDISCOUNT() {
        return listdiscount;
    }

    /**
     * Sets the value of the listdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTDISCOUNT }
     *     
     */
    public void setLISTDISCOUNT(LISTDISCOUNT value) {
        this.listdiscount = value;
    }

    /**
     * Gets the value of the listresidentdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listresidentdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESIDENTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListResidentDiscountType }
     * 
     * 
     */
    public List<ListResidentDiscountType> getLISTRESIDENTDISCOUNT() {
        if (listresidentdiscount == null) {
            listresidentdiscount = new ArrayList<ListResidentDiscountType>();
        }
        return this.listresidentdiscount;
    }

    /**
     * Gets the value of the listdiscountcredentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscountcredentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTCREDENTIALS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListDiscountCredentialsType }
     * 
     * 
     */
    public List<ListDiscountCredentialsType> getLISTDISCOUNTCREDENTIALS() {
        if (listdiscountcredentials == null) {
            listdiscountcredentials = new ArrayList<ListDiscountCredentialsType>();
        }
        return this.listdiscountcredentials;
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
     * Gets the value of the listitinerarymilescost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerarymilescost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARYMILESCOST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARYMILESCOST }
     * 
     * 
     */
    public List<LISTITINERARYMILESCOST> getLISTITINERARYMILESCOST() {
        if (listitinerarymilescost == null) {
            listitinerarymilescost = new ArrayList<LISTITINERARYMILESCOST>();
        }
        return this.listitinerarymilescost;
    }

    /**
     * Gets the value of the listticketforreprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticketforreprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETFORREPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTICKETFORREPRICEType }
     * 
     * 
     */
    public List<LISTTICKETFORREPRICEType> getLISTTICKETFORREPRICE() {
        if (listticketforreprice == null) {
            listticketforreprice = new ArrayList<LISTTICKETFORREPRICEType>();
        }
        return this.listticketforreprice;
    }

    /**
     * Gets the value of the currencyto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYTO() {
        return currencyto;
    }

    /**
     * Sets the value of the currencyto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYTO(String value) {
        this.currencyto = value;
    }

    /**
     * Gets the value of the validatingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATINGCARRIER() {
        return validatingcarrier;
    }

    /**
     * Sets the value of the validatingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATINGCARRIER(String value) {
        this.validatingcarrier = value;
    }

    /**
     * Gets the value of the proposebuyup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPROPOSEBUYUP() {
        return proposebuyup;
    }

    /**
     * Sets the value of the proposebuyup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPROPOSEBUYUP(Boolean value) {
        this.proposebuyup = value;
    }

    /**
     * Gets the value of the tickettype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETTYPE() {
        return tickettype;
    }

    /**
     * Sets the value of the tickettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETTYPE(String value) {
        this.tickettype = value;
    }

    /**
     * Gets the value of the appendfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPENDFARE() {
        return appendfare;
    }

    /**
     * Sets the value of the appendfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPENDFARE(String value) {
        this.appendfare = value;
    }

    /**
     * Gets the value of the listpricebyinput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricebyinput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICEBYINPUT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICEBYINPUTType }
     * 
     * 
     */
    public List<LISTPRICEBYINPUTType> getLISTPRICEBYINPUT() {
        if (listpricebyinput == null) {
            listpricebyinput = new ArrayList<LISTPRICEBYINPUTType>();
        }
        return this.listpricebyinput;
    }

    /**
     * Gets the value of the listpricingoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricingoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICINGOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONS }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONS> getLISTPRICINGOPTIONS() {
        if (listpricingoptions == null) {
            listpricingoptions = new ArrayList<LISTPRICINGOPTIONS>();
        }
        return this.listpricingoptions;
    }

    /**
     * Gets the value of the listexternalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<String>();
        }
        return this.listexternalid;
    }

    /**
     * Gets the value of the frompage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROMPAGE() {
        return frompage;
    }

    /**
     * Sets the value of the frompage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROMPAGE(Object value) {
        this.frompage = value;
    }

    /**
     * Gets the value of the requestinfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareInput.REQUESTINFO }
     *     
     */
    public FareInput.REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInput.REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(FareInput.REQUESTINFO value) {
        this.requestinfo = value;
    }

    /**
     * Gets the value of the cleanoverrideonsiteswitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEANOVERRIDEONSITESWITCH() {
        return cleanoverrideonsiteswitch;
    }

    /**
     * Sets the value of the cleanoverrideonsiteswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEANOVERRIDEONSITESWITCH(Boolean value) {
        this.cleanoverrideonsiteswitch = value;
    }

    /**
     * Gets the value of the apischeckview property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKVIEW() {
        return apischeckview;
    }

    /**
     * Sets the value of the apischeckview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKVIEW(Object value) {
        this.apischeckview = value;
    }

    /**
     * Gets the value of the apischeckcategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKCATEGORY() {
        return apischeckcategory;
    }

    /**
     * Sets the value of the apischeckcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKCATEGORY(Object value) {
        this.apischeckcategory = value;
    }

    /**
     * Gets the value of the apischeckmandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKMANDATORY() {
        return apischeckmandatory;
    }

    /**
     * Sets the value of the apischeckmandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKMANDATORY(Object value) {
        this.apischeckmandatory = value;
    }

    /**
     * Gets the value of the apischeckoptional property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKOPTIONAL() {
        return apischeckoptional;
    }

    /**
     * Sets the value of the apischeckoptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKOPTIONAL(Object value) {
        this.apischeckoptional = value;
    }

    /**
     * Gets the value of the apischeckstructure property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKSTRUCTURE() {
        return apischeckstructure;
    }

    /**
     * Sets the value of the apischeckstructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKSTRUCTURE(Object value) {
        this.apischeckstructure = value;
    }

    /**
     * Gets the value of the apischeckstructurepassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apischeckstructurepassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPISCHECKSTRUCTUREPASSENGER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInput.APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<FareInput.APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<FareInput.APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROMOTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROMOTIONBasicType }
     * 
     * 
     */
    public List<PROMOTIONBasicType> getPROMOTION() {
        if (promotion == null) {
            promotion = new ArrayList<PROMOTIONBasicType>();
        }
        return this.promotion;
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
     * {@link CORPORATENUMBERType }
     * 
     * 
     */
    public List<CORPORATENUMBERType> getLISTCORPORATENUMBER() {
        if (listcorporatenumber == null) {
            listcorporatenumber = new ArrayList<CORPORATENUMBERType>();
        }
        return this.listcorporatenumber;
    }

    /**
     * Gets the value of the backuplistcorporatenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backuplistcorporatenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBACKUPLISTCORPORATENUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CORPORATENUMBERType }
     * 
     * 
     */
    public List<CORPORATENUMBERType> getBACKUPLISTCORPORATENUMBER() {
        if (backuplistcorporatenumber == null) {
            backuplistcorporatenumber = new ArrayList<CORPORATENUMBERType>();
        }
        return this.backuplistcorporatenumber;
    }

    /**
     * Gets the value of the cleanptccontext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEANPTCCONTEXT() {
        return cleanptccontext;
    }

    /**
     * Sets the value of the cleanptccontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEANPTCCONTEXT(Boolean value) {
        this.cleanptccontext = value;
    }

    /**
     * Gets the value of the listupsellcff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listupsellcff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUPSELLCFF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFFType }
     * 
     * 
     */
    public List<CFFType> getLISTUPSELLCFF() {
        if (listupsellcff == null) {
            listupsellcff = new ArrayList<CFFType>();
        }
        return this.listupsellcff;
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
     *         &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_STRUCTURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "travelerid",
        "liststructure"
    })
    public static class APISCHECKSTRUCTUREPASSENGER
        implements Serializable
    {

        @XmlElement(name = "TRAVELER_ID")
        protected Object travelerid;
        @XmlElement(name = "LIST_STRUCTURE")
        protected Object liststructure;

        /**
         * Gets the value of the travelerid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRAVELERID() {
            return travelerid;
        }

        /**
         * Sets the value of the travelerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRAVELERID(Object value) {
            this.travelerid = value;
        }

        /**
         * Gets the value of the liststructure property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLISTSTRUCTURE() {
            return liststructure;
        }

        /**
         * Sets the value of the liststructure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLISTSTRUCTURE(Object value) {
            this.liststructure = value;
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
     *         &lt;element name="REQUEST_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IP_ADDRESSES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IS_SSL_REQUEST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CLIENT_REFERRER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "requesturl",
        "ipaddresses",
        "issslrequest",
        "clientreferrer"
    })
    public static class REQUESTINFO
        implements Serializable
    {

        @XmlElement(name = "REQUEST_URL")
        protected String requesturl;
        @XmlElement(name = "IP_ADDRESSES")
        protected List<String> ipaddresses;
        @XmlElement(name = "IS_SSL_REQUEST")
        protected Boolean issslrequest;
        @XmlElement(name = "CLIENT_REFERRER")
        protected String clientreferrer;

        /**
         * Gets the value of the requesturl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTURL() {
            return requesturl;
        }

        /**
         * Sets the value of the requesturl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTURL(String value) {
            this.requesturl = value;
        }

        /**
         * Gets the value of the ipaddresses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ipaddresses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIPADDRESSES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIPADDRESSES() {
            if (ipaddresses == null) {
                ipaddresses = new ArrayList<String>();
            }
            return this.ipaddresses;
        }

        /**
         * Gets the value of the issslrequest property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISSSLREQUEST() {
            return issslrequest;
        }

        /**
         * Sets the value of the issslrequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISSSLREQUEST(Boolean value) {
            this.issslrequest = value;
        }

        /**
         * Gets the value of the clientreferrer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLIENTREFERRER() {
            return clientreferrer;
        }

        /**
         * Sets the value of the clientreferrer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLIENTREFERRER(String value) {
            this.clientreferrer = value;
        }

    }

}
