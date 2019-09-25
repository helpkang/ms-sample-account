
package com.koreanair.eretail.pojo.tripplan.etr_car;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrAddressType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrCommonElementsType;


/**
 * <p>Java class for etrCar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrCar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERVICE_PROVIDER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REF" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="START" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType"/&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER_LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="END" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType"/&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER_LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VEHICLE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SPECIAL_EQUIPMENT" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VEHICLE_TYPE_CODE" type="{}etrAlphaNumericType"/&gt;
 *                   &lt;element name="VEHICLE_DESCRIPTION" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RATE_CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="RATE_CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELIVRY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="SITE_ID" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="SITE_NAME" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COLLECTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="SITE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="SITE_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOUCHER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *                   &lt;element name="DECIMAL_PLACE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="BILLING_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER_REFERENCE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrCar", propOrder = {
    "serviceprovider",
    "start",
    "end",
    "vehicle",
    "rate",
    "delivry",
    "collection",
    "voucher"
})
public class EtrCar
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrCar.SERVICEPROVIDER serviceprovider;
    @XmlElement(name = "START")
    protected EtrCar.START start;
    @XmlElement(name = "END")
    protected EtrCar.END end;
    @XmlElement(name = "VEHICLE")
    protected EtrCar.VEHICLE vehicle;
    @XmlElement(name = "RATE")
    protected EtrCar.RATE rate;
    @XmlElement(name = "DELIVRY")
    protected EtrCar.DELIVRY delivry;
    @XmlElement(name = "COLLECTION")
    protected EtrCar.COLLECTION collection;
    @XmlElement(name = "VOUCHER")
    protected EtrCar.VOUCHER voucher;

    /**
     * Gets the value of the serviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.SERVICEPROVIDER }
     *     
     */
    public EtrCar.SERVICEPROVIDER getSERVICEPROVIDER() {
        return serviceprovider;
    }

    /**
     * Sets the value of the serviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.SERVICEPROVIDER }
     *     
     */
    public void setSERVICEPROVIDER(EtrCar.SERVICEPROVIDER value) {
        this.serviceprovider = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.START }
     *     
     */
    public EtrCar.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.START }
     *     
     */
    public void setSTART(EtrCar.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.END }
     *     
     */
    public EtrCar.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.END }
     *     
     */
    public void setEND(EtrCar.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.VEHICLE }
     *     
     */
    public EtrCar.VEHICLE getVEHICLE() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.VEHICLE }
     *     
     */
    public void setVEHICLE(EtrCar.VEHICLE value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.RATE }
     *     
     */
    public EtrCar.RATE getRATE() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.RATE }
     *     
     */
    public void setRATE(EtrCar.RATE value) {
        this.rate = value;
    }

    /**
     * Gets the value of the delivry property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.DELIVRY }
     *     
     */
    public EtrCar.DELIVRY getDELIVRY() {
        return delivry;
    }

    /**
     * Sets the value of the delivry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.DELIVRY }
     *     
     */
    public void setDELIVRY(EtrCar.DELIVRY value) {
        this.delivry = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.COLLECTION }
     *     
     */
    public EtrCar.COLLECTION getCOLLECTION() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.COLLECTION }
     *     
     */
    public void setCOLLECTION(EtrCar.COLLECTION value) {
        this.collection = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link EtrCar.VOUCHER }
     *     
     */
    public EtrCar.VOUCHER getVOUCHER() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrCar.VOUCHER }
     *     
     */
    public void setVOUCHER(EtrCar.VOUCHER value) {
        this.voucher = value;
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
     *         &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
     *         &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="SITE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SITE_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "address",
        "phonenumber",
        "siteid",
        "sitename"
    })
    public static class COLLECTION
        implements Serializable
    {

        @XmlElement(name = "ADDRESS")
        protected EtrAddressType address;
        @XmlElement(name = "PHONE_NUMBER")
        protected String phonenumber;
        @XmlElement(name = "SITE_ID")
        protected String siteid;
        @XmlElement(name = "SITE_NAME")
        protected String sitename;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link EtrAddressType }
         *     
         */
        public EtrAddressType getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrAddressType }
         *     
         */
        public void setADDRESS(EtrAddressType value) {
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
         * Gets the value of the siteid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSITEID() {
            return siteid;
        }

        /**
         * Sets the value of the siteid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSITEID(String value) {
            this.siteid = value;
        }

        /**
         * Gets the value of the sitename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSITENAME() {
            return sitename;
        }

        /**
         * Sets the value of the sitename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSITENAME(String value) {
            this.sitename = value;
        }

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
     *         &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
     *         &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="SITE_ID" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="SITE_NAME" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
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
        "address",
        "phonenumber",
        "siteid",
        "sitename"
    })
    public static class DELIVRY
        implements Serializable
    {

        @XmlElement(name = "ADDRESS")
        protected EtrAddressType address;
        @XmlElement(name = "PHONE_NUMBER")
        protected String phonenumber;
        @XmlElement(name = "SITE_ID")
        protected String siteid;
        @XmlElement(name = "SITE_NAME")
        protected String sitename;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link EtrAddressType }
         *     
         */
        public EtrAddressType getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrAddressType }
         *     
         */
        public void setADDRESS(EtrAddressType value) {
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
         * Gets the value of the siteid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSITEID() {
            return siteid;
        }

        /**
         * Sets the value of the siteid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSITEID(String value) {
            this.siteid = value;
        }

        /**
         * Gets the value of the sitename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSITENAME() {
            return sitename;
        }

        /**
         * Sets the value of the sitename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSITENAME(String value) {
            this.sitename = value;
        }

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
     *         &lt;element name="ADDRESS" type="{}etrAddressType"/&gt;
     *         &lt;element name="DATE_TIME" type="{}OutputDateType"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER_LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "address",
        "datetime",
        "locationcode",
        "phonenumber",
        "providerlocationcode"
    })
    public static class END
        implements Serializable
    {

        @XmlElement(name = "ADDRESS", required = true)
        protected EtrAddressType address;
        @XmlElement(name = "DATE_TIME", required = true)
        protected OutputDateType datetime;
        @XmlElement(name = "LOCATION_CODE", required = true)
        protected String locationcode;
        @XmlElement(name = "PHONE_NUMBER")
        protected String phonenumber;
        @XmlElement(name = "PROVIDER_LOCATION_CODE")
        protected String providerlocationcode;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link EtrAddressType }
         *     
         */
        public EtrAddressType getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrAddressType }
         *     
         */
        public void setADDRESS(EtrAddressType value) {
            this.address = value;
        }

        /**
         * Gets the value of the datetime property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getDATETIME() {
            return datetime;
        }

        /**
         * Sets the value of the datetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setDATETIME(OutputDateType value) {
            this.datetime = value;
        }

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
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
         * Gets the value of the providerlocationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDERLOCATIONCODE() {
            return providerlocationcode;
        }

        /**
         * Sets the value of the providerlocationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDERLOCATIONCODE(String value) {
            this.providerlocationcode = value;
        }

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
     *         &lt;element name="RATE_CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="RATE_CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "ratecategory",
        "ratecode",
        "description"
    })
    public static class RATE
        implements Serializable
    {

        @XmlElement(name = "RATE_CATEGORY")
        protected String ratecategory;
        @XmlElement(name = "RATE_CODE")
        protected String ratecode;
        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the ratecategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATECATEGORY() {
            return ratecategory;
        }

        /**
         * Sets the value of the ratecategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATECATEGORY(String value) {
            this.ratecategory = value;
        }

        /**
         * Gets the value of the ratecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATECODE() {
            return ratecode;
        }

        /**
         * Sets the value of the ratecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATECODE(String value) {
            this.ratecode = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

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
     *         &lt;element name="REF" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "ref",
        "code",
        "name"
    })
    public static class SERVICEPROVIDER
        implements Serializable
    {

        @XmlElement(name = "REF")
        protected String ref;
        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREF() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREF(String value) {
            this.ref = value;
        }

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
     *         &lt;element name="ADDRESS" type="{}etrAddressType"/&gt;
     *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER_LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "address",
        "datetime",
        "locationcode",
        "phonenumber",
        "providerlocationcode"
    })
    public static class START
        implements Serializable
    {

        @XmlElement(name = "ADDRESS", required = true)
        protected EtrAddressType address;
        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;
        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "PHONE_NUMBER")
        protected String phonenumber;
        @XmlElement(name = "PROVIDER_LOCATION_CODE")
        protected String providerlocationcode;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link EtrAddressType }
         *     
         */
        public EtrAddressType getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrAddressType }
         *     
         */
        public void setADDRESS(EtrAddressType value) {
            this.address = value;
        }

        /**
         * Gets the value of the datetime property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getDATETIME() {
            return datetime;
        }

        /**
         * Sets the value of the datetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setDATETIME(OutputDateType value) {
            this.datetime = value;
        }

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
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
         * Gets the value of the providerlocationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDERLOCATIONCODE() {
            return providerlocationcode;
        }

        /**
         * Sets the value of the providerlocationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDERLOCATIONCODE(String value) {
            this.providerlocationcode = value;
        }

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
     *         &lt;element name="LIST_SPECIAL_EQUIPMENT" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VEHICLE_TYPE_CODE" type="{}etrAlphaNumericType"/&gt;
     *         &lt;element name="VEHICLE_DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
        "listspecialequipment",
        "vehicletypecode",
        "vehicledescription"
    })
    public static class VEHICLE
        implements Serializable
    {

        @XmlElement(name = "LIST_SPECIAL_EQUIPMENT")
        protected List<EtrCar.VEHICLE.LISTSPECIALEQUIPMENT> listspecialequipment;
        @XmlElement(name = "VEHICLE_TYPE_CODE", required = true)
        protected String vehicletypecode;
        @XmlElement(name = "VEHICLE_DESCRIPTION", required = true)
        protected String vehicledescription;

        /**
         * Gets the value of the listspecialequipment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listspecialequipment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSPECIALEQUIPMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrCar.VEHICLE.LISTSPECIALEQUIPMENT }
         * 
         * 
         */
        public List<EtrCar.VEHICLE.LISTSPECIALEQUIPMENT> getLISTSPECIALEQUIPMENT() {
            if (listspecialequipment == null) {
                listspecialequipment = new ArrayList<EtrCar.VEHICLE.LISTSPECIALEQUIPMENT>();
            }
            return this.listspecialequipment;
        }

        /**
         * Gets the value of the vehicletypecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVEHICLETYPECODE() {
            return vehicletypecode;
        }

        /**
         * Sets the value of the vehicletypecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVEHICLETYPECODE(String value) {
            this.vehicletypecode = value;
        }

        /**
         * Gets the value of the vehicledescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVEHICLEDESCRIPTION() {
            return vehicledescription;
        }

        /**
         * Sets the value of the vehicledescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVEHICLEDESCRIPTION(String value) {
            this.vehicledescription = value;
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
         *         &lt;element name="CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
         *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "code",
            "description"
        })
        public static class LISTSPECIALEQUIPMENT
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "DESCRIPTION")
            protected String description;

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
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDESCRIPTION() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDESCRIPTION(String value) {
                this.description = value;
            }

        }

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
     *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
     *         &lt;element name="DECIMAL_PLACE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="BILLING_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER_REFERENCE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
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
        "type",
        "amount",
        "currency",
        "decimalplace",
        "billingnumber",
        "providerreference"
    })
    public static class VOUCHER
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "AMOUNT")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger amount;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;
        @XmlElement(name = "DECIMAL_PLACE")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalplace;
        @XmlElement(name = "BILLING_NUMBER")
        protected String billingnumber;
        @XmlElement(name = "PROVIDER_REFERENCE")
        protected String providerreference;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAMOUNT(BigInteger value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the decimalplace property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDECIMALPLACE() {
            return decimalplace;
        }

        /**
         * Sets the value of the decimalplace property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDECIMALPLACE(BigInteger value) {
            this.decimalplace = value;
        }

        /**
         * Gets the value of the billingnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBILLINGNUMBER() {
            return billingnumber;
        }

        /**
         * Sets the value of the billingnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBILLINGNUMBER(String value) {
            this.billingnumber = value;
        }

        /**
         * Gets the value of the providerreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDERREFERENCE() {
            return providerreference;
        }

        /**
         * Sets the value of the providerreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDERREFERENCE(String value) {
            this.providerreference = value;
        }

    }

}
