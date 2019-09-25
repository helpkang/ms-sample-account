
package com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.LISTITINERARYLightType;


/**
 * <p>Java class for BOOKED_TRIP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_TRIP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TRIP_FARE" type="{}BOOKED_TRIP_FARE_Type"/&gt;
 *           &lt;element name="LIST_PRICING_SOLUTION" type="{}BOOKED_TRIP_FARE_Type" maxOccurs="3"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}LIST_REDEMPTION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ITINERARY" type="{}LIST_ITINERARY_LightType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_TRIP_Type", propOrder = {
    "tripfare",
    "listpricingsolution",
    "listredemption",
    "listitinerary"
})
public class BOOKEDTRIPType
    implements Serializable
{

    @XmlElement(name = "TRIP_FARE")
    protected BOOKEDTRIPFAREType tripfare;
    @XmlElement(name = "LIST_PRICING_SOLUTION")
    protected List<BOOKEDTRIPFAREType> listpricingsolution;
    @XmlElement(name = "LIST_REDEMPTION")
    protected List<LISTREDEMPTIONType> listredemption;
    @XmlElement(name = "LIST_ITINERARY")
    protected List<LISTITINERARYLightType> listitinerary;

    /**
     * Gets the value of the tripfare property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDTRIPFAREType }
     *     
     */
    public BOOKEDTRIPFAREType getTRIPFARE() {
        return tripfare;
    }

    /**
     * Sets the value of the tripfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDTRIPFAREType }
     *     
     */
    public void setTRIPFARE(BOOKEDTRIPFAREType value) {
        this.tripfare = value;
    }

    /**
     * Gets the value of the listpricingsolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricingsolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICINGSOLUTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDTRIPFAREType }
     * 
     * 
     */
    public List<BOOKEDTRIPFAREType> getLISTPRICINGSOLUTION() {
        if (listpricingsolution == null) {
            listpricingsolution = new ArrayList<BOOKEDTRIPFAREType>();
        }
        return this.listpricingsolution;
    }

    /**
     * Gets the value of the listredemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREDEMPTIONType }
     * 
     * 
     */
    public List<LISTREDEMPTIONType> getLISTREDEMPTION() {
        if (listredemption == null) {
            listredemption = new ArrayList<LISTREDEMPTIONType>();
        }
        return this.listredemption;
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
     * {@link LISTITINERARYLightType }
     * 
     * 
     */
    public List<LISTITINERARYLightType> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<LISTITINERARYLightType>();
        }
        return this.listitinerary;
    }

}
