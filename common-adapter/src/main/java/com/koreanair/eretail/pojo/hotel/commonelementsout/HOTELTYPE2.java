
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel type: simple type that contains hotel coordinates.
 * 
 * <p>Java class for HOTEL_TYPE_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_TYPE_2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="GDS_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PHONE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TELEX_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FAX_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_TYPE_2", propOrder = {
    "code",
    "gdscode",
    "name",
    "status",
    "provider",
    "address",
    "phonenumber",
    "telexnumber",
    "faxnumber"
})
public class HOTELTYPE2
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "GDS_CODE")
    protected Object gdscode;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "PROVIDER")
    protected String provider;
    @XmlElement(name = "ADDRESS")
    protected HOTELTYPE2 .ADDRESS address;
    @XmlElement(name = "PHONE_NUMBER")
    protected String phonenumber;
    @XmlElement(name = "TELEX_NUMBER")
    protected String telexnumber;
    @XmlElement(name = "FAX_NUMBER")
    protected String faxnumber;

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
     * Gets the value of the gdscode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGDSCODE() {
        return gdscode;
    }

    /**
     * Sets the value of the gdscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGDSCODE(Object value) {
        this.gdscode = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDER() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDER(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELTYPE2 .ADDRESS }
     *     
     */
    public HOTELTYPE2 .ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELTYPE2 .ADDRESS }
     *     
     */
    public void setADDRESS(HOTELTYPE2 .ADDRESS value) {
        this.address = value;
    }

    /**
     * Gets the value of the phonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONENUMBER() {
        return phonenumber;
    }

    /**
     * Sets the value of the phonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONENUMBER(String value) {
        this.phonenumber = value;
    }

    /**
     * Gets the value of the telexnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEXNUMBER() {
        return telexnumber;
    }

    /**
     * Sets the value of the telexnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEXNUMBER(String value) {
        this.telexnumber = value;
    }

    /**
     * Gets the value of the faxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNUMBER() {
        return faxnumber;
    }

    /**
     * Sets the value of the faxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNUMBER(String value) {
        this.faxnumber = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "firstaddressline",
        "secondaddressline",
        "zipcode",
        "city"
    })
    public static class ADDRESS
        implements Serializable
    {

        @XmlElement(name = "FIRST_ADDRESS_LINE", required = true)
        protected String firstaddressline;
        @XmlElement(name = "SECOND_ADDRESS_LINE")
        protected String secondaddressline;
        @XmlElement(name = "ZIP_CODE")
        protected String zipcode;
        @XmlElement(name = "CITY")
        protected String city;

        /**
         * Gets the value of the firstaddressline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTADDRESSLINE() {
            return firstaddressline;
        }

        /**
         * Sets the value of the firstaddressline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTADDRESSLINE(String value) {
            this.firstaddressline = value;
        }

        /**
         * Gets the value of the secondaddressline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSECONDADDRESSLINE() {
            return secondaddressline;
        }

        /**
         * Sets the value of the secondaddressline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSECONDADDRESSLINE(String value) {
            this.secondaddressline = value;
        }

        /**
         * Gets the value of the zipcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZIPCODE() {
            return zipcode;
        }

        /**
         * Sets the value of the zipcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZIPCODE(String value) {
            this.zipcode = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITY() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITY(String value) {
            this.city = value;
        }

    }

}
