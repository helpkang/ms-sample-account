
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Train Upgrade Rule information
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}RULE_ID"/&gt;
 *         &lt;element name="MIN_DURATION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MAX_CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ruleid",
    "minduration",
    "maxcabin"
})
@XmlRootElement(name = "RAIL_UPGRADE_RULE")
public class RAILUPGRADERULE
    implements Serializable
{

    @XmlElement(name = "RULE_ID", required = true)
    protected String ruleid;
    @XmlElement(name = "MIN_DURATION", required = true)
    protected BigInteger minduration;
    @XmlElement(name = "MAX_CABIN", required = true)
    protected String maxcabin;

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
     * Gets the value of the minduration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINDURATION() {
        return minduration;
    }

    /**
     * Sets the value of the minduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINDURATION(BigInteger value) {
        this.minduration = value;
    }

    /**
     * Gets the value of the maxcabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXCABIN() {
        return maxcabin;
    }

    /**
     * Sets the value of the maxcabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXCABIN(String value) {
        this.maxcabin = value;
    }

}
