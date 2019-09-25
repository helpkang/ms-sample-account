
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SERVICES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_HOTEL_AMENITY" type="{}SERVICES_ELEMENT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BUSINESS_SERVICE" type="{}SERVICES_ELEMENT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MEETING_ROOM_SERVICE" type="{}SERVICES_ELEMENT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MEAL_PLAN" type="{}SERVICES_ELEMENT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SECURITY_FEATURE" type="{}SERVICES_ELEMENT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ACCESSIBILITY_FEATURE" type="{}SERVICES_ELEMENT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICES_TYPE", propOrder = {
    "listhotelamenity",
    "listbusinessservice",
    "listmeetingroomservice",
    "listmealplan",
    "listsecurityfeature",
    "listaccessibilityfeature"
})
public class SERVICESTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_HOTEL_AMENITY")
    protected List<SERVICESELEMENTTYPE> listhotelamenity;
    @XmlElement(name = "LIST_BUSINESS_SERVICE")
    protected List<SERVICESELEMENTTYPE> listbusinessservice;
    @XmlElement(name = "LIST_MEETING_ROOM_SERVICE")
    protected List<SERVICESELEMENTTYPE> listmeetingroomservice;
    @XmlElement(name = "LIST_MEAL_PLAN")
    protected List<SERVICESELEMENTTYPE> listmealplan;
    @XmlElement(name = "LIST_SECURITY_FEATURE")
    protected List<SERVICESELEMENTTYPE> listsecurityfeature;
    @XmlElement(name = "LIST_ACCESSIBILITY_FEATURE")
    protected List<SERVICESELEMENTTYPE> listaccessibilityfeature;

    /**
     * Gets the value of the listhotelamenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listhotelamenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTHOTELAMENITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELEMENTTYPE }
     * 
     * 
     */
    public List<SERVICESELEMENTTYPE> getLISTHOTELAMENITY() {
        if (listhotelamenity == null) {
            listhotelamenity = new ArrayList<SERVICESELEMENTTYPE>();
        }
        return this.listhotelamenity;
    }

    /**
     * Gets the value of the listbusinessservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbusinessservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBUSINESSSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELEMENTTYPE }
     * 
     * 
     */
    public List<SERVICESELEMENTTYPE> getLISTBUSINESSSERVICE() {
        if (listbusinessservice == null) {
            listbusinessservice = new ArrayList<SERVICESELEMENTTYPE>();
        }
        return this.listbusinessservice;
    }

    /**
     * Gets the value of the listmeetingroomservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmeetingroomservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMEETINGROOMSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELEMENTTYPE }
     * 
     * 
     */
    public List<SERVICESELEMENTTYPE> getLISTMEETINGROOMSERVICE() {
        if (listmeetingroomservice == null) {
            listmeetingroomservice = new ArrayList<SERVICESELEMENTTYPE>();
        }
        return this.listmeetingroomservice;
    }

    /**
     * Gets the value of the listmealplan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmealplan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMEALPLAN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELEMENTTYPE }
     * 
     * 
     */
    public List<SERVICESELEMENTTYPE> getLISTMEALPLAN() {
        if (listmealplan == null) {
            listmealplan = new ArrayList<SERVICESELEMENTTYPE>();
        }
        return this.listmealplan;
    }

    /**
     * Gets the value of the listsecurityfeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsecurityfeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSECURITYFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELEMENTTYPE }
     * 
     * 
     */
    public List<SERVICESELEMENTTYPE> getLISTSECURITYFEATURE() {
        if (listsecurityfeature == null) {
            listsecurityfeature = new ArrayList<SERVICESELEMENTTYPE>();
        }
        return this.listsecurityfeature;
    }

    /**
     * Gets the value of the listaccessibilityfeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaccessibilityfeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTACCESSIBILITYFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELEMENTTYPE }
     * 
     * 
     */
    public List<SERVICESELEMENTTYPE> getLISTACCESSIBILITYFEATURE() {
        if (listaccessibilityfeature == null) {
            listaccessibilityfeature = new ArrayList<SERVICESELEMENTTYPE>();
        }
        return this.listaccessibilityfeature;
    }

}
