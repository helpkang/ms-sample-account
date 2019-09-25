
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Policy type
 * 
 * <p>Java class for HTL_POLICY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTL_POLICY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LEVEL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RANKING" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="POLICY_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTL_POLICY_TYPE", propOrder = {
    "status",
    "level",
    "ranking",
    "policyid"
})
public class HTLPOLICYTYPE
    implements Serializable
{

    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "LEVEL")
    protected String level;
    @XmlElement(name = "RANKING")
    protected String ranking;
    @XmlElement(name = "POLICY_ID")
    protected List<String> policyid;

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
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEVEL() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEVEL(String value) {
        this.level = value;
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
     * Gets the value of the policyid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOLICYID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPOLICYID() {
        if (policyid == null) {
            policyid = new ArrayList<String>();
        }
        return this.policyid;
    }

}
