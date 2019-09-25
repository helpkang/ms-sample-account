
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.flexpricer.commonavailabilityoutput.LocationType;


/**
 * <p>Java class for ListPanelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListPanelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_TAB" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RECOMMENDATION" type="{}ListRecommendationGroupType" maxOccurs="200" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROPOSED_BOUND" type="{}LIST_PROPOSED_BOUND_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_EMPTY_TAB" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_OC_RECOMMENDATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEARCH_DATA"/&gt;
 *         &lt;element name="TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="FP"/&gt;
 *               &lt;enumeration value="EC"/&gt;
 *               &lt;enumeration value="I"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IS_LOADED_FROM_CACHE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LAST_UPDATED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_FLIGHTS_PER_BOUND" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_FLIGHT" type="{}LIST_FLIGHTType" maxOccurs="unbounded"/&gt;
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
 *         &lt;element name="THEME_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_THEME" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="THEME_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="THEME_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="LOCATION_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_LOCATION" type="{}LocationType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="LIST_ELEMENT_PRICE" type="{}TripPriceType" maxOccurs="unbounded"/&gt;
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
 *         &lt;element name="AIRLINE_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_AIRLINE" maxOccurs="unbounded"&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EQUIPMENT_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_EQUIPMENT" maxOccurs="unbounded"&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVELLER_TYPE_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_TRAVELLER_TYPE" maxOccurs="unbounded"&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TICKETING_INFORMATION_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PRICING_MESSAGE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TICKETING_INFORMATION_ID" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="MESSAGE_SUBJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MESSAGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="LIST_MONETARY_DETAIL" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                         &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                         &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
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
 *         &lt;element name="MINI_RULES_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_MNR_DETAILS" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MNR_REF" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CAT_GRP" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="LIST_CAT_GROUP" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CATINFO" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="MONETARY_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="MONETARY_DETAILS" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                                     &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="OTHER_MONETARY_DETAILS" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                                     &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *                                                 &lt;element name="STATUS_INFO" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="LIST_STATUS_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                                     &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *         &lt;element name="MINIRULES_TYPE_QUALIFIER_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_MONETARY_DETAILS" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
@XmlType(name = "ListPanelType", propOrder = {
    "listtab",
    "listrecommendation",
    "listproposedbound",
    "listemptytab",
    "listocrecommendation",
    "searchdata",
    "type",
    "boundid",
    "isloadedfromcache",
    "lastupdated",
    "flightdictionary",
    "themedictionary",
    "locationdictionary",
    "pricedictionary",
    "airlinedictionary",
    "equipmentdictionary",
    "travellertypedictionary",
    "ticketinginformationdictionary",
    "minirulesdictionary",
    "minirulestypequalifierdictionary"
})
public class ListPanelType
    implements Serializable
{

    @XmlElement(name = "LIST_TAB")
    protected List<ListTabType> listtab;
    @XmlElement(name = "LIST_RECOMMENDATION")
    protected List<ListRecommendationGroupType> listrecommendation;
    @XmlElement(name = "LIST_PROPOSED_BOUND")
    protected List<LISTPROPOSEDBOUNDType> listproposedbound;
    @XmlElement(name = "LIST_EMPTY_TAB")
    protected List<ListEmptyTabType> listemptytab;
    @XmlElement(name = "LIST_OC_RECOMMENDATION")
    protected List<LISTOCRECOMMENDATIONType> listocrecommendation;
    @XmlElement(name = "SEARCH_DATA", required = true)
    protected SearchDataType searchdata;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "BOUND_ID")
    protected BigInteger boundid;
    @XmlElement(name = "IS_LOADED_FROM_CACHE")
    protected Boolean isloadedfromcache;
    @XmlElement(name = "LAST_UPDATED")
    protected Boolean lastupdated;
    @XmlElement(name = "FLIGHT_DICTIONARY")
    protected ListPanelType.FLIGHTDICTIONARY flightdictionary;
    @XmlElement(name = "THEME_DICTIONARY")
    protected ListPanelType.THEMEDICTIONARY themedictionary;
    @XmlElement(name = "LOCATION_DICTIONARY")
    protected ListPanelType.LOCATIONDICTIONARY locationdictionary;
    @XmlElement(name = "PRICE_DICTIONARY")
    protected ListPanelType.PRICEDICTIONARY pricedictionary;
    @XmlElement(name = "AIRLINE_DICTIONARY")
    protected ListPanelType.AIRLINEDICTIONARY airlinedictionary;
    @XmlElement(name = "EQUIPMENT_DICTIONARY")
    protected ListPanelType.EQUIPMENTDICTIONARY equipmentdictionary;
    @XmlElement(name = "TRAVELLER_TYPE_DICTIONARY")
    protected ListPanelType.TRAVELLERTYPEDICTIONARY travellertypedictionary;
    @XmlElement(name = "TICKETING_INFORMATION_DICTIONARY")
    protected ListPanelType.TICKETINGINFORMATIONDICTIONARY ticketinginformationdictionary;
    @XmlElement(name = "MINI_RULES_DICTIONARY")
    protected ListPanelType.MINIRULESDICTIONARY minirulesdictionary;
    @XmlElement(name = "MINIRULES_TYPE_QUALIFIER_DICTIONARY")
    protected ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY minirulestypequalifierdictionary;

    /**
     * There is no LIST_TAB in case of Dual Mode request when Upsell Panel returns no recommendations for pre-selected day.
     * 				No LIST_TAB in this location if OUTPUT_STRUCTURE=RECOMMENDATION in the input. 	
     * 				Gets the value of the listtab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTabType }
     * 
     * 
     */
    public List<ListTabType> getLISTTAB() {
        if (listtab == null) {
            listtab = new ArrayList<ListTabType>();
        }
        return this.listtab;
    }

    /**
     * Gets the value of the listrecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRECOMMENDATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListRecommendationGroupType }
     * 
     * 
     */
    public List<ListRecommendationGroupType> getLISTRECOMMENDATION() {
        if (listrecommendation == null) {
            listrecommendation = new ArrayList<ListRecommendationGroupType>();
        }
        return this.listrecommendation;
    }

    /**
     * Gets the value of the listproposedbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproposedbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROPOSEDBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPROPOSEDBOUNDType }
     * 
     * 
     */
    public List<LISTPROPOSEDBOUNDType> getLISTPROPOSEDBOUND() {
        if (listproposedbound == null) {
            listproposedbound = new ArrayList<LISTPROPOSEDBOUNDType>();
        }
        return this.listproposedbound;
    }

    /**
     * LIST_EMPTY_TAB contains the list of unavailability reasons if
     * 					ECC was sent 	
     * 				Gets the value of the listemptytab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listemptytab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEMPTYTAB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListEmptyTabType }
     * 
     * 
     */
    public List<ListEmptyTabType> getLISTEMPTYTAB() {
        if (listemptytab == null) {
            listemptytab = new ArrayList<ListEmptyTabType>();
        }
        return this.listemptytab;
    }

    /**
     * Gets the value of the listocrecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listocrecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOCRECOMMENDATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTOCRECOMMENDATIONType }
     * 
     * 
     */
    public List<LISTOCRECOMMENDATIONType> getLISTOCRECOMMENDATION() {
        if (listocrecommendation == null) {
            listocrecommendation = new ArrayList<LISTOCRECOMMENDATIONType>();
        }
        return this.listocrecommendation;
    }

    /**
     * Gets the value of the searchdata property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDataType }
     *     
     */
    public SearchDataType getSEARCHDATA() {
        return searchdata;
    }

    /**
     * Sets the value of the searchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDataType }
     *     
     */
    public void setSEARCHDATA(SearchDataType value) {
        this.searchdata = value;
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
     * Gets the value of the boundid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOUNDID() {
        return boundid;
    }

    /**
     * Sets the value of the boundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOUNDID(BigInteger value) {
        this.boundid = value;
    }

    /**
     * Gets the value of the isloadedfromcache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISLOADEDFROMCACHE() {
        return isloadedfromcache;
    }

    /**
     * Sets the value of the isloadedfromcache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISLOADEDFROMCACHE(Boolean value) {
        this.isloadedfromcache = value;
    }

    /**
     * Gets the value of the lastupdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLASTUPDATED() {
        return lastupdated;
    }

    /**
     * Sets the value of the lastupdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLASTUPDATED(Boolean value) {
        this.lastupdated = value;
    }

    /**
     * Gets the value of the flightdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.FLIGHTDICTIONARY }
     *     
     */
    public ListPanelType.FLIGHTDICTIONARY getFLIGHTDICTIONARY() {
        return flightdictionary;
    }

    /**
     * Sets the value of the flightdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.FLIGHTDICTIONARY }
     *     
     */
    public void setFLIGHTDICTIONARY(ListPanelType.FLIGHTDICTIONARY value) {
        this.flightdictionary = value;
    }

    /**
     * Gets the value of the themedictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.THEMEDICTIONARY }
     *     
     */
    public ListPanelType.THEMEDICTIONARY getTHEMEDICTIONARY() {
        return themedictionary;
    }

    /**
     * Sets the value of the themedictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.THEMEDICTIONARY }
     *     
     */
    public void setTHEMEDICTIONARY(ListPanelType.THEMEDICTIONARY value) {
        this.themedictionary = value;
    }

    /**
     * Gets the value of the locationdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.LOCATIONDICTIONARY }
     *     
     */
    public ListPanelType.LOCATIONDICTIONARY getLOCATIONDICTIONARY() {
        return locationdictionary;
    }

    /**
     * Sets the value of the locationdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.LOCATIONDICTIONARY }
     *     
     */
    public void setLOCATIONDICTIONARY(ListPanelType.LOCATIONDICTIONARY value) {
        this.locationdictionary = value;
    }

    /**
     * Gets the value of the pricedictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.PRICEDICTIONARY }
     *     
     */
    public ListPanelType.PRICEDICTIONARY getPRICEDICTIONARY() {
        return pricedictionary;
    }

    /**
     * Sets the value of the pricedictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.PRICEDICTIONARY }
     *     
     */
    public void setPRICEDICTIONARY(ListPanelType.PRICEDICTIONARY value) {
        this.pricedictionary = value;
    }

    /**
     * Gets the value of the airlinedictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.AIRLINEDICTIONARY }
     *     
     */
    public ListPanelType.AIRLINEDICTIONARY getAIRLINEDICTIONARY() {
        return airlinedictionary;
    }

    /**
     * Sets the value of the airlinedictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.AIRLINEDICTIONARY }
     *     
     */
    public void setAIRLINEDICTIONARY(ListPanelType.AIRLINEDICTIONARY value) {
        this.airlinedictionary = value;
    }

    /**
     * Gets the value of the equipmentdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.EQUIPMENTDICTIONARY }
     *     
     */
    public ListPanelType.EQUIPMENTDICTIONARY getEQUIPMENTDICTIONARY() {
        return equipmentdictionary;
    }

    /**
     * Sets the value of the equipmentdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.EQUIPMENTDICTIONARY }
     *     
     */
    public void setEQUIPMENTDICTIONARY(ListPanelType.EQUIPMENTDICTIONARY value) {
        this.equipmentdictionary = value;
    }

    /**
     * Gets the value of the travellertypedictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.TRAVELLERTYPEDICTIONARY }
     *     
     */
    public ListPanelType.TRAVELLERTYPEDICTIONARY getTRAVELLERTYPEDICTIONARY() {
        return travellertypedictionary;
    }

    /**
     * Sets the value of the travellertypedictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.TRAVELLERTYPEDICTIONARY }
     *     
     */
    public void setTRAVELLERTYPEDICTIONARY(ListPanelType.TRAVELLERTYPEDICTIONARY value) {
        this.travellertypedictionary = value;
    }

    /**
     * Gets the value of the ticketinginformationdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.TICKETINGINFORMATIONDICTIONARY }
     *     
     */
    public ListPanelType.TICKETINGINFORMATIONDICTIONARY getTICKETINGINFORMATIONDICTIONARY() {
        return ticketinginformationdictionary;
    }

    /**
     * Sets the value of the ticketinginformationdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.TICKETINGINFORMATIONDICTIONARY }
     *     
     */
    public void setTICKETINGINFORMATIONDICTIONARY(ListPanelType.TICKETINGINFORMATIONDICTIONARY value) {
        this.ticketinginformationdictionary = value;
    }

    /**
     * Gets the value of the minirulesdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.MINIRULESDICTIONARY }
     *     
     */
    public ListPanelType.MINIRULESDICTIONARY getMINIRULESDICTIONARY() {
        return minirulesdictionary;
    }

    /**
     * Sets the value of the minirulesdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.MINIRULESDICTIONARY }
     *     
     */
    public void setMINIRULESDICTIONARY(ListPanelType.MINIRULESDICTIONARY value) {
        this.minirulesdictionary = value;
    }

    /**
     * Gets the value of the minirulestypequalifierdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY }
     *     
     */
    public ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY getMINIRULESTYPEQUALIFIERDICTIONARY() {
        return minirulestypequalifierdictionary;
    }

    /**
     * Sets the value of the minirulestypequalifierdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY }
     *     
     */
    public void setMINIRULESTYPEQUALIFIERDICTIONARY(ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY value) {
        this.minirulestypequalifierdictionary = value;
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
     *         &lt;element name="LIST_AIRLINE" maxOccurs="unbounded"&gt;
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
        "listairline"
    })
    public static class AIRLINEDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_AIRLINE", required = true)
        protected List<ListPanelType.AIRLINEDICTIONARY.LISTAIRLINE> listairline;

        /**
         * Gets the value of the listairline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listairline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTAIRLINE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListPanelType.AIRLINEDICTIONARY.LISTAIRLINE }
         * 
         * 
         */
        public List<ListPanelType.AIRLINEDICTIONARY.LISTAIRLINE> getLISTAIRLINE() {
            if (listairline == null) {
                listairline = new ArrayList<ListPanelType.AIRLINEDICTIONARY.LISTAIRLINE>();
            }
            return this.listairline;
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
        public static class LISTAIRLINE
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
     *         &lt;element name="LIST_EQUIPMENT" maxOccurs="unbounded"&gt;
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
        "listequipment"
    })
    public static class EQUIPMENTDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_EQUIPMENT", required = true)
        protected List<ListPanelType.EQUIPMENTDICTIONARY.LISTEQUIPMENT> listequipment;

        /**
         * Gets the value of the listequipment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listequipment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTEQUIPMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListPanelType.EQUIPMENTDICTIONARY.LISTEQUIPMENT }
         * 
         * 
         */
        public List<ListPanelType.EQUIPMENTDICTIONARY.LISTEQUIPMENT> getLISTEQUIPMENT() {
            if (listequipment == null) {
                listequipment = new ArrayList<ListPanelType.EQUIPMENTDICTIONARY.LISTEQUIPMENT>();
            }
            return this.listequipment;
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
        public static class LISTEQUIPMENT
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
     *         &lt;element name="LIST_FLIGHTS_PER_BOUND" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_FLIGHT" type="{}LIST_FLIGHTType" maxOccurs="unbounded"/&gt;
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
        "listflightsperbound"
    })
    public static class FLIGHTDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_FLIGHTS_PER_BOUND", required = true)
        protected List<ListPanelType.FLIGHTDICTIONARY.LISTFLIGHTSPERBOUND> listflightsperbound;

        /**
         * Gets the value of the listflightsperbound property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listflightsperbound property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFLIGHTSPERBOUND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListPanelType.FLIGHTDICTIONARY.LISTFLIGHTSPERBOUND }
         * 
         * 
         */
        public List<ListPanelType.FLIGHTDICTIONARY.LISTFLIGHTSPERBOUND> getLISTFLIGHTSPERBOUND() {
            if (listflightsperbound == null) {
                listflightsperbound = new ArrayList<ListPanelType.FLIGHTDICTIONARY.LISTFLIGHTSPERBOUND>();
            }
            return this.listflightsperbound;
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
         *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="LIST_FLIGHT" type="{}LIST_FLIGHTType" maxOccurs="unbounded"/&gt;
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
            "boundid",
            "listflight"
        })
        public static class LISTFLIGHTSPERBOUND
            implements Serializable
        {

            @XmlElement(name = "BOUND_ID")
            protected BigInteger boundid;
            @XmlElement(name = "LIST_FLIGHT", required = true)
            protected List<LISTFLIGHTType> listflight;

            /**
             * Gets the value of the boundid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBOUNDID() {
                return boundid;
            }

            /**
             * Sets the value of the boundid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBOUNDID(BigInteger value) {
                this.boundid = value;
            }

            /**
             * Gets the value of the listflight property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listflight property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTFLIGHT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTFLIGHTType }
             * 
             * 
             */
            public List<LISTFLIGHTType> getLISTFLIGHT() {
                if (listflight == null) {
                    listflight = new ArrayList<LISTFLIGHTType>();
                }
                return this.listflight;
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
     *         &lt;element name="LIST_LOCATION" type="{}LocationType" maxOccurs="unbounded"/&gt;
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
        "listlocation"
    })
    public static class LOCATIONDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_LOCATION", required = true)
        protected List<LocationType> listlocation;

        /**
         * Gets the value of the listlocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listlocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTLOCATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationType }
         * 
         * 
         */
        public List<LocationType> getLISTLOCATION() {
            if (listlocation == null) {
                listlocation = new ArrayList<LocationType>();
            }
            return this.listlocation;
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
     *         &lt;element name="LIST_MNR_DETAILS" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MNR_REF" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CAT_GRP" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LIST_CAT_GROUP" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CATINFO" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="MONETARY_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="MONETARY_DETAILS" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                                           &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="OTHER_MONETARY_DETAILS" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                                           &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
     *                                       &lt;element name="STATUS_INFO" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="LIST_STATUS_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                                           &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "listmnrdetails"
    })
    public static class MINIRULESDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_MNR_DETAILS", required = true)
        protected List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS> listmnrdetails;

        /**
         * Gets the value of the listmnrdetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listmnrdetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTMNRDETAILS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS }
         * 
         * 
         */
        public List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS> getLISTMNRDETAILS() {
            if (listmnrdetails == null) {
                listmnrdetails = new ArrayList<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS>();
            }
            return this.listmnrdetails;
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
         *         &lt;element name="MNR_REF" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CAT_GRP" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LIST_CAT_GROUP" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CATINFO" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="MONETARY_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="MONETARY_DETAILS" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                                                 &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="OTHER_MONETARY_DETAILS" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                                                 &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
         *                             &lt;element name="STATUS_INFO" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="LIST_STATUS_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                                                 &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "mnrref",
            "catgrp"
        })
        public static class LISTMNRDETAILS
            implements Serializable
        {

            @XmlElement(name = "MNR_REF")
            protected ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF mnrref;
            @XmlElement(name = "CAT_GRP")
            protected ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP catgrp;

            /**
             * Gets the value of the mnrref property.
             * 
             * @return
             *     possible object is
             *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF }
             *     
             */
            public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF getMNRREF() {
                return mnrref;
            }

            /**
             * Sets the value of the mnrref property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF }
             *     
             */
            public void setMNRREF(ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF value) {
                this.mnrref = value;
            }

            /**
             * Gets the value of the catgrp property.
             * 
             * @return
             *     possible object is
             *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP }
             *     
             */
            public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP getCATGRP() {
                return catgrp;
            }

            /**
             * Sets the value of the catgrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP }
             *     
             */
            public void setCATGRP(ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP value) {
                this.catgrp = value;
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
             *         &lt;element name="LIST_CAT_GROUP" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CATINFO" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="MONETARY_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="MONETARY_DETAILS" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                                       &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="OTHER_MONETARY_DETAILS" maxOccurs="unbounded" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                                       &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
             *                   &lt;element name="STATUS_INFO" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="LIST_STATUS_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                                       &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                "listcatgroup"
            })
            public static class CATGRP
                implements Serializable
            {

                @XmlElement(name = "LIST_CAT_GROUP")
                protected List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP> listcatgroup;

                /**
                 * Gets the value of the listcatgroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listcatgroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTCATGROUP().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP }
                 * 
                 * 
                 */
                public List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP> getLISTCATGROUP() {
                    if (listcatgroup == null) {
                        listcatgroup = new ArrayList<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP>();
                    }
                    return this.listcatgroup;
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
                 *         &lt;element name="CATINFO" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="MONETARY_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="MONETARY_DETAILS" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *                             &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="OTHER_MONETARY_DETAILS" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *                             &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                 *         &lt;element name="STATUS_INFO" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="LIST_STATUS_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *                             &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                    "catinfo",
                    "monetaryinfo",
                    "statusinfo"
                })
                public static class LISTCATGROUP
                    implements Serializable
                {

                    @XmlElement(name = "CATINFO")
                    protected ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO catinfo;
                    @XmlElement(name = "MONETARY_INFO")
                    protected List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO> monetaryinfo;
                    @XmlElement(name = "STATUS_INFO")
                    protected ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO statusinfo;

                    /**
                     * Gets the value of the catinfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO }
                     *     
                     */
                    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO getCATINFO() {
                        return catinfo;
                    }

                    /**
                     * Sets the value of the catinfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO }
                     *     
                     */
                    public void setCATINFO(ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO value) {
                        this.catinfo = value;
                    }

                    /**
                     * Gets the value of the monetaryinfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the monetaryinfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMONETARYINFO().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO }
                     * 
                     * 
                     */
                    public List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO> getMONETARYINFO() {
                        if (monetaryinfo == null) {
                            monetaryinfo = new ArrayList<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO>();
                        }
                        return this.monetaryinfo;
                    }

                    /**
                     * Gets the value of the statusinfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO }
                     *     
                     */
                    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO getSTATUSINFO() {
                        return statusinfo;
                    }

                    /**
                     * Sets the value of the statusinfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO }
                     *     
                     */
                    public void setSTATUSINFO(ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO value) {
                        this.statusinfo = value;
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
                     *         &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                        "number"
                    })
                    public static class CATINFO
                        implements Serializable
                    {

                        @XmlElement(name = "NUMBER")
                        protected String number;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNUMBER() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNUMBER(String value) {
                            this.number = value;
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
                     *         &lt;element name="MONETARY_DETAILS" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                     *                   &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="OTHER_MONETARY_DETAILS" maxOccurs="unbounded" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                     *                   &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                        "monetarydetails",
                        "othermonetarydetails"
                    })
                    public static class MONETARYINFO
                        implements Serializable
                    {

                        @XmlElement(name = "MONETARY_DETAILS")
                        protected ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS monetarydetails;
                        @XmlElement(name = "OTHER_MONETARY_DETAILS")
                        protected List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.OTHERMONETARYDETAILS> othermonetarydetails;

                        /**
                         * Gets the value of the monetarydetails property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS }
                         *     
                         */
                        public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS getMONETARYDETAILS() {
                            return monetarydetails;
                        }

                        /**
                         * Sets the value of the monetarydetails property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS }
                         *     
                         */
                        public void setMONETARYDETAILS(ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS value) {
                            this.monetarydetails = value;
                        }

                        /**
                         * Gets the value of the othermonetarydetails property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the othermonetarydetails property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getOTHERMONETARYDETAILS().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.OTHERMONETARYDETAILS }
                         * 
                         * 
                         */
                        public List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.OTHERMONETARYDETAILS> getOTHERMONETARYDETAILS() {
                            if (othermonetarydetails == null) {
                                othermonetarydetails = new ArrayList<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.OTHERMONETARYDETAILS>();
                            }
                            return this.othermonetarydetails;
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
                         *         &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                         *         &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                            "typequalifier",
                            "amount"
                        })
                        public static class MONETARYDETAILS
                            implements Serializable
                        {

                            @XmlElement(name = "TYPE_QUALIFIER")
                            protected String typequalifier;
                            @XmlElement(name = "AMOUNT")
                            protected String amount;

                            /**
                             * Gets the value of the typequalifier property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTYPEQUALIFIER() {
                                return typequalifier;
                            }

                            /**
                             * Sets the value of the typequalifier property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTYPEQUALIFIER(String value) {
                                this.typequalifier = value;
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
                         *         &lt;element name="TYPE_QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                         *         &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                            "typequalifier",
                            "amount"
                        })
                        public static class OTHERMONETARYDETAILS
                            implements Serializable
                        {

                            @XmlElement(name = "TYPE_QUALIFIER")
                            protected String typequalifier;
                            @XmlElement(name = "AMOUNT")
                            protected String amount;

                            /**
                             * Gets the value of the typequalifier property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTYPEQUALIFIER() {
                                return typequalifier;
                            }

                            /**
                             * Sets the value of the typequalifier property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTYPEQUALIFIER(String value) {
                                this.typequalifier = value;
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
                     *         &lt;element name="LIST_STATUS_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
                     *                   &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                        "liststatusinformation"
                    })
                    public static class STATUSINFO
                        implements Serializable
                    {

                        @XmlElement(name = "LIST_STATUS_INFORMATION")
                        protected List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO.LISTSTATUSINFORMATION> liststatusinformation;

                        /**
                         * Gets the value of the liststatusinformation property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the liststatusinformation property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getLISTSTATUSINFORMATION().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO.LISTSTATUSINFORMATION }
                         * 
                         * 
                         */
                        public List<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO.LISTSTATUSINFORMATION> getLISTSTATUSINFORMATION() {
                            if (liststatusinformation == null) {
                                liststatusinformation = new ArrayList<ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO.LISTSTATUSINFORMATION>();
                            }
                            return this.liststatusinformation;
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
                         *         &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
                         *         &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                            "indicator",
                            "action"
                        })
                        public static class LISTSTATUSINFORMATION
                            implements Serializable
                        {

                            @XmlElement(name = "INDICATOR")
                            protected String indicator;
                            @XmlElement(name = "ACTION")
                            protected String action;

                            /**
                             * Gets the value of the indicator property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getINDICATOR() {
                                return indicator;
                            }

                            /**
                             * Sets the value of the indicator property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setINDICATOR(String value) {
                                this.indicator = value;
                            }

                            /**
                             * Gets the value of the action property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getACTION() {
                                return action;
                            }

                            /**
                             * Sets the value of the action property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setACTION(String value) {
                                this.action = value;
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
             *         &lt;element name="NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                "number"
            })
            public static class MNRREF
                implements Serializable
            {

                @XmlElement(name = "NUMBER")
                protected String number;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNUMBER() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNUMBER(String value) {
                    this.number = value;
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
     *         &lt;element name="LIST_MONETARY_DETAILS" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "listmonetarydetails"
    })
    public static class MINIRULESTYPEQUALIFIERDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_MONETARY_DETAILS", required = true)
        protected List<ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY.LISTMONETARYDETAILS> listmonetarydetails;

        /**
         * Gets the value of the listmonetarydetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listmonetarydetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTMONETARYDETAILS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY.LISTMONETARYDETAILS }
         * 
         * 
         */
        public List<ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY.LISTMONETARYDETAILS> getLISTMONETARYDETAILS() {
            if (listmonetarydetails == null) {
                listmonetarydetails = new ArrayList<ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY.LISTMONETARYDETAILS>();
            }
            return this.listmonetarydetails;
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
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "description"
        })
        public static class LISTMONETARYDETAILS
            implements Serializable
        {

            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "DESCRIPTION")
            protected String description;

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
     *         &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="LIST_ELEMENT_PRICE" type="{}TripPriceType" maxOccurs="unbounded"/&gt;
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
        "listprice"
    })
    public static class PRICEDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_PRICE", required = true)
        protected List<ListPanelType.PRICEDICTIONARY.LISTPRICE> listprice;

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
         * {@link ListPanelType.PRICEDICTIONARY.LISTPRICE }
         * 
         * 
         */
        public List<ListPanelType.PRICEDICTIONARY.LISTPRICE> getLISTPRICE() {
            if (listprice == null) {
                listprice = new ArrayList<ListPanelType.PRICEDICTIONARY.LISTPRICE>();
            }
            return this.listprice;
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
         *         &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="LIST_ELEMENT_PRICE" type="{}TripPriceType" maxOccurs="unbounded"/&gt;
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
            "refnumber",
            "listelementprice"
        })
        public static class LISTPRICE
            implements Serializable
        {

            @XmlElement(name = "REF_NUMBER", required = true)
            protected BigInteger refnumber;
            @XmlElement(name = "LIST_ELEMENT_PRICE", required = true)
            protected List<TripPriceType> listelementprice;

            /**
             * Gets the value of the refnumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getREFNUMBER() {
                return refnumber;
            }

            /**
             * Sets the value of the refnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setREFNUMBER(BigInteger value) {
                this.refnumber = value;
            }

            /**
             * Gets the value of the listelementprice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listelementprice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTELEMENTPRICE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TripPriceType }
             * 
             * 
             */
            public List<TripPriceType> getLISTELEMENTPRICE() {
                if (listelementprice == null) {
                    listelementprice = new ArrayList<TripPriceType>();
                }
                return this.listelementprice;
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
     *         &lt;element name="LIST_THEME" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="THEME_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="THEME_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "listtheme"
    })
    public static class THEMEDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_THEME", required = true)
        protected List<ListPanelType.THEMEDICTIONARY.LISTTHEME> listtheme;

        /**
         * Gets the value of the listtheme property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtheme property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTHEME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListPanelType.THEMEDICTIONARY.LISTTHEME }
         * 
         * 
         */
        public List<ListPanelType.THEMEDICTIONARY.LISTTHEME> getLISTTHEME() {
            if (listtheme == null) {
                listtheme = new ArrayList<ListPanelType.THEMEDICTIONARY.LISTTHEME>();
            }
            return this.listtheme;
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
         *         &lt;element name="THEME_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="THEME_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "themeid",
            "themetext"
        })
        public static class LISTTHEME
            implements Serializable
        {

            @XmlElement(name = "THEME_ID", required = true)
            protected BigInteger themeid;
            @XmlElement(name = "THEME_TEXT", required = true)
            protected String themetext;

            /**
             * Gets the value of the themeid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTHEMEID() {
                return themeid;
            }

            /**
             * Sets the value of the themeid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTHEMEID(BigInteger value) {
                this.themeid = value;
            }

            /**
             * Gets the value of the themetext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTHEMETEXT() {
                return themetext;
            }

            /**
             * Sets the value of the themetext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTHEMETEXT(String value) {
                this.themetext = value;
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
     *         &lt;element name="LIST_PRICING_MESSAGE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TICKETING_INFORMATION_ID" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="MESSAGE_SUBJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MESSAGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="LIST_MONETARY_DETAIL" maxOccurs="unbounded" minOccurs="0"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                               &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                               &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
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
        "listpricingmessage"
    })
    public static class TICKETINGINFORMATIONDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_PRICING_MESSAGE", required = true)
        protected List<ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE> listpricingmessage;

        /**
         * Gets the value of the listpricingmessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpricingmessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPRICINGMESSAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE }
         * 
         * 
         */
        public List<ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE> getLISTPRICINGMESSAGE() {
            if (listpricingmessage == null) {
                listpricingmessage = new ArrayList<ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE>();
            }
            return this.listpricingmessage;
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
         *         &lt;element name="TICKETING_INFORMATION_ID" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="MESSAGE_SUBJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MESSAGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIST_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="LIST_MONETARY_DETAIL" maxOccurs="unbounded" minOccurs="0"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                     &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                     &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/sequence&gt;
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
            "ticketinginformationid",
            "messagesubject",
            "messagecode",
            "listdescription",
            "listmonetarydetail"
        })
        public static class LISTPRICINGMESSAGE
            implements Serializable
        {

            @XmlElement(name = "TICKETING_INFORMATION_ID", required = true)
            protected String ticketinginformationid;
            @XmlElement(name = "MESSAGE_SUBJECT")
            protected String messagesubject;
            @XmlElement(name = "MESSAGE_CODE")
            protected String messagecode;
            @XmlElement(name = "LIST_DESCRIPTION")
            protected List<Object> listdescription;
            @XmlElement(name = "LIST_MONETARY_DETAIL")
            protected List<ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE.LISTMONETARYDETAIL> listmonetarydetail;

            /**
             * Gets the value of the ticketinginformationid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTICKETINGINFORMATIONID() {
                return ticketinginformationid;
            }

            /**
             * Sets the value of the ticketinginformationid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTICKETINGINFORMATIONID(String value) {
                this.ticketinginformationid = value;
            }

            /**
             * Gets the value of the messagesubject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESSAGESUBJECT() {
                return messagesubject;
            }

            /**
             * Sets the value of the messagesubject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESSAGESUBJECT(String value) {
                this.messagesubject = value;
            }

            /**
             * Gets the value of the messagecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESSAGECODE() {
                return messagecode;
            }

            /**
             * Sets the value of the messagecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESSAGECODE(String value) {
                this.messagecode = value;
            }

            /**
             * Gets the value of the listdescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listdescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTDESCRIPTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getLISTDESCRIPTION() {
                if (listdescription == null) {
                    listdescription = new ArrayList<Object>();
                }
                return this.listdescription;
            }

            /**
             * Gets the value of the listmonetarydetail property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listmonetarydetail property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTMONETARYDETAIL().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE.LISTMONETARYDETAIL }
             * 
             * 
             */
            public List<ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE.LISTMONETARYDETAIL> getLISTMONETARYDETAIL() {
                if (listmonetarydetail == null) {
                    listmonetarydetail = new ArrayList<ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE.LISTMONETARYDETAIL>();
                }
                return this.listmonetarydetail;
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
             *         &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *         &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *         &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                "amounttype",
                "currency",
                "amount"
            })
            public static class LISTMONETARYDETAIL
                implements Serializable
            {

                @XmlElement(name = "AMOUNT_TYPE")
                protected String amounttype;
                @XmlElement(name = "CURRENCY")
                protected String currency;
                @XmlElement(name = "AMOUNT")
                protected String amount;

                /**
                 * Gets the value of the amounttype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAMOUNTTYPE() {
                    return amounttype;
                }

                /**
                 * Sets the value of the amounttype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAMOUNTTYPE(String value) {
                    this.amounttype = value;
                }

                /**
                 * Gets the value of the currency property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCURRENCY() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCURRENCY(String value) {
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
     *         &lt;element name="LIST_TRAVELLER_TYPE" maxOccurs="unbounded"&gt;
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
        "listtravellertype"
    })
    public static class TRAVELLERTYPEDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_TRAVELLER_TYPE", required = true)
        protected List<ListPanelType.TRAVELLERTYPEDICTIONARY.LISTTRAVELLERTYPE> listtravellertype;

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
         * {@link ListPanelType.TRAVELLERTYPEDICTIONARY.LISTTRAVELLERTYPE }
         * 
         * 
         */
        public List<ListPanelType.TRAVELLERTYPEDICTIONARY.LISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
            if (listtravellertype == null) {
                listtravellertype = new ArrayList<ListPanelType.TRAVELLERTYPEDICTIONARY.LISTTRAVELLERTYPE>();
            }
            return this.listtravellertype;
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
        public static class LISTTRAVELLERTYPE
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

}
