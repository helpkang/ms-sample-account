
package com.koreanair.eretail.pojo.ticketchanger.ticketchangercommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOOKED_TRIP_FARE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_TRIP_FARE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRIP_PRICE" type="{}BOOKED_LIST_TRIP_PRICE_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_PNR" type="{}BOOKED_LIST_PNR_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_REDEMPTION" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_TRIP_FARE_Type", propOrder = {
    "listtripprice",
    "listpnr",
    "listredemption"
})
public class BOOKEDTRIPFAREType
    implements Serializable
{

    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<BOOKEDLISTTRIPPRICEType> listtripprice;
    @XmlElement(name = "LIST_PNR")
    protected List<BOOKEDLISTPNRType> listpnr;
    @XmlElement(name = "LIST_REDEMPTION")
    protected LISTREDEMPTIONType listredemption;

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
     * {@link BOOKEDLISTTRIPPRICEType }
     * 
     * 
     */
    public List<BOOKEDLISTTRIPPRICEType> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<BOOKEDLISTTRIPPRICEType>();
        }
        return this.listtripprice;
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
     * {@link BOOKEDLISTPNRType }
     * 
     * 
     */
    public List<BOOKEDLISTPNRType> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<BOOKEDLISTPNRType>();
        }
        return this.listpnr;
    }

    /**
     * Gets the value of the listredemption property.
     * 
     * @return
     *     possible object is
     *     {@link LISTREDEMPTIONType }
     *     
     */
    public LISTREDEMPTIONType getLISTREDEMPTION() {
        return listredemption;
    }

    /**
     * Sets the value of the listredemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTREDEMPTIONType }
     *     
     */
    public void setLISTREDEMPTION(LISTREDEMPTIONType value) {
        this.listredemption = value;
    }

}
