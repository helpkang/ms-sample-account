
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.LISTITINERARYType;


/**
 * <p>Java class for LIST_RECOMMENDATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_RECOMMENDATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}RECOMM_REF"/&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TICKETING_TIME_LIMIT"/&gt;
 *         &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_ITINERARY" type="{}LIST_ITINERARY_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TICKET_DESIGNATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_RECOMMENDATION_Type", propOrder = {
    "recommref",
    "listpnr",
    "ticketingtimelimit",
    "listtripprice",
    "listitinerary",
    "ticketdesignator"
})
public class LISTRECOMMENDATIONType
    implements Serializable
{

    @XmlElement(name = "RECOMM_REF", required = true)
    protected BigInteger recommref;
    @XmlElement(name = "LIST_PNR", required = true)
    protected List<LISTPNRType> listpnr;
    @XmlElement(name = "TICKETING_TIME_LIMIT", required = true)
    protected TICKETINGTIMELIMIT ticketingtimelimit;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<LISTTRIPPRICE> listtripprice;
    @XmlElement(name = "LIST_ITINERARY", required = true)
    protected List<LISTITINERARYType> listitinerary;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;

    /**
     * Gets the value of the recommref property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECOMMREF() {
        return recommref;
    }

    /**
     * Sets the value of the recommref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECOMMREF(BigInteger value) {
        this.recommref = value;
    }

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

}
