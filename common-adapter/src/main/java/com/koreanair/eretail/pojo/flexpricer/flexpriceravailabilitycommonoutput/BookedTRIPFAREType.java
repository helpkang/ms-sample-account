
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Booked_TRIP_FARE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Booked_TRIP_FARE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER_TYPE" type="{}Booked_LIST_TRAVELLER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TRIP_PRICE" type="{}BOOKED_PRICE_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booked_TRIP_FARE_Type", propOrder = {
    "listtravellertype",
    "tripprice"
})
public class BookedTRIPFAREType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER_TYPE")
    protected List<BookedLISTTRAVELLERTYPE> listtravellertype;
    @XmlElement(name = "TRIP_PRICE", required = true)
    protected BOOKEDPRICEType tripprice;

    /**
     * Gets the value of the listtravellertype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookedLISTTRAVELLERTYPE }
     * 
     * 
     */
    public List<BookedLISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<BookedLISTTRAVELLERTYPE>();
        }
        return this.listtravellertype;
    }

    /**
     * Gets the value of the tripprice property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDPRICEType }
     *     
     */
    public BOOKEDPRICEType getTRIPPRICE() {
        return tripprice;
    }

    /**
     * Sets the value of the tripprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDPRICEType }
     *     
     */
    public void setTRIPPRICE(BOOKEDPRICEType value) {
        this.tripprice = value;
    }

}
