
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional services
 * 
 * <p>Java class for SERVICE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="SERVICE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WEIGHT" type="{}WEIGHT_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="DIMENSION" type="{}DIMENSION_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="PROPERTIES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PROPERTY" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_PARAMETER" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FREETEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOLDER_ELEMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_INFANT_SERVICE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_DUMMY_PAX_ASSOCIATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HAS_OWNER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ORIGIN_CITY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DESTINATION_CITY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALIDITY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICE_type", propOrder = {

})
public class SERVICEType implements Serializable
{

    @XmlElement(name = "SERVICE_TYPE")
    protected String servicetype;
    @XmlElement(name = "SERVICE_ID")
    protected Object serviceid;
    @XmlElement(name = "INDEX")
    protected BigInteger index;
    @XmlElement(name = "TYPE")
    protected CODENAMEPAIRTYPE type;
    @XmlElement(name = "NUMBER")
    protected BigInteger number;
    @XmlElement(name = "WEIGHT")
    protected WEIGHTTYPEPROFILE weight;
    @XmlElement(name = "DIMENSION")
    protected DIMENSIONTYPEPROFILE dimension;
    @XmlElement(name = "PROPERTIES")
    protected SERVICEType.PROPERTIES properties;
    @XmlElement(name = "STATUS")
    protected CODENAMEPAIRTYPE status;
    @XmlElement(name = "AIRLINE")
    protected SERVICEType.AIRLINE airline;
    @XmlElement(name = "FREETEXT")
    protected String freetext;
    @XmlElement(name = "FLIGHT_INDICATOR")
    protected String flightindicator;
    @XmlElement(name = "HOLDER_ELEMENT")
    protected SERVICEType.HOLDERELEMENT holderelement;
    @XmlElement(name = "IS_INFANT_SERVICE")
    protected Boolean isinfantservice;
    @XmlElement(name = "IS_DUMMY_PAX_ASSOCIATION")
    protected Boolean isdummypaxassociation;
    @XmlElement(name = "HAS_OWNER")
    protected Boolean hasowner;
    @XmlElement(name = "ORIGIN_CITY")
    protected SERVICEType.ORIGINCITY origincity;
    @XmlElement(name = "DESTINATION_CITY")
    protected SERVICEType.DESTINATIONCITY destinationcity;
    @XmlElement(name = "VALIDITY_DATE")
    protected DATETYPEPROFILE validitydate;

    /**
     * Gets the value of the servicetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICETYPE() {
        return servicetype;
    }

    /**
     * Sets the value of the servicetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICETYPE(String value) {
        this.servicetype = value;
    }

    /**
     * Gets the value of the serviceid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSERVICEID() {
        return serviceid;
    }

    /**
     * Sets the value of the serviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSERVICEID(Object value) {
        this.serviceid = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINDEX(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setTYPE(CODENAMEPAIRTYPE value) {
        this.type = value;
    }

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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link WEIGHTTYPEPROFILE }
     *     
     */
    public WEIGHTTYPEPROFILE getWEIGHT() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEIGHTTYPEPROFILE }
     *     
     */
    public void setWEIGHT(WEIGHTTYPEPROFILE value) {
        this.weight = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link DIMENSIONTYPEPROFILE }
     *     
     */
    public DIMENSIONTYPEPROFILE getDIMENSION() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIMENSIONTYPEPROFILE }
     *     
     */
    public void setDIMENSION(DIMENSIONTYPEPROFILE value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEType.PROPERTIES }
     *     
     */
    public SERVICEType.PROPERTIES getPROPERTIES() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEType.PROPERTIES }
     *     
     */
    public void setPROPERTIES(SERVICEType.PROPERTIES value) {
        this.properties = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setSTATUS(CODENAMEPAIRTYPE value) {
        this.status = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEType.AIRLINE }
     *     
     */
    public SERVICEType.AIRLINE getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEType.AIRLINE }
     *     
     */
    public void setAIRLINE(SERVICEType.AIRLINE value) {
        this.airline = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

    /**
     * Gets the value of the flightindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTINDICATOR() {
        return flightindicator;
    }

    /**
     * Sets the value of the flightindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTINDICATOR(String value) {
        this.flightindicator = value;
    }

    /**
     * Gets the value of the holderelement property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEType.HOLDERELEMENT }
     *     
     */
    public SERVICEType.HOLDERELEMENT getHOLDERELEMENT() {
        return holderelement;
    }

    /**
     * Sets the value of the holderelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEType.HOLDERELEMENT }
     *     
     */
    public void setHOLDERELEMENT(SERVICEType.HOLDERELEMENT value) {
        this.holderelement = value;
    }

    /**
     * Gets the value of the isinfantservice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINFANTSERVICE() {
        return isinfantservice;
    }

    /**
     * Sets the value of the isinfantservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINFANTSERVICE(Boolean value) {
        this.isinfantservice = value;
    }

    /**
     * Gets the value of the isdummypaxassociation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISDUMMYPAXASSOCIATION() {
        return isdummypaxassociation;
    }

    /**
     * Sets the value of the isdummypaxassociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISDUMMYPAXASSOCIATION(Boolean value) {
        this.isdummypaxassociation = value;
    }

    /**
     * Gets the value of the hasowner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHASOWNER() {
        return hasowner;
    }

    /**
     * Sets the value of the hasowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASOWNER(Boolean value) {
        this.hasowner = value;
    }

    /**
     * Gets the value of the origincity property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEType.ORIGINCITY }
     *     
     */
    public SERVICEType.ORIGINCITY getORIGINCITY() {
        return origincity;
    }

    /**
     * Sets the value of the origincity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEType.ORIGINCITY }
     *     
     */
    public void setORIGINCITY(SERVICEType.ORIGINCITY value) {
        this.origincity = value;
    }

    /**
     * Gets the value of the destinationcity property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEType.DESTINATIONCITY }
     *     
     */
    public SERVICEType.DESTINATIONCITY getDESTINATIONCITY() {
        return destinationcity;
    }

    /**
     * Sets the value of the destinationcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEType.DESTINATIONCITY }
     *     
     */
    public void setDESTINATIONCITY(SERVICEType.DESTINATIONCITY value) {
        this.destinationcity = value;
    }

    /**
     * Gets the value of the validitydate property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public DATETYPEPROFILE getVALIDITYDATE() {
        return validitydate;
    }

    /**
     * Sets the value of the validitydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public void setVALIDITYDATE(DATETYPEPROFILE value) {
        this.validitydate = value;
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
     *       &lt;all&gt;
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class AIRLINE
        implements Serializable
    {

        @XmlElement(name = "CODE")
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
     *       &lt;all&gt;
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;maxLength value="3"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class DESTINATIONCITY
        implements Serializable
    {

        @XmlElement(name = "CODE")
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "id"
    })
    public static class HOLDERELEMENT
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "ID")
        protected String id;

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
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
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
     *       &lt;all&gt;
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;maxLength value="3"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ORIGINCITY
        implements Serializable
    {

        @XmlElement(name = "CODE")
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
     *         &lt;element name="LIST_PROPERTY" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_PARAMETER" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "listproperty"
    })
    public static class PROPERTIES
        implements Serializable
    {

        @XmlElement(name = "LIST_PROPERTY")
        protected List<SERVICEType.PROPERTIES.LISTPROPERTY> listproperty;

        /**
         * Gets the value of the listproperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listproperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPROPERTY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SERVICEType.PROPERTIES.LISTPROPERTY }
         * 
         * 
         */
        public List<SERVICEType.PROPERTIES.LISTPROPERTY> getLISTPROPERTY() {
            if (listproperty == null) {
                listproperty = new ArrayList<SERVICEType.PROPERTIES.LISTPROPERTY>();
            }
            return this.listproperty;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_PARAMETER" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                 &lt;/all&gt;
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
            "code",
            "name",
            "listparameter"
        })
        public static class LISTPROPERTY
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected Object code;
            @XmlElement(name = "NAME")
            protected Object name;
            @XmlElement(name = "LIST_PARAMETER", required = true)
            protected List<SERVICEType.PROPERTIES.LISTPROPERTY.LISTPARAMETER> listparameter;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODE(Object value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setNAME(Object value) {
                this.name = value;
            }

            /**
             * Gets the value of the listparameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listparameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPARAMETER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SERVICEType.PROPERTIES.LISTPROPERTY.LISTPARAMETER }
             * 
             * 
             */
            public List<SERVICEType.PROPERTIES.LISTPROPERTY.LISTPARAMETER> getLISTPARAMETER() {
                if (listparameter == null) {
                    listparameter = new ArrayList<SERVICEType.PROPERTIES.LISTPROPERTY.LISTPARAMETER>();
                }
                return this.listparameter;
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class LISTPARAMETER
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected Object code;
                @XmlElement(name = "NAME")
                protected Object name;
                @XmlElement(name = "VALUE", required = true)
                protected Object value;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCODE(Object value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setNAME(Object value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getVALUE() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setVALUE(Object value) {
                    this.value = value;
                }

            }

        }

    }

}
