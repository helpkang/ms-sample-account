
package com.koreanair.external.eretail.vo.import_git.com_amadeus_jcp_objectmodel_pnr_rebooking_waiver.waiveritem;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representation of central system locationInfo in Ticket_CheckEligibility
 * 
 * <p>Java class for waiverLocationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waiverLocationItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCATION_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="25"/&gt;
 *               &lt;enumeration value="26"/&gt;
 *               &lt;enumeration value="AIR"/&gt;
 *               &lt;enumeration value="ARE"/&gt;
 *               &lt;enumeration value="S"/&gt;
 *               &lt;enumeration value="WD"/&gt;
 *               &lt;enumeration value="Z"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waiverLocationItem", propOrder = {
    "locationtype",
    "locationcode",
    "locationlabel"
})
public class WaiverLocationItem
    implements Serializable
{

    @XmlElement(name = "LOCATION_TYPE")
    protected String locationtype;
    @XmlElement(name = "LOCATION_CODE")
    protected String locationcode;
    @XmlElement(name = "LOCATION_LABEL")
    protected String locationlabel;

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

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONCODE() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONCODE(String value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the locationlabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONLABEL() {
        return locationlabel;
    }

    /**
     * Sets the value of the locationlabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONLABEL(String value) {
        this.locationlabel = value;
    }

}
