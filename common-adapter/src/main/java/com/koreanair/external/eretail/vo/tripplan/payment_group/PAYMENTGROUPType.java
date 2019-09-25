
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PAYMENT_GROUP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_GROUP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PAYMENT_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ASSOCIATIONS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ASSOCIATION" maxOccurs="2"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="QUALIFIER" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="APPLIED"/&gt;
 *                                   &lt;enumeration value="REQUESTED"/&gt;
 *                                   &lt;enumeration value="CONSTRAINT"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;choice minOccurs="0"&gt;
 *                                                   &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                   &lt;element name="AUTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;/choice&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRODUCT_ID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRODUCT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PAYMENT" type="{}PAYMENT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PAX_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="IS_INFANT_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPLICABILITY_CONSTRAINTS" type="{}APPLICABILITY_CONSTRAINTS_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYMENT_GROUP_Type", propOrder = {
    "type",
    "paymentgroupid",
    "status",
    "listassociations",
    "listtravellerid",
    "listproductid",
    "listpayment",
    "paxindicator",
    "isinfantselected",
    "listparameter",
    "applicabilityconstraints"
})
public class PAYMENTGROUPType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "PAYMENT_GROUP_ID")
    protected String paymentgroupid;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "LIST_ASSOCIATIONS")
    protected PAYMENTGROUPType.LISTASSOCIATIONS listassociations;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "LIST_PRODUCT_ID")
    protected List<PAYMENTGROUPType.LISTPRODUCTID> listproductid;
    @XmlElement(name = "LIST_PAYMENT")
    protected List<PAYMENTType> listpayment;
    @XmlElement(name = "PAX_INDICATOR")
    protected String paxindicator;
    @XmlElement(name = "IS_INFANT_SELECTED")
    protected Boolean isinfantselected;
    @XmlElement(name = "LIST_PARAMETER")
    protected List<PAYMENTGROUPType.LISTPARAMETER> listparameter;
    @XmlElement(name = "APPLICABILITY_CONSTRAINTS")
    protected APPLICABILITYCONSTRAINTSType applicabilityconstraints;

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
     * Gets the value of the paymentgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTGROUPID() {
        return paymentgroupid;
    }

    /**
     * Sets the value of the paymentgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTGROUPID(String value) {
        this.paymentgroupid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the listassociations property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTGROUPType.LISTASSOCIATIONS }
     *     
     */
    public PAYMENTGROUPType.LISTASSOCIATIONS getLISTASSOCIATIONS() {
        return listassociations;
    }

    /**
     * Sets the value of the listassociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTGROUPType.LISTASSOCIATIONS }
     *     
     */
    public void setLISTASSOCIATIONS(PAYMENTGROUPType.LISTASSOCIATIONS value) {
        this.listassociations = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the listproductid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproductid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRODUCTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTGROUPType.LISTPRODUCTID }
     * 
     * 
     */
    public List<PAYMENTGROUPType.LISTPRODUCTID> getLISTPRODUCTID() {
        if (listproductid == null) {
            listproductid = new ArrayList<PAYMENTGROUPType.LISTPRODUCTID>();
        }
        return this.listproductid;
    }

    /**
     * Gets the value of the listpayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTType }
     * 
     * 
     */
    public List<PAYMENTType> getLISTPAYMENT() {
        if (listpayment == null) {
            listpayment = new ArrayList<PAYMENTType>();
        }
        return this.listpayment;
    }

    /**
     * Gets the value of the paxindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAXINDICATOR() {
        return paxindicator;
    }

    /**
     * Sets the value of the paxindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAXINDICATOR(String value) {
        this.paxindicator = value;
    }

    /**
     * Gets the value of the isinfantselected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINFANTSELECTED() {
        return isinfantselected;
    }

    /**
     * Sets the value of the isinfantselected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINFANTSELECTED(Boolean value) {
        this.isinfantselected = value;
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
     * {@link PAYMENTGROUPType.LISTPARAMETER }
     * 
     * 
     */
    public List<PAYMENTGROUPType.LISTPARAMETER> getLISTPARAMETER() {
        if (listparameter == null) {
            listparameter = new ArrayList<PAYMENTGROUPType.LISTPARAMETER>();
        }
        return this.listparameter;
    }

    /**
     * Gets the value of the applicabilityconstraints property.
     * 
     * @return
     *     possible object is
     *     {@link APPLICABILITYCONSTRAINTSType }
     *     
     */
    public APPLICABILITYCONSTRAINTSType getAPPLICABILITYCONSTRAINTS() {
        return applicabilityconstraints;
    }

    /**
     * Sets the value of the applicabilityconstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICABILITYCONSTRAINTSType }
     *     
     */
    public void setAPPLICABILITYCONSTRAINTS(APPLICABILITYCONSTRAINTSType value) {
        this.applicabilityconstraints = value;
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
     *         &lt;element name="ASSOCIATION" maxOccurs="2"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="QUALIFIER" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="APPLIED"/&gt;
     *                         &lt;enumeration value="REQUESTED"/&gt;
     *                         &lt;enumeration value="CONSTRAINT"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;choice minOccurs="0"&gt;
     *                                         &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                         &lt;element name="AUTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;/choice&gt;
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
        "association"
    })
    public static class LISTASSOCIATIONS
        implements Serializable
    {

        @XmlElement(name = "ASSOCIATION", required = true)
        protected List<PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION> association;

        /**
         * Gets the value of the association property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the association property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSOCIATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION }
         * 
         * 
         */
        public List<PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION> getASSOCIATION() {
            if (association == null) {
                association = new ArrayList<PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION>();
            }
            return this.association;
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
         *         &lt;element name="QUALIFIER" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="APPLIED"/&gt;
         *               &lt;enumeration value="REQUESTED"/&gt;
         *               &lt;enumeration value="CONSTRAINT"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;choice minOccurs="0"&gt;
         *                               &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                               &lt;element name="AUTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;/choice&gt;
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
        public static class ASSOCIATION
            implements Serializable
        {

            @XmlElement(name = "QUALIFIER", defaultValue = "APPLIED")
            protected String qualifier;
            @XmlElement(name = "LIST", required = true)
            protected PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST list;

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQUALIFIER() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQUALIFIER(String value) {
                this.qualifier = value;
            }

            /**
             * Gets the value of the list property.
             * 
             * @return
             *     possible object is
             *     {@link PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST }
             *     
             */
            public PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST getLIST() {
                return list;
            }

            /**
             * Sets the value of the list property.
             * 
             * @param value
             *     allowed object is
             *     {@link PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST }
             *     
             */
            public void setLIST(PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST value) {
                this.list = value;
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
             *         &lt;element name="ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;choice minOccurs="0"&gt;
             *                     &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                     &lt;element name="AUTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;/choice&gt;
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
                "element"
            })
            public static class LIST
                implements Serializable
            {

                @XmlElement(name = "ELEMENT")
                protected List<PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST.ELEMENT> element;

                /**
                 * Gets the value of the element property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getELEMENT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST.ELEMENT }
                 * 
                 * 
                 */
                public List<PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST.ELEMENT> getELEMENT() {
                    if (element == null) {
                        element = new ArrayList<PAYMENTGROUPType.LISTASSOCIATIONS.ASSOCIATION.LIST.ELEMENT>();
                    }
                    return this.element;
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
                 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;choice minOccurs="0"&gt;
                 *           &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *           &lt;element name="AUTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;/choice&gt;
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
                    "reference",
                    "auto"
                })
                public static class ELEMENT
                    implements Serializable
                {

                    @XmlElement(name = "TYPE", required = true)
                    protected String type;
                    @XmlElement(name = "REFERENCE")
                    protected String reference;
                    @XmlElement(name = "AUTO")
                    protected String auto;

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
                     * Gets the value of the reference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREFERENCE() {
                        return reference;
                    }

                    /**
                     * Sets the value of the reference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREFERENCE(String value) {
                        this.reference = value;
                    }

                    /**
                     * Gets the value of the auto property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAUTO() {
                        return auto;
                    }

                    /**
                     * Sets the value of the auto property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAUTO(String value) {
                        this.auto = value;
                    }

                }

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
     *         &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "key",
        "value"
    })
    public static class LISTPARAMETER
        implements Serializable
    {

        @XmlElement(name = "KEY", required = true)
        protected Object key;
        @XmlElement(name = "VALUE", required = true)
        protected Object value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getKEY() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setKEY(Object value) {
            this.key = value;
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
     *         &lt;element name="PRODUCT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "producttype",
        "productid"
    })
    public static class LISTPRODUCTID
        implements Serializable
    {

        @XmlElement(name = "PRODUCT_TYPE", required = true)
        protected String producttype;
        @XmlElement(name = "PRODUCT_ID", required = true)
        protected BigInteger productid;

        /**
         * Gets the value of the producttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTTYPE() {
            return producttype;
        }

        /**
         * Sets the value of the producttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTTYPE(String value) {
            this.producttype = value;
        }

        /**
         * Gets the value of the productid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRODUCTID() {
            return productid;
        }

        /**
         * Sets the value of the productid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRODUCTID(BigInteger value) {
            this.productid = value;
        }

    }

}
