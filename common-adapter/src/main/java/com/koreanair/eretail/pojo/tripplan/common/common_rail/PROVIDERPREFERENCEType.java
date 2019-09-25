
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the provider preference rule
 * 
 * <p>Java class for PROVIDER_PREFERENCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROVIDER_PREFERENCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}RULE_ID"/&gt;
 *         &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RULE_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="APPLY_TO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="I|O|IO"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPLY_TO_UPDATED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{}DISPLAY_RANK"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROVIDER_PREFERENCE_Type", propOrder = {
    "ruleid",
    "priority",
    "ruledescription",
    "applyto",
    "applytoupdated",
    "displayrank"
})
public class PROVIDERPREFERENCEType
    implements Serializable
{

    @XmlElement(name = "RULE_ID", required = true)
    protected String ruleid;
    @XmlElement(name = "PRIORITY", required = true)
    protected BigInteger priority;
    @XmlElement(name = "RULE_DESCRIPTION", required = true)
    protected String ruledescription;
    @XmlElement(name = "APPLY_TO", required = true)
    protected String applyto;
    @XmlElement(name = "APPLY_TO_UPDATED")
    protected boolean applytoupdated;
    @XmlElement(name = "DISPLAY_RANK", required = true)
    protected String displayrank;

    /**
     * Gets the value of the ruleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRULEID() {
        return ruleid;
    }

    /**
     * Sets the value of the ruleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRULEID(String value) {
        this.ruleid = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRIORITY(BigInteger value) {
        this.priority = value;
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
     * Gets the value of the applyto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLYTO() {
        return applyto;
    }

    /**
     * Sets the value of the applyto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLYTO(String value) {
        this.applyto = value;
    }

    /**
     * Gets the value of the applytoupdated property.
     * 
     */
    public boolean isAPPLYTOUPDATED() {
        return applytoupdated;
    }

    /**
     * Sets the value of the applytoupdated property.
     * 
     */
    public void setAPPLYTOUPDATED(boolean value) {
        this.applytoupdated = value;
    }

    /**
     * Gets the value of the displayrank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRANK() {
        return displayrank;
    }

    /**
     * Sets the value of the displayrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRANK(String value) {
        this.displayrank = value;
    }

}
