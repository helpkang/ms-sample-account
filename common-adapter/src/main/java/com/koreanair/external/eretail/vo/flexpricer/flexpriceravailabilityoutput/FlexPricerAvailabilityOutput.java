
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityoutput;

import java.io.Serializable;
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
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;
import com.koreanair.external.eretail.vo.common.common.DATERANGEType;
import com.koreanair.external.eretail.vo.common.common.FlightFactType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
import com.koreanair.external.eretail.vo.common.common.LISTPROPOSEFAREDISCOUNT;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTPROMOTIONINFOType;
import com.koreanair.external.eretail.vo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.CurrencyRefType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.FFCFFDictionaryMapping;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTSERVICEFEESGROUPType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListPanelType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListRecommendationGroupType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercertificateavailabilityrulestype.AVAILABILITYRULESType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommon.RBDType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTFREQUENTFLYERTYPE;
import com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput.BOOKEDTRIPFLEXType;


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
 *         &lt;element name="PREVIOUS_RECOMMENDATION" type="{}ListRecommendationGroupType" minOccurs="0"/&gt;
 *         &lt;group ref="{}FlexPricerAvailabilityOutputGroup"/&gt;
 *         &lt;element name="TEMPLATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AFFINITY_DISCREPANCY" type="{}AffinityDiscrepancyType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKED_TRIP" type="{}BOOKED_TRIP_FLEX_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AVAILABILITY_RANGE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MIN_AVAIL_DATE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MAX_AVAIL_DATE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LOCATION" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FILTER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ABSOLUTE_RANGE" type="{}DATE_RANGE_Type" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_ANY_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_BLACKLIST_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_RBD" type="{}RBD_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVAILABILITY_RULES" type="{}AVAILABILITY_RULES_Type" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_FACT_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_FLIGHT_FACT" type="{}FlightFactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVEL_SPONSOR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
 *               &lt;/extension&gt;
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
    "previousrecommendation",
    "pageticket",
    "flowsignature",
    "listmsg",
    "listpanel",
    "sortdata",
    "listredemptionremark",
    "listproposefarediscount",
    "farefamilydictionary",
    "listservicefeesgroup",
    "listpromotioninfo",
    "listcurrency",
    "mealservicesdictionary",
    "inflightservicesdictionary",
    "alliancedictionary",
    "cemdetails",
    "template",
    "affinitydiscrepancy",
    "bookedtrip",
    "listavailabilityrange",
    "filter",
    "availabilityrules",
    "flightfactdictionary",
    "travelsponsor"
})
@XmlRootElement(name = "FlexPricerAvailabilityOutput")
public class FlexPricerAvailabilityOutput
    implements Serializable
{

    @XmlElement(name = "PREVIOUS_RECOMMENDATION")
    protected ListRecommendationGroupType previousrecommendation;
    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "FLOW_SIGNATURE")
    protected FLOWSIGNATUREType flowsignature;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_PANEL")
    protected List<ListPanelType> listpanel;
    @XmlElement(name = "SORT_DATA")
    protected FlexPricerAvailabilityOutput.SORTDATA sortdata;
    @XmlElement(name = "LIST_REDEMPTION_REMARK")
    protected List<String> listredemptionremark;
    @XmlElement(name = "LIST_PROPOSE_FARE_DISCOUNT")
    protected List<LISTPROPOSEFAREDISCOUNT> listproposefarediscount;
    @XmlElement(name = "FARE_FAMILY_DICTIONARY")
    protected FFCFFDictionaryMapping farefamilydictionary;
    @XmlElement(name = "LIST_SERVICE_FEES_GROUP")
    protected List<LISTSERVICEFEESGROUPType> listservicefeesgroup;
    @XmlElement(name = "LIST_PROMOTION_INFO")
    protected List<LISTPROMOTIONINFOType> listpromotioninfo;
    @XmlElement(name = "LIST_CURRENCY")
    protected List<CurrencyRefType> listcurrency;
    @XmlElement(name = "MEAL_SERVICES_DICTIONARY")
    protected FlexPricerAvailabilityOutput.MEALSERVICESDICTIONARY mealservicesdictionary;
    @XmlElement(name = "INFLIGHT_SERVICES_DICTIONARY")
    protected FlexPricerAvailabilityOutput.INFLIGHTSERVICESDICTIONARY inflightservicesdictionary;
    @XmlElement(name = "ALLIANCE_DICTIONARY")
    protected FlexPricerAvailabilityOutput.ALLIANCEDICTIONARY alliancedictionary;
    @XmlElement(name = "CEM_DETAILS")
    protected FlexPricerAvailabilityOutput.CEMDETAILS cemdetails;
    @XmlElement(name = "TEMPLATE")
    protected Object template;
    @XmlElement(name = "AFFINITY_DISCREPANCY")
    protected AffinityDiscrepancyType affinitydiscrepancy;
    @XmlElement(name = "BOOKED_TRIP")
    protected BOOKEDTRIPFLEXType bookedtrip;
    @XmlElement(name = "LIST_AVAILABILITY_RANGE", required = true)
    protected List<FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE> listavailabilityrange;
    @XmlElement(name = "FILTER")
    protected FlexPricerAvailabilityOutput.FILTER filter;
    @XmlElement(name = "AVAILABILITY_RULES")
    protected AVAILABILITYRULESType availabilityrules;
    @XmlElement(name = "FLIGHT_FACT_DICTIONARY")
    protected FlexPricerAvailabilityOutput.FLIGHTFACTDICTIONARY flightfactdictionary;
    @XmlElement(name = "TRAVEL_SPONSOR")
    protected FlexPricerAvailabilityOutput.TRAVELSPONSOR travelsponsor;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the previousrecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link ListRecommendationGroupType }
     *     
     */
    public ListRecommendationGroupType getPREVIOUSRECOMMENDATION() {
        return previousrecommendation;
    }

    /**
     * Sets the value of the previousrecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRecommendationGroupType }
     *     
     */
    public void setPREVIOUSRECOMMENDATION(ListRecommendationGroupType value) {
        this.previousrecommendation = value;
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
     * Gets the value of the listpanel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpanel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPANEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListPanelType }
     * 
     * 
     */
    public List<ListPanelType> getLISTPANEL() {
        if (listpanel == null) {
            listpanel = new ArrayList<ListPanelType>();
        }
        return this.listpanel;
    }

    /**
     * Gets the value of the sortdata property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.SORTDATA }
     *     
     */
    public FlexPricerAvailabilityOutput.SORTDATA getSORTDATA() {
        return sortdata;
    }

    /**
     * Sets the value of the sortdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.SORTDATA }
     *     
     */
    public void setSORTDATA(FlexPricerAvailabilityOutput.SORTDATA value) {
        this.sortdata = value;
    }

    /**
     * Gets the value of the listredemptionremark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemptionremark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTIONREMARK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTREDEMPTIONREMARK() {
        if (listredemptionremark == null) {
            listredemptionremark = new ArrayList<String>();
        }
        return this.listredemptionremark;
    }

    /**
     * Gets the value of the listproposefarediscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproposefarediscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROPOSEFAREDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPROPOSEFAREDISCOUNT }
     * 
     * 
     */
    public List<LISTPROPOSEFAREDISCOUNT> getLISTPROPOSEFAREDISCOUNT() {
        if (listproposefarediscount == null) {
            listproposefarediscount = new ArrayList<LISTPROPOSEFAREDISCOUNT>();
        }
        return this.listproposefarediscount;
    }

    /**
     * Gets the value of the farefamilydictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FFCFFDictionaryMapping }
     *     
     */
    public FFCFFDictionaryMapping getFAREFAMILYDICTIONARY() {
        return farefamilydictionary;
    }

    /**
     * Sets the value of the farefamilydictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FFCFFDictionaryMapping }
     *     
     */
    public void setFAREFAMILYDICTIONARY(FFCFFDictionaryMapping value) {
        this.farefamilydictionary = value;
    }

    /**
     * Gets the value of the listservicefeesgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicefeesgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEFEESGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEESGROUPType }
     * 
     * 
     */
    public List<LISTSERVICEFEESGROUPType> getLISTSERVICEFEESGROUP() {
        if (listservicefeesgroup == null) {
            listservicefeesgroup = new ArrayList<LISTSERVICEFEESGROUPType>();
        }
        return this.listservicefeesgroup;
    }

    /**
     * Gets the value of the listpromotioninfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpromotioninfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROMOTIONINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPROMOTIONINFOType }
     * 
     * 
     */
    public List<LISTPROMOTIONINFOType> getLISTPROMOTIONINFO() {
        if (listpromotioninfo == null) {
            listpromotioninfo = new ArrayList<LISTPROMOTIONINFOType>();
        }
        return this.listpromotioninfo;
    }

    /**
     * Gets the value of the listcurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCURRENCY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyRefType }
     * 
     * 
     */
    public List<CurrencyRefType> getLISTCURRENCY() {
        if (listcurrency == null) {
            listcurrency = new ArrayList<CurrencyRefType>();
        }
        return this.listcurrency;
    }

    /**
     * Gets the value of the mealservicesdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.MEALSERVICESDICTIONARY }
     *     
     */
    public FlexPricerAvailabilityOutput.MEALSERVICESDICTIONARY getMEALSERVICESDICTIONARY() {
        return mealservicesdictionary;
    }

    /**
     * Sets the value of the mealservicesdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.MEALSERVICESDICTIONARY }
     *     
     */
    public void setMEALSERVICESDICTIONARY(FlexPricerAvailabilityOutput.MEALSERVICESDICTIONARY value) {
        this.mealservicesdictionary = value;
    }

    /**
     * Gets the value of the inflightservicesdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.INFLIGHTSERVICESDICTIONARY }
     *     
     */
    public FlexPricerAvailabilityOutput.INFLIGHTSERVICESDICTIONARY getINFLIGHTSERVICESDICTIONARY() {
        return inflightservicesdictionary;
    }

    /**
     * Sets the value of the inflightservicesdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.INFLIGHTSERVICESDICTIONARY }
     *     
     */
    public void setINFLIGHTSERVICESDICTIONARY(FlexPricerAvailabilityOutput.INFLIGHTSERVICESDICTIONARY value) {
        this.inflightservicesdictionary = value;
    }

    /**
     * Gets the value of the alliancedictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.ALLIANCEDICTIONARY }
     *     
     */
    public FlexPricerAvailabilityOutput.ALLIANCEDICTIONARY getALLIANCEDICTIONARY() {
        return alliancedictionary;
    }

    /**
     * Sets the value of the alliancedictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.ALLIANCEDICTIONARY }
     *     
     */
    public void setALLIANCEDICTIONARY(FlexPricerAvailabilityOutput.ALLIANCEDICTIONARY value) {
        this.alliancedictionary = value;
    }

    /**
     * Gets the value of the cemdetails property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.CEMDETAILS }
     *     
     */
    public FlexPricerAvailabilityOutput.CEMDETAILS getCEMDETAILS() {
        return cemdetails;
    }

    /**
     * Sets the value of the cemdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.CEMDETAILS }
     *     
     */
    public void setCEMDETAILS(FlexPricerAvailabilityOutput.CEMDETAILS value) {
        this.cemdetails = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTEMPLATE() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTEMPLATE(Object value) {
        this.template = value;
    }

    /**
     * Gets the value of the affinitydiscrepancy property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityDiscrepancyType }
     *     
     */
    public AffinityDiscrepancyType getAFFINITYDISCREPANCY() {
        return affinitydiscrepancy;
    }

    /**
     * Sets the value of the affinitydiscrepancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityDiscrepancyType }
     *     
     */
    public void setAFFINITYDISCREPANCY(AffinityDiscrepancyType value) {
        this.affinitydiscrepancy = value;
    }

    /**
     * Gets the value of the bookedtrip property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDTRIPFLEXType }
     *     
     */
    public BOOKEDTRIPFLEXType getBOOKEDTRIP() {
        return bookedtrip;
    }

    /**
     * Sets the value of the bookedtrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDTRIPFLEXType }
     *     
     */
    public void setBOOKEDTRIP(BOOKEDTRIPFLEXType value) {
        this.bookedtrip = value;
    }

    /**
     * Gets the value of the listavailabilityrange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listavailabilityrange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAVAILABILITYRANGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE }
     * 
     * 
     */
    public List<FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE> getLISTAVAILABILITYRANGE() {
        if (listavailabilityrange == null) {
            listavailabilityrange = new ArrayList<FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE>();
        }
        return this.listavailabilityrange;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.FILTER }
     *     
     */
    public FlexPricerAvailabilityOutput.FILTER getFILTER() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.FILTER }
     *     
     */
    public void setFILTER(FlexPricerAvailabilityOutput.FILTER value) {
        this.filter = value;
    }

    /**
     * Gets the value of the availabilityrules property.
     * 
     * @return
     *     possible object is
     *     {@link AVAILABILITYRULESType }
     *     
     */
    public AVAILABILITYRULESType getAVAILABILITYRULES() {
        return availabilityrules;
    }

    /**
     * Sets the value of the availabilityrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVAILABILITYRULESType }
     *     
     */
    public void setAVAILABILITYRULES(AVAILABILITYRULESType value) {
        this.availabilityrules = value;
    }

    /**
     * Gets the value of the flightfactdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.FLIGHTFACTDICTIONARY }
     *     
     */
    public FlexPricerAvailabilityOutput.FLIGHTFACTDICTIONARY getFLIGHTFACTDICTIONARY() {
        return flightfactdictionary;
    }

    /**
     * Sets the value of the flightfactdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.FLIGHTFACTDICTIONARY }
     *     
     */
    public void setFLIGHTFACTDICTIONARY(FlexPricerAvailabilityOutput.FLIGHTFACTDICTIONARY value) {
        this.flightfactdictionary = value;
    }

    /**
     * Gets the value of the travelsponsor property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityOutput.TRAVELSPONSOR }
     *     
     */
    public FlexPricerAvailabilityOutput.TRAVELSPONSOR getTRAVELSPONSOR() {
        return travelsponsor;
    }

    /**
     * Sets the value of the travelsponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityOutput.TRAVELSPONSOR }
     *     
     */
    public void setTRAVELSPONSOR(FlexPricerAvailabilityOutput.TRAVELSPONSOR value) {
        this.travelsponsor = value;
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
     *         &lt;element name="LIST_ALLIANCE" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listalliance"
    })
    public static class ALLIANCEDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_ALLIANCE")
        protected List<CodeDescriptorType> listalliance;

        /**
         * Gets the value of the listalliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listalliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTALLIANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeDescriptorType }
         * 
         * 
         */
        public List<CodeDescriptorType> getLISTALLIANCE() {
            if (listalliance == null) {
                listalliance = new ArrayList<CodeDescriptorType>();
            }
            return this.listalliance;
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
     *         &lt;element ref="{}CEM_ID"/&gt;
     *         &lt;element ref="{}CEM_AIRLINE_CODE"/&gt;
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
        "cemid",
        "cemairlinecode"
    })
    public static class CEMDETAILS
        implements Serializable
    {

        @XmlElement(name = "CEM_ID", required = true)
        protected String cemid;
        @XmlElement(name = "CEM_AIRLINE_CODE", required = true)
        protected String cemairlinecode;

        /**
         * Gets the value of the cemid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCEMID() {
            return cemid;
        }

        /**
         * Sets the value of the cemid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCEMID(String value) {
            this.cemid = value;
        }

        /**
         * Gets the value of the cemairlinecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCEMAIRLINECODE() {
            return cemairlinecode;
        }

        /**
         * Sets the value of the cemairlinecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCEMAIRLINECODE(String value) {
            this.cemairlinecode = value;
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
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ABSOLUTE_RANGE" type="{}DATE_RANGE_Type" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_ANY_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_BLACKLIST_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_RBD" type="{}RBD_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listrbd"
    })
    public static class FILTER
        implements Serializable
    {

        @XmlElement(name = "DATE", required = true)
        protected FlexPricerAvailabilityOutput.FILTER.DATE date;
        @XmlElement(name = "LIST_RBD")
        protected List<RBDType> listrbd;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link FlexPricerAvailabilityOutput.FILTER.DATE }
         *     
         */
        public FlexPricerAvailabilityOutput.FILTER.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexPricerAvailabilityOutput.FILTER.DATE }
         *     
         */
        public void setDATE(FlexPricerAvailabilityOutput.FILTER.DATE value) {
            this.date = value;
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
         * {@link RBDType }
         * 
         * 
         */
        public List<RBDType> getLISTRBD() {
            if (listrbd == null) {
                listrbd = new ArrayList<RBDType>();
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
         *         &lt;element name="ABSOLUTE_RANGE" type="{}DATE_RANGE_Type" minOccurs="0"/&gt;
         *         &lt;element name="LIST_ANY_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_BLACKLIST_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "absoluterange",
            "listanyrange",
            "listblacklistrange"
        })
        public static class DATE
            implements Serializable
        {

            @XmlElement(name = "ABSOLUTE_RANGE")
            protected DATERANGEType absoluterange;
            @XmlElement(name = "LIST_ANY_RANGE")
            protected List<DATERANGEType> listanyrange;
            @XmlElement(name = "LIST_BLACKLIST_RANGE")
            protected List<DATERANGEType> listblacklistrange;

            /**
             * Gets the value of the absoluterange property.
             * 
             * @return
             *     possible object is
             *     {@link DATERANGEType }
             *     
             */
            public DATERANGEType getABSOLUTERANGE() {
                return absoluterange;
            }

            /**
             * Sets the value of the absoluterange property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATERANGEType }
             *     
             */
            public void setABSOLUTERANGE(DATERANGEType value) {
                this.absoluterange = value;
            }

            /**
             * Gets the value of the listanyrange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listanyrange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTANYRANGE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DATERANGEType }
             * 
             * 
             */
            public List<DATERANGEType> getLISTANYRANGE() {
                if (listanyrange == null) {
                    listanyrange = new ArrayList<DATERANGEType>();
                }
                return this.listanyrange;
            }

            /**
             * Gets the value of the listblacklistrange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listblacklistrange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTBLACKLISTRANGE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DATERANGEType }
             * 
             * 
             */
            public List<DATERANGEType> getLISTBLACKLISTRANGE() {
                if (listblacklistrange == null) {
                    listblacklistrange = new ArrayList<DATERANGEType>();
                }
                return this.listblacklistrange;
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
     *         &lt;element name="LIST_FLIGHT_FACT" type="{}FlightFactType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listflightfact"
    })
    public static class FLIGHTFACTDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_FLIGHT_FACT")
        protected List<FlightFactType> listflightfact;

        /**
         * Gets the value of the listflightfact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listflightfact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFLIGHTFACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightFactType }
         * 
         * 
         */
        public List<FlightFactType> getLISTFLIGHTFACT() {
            if (listflightfact == null) {
                listflightfact = new ArrayList<FlightFactType>();
            }
            return this.listflightfact;
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
     *         &lt;element name="LIST_INFLIGHT_SERVICE" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listinflightservice"
    })
    public static class INFLIGHTSERVICESDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_INFLIGHT_SERVICE")
        protected List<CodeDescriptorType> listinflightservice;

        /**
         * Gets the value of the listinflightservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listinflightservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTINFLIGHTSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeDescriptorType }
         * 
         * 
         */
        public List<CodeDescriptorType> getLISTINFLIGHTSERVICE() {
            if (listinflightservice == null) {
                listinflightservice = new ArrayList<CodeDescriptorType>();
            }
            return this.listinflightservice;
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
     *         &lt;element name="MIN_AVAIL_DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MAX_AVAIL_DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LOCATION" type="{}unprotectedStringType"/&gt;
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
        "minavaildate",
        "maxavaildate",
        "location"
    })
    public static class LISTAVAILABILITYRANGE
        implements Serializable
    {

        @XmlElement(name = "MIN_AVAIL_DATE", required = true)
        protected FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MINAVAILDATE minavaildate;
        @XmlElement(name = "MAX_AVAIL_DATE", required = true)
        protected FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MAXAVAILDATE maxavaildate;
        @XmlElement(name = "LOCATION", required = true)
        protected String location;

        /**
         * Gets the value of the minavaildate property.
         * 
         * @return
         *     possible object is
         *     {@link FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MINAVAILDATE }
         *     
         */
        public FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MINAVAILDATE getMINAVAILDATE() {
            return minavaildate;
        }

        /**
         * Sets the value of the minavaildate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MINAVAILDATE }
         *     
         */
        public void setMINAVAILDATE(FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MINAVAILDATE value) {
            this.minavaildate = value;
        }

        /**
         * Gets the value of the maxavaildate property.
         * 
         * @return
         *     possible object is
         *     {@link FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MAXAVAILDATE }
         *     
         */
        public FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MAXAVAILDATE getMAXAVAILDATE() {
            return maxavaildate;
        }

        /**
         * Sets the value of the maxavaildate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MAXAVAILDATE }
         *     
         */
        public void setMAXAVAILDATE(FlexPricerAvailabilityOutput.LISTAVAILABILITYRANGE.MAXAVAILDATE value) {
            this.maxavaildate = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATION() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATION(String value) {
            this.location = value;
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
        public static class MAXAVAILDATE
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
        public static class MINAVAILDATE
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
     *         &lt;element name="LIST_MEAL_SERVICE" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listmealservice"
    })
    public static class MEALSERVICESDICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_MEAL_SERVICE")
        protected List<CodeDescriptorType> listmealservice;

        /**
         * Gets the value of the listmealservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listmealservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTMEALSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeDescriptorType }
         * 
         * 
         */
        public List<CodeDescriptorType> getLISTMEALSERVICE() {
            if (listmealservice == null) {
                listmealservice = new ArrayList<CodeDescriptorType>();
            }
            return this.listmealservice;
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
     *         &lt;element name="REQUESTED_CRITERIA" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="SITE_CRITERIA" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="APPLIED_CRITERIA" type="{}unprotectedStringType"/&gt;
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
        "requestedcriteria",
        "sitecriteria",
        "appliedcriteria"
    })
    public static class SORTDATA
        implements Serializable
    {

        @XmlElement(name = "REQUESTED_CRITERIA", required = true)
        protected String requestedcriteria;
        @XmlElement(name = "SITE_CRITERIA", required = true)
        protected String sitecriteria;
        @XmlElement(name = "APPLIED_CRITERIA", required = true)
        protected String appliedcriteria;

        /**
         * Gets the value of the requestedcriteria property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTEDCRITERIA() {
            return requestedcriteria;
        }

        /**
         * Sets the value of the requestedcriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTEDCRITERIA(String value) {
            this.requestedcriteria = value;
        }

        /**
         * Gets the value of the sitecriteria property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSITECRITERIA() {
            return sitecriteria;
        }

        /**
         * Sets the value of the sitecriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSITECRITERIA(String value) {
            this.sitecriteria = value;
        }

        /**
         * Gets the value of the appliedcriteria property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPPLIEDCRITERIA() {
            return appliedcriteria;
        }

        /**
         * Sets the value of the appliedcriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPPLIEDCRITERIA(String value) {
            this.appliedcriteria = value;
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
     *     &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TRAVELSPONSOR
        extends LISTFREQUENTFLYERTYPE
        implements Serializable
    {


    }

}
