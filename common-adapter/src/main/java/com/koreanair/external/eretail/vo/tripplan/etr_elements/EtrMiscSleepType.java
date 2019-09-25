
package com.koreanair.external.eretail.vo.tripplan.etr_elements;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;
import com.koreanair.external.eretail.vo.tripplan.common.common_etr.EtrAddressType;
import com.koreanair.external.eretail.vo.tripplan.common.common_etr.EtrCommonElementsType;
import com.koreanair.external.eretail.vo.tripplan.common.common_etr.EtrProviderType;


/**
 * ETR miscellaneous sleep.
 * 
 * <p>Java class for etrMiscSleepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrMiscSleepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDITIONAL_SERVICES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ROOM_RATE_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CANCEL_POLICIES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INCLUSIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTHER_RULES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                   &lt;element name="START_DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CHECK_OUT" minOccurs="0"&gt;
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
 *         &lt;element name="CUSTOMERS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADULTS" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element name="CHILDREN" maxOccurs="9" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                             &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                             &lt;element name="AGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GUARANTEE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYMENT_FORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEPOSIT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYMENT_FORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "etrMiscSleepType", propOrder = {
    "name",
    "additionalservices",
    "roomratedescription",
    "cancelpolicies",
    "inclusions",
    "otherrules",
    "serviceprovider",
    "start",
    "end",
    "checkin",
    "checkout",
    "customers",
    "guarantee",
    "deposit"
})
public class EtrMiscSleepType
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "ADDITIONAL_SERVICES")
    protected String additionalservices;
    @XmlElement(name = "ROOM_RATE_DESCRIPTION")
    protected String roomratedescription;
    @XmlElement(name = "CANCEL_POLICIES")
    protected String cancelpolicies;
    @XmlElement(name = "INCLUSIONS")
    protected String inclusions;
    @XmlElement(name = "OTHER_RULES")
    protected String otherrules;
    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrProviderType serviceprovider;
    @XmlElement(name = "START")
    protected EtrMiscSleepType.START start;
    @XmlElement(name = "END")
    protected EtrMiscSleepType.END end;
    @XmlElement(name = "CHECK_IN")
    protected EtrMiscSleepType.CHECKIN checkin;
    @XmlElement(name = "CHECK_OUT")
    protected EtrMiscSleepType.CHECKOUT checkout;
    @XmlElement(name = "CUSTOMERS")
    protected EtrMiscSleepType.CUSTOMERS customers;
    @XmlElement(name = "GUARANTEE")
    protected EtrMiscSleepType.GUARANTEE guarantee;
    @XmlElement(name = "DEPOSIT")
    protected EtrMiscSleepType.DEPOSIT deposit;

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
     * Gets the value of the additionalservices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDITIONALSERVICES() {
        return additionalservices;
    }

    /**
     * Sets the value of the additionalservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDITIONALSERVICES(String value) {
        this.additionalservices = value;
    }

    /**
     * Gets the value of the roomratedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROOMRATEDESCRIPTION() {
        return roomratedescription;
    }

    /**
     * Sets the value of the roomratedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROOMRATEDESCRIPTION(String value) {
        this.roomratedescription = value;
    }

    /**
     * Gets the value of the cancelpolicies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELPOLICIES() {
        return cancelpolicies;
    }

    /**
     * Sets the value of the cancelpolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELPOLICIES(String value) {
        this.cancelpolicies = value;
    }

    /**
     * Gets the value of the inclusions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCLUSIONS() {
        return inclusions;
    }

    /**
     * Sets the value of the inclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCLUSIONS(String value) {
        this.inclusions = value;
    }

    /**
     * Gets the value of the otherrules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERRULES() {
        return otherrules;
    }

    /**
     * Sets the value of the otherrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERRULES(String value) {
        this.otherrules = value;
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
     *     {@link EtrMiscSleepType.START }
     *     
     */
    public EtrMiscSleepType.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscSleepType.START }
     *     
     */
    public void setSTART(EtrMiscSleepType.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscSleepType.END }
     *     
     */
    public EtrMiscSleepType.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscSleepType.END }
     *     
     */
    public void setEND(EtrMiscSleepType.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscSleepType.CHECKIN }
     *     
     */
    public EtrMiscSleepType.CHECKIN getCHECKIN() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscSleepType.CHECKIN }
     *     
     */
    public void setCHECKIN(EtrMiscSleepType.CHECKIN value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscSleepType.CHECKOUT }
     *     
     */
    public EtrMiscSleepType.CHECKOUT getCHECKOUT() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscSleepType.CHECKOUT }
     *     
     */
    public void setCHECKOUT(EtrMiscSleepType.CHECKOUT value) {
        this.checkout = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscSleepType.CUSTOMERS }
     *     
     */
    public EtrMiscSleepType.CUSTOMERS getCUSTOMERS() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscSleepType.CUSTOMERS }
     *     
     */
    public void setCUSTOMERS(EtrMiscSleepType.CUSTOMERS value) {
        this.customers = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscSleepType.GUARANTEE }
     *     
     */
    public EtrMiscSleepType.GUARANTEE getGUARANTEE() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscSleepType.GUARANTEE }
     *     
     */
    public void setGUARANTEE(EtrMiscSleepType.GUARANTEE value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link EtrMiscSleepType.DEPOSIT }
     *     
     */
    public EtrMiscSleepType.DEPOSIT getDEPOSIT() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrMiscSleepType.DEPOSIT }
     *     
     */
    public void setDEPOSIT(EtrMiscSleepType.DEPOSIT value) {
        this.deposit = value;
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
     *         &lt;element name="START_DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
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
        "startdatetime"
    })
    public static class CHECKIN
        implements Serializable
    {

        @XmlElement(name = "START_DATE_TIME")
        protected OutputDateType startdatetime;

        /**
         * Gets the value of the startdatetime property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getSTARTDATETIME() {
            return startdatetime;
        }

        /**
         * Sets the value of the startdatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setSTARTDATETIME(OutputDateType value) {
            this.startdatetime = value;
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
    public static class CHECKOUT
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
     *         &lt;element name="ADULTS" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="CHILDREN" maxOccurs="9" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                   &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                   &lt;element name="AGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "adults",
        "children"
    })
    public static class CUSTOMERS
        implements Serializable
    {

        @XmlElement(name = "ADULTS")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger adults;
        @XmlElement(name = "CHILDREN")
        protected List<EtrMiscSleepType.CUSTOMERS.CHILDREN> children;

        /**
         * Gets the value of the adults property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getADULTS() {
            return adults;
        }

        /**
         * Sets the value of the adults property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setADULTS(BigInteger value) {
            this.adults = value;
        }

        /**
         * Gets the value of the children property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the children property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHILDREN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrMiscSleepType.CUSTOMERS.CHILDREN }
         * 
         * 
         */
        public List<EtrMiscSleepType.CUSTOMERS.CHILDREN> getCHILDREN() {
            if (children == null) {
                children = new ArrayList<EtrMiscSleepType.CUSTOMERS.CHILDREN>();
            }
            return this.children;
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
         *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *         &lt;element name="AGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "number",
            "age",
            "agecode"
        })
        public static class CHILDREN
            implements Serializable
        {

            @XmlElement(name = "NUMBER", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger number;
            @XmlElement(name = "AGE")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger age;
            @XmlElement(name = "AGE_CODE")
            protected String agecode;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBER() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBER(BigInteger value) {
                this.number = value;
            }

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAGE() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAGE(BigInteger value) {
                this.age = value;
            }

            /**
             * Gets the value of the agecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAGECODE() {
                return agecode;
            }

            /**
             * Sets the value of the agecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAGECODE(String value) {
                this.agecode = value;
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
     *         &lt;element name="PAYMENT_FORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "paymentform",
        "paymentdetails"
    })
    public static class DEPOSIT
        implements Serializable
    {

        @XmlElement(name = "PAYMENT_FORM")
        protected String paymentform;
        @XmlElement(name = "PAYMENT_DETAILS")
        protected String paymentdetails;

        /**
         * Gets the value of the paymentform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTFORM() {
            return paymentform;
        }

        /**
         * Sets the value of the paymentform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTFORM(String value) {
            this.paymentform = value;
        }

        /**
         * Gets the value of the paymentdetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTDETAILS() {
            return paymentdetails;
        }

        /**
         * Sets the value of the paymentdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTDETAILS(String value) {
            this.paymentdetails = value;
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
        "datetime"
    })
    public static class END
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;

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
     *         &lt;element name="PAYMENT_FORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "paymentform",
        "paymentdetails"
    })
    public static class GUARANTEE
        implements Serializable
    {

        @XmlElement(name = "PAYMENT_FORM")
        protected String paymentform;
        @XmlElement(name = "PAYMENT_DETAILS")
        protected String paymentdetails;

        /**
         * Gets the value of the paymentform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTFORM() {
            return paymentform;
        }

        /**
         * Sets the value of the paymentform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTFORM(String value) {
            this.paymentform = value;
        }

        /**
         * Gets the value of the paymentdetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTDETAILS() {
            return paymentdetails;
        }

        /**
         * Sets the value of the paymentdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTDETAILS(String value) {
            this.paymentdetails = value;
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

}
