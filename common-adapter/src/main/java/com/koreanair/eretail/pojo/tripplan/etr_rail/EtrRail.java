
package com.koreanair.eretail.pojo.tripplan.etr_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrCommonElementsType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrMileageType;


/**
 * <p>Java class for etrRail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrRail"&gt;
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
 *         &lt;element name="BOOKING_CLASS" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *         &lt;element name="IDENTIFIER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *         &lt;element name="START"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LOCATION_CODE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="END"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LOCATION_CODE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{}unprotectedStringType"/&gt;
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
 *                   &lt;element name="CODE" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MILEAGE" type="{}etrMileageType" minOccurs="0"/&gt;
 *         &lt;element name="TICKET" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NUMBER" type="{}etrAlphaNumericType"/&gt;
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
@XmlType(name = "etrRail", propOrder = {
    "serviceprovider",
    "bookingclass",
    "identifier",
    "start",
    "end",
    "vehicle",
    "mileage",
    "ticket"
})
public class EtrRail
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrRail.SERVICEPROVIDER serviceprovider;
    @XmlElement(name = "BOOKING_CLASS")
    protected String bookingclass;
    @XmlElement(name = "IDENTIFIER")
    protected String identifier;
    @XmlElement(name = "START", required = true)
    protected EtrRail.START start;
    @XmlElement(name = "END", required = true)
    protected EtrRail.END end;
    @XmlElement(name = "VEHICLE")
    protected EtrRail.VEHICLE vehicle;
    @XmlElement(name = "MILEAGE")
    protected EtrMileageType mileage;
    @XmlElement(name = "TICKET")
    protected EtrRail.TICKET ticket;

    /**
     * Gets the value of the serviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link EtrRail.SERVICEPROVIDER }
     *     
     */
    public EtrRail.SERVICEPROVIDER getSERVICEPROVIDER() {
        return serviceprovider;
    }

    /**
     * Sets the value of the serviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrRail.SERVICEPROVIDER }
     *     
     */
    public void setSERVICEPROVIDER(EtrRail.SERVICEPROVIDER value) {
        this.serviceprovider = value;
    }

    /**
     * Gets the value of the bookingclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGCLASS() {
        return bookingclass;
    }

    /**
     * Sets the value of the bookingclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGCLASS(String value) {
        this.bookingclass = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFIER() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFIER(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link EtrRail.START }
     *     
     */
    public EtrRail.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrRail.START }
     *     
     */
    public void setSTART(EtrRail.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrRail.END }
     *     
     */
    public EtrRail.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrRail.END }
     *     
     */
    public void setEND(EtrRail.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link EtrRail.VEHICLE }
     *     
     */
    public EtrRail.VEHICLE getVEHICLE() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrRail.VEHICLE }
     *     
     */
    public void setVEHICLE(EtrRail.VEHICLE value) {
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
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link EtrRail.TICKET }
     *     
     */
    public EtrRail.TICKET getTICKET() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrRail.TICKET }
     *     
     */
    public void setTICKET(EtrRail.TICKET value) {
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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LOCATION_CODE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{}unprotectedStringType"/&gt;
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
        "locationcodetype",
        "locationname"
    })
    public static class END
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME", required = true)
        protected OutputDateType datetime;
        @XmlElement(name = "LOCATION_CODE", required = true)
        protected String locationcode;
        @XmlElement(name = "LOCATION_CODE_TYPE")
        protected String locationcodetype;
        @XmlElement(name = "LOCATION_NAME", required = true)
        protected String locationname;

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
         * Gets the value of the locationcodetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODETYPE() {
            return locationcodetype;
        }

        /**
         * Sets the value of the locationcodetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODETYPE(String value) {
            this.locationcodetype = value;
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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LOCATION_CODE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{}unprotectedStringType"/&gt;
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
        "locationcodetype",
        "locationname"
    })
    public static class START
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME", required = true)
        protected OutputDateType datetime;
        @XmlElement(name = "LOCATION_CODE", required = true)
        protected String locationcode;
        @XmlElement(name = "LOCATION_CODE_TYPE")
        protected String locationcodetype;
        @XmlElement(name = "LOCATION_NAME", required = true)
        protected String locationname;

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
         * Gets the value of the locationcodetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODETYPE() {
            return locationcodetype;
        }

        /**
         * Sets the value of the locationcodetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODETYPE(String value) {
            this.locationcodetype = value;
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
     *         &lt;element name="NUMBER" type="{}etrAlphaNumericType"/&gt;
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

        @XmlElement(name = "NUMBER", required = true)
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
    public static class VEHICLE
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
