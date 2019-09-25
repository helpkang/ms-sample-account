
package com.koreanair.external.eretail.vo.farecommon.travellercommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of travelling passengers.
 * 
 * <p>Java class for INPUT_LIST_TRAVELLER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INPUT_LIST_TRAVELLER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_TYPE" type="{}INPUT_TRAVELLER_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}HAS_INFANT" minOccurs="0"/&gt;
 *         &lt;element ref="{}TITLE" minOccurs="0"/&gt;
 *         &lt;element ref="{}FIRST_NAME" minOccurs="0"/&gt;
 *         &lt;element ref="{}LAST_NAME" minOccurs="0"/&gt;
 *         &lt;element ref="{}RELATIONSHIP" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}REFERENCE" minOccurs="0"/&gt;
 *         &lt;element ref="{}DATE_OF_BIRTH" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INPUT_LIST_TRAVELLER_Type", propOrder = {
    "travellertype",
    "hasinfant",
    "title",
    "firstname",
    "lastname",
    "relationship",
    "travellerid",
    "reference",
    "dateofbirth"
})
public class INPUTLISTTRAVELLERType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_TYPE")
    protected INPUTTRAVELLERType travellertype;
    @XmlElement(name = "HAS_INFANT")
    protected Boolean hasinfant;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "RELATIONSHIP")
    protected String relationship;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "REFERENCE")
    protected BigInteger reference;
    @XmlElement(name = "DATE_OF_BIRTH")
    protected String dateofbirth;

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link INPUTTRAVELLERType }
     *     
     */
    public INPUTTRAVELLERType getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTTRAVELLERType }
     *     
     */
    public void setTRAVELLERTYPE(INPUTTRAVELLERType value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the hasinfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHASINFANT() {
        return hasinfant;
    }

    /**
     * Sets the value of the hasinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASINFANT(Boolean value) {
        this.hasinfant = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELATIONSHIP() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELATIONSHIP(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREFERENCE() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREFERENCE(BigInteger value) {
        this.reference = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFBIRTH(String value) {
        this.dateofbirth = value;
    }

}
