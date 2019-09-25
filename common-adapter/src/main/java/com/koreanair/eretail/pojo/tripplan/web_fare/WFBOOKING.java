
package com.koreanair.eretail.pojo.tripplan.web_fare;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.LISTMSG;


/**
 * Webfare booking. In mode monopax and ONE_WF_BKG multipax there is only one booking. In mode SPLIT_WF_BKG multipax there are as many bookings as pax.
 * 
 * <p>Java class for WF_BOOKING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WF_BOOKING"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOOKING_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BOOKING_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONFIRMATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TPCA_BOOKING_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECOMMENDATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TICKETING_TIME_LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_IMMEDIATE_TICKETING_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_PRICE" type="{}PRICE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_INFO" type="{}FARE_INFO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WF_BOOKING", propOrder = {
    "bookingid",
    "bookingstatus",
    "confirmationnumber",
    "ticketnumber",
    "tpcabookingreference",
    "recommendationid",
    "ticketingtimelimit",
    "isimmediateticketingrequired",
    "listtravellerid",
    "listprice",
    "listmsg",
    "listfareinfo"
})
public class WFBOOKING
    implements Serializable
{

    @XmlElement(name = "BOOKING_ID", required = true)
    protected BigInteger bookingid;
    @XmlElement(name = "BOOKING_STATUS")
    protected String bookingstatus;
    @XmlElement(name = "CONFIRMATION_NUMBER")
    protected String confirmationnumber;
    @XmlElement(name = "TICKET_NUMBER")
    protected String ticketnumber;
    @XmlElement(name = "TPCA_BOOKING_REFERENCE")
    protected String tpcabookingreference;
    @XmlElement(name = "RECOMMENDATION_ID")
    protected String recommendationid;
    @XmlElement(name = "TICKETING_TIME_LIMIT")
    protected String ticketingtimelimit;
    @XmlElement(name = "IS_IMMEDIATE_TICKETING_REQUIRED")
    protected Boolean isimmediateticketingrequired;
    @XmlElement(name = "LIST_TRAVELLER_ID", required = true)
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "LIST_PRICE")
    protected List<PRICE> listprice;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_FARE_INFO")
    protected List<FAREINFO> listfareinfo;

    /**
     * Gets the value of the bookingid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOOKINGID() {
        return bookingid;
    }

    /**
     * Sets the value of the bookingid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOOKINGID(BigInteger value) {
        this.bookingid = value;
    }

    /**
     * Gets the value of the bookingstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGSTATUS() {
        return bookingstatus;
    }

    /**
     * Sets the value of the bookingstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGSTATUS(String value) {
        this.bookingstatus = value;
    }

    /**
     * Gets the value of the confirmationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMATIONNUMBER() {
        return confirmationnumber;
    }

    /**
     * Sets the value of the confirmationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMATIONNUMBER(String value) {
        this.confirmationnumber = value;
    }

    /**
     * Gets the value of the ticketnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETNUMBER() {
        return ticketnumber;
    }

    /**
     * Sets the value of the ticketnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETNUMBER(String value) {
        this.ticketnumber = value;
    }

    /**
     * Gets the value of the tpcabookingreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPCABOOKINGREFERENCE() {
        return tpcabookingreference;
    }

    /**
     * Sets the value of the tpcabookingreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPCABOOKINGREFERENCE(String value) {
        this.tpcabookingreference = value;
    }

    /**
     * Gets the value of the recommendationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECOMMENDATIONID() {
        return recommendationid;
    }

    /**
     * Sets the value of the recommendationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECOMMENDATIONID(String value) {
        this.recommendationid = value;
    }

    /**
     * Gets the value of the ticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINGTIMELIMIT() {
        return ticketingtimelimit;
    }

    /**
     * Sets the value of the ticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINGTIMELIMIT(String value) {
        this.ticketingtimelimit = value;
    }

    /**
     * Gets the value of the isimmediateticketingrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISIMMEDIATETICKETINGREQUIRED() {
        return isimmediateticketingrequired;
    }

    /**
     * Sets the value of the isimmediateticketingrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISIMMEDIATETICKETINGREQUIRED(Boolean value) {
        this.isimmediateticketingrequired = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRICE }
     * 
     * 
     */
    public List<PRICE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<PRICE>();
        }
        return this.listprice;
    }

    /**
     * The list of messages associated to this booking.Gets the value of the listmsg property.
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
     * Gets the value of the listfareinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAREINFO }
     * 
     * 
     */
    public List<FAREINFO> getLISTFAREINFO() {
        if (listfareinfo == null) {
            listfareinfo = new ArrayList<FAREINFO>();
        }
        return this.listfareinfo;
    }

}
