
package com.koreanair.eretail.pojo.hotel.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel Awards
 * 
 * <p>Java class for AWARD_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWARD_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AWARD_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SYMBOL" type="{}AWARD_SYMBOL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWARD_TYPE", propOrder = {
    "awardprovider",
    "rating",
    "symbol"
})
public class AWARDTYPE
    implements Serializable
{

    @XmlElement(name = "AWARD_PROVIDER")
    protected String awardprovider;
    @XmlElement(name = "RATING", required = true)
    protected String rating;
    @XmlElement(name = "SYMBOL")
    @XmlSchemaType(name = "string")
    protected AWARDSYMBOL symbol;

    /**
     * Gets the value of the awardprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWARDPROVIDER() {
        return awardprovider;
    }

    /**
     * Sets the value of the awardprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWARDPROVIDER(String value) {
        this.awardprovider = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATING() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATING(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link AWARDSYMBOL }
     *     
     */
    public AWARDSYMBOL getSYMBOL() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link AWARDSYMBOL }
     *     
     */
    public void setSYMBOL(AWARDSYMBOL value) {
        this.symbol = value;
    }

}
