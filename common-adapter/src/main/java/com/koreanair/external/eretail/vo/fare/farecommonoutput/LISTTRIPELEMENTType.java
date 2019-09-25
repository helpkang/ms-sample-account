
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.external.eretail.vo.farecommon.farecontext.LISTAPPLIEDPRICINGOPTIONSType;


/**
 * <p>Java class for LIST_TRIP_ELEMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRIP_ELEMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TICKETING_TIME_LIMIT"/&gt;
 *         &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}ITEM_ID"/&gt;
 *         &lt;element ref="{}TICKET_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MOD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_CATEGORY" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_FLAG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_APPLICABLE_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_DESIGNATOR" minOccurs="0"/&gt;
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
@XmlType(name = "LIST_TRIP_ELEMENT_Type", propOrder = {
    "listpnr",
    "ticketingtimelimit",
    "listtripprice",
    "itemid",
    "tickettype",
    "listmod",
    "farecategory",
    "listfareflag",
    "listapplicablefee",
    "ticketdesignator",
    "listpricingoptions"
})
public class LISTTRIPELEMENTType
    implements Serializable
{

    @XmlElement(name = "LIST_PNR", required = true)
    protected List<LISTPNRType> listpnr;
    @XmlElement(name = "TICKETING_TIME_LIMIT", required = true)
    protected TICKETINGTIMELIMIT ticketingtimelimit;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<LISTTRIPPRICE> listtripprice;
    @XmlElement(name = "ITEM_ID", required = true)
    protected BigInteger itemid;
    @XmlElement(name = "TICKET_TYPE")
    protected TICKETTYPEType tickettype;
    @XmlElement(name = "LIST_MOD")
    protected List<MODType> listmod;
    @XmlElement(name = "FARE_CATEGORY")
    protected String farecategory;
    @XmlElement(name = "LIST_FARE_FLAG")
    protected List<FAREFLAGType> listfareflag;
    @XmlElement(name = "LIST_APPLICABLE_FEE")
    protected List<APPLICABLEFEEType> listapplicablefee;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
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

}
