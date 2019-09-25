
package com.koreanair.eretail.pojo.air.commonin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.air.common.FLIGHTPREFERENCEType;


/**
 * <p>Java class for SEARCH_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEARCH_DATA_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B_DATE" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_ANY_TIME" minOccurs="0"/&gt;
 *         &lt;element name="E_LOCATION" type="{}LOCATION_Type"/&gt;
 *         &lt;element name="B_LOCATION" type="{}LOCATION_Type"/&gt;
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
 *         &lt;element ref="{}LIST_FLIGHT_PREFERENCE" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEARCH_DATA_Type", propOrder = {
    "bdate",
    "banytime",
    "elocation",
    "blocation",
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
    "listflightpreference"
})
public class SEARCHDATAType
    implements Serializable
{

    @XmlElement(name = "B_DATE")
    protected String bdate;
    @XmlElement(name = "B_ANY_TIME")
    protected Boolean banytime;
    @XmlElement(name = "E_LOCATION", required = true)
    protected LOCATIONType elocation;
    @XmlElement(name = "B_LOCATION", required = true)
    protected LOCATIONType blocation;
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
    @XmlElement(name = "LIST_FLIGHT_PREFERENCE")
    protected List<FLIGHTPREFERENCEType> listflightpreference;

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

}
