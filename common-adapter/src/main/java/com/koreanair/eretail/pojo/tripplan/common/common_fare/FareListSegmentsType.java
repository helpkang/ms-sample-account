
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTMEAL;


/**
 * List of segments  
 * 
 * <p>Java class for fareListSegmentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareListSegmentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}PNR_SEGMENT_DATA_Type"/&gt;
 *         &lt;group ref="{}COMMON_SEGMENT_DATA_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareListSegmentsType", propOrder = {
    "segmentid",
    "baggageallowance",
    "farebasis",
    "ticketdesignator",
    "discountindicator",
    "nva",
    "nvb",
    "listmeal"
})
public class FareListSegmentsType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;
    @XmlElement(name = "BAGGAGE_ALLOWANCE")
    protected String baggageallowance;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
    @XmlElement(name = "DISCOUNT_INDICATOR")
    protected String discountindicator;
    @XmlElement(name = "NVA")
    protected String nva;
    @XmlElement(name = "NVB")
    protected String nvb;
    @XmlElement(name = "LIST_MEAL")
    protected List<LISTMEAL> listmeal;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the baggageallowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAGGAGEALLOWANCE() {
        return baggageallowance;
    }

    /**
     * Sets the value of the baggageallowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAGGAGEALLOWANCE(String value) {
        this.baggageallowance = value;
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
     * Gets the value of the discountindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTINDICATOR() {
        return discountindicator;
    }

    /**
     * Sets the value of the discountindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTINDICATOR(String value) {
        this.discountindicator = value;
    }

    /**
     * Not Valid After. The format is DDMMM (15OCT for example).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVA(String value) {
        this.nva = value;
    }

    /**
     * Not Valid Before. The format is DDMMM (15OCT for example).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVB(String value) {
        this.nvb = value;
    }

    /**
     * Gets the value of the listmeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMEAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMEAL }
     * 
     * 
     */
    public List<LISTMEAL> getLISTMEAL() {
        if (listmeal == null) {
            listmeal = new ArrayList<LISTMEAL>();
        }
        return this.listmeal;
    }

}
