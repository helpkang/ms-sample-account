
package com.koreanair.eretail.pojo.tripplan.etr_elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrAddressType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrCommonElementsType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrProviderType;


/**
 * ETR miscellaneous activity.
 * 
 * <p>Java class for etrMiscActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrMiscActivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEAT_NBR" type="{}etrAlphaNumericType" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_PROVIDER" type="{}etrProviderType" minOccurs="0"/&gt;
 *         &lt;element name="START" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
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
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
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
@XmlType(name = "etrMiscActivityType", propOrder = {
    "name",
    "duration",
    "seatnbr",
    "serviceprovider",
    "start",
    "end",
    "ticket"
})
public class EtrMiscActivityType
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "DURATION")
    protected String duration;
    @XmlElement(name = "SEAT_NBR")
    protected List<String> seatnbr;
    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrProviderType serviceprovider;
    @XmlElement(name = "START")
    protected EtrMiscActivityType.START start;
    @XmlElement(name = "END")
    protected EtrMiscActivityType.END end;
    @XmlElement(name = "TICKET")
    protected EtrMiscActivityType.TICKET ticket;

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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURATION(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the seatnbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatnbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSEATNBR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSEATNBR() {
        if (seatnbr == null) {
            seatnbr = new ArrayList<String>();
        }
        return this.seatnbr;
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
     *     {@link EtrMiscActivityType.START }
     *     
     */
    public EtrMiscActivityType.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscActivityType.START }
     *     
     */
    public void setSTART(EtrMiscActivityType.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscActivityType.END }
     *     
     */
    public EtrMiscActivityType.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscActivityType.END }
     *     
     */
    public void setEND(EtrMiscActivityType.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscActivityType.TICKET }
     *     
     */
    public EtrMiscActivityType.TICKET getTICKET() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscActivityType.TICKET }
     *     
     */
    public void setTICKET(EtrMiscActivityType.TICKET value) {
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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
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
        "locationcode",
        "address"
    })
    public static class END
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;
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
        "locationcode",
        "address"
    })
    public static class START
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;
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
