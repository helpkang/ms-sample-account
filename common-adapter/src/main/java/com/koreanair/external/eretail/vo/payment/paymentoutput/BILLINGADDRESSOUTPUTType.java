
package com.koreanair.external.eretail.vo.payment.paymentoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BILLING_ADDRESS_OUTPUT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BILLING_ADDRESS_OUTPUT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STREET_LINE1" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="STREET_LINE2" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="MOBILE_PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="BUSINESS_PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BILLING_ADDRESS_OUTPUT_Type", propOrder = {
    "streetline1",
    "streetline2",
    "city",
    "country",
    "zipcode",
    "state",
    "title",
    "firstname",
    "lastname",
    "email",
    "phonenumber",
    "mobilephonenumber",
    "businessphonenumber"
})
public class BILLINGADDRESSOUTPUTType
    implements Serializable
{

    @XmlElement(name = "STREET_LINE1", required = true)
    protected Object streetline1;
    @XmlElement(name = "STREET_LINE2", required = true)
    protected Object streetline2;
    @XmlElement(name = "CITY", required = true)
    protected Object city;
    @XmlElement(name = "COUNTRY", required = true)
    protected Object country;
    @XmlElement(name = "ZIP_CODE", required = true)
    protected Object zipcode;
    @XmlElement(name = "STATE", required = true)
    protected Object state;
    @XmlElement(name = "TITLE", required = true)
    protected Object title;
    @XmlElement(name = "FIRST_NAME", required = true)
    protected Object firstname;
    @XmlElement(name = "LAST_NAME", required = true)
    protected Object lastname;
    @XmlElement(name = "EMAIL", required = true)
    protected Object email;
    @XmlElement(name = "PHONE_NUMBER", required = true)
    protected Object phonenumber;
    @XmlElement(name = "MOBILE_PHONE_NUMBER", required = true)
    protected Object mobilephonenumber;
    @XmlElement(name = "BUSINESS_PHONE_NUMBER", required = true)
    protected Object businessphonenumber;

    /**
     * Gets the value of the streetline1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTREETLINE1() {
        return streetline1;
    }

    /**
     * Sets the value of the streetline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTREETLINE1(Object value) {
        this.streetline1 = value;
    }

    /**
     * Gets the value of the streetline2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTREETLINE2() {
        return streetline2;
    }

    /**
     * Sets the value of the streetline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTREETLINE2(Object value) {
        this.streetline2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCITY(Object value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOUNTRY(Object value) {
        this.country = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getZIPCODE() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setZIPCODE(Object value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTATE(Object value) {
        this.state = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTITLE(Object value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFIRSTNAME(Object value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLASTNAME(Object value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEMAIL(Object value) {
        this.email = value;
    }

    /**
     * Gets the value of the phonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPHONENUMBER() {
        return phonenumber;
    }

    /**
     * Sets the value of the phonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPHONENUMBER(Object value) {
        this.phonenumber = value;
    }

    /**
     * Gets the value of the mobilephonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMOBILEPHONENUMBER() {
        return mobilephonenumber;
    }

    /**
     * Sets the value of the mobilephonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMOBILEPHONENUMBER(Object value) {
        this.mobilephonenumber = value;
    }

    /**
     * Gets the value of the businessphonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBUSINESSPHONENUMBER() {
        return businessphonenumber;
    }

    /**
     * Sets the value of the businessphonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBUSINESSPHONENUMBER(Object value) {
        this.businessphonenumber = value;
    }

}
