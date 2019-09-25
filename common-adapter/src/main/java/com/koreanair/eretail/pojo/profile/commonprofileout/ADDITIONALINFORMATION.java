
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="LIST_COMMENTS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="COMMENTS_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CORPORATE_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="TRIP_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVEL_ORDER_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ADDITIONAL_LUGGAGE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="LUGGAGE_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TO_BE_ASSISTED_PERSON" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE_OF_ASSISTED_PERSON" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WHEELCHAIR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="WHEELCHAIR_CATEGORY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WHEELCHAIR_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IS_COLLAPSABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="BATTERY_TYPE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="WHEELCHAIR_DIMENSIONS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
 *                                       &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="WHEELCHAIR_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="WHEELCHAIR_TYPE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANIMAL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ANIMAL_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MARKETING_EMAIL_OPTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UPDATE_CONTACT_POINT_OPTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UPDATE_PASSPORT_INFO_OPTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "listcomments",
    "commenttype",
    "corporatedata",
    "listadditionalluggage",
    "tobeassistedperson",
    "animal",
    "marketingemailoption",
    "updatecontactpointoption",
    "updatepassportinfooption"
})
@XmlRootElement(name = "ADDITIONAL_INFORMATION")
public class ADDITIONALINFORMATION
    implements Serializable
{

    @XmlElement(name = "LIST_COMMENTS")
    protected List<ADDITIONALINFORMATION.LISTCOMMENTS> listcomments;
    @XmlElement(name = "COMMENT_TYPE")
    protected String commenttype;
    @XmlElement(name = "CORPORATE_DATA")
    protected ADDITIONALINFORMATION.CORPORATEDATA corporatedata;
    @XmlElement(name = "LIST_ADDITIONAL_LUGGAGE")
    protected List<ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE> listadditionalluggage;
    @XmlElement(name = "TO_BE_ASSISTED_PERSON")
    protected ADDITIONALINFORMATION.TOBEASSISTEDPERSON tobeassistedperson;
    @XmlElement(name = "ANIMAL")
    protected ADDITIONALINFORMATION.ANIMAL animal;
    @XmlElement(name = "MARKETING_EMAIL_OPTION")
    protected Boolean marketingemailoption;
    @XmlElement(name = "UPDATE_CONTACT_POINT_OPTION")
    protected Boolean updatecontactpointoption;
    @XmlElement(name = "UPDATE_PASSPORT_INFO_OPTION")
    protected Boolean updatepassportinfooption;

    /**
     * Gets the value of the listcomments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcomments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADDITIONALINFORMATION.LISTCOMMENTS }
     * 
     * 
     */
    public List<ADDITIONALINFORMATION.LISTCOMMENTS> getLISTCOMMENTS() {
        if (listcomments == null) {
            listcomments = new ArrayList<ADDITIONALINFORMATION.LISTCOMMENTS>();
        }
        return this.listcomments;
    }

    /**
     * Gets the value of the commenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENTTYPE() {
        return commenttype;
    }

    /**
     * Sets the value of the commenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENTTYPE(String value) {
        this.commenttype = value;
    }

    /**
     * Gets the value of the corporatedata property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALINFORMATION.CORPORATEDATA }
     *     
     */
    public ADDITIONALINFORMATION.CORPORATEDATA getCORPORATEDATA() {
        return corporatedata;
    }

    /**
     * Sets the value of the corporatedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALINFORMATION.CORPORATEDATA }
     *     
     */
    public void setCORPORATEDATA(ADDITIONALINFORMATION.CORPORATEDATA value) {
        this.corporatedata = value;
    }

    /**
     * Gets the value of the listadditionalluggage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalluggage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALLUGGAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE }
     * 
     * 
     */
    public List<ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE> getLISTADDITIONALLUGGAGE() {
        if (listadditionalluggage == null) {
            listadditionalluggage = new ArrayList<ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE>();
        }
        return this.listadditionalluggage;
    }

    /**
     * Gets the value of the tobeassistedperson property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON }
     *     
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON getTOBEASSISTEDPERSON() {
        return tobeassistedperson;
    }

    /**
     * Sets the value of the tobeassistedperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON }
     *     
     */
    public void setTOBEASSISTEDPERSON(ADDITIONALINFORMATION.TOBEASSISTEDPERSON value) {
        this.tobeassistedperson = value;
    }

    /**
     * Gets the value of the animal property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALINFORMATION.ANIMAL }
     *     
     */
    public ADDITIONALINFORMATION.ANIMAL getANIMAL() {
        return animal;
    }

    /**
     * Sets the value of the animal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALINFORMATION.ANIMAL }
     *     
     */
    public void setANIMAL(ADDITIONALINFORMATION.ANIMAL value) {
        this.animal = value;
    }

    /**
     * Gets the value of the marketingemailoption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMARKETINGEMAILOPTION() {
        return marketingemailoption;
    }

    /**
     * Sets the value of the marketingemailoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMARKETINGEMAILOPTION(Boolean value) {
        this.marketingemailoption = value;
    }

    /**
     * Gets the value of the updatecontactpointoption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUPDATECONTACTPOINTOPTION() {
        return updatecontactpointoption;
    }

    /**
     * Sets the value of the updatecontactpointoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUPDATECONTACTPOINTOPTION(Boolean value) {
        this.updatecontactpointoption = value;
    }

    /**
     * Gets the value of the updatepassportinfooption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUPDATEPASSPORTINFOOPTION() {
        return updatepassportinfooption;
    }

    /**
     * Sets the value of the updatepassportinfooption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUPDATEPASSPORTINFOOPTION(Boolean value) {
        this.updatepassportinfooption = value;
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
     *         &lt;element name="ANIMAL_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    public static class ANIMAL
        implements Serializable
    {

        @XmlElement(name = "ANIMAL_TYPE")
        protected ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE animaltype;
        @XmlElement(name = "WEIGHT")
        protected BigInteger weight;
        @XmlElement(name = "DETAILS")
        protected String details;

        /**
         * Gets the value of the animaltype property.
         * 
         * @return
         *     possible object is
         *     {@link ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE }
         *     
         */
        public ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE getANIMALTYPE() {
            return animaltype;
        }

        /**
         * Sets the value of the animaltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE }
         *     
         */
        public void setANIMALTYPE(ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE value) {
            this.animaltype = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWEIGHT() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWEIGHT(BigInteger value) {
            this.weight = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDETAILS() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDETAILS(String value) {
            this.details = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class ANIMALTYPE
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
     *         &lt;element name="TRIP_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRAVEL_ORDER_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    public static class CORPORATEDATA
        implements Serializable
    {

        @XmlElement(name = "TRIP_REASON")
        protected String tripreason;
        @XmlElement(name = "TRAVEL_ORDER_REFERENCE")
        protected String travelorderreference;

        /**
         * Gets the value of the tripreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRIPREASON() {
            return tripreason;
        }

        /**
         * Sets the value of the tripreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRIPREASON(String value) {
            this.tripreason = value;
        }

        /**
         * Gets the value of the travelorderreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAVELORDERREFERENCE() {
            return travelorderreference;
        }

        /**
         * Sets the value of the travelorderreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAVELORDERREFERENCE(String value) {
            this.travelorderreference = value;
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
     *         &lt;element name="LUGGAGE_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
    public static class LISTADDITIONALLUGGAGE
        implements Serializable
    {

        @XmlElement(name = "LUGGAGE_TYPE")
        protected ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE luggagetype;
        @XmlElement(name = "NUMBER")
        protected BigInteger number;
        @XmlElement(name = "WEIGHT")
        protected BigInteger weight;
        @XmlElement(name = "LENGTH")
        protected BigInteger length;
        @XmlElement(name = "WIDTH")
        protected BigInteger width;
        @XmlElement(name = "HEIGHT")
        protected BigInteger height;

        /**
         * Gets the value of the luggagetype property.
         * 
         * @return
         *     possible object is
         *     {@link ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE }
         *     
         */
        public ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE getLUGGAGETYPE() {
            return luggagetype;
        }

        /**
         * Sets the value of the luggagetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE }
         *     
         */
        public void setLUGGAGETYPE(ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE value) {
            this.luggagetype = value;
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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWEIGHT() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWEIGHT(BigInteger value) {
            this.weight = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLENGTH() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLENGTH(BigInteger value) {
            this.length = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWIDTH() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWIDTH(BigInteger value) {
            this.width = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHEIGHT() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHEIGHT(BigInteger value) {
            this.height = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class LUGGAGETYPE
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
     *         &lt;element name="COMMENTS_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    public static class LISTCOMMENTS
        implements Serializable
    {

        @XmlElement(name = "COMMENTS_ID")
        protected BigInteger commentsid;
        @XmlElement(name = "COMMENTS")
        protected String comments;

        /**
         * Gets the value of the commentsid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCOMMENTSID() {
            return commentsid;
        }

        /**
         * Sets the value of the commentsid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCOMMENTSID(BigInteger value) {
            this.commentsid = value;
        }

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMENTS() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMENTS(String value) {
            this.comments = value;
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
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="TYPE_OF_ASSISTED_PERSON" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WHEELCHAIR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="WHEELCHAIR_CATEGORY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WHEELCHAIR_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IS_COLLAPSABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="BATTERY_TYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="WHEELCHAIR_DIMENSIONS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence minOccurs="0"&gt;
     *                             &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="WHEELCHAIR_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="WHEELCHAIR_TYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    public static class TOBEASSISTEDPERSON
        implements Serializable
    {

        @XmlElement(name = "NUMBER")
        protected BigInteger number;
        @XmlElement(name = "TYPE_OF_ASSISTED_PERSON")
        protected ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON typeofassistedperson;
        @XmlElement(name = "WHEELCHAIR_NUMBER")
        protected BigInteger wheelchairnumber;
        @XmlElement(name = "WHEELCHAIR_CATEGORY")
        protected ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY wheelchaircategory;
        @XmlElement(name = "WHEELCHAIR_INFORMATION")
        protected ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION wheelchairinformation;

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
         * Gets the value of the typeofassistedperson property.
         * 
         * @return
         *     possible object is
         *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON }
         *     
         */
        public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON getTYPEOFASSISTEDPERSON() {
            return typeofassistedperson;
        }

        /**
         * Sets the value of the typeofassistedperson property.
         * 
         * @param value
         *     allowed object is
         *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON }
         *     
         */
        public void setTYPEOFASSISTEDPERSON(ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON value) {
            this.typeofassistedperson = value;
        }

        /**
         * Gets the value of the wheelchairnumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWHEELCHAIRNUMBER() {
            return wheelchairnumber;
        }

        /**
         * Sets the value of the wheelchairnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWHEELCHAIRNUMBER(BigInteger value) {
            this.wheelchairnumber = value;
        }

        /**
         * Gets the value of the wheelchaircategory property.
         * 
         * @return
         *     possible object is
         *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY }
         *     
         */
        public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY getWHEELCHAIRCATEGORY() {
            return wheelchaircategory;
        }

        /**
         * Sets the value of the wheelchaircategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY }
         *     
         */
        public void setWHEELCHAIRCATEGORY(ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY value) {
            this.wheelchaircategory = value;
        }

        /**
         * Gets the value of the wheelchairinformation property.
         * 
         * @return
         *     possible object is
         *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION }
         *     
         */
        public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION getWHEELCHAIRINFORMATION() {
            return wheelchairinformation;
        }

        /**
         * Sets the value of the wheelchairinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION }
         *     
         */
        public void setWHEELCHAIRINFORMATION(ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION value) {
            this.wheelchairinformation = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class TYPEOFASSISTEDPERSON
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class WHEELCHAIRCATEGORY
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
         *         &lt;element name="IS_COLLAPSABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="BATTERY_TYPE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="WHEELCHAIR_DIMENSIONS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence minOccurs="0"&gt;
         *                   &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="WHEELCHAIR_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="WHEELCHAIR_TYPE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "iscollapsable",
            "batterytype",
            "wheelchairdimensions",
            "wheelchairweight",
            "wheelchairtype"
        })
        public static class WHEELCHAIRINFORMATION
            implements Serializable
        {

            @XmlElement(name = "IS_COLLAPSABLE")
            protected Boolean iscollapsable;
            @XmlElement(name = "BATTERY_TYPE")
            protected ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE batterytype;
            @XmlElement(name = "WHEELCHAIR_DIMENSIONS")
            protected ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS wheelchairdimensions;
            @XmlElement(name = "WHEELCHAIR_WEIGHT")
            protected BigInteger wheelchairweight;
            @XmlElement(name = "WHEELCHAIR_TYPE")
            protected ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE wheelchairtype;

            /**
             * Gets the value of the iscollapsable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISCOLLAPSABLE() {
                return iscollapsable;
            }

            /**
             * Sets the value of the iscollapsable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISCOLLAPSABLE(Boolean value) {
                this.iscollapsable = value;
            }

            /**
             * Gets the value of the batterytype property.
             * 
             * @return
             *     possible object is
             *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE }
             *     
             */
            public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE getBATTERYTYPE() {
                return batterytype;
            }

            /**
             * Sets the value of the batterytype property.
             * 
             * @param value
             *     allowed object is
             *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE }
             *     
             */
            public void setBATTERYTYPE(ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE value) {
                this.batterytype = value;
            }

            /**
             * Gets the value of the wheelchairdimensions property.
             * 
             * @return
             *     possible object is
             *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS }
             *     
             */
            public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS getWHEELCHAIRDIMENSIONS() {
                return wheelchairdimensions;
            }

            /**
             * Sets the value of the wheelchairdimensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS }
             *     
             */
            public void setWHEELCHAIRDIMENSIONS(ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS value) {
                this.wheelchairdimensions = value;
            }

            /**
             * Gets the value of the wheelchairweight property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWHEELCHAIRWEIGHT() {
                return wheelchairweight;
            }

            /**
             * Sets the value of the wheelchairweight property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWHEELCHAIRWEIGHT(BigInteger value) {
                this.wheelchairweight = value;
            }

            /**
             * Gets the value of the wheelchairtype property.
             * 
             * @return
             *     possible object is
             *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE }
             *     
             */
            public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE getWHEELCHAIRTYPE() {
                return wheelchairtype;
            }

            /**
             * Sets the value of the wheelchairtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE }
             *     
             */
            public void setWHEELCHAIRTYPE(ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE value) {
                this.wheelchairtype = value;
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
            public static class BATTERYTYPE
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected Object code;
                @XmlElement(name = "NAME")
                protected Object name;

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
             *       &lt;sequence minOccurs="0"&gt;
             *         &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "height",
                "width",
                "length"
            })
            public static class WHEELCHAIRDIMENSIONS
                implements Serializable
            {

                @XmlElement(name = "HEIGHT")
                protected Object height;
                @XmlElement(name = "WIDTH")
                protected Object width;
                @XmlElement(name = "LENGTH")
                protected Object length;

                /**
                 * Gets the value of the height property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getHEIGHT() {
                    return height;
                }

                /**
                 * Sets the value of the height property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setHEIGHT(Object value) {
                    this.height = value;
                }

                /**
                 * Gets the value of the width property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getWIDTH() {
                    return width;
                }

                /**
                 * Sets the value of the width property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setWIDTH(Object value) {
                    this.width = value;
                }

                /**
                 * Gets the value of the length property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getLENGTH() {
                    return length;
                }

                /**
                 * Sets the value of the length property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setLENGTH(Object value) {
                    this.length = value;
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
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            public static class WHEELCHAIRTYPE
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected Object name;

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

            }

        }

    }

}
