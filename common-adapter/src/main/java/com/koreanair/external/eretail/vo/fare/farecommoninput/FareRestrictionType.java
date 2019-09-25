
package com.koreanair.external.eretail.vo.fare.farecommoninput;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRestrictionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_RESTRICTION_ID" type="{}FareRestrictionID"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="RESTRICTION_VALUE_QUALIFIER"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{}unprotectedStringType"&gt;
 *                 &lt;enumeration value="P"/&gt;
 *                 &lt;enumeration value="A"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="RESTRICTION_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRestrictionType", propOrder = {
    "farerestrictionid",
    "restrictionvaluequalifier",
    "restrictionvalue"
})
public class FareRestrictionType
    implements Serializable
{

    @XmlElement(name = "FARE_RESTRICTION_ID")
    protected int farerestrictionid;
    @XmlElement(name = "RESTRICTION_VALUE_QUALIFIER")
    protected String restrictionvaluequalifier;
    @XmlElement(name = "RESTRICTION_VALUE")
    protected BigDecimal restrictionvalue;

    /**
     * Gets the value of the farerestrictionid property.
     * 
     */
    public int getFARERESTRICTIONID() {
        return farerestrictionid;
    }

    /**
     * Sets the value of the farerestrictionid property.
     * 
     */
    public void setFARERESTRICTIONID(int value) {
        this.farerestrictionid = value;
    }

    /**
     * Gets the value of the restrictionvaluequalifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESTRICTIONVALUEQUALIFIER() {
        return restrictionvaluequalifier;
    }

    /**
     * Sets the value of the restrictionvaluequalifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESTRICTIONVALUEQUALIFIER(String value) {
        this.restrictionvaluequalifier = value;
    }

    /**
     * Gets the value of the restrictionvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRESTRICTIONVALUE() {
        return restrictionvalue;
    }

    /**
     * Sets the value of the restrictionvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRESTRICTIONVALUE(BigDecimal value) {
        this.restrictionvalue = value;
    }

}
