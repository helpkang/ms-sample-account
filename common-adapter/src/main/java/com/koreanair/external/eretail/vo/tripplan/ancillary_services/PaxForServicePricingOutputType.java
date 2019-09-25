
package com.koreanair.external.eretail.vo.tripplan.ancillary_services;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paxForServicePricingOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paxForServicePricingOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FIRST_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TITLE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="INFANT_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFANT_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFANT_DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paxForServicePricingOutputType", propOrder = {
    "travellerid",
    "firstname",
    "lastname",
    "title",
    "typecode",
    "infantfirstname",
    "infantlastname",
    "infantdateofbirth"
})
public class PaxForServicePricingOutputType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "TYPE_CODE")
    protected String typecode;
    @XmlElement(name = "INFANT_FIRST_NAME")
    protected String infantfirstname;
    @XmlElement(name = "INFANT_LAST_NAME")
    protected String infantlastname;
    @XmlElement(name = "INFANT_DATE_OF_BIRTH")
    protected Boolean infantdateofbirth;

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
     * Gets the value of the typecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPECODE() {
        return typecode;
    }

    /**
     * Sets the value of the typecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPECODE(String value) {
        this.typecode = value;
    }

    /**
     * Gets the value of the infantfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFANTFIRSTNAME() {
        return infantfirstname;
    }

    /**
     * Sets the value of the infantfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFANTFIRSTNAME(String value) {
        this.infantfirstname = value;
    }

    /**
     * Gets the value of the infantlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFANTLASTNAME() {
        return infantlastname;
    }

    /**
     * Sets the value of the infantlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFANTLASTNAME(String value) {
        this.infantlastname = value;
    }

    /**
     * Gets the value of the infantdateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINFANTDATEOFBIRTH() {
        return infantdateofbirth;
    }

    /**
     * Sets the value of the infantdateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINFANTDATEOFBIRTH(Boolean value) {
        this.infantdateofbirth = value;
    }

}
