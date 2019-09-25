
package com.koreanair.external.eretail.vo.air.commonout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The list of the availabilities according to the request of award availabilites.
 * 
 * <p>Java class for AWARD_AVAILABILITY_LIST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWARD_AVAILABILITY_LIST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEARCH_DATA" type="{}AWARD_DESTINATION_OUTPUT_TYPE"/&gt;
 *         &lt;element name="LIST_DATE_FLIGHT" type="{}AWARD_CALENDAR_DATE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWARD_AVAILABILITY_LIST", propOrder = {
    "searchdata",
    "listdateflight"
})
public class AWARDAVAILABILITYLIST
    implements Serializable
{

    @XmlElement(name = "SEARCH_DATA", required = true)
    protected AWARDDESTINATIONOUTPUTTYPE searchdata;
    @XmlElement(name = "LIST_DATE_FLIGHT")
    protected List<AWARDCALENDARDATE> listdateflight;

    /**
     * Gets the value of the searchdata property.
     * 
     * @return
     *     possible object is
     *     {@link AWARDDESTINATIONOUTPUTTYPE }
     *     
     */
    public AWARDDESTINATIONOUTPUTTYPE getSEARCHDATA() {
        return searchdata;
    }

    /**
     * Sets the value of the searchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AWARDDESTINATIONOUTPUTTYPE }
     *     
     */
    public void setSEARCHDATA(AWARDDESTINATIONOUTPUTTYPE value) {
        this.searchdata = value;
    }

    /**
     * Gets the value of the listdateflight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdateflight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDATEFLIGHT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AWARDCALENDARDATE }
     * 
     * 
     */
    public List<AWARDCALENDARDATE> getLISTDATEFLIGHT() {
        if (listdateflight == null) {
            listdateflight = new ArrayList<AWARDCALENDARDATE>();
        }
        return this.listdateflight;
    }

}
