
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_SERVICE_COVERAGE_INFO_GROUP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SERVICE_COVERAGE_INFO_GROUP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERVICE_COV_INFO_GROUP" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
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
 *                                       &lt;element name="REFERENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
 *                   &lt;element name="COVERAGE_PER_FLIGHTS_INFO" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NUMBER_OF_ITEMS_DETAILS" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="REF_NUM" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="REFERENCE_QUALIFIER" type="{}unprotectedStringType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LAST_ITEMS_DETAILS" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="REF_OF_LEG" type="{}unprotectedStringType"/&gt;
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
@XmlType(name = "LIST_SERVICE_COVERAGE_INFO_GROUP_Type", propOrder = {
    "servicecovinfogroup",
    "itemnumberinfo"
})
public class LISTSERVICECOVERAGEINFOGROUPType
    implements Serializable
{

    @XmlElement(name = "SERVICE_COV_INFO_GROUP", required = true)
    protected List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP> servicecovinfogroup;
    @XmlElement(name = "ITEM_NUMBER_INFO", required = true)
    protected LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO itemnumberinfo;

    /**
     * Gets the value of the servicecovinfogroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicecovinfogroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICECOVINFOGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP }
     * 
     * 
     */
    public List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP> getSERVICECOVINFOGROUP() {
        if (servicecovinfogroup == null) {
            servicecovinfogroup = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP>();
        }
        return this.servicecovinfogroup;
    }

    /**
     * Gets the value of the itemnumberinfo property.
     * 
     * @return
     *     possible object is
     *     {@link LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO }
     *     
     */
    public LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO getITEMNUMBERINFO() {
        return itemnumberinfo;
    }

    /**
     * Sets the value of the itemnumberinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO }
     *     
     */
    public void setITEMNUMBERINFO(LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO value) {
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
        protected LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER itemnumber;

        /**
         * Gets the value of the itemnumber property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER }
         *     
         */
        public LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER getITEMNUMBER() {
            return itemnumber;
        }

        /**
         * Sets the value of the itemnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER }
         *     
         */
        public void setITEMNUMBER(LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER value) {
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
     *                             &lt;element name="REFERENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
     *         &lt;element name="COVERAGE_PER_FLIGHTS_INFO" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NUMBER_OF_ITEMS_DETAILS" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="REF_NUM" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="REFERENCE_QUALIFIER" type="{}unprotectedStringType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LAST_ITEMS_DETAILS" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="REF_OF_LEG" type="{}unprotectedStringType"/&gt;
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
        "paxrefinfo",
        "refinfo",
        "coverageperflightsinfo"
    })
    public static class SERVICECOVINFOGROUP
        implements Serializable
    {

        @XmlElement(name = "PAX_REF_INFO", required = true)
        protected LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO paxrefinfo;
        @XmlElement(name = "REF_INFO", required = true)
        protected LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO refinfo;
        @XmlElement(name = "COVERAGE_PER_FLIGHTS_INFO", required = true)
        protected List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO> coverageperflightsinfo;

        /**
         * Gets the value of the paxrefinfo property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO }
         *     
         */
        public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO getPAXREFINFO() {
            return paxrefinfo;
        }

        /**
         * Sets the value of the paxrefinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO }
         *     
         */
        public void setPAXREFINFO(LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO value) {
            this.paxrefinfo = value;
        }

        /**
         * Gets the value of the refinfo property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO }
         *     
         */
        public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO getREFINFO() {
            return refinfo;
        }

        /**
         * Sets the value of the refinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO }
         *     
         */
        public void setREFINFO(LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO value) {
            this.refinfo = value;
        }

        /**
         * Gets the value of the coverageperflightsinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coverageperflightsinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOVERAGEPERFLIGHTSINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO }
         * 
         * 
         */
        public List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO> getCOVERAGEPERFLIGHTSINFO() {
            if (coverageperflightsinfo == null) {
                coverageperflightsinfo = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO>();
            }
            return this.coverageperflightsinfo;
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
         *         &lt;element name="NUMBER_OF_ITEMS_DETAILS" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="REF_NUM" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="REFERENCE_QUALIFIER" type="{}unprotectedStringType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LAST_ITEMS_DETAILS" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="REF_OF_LEG" type="{}unprotectedStringType"/&gt;
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
            "numberofitemsdetails",
            "lastitemsdetails"
        })
        public static class COVERAGEPERFLIGHTSINFO
            implements Serializable
        {

            @XmlElement(name = "NUMBER_OF_ITEMS_DETAILS", required = true)
            protected List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.NUMBEROFITEMSDETAILS> numberofitemsdetails;
            @XmlElement(name = "LAST_ITEMS_DETAILS", required = true)
            protected List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.LASTITEMSDETAILS> lastitemsdetails;

            /**
             * Gets the value of the numberofitemsdetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numberofitemsdetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNUMBEROFITEMSDETAILS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.NUMBEROFITEMSDETAILS }
             * 
             * 
             */
            public List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.NUMBEROFITEMSDETAILS> getNUMBEROFITEMSDETAILS() {
                if (numberofitemsdetails == null) {
                    numberofitemsdetails = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.NUMBEROFITEMSDETAILS>();
                }
                return this.numberofitemsdetails;
            }

            /**
             * Gets the value of the lastitemsdetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lastitemsdetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLASTITEMSDETAILS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.LASTITEMSDETAILS }
             * 
             * 
             */
            public List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.LASTITEMSDETAILS> getLASTITEMSDETAILS() {
                if (lastitemsdetails == null) {
                    lastitemsdetails = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.LASTITEMSDETAILS>();
                }
                return this.lastitemsdetails;
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
             *         &lt;element name="REF_OF_LEG" type="{}unprotectedStringType"/&gt;
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
                "refofleg"
            })
            public static class LASTITEMSDETAILS
                implements Serializable
            {

                @XmlElement(name = "REF_OF_LEG", required = true)
                protected String refofleg;

                /**
                 * Gets the value of the refofleg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFOFLEG() {
                    return refofleg;
                }

                /**
                 * Sets the value of the refofleg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFOFLEG(String value) {
                    this.refofleg = value;
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
             *         &lt;element name="REF_NUM" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="REFERENCE_QUALIFIER" type="{}unprotectedStringType"/&gt;
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
                "refnum",
                "referencequalifier"
            })
            public static class NUMBEROFITEMSDETAILS
                implements Serializable
            {

                @XmlElement(name = "REF_NUM", required = true)
                protected String refnum;
                @XmlElement(name = "REFERENCE_QUALIFIER", required = true)
                protected String referencequalifier;

                /**
                 * Gets the value of the refnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFNUM() {
                    return refnum;
                }

                /**
                 * Sets the value of the refnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFNUM(String value) {
                    this.refnum = value;
                }

                /**
                 * Gets the value of the referencequalifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFERENCEQUALIFIER() {
                    return referencequalifier;
                }

                /**
                 * Sets the value of the referencequalifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFERENCEQUALIFIER(String value) {
                    this.referencequalifier = value;
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
         *                   &lt;element name="REFERENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            protected List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO.TRAVELLERDETAILS> travellerdetails;

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
             * {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO.TRAVELLERDETAILS }
             * 
             * 
             */
            public List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO.TRAVELLERDETAILS> getTRAVELLERDETAILS() {
                if (travellerdetails == null) {
                    travellerdetails = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO.TRAVELLERDETAILS>();
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
             *         &lt;element name="REFERENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "referencenumber"
            })
            public static class TRAVELLERDETAILS
                implements Serializable
            {

                @XmlElement(name = "REFERENCE_NUMBER", required = true)
                protected Object referencenumber;

                /**
                 * Gets the value of the referencenumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getREFERENCENUMBER() {
                    return referencenumber;
                }

                /**
                 * Sets the value of the referencenumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setREFERENCENUMBER(Object value) {
                    this.referencenumber = value;
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
            protected List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO.REFERENCINGDETAIL> referencingdetail;

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
             * {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO.REFERENCINGDETAIL }
             * 
             * 
             */
            public List<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO.REFERENCINGDETAIL> getREFERENCINGDETAIL() {
                if (referencingdetail == null) {
                    referencingdetail = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO.REFERENCINGDETAIL>();
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

    }

}
