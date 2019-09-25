
package com.koreanair.eretail.pojo.flexpricer.flexpricercomplexitineraryavailabilityoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.ListItineraryType;
import com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.ListPNRType;
import com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.TripPriceType;


/**
 * List of trip elements in the current complex itinerary 
 * 
 * <p>Java class for LIST_TRIP_ELEMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRIP_ELEMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_ITINERARY" type="{}ListItineraryType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "boundid",
    "listpnr",
    "listtripprice",
    "listitinerary"
})
public class LISTTRIPELEMENTType
    implements Serializable
{

    @XmlElement(name = "BOUND_ID")
    protected BigInteger boundid;
    @XmlElement(name = "LIST_PNR", required = true)
    protected List<ListPNRType> listpnr;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<TripPriceType> listtripprice;
    @XmlElement(name = "LIST_ITINERARY")
    protected List<ListItineraryType> listitinerary;

    /**
     * Gets the value of the boundid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOUNDID() {
        return boundid;
    }

    /**
     * Sets the value of the boundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOUNDID(BigInteger value) {
        this.boundid = value;
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
     * {@link ListPNRType }
     * 
     * 
     */
    public List<ListPNRType> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<ListPNRType>();
        }
        return this.listpnr;
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
     * {@link TripPriceType }
     * 
     * 
     */
    public List<TripPriceType> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<TripPriceType>();
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
     * {@link ListItineraryType }
     * 
     * 
     */
    public List<ListItineraryType> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<ListItineraryType>();
        }
        return this.listitinerary;
    }

}
