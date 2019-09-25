
package com.koreanair.eretail.pojo.tripplan.etr_elements;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrAddressType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrCommonElementsType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrMileageType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrProviderType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrVehicleType;


/**
 * ETR transfer.
 * 
 * <p>Java class for etrTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrTransferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BKG_CLASS" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_PROVIDER" type="{}etrProviderType" minOccurs="0"/&gt;
 *         &lt;element name="START" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                   &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
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
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                   &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VEHICLE" type="{}etrVehicleType" minOccurs="0"/&gt;
 *         &lt;element name="MILEAGE" type="{}etrMileageType" minOccurs="0"/&gt;
 *         &lt;element name="BAGGAGE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QUANTITY" type="{}etrNumeric1To99Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CHECK_IN" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="END_DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TICKET" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
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
@XmlType(name = "etrTransferType", propOrder = {
    "bkgclass",
    "serviceprovider",
    "start",
    "end",
    "vehicle",
    "mileage",
    "baggage",
    "checkin",
    "ticket"
})
public class EtrTransferType
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "BKG_CLASS")
    protected String bkgclass;
    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrProviderType serviceprovider;
    @XmlElement(name = "START")
    protected EtrTransferType.START start;
    @XmlElement(name = "END")
    protected EtrTransferType.END end;
    @XmlElement(name = "VEHICLE")
    protected EtrVehicleType vehicle;
    @XmlElement(name = "MILEAGE")
    protected EtrMileageType mileage;
    @XmlElement(name = "BAGGAGE")
    protected EtrTransferType.BAGGAGE baggage;
    @XmlElement(name = "CHECK_IN")
    protected EtrTransferType.CHECKIN checkin;
    @XmlElement(name = "TICKET")
    protected EtrTransferType.TICKET ticket;

    /**
     * Gets the value of the bkgclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKGCLASS() {
        return bkgclass;
    }

    /**
     * Sets the value of the bkgclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKGCLASS(String value) {
        this.bkgclass = value;
    }

    /**
     * Gets the value of the serviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link EtrProviderType }
     *     
     */
    public EtrProviderType getSERVICEPROVIDER() {
        return serviceprovider;
    }

    /**
     * Sets the value of the serviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrProviderType }
     *     
     */
    public void setSERVICEPROVIDER(EtrProviderType value) {
        this.serviceprovider = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link EtrTransferType.START }
     *     
     */
    public EtrTransferType.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTransferType.START }
     *     
     */
    public void setSTART(EtrTransferType.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrTransferType.END }
     *     
     */
    public EtrTransferType.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTransferType.END }
     *     
     */
    public void setEND(EtrTransferType.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link EtrVehicleType }
     *     
     */
    public EtrVehicleType getVEHICLE() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrVehicleType }
     *     
     */
    public void setVEHICLE(EtrVehicleType value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMileageType }
     *     
     */
    public EtrMileageType getMILEAGE() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMileageType }
     *     
     */
    public void setMILEAGE(EtrMileageType value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the baggage property.
     * 
     * @return
     *     possible object is
     *     {@link EtrTransferType.BAGGAGE }
     *     
     */
    public EtrTransferType.BAGGAGE getBAGGAGE() {
        return baggage;
    }

    /**
     * Sets the value of the baggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTransferType.BAGGAGE }
     *     
     */
    public void setBAGGAGE(EtrTransferType.BAGGAGE value) {
        this.baggage = value;
    }

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link EtrTransferType.CHECKIN }
     *     
     */
    public EtrTransferType.CHECKIN getCHECKIN() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTransferType.CHECKIN }
     *     
     */
    public void setCHECKIN(EtrTransferType.CHECKIN value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link EtrTransferType.TICKET }
     *     
     */
    public EtrTransferType.TICKET getTICKET() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTransferType.TICKET }
     *     
     */
    public void setTICKET(EtrTransferType.TICKET value) {
        this.ticket = value;
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
     *         &lt;element name="QUANTITY" type="{}etrNumeric1To99Type" minOccurs="0"/&gt;
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
        "quantity"
    })
    public static class BAGGAGE
        implements Serializable
    {

        @XmlElement(name = "QUANTITY")
        @XmlSchemaType(name = "integer")
        protected Integer quantity;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQUANTITY() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQUANTITY(Integer value) {
            this.quantity = value;
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
     *         &lt;element name="END_DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
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
        "enddatetime"
    })
    public static class CHECKIN
        implements Serializable
    {

        @XmlElement(name = "END_DATE_TIME")
        protected OutputDateType enddatetime;

        /**
         * Gets the value of the enddatetime property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getENDDATETIME() {
            return enddatetime;
        }

        /**
         * Sets the value of the enddatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setENDDATETIME(OutputDateType value) {
            this.enddatetime = value;
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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
     *         &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
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
        "datetime",
        "terminal",
        "locationcode",
        "locationname",
        "address"
    })
    public static class END
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;
        @XmlElement(name = "TERMINAL")
        protected String terminal;
        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME")
        protected String locationname;
        @XmlElement(name = "ADDRESS")
        protected EtrAddressType address;

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
         * Gets the value of the terminal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTERMINAL() {
            return terminal;
        }

        /**
         * Sets the value of the terminal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTERMINAL(String value) {
            this.terminal = value;
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
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
     *         &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
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
        "datetime",
        "terminal",
        "locationcode",
        "locationname",
        "address"
    })
    public static class START
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;
        @XmlElement(name = "TERMINAL")
        protected String terminal;
        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME")
        protected String locationname;
        @XmlElement(name = "ADDRESS")
        protected EtrAddressType address;

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
         * Gets the value of the terminal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTERMINAL() {
            return terminal;
        }

        /**
         * Sets the value of the terminal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTERMINAL(String value) {
            this.terminal = value;
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
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

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
     *         &lt;element name="NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
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
        "number"
    })
    public static class TICKET
        implements Serializable
    {

        @XmlElement(name = "NUMBER")
        protected String number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBER(String value) {
            this.number = value;
        }

    }

}
