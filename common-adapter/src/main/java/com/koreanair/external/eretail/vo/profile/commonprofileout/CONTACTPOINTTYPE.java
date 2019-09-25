
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.tripplan.contact.LOCATIONTYPE;


/**
 * Contact point information 
 * 
 * <p>Java class for CONTACT_POINT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTACT_POINT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OVERSEAS_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AREA_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}CONTACT_POINT"/&gt;
 *         &lt;element name="LIST_LOCATION" type="{}LOCATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TECH_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Voice"/&gt;
 *               &lt;enumeration value="Fax"/&gt;
 *               &lt;enumeration value="Pager"/&gt;
 *               &lt;enumeration value="Mobile"/&gt;
 *               &lt;enumeration value="Email"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCATION_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Agency"/&gt;
 *               &lt;enumeration value="Home"/&gt;
 *               &lt;enumeration value="Business"/&gt;
 *               &lt;enumeration value="Other"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTACT_POINT_TYPE", propOrder = {
    "description",
    "overseascode",
    "areacode",
    "contactpoint",
    "listlocation",
    "techtype",
    "locationtype"
})
public class CONTACTPOINTTYPE
    implements Serializable
{

    @XmlElement(name = "DESCRIPTION")
    protected Object description;
    @XmlElement(name = "OVERSEAS_CODE")
    protected String overseascode;
    @XmlElement(name = "AREA_CODE")
    protected String areacode;
    @XmlElement(name = "CONTACT_POINT", required = true)
    protected CONTACTPOINT contactpoint;
    @XmlElement(name = "LIST_LOCATION")
    protected List<LOCATIONTYPE> listlocation;
    @XmlElement(name = "TECH_TYPE")
    protected String techtype;
    @XmlElement(name = "LOCATION_TYPE")
    protected String locationtype;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDESCRIPTION(Object value) {
        this.description = value;
    }

    /**
     * Gets the value of the overseascode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERSEASCODE() {
        return overseascode;
    }

    /**
     * Sets the value of the overseascode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERSEASCODE(String value) {
        this.overseascode = value;
    }

    /**
     * Gets the value of the areacode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREACODE() {
        return areacode;
    }

    /**
     * Sets the value of the areacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREACODE(String value) {
        this.areacode = value;
    }

    /**
     * Gets the value of the contactpoint property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTPOINT }
     *     
     */
    public CONTACTPOINT getCONTACTPOINT() {
        return contactpoint;
    }

    /**
     * Sets the value of the contactpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINT }
     *     
     */
    public void setCONTACTPOINT(CONTACTPOINT value) {
        this.contactpoint = value;
    }

    /**
     * Gets the value of the listlocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOCATIONTYPE }
     * 
     * 
     */
    public List<LOCATIONTYPE> getLISTLOCATION() {
        if (listlocation == null) {
            listlocation = new ArrayList<LOCATIONTYPE>();
        }
        return this.listlocation;
    }

    /**
     * Gets the value of the techtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTECHTYPE() {
        return techtype;
    }

    /**
     * Sets the value of the techtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTECHTYPE(String value) {
        this.techtype = value;
    }

    /**
     * Gets the value of the locationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONTYPE() {
        return locationtype;
    }

    /**
     * Sets the value of the locationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONTYPE(String value) {
        this.locationtype = value;
    }

}
