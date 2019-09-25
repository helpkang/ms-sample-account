
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.AWARDTYPE;


/**
 * main type for all hotel descriptive content being returned by the HDP database
 * 
 * <p>Java class for HOTEL_DESCRIPTIVE_CONTENT_SUBSET_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_DESCRIPTIVE_CONTENT_SUBSET_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISABLED_ACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_NUMBER_ROOMS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CONTACT_DETAILS" type="{}CONTACT_DETAILS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SPOKEN_LANGUAGE" type="{}LANGUAGE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FACILITY" type="{}FACILITY_TYPE_AVAIL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AWARD" type="{}AWARD_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_USER_REVIEW" type="{}USERS_REVIEWS_1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_DESCRIPTIVE_CONTENT_SUBSET_TYPE", propOrder = {
    "disabledaccess",
    "totalnumberrooms",
    "listcontactdetails",
    "listspokenlanguage",
    "listfacility",
    "listaward",
    "listuserreview"
})
public class HOTELDESCRIPTIVECONTENTSUBSETTYPE
    implements Serializable
{

    @XmlElement(name = "DISABLED_ACCESS")
    protected Boolean disabledaccess;
    @XmlElement(name = "TOTAL_NUMBER_ROOMS")
    protected BigInteger totalnumberrooms;
    @XmlElement(name = "LIST_CONTACT_DETAILS")
    protected List<CONTACTDETAILSTYPE> listcontactdetails;
    @XmlElement(name = "LIST_SPOKEN_LANGUAGE")
    protected List<LANGUAGETYPE> listspokenlanguage;
    @XmlElement(name = "LIST_FACILITY")
    protected List<FACILITYTYPEAVAIL> listfacility;
    @XmlElement(name = "LIST_AWARD")
    protected List<AWARDTYPE> listaward;
    @XmlElement(name = "LIST_USER_REVIEW")
    protected List<USERSREVIEWS1> listuserreview;

    /**
     * Gets the value of the disabledaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISABLEDACCESS() {
        return disabledaccess;
    }

    /**
     * Sets the value of the disabledaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISABLEDACCESS(Boolean value) {
        this.disabledaccess = value;
    }

    /**
     * Gets the value of the totalnumberrooms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTOTALNUMBERROOMS() {
        return totalnumberrooms;
    }

    /**
     * Sets the value of the totalnumberrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTOTALNUMBERROOMS(BigInteger value) {
        this.totalnumberrooms = value;
    }

    /**
     * Gets the value of the listcontactdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACTDETAILSTYPE }
     * 
     * 
     */
    public List<CONTACTDETAILSTYPE> getLISTCONTACTDETAILS() {
        if (listcontactdetails == null) {
            listcontactdetails = new ArrayList<CONTACTDETAILSTYPE>();
        }
        return this.listcontactdetails;
    }

    /**
     * Gets the value of the listspokenlanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspokenlanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPOKENLANGUAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LANGUAGETYPE }
     * 
     * 
     */
    public List<LANGUAGETYPE> getLISTSPOKENLANGUAGE() {
        if (listspokenlanguage == null) {
            listspokenlanguage = new ArrayList<LANGUAGETYPE>();
        }
        return this.listspokenlanguage;
    }

    /**
     * Gets the value of the listfacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFACILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FACILITYTYPEAVAIL }
     * 
     * 
     */
    public List<FACILITYTYPEAVAIL> getLISTFACILITY() {
        if (listfacility == null) {
            listfacility = new ArrayList<FACILITYTYPEAVAIL>();
        }
        return this.listfacility;
    }

    /**
     * Gets the value of the listaward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAWARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AWARDTYPE }
     * 
     * 
     */
    public List<AWARDTYPE> getLISTAWARD() {
        if (listaward == null) {
            listaward = new ArrayList<AWARDTYPE>();
        }
        return this.listaward;
    }

    /**
     * Gets the value of the listuserreview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listuserreview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUSERREVIEW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USERSREVIEWS1 }
     * 
     * 
     */
    public List<USERSREVIEWS1> getLISTUSERREVIEW() {
        if (listuserreview == null) {
            listuserreview = new ArrayList<USERSREVIEWS1>();
        }
        return this.listuserreview;
    }

}
