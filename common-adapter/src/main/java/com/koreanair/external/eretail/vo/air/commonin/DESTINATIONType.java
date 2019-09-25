
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.air.common.FLIGHTPREFERENCEType;


/**
 * <p>Java class for DESTINATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESTINATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}VIA_LOCATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}FLIGHTS_NEEDED" minOccurs="0"/&gt;
 *         &lt;element ref="{}ONLINE_CONNECTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_NON_STOP" minOccurs="0"/&gt;
 *         &lt;element ref="{}ARRANGE_BY" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEVEN_DAY_SEARCH" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALLOW_WAITLIST" minOccurs="0"/&gt;
 *         &lt;element ref="{}TR_FLIGHTS" minOccurs="0"/&gt;
 *         &lt;element ref="{}SHUTTLE_FLIGHTS" minOccurs="0"/&gt;
 *         &lt;element ref="{}SCHEDULE" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_TIME_WINDOW" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALLOW_ALTERNATE_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN_FILTERING" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALTERNATIVE_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}AIRLINE_BIAS" minOccurs="0"/&gt;
 *         &lt;element ref="{}DEFAULT_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}FORCE_RBD" minOccurs="0"/&gt;
 *         &lt;element ref="{}ENGINE_RBD_FILTERING" minOccurs="0"/&gt;
 *         &lt;element ref="{}REDEMPTION_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FLIGHT_PREFERENCE" maxOccurs="6" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_LOCATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_E_LOCATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_DATE"/&gt;
 *         &lt;element ref="{}MINUS_DATE_RANGE" minOccurs="0"/&gt;
 *         &lt;element ref="{}PLUS_DATE_RANGE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LOOKUP_STRATEGY" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_ANY_TIME" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_LOCATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_B_LOCATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FLIGHT_FILTER" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOUND_TO_MODIFY" minOccurs="0"/&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}INFORMATIVE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESTINATION" type="{}LOCATION_Input_Type"/&gt;
 *                   &lt;element ref="{}RBD" minOccurs="0"/&gt;
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
@XmlType(name = "DESTINATION_Type", propOrder = {
    "vialocation",
    "flightsneeded",
    "onlineconnection",
    "directnonstop",
    "arrangeby",
    "sevendaysearch",
    "allowwaitlist",
    "trflights",
    "shuttleflights",
    "schedule",
    "btimewindow",
    "allowalternateavailability",
    "cabin",
    "cabinfiltering",
    "alternativecabin",
    "airlinebias",
    "defaultcabin",
    "forcerbd",
    "enginerbdfiltering",
    "redemptionavailability",
    "listflightpreference",
    "elocation",
    "listelocation",
    "bdate",
    "minusdaterange",
    "plusdaterange",
    "lookupstrategy",
    "banytime",
    "blocation",
    "listblocation",
    "listflightfilter",
    "boundtomodify",
    "itemid",
    "informative",
    "listsegment"
})
public class DESTINATIONType
    implements Serializable
{

    @XmlElement(name = "VIA_LOCATION")
    protected String vialocation;
    @XmlElement(name = "FLIGHTS_NEEDED")
    protected BigInteger flightsneeded;
    @XmlElement(name = "ONLINE_CONNECTION")
    protected Boolean onlineconnection;
    @XmlElement(name = "DIRECT_NON_STOP")
    protected Boolean directnonstop;
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
    @XmlElement(name = "CABIN_FILTERING")
    protected Boolean cabinfiltering;
    @XmlElement(name = "ALTERNATIVE_CABIN")
    protected Boolean alternativecabin;
    @XmlElement(name = "AIRLINE_BIAS")
    protected String airlinebias;
    @XmlElement(name = "DEFAULT_CABIN")
    protected String defaultcabin;
    @XmlElement(name = "FORCE_RBD")
    protected Boolean forcerbd;
    @XmlElement(name = "ENGINE_RBD_FILTERING")
    protected Boolean enginerbdfiltering;
    @XmlElement(name = "REDEMPTION_AVAILABILITY")
    protected Boolean redemptionavailability;
    @XmlElement(name = "LIST_FLIGHT_PREFERENCE")
    protected List<FLIGHTPREFERENCEType> listflightpreference;
    @XmlElement(name = "E_LOCATION")
    protected String elocation;
    @XmlElement(name = "LIST_E_LOCATION")
    protected List<LISTLOCATIONType> listelocation;
    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "MINUS_DATE_RANGE")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minusdaterange;
    @XmlElement(name = "PLUS_DATE_RANGE")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger plusdaterange;
    @XmlElement(name = "LOOKUP_STRATEGY")
    protected String lookupstrategy;
    @XmlElement(name = "B_ANY_TIME")
    protected Boolean banytime;
    @XmlElement(name = "B_LOCATION")
    protected String blocation;
    @XmlElement(name = "LIST_B_LOCATION")
    protected List<LISTLOCATIONType> listblocation;
    @XmlElement(name = "LIST_FLIGHT_FILTER")
    protected List<LISTFLIGHTFILTER> listflightfilter;
    @XmlElement(name = "BOUND_TO_MODIFY")
    protected Boolean boundtomodify;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "INFORMATIVE")
    protected Boolean informative;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<DESTINATIONType.LISTSEGMENT> listsegment;

    /**
     * Gets the value of the vialocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIALOCATION() {
        return vialocation;
    }

    /**
     * Sets the value of the vialocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIALOCATION(String value) {
        this.vialocation = value;
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
     * Gets the value of the cabinfiltering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCABINFILTERING() {
        return cabinfiltering;
    }

    /**
     * Sets the value of the cabinfiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCABINFILTERING(Boolean value) {
        this.cabinfiltering = value;
    }

    /**
     * Gets the value of the alternativecabin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALTERNATIVECABIN() {
        return alternativecabin;
    }

    /**
     * Sets the value of the alternativecabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALTERNATIVECABIN(Boolean value) {
        this.alternativecabin = value;
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
     * Gets the value of the forcerbd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCERBD() {
        return forcerbd;
    }

    /**
     * Sets the value of the forcerbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCERBD(Boolean value) {
        this.forcerbd = value;
    }

    /**
     * Gets the value of the enginerbdfiltering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isENGINERBDFILTERING() {
        return enginerbdfiltering;
    }

    /**
     * Sets the value of the enginerbdfiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setENGINERBDFILTERING(Boolean value) {
        this.enginerbdfiltering = value;
    }

    /**
     * Gets the value of the redemptionavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREDEMPTIONAVAILABILITY() {
        return redemptionavailability;
    }

    /**
     * Sets the value of the redemptionavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREDEMPTIONAVAILABILITY(Boolean value) {
        this.redemptionavailability = value;
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
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELOCATION(String value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the listelocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTLOCATIONType }
     * 
     * 
     */
    public List<LISTLOCATIONType> getLISTELOCATION() {
        if (listelocation == null) {
            listelocation = new ArrayList<LISTLOCATIONType>();
        }
        return this.listelocation;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the minusdaterange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINUSDATERANGE() {
        return minusdaterange;
    }

    /**
     * Sets the value of the minusdaterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINUSDATERANGE(BigInteger value) {
        this.minusdaterange = value;
    }

    /**
     * Gets the value of the plusdaterange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPLUSDATERANGE() {
        return plusdaterange;
    }

    /**
     * Sets the value of the plusdaterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPLUSDATERANGE(BigInteger value) {
        this.plusdaterange = value;
    }

    /**
     * Gets the value of the lookupstrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOOKUPSTRATEGY() {
        return lookupstrategy;
    }

    /**
     * Sets the value of the lookupstrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOOKUPSTRATEGY(String value) {
        this.lookupstrategy = value;
    }

    /**
     * Gets the value of the banytime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBANYTIME() {
        return banytime;
    }

    /**
     * Sets the value of the banytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBANYTIME(Boolean value) {
        this.banytime = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCATION(String value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the listblocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listblocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBLOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTLOCATIONType }
     * 
     * 
     */
    public List<LISTLOCATIONType> getLISTBLOCATION() {
        if (listblocation == null) {
            listblocation = new ArrayList<LISTLOCATIONType>();
        }
        return this.listblocation;
    }

    /**
     * Gets the value of the listflightfilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightfilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTFILTER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFLIGHTFILTER }
     * 
     * 
     */
    public List<LISTFLIGHTFILTER> getLISTFLIGHTFILTER() {
        if (listflightfilter == null) {
            listflightfilter = new ArrayList<LISTFLIGHTFILTER>();
        }
        return this.listflightfilter;
    }

    /**
     * Gets the value of the boundtomodify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOUNDTOMODIFY() {
        return boundtomodify;
    }

    /**
     * Sets the value of the boundtomodify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOUNDTOMODIFY(Boolean value) {
        this.boundtomodify = value;
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
     * Gets the value of the informative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINFORMATIVE() {
        return informative;
    }

    /**
     * Sets the value of the informative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINFORMATIVE(Boolean value) {
        this.informative = value;
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
     * {@link DESTINATIONType.LISTSEGMENT }
     * 
     * 
     */
    public List<DESTINATIONType.LISTSEGMENT> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<DESTINATIONType.LISTSEGMENT>();
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
     *         &lt;element name="DESTINATION" type="{}LOCATION_Input_Type"/&gt;
     *         &lt;element ref="{}RBD" minOccurs="0"/&gt;
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
        "destination",
        "rbd"
    })
    public static class LISTSEGMENT
        implements Serializable
    {

        @XmlElement(name = "DESTINATION", required = true)
        protected String destination;
        @XmlElement(name = "RBD")
        protected String rbd;

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESTINATION() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESTINATION(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the rbd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBD() {
            return rbd;
        }

        /**
         * Sets the value of the rbd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBD(String value) {
            this.rbd = value;
        }

    }

}
