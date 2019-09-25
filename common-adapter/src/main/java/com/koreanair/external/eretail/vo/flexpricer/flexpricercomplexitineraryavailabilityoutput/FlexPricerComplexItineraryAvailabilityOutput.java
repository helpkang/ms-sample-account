
package com.koreanair.external.eretail.vo.flexpricer.flexpricercomplexitineraryavailabilityoutput;

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
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;
import com.koreanair.external.eretail.vo.common.common.FlightFactType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
import com.koreanair.external.eretail.vo.farecommon.farecommon.SERVICELEVELDICTIONARYType;
import com.koreanair.external.eretail.vo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.FFCFFDictionaryMapping;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTSERVICEFEESGROUPType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListPanelType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListRecommendationGroupType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.SearchDataType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTFREQUENTFLYERTYPE;
import com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput.BOOKEDTRIPType;


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
 *         &lt;element ref="{}PAGE_TICKET"/&gt;
 *         &lt;element ref="{}FLOW_SIGNATURE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PANEL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRIP_ELEMENT" type="{}LIST_TRIP_ELEMENT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NUM_ELEMENTS_REQUESTED" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEARCH_DATA"/&gt;
 *         &lt;element name="BOOKED_TRIP" type="{}BOOKED_TRIP_Type" minOccurs="0"/&gt;
 *         &lt;element name="INITIAL_RECOMMENDATION" type="{}ListRecommendationGroupType" minOccurs="0"/&gt;
 *         &lt;element name="PREVIOUS_RECOMMENDATION" type="{}ListRecommendationGroupType" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_LEVEL_DICTIONARY" type="{}SERVICE_LEVEL_DICTIONARY_Type" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY_DICTIONARY" type="{}FFCFFDictionaryMapping" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE_FEES_GROUP" type="{}LIST_SERVICE_FEES_GROUP_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="MEAL_SERVICES_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_MEAL_SERVICE" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INFLIGHT_SERVICES_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_INFLIGHT_SERVICE" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ALLIANCE_DICTIONARY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_ALLIANCE" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pageticket",
    "flowsignature",
    "listmsg",
    "listpanel",
    "listtripelement",
    "numelementsrequested",
    "searchdata",
    "bookedtrip",
    "initialrecommendation",
    "previousrecommendation",
    "serviceleveldictionary",
    "farefamilydictionary",
    "listservicefeesgroup",
    "flightfactdictionary",
    "mealservicesdictionary",
    "inflightservicesdictionary",
    "alliancedictionary",
    "travelsponsor"
})
@XmlRootElement(name = "FlexPricerComplexItineraryAvailabilityOutput")
public class FlexPricerComplexItineraryAvailabilityOutput
    implements Serializable
{

    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "FLOW_SIGNATURE")
    protected FLOWSIGNATUREType flowsignature;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_PANEL")
    protected List<ListPanelType> listpanel;
    @XmlElement(name = "LIST_TRIP_ELEMENT")
    protected List<LISTTRIPELEMENTType> listtripelement;
    @XmlElement(name = "NUM_ELEMENTS_REQUESTED")
    protected BigInteger numelementsrequested;
    @XmlElement(name = "SEARCH_DATA", required = true)
    protected SearchDataType searchdata;
    @XmlElement(name = "BOOKED_TRIP")
    protected BOOKEDTRIPType bookedtrip;
    @XmlElement(name = "INITIAL_RECOMMENDATION")
    protected ListRecommendationGroupType initialrecommendation;
    @XmlElement(name = "PREVIOUS_RECOMMENDATION")
    protected ListRecommendationGroupType previousrecommendation;
    @XmlElement(name = "SERVICE_LEVEL_DICTIONARY")
    protected SERVICELEVELDICTIONARYType serviceleveldictionary;
    @XmlElement(name = "FARE_FAMILY_DICTIONARY")
    protected FFCFFDictionaryMapping farefamilydictionary;
    @XmlElement(name = "LIST_SERVICE_FEES_GROUP")
    protected List<LISTSERVICEFEESGROUPType> listservicefeesgroup;
    @XmlElement(name = "FLIGHT_FACT_DICTIONARY")
    protected FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY flightfactdictionary;
    @XmlElement(name = "MEAL_SERVICES_DICTIONARY")
    protected FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY mealservicesdictionary;
    @XmlElement(name = "INFLIGHT_SERVICES_DICTIONARY")
    protected FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY inflightservicesdictionary;
    @XmlElement(name = "ALLIANCE_DICTIONARY")
    protected FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY alliancedictionary;
    @XmlElement(name = "TRAVEL_SPONSOR")
    protected FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR travelsponsor;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the listtripelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRIPELEMENTType }
     * 
     * 
     */
    public List<LISTTRIPELEMENTType> getLISTTRIPELEMENT() {
        if (listtripelement == null) {
            listtripelement = new ArrayList<LISTTRIPELEMENTType>();
        }
        return this.listtripelement;
    }

    /**
     * Gets the value of the numelementsrequested property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMELEMENTSREQUESTED() {
        return numelementsrequested;
    }

    /**
     * Sets the value of the numelementsrequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMELEMENTSREQUESTED(BigInteger value) {
        this.numelementsrequested = value;
    }

    /**
     * Search data for the whole requested itinerary. Currently only available in complex itinerary flow (one shot mode, M trip type), in other flows the same data can be found under each LIST_PANEL element.
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
     * Gets the value of the bookedtrip property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDTRIPType }
     *     
     */
    public BOOKEDTRIPType getBOOKEDTRIP() {
        return bookedtrip;
    }

    /**
     * Sets the value of the bookedtrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDTRIPType }
     *     
     */
    public void setBOOKEDTRIP(BOOKEDTRIPType value) {
        this.bookedtrip = value;
    }

    /**
     * Gets the value of the initialrecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link ListRecommendationGroupType }
     *     
     */
    public ListRecommendationGroupType getINITIALRECOMMENDATION() {
        return initialrecommendation;
    }

    /**
     * Sets the value of the initialrecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRecommendationGroupType }
     *     
     */
    public void setINITIALRECOMMENDATION(ListRecommendationGroupType value) {
        this.initialrecommendation = value;
    }

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
     * Gets the value of the serviceleveldictionary property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICELEVELDICTIONARYType }
     *     
     */
    public SERVICELEVELDICTIONARYType getSERVICELEVELDICTIONARY() {
        return serviceleveldictionary;
    }

    /**
     * Sets the value of the serviceleveldictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICELEVELDICTIONARYType }
     *     
     */
    public void setSERVICELEVELDICTIONARY(SERVICELEVELDICTIONARYType value) {
        this.serviceleveldictionary = value;
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
     * Gets the value of the flightfactdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY }
     *     
     */
    public FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY getFLIGHTFACTDICTIONARY() {
        return flightfactdictionary;
    }

    /**
     * Sets the value of the flightfactdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY }
     *     
     */
    public void setFLIGHTFACTDICTIONARY(FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY value) {
        this.flightfactdictionary = value;
    }

    /**
     * Gets the value of the mealservicesdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY }
     *     
     */
    public FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY getMEALSERVICESDICTIONARY() {
        return mealservicesdictionary;
    }

    /**
     * Sets the value of the mealservicesdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY }
     *     
     */
    public void setMEALSERVICESDICTIONARY(FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY value) {
        this.mealservicesdictionary = value;
    }

    /**
     * Gets the value of the inflightservicesdictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY }
     *     
     */
    public FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY getINFLIGHTSERVICESDICTIONARY() {
        return inflightservicesdictionary;
    }

    /**
     * Sets the value of the inflightservicesdictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY }
     *     
     */
    public void setINFLIGHTSERVICESDICTIONARY(FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY value) {
        this.inflightservicesdictionary = value;
    }

    /**
     * Gets the value of the alliancedictionary property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY }
     *     
     */
    public FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY getALLIANCEDICTIONARY() {
        return alliancedictionary;
    }

    /**
     * Sets the value of the alliancedictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY }
     *     
     */
    public void setALLIANCEDICTIONARY(FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY value) {
        this.alliancedictionary = value;
    }

    /**
     * Gets the value of the travelsponsor property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR }
     *     
     */
    public FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR getTRAVELSPONSOR() {
        return travelsponsor;
    }

    /**
     * Sets the value of the travelsponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR }
     *     
     */
    public void setTRAVELSPONSOR(FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR value) {
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
