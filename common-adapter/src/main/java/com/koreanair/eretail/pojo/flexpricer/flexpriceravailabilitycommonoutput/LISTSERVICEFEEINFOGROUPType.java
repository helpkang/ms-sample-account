
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_SERVICE_FEE_INFO_GROUP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SERVICE_FEE_INFO_GROUP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERVICE_DETAILS_GROUP" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SERVICE_MATCHED_INFO_GROUP"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PRICING_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FARE_DETAILS" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="PASSENGER_TYPE" type="{}unprotectedStringType"/&gt;
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
 *                             &lt;element name="AMOUNT_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="MONETARY_DETAIL" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="AMOUNT" type="{}unprotectedStringType"/&gt;
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
 *                             &lt;element name="PAX_REF_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TRAVELLER_DETAILS" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REF_INFO"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="REFERENCING_DETAIL" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="QUALIFIER" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITEM_NUMBER_INFO"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ITEM_NUMBER"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SERVICE_FEE_INFO_GROUP_Type", propOrder = {
    "servicedetailsgroup",
    "itemnumberinfo"
})
public class LISTSERVICEFEEINFOGROUPType
    implements Serializable
{

    @XmlElement(name = "SERVICE_DETAILS_GROUP", required = true)
    protected List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP> servicedetailsgroup;
    @XmlElement(name = "ITEM_NUMBER_INFO", required = true)
    protected LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO itemnumberinfo;

    /**
     * Gets the value of the servicedetailsgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicedetailsgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICEDETAILSGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP }
     * 
     * 
     */
    public List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP> getSERVICEDETAILSGROUP() {
        if (servicedetailsgroup == null) {
            servicedetailsgroup = new ArrayList<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP>();
        }
        return this.servicedetailsgroup;
    }

    /**
     * Gets the value of the itemnumberinfo property.
     * 
     * @return
     *     possible object is
     *     {@link LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO }
     *     
     */
    public LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO getITEMNUMBERINFO() {
        return itemnumberinfo;
    }

    /**
     * Sets the value of the itemnumberinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO }
     *     
     */
    public void setITEMNUMBERINFO(LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO value) {
        this.itemnumberinfo = value;
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
     *         &lt;element name="ITEM_NUMBER"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
        "itemnumber"
    })
    public static class ITEMNUMBERINFO
        implements Serializable
    {

        @XmlElement(name = "ITEM_NUMBER", required = true)
        protected LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER itemnumber;

        /**
         * Gets the value of the itemnumber property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER }
         *     
         */
        public LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER getITEMNUMBER() {
            return itemnumber;
        }

        /**
         * Sets the value of the itemnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER }
         *     
         */
        public void setITEMNUMBER(LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER value) {
            this.itemnumber = value;
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
         *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
            "number"
        })
        public static class ITEMNUMBER
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected String type;
            @XmlElement(name = "NUMBER", required = true)
            protected String number;

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
     *         &lt;element name="SERVICE_MATCHED_INFO_GROUP"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PRICING_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FARE_DETAILS" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="PASSENGER_TYPE" type="{}unprotectedStringType"/&gt;
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
     *                   &lt;element name="AMOUNT_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="MONETARY_DETAIL" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="AMOUNT" type="{}unprotectedStringType"/&gt;
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
     *                   &lt;element name="PAX_REF_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TRAVELLER_DETAILS" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REF_INFO"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REFERENCING_DETAIL" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="QUALIFIER" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
        "servicematchedinfogroup",
        "refinfo"
    })
    public static class SERVICEDETAILSGROUP
        implements Serializable
    {

        @XmlElement(name = "SERVICE_MATCHED_INFO_GROUP", required = true)
        protected LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP servicematchedinfogroup;
        @XmlElement(name = "REF_INFO", required = true)
        protected LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO refinfo;

        /**
         * Gets the value of the servicematchedinfogroup property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP }
         *     
         */
        public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP getSERVICEMATCHEDINFOGROUP() {
            return servicematchedinfogroup;
        }

        /**
         * Sets the value of the servicematchedinfogroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP }
         *     
         */
        public void setSERVICEMATCHEDINFOGROUP(LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP value) {
            this.servicematchedinfogroup = value;
        }

        /**
         * Gets the value of the refinfo property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO }
         *     
         */
        public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO getREFINFO() {
            return refinfo;
        }

        /**
         * Sets the value of the refinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO }
         *     
         */
        public void setREFINFO(LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO value) {
            this.refinfo = value;
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
         *         &lt;element name="REFERENCING_DETAIL" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="QUALIFIER" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
            "referencingdetail"
        })
        public static class REFINFO
            implements Serializable
        {

            @XmlElement(name = "REFERENCING_DETAIL", required = true)
            protected List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO.REFERENCINGDETAIL> referencingdetail;

            /**
             * Gets the value of the referencingdetail property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the referencingdetail property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getREFERENCINGDETAIL().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO.REFERENCINGDETAIL }
             * 
             * 
             */
            public List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO.REFERENCINGDETAIL> getREFERENCINGDETAIL() {
                if (referencingdetail == null) {
                    referencingdetail = new ArrayList<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO.REFERENCINGDETAIL>();
                }
                return this.referencingdetail;
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
             *         &lt;element name="QUALIFIER" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
                "qualifier",
                "number"
            })
            public static class REFERENCINGDETAIL
                implements Serializable
            {

                @XmlElement(name = "QUALIFIER", required = true)
                protected String qualifier;
                @XmlElement(name = "NUMBER", required = true)
                protected String number;

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
         *         &lt;element name="PRICING_INFO"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FARE_DETAILS" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="PASSENGER_TYPE" type="{}unprotectedStringType"/&gt;
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
         *         &lt;element name="AMOUNT_INFO"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="MONETARY_DETAIL" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="AMOUNT" type="{}unprotectedStringType"/&gt;
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
         *         &lt;element name="PAX_REF_INFO"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TRAVELLER_DETAILS" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
            "pricinginfo",
            "amountinfo",
            "paxrefinfo"
        })
        public static class SERVICEMATCHEDINFOGROUP
            implements Serializable
        {

            @XmlElement(name = "PRICING_INFO", required = true)
            protected LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO pricinginfo;
            @XmlElement(name = "AMOUNT_INFO", required = true)
            protected LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO amountinfo;
            @XmlElement(name = "PAX_REF_INFO", required = true)
            protected LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO paxrefinfo;

            /**
             * Gets the value of the pricinginfo property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO }
             *     
             */
            public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO getPRICINGINFO() {
                return pricinginfo;
            }

            /**
             * Sets the value of the pricinginfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO }
             *     
             */
            public void setPRICINGINFO(LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO value) {
                this.pricinginfo = value;
            }

            /**
             * Gets the value of the amountinfo property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO }
             *     
             */
            public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO getAMOUNTINFO() {
                return amountinfo;
            }

            /**
             * Sets the value of the amountinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO }
             *     
             */
            public void setAMOUNTINFO(LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO value) {
                this.amountinfo = value;
            }

            /**
             * Gets the value of the paxrefinfo property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO }
             *     
             */
            public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO getPAXREFINFO() {
                return paxrefinfo;
            }

            /**
             * Sets the value of the paxrefinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO }
             *     
             */
            public void setPAXREFINFO(LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO value) {
                this.paxrefinfo = value;
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
             *         &lt;element name="MONETARY_DETAIL" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType"/&gt;
             *                   &lt;element name="AMOUNT" type="{}unprotectedStringType"/&gt;
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
                "monetarydetail"
            })
            public static class AMOUNTINFO
                implements Serializable
            {

                @XmlElement(name = "MONETARY_DETAIL", required = true)
                protected List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO.MONETARYDETAIL> monetarydetail;

                /**
                 * Gets the value of the monetarydetail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the monetarydetail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMONETARYDETAIL().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO.MONETARYDETAIL }
                 * 
                 * 
                 */
                public List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO.MONETARYDETAIL> getMONETARYDETAIL() {
                    if (monetarydetail == null) {
                        monetarydetail = new ArrayList<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO.MONETARYDETAIL>();
                    }
                    return this.monetarydetail;
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
                 *         &lt;element name="AMOUNT_TYPE" type="{}unprotectedStringType"/&gt;
                 *         &lt;element name="AMOUNT" type="{}unprotectedStringType"/&gt;
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
                    "amounttype",
                    "amount"
                })
                public static class MONETARYDETAIL
                    implements Serializable
                {

                    @XmlElement(name = "AMOUNT_TYPE", required = true)
                    protected String amounttype;
                    @XmlElement(name = "AMOUNT", required = true)
                    protected String amount;

                    /**
                     * Gets the value of the amounttype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAMOUNTTYPE() {
                        return amounttype;
                    }

                    /**
                     * Sets the value of the amounttype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAMOUNTTYPE(String value) {
                        this.amounttype = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAMOUNT() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAMOUNT(String value) {
                        this.amount = value;
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
             *         &lt;element name="TRAVELLER_DETAILS" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
                "travellerdetails"
            })
            public static class PAXREFINFO
                implements Serializable
            {

                @XmlElement(name = "TRAVELLER_DETAILS", required = true)
                protected List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO.TRAVELLERDETAILS> travellerdetails;

                /**
                 * Gets the value of the travellerdetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the travellerdetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTRAVELLERDETAILS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO.TRAVELLERDETAILS }
                 * 
                 * 
                 */
                public List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO.TRAVELLERDETAILS> getTRAVELLERDETAILS() {
                    if (travellerdetails == null) {
                        travellerdetails = new ArrayList<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO.TRAVELLERDETAILS>();
                    }
                    return this.travellerdetails;
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
                 *         &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
                public static class TRAVELLERDETAILS
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
             *         &lt;element name="FARE_DETAILS" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="PASSENGER_TYPE" type="{}unprotectedStringType"/&gt;
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
                "faredetails"
            })
            public static class PRICINGINFO
                implements Serializable
            {

                @XmlElement(name = "FARE_DETAILS", required = true)
                protected List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO.FAREDETAILS> faredetails;

                /**
                 * Gets the value of the faredetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the faredetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFAREDETAILS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO.FAREDETAILS }
                 * 
                 * 
                 */
                public List<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO.FAREDETAILS> getFAREDETAILS() {
                    if (faredetails == null) {
                        faredetails = new ArrayList<LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO.FAREDETAILS>();
                    }
                    return this.faredetails;
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
                 *         &lt;element name="PASSENGER_TYPE" type="{}unprotectedStringType"/&gt;
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
                    "passengertype"
                })
                public static class FAREDETAILS
                    implements Serializable
                {

                    @XmlElement(name = "PASSENGER_TYPE", required = true)
                    protected String passengertype;

                    /**
                     * Gets the value of the passengertype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPASSENGERTYPE() {
                        return passengertype;
                    }

                    /**
                     * Sets the value of the passengertype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPASSENGERTYPE(String value) {
                        this.passengertype = value;
                    }

                }

            }

        }

    }

}
