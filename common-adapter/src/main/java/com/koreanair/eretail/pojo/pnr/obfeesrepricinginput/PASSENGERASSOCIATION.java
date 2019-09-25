
package com.koreanair.eretail.pojo.pnr.obfeesrepricinginput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure allow to specify the break down per passender allicable amount with a given (fop type, cc number) 
 * 						
 * 
 * <p>Java class for PASSENGER_ASSOCIATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PASSENGER_ASSOCIATION"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FOR_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FOP_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FOP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FOP_CC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOP_CC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PASSENGER_ASSOCIATION", propOrder = {
    "passengerid",
    "forinfant",
    "fopamount",
    "foptype",
    "fopccnumber",
    "fopccid"
})
public class PASSENGERASSOCIATION
    implements Serializable
{

    @XmlElement(name = "PASSENGER_ID", required = true)
    protected String passengerid;
    @XmlElement(name = "FOR_INFANT")
    protected Boolean forinfant;
    @XmlElement(name = "FOP_AMOUNT")
    protected Float fopamount;
    @XmlElement(name = "FOP_TYPE", required = true)
    protected String foptype;
    @XmlElement(name = "FOP_CC_NUMBER")
    protected String fopccnumber;
    @XmlElement(name = "FOP_CC_ID")
    protected String fopccid;

    /**
     * Gets the value of the passengerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSENGERID() {
        return passengerid;
    }

    /**
     * Sets the value of the passengerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSENGERID(String value) {
        this.passengerid = value;
    }

    /**
     * Gets the value of the forinfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORINFANT() {
        return forinfant;
    }

    /**
     * Sets the value of the forinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORINFANT(Boolean value) {
        this.forinfant = value;
    }

    /**
     * Gets the value of the fopamount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFOPAMOUNT() {
        return fopamount;
    }

    /**
     * Sets the value of the fopamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFOPAMOUNT(Float value) {
        this.fopamount = value;
    }

    /**
     * Gets the value of the foptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPTYPE() {
        return foptype;
    }

    /**
     * Sets the value of the foptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPTYPE(String value) {
        this.foptype = value;
    }

    /**
     * Gets the value of the fopccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPCCNUMBER() {
        return fopccnumber;
    }

    /**
     * Sets the value of the fopccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPCCNUMBER(String value) {
        this.fopccnumber = value;
    }

    /**
     * Gets the value of the fopccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPCCID() {
        return fopccid;
    }

    /**
     * Sets the value of the fopccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPCCID(String value) {
        this.fopccid = value;
    }

}
