
package com.koreanair.eretail.pojo.tripplan.etr_insurance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrCommonElementsType;


/**
 * <p>Java class for etrInsurance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrInsurance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INSURANCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CONTRACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="START"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType"/&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALIDITY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ZONE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{}etrAlphaNumericType" maxOccurs="198" minOccurs="0"/&gt;
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
@XmlType(name = "etrInsurance", propOrder = {
    "insurancetype",
    "contractid",
    "serviceprovider",
    "start",
    "end",
    "validity"
})
public class EtrInsurance
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "INSURANCE_TYPE", required = true)
    protected String insurancetype;
    @XmlElement(name = "CONTRACT_ID")
    protected String contractid;
    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrInsurance.SERVICEPROVIDER serviceprovider;
    @XmlElement(name = "START", required = true)
    protected EtrInsurance.START start;
    @XmlElement(name = "END", required = true)
    protected EtrInsurance.END end;
    @XmlElement(name = "VALIDITY")
    protected EtrInsurance.VALIDITY validity;

    /**
     * Gets the value of the insurancetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURANCETYPE() {
        return insurancetype;
    }

    /**
     * Sets the value of the insurancetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURANCETYPE(String value) {
        this.insurancetype = value;
    }

    /**
     * Gets the value of the contractid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTID() {
        return contractid;
    }

    /**
     * Sets the value of the contractid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTID(String value) {
        this.contractid = value;
    }

    /**
     * Gets the value of the serviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link EtrInsurance.SERVICEPROVIDER }
     *     
     */
    public EtrInsurance.SERVICEPROVIDER getSERVICEPROVIDER() {
        return serviceprovider;
    }

    /**
     * Sets the value of the serviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrInsurance.SERVICEPROVIDER }
     *     
     */
    public void setSERVICEPROVIDER(EtrInsurance.SERVICEPROVIDER value) {
        this.serviceprovider = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link EtrInsurance.START }
     *     
     */
    public EtrInsurance.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrInsurance.START }
     *     
     */
    public void setSTART(EtrInsurance.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrInsurance.END }
     *     
     */
    public EtrInsurance.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrInsurance.END }
     *     
     */
    public void setEND(EtrInsurance.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link EtrInsurance.VALIDITY }
     *     
     */
    public EtrInsurance.VALIDITY getVALIDITY() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrInsurance.VALIDITY }
     *     
     */
    public void setVALIDITY(EtrInsurance.VALIDITY value) {
        this.validity = value;
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

        @XmlElement(name = "DATE_TIME", required = true)
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
    public static class START
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME", required = true)
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
     *         &lt;element name="ZONE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{}etrAlphaNumericType" maxOccurs="198" minOccurs="0"/&gt;
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
        "zonecode",
        "countrycode"
    })
    public static class VALIDITY
        implements Serializable
    {

        @XmlElement(name = "ZONE_CODE")
        protected String zonecode;
        @XmlElement(name = "COUNTRY_CODE")
        protected List<String> countrycode;

        /**
         * Gets the value of the zonecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZONECODE() {
            return zonecode;
        }

        /**
         * Sets the value of the zonecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZONECODE(String value) {
            this.zonecode = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countrycode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUNTRYCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCOUNTRYCODE() {
            if (countrycode == null) {
                countrycode = new ArrayList<String>();
            }
            return this.countrycode;
        }

    }

}
