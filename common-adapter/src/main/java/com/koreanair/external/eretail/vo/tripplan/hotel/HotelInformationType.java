
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.CodeNameType;


/**
 * Hotel item simple type (code, name)
 * 
 * <p>Java class for HotelInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CodeNameType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DIRECTION" type="{}CodeNameType" minOccurs="0"/&gt;
 *                   &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TELEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInformationType", propOrder = {
    "gdscode",
    "address",
    "phonenumber",
    "telexnumber",
    "faxnumber",
    "status"
})
public class HotelInformationType
    extends CodeNameType
    implements Serializable
{

    @XmlElement(name = "GDS_CODE")
    protected String gdscode;
    @XmlElement(name = "ADDRESS")
    protected HotelInformationType.ADDRESS address;
    @XmlElement(name = "PHONE_NUMBER")
    protected String phonenumber;
    @XmlElement(name = "TELEX_NUMBER")
    protected String telexnumber;
    @XmlElement(name = "FAX_NUMBER")
    protected String faxnumber;
    @XmlElement(name = "STATUS")
    protected String status;

    /**
     * Gets the value of the gdscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSCODE() {
        return gdscode;
    }

    /**
     * Sets the value of the gdscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSCODE(String value) {
        this.gdscode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInformationType.ADDRESS }
     *     
     */
    public HotelInformationType.ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInformationType.ADDRESS }
     *     
     */
    public void setADDRESS(HotelInformationType.ADDRESS value) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DIRECTION" type="{}CodeNameType" minOccurs="0"/&gt;
     *         &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "suite",
        "streetno",
        "streetnosuffix",
        "direction",
        "pobox",
        "station",
        "rrnumber",
        "firstaddressline",
        "secondaddressline",
        "zipcode",
        "city",
        "state",
        "country",
        "countrycode"
    })
    public static class ADDRESS
        implements Serializable
    {

        @XmlElement(name = "SUITE")
        protected String suite;
        @XmlElement(name = "STREET_NO")
        protected String streetno;
        @XmlElement(name = "STREET_NO_SUFFIX")
        protected String streetnosuffix;
        @XmlElement(name = "DIRECTION")
        protected CodeNameType direction;
        @XmlElement(name = "PO_BOX")
        protected String pobox;
        @XmlElement(name = "STATION")
        protected String station;
        @XmlElement(name = "RR_NUMBER")
        protected String rrnumber;
        @XmlElement(name = "FIRST_ADDRESS_LINE")
        protected String firstaddressline;
        @XmlElement(name = "SECOND_ADDRESS_LINE")
        protected String secondaddressline;
        @XmlElement(name = "ZIP_CODE")
        protected String zipcode;
        @XmlElement(name = "CITY")
        protected String city;
        @XmlElement(name = "STATE")
        protected String state;
        @XmlElement(name = "COUNTRY")
        protected String country;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;

        /**
         * Gets the value of the suite property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUITE() {
            return suite;
        }

        /**
         * Sets the value of the suite property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUITE(String value) {
            this.suite = value;
        }

        /**
         * Gets the value of the streetno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTREETNO() {
            return streetno;
        }

        /**
         * Sets the value of the streetno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTREETNO(String value) {
            this.streetno = value;
        }

        /**
         * Gets the value of the streetnosuffix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTREETNOSUFFIX() {
            return streetnosuffix;
        }

        /**
         * Sets the value of the streetnosuffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTREETNOSUFFIX(String value) {
            this.streetnosuffix = value;
        }

        /**
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link CodeNameType }
         *     
         */
        public CodeNameType getDIRECTION() {
            return direction;
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeNameType }
         *     
         */
        public void setDIRECTION(CodeNameType value) {
            this.direction = value;
        }

        /**
         * Gets the value of the pobox property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOBOX() {
            return pobox;
        }

        /**
         * Sets the value of the pobox property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOBOX(String value) {
            this.pobox = value;
        }

        /**
         * Gets the value of the station property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATION() {
            return station;
        }

        /**
         * Sets the value of the station property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATION(String value) {
            this.station = value;
        }

        /**
         * Gets the value of the rrnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRRNUMBER() {
            return rrnumber;
        }

        /**
         * Sets the value of the rrnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRRNUMBER(String value) {
            this.rrnumber = value;
        }

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

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATE() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATE(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRY() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRY(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

    }

}
