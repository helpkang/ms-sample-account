
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecontext.LISTAPPLIEDPRICINGOPTIONSType;


/**
 * <p>Java class for LIST_TRIP_FARE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRIP_FARE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TICKETING_TIME_LIMIT"/&gt;
 *         &lt;element name="ON_HOLD_INFORMATION" type="{}ON_HOLD_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TYPE_OF_FARE_AIR" minOccurs="0"/&gt;
 *         &lt;element ref="{}PRICE_BY_INPUT_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}AIR_RULE_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}PASS_CORPORATE_ID" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_INFO" type="{}segmentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_CATEGORY" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_FLAG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}VALIDATING_CARRIER" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_DESIGNATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PRICING_OPTIONS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_UPSOLD_SEGMENT_ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TRIP_FARE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRIP_FARE_Type", propOrder = {
    "listpnr",
    "ticketingtimelimit",
    "onholdinformation",
    "listtripprice",
    "typeoffareair",
    "pricebyinputid",
    "airruleid",
    "fareid",
    "passcorporateid",
    "listsegmentinfo",
    "tickettype",
    "farecategory",
    "listfareflag",
    "validatingcarrier",
    "ticketdesignator",
    "listpricingoptions",
    "listupsoldsegmentid",
    "tripfareid"
})
public class LISTTRIPFAREType
    implements Serializable
{

    @XmlElement(name = "LIST_PNR", required = true)
    protected List<LISTPNRType> listpnr;
    @XmlElement(name = "TICKETING_TIME_LIMIT", required = true)
    protected TICKETINGTIMELIMIT ticketingtimelimit;
    @XmlElement(name = "ON_HOLD_INFORMATION")
    protected ONHOLDINFORMATIONType onholdinformation;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<LISTTRIPPRICE> listtripprice;
    @XmlElement(name = "TYPE_OF_FARE_AIR")
    protected BigInteger typeoffareair;
    @XmlElement(name = "PRICE_BY_INPUT_ID")
    protected BigInteger pricebyinputid;
    @XmlElement(name = "AIR_RULE_ID")
    protected BigInteger airruleid;
    @XmlElement(name = "FARE_ID")
    protected BigInteger fareid;
    @XmlElement(name = "PASS_CORPORATE_ID")
    protected BigInteger passcorporateid;
    @XmlElement(name = "LIST_SEGMENT_INFO")
    protected List<SegmentInfo> listsegmentinfo;
    @XmlElement(name = "TICKET_TYPE")
    protected TICKETTYPEType tickettype;
    @XmlElement(name = "FARE_CATEGORY")
    protected String farecategory;
    @XmlElement(name = "LIST_FARE_FLAG")
    protected List<FAREFLAGType> listfareflag;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected String validatingcarrier;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<LISTAPPLIEDPRICINGOPTIONSType> listpricingoptions;
    @XmlElement(name = "LIST_UPSOLD_SEGMENT_ID")
    protected List<UPSOLDSEGMENTIDType> listupsoldsegmentid;
    @XmlElement(name = "TRIP_FARE_ID")
    protected Object tripfareid;

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
     * Gets the value of the typeoffareair property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFFAREAIR() {
        return typeoffareair;
    }

    /**
     * Sets the value of the typeoffareair property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFFAREAIR(BigInteger value) {
        this.typeoffareair = value;
    }

    /**
     * Gets the value of the pricebyinputid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRICEBYINPUTID() {
        return pricebyinputid;
    }

    /**
     * Sets the value of the pricebyinputid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRICEBYINPUTID(BigInteger value) {
        this.pricebyinputid = value;
    }

    /**
     * Gets the value of the airruleid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAIRRULEID() {
        return airruleid;
    }

    /**
     * Sets the value of the airruleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAIRRULEID(BigInteger value) {
        this.airruleid = value;
    }

    /**
     * Gets the value of the fareid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFAREID() {
        return fareid;
    }

    /**
     * Sets the value of the fareid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFAREID(BigInteger value) {
        this.fareid = value;
    }

    /**
     * Gets the value of the passcorporateid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPASSCORPORATEID() {
        return passcorporateid;
    }

    /**
     * Sets the value of the passcorporateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPASSCORPORATEID(BigInteger value) {
        this.passcorporateid = value;
    }

    /**
     * Gets the value of the listsegmentinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentInfo }
     * 
     * 
     */
    public List<SegmentInfo> getLISTSEGMENTINFO() {
        if (listsegmentinfo == null) {
            listsegmentinfo = new ArrayList<SegmentInfo>();
        }
        return this.listsegmentinfo;
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
     * Gets the value of the listupsoldsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listupsoldsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUPSOLDSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UPSOLDSEGMENTIDType }
     * 
     * 
     */
    public List<UPSOLDSEGMENTIDType> getLISTUPSOLDSEGMENTID() {
        if (listupsoldsegmentid == null) {
            listupsoldsegmentid = new ArrayList<UPSOLDSEGMENTIDType>();
        }
        return this.listupsoldsegmentid;
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

}
