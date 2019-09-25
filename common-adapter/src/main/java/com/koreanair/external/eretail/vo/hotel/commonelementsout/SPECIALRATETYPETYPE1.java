
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Special rate type
 * 
 * <p>Java class for SPECIAL_RATE_TYPE_TYPE_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPECIAL_RATE_TYPE_TYPE_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROMO_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RATE_DESCRIPTION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPECIAL_RATE_TYPE_TYPE_1", propOrder = {
    "code",
    "name",
    "promocode",
    "ratedescriptionavailable"
})
@XmlSeeAlso({
    SPECIALRATETYPETYPE2 .class
})
public class SPECIALRATETYPETYPE1
    implements Serializable
{

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "PROMO_CODE")
    protected String promocode;
    @XmlElement(name = "RATE_DESCRIPTION_AVAILABLE")
    protected Boolean ratedescriptionavailable;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the promocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMOCODE() {
        return promocode;
    }

    /**
     * Sets the value of the promocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMOCODE(String value) {
        this.promocode = value;
    }

    /**
     * Gets the value of the ratedescriptionavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRATEDESCRIPTIONAVAILABLE() {
        return ratedescriptionavailable;
    }

    /**
     * Sets the value of the ratedescriptionavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRATEDESCRIPTIONAVAILABLE(Boolean value) {
        this.ratedescriptionavailable = value;
    }

}
