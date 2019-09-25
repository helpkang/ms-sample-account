
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * Local Attractions
 * 
 * <p>Java class for ATTRACTION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATTRACTION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_STRICT"/&gt;
 *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CONTACT_DETAILS" type="{}CONTACT_DETAILS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_FREETEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AREA_REFERENCE_POINT" type="{}REFERENCE_POINT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATTRACTION_TYPE", propOrder = {
    "type",
    "name",
    "listcontactdetails",
    "listdescription",
    "listareareferencepoint"
})
public class ATTRACTIONTYPE
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected CODENAMETYPESTRICT type;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "LIST_CONTACT_DETAILS")
    protected List<CONTACTDETAILSTYPE> listcontactdetails;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONFREETEXTTYPE> listdescription;
    @XmlElement(name = "LIST_AREA_REFERENCE_POINT")
    protected List<REFERENCEPOINTTYPE> listareareferencepoint;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setTYPE(CODENAMETYPESTRICT value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
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
     * Gets the value of the listdescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONFREETEXTTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONFREETEXTTYPE> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<DESCRIPTIONFREETEXTTYPE>();
        }
        return this.listdescription;
    }

    /**
     * Gets the value of the listareareferencepoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listareareferencepoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAREAREFERENCEPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REFERENCEPOINTTYPE }
     * 
     * 
     */
    public List<REFERENCEPOINTTYPE> getLISTAREAREFERENCEPOINT() {
        if (listareareferencepoint == null) {
            listareareferencepoint = new ArrayList<REFERENCEPOINTTYPE>();
        }
        return this.listareareferencepoint;
    }

}
