
package com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_REDEMPTION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_REDEMPTION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUBTYPE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRIP_PRICE" type="{}REDEMPTION_TRIP_PRICE_Type" minOccurs="0"/&gt;
 *         &lt;element name="ADDITIONAL_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ALL_INCLUSIVE_ELIGIBILITY" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="MILES_OPEN_CONNECTOR_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
@XmlType(name = "LIST_REDEMPTION_Type", propOrder = {
    "type",
    "subtype",
    "tripprice",
    "additionalinformation"
})
public class LISTREDEMPTIONType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected LISTREDEMPTIONType.TYPE type;
    @XmlElement(name = "SUBTYPE", required = true)
    protected LISTREDEMPTIONType.SUBTYPE subtype;
    @XmlElement(name = "TRIP_PRICE")
    protected REDEMPTIONTRIPPRICEType tripprice;
    @XmlElement(name = "ADDITIONAL_INFORMATION")
    protected LISTREDEMPTIONType.ADDITIONALINFORMATION additionalinformation;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LISTREDEMPTIONType.TYPE }
     *     
     */
    public LISTREDEMPTIONType.TYPE getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTREDEMPTIONType.TYPE }
     *     
     */
    public void setTYPE(LISTREDEMPTIONType.TYPE value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link LISTREDEMPTIONType.SUBTYPE }
     *     
     */
    public LISTREDEMPTIONType.SUBTYPE getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTREDEMPTIONType.SUBTYPE }
     *     
     */
    public void setSUBTYPE(LISTREDEMPTIONType.SUBTYPE value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the tripprice property.
     * 
     * @return
     *     possible object is
     *     {@link REDEMPTIONTRIPPRICEType }
     *     
     */
    public REDEMPTIONTRIPPRICEType getTRIPPRICE() {
        return tripprice;
    }

    /**
     * Sets the value of the tripprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDEMPTIONTRIPPRICEType }
     *     
     */
    public void setTRIPPRICE(REDEMPTIONTRIPPRICEType value) {
        this.tripprice = value;
    }

    /**
     * Gets the value of the additionalinformation property.
     * 
     * @return
     *     possible object is
     *     {@link LISTREDEMPTIONType.ADDITIONALINFORMATION }
     *     
     */
    public LISTREDEMPTIONType.ADDITIONALINFORMATION getADDITIONALINFORMATION() {
        return additionalinformation;
    }

    /**
     * Sets the value of the additionalinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTREDEMPTIONType.ADDITIONALINFORMATION }
     *     
     */
    public void setADDITIONALINFORMATION(LISTREDEMPTIONType.ADDITIONALINFORMATION value) {
        this.additionalinformation = value;
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
     *         &lt;element name="ALL_INCLUSIVE_ELIGIBILITY" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="MILES_OPEN_CONNECTOR_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "allinclusiveeligibility",
        "milesopenconnectorstatus"
    })
    public static class ADDITIONALINFORMATION
        implements Serializable
    {

        @XmlElement(name = "ALL_INCLUSIVE_ELIGIBILITY")
        protected boolean allinclusiveeligibility;
        @XmlElement(name = "MILES_OPEN_CONNECTOR_STATUS")
        protected String milesopenconnectorstatus;

        /**
         * Gets the value of the allinclusiveeligibility property.
         * 
         */
        public boolean isALLINCLUSIVEELIGIBILITY() {
            return allinclusiveeligibility;
        }

        /**
         * Sets the value of the allinclusiveeligibility property.
         * 
         */
        public void setALLINCLUSIVEELIGIBILITY(boolean value) {
            this.allinclusiveeligibility = value;
        }

        /**
         * Gets the value of the milesopenconnectorstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMILESOPENCONNECTORSTATUS() {
            return milesopenconnectorstatus;
        }

        /**
         * Sets the value of the milesopenconnectorstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMILESOPENCONNECTORSTATUS(String value) {
            this.milesopenconnectorstatus = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "name"
    })
    public static class SUBTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "name"
    })
    public static class TYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

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

}
