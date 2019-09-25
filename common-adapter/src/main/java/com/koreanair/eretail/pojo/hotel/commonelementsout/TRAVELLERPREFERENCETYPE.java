
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Traveller preferences type
 * 
 * <p>Java class for TRAVELLER_PREFERENCE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_PREFERENCE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RANKING" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="MATCHING_PREFERENCES_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER_PREFERENCES" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVELLER_PREFERENCE_TYPE", propOrder = {
    "status",
    "ranking",
    "matchingpreferencesid",
    "listtravellerpreferences"
})
public class TRAVELLERPREFERENCETYPE
    implements Serializable
{

    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "RANKING")
    protected String ranking;
    @XmlElement(name = "MATCHING_PREFERENCES_ID")
    protected List<String> matchingpreferencesid;
    @XmlElement(name = "LIST_TRAVELLER_PREFERENCES")
    protected List<LISTTRAVELLERPREFERENCETYPE> listtravellerpreferences;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the ranking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRANKING() {
        return ranking;
    }

    /**
     * Sets the value of the ranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRANKING(String value) {
        this.ranking = value;
    }

    /**
     * Gets the value of the matchingpreferencesid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchingpreferencesid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMATCHINGPREFERENCESID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMATCHINGPREFERENCESID() {
        if (matchingpreferencesid == null) {
            matchingpreferencesid = new ArrayList<String>();
        }
        return this.matchingpreferencesid;
    }

    /**
     * Gets the value of the listtravellerpreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerpreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERPREFERENCES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERPREFERENCETYPE }
     * 
     * 
     */
    public List<LISTTRAVELLERPREFERENCETYPE> getLISTTRAVELLERPREFERENCES() {
        if (listtravellerpreferences == null) {
            listtravellerpreferences = new ArrayList<LISTTRAVELLERPREFERENCETYPE>();
        }
        return this.listtravellerpreferences;
    }

}
