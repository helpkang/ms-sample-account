
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTPROMOTIONINFOType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.FAREFAMILYFareType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.LISTITINERARYType;
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTAPPLIEDPRICINGOPTIONSType;


/**
 * <p>Java class for TRIP_FARE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRIP_FARE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TICKETING_TIME_LIMIT"/&gt;
 *         &lt;element ref="{}PENDING_TIME_LIMIT" minOccurs="0"/&gt;
 *         &lt;element name="ON_HOLD_INFORMATION" type="{}ON_HOLD_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_ITINERARY" type="{}LIST_ITINERARY_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_BOOKED_ITINERARY" type="{}LIST_ITINERARY_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_APPLICABLE_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TRIP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MOD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_CATEGORY" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_FLAG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_APPLIED_FARE_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_REDEMPTION_REMARK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}VALIDATING_CARRIER" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_DESIGNATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PRICING_OPTIONS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_LEVEL_SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROMOTION_INFO" type="{}LIST_PROMOTION_INFO_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RESULTING_FARE_FAMILY" type="{}FARE_FAMILY_FareType" minOccurs="0"/&gt;
 *         &lt;element name="REFERENCE_PNR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RECORD_LOCATOR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}DICTIONARY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRIP_FARE_Type", propOrder = {
    "listpnr",
    "ticketingtimelimit",
    "pendingtimelimit",
    "onholdinformation",
    "listtripprice",
    "listitinerary",
    "listbookeditinerary",
    "listapplicablefee",
    "tickettype",
    "triptype",
    "listmod",
    "farecategory",
    "listfareflag",
    "listappliedfarediscount",
    "listredemptionremark",
    "validatingcarrier",
    "ticketdesignator",
    "listpricingoptions",
    "servicelevelshortname",
    "listpromotioninfo",
    "resultingfarefamily",
    "referencepnr",
    "dictionary"
})
@XmlSeeAlso({
    FareOutputType.class
})
public class TRIPFAREType
    implements Serializable
{

    @XmlElement(name = "LIST_PNR", required = true)
    protected List<LISTPNRType> listpnr;
    @XmlElement(name = "TICKETING_TIME_LIMIT", required = true)
    protected TICKETINGTIMELIMIT ticketingtimelimit;
    @XmlElement(name = "PENDING_TIME_LIMIT")
    protected PENDINGTIMELIMIT pendingtimelimit;
    @XmlElement(name = "ON_HOLD_INFORMATION")
    protected ONHOLDINFORMATIONType onholdinformation;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<LISTTRIPPRICE> listtripprice;
    @XmlElement(name = "LIST_ITINERARY", required = true)
    protected List<LISTITINERARYType> listitinerary;
    @XmlElement(name = "LIST_BOOKED_ITINERARY")
    protected List<LISTITINERARYType> listbookeditinerary;
    @XmlElement(name = "LIST_APPLICABLE_FEE")
    protected List<APPLICABLEFEEType> listapplicablefee;
    @XmlElement(name = "TICKET_TYPE")
    protected TICKETTYPEType tickettype;
    @XmlElement(name = "TRIP_TYPE")
    protected String triptype;
    @XmlElement(name = "LIST_MOD")
    protected List<MODType> listmod;
    @XmlElement(name = "FARE_CATEGORY")
    protected String farecategory;
    @XmlElement(name = "LIST_FARE_FLAG")
    protected List<FAREFLAGType> listfareflag;
    @XmlElement(name = "LIST_APPLIED_FARE_DISCOUNT")
    protected List<LISTAPPLIEDFAREDISCOUNT> listappliedfarediscount;
    @XmlElement(name = "LIST_REDEMPTION_REMARK")
    protected List<String> listredemptionremark;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected String validatingcarrier;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<LISTAPPLIEDPRICINGOPTIONSType> listpricingoptions;
    @XmlElement(name = "SERVICE_LEVEL_SHORT_NAME")
    protected String servicelevelshortname;
    @XmlElement(name = "LIST_PROMOTION_INFO")
    protected List<LISTPROMOTIONINFOType> listpromotioninfo;
    @XmlElement(name = "RESULTING_FARE_FAMILY")
    protected FAREFAMILYFareType resultingfarefamily;
    @XmlElement(name = "REFERENCE_PNR")
    protected TRIPFAREType.REFERENCEPNR referencepnr;
    @XmlElement(name = "DICTIONARY")
    protected DICTIONARY dictionary;

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
     * {@link LISTPNRType }
     * 
     * 
     */
    public List<LISTPNRType> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<LISTPNRType>();
        }
        return this.listpnr;
    }

    /**
     * Gets the value of the ticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link TICKETINGTIMELIMIT }
     *     
     */
    public TICKETINGTIMELIMIT getTICKETINGTIMELIMIT() {
        return ticketingtimelimit;
    }

    /**
     * Sets the value of the ticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TICKETINGTIMELIMIT }
     *     
     */
    public void setTICKETINGTIMELIMIT(TICKETINGTIMELIMIT value) {
        this.ticketingtimelimit = value;
    }

    /**
     * Gets the value of the pendingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link PENDINGTIMELIMIT }
     *     
     */
    public PENDINGTIMELIMIT getPENDINGTIMELIMIT() {
        return pendingtimelimit;
    }

    /**
     * Sets the value of the pendingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PENDINGTIMELIMIT }
     *     
     */
    public void setPENDINGTIMELIMIT(PENDINGTIMELIMIT value) {
        this.pendingtimelimit = value;
    }

    /**
     * Gets the value of the onholdinformation property.
     * 
     * @return
     *     possible object is
     *     {@link ONHOLDINFORMATIONType }
     *     
     */
    public ONHOLDINFORMATIONType getONHOLDINFORMATION() {
        return onholdinformation;
    }

    /**
     * Sets the value of the onholdinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONHOLDINFORMATIONType }
     *     
     */
    public void setONHOLDINFORMATION(ONHOLDINFORMATIONType value) {
        this.onholdinformation = value;
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
     * {@link LISTTRIPPRICE }
     * 
     * 
     */
    public List<LISTTRIPPRICE> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<LISTTRIPPRICE>();
        }
        return this.listtripprice;
    }

    /**
     * Gets the value of the listitinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARYType }
     * 
     * 
     */
    public List<LISTITINERARYType> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<LISTITINERARYType>();
        }
        return this.listitinerary;
    }

    /**
     * Gets the value of the listbookeditinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbookeditinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOOKEDITINERARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARYType }
     * 
     * 
     */
    public List<LISTITINERARYType> getLISTBOOKEDITINERARY() {
        if (listbookeditinerary == null) {
            listbookeditinerary = new ArrayList<LISTITINERARYType>();
        }
        return this.listbookeditinerary;
    }

    /**
     * Gets the value of the listapplicablefee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapplicablefee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPPLICABLEFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPLICABLEFEEType }
     * 
     * 
     */
    public List<APPLICABLEFEEType> getLISTAPPLICABLEFEE() {
        if (listapplicablefee == null) {
            listapplicablefee = new ArrayList<APPLICABLEFEEType>();
        }
        return this.listapplicablefee;
    }

    /**
     * Gets the value of the tickettype property.
     * 
     * @return
     *     possible object is
     *     {@link TICKETTYPEType }
     *     
     */
    public TICKETTYPEType getTICKETTYPE() {
        return tickettype;
    }

    /**
     * Sets the value of the tickettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TICKETTYPEType }
     *     
     */
    public void setTICKETTYPE(TICKETTYPEType value) {
        this.tickettype = value;
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
     * Gets the value of the listmod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMOD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODType }
     * 
     * 
     */
    public List<MODType> getLISTMOD() {
        if (listmod == null) {
            listmod = new ArrayList<MODType>();
        }
        return this.listmod;
    }

    /**
     * Gets the value of the farecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECATEGORY() {
        return farecategory;
    }

    /**
     * Sets the value of the farecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECATEGORY(String value) {
        this.farecategory = value;
    }

    /**
     * Gets the value of the listfareflag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareflag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREFLAG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAREFLAGType }
     * 
     * 
     */
    public List<FAREFLAGType> getLISTFAREFLAG() {
        if (listfareflag == null) {
            listfareflag = new ArrayList<FAREFLAGType>();
        }
        return this.listfareflag;
    }

    /**
     * Gets the value of the listappliedfarediscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listappliedfarediscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPPLIEDFAREDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTAPPLIEDFAREDISCOUNT }
     * 
     * 
     */
    public List<LISTAPPLIEDFAREDISCOUNT> getLISTAPPLIEDFAREDISCOUNT() {
        if (listappliedfarediscount == null) {
            listappliedfarediscount = new ArrayList<LISTAPPLIEDFAREDISCOUNT>();
        }
        return this.listappliedfarediscount;
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
     * {@link LISTAPPLIEDPRICINGOPTIONSType }
     * 
     * 
     */
    public List<LISTAPPLIEDPRICINGOPTIONSType> getLISTPRICINGOPTIONS() {
        if (listpricingoptions == null) {
            listpricingoptions = new ArrayList<LISTAPPLIEDPRICINGOPTIONSType>();
        }
        return this.listpricingoptions;
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
     * Gets the value of the resultingfarefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public FAREFAMILYFareType getRESULTINGFAREFAMILY() {
        return resultingfarefamily;
    }

    /**
     * Sets the value of the resultingfarefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public void setRESULTINGFAREFAMILY(FAREFAMILYFareType value) {
        this.resultingfarefamily = value;
    }

    /**
     * Gets the value of the referencepnr property.
     * 
     * @return
     *     possible object is
     *     {@link TRIPFAREType.REFERENCEPNR }
     *     
     */
    public TRIPFAREType.REFERENCEPNR getREFERENCEPNR() {
        return referencepnr;
    }

    /**
     * Sets the value of the referencepnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPFAREType.REFERENCEPNR }
     *     
     */
    public void setREFERENCEPNR(TRIPFAREType.REFERENCEPNR value) {
        this.referencepnr = value;
    }

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link DICTIONARY }
     *     
     */
    public DICTIONARY getDICTIONARY() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DICTIONARY }
     *     
     */
    public void setDICTIONARY(DICTIONARY value) {
        this.dictionary = value;
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
     *         &lt;element name="RECORD_LOCATOR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "recordlocator"
    })
    public static class REFERENCEPNR
        implements Serializable
    {

        @XmlElement(name = "RECORD_LOCATOR", required = true)
        protected Object recordlocator;

        /**
         * Gets the value of the recordlocator property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRECORDLOCATOR() {
            return recordlocator;
        }

        /**
         * Sets the value of the recordlocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRECORDLOCATOR(Object value) {
            this.recordlocator = value;
        }

    }

}
