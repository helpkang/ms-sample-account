
package com.koreanair.eretail.pojo.air.selectflightandcontinueoutputerrorcomplexsearchpage;

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
import com.koreanair.eretail.pojo.air.common.FLIGHTPREFERENCEType;
import com.koreanair.eretail.pojo.air.commonout.CABINType;
import com.koreanair.eretail.pojo.air.commonout.CARDType;
import com.koreanair.eretail.pojo.air.commonout.DESTINATIONOUTPUTType;
import com.koreanair.eretail.pojo.air.commonout.TRAVELLERType;
import com.koreanair.eretail.pojo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.eretail.pojo.common.common.APISRULESTYPE;
import com.koreanair.eretail.pojo.common.common.LISTMSG;


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
 *         &lt;element ref="{}PAGE_TICKET" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_DISCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FLIGHT_PREFERENCE" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESTINATION" type="{}DESTINATION_OUTPUT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRIP_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FIELD_ERROR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}FLIGHTS_NEEDED" minOccurs="0"/&gt;
 *         &lt;element ref="{}ONLINE_CONNECTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_NON_STOP" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_SEARCH" minOccurs="0"/&gt;
 *         &lt;element ref="{}ARRANGE_BY" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEVEN_DAY_SEARCH" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALLOW_WAITLIST" minOccurs="0"/&gt;
 *         &lt;element ref="{}TR_FLIGHTS" minOccurs="0"/&gt;
 *         &lt;element ref="{}SHUTTLE_FLIGHTS" minOccurs="0"/&gt;
 *         &lt;element ref="{}SCHEDULE" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_TIME_WINDOW" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALLOW_ALTERNATE_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}AIRLINE_BIAS" minOccurs="0"/&gt;
 *         &lt;element ref="{}DEFAULT_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ALLOWED_CABIN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonOutputGroup"/&gt;
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
    "listdiscountcard",
    "listtraveller",
    "listflightpreference",
    "listdestination",
    "triptype",
    "listmsg",
    "listfielderror",
    "flightsneeded",
    "onlineconnection",
    "directnonstop",
    "directsearch",
    "arrangeby",
    "sevendaysearch",
    "allowwaitlist",
    "trflights",
    "shuttleflights",
    "schedule",
    "btimewindow",
    "allowalternateavailability",
    "cabin",
    "airlinebias",
    "defaultcabin",
    "listallowedcabin",
    "listexternalid",
    "frompage",
    "apismanageroutput",
    "apisrules",
    "apiscollectionmode"
})
@XmlRootElement(name = "SelectFlightAndContinueOutputErrorComplexSearchPage")
public class SelectFlightAndContinueOutputErrorComplexSearchPage
    implements Serializable
{

    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "LIST_DISCOUNT_CARD")
    protected List<CARDType> listdiscountcard;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TRAVELLERType> listtraveller;
    @XmlElement(name = "LIST_FLIGHT_PREFERENCE")
    protected List<FLIGHTPREFERENCEType> listflightpreference;
    @XmlElement(name = "LIST_DESTINATION")
    protected List<DESTINATIONOUTPUTType> listdestination;
    @XmlElement(name = "TRIP_TYPE")
    protected String triptype;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_FIELD_ERROR")
    protected List<String> listfielderror;
    @XmlElement(name = "FLIGHTS_NEEDED")
    protected BigInteger flightsneeded;
    @XmlElement(name = "ONLINE_CONNECTION")
    protected Boolean onlineconnection;
    @XmlElement(name = "DIRECT_NON_STOP")
    protected Boolean directnonstop;
    @XmlElement(name = "DIRECT_SEARCH")
    protected Boolean directsearch;
    @XmlElement(name = "ARRANGE_BY")
    protected String arrangeby;
    @XmlElement(name = "SEVEN_DAY_SEARCH")
    protected Boolean sevendaysearch;
    @XmlElement(name = "ALLOW_WAITLIST")
    protected Boolean allowwaitlist;
    @XmlElement(name = "TR_FLIGHTS")
    protected Boolean trflights;
    @XmlElement(name = "SHUTTLE_FLIGHTS")
    protected Boolean shuttleflights;
    @XmlElement(name = "SCHEDULE")
    protected Boolean schedule;
    @XmlElement(name = "B_TIME_WINDOW")
    protected BigInteger btimewindow;
    @XmlElement(name = "ALLOW_ALTERNATE_AVAILABILITY")
    protected Boolean allowalternateavailability;
    @XmlElement(name = "CABIN")
    protected String cabin;
    @XmlElement(name = "AIRLINE_BIAS")
    protected String airlinebias;
    @XmlElement(name = "DEFAULT_CABIN")
    protected String defaultcabin;
    @XmlElement(name = "LIST_ALLOWED_CABIN")
    protected List<CABINType> listallowedcabin;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<Object> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "APIS_MANAGER_OUTPUT")
    protected APISMANAGEROUTPUTTYPE apismanageroutput;
    @XmlElement(name = "APIS_RULES")
    protected APISRULESTYPE apisrules;
    @XmlElement(name = "APIS_COLLECTION_MODE")
    protected Object apiscollectionmode;
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
     * Gets the value of the listdiscountcard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscountcard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTCARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CARDType }
     * 
     * 
     */
    public List<CARDType> getLISTDISCOUNTCARD() {
        if (listdiscountcard == null) {
            listdiscountcard = new ArrayList<CARDType>();
        }
        return this.listdiscountcard;
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
     * {@link TRAVELLERType }
     * 
     * 
     */
    public List<TRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the listflightpreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightpreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTPREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLIGHTPREFERENCEType }
     * 
     * 
     */
    public List<FLIGHTPREFERENCEType> getLISTFLIGHTPREFERENCE() {
        if (listflightpreference == null) {
            listflightpreference = new ArrayList<FLIGHTPREFERENCEType>();
        }
        return this.listflightpreference;
    }

    /**
     * Gets the value of the listdestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESTINATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESTINATIONOUTPUTType }
     * 
     * 
     */
    public List<DESTINATIONOUTPUTType> getLISTDESTINATION() {
        if (listdestination == null) {
            listdestination = new ArrayList<DESTINATIONOUTPUTType>();
        }
        return this.listdestination;
    }

    /**
     * Gets the value of the triptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIPTYPE() {
        return triptype;
    }

    /**
     * Sets the value of the triptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIPTYPE(String value) {
        this.triptype = value;
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
     * Gets the value of the listfielderror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfielderror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFIELDERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFIELDERROR() {
        if (listfielderror == null) {
            listfielderror = new ArrayList<String>();
        }
        return this.listfielderror;
    }

    /**
     * Gets the value of the flightsneeded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLIGHTSNEEDED() {
        return flightsneeded;
    }

    /**
     * Sets the value of the flightsneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLIGHTSNEEDED(BigInteger value) {
        this.flightsneeded = value;
    }

    /**
     * Gets the value of the onlineconnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isONLINECONNECTION() {
        return onlineconnection;
    }

    /**
     * Sets the value of the onlineconnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setONLINECONNECTION(Boolean value) {
        this.onlineconnection = value;
    }

    /**
     * Gets the value of the directnonstop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIRECTNONSTOP() {
        return directnonstop;
    }

    /**
     * Sets the value of the directnonstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIRECTNONSTOP(Boolean value) {
        this.directnonstop = value;
    }

    /**
     * Gets the value of the directsearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIRECTSEARCH() {
        return directsearch;
    }

    /**
     * Sets the value of the directsearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIRECTSEARCH(Boolean value) {
        this.directsearch = value;
    }

    /**
     * Gets the value of the arrangeby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARRANGEBY() {
        return arrangeby;
    }

    /**
     * Sets the value of the arrangeby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARRANGEBY(String value) {
        this.arrangeby = value;
    }

    /**
     * Gets the value of the sevendaysearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSEVENDAYSEARCH() {
        return sevendaysearch;
    }

    /**
     * Sets the value of the sevendaysearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSEVENDAYSEARCH(Boolean value) {
        this.sevendaysearch = value;
    }

    /**
     * Gets the value of the allowwaitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWWAITLIST() {
        return allowwaitlist;
    }

    /**
     * Sets the value of the allowwaitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWWAITLIST(Boolean value) {
        this.allowwaitlist = value;
    }

    /**
     * Gets the value of the trflights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTRFLIGHTS() {
        return trflights;
    }

    /**
     * Sets the value of the trflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTRFLIGHTS(Boolean value) {
        this.trflights = value;
    }

    /**
     * Gets the value of the shuttleflights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSHUTTLEFLIGHTS() {
        return shuttleflights;
    }

    /**
     * Sets the value of the shuttleflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSHUTTLEFLIGHTS(Boolean value) {
        this.shuttleflights = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSCHEDULE() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSCHEDULE(Boolean value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the btimewindow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBTIMEWINDOW() {
        return btimewindow;
    }

    /**
     * Sets the value of the btimewindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBTIMEWINDOW(BigInteger value) {
        this.btimewindow = value;
    }

    /**
     * Gets the value of the allowalternateavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWALTERNATEAVAILABILITY() {
        return allowalternateavailability;
    }

    /**
     * Sets the value of the allowalternateavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWALTERNATEAVAILABILITY(Boolean value) {
        this.allowalternateavailability = value;
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
     * Gets the value of the airlinebias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINEBIAS() {
        return airlinebias;
    }

    /**
     * Sets the value of the airlinebias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINEBIAS(String value) {
        this.airlinebias = value;
    }

    /**
     * Gets the value of the defaultcabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTCABIN() {
        return defaultcabin;
    }

    /**
     * Sets the value of the defaultcabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTCABIN(String value) {
        this.defaultcabin = value;
    }

    /**
     * Gets the value of the listallowedcabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listallowedcabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTALLOWEDCABIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CABINType }
     * 
     * 
     */
    public List<CABINType> getLISTALLOWEDCABIN() {
        if (listallowedcabin == null) {
            listallowedcabin = new ArrayList<CABINType>();
        }
        return this.listallowedcabin;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<Object>();
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
     * Gets the value of the apismanageroutput property.
     * 
     * @return
     *     possible object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public APISMANAGEROUTPUTTYPE getAPISMANAGEROUTPUT() {
        return apismanageroutput;
    }

    /**
     * Sets the value of the apismanageroutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public void setAPISMANAGEROUTPUT(APISMANAGEROUTPUTTYPE value) {
        this.apismanageroutput = value;
    }

    /**
     * Gets the value of the apisrules property.
     * 
     * @return
     *     possible object is
     *     {@link APISRULESTYPE }
     *     
     */
    public APISRULESTYPE getAPISRULES() {
        return apisrules;
    }

    /**
     * Sets the value of the apisrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRULESTYPE }
     *     
     */
    public void setAPISRULES(APISRULESTYPE value) {
        this.apisrules = value;
    }

    /**
     * Gets the value of the apiscollectionmode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCOLLECTIONMODE() {
        return apiscollectionmode;
    }

    /**
     * Sets the value of the apiscollectionmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCOLLECTIONMODE(Object value) {
        this.apiscollectionmode = value;
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

}
