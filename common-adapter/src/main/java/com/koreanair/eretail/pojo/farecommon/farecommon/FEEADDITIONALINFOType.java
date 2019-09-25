
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEE_ADDITIONAL_INFO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEE_ADDITIONAL_INFO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RULE_NAME" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="RULE_DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="MODIFICATION_DATE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ITEM_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ZO_TICKET_DESIGNATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEE_ADDITIONAL_INFO_Type", propOrder = {
    "rulename",
    "ruledescription",
    "modificationdate",
    "itemid",
    "zoticketdesignator"
})
public class FEEADDITIONALINFOType
    implements Serializable
{

    @XmlElement(name = "RULE_NAME", required = true)
    protected String rulename;
    @XmlElement(name = "RULE_DESCRIPTION")
    protected String ruledescription;
    @XmlElement(name = "MODIFICATION_DATE", required = true)
    protected String modificationdate;
    @XmlElement(name = "ITEM_ID")
    protected String itemid;
    @XmlElement(name = "ZO_TICKET_DESIGNATOR")
    protected String zoticketdesignator;

    /**
     * Gets the value of the rulename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRULENAME() {
        return rulename;
    }

    /**
     * Sets the value of the rulename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRULENAME(String value) {
        this.rulename = value;
    }

    /**
     * Gets the value of the ruledescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRULEDESCRIPTION() {
        return ruledescription;
    }

    /**
     * Sets the value of the ruledescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRULEDESCRIPTION(String value) {
        this.ruledescription = value;
    }

    /**
     * Gets the value of the modificationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFICATIONDATE() {
        return modificationdate;
    }

    /**
     * Sets the value of the modificationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFICATIONDATE(String value) {
        this.modificationdate = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMID(String value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the zoticketdesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOTICKETDESIGNATOR() {
        return zoticketdesignator;
    }

    /**
     * Sets the value of the zoticketdesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOTICKETDESIGNATOR(String value) {
        this.zoticketdesignator = value;
    }

}
