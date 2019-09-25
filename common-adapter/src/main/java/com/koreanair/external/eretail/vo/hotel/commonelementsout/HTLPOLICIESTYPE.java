
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Policy Type
 * 
 * <p>Java class for HTL_POLICIES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTL_POLICIES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}POLICY_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}POLICY_COMPANY" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRAVELLER_PREFERENCES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTL_POLICIES_TYPE", propOrder = {
    "policyagency",
    "policycompany",
    "travellerpreferences"
})
public class HTLPOLICIESTYPE
    implements Serializable
{

    @XmlElement(name = "POLICY_AGENCY")
    protected HTLPOLICYTYPE policyagency;
    @XmlElement(name = "POLICY_COMPANY")
    protected HTLPOLICYTYPE policycompany;
    @XmlElement(name = "TRAVELLER_PREFERENCES")
    protected TRAVELLERPREFERENCETYPE travellerpreferences;

    /**
     * Gets the value of the policyagency property.
     * 
     * @return
     *     possible object is
     *     {@link HTLPOLICYTYPE }
     *     
     */
    public HTLPOLICYTYPE getPOLICYAGENCY() {
        return policyagency;
    }

    /**
     * Sets the value of the policyagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLPOLICYTYPE }
     *     
     */
    public void setPOLICYAGENCY(HTLPOLICYTYPE value) {
        this.policyagency = value;
    }

    /**
     * Gets the value of the policycompany property.
     * 
     * @return
     *     possible object is
     *     {@link HTLPOLICYTYPE }
     *     
     */
    public HTLPOLICYTYPE getPOLICYCOMPANY() {
        return policycompany;
    }

    /**
     * Sets the value of the policycompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLPOLICYTYPE }
     *     
     */
    public void setPOLICYCOMPANY(HTLPOLICYTYPE value) {
        this.policycompany = value;
    }

    /**
     * Gets the value of the travellerpreferences property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELLERPREFERENCETYPE }
     *     
     */
    public TRAVELLERPREFERENCETYPE getTRAVELLERPREFERENCES() {
        return travellerpreferences;
    }

    /**
     * Sets the value of the travellerpreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELLERPREFERENCETYPE }
     *     
     */
    public void setTRAVELLERPREFERENCES(TRAVELLERPREFERENCETYPE value) {
        this.travellerpreferences = value;
    }

}
