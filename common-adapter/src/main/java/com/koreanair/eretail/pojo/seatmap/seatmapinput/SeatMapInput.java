
package com.koreanair.eretail.pojo.seatmap.seatmapinput;

import java.io.Serializable;
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
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.tripplan.traveller_information.TRAVELLERINFORMATION;


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
 *         &lt;element name="SITE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LANGUAGE" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}IS_STRUCTURED_XML" minOccurs="0"/&gt;
 *         &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FLIGHT" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_AIRPORT_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="E_AIRPORT_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FARE_BASIS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_CLASS" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_DATE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="OUTPUT_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PASSENGER_SELECTION" type="{}unprotectedStringType" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
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
    "site",
    "language",
    "isstructuredxml",
    "action",
    "airlinecode",
    "flight",
    "bairportcode",
    "eairportcode",
    "farebasis",
    "bookingclass",
    "bdate",
    "btime",
    "etime",
    "currency",
    "equipmenttype",
    "outputtype",
    "recloc",
    "travellerinformation",
    "listpassengerselection",
    "listexternalid",
    "frompage",
    "requestinfo",
    "cleanoverrideonsiteswitch",
    "apischeckview",
    "apischeckcategory",
    "apischeckmandatory",
    "apischeckoptional",
    "apischeckstructure",
    "apischeckstructurepassenger"
})
@XmlRootElement(name = "SeatMapInput")
public class SeatMapInput
    implements Serializable
{

    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "AIRLINE_CODE", required = true)
    protected String airlinecode;
    @XmlElement(name = "FLIGHT", required = true)
    protected String flight;
    @XmlElement(name = "B_AIRPORT_CODE", required = true)
    protected String bairportcode;
    @XmlElement(name = "E_AIRPORT_CODE", required = true)
    protected String eairportcode;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "BOOKING_CLASS", required = true)
    protected String bookingclass;
    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "B_TIME")
    protected String btime;
    @XmlElement(name = "E_TIME")
    protected String etime;
    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "EQUIPMENT_TYPE")
    protected String equipmenttype;
    @XmlElement(name = "OUTPUT_TYPE")
    protected String outputtype;
    @XmlElement(name = "REC_LOC")
    protected String recloc;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "LIST_PASSENGER_SELECTION")
    protected List<String> listpassengerselection;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected SeatMapInput.REQUESTINFO requestinfo;
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
    protected List<SeatMapInput.APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
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

    /**
     * Gets the value of the airlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINECODE() {
        return airlinecode;
    }

    /**
     * Sets the value of the airlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINECODE(String value) {
        this.airlinecode = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHT() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHT(String value) {
        this.flight = value;
    }

    /**
     * Gets the value of the bairportcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAIRPORTCODE() {
        return bairportcode;
    }

    /**
     * Sets the value of the bairportcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAIRPORTCODE(String value) {
        this.bairportcode = value;
    }

    /**
     * Gets the value of the eairportcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAIRPORTCODE() {
        return eairportcode;
    }

    /**
     * Sets the value of the eairportcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAIRPORTCODE(String value) {
        this.eairportcode = value;
    }

    /**
     * Gets the value of the farebasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBASIS() {
        return farebasis;
    }

    /**
     * Sets the value of the farebasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBASIS(String value) {
        this.farebasis = value;
    }

    /**
     * Gets the value of the bookingclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGCLASS() {
        return bookingclass;
    }

    /**
     * Sets the value of the bookingclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGCLASS(String value) {
        this.bookingclass = value;
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
     * Gets the value of the btime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTIME() {
        return btime;
    }

    /**
     * Sets the value of the btime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTIME(String value) {
        this.btime = value;
    }

    /**
     * Gets the value of the etime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETIME() {
        return etime;
    }

    /**
     * Sets the value of the etime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETIME(String value) {
        this.etime = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCURRENCY(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the equipmenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQUIPMENTTYPE() {
        return equipmenttype;
    }

    /**
     * Sets the value of the equipmenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQUIPMENTTYPE(String value) {
        this.equipmenttype = value;
    }

    /**
     * Gets the value of the outputtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTPUTTYPE() {
        return outputtype;
    }

    /**
     * Sets the value of the outputtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTPUTTYPE(String value) {
        this.outputtype = value;
    }

    /**
     * Gets the value of the recloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECLOC() {
        return recloc;
    }

    /**
     * Sets the value of the recloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECLOC(String value) {
        this.recloc = value;
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
     * Gets the value of the listpassengerselection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpassengerselection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPASSENGERSELECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTPASSENGERSELECTION() {
        if (listpassengerselection == null) {
            listpassengerselection = new ArrayList<String>();
        }
        return this.listpassengerselection;
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
     *     {@link SeatMapInput.REQUESTINFO }
     *     
     */
    public SeatMapInput.REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatMapInput.REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(SeatMapInput.REQUESTINFO value) {
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
     * {@link SeatMapInput.APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<SeatMapInput.APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<SeatMapInput.APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
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
