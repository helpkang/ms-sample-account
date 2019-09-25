
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.INFORMATIONCONTENTType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.FareFamilyType;
import com.koreanair.eretail.pojo.farecommon.ticketchangercommonexternal.WAIVERINFORMATIONType;


/**
 * <p>Java class for ListRecommendationGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRecommendationGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TAB" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}LIST_DATE" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RECOMMENDATION_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{}LIST_BOUND" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{}FareFamilyType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="TRIP_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_JOURNEY" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_EXCLUDED" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INBOUND_FLIGHT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="OUTBOUND_FLIGHT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SERVICE_LEVEL_SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESULTING_FARE_FAMILY" type="{}FareFamilyType" minOccurs="0"/&gt;
 *         &lt;element name="WAIVER_INFORMATION" type="{}WAIVER_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="AWARD_USR_BALANCE_INSUFFICIENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}STATUS" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PRICE_TICKETING_TYPE" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element name="PROMOTION" type="{}INFORMATION_CONTENT_Type" minOccurs="0"/&gt;
 *         &lt;element name="WEB_ONLY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RECOMMENDATION_DESCRIPTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_COMBINATION_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{}FLIGHT_ID"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_TRAVELLER_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TRAVELLER_TYPE"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="BAGGAGE_ALLOWANCE"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type"/&gt;
 *                                                                     &lt;element name="LIST_FBD_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                                       &lt;complexType&gt;
 *                                                                         &lt;complexContent&gt;
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                             &lt;sequence&gt;
 *                                                                               &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                                               &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                                                               &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                                                 &lt;complexType&gt;
 *                                                                                   &lt;complexContent&gt;
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                                       &lt;group ref="{}allowanceDescriptorGroup"/&gt;
 *                                                                                     &lt;/restriction&gt;
 *                                                                                   &lt;/complexContent&gt;
 *                                                                                 &lt;/complexType&gt;
 *                                                                               &lt;/element&gt;
 *                                                                             &lt;/sequence&gt;
 *                                                                           &lt;/restriction&gt;
 *                                                                         &lt;/complexContent&gt;
 *                                                                       &lt;/complexType&gt;
 *                                                                     &lt;/element&gt;
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
 *                             &lt;element name="MINI_RULES_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_THEME" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="THEME_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TICKETING_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAVELLER_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="LIST_TICKETING_INFORMATION_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ListRecommendationGroupType", propOrder = {
    "listtab",
    "recommendationid",
    "listbound",
    "farefamily",
    "listtripprice",
    "tripprice",
    "listpnr",
    "listjourney",
    "listexcluded",
    "servicelevelshortname",
    "resultingfarefamily",
    "waiverinformation",
    "awardusrbalanceinsufficient",
    "status",
    "listpriceticketingtype",
    "promotion",
    "webonly",
    "listdiscount",
    "recommendationdescription",
    "listtheme",
    "listticketinginformation"
})
public class ListRecommendationGroupType
    implements Serializable
{

    @XmlElement(name = "LIST_TAB")
    protected List<ListRecommendationGroupType.LISTTAB> listtab;
    @XmlElement(name = "RECOMMENDATION_ID", required = true)
    protected BigInteger recommendationid;
    @XmlElement(name = "LIST_BOUND")
    protected List<com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND> listbound;
    @XmlElement(name = "FARE_FAMILY")
    protected FareFamilyType farefamily;
    @XmlElement(name = "LIST_TRIP_PRICE")
    protected List<TripPriceType> listtripprice;
    @XmlElement(name = "TRIP_PRICE")
    protected List<ListRecommendationGroupType.TRIPPRICE> tripprice;
    @XmlElement(name = "LIST_PNR")
    protected List<ListPNRType> listpnr;
    @XmlElement(name = "LIST_JOURNEY")
    protected List<LISTJOURNEY> listjourney;
    @XmlElement(name = "LIST_EXCLUDED")
    protected List<ListRecommendationGroupType.LISTEXCLUDED> listexcluded;
    @XmlElement(name = "SERVICE_LEVEL_SHORT_NAME")
    protected String servicelevelshortname;
    @XmlElement(name = "RESULTING_FARE_FAMILY")
    protected FareFamilyType resultingfarefamily;
    @XmlElement(name = "WAIVER_INFORMATION")
    protected WAIVERINFORMATIONType waiverinformation;
    @XmlElement(name = "AWARD_USR_BALANCE_INSUFFICIENT")
    protected Boolean awardusrbalanceinsufficient;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "LIST_PRICE_TICKETING_TYPE")
    protected List<LISTPRICETICKETINGTYPE> listpriceticketingtype;
    @XmlElement(name = "PROMOTION")
    protected INFORMATIONCONTENTType promotion;
    @XmlElement(name = "WEB_ONLY")
    protected Boolean webonly;
    @XmlElement(name = "LIST_DISCOUNT")
    protected List<LISTDISCOUNT> listdiscount;
    @XmlElement(name = "RECOMMENDATION_DESCRIPTION")
    protected ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION recommendationdescription;
    @XmlElement(name = "LIST_THEME")
    protected List<ListRecommendationGroupType.LISTTHEME> listtheme;
    @XmlElement(name = "LIST_TICKETING_INFORMATION")
    protected List<ListRecommendationGroupType.LISTTICKETINGINFORMATION> listticketinginformation;

    /**
     * Gets the value of the listtab property.
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
     * {@link ListRecommendationGroupType.LISTTAB }
     * 
     * 
     */
    public List<ListRecommendationGroupType.LISTTAB> getLISTTAB() {
        if (listtab == null) {
            listtab = new ArrayList<ListRecommendationGroupType.LISTTAB>();
        }
        return this.listtab;
    }

    /**
     * Gets the value of the recommendationid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECOMMENDATIONID() {
        return recommendationid;
    }

    /**
     * Sets the value of the recommendationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECOMMENDATIONID(BigInteger value) {
        this.recommendationid = value;
    }

    /**
     * Gets the value of the listbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND }
     * 
     * 
     */
    public List<com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND> getLISTBOUND() {
        if (listbound == null) {
            listbound = new ArrayList<com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND>();
        }
        return this.listbound;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyType }
     *     
     */
    public FareFamilyType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyType }
     *     
     */
    public void setFAREFAMILY(FareFamilyType value) {
        this.farefamily = value;
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
     * {@link TripPriceType }
     * 
     * 
     */
    public List<TripPriceType> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<TripPriceType>();
        }
        return this.listtripprice;
    }

    /**
     * Gets the value of the tripprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRIPPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListRecommendationGroupType.TRIPPRICE }
     * 
     * 
     */
    public List<ListRecommendationGroupType.TRIPPRICE> getTRIPPRICE() {
        if (tripprice == null) {
            tripprice = new ArrayList<ListRecommendationGroupType.TRIPPRICE>();
        }
        return this.tripprice;
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
     * {@link ListPNRType }
     * 
     * 
     */
    public List<ListPNRType> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<ListPNRType>();
        }
        return this.listpnr;
    }

    /**
     * Gets the value of the listjourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listjourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTJOURNEY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTJOURNEY }
     * 
     * 
     */
    public List<LISTJOURNEY> getLISTJOURNEY() {
        if (listjourney == null) {
            listjourney = new ArrayList<LISTJOURNEY>();
        }
        return this.listjourney;
    }

    /**
     * Gets the value of the listexcluded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexcluded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXCLUDED().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListRecommendationGroupType.LISTEXCLUDED }
     * 
     * 
     */
    public List<ListRecommendationGroupType.LISTEXCLUDED> getLISTEXCLUDED() {
        if (listexcluded == null) {
            listexcluded = new ArrayList<ListRecommendationGroupType.LISTEXCLUDED>();
        }
        return this.listexcluded;
    }

    /**
     * Gets the value of the servicelevelshortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICELEVELSHORTNAME() {
        return servicelevelshortname;
    }

    /**
     * Sets the value of the servicelevelshortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICELEVELSHORTNAME(String value) {
        this.servicelevelshortname = value;
    }

    /**
     * Gets the value of the resultingfarefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyType }
     *     
     */
    public FareFamilyType getRESULTINGFAREFAMILY() {
        return resultingfarefamily;
    }

    /**
     * Sets the value of the resultingfarefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyType }
     *     
     */
    public void setRESULTINGFAREFAMILY(FareFamilyType value) {
        this.resultingfarefamily = value;
    }

    /**
     * Gets the value of the waiverinformation property.
     * 
     * @return
     *     possible object is
     *     {@link WAIVERINFORMATIONType }
     *     
     */
    public WAIVERINFORMATIONType getWAIVERINFORMATION() {
        return waiverinformation;
    }

    /**
     * Sets the value of the waiverinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WAIVERINFORMATIONType }
     *     
     */
    public void setWAIVERINFORMATION(WAIVERINFORMATIONType value) {
        this.waiverinformation = value;
    }

    /**
     * Gets the value of the awardusrbalanceinsufficient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAWARDUSRBALANCEINSUFFICIENT() {
        return awardusrbalanceinsufficient;
    }

    /**
     * Sets the value of the awardusrbalanceinsufficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAWARDUSRBALANCEINSUFFICIENT(Boolean value) {
        this.awardusrbalanceinsufficient = value;
    }

    /**
     * Contains for a specific recommendation its availability status, resulting from a computation of the availability status(es) of the flight(s) that compose(s) the recommendation. For instance, if at least one of the flight of the recommendation is waitlisted, the recommendation will be waitlisted. Values are: L for Waitlisted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * The list of price ticketing type associated with each recommendation.Gets the value of the listpriceticketingtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpriceticketingtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICETICKETINGTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICETICKETINGTYPE }
     * 
     * 
     */
    public List<LISTPRICETICKETINGTYPE> getLISTPRICETICKETINGTYPE() {
        if (listpriceticketingtype == null) {
            listpriceticketingtype = new ArrayList<LISTPRICETICKETINGTYPE>();
        }
        return this.listpriceticketingtype;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link INFORMATIONCONTENTType }
     *     
     */
    public INFORMATIONCONTENTType getPROMOTION() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link INFORMATIONCONTENTType }
     *     
     */
    public void setPROMOTION(INFORMATIONCONTENTType value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the webonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWEBONLY() {
        return webonly;
    }

    /**
     * Sets the value of the webonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWEBONLY(Boolean value) {
        this.webonly = value;
    }

    /**
     * The list of discount codes applying within this recommendation.Gets the value of the listdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTDISCOUNT }
     * 
     * 
     */
    public List<LISTDISCOUNT> getLISTDISCOUNT() {
        if (listdiscount == null) {
            listdiscount = new ArrayList<LISTDISCOUNT>();
        }
        return this.listdiscount;
    }

    /**
     * Gets the value of the recommendationdescription property.
     * 
     * @return
     *     possible object is
     *     {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION }
     *     
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION getRECOMMENDATIONDESCRIPTION() {
        return recommendationdescription;
    }

    /**
     * Sets the value of the recommendationdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION }
     *     
     */
    public void setRECOMMENDATIONDESCRIPTION(ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION value) {
        this.recommendationdescription = value;
    }

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
     * {@link ListRecommendationGroupType.LISTTHEME }
     * 
     * 
     */
    public List<ListRecommendationGroupType.LISTTHEME> getLISTTHEME() {
        if (listtheme == null) {
            listtheme = new ArrayList<ListRecommendationGroupType.LISTTHEME>();
        }
        return this.listtheme;
    }

    /**
     * Gets the value of the listticketinginformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticketinginformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETINGINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListRecommendationGroupType.LISTTICKETINGINFORMATION }
     * 
     * 
     */
    public List<ListRecommendationGroupType.LISTTICKETINGINFORMATION> getLISTTICKETINGINFORMATION() {
        if (listticketinginformation == null) {
            listticketinginformation = new ArrayList<ListRecommendationGroupType.LISTTICKETINGINFORMATION>();
        }
        return this.listticketinginformation;
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
     *         &lt;element name="INBOUND_FLIGHT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="OUTBOUND_FLIGHT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "inboundflightid",
        "outboundflightid"
    })
    public static class LISTEXCLUDED
        implements Serializable
    {

        @XmlElement(name = "INBOUND_FLIGHT_ID", required = true)
        protected Object inboundflightid;
        @XmlElement(name = "OUTBOUND_FLIGHT_ID", required = true)
        protected Object outboundflightid;

        /**
         * Gets the value of the inboundflightid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINBOUNDFLIGHTID() {
            return inboundflightid;
        }

        /**
         * Sets the value of the inboundflightid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINBOUNDFLIGHTID(Object value) {
            this.inboundflightid = value;
        }

        /**
         * Gets the value of the outboundflightid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOUTBOUNDFLIGHTID() {
            return outboundflightid;
        }

        /**
         * Sets the value of the outboundflightid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOUTBOUNDFLIGHTID(Object value) {
            this.outboundflightid = value;
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
     *         &lt;element ref="{}LIST_DATE" maxOccurs="unbounded"/&gt;
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
        "listdate"
    })
    public static class LISTTAB
        implements Serializable
    {

        @XmlElement(name = "LIST_DATE", required = true)
        protected List<LISTDATE> listdate;

        /**
         * Gets the value of the listdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTDATE }
         * 
         * 
         */
        public List<LISTDATE> getLISTDATE() {
            if (listdate == null) {
                listdate = new ArrayList<LISTDATE>();
            }
            return this.listdate;
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
     *         &lt;element name="THEME_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "themeid"
    })
    public static class LISTTHEME
        implements Serializable
    {

        @XmlElement(name = "THEME_ID", required = true)
        protected BigInteger themeid;

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
     *         &lt;element name="TRAVELLER_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="LIST_TICKETING_INFORMATION_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
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
        "travellertypecode",
        "listticketinginformationid"
    })
    public static class LISTTICKETINGINFORMATION
        implements Serializable
    {

        @XmlElement(name = "TRAVELLER_TYPE_CODE", required = true)
        protected Object travellertypecode;
        @XmlElement(name = "LIST_TICKETING_INFORMATION_ID", required = true)
        protected List<BigInteger> listticketinginformationid;

        /**
         * Gets the value of the travellertypecode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRAVELLERTYPECODE() {
            return travellertypecode;
        }

        /**
         * Sets the value of the travellertypecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRAVELLERTYPECODE(Object value) {
            this.travellertypecode = value;
        }

        /**
         * Gets the value of the listticketinginformationid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listticketinginformationid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTICKETINGINFORMATIONID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTTICKETINGINFORMATIONID() {
            if (listticketinginformationid == null) {
                listticketinginformationid = new ArrayList<BigInteger>();
            }
            return this.listticketinginformationid;
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
     *         &lt;element name="LIST_COMBINATION_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{}FLIGHT_ID"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_TRAVELLER_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
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
     *                                       &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="BAGGAGE_ALLOWANCE"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type"/&gt;
     *                                                           &lt;element name="LIST_FBD_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;complexContent&gt;
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                   &lt;sequence&gt;
     *                                                                     &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                                                     &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                                                                     &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                                       &lt;complexType&gt;
     *                                                                         &lt;complexContent&gt;
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                             &lt;group ref="{}allowanceDescriptorGroup"/&gt;
     *                                                                           &lt;/restriction&gt;
     *                                                                         &lt;/complexContent&gt;
     *                                                                       &lt;/complexType&gt;
     *                                                                     &lt;/element&gt;
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
     *                   &lt;element name="MINI_RULES_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "listcombinationdescription"
    })
    public static class RECOMMENDATIONDESCRIPTION
        implements Serializable
    {

        @XmlElement(name = "LIST_COMBINATION_DESCRIPTION")
        protected List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION> listcombinationdescription;

        /**
         * Gets the value of the listcombinationdescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcombinationdescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCOMBINATIONDESCRIPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION }
         * 
         * 
         */
        public List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION> getLISTCOMBINATIONDESCRIPTION() {
            if (listcombinationdescription == null) {
                listcombinationdescription = new ArrayList<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION>();
            }
            return this.listcombinationdescription;
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
         *         &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{}FLIGHT_ID"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_TRAVELLER_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
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
         *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="BAGGAGE_ALLOWANCE"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type"/&gt;
         *                                                 &lt;element name="LIST_FBD_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;complexContent&gt;
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                         &lt;sequence&gt;
         *                                                           &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                                                           &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                                                           &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                                             &lt;complexType&gt;
         *                                                               &lt;complexContent&gt;
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                                   &lt;group ref="{}allowanceDescriptorGroup"/&gt;
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
         *         &lt;element name="MINI_RULES_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "listbound",
            "listtravellerdescription",
            "minirulesid"
        })
        public static class LISTCOMBINATIONDESCRIPTION
            implements Serializable
        {

            @XmlElement(name = "LIST_BOUND", required = true)
            protected List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTBOUND> listbound;
            @XmlElement(name = "LIST_TRAVELLER_DESCRIPTION")
            protected List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION> listtravellerdescription;
            @XmlElement(name = "MINI_RULES_ID")
            protected String minirulesid;

            /**
             * Gets the value of the listbound property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listbound property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTBOUND().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTBOUND }
             * 
             * 
             */
            public List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTBOUND> getLISTBOUND() {
                if (listbound == null) {
                    listbound = new ArrayList<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTBOUND>();
                }
                return this.listbound;
            }

            /**
             * Gets the value of the listtravellerdescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listtravellerdescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTTRAVELLERDESCRIPTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION }
             * 
             * 
             */
            public List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION> getLISTTRAVELLERDESCRIPTION() {
                if (listtravellerdescription == null) {
                    listtravellerdescription = new ArrayList<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION>();
                }
                return this.listtravellerdescription;
            }

            /**
             * Gets the value of the minirulesid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMINIRULESID() {
                return minirulesid;
            }

            /**
             * Sets the value of the minirulesid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMINIRULESID(String value) {
                this.minirulesid = value;
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
             *         &lt;element ref="{}FLIGHT_ID"/&gt;
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
                "flightid"
            })
            public static class LISTBOUND
                implements Serializable
            {

                @XmlElement(name = "FLIGHT_ID", required = true)
                protected BigInteger flightid;

                /**
                 * Gets the value of the flightid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFLIGHTID() {
                    return flightid;
                }

                /**
                 * Sets the value of the flightid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFLIGHTID(BigInteger value) {
                    this.flightid = value;
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
             *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="BAGGAGE_ALLOWANCE"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type"/&gt;
             *                                       &lt;element name="LIST_FBD_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;complexContent&gt;
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                               &lt;sequence&gt;
             *                                                 &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                                                 &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *                                                 &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
             *                                                   &lt;complexType&gt;
             *                                                     &lt;complexContent&gt;
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                         &lt;group ref="{}allowanceDescriptorGroup"/&gt;
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
                "travellertype",
                "baggageallowance"
            })
            public static class LISTTRAVELLERDESCRIPTION
                implements Serializable
            {

                @XmlElement(name = "TRAVELLER_TYPE", required = true)
                protected ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE travellertype;
                @XmlElement(name = "BAGGAGE_ALLOWANCE", required = true)
                protected ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE baggageallowance;

                /**
                 * Gets the value of the travellertype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE }
                 *     
                 */
                public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE getTRAVELLERTYPE() {
                    return travellertype;
                }

                /**
                 * Sets the value of the travellertype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE }
                 *     
                 */
                public void setTRAVELLERTYPE(ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE value) {
                    this.travellertype = value;
                }

                /**
                 * Gets the value of the baggageallowance property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE }
                 *     
                 */
                public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE getBAGGAGEALLOWANCE() {
                    return baggageallowance;
                }

                /**
                 * Sets the value of the baggageallowance property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE }
                 *     
                 */
                public void setBAGGAGEALLOWANCE(ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE value) {
                    this.baggageallowance = value;
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
                 *         &lt;element name="LIST_BOUND" maxOccurs="unbounded"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type"/&gt;
                 *                             &lt;element name="LIST_FBD_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;complexContent&gt;
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                     &lt;sequence&gt;
                 *                                       &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *                                       &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
                 *                                       &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                                         &lt;complexType&gt;
                 *                                           &lt;complexContent&gt;
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                               &lt;group ref="{}allowanceDescriptorGroup"/&gt;
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
                    "listbound"
                })
                public static class BAGGAGEALLOWANCE
                    implements Serializable
                {

                    @XmlElement(name = "LIST_BOUND", required = true)
                    protected List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND> listbound;

                    /**
                     * Gets the value of the listbound property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listbound property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTBOUND().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND }
                     * 
                     * 
                     */
                    public List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND> getLISTBOUND() {
                        if (listbound == null) {
                            listbound = new ArrayList<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND>();
                        }
                        return this.listbound;
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
                     *                   &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type"/&gt;
                     *                   &lt;element name="LIST_FBD_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;complexContent&gt;
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                           &lt;sequence&gt;
                     *                             &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
                     *                             &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
                     *                             &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
                     *                               &lt;complexType&gt;
                     *                                 &lt;complexContent&gt;
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                                     &lt;group ref="{}allowanceDescriptorGroup"/&gt;
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
                        "listsegment"
                    })
                    public static class LISTBOUND
                        implements Serializable
                    {

                        @XmlElement(name = "LIST_SEGMENT", required = true)
                        protected List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT> listsegment;

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
                         * {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT }
                         * 
                         * 
                         */
                        public List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT> getLISTSEGMENT() {
                            if (listsegment == null) {
                                listsegment = new ArrayList<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT>();
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
                         *         &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type"/&gt;
                         *         &lt;element name="LIST_FBD_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;complexContent&gt;
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                 &lt;sequence&gt;
                         *                   &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
                         *                   &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
                         *                   &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
                         *                     &lt;complexType&gt;
                         *                       &lt;complexContent&gt;
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                           &lt;group ref="{}allowanceDescriptorGroup"/&gt;
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
                            "typedbaggageallowance",
                            "listfbdinfo"
                        })
                        public static class LISTSEGMENT
                            implements Serializable
                        {

                            @XmlElement(name = "TYPED_BAGGAGE_ALLOWANCE", required = true)
                            protected TYPEDBAGGAGEALLOWANCEType typedbaggageallowance;
                            @XmlElement(name = "LIST_FBD_INFO")
                            protected List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO> listfbdinfo;

                            /**
                             * Gets the value of the typedbaggageallowance property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TYPEDBAGGAGEALLOWANCEType }
                             *     
                             */
                            public TYPEDBAGGAGEALLOWANCEType getTYPEDBAGGAGEALLOWANCE() {
                                return typedbaggageallowance;
                            }

                            /**
                             * Sets the value of the typedbaggageallowance property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TYPEDBAGGAGEALLOWANCEType }
                             *     
                             */
                            public void setTYPEDBAGGAGEALLOWANCE(TYPEDBAGGAGEALLOWANCEType value) {
                                this.typedbaggageallowance = value;
                            }

                            /**
                             * Gets the value of the listfbdinfo property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the listfbdinfo property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getLISTFBDINFO().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO }
                             * 
                             * 
                             */
                            public List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO> getLISTFBDINFO() {
                                if (listfbdinfo == null) {
                                    listfbdinfo = new ArrayList<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO>();
                                }
                                return this.listfbdinfo;
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
                             *         &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
                             *         &lt;element name="NUMBER_OF_PIECES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
                             *         &lt;element name="LIST_ALLOWANCE_DESCRIPTOR" maxOccurs="unbounded" minOccurs="0"&gt;
                             *           &lt;complexType&gt;
                             *             &lt;complexContent&gt;
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *                 &lt;group ref="{}allowanceDescriptorGroup"/&gt;
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
                                "freetext",
                                "numberofpieces",
                                "listallowancedescriptor"
                            })
                            public static class LISTFBDINFO
                                implements Serializable
                            {

                                @XmlElement(name = "FREE_TEXT")
                                protected String freetext;
                                @XmlElement(name = "NUMBER_OF_PIECES")
                                protected BigInteger numberofpieces;
                                @XmlElement(name = "LIST_ALLOWANCE_DESCRIPTOR")
                                protected List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO.LISTALLOWANCEDESCRIPTOR> listallowancedescriptor;

                                /**
                                 * Gets the value of the freetext property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getFREETEXT() {
                                    return freetext;
                                }

                                /**
                                 * Sets the value of the freetext property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setFREETEXT(String value) {
                                    this.freetext = value;
                                }

                                /**
                                 * Gets the value of the numberofpieces property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getNUMBEROFPIECES() {
                                    return numberofpieces;
                                }

                                /**
                                 * Sets the value of the numberofpieces property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setNUMBEROFPIECES(BigInteger value) {
                                    this.numberofpieces = value;
                                }

                                /**
                                 * Gets the value of the listallowancedescriptor property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the listallowancedescriptor property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getLISTALLOWANCEDESCRIPTOR().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO.LISTALLOWANCEDESCRIPTOR }
                                 * 
                                 * 
                                 */
                                public List<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO.LISTALLOWANCEDESCRIPTOR> getLISTALLOWANCEDESCRIPTOR() {
                                    if (listallowancedescriptor == null) {
                                        listallowancedescriptor = new ArrayList<ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO.LISTALLOWANCEDESCRIPTOR>();
                                    }
                                    return this.listallowancedescriptor;
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
                                 *       &lt;group ref="{}allowanceDescriptorGroup"/&gt;
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
                                    "qualifier",
                                    "value",
                                    "unit"
                                })
                                public static class LISTALLOWANCEDESCRIPTOR
                                    implements Serializable
                                {

                                    @XmlElement(name = "TYPE", required = true)
                                    protected Object type;
                                    @XmlElement(name = "QUALIFIER")
                                    protected Object qualifier;
                                    @XmlElement(name = "VALUE")
                                    protected Object value;
                                    @XmlElement(name = "UNIT")
                                    protected Object unit;

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
                                     * Gets the value of the qualifier property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public Object getQUALIFIER() {
                                        return qualifier;
                                    }

                                    /**
                                     * Sets the value of the qualifier property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public void setQUALIFIER(Object value) {
                                        this.qualifier = value;
                                    }

                                    /**
                                     * Gets the value of the value property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public Object getVALUE() {
                                        return value;
                                    }

                                    /**
                                     * Sets the value of the value property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public void setVALUE(Object value) {
                                        this.value = value;
                                    }

                                    /**
                                     * Gets the value of the unit property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public Object getUNIT() {
                                        return unit;
                                    }

                                    /**
                                     * Sets the value of the unit property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public void setUNIT(Object value) {
                                        this.unit = value;
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
     *         &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "refnumber"
    })
    public static class TRIPPRICE
        implements Serializable
    {

        @XmlElement(name = "REF_NUMBER", required = true)
        protected BigInteger refnumber;

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

    }

}
