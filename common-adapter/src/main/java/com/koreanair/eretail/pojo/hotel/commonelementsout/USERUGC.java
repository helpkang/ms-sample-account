
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USER_UGC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USER_UGC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="GENDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COMPANY" type="{}REVIEW_COMPANY" minOccurs="0"/&gt;
 *         &lt;element name="LANGUAGE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" type="{}HTL_B_DATE" minOccurs="0"/&gt;
 *         &lt;element name="E_DATE" type="{}HTL_E_DATE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USER_UGC", propOrder = {
    "name",
    "gender",
    "company",
    "language",
    "bdate",
    "edate"
})
public class USERUGC
    implements Serializable
{

    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "GENDER")
    protected String gender;
    @XmlElement(name = "COMPANY")
    protected REVIEWCOMPANY company;
    @XmlElement(name = "LANGUAGE")
    protected String language;
    @XmlElement(name = "B_DATE")
    protected HTLBDATE bdate;
    @XmlElement(name = "E_DATE")
    protected HTLEDATE edate;

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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENDER() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENDER(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link REVIEWCOMPANY }
     *     
     */
    public REVIEWCOMPANY getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link REVIEWCOMPANY }
     *     
     */
    public void setCOMPANY(REVIEWCOMPANY value) {
        this.company = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link HTLBDATE }
     *     
     */
    public HTLBDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLBDATE }
     *     
     */
    public void setBDATE(HTLBDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link HTLEDATE }
     *     
     */
    public HTLEDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLEDATE }
     *     
     */
    public void setEDATE(HTLEDATE value) {
        this.edate = value;
    }

}
