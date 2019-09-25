
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
 * ETR taxi.
 * 
 * <p>Java class for etrTaxiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrTaxiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERVICE_PROVIDER" type="{}etrProviderType" minOccurs="0"/&gt;
 *         &lt;element name="START" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                   &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrTaxiType", propOrder = {
    "serviceprovider",
    "start",
    "end",
    "vehicle",
    "mileage",
    "baggage"
})
public class EtrTaxiType
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrProviderType serviceprovider;
    @XmlElement(name = "START")
    protected EtrTaxiType.START start;
    @XmlElement(name = "END")
    protected EtrTaxiType.END end;
    @XmlElement(name = "VEHICLE")
    protected EtrVehicleType vehicle;
    @XmlElement(name = "MILEAGE")
    protected EtrMileageType mileage;
    @XmlElement(name = "BAGGAGE")
    protected EtrTaxiType.BAGGAGE baggage;

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
     *     {@link EtrTaxiType.START }
     *     
     */
    public EtrTaxiType.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTaxiType.START }
     *     
     */
    public void setSTART(EtrTaxiType.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrTaxiType.END }
     *     
     */
    public EtrTaxiType.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTaxiType.END }
     *     
     */
    public void setEND(EtrTaxiType.END value) {
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
     *     {@link EtrTaxiType.BAGGAGE }
     *     
     */
    public EtrTaxiType.BAGGAGE getBAGGAGE() {
        return baggage;
    }

    /**
     * Sets the value of the baggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrTaxiType.BAGGAGE }
     *     
     */
    public void setBAGGAGE(EtrTaxiType.BAGGAGE value) {
        this.baggage = value;
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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
     *         &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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

}
