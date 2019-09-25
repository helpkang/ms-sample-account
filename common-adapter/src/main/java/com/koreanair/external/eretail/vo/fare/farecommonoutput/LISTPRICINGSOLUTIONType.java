
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
 * <p>Java class for LIST_PRICING_SOLUTION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PRICING_SOLUTION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TICKETING_TIME_LIMIT"/&gt;
 *         &lt;element ref="{}TICKETING_TIME_LIMIT_GDS"/&gt;
 *         &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TYPE_OF_FARE_AIR" minOccurs="0"/&gt;
 *         &lt;element ref="{}PRICE_BY_INPUT_ID" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_INFO" type="{}segmentInfo" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TICKET_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_CATEGORY" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_FLAG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_SEGMENT_ID" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}FARE_BY_BOUND" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element name="VALIDATING_CARRIER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_DESIGNATOR" minOccurs="0"/&gt;
 *         &lt;element name="PRICING_SOLUTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PRICING_OPTIONS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PRICING_SOLUTION_Type", propOrder = {
    "listpnr",
    "ticketingtimelimit",
    "ticketingtimelimitgds",
    "listtripprice",
    "typeoffareair",
    "pricebyinputid",
    "listsegmentinfo",
    "tickettype",
    "farecategory",
    "listfareflag",
    "listsegmentid",
    "farebybound",
    "listfareindicator",
    "validatingcarrier",
    "ticketdesignator",
    "pricingsolutionid",
    "listpricingoptions"
})
public class LISTPRICINGSOLUTIONType
    implements Serializable
{

    @XmlElement(name = "LIST_PNR", required = true)
    protected List<LISTPNRType> listpnr;
    @XmlElement(name = "TICKETING_TIME_LIMIT", required = true)
    protected TICKETINGTIMELIMIT ticketingtimelimit;
    @XmlElement(name = "TICKETING_TIME_LIMIT_GDS", required = true)
    protected TICKETINGTIMELIMITGDS ticketingtimelimitgds;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<LISTTRIPPRICE> listtripprice;
    @XmlElement(name = "TYPE_OF_FARE_AIR")
    protected BigInteger typeoffareair;
    @XmlElement(name = "PRICE_BY_INPUT_ID")
    protected BigInteger pricebyinputid;
    @XmlElement(name = "LIST_SEGMENT_INFO", required = true)
    protected List<SegmentInfo> listsegmentinfo;
    @XmlElement(name = "TICKET_TYPE")
    protected TICKETTYPEType tickettype;
    @XmlElement(name = "FARE_CATEGORY")
    protected String farecategory;
    @XmlElement(name = "LIST_FARE_FLAG")
    protected List<FAREFLAGType> listfareflag;
    @XmlElement(name = "LIST_SEGMENT_ID", required = true)
    protected List<LISTSEGMENTID> listsegmentid;
    @XmlElement(name = "FARE_BY_BOUND")
    protected String farebybound;
    @XmlElement(name = "LIST_FARE_INDICATOR")
    protected LISTFAREINDICATOR listfareindicator;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected Object validatingcarrier;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
    @XmlElement(name = "PRICING_SOLUTION_ID")
    protected Object pricingsolutionid;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<LISTAPPLIEDPRICINGOPTIONSType> listpricingoptions;

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
     * Gets the value of the ticketingtimelimitgds property.
     * 
     * @return
     *     possible object is
     *     {@link TICKETINGTIMELIMITGDS }
     *     
     */
    public TICKETINGTIMELIMITGDS getTICKETINGTIMELIMITGDS() {
        return ticketingtimelimitgds;
    }

    /**
     * Sets the value of the ticketingtimelimitgds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TICKETINGTIMELIMITGDS }
     *     
     */
    public void setTICKETINGTIMELIMITGDS(TICKETINGTIMELIMITGDS value) {
        this.ticketingtimelimitgds = value;
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
     * Gets the value of the listsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSEGMENTID }
     * 
     * 
     */
    public List<LISTSEGMENTID> getLISTSEGMENTID() {
        if (listsegmentid == null) {
            listsegmentid = new ArrayList<LISTSEGMENTID>();
        }
        return this.listsegmentid;
    }

    /**
     * Gets the value of the farebybound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBYBOUND() {
        return farebybound;
    }

    /**
     * Sets the value of the farebybound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBYBOUND(String value) {
        this.farebybound = value;
    }

    /**
     * Gets the value of the listfareindicator property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFAREINDICATOR }
     *     
     */
    public LISTFAREINDICATOR getLISTFAREINDICATOR() {
        return listfareindicator;
    }

    /**
     * Sets the value of the listfareindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFAREINDICATOR }
     *     
     */
    public void setLISTFAREINDICATOR(LISTFAREINDICATOR value) {
        this.listfareindicator = value;
    }

    /**
     * Gets the value of the validatingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVALIDATINGCARRIER() {
        return validatingcarrier;
    }

    /**
     * Sets the value of the validatingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVALIDATINGCARRIER(Object value) {
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
     * Gets the value of the pricingsolutionid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRICINGSOLUTIONID() {
        return pricingsolutionid;
    }

    /**
     * Sets the value of the pricingsolutionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRICINGSOLUTIONID(Object value) {
        this.pricingsolutionid = value;
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

}
