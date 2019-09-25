
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.reservation.common.CodeNameType;


/**
 * <p>Java class for SpecialServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CHECKOUT" type="{}TimePreferenceType" minOccurs="0"/&gt;
 *         &lt;element name="CHECKIN" type="{}TimePreferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SMOKING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SPECIAL_SERVICES" type="{}CodeNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceRequestType", propOrder = {
    "checkout",
    "checkin",
    "smoking",
    "listspecialservices"
})
public class SpecialServiceRequestType
    implements Serializable
{

    @XmlElement(name = "CHECKOUT")
    protected TimePreferenceType checkout;
    @XmlElement(name = "CHECKIN")
    protected TimePreferenceType checkin;
    @XmlElement(name = "SMOKING")
    protected String smoking;
    @XmlElement(name = "LIST_SPECIAL_SERVICES")
    protected List<CodeNameType> listspecialservices;

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link TimePreferenceType }
     *     
     */
    public TimePreferenceType getCHECKOUT() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePreferenceType }
     *     
     */
    public void setCHECKOUT(TimePreferenceType value) {
        this.checkout = value;
    }

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link TimePreferenceType }
     *     
     */
    public TimePreferenceType getCHECKIN() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePreferenceType }
     *     
     */
    public void setCHECKIN(TimePreferenceType value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the smoking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMOKING() {
        return smoking;
    }

    /**
     * Sets the value of the smoking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMOKING(String value) {
        this.smoking = value;
    }

    /**
     * Gets the value of the listspecialservices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialservices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeNameType }
     * 
     * 
     */
    public List<CodeNameType> getLISTSPECIALSERVICES() {
        if (listspecialservices == null) {
            listspecialservices = new ArrayList<CodeNameType>();
        }
        return this.listspecialservices;
    }

}
