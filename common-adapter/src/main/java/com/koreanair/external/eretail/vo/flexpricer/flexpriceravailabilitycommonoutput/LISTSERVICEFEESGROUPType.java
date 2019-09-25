
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_SERVICE_FEES_GROUP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SERVICE_FEES_GROUP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="LIST_SERVICE_FEE_INFO_GROUP" type="{}LIST_SERVICE_FEE_INFO_GROUP_Type" maxOccurs="unbounded"/&gt;
 *             &lt;element name="LIST_SERVICE_COVERAGE_INFO_GROUP" type="{}LIST_SERVICE_COVERAGE_INFO_GROUP_Type" maxOccurs="unbounded"/&gt;
 *             &lt;element ref="{}LIST_SERVICE_FEE_REFS" maxOccurs="unbounded"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="LIST_SERVICE_FEE_INFO_PER_BOUND" maxOccurs="unbounded"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="BOUND_ID" type="{}unprotectedStringType"/&gt;
 *                       &lt;element name="LIST_SERVICE_FEE_INFO_GROUP" type="{}LIST_SERVICE_FEE_INFO_GROUP_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="LIST_SERVICE_COVERAGE_INFO_PER_BOUND" maxOccurs="unbounded"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="BOUND_ID" type="{}unprotectedStringType"/&gt;
 *                       &lt;element name="LIST_SERVICE_COVERAGE_INFO_GROUP" type="{}LIST_SERVICE_COVERAGE_INFO_GROUP_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="LIST_SERVICE_FEE_REFS_PER_BOUND" maxOccurs="unbounded"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="BOUND_ID" type="{}unprotectedStringType"/&gt;
 *                       &lt;element ref="{}LIST_SERVICE_FEE_REFS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LIST_SERVICE_DETAILS_GROUP" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SERVICE_OPTION_INFO"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DATA_TYPE_INFORMATION"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SUBTYPE" type="{}unprotectedStringType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DATA_INFORMATION" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="INDICATOR" type="{}unprotectedStringType"/&gt;
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
 *                   &lt;element name="FEE_DESCRIPTION_GROUP"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SERVICE_ATTRIBUTES_INFO" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ATTRIBUTE_DETAILS" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ATTRIBUTE_TYPE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="ATTRIBUTE_DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
 *                             &lt;element name="COMMERCIAL_NAME"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FREE_TEXT_QUALIFICATION"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TEXT_SUBJECT_QUALIFIER" type="{}unprotectedStringType"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="FREE_TEXT" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="LOCAL_COMMERCIAL_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                       &lt;element name="ICON_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SERVICE_DESCRIPTION_INFO" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SERVICE_REQUIREMENTS_INFO"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="SERVICE_FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                 &lt;element name="SERVICE_SUB_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                 &lt;element name="SERVICE_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                 &lt;element name="SERVICE_MARKETING_CARRIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                 &lt;element name="SERVICE_NUMBER_OF_INSTANCES" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                 &lt;element name="SERVICE_CLASSIFICATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SEAT_DETAILS" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="SEAT_CHARACTERISTICS" type="{}unprotectedStringType" maxOccurs="5"/&gt;
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
 *                             &lt;element name="ITEM_NUMBER_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ITEM_NUMBER_DETAILS"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SERVICE_FEES_GROUP_Type", propOrder = {
    "listservicefeeinfogroup",
    "listservicecoverageinfogroup",
    "listservicefeerefs",
    "listservicefeeinfoperbound",
    "listservicecoverageinfoperbound",
    "listservicefeerefsperbound",
    "listservicedetailsgroup",
    "type"
})
public class LISTSERVICEFEESGROUPType
    implements Serializable
{

    @XmlElement(name = "LIST_SERVICE_FEE_INFO_GROUP")
    protected List<LISTSERVICEFEEINFOGROUPType> listservicefeeinfogroup;
    @XmlElement(name = "LIST_SERVICE_COVERAGE_INFO_GROUP")
    protected List<LISTSERVICECOVERAGEINFOGROUPType> listservicecoverageinfogroup;
    @XmlElement(name = "LIST_SERVICE_FEE_REFS")
    protected List<LISTSERVICEFEEREFS> listservicefeerefs;
    @XmlElement(name = "LIST_SERVICE_FEE_INFO_PER_BOUND")
    protected List<LISTSERVICEFEESGROUPType.LISTSERVICEFEEINFOPERBOUND> listservicefeeinfoperbound;
    @XmlElement(name = "LIST_SERVICE_COVERAGE_INFO_PER_BOUND")
    protected List<LISTSERVICEFEESGROUPType.LISTSERVICECOVERAGEINFOPERBOUND> listservicecoverageinfoperbound;
    @XmlElement(name = "LIST_SERVICE_FEE_REFS_PER_BOUND")
    protected List<LISTSERVICEFEESGROUPType.LISTSERVICEFEEREFSPERBOUND> listservicefeerefsperbound;
    @XmlElement(name = "LIST_SERVICE_DETAILS_GROUP", required = true)
    protected List<LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP> listservicedetailsgroup;
    @XmlElement(name = "TYPE", required = true)
    protected String type;

    /**
     * Gets the value of the listservicefeeinfogroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicefeeinfogroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEFEEINFOGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEEINFOGROUPType }
     * 
     * 
     */
    public List<LISTSERVICEFEEINFOGROUPType> getLISTSERVICEFEEINFOGROUP() {
        if (listservicefeeinfogroup == null) {
            listservicefeeinfogroup = new ArrayList<LISTSERVICEFEEINFOGROUPType>();
        }
        return this.listservicefeeinfogroup;
    }

    /**
     * Gets the value of the listservicecoverageinfogroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicecoverageinfogroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICECOVERAGEINFOGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICECOVERAGEINFOGROUPType }
     * 
     * 
     */
    public List<LISTSERVICECOVERAGEINFOGROUPType> getLISTSERVICECOVERAGEINFOGROUP() {
        if (listservicecoverageinfogroup == null) {
            listservicecoverageinfogroup = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType>();
        }
        return this.listservicecoverageinfogroup;
    }

    /**
     * Gets the value of the listservicefeerefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicefeerefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEFEEREFS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEEREFS }
     * 
     * 
     */
    public List<LISTSERVICEFEEREFS> getLISTSERVICEFEEREFS() {
        if (listservicefeerefs == null) {
            listservicefeerefs = new ArrayList<LISTSERVICEFEEREFS>();
        }
        return this.listservicefeerefs;
    }

    /**
     * Gets the value of the listservicefeeinfoperbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicefeeinfoperbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEFEEINFOPERBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEESGROUPType.LISTSERVICEFEEINFOPERBOUND }
     * 
     * 
     */
    public List<LISTSERVICEFEESGROUPType.LISTSERVICEFEEINFOPERBOUND> getLISTSERVICEFEEINFOPERBOUND() {
        if (listservicefeeinfoperbound == null) {
            listservicefeeinfoperbound = new ArrayList<LISTSERVICEFEESGROUPType.LISTSERVICEFEEINFOPERBOUND>();
        }
        return this.listservicefeeinfoperbound;
    }

    /**
     * Gets the value of the listservicecoverageinfoperbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicecoverageinfoperbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICECOVERAGEINFOPERBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEESGROUPType.LISTSERVICECOVERAGEINFOPERBOUND }
     * 
     * 
     */
    public List<LISTSERVICEFEESGROUPType.LISTSERVICECOVERAGEINFOPERBOUND> getLISTSERVICECOVERAGEINFOPERBOUND() {
        if (listservicecoverageinfoperbound == null) {
            listservicecoverageinfoperbound = new ArrayList<LISTSERVICEFEESGROUPType.LISTSERVICECOVERAGEINFOPERBOUND>();
        }
        return this.listservicecoverageinfoperbound;
    }

    /**
     * Gets the value of the listservicefeerefsperbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicefeerefsperbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEFEEREFSPERBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEESGROUPType.LISTSERVICEFEEREFSPERBOUND }
     * 
     * 
     */
    public List<LISTSERVICEFEESGROUPType.LISTSERVICEFEEREFSPERBOUND> getLISTSERVICEFEEREFSPERBOUND() {
        if (listservicefeerefsperbound == null) {
            listservicefeerefsperbound = new ArrayList<LISTSERVICEFEESGROUPType.LISTSERVICEFEEREFSPERBOUND>();
        }
        return this.listservicefeerefsperbound;
    }

    /**
     * Gets the value of the listservicedetailsgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicedetailsgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEDETAILSGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP }
     * 
     * 
     */
    public List<LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP> getLISTSERVICEDETAILSGROUP() {
        if (listservicedetailsgroup == null) {
            listservicedetailsgroup = new ArrayList<LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP>();
        }
        return this.listservicedetailsgroup;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BOUND_ID" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LIST_SERVICE_COVERAGE_INFO_GROUP" type="{}LIST_SERVICE_COVERAGE_INFO_GROUP_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "boundid",
        "listservicecoverageinfogroup"
    })
    public static class LISTSERVICECOVERAGEINFOPERBOUND
        implements Serializable
    {

        @XmlElement(name = "BOUND_ID", required = true)
        protected String boundid;
        @XmlElement(name = "LIST_SERVICE_COVERAGE_INFO_GROUP")
        protected List<LISTSERVICECOVERAGEINFOGROUPType> listservicecoverageinfogroup;

        /**
         * Gets the value of the boundid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOUNDID() {
            return boundid;
        }

        /**
         * Sets the value of the boundid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOUNDID(String value) {
            this.boundid = value;
        }

        /**
         * Gets the value of the listservicecoverageinfogroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listservicecoverageinfogroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICECOVERAGEINFOGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTSERVICECOVERAGEINFOGROUPType }
         * 
         * 
         */
        public List<LISTSERVICECOVERAGEINFOGROUPType> getLISTSERVICECOVERAGEINFOGROUP() {
            if (listservicecoverageinfogroup == null) {
                listservicecoverageinfogroup = new ArrayList<LISTSERVICECOVERAGEINFOGROUPType>();
            }
            return this.listservicecoverageinfogroup;
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
     *         &lt;element name="SERVICE_OPTION_INFO"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DATA_TYPE_INFORMATION"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SUBTYPE" type="{}unprotectedStringType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DATA_INFORMATION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="INDICATOR" type="{}unprotectedStringType"/&gt;
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
     *         &lt;element name="FEE_DESCRIPTION_GROUP"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SERVICE_ATTRIBUTES_INFO" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ATTRIBUTE_DETAILS" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ATTRIBUTE_TYPE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="ATTRIBUTE_DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
     *                   &lt;element name="COMMERCIAL_NAME"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FREE_TEXT_QUALIFICATION"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TEXT_SUBJECT_QUALIFIER" type="{}unprotectedStringType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="FREE_TEXT" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="LOCAL_COMMERCIAL_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                             &lt;element name="ICON_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SERVICE_DESCRIPTION_INFO" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SERVICE_REQUIREMENTS_INFO"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="SERVICE_FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                       &lt;element name="SERVICE_SUB_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                       &lt;element name="SERVICE_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                       &lt;element name="SERVICE_MARKETING_CARRIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                       &lt;element name="SERVICE_NUMBER_OF_INSTANCES" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                       &lt;element name="SERVICE_CLASSIFICATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="SEAT_DETAILS" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="SEAT_CHARACTERISTICS" type="{}unprotectedStringType" maxOccurs="5"/&gt;
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
     *                   &lt;element name="ITEM_NUMBER_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ITEM_NUMBER_DETAILS"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
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
        "serviceoptioninfo",
        "feedescriptiongroup"
    })
    public static class LISTSERVICEDETAILSGROUP
        implements Serializable
    {

        @XmlElement(name = "SERVICE_OPTION_INFO", required = true)
        protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO serviceoptioninfo;
        @XmlElement(name = "FEE_DESCRIPTION_GROUP", required = true)
        protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP feedescriptiongroup;

        /**
         * Gets the value of the serviceoptioninfo property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO }
         *     
         */
        public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO getSERVICEOPTIONINFO() {
            return serviceoptioninfo;
        }

        /**
         * Sets the value of the serviceoptioninfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO }
         *     
         */
        public void setSERVICEOPTIONINFO(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO value) {
            this.serviceoptioninfo = value;
        }

        /**
         * Gets the value of the feedescriptiongroup property.
         * 
         * @return
         *     possible object is
         *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP }
         *     
         */
        public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP getFEEDESCRIPTIONGROUP() {
            return feedescriptiongroup;
        }

        /**
         * Sets the value of the feedescriptiongroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP }
         *     
         */
        public void setFEEDESCRIPTIONGROUP(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP value) {
            this.feedescriptiongroup = value;
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
         *         &lt;element name="SERVICE_ATTRIBUTES_INFO" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ATTRIBUTE_DETAILS" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ATTRIBUTE_TYPE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="ATTRIBUTE_DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
         *         &lt;element name="COMMERCIAL_NAME"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FREE_TEXT_QUALIFICATION"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TEXT_SUBJECT_QUALIFIER" type="{}unprotectedStringType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="FREE_TEXT" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="LOCAL_COMMERCIAL_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                   &lt;element name="ICON_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SERVICE_DESCRIPTION_INFO" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SERVICE_REQUIREMENTS_INFO"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="SERVICE_FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                             &lt;element name="SERVICE_SUB_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                             &lt;element name="SERVICE_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                             &lt;element name="SERVICE_MARKETING_CARRIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                             &lt;element name="SERVICE_NUMBER_OF_INSTANCES" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                             &lt;element name="SERVICE_CLASSIFICATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="SEAT_DETAILS" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="SEAT_CHARACTERISTICS" type="{}unprotectedStringType" maxOccurs="5"/&gt;
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
         *                   &lt;element name="ITEM_NUMBER_DETAILS"&gt;
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
        @XmlType(name = "", propOrder = {
            "serviceattributesinfo",
            "commercialname",
            "servicedescriptioninfo",
            "itemnumberinfo"
        })
        public static class FEEDESCRIPTIONGROUP
            implements Serializable
        {

            @XmlElement(name = "SERVICE_ATTRIBUTES_INFO")
            protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO serviceattributesinfo;
            @XmlElement(name = "COMMERCIAL_NAME", required = true)
            protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME commercialname;
            @XmlElement(name = "SERVICE_DESCRIPTION_INFO")
            protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO servicedescriptioninfo;
            @XmlElement(name = "ITEM_NUMBER_INFO", required = true)
            protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO itemnumberinfo;

            /**
             * Gets the value of the serviceattributesinfo property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO }
             *     
             */
            public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO getSERVICEATTRIBUTESINFO() {
                return serviceattributesinfo;
            }

            /**
             * Sets the value of the serviceattributesinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO }
             *     
             */
            public void setSERVICEATTRIBUTESINFO(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO value) {
                this.serviceattributesinfo = value;
            }

            /**
             * Gets the value of the commercialname property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME }
             *     
             */
            public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME getCOMMERCIALNAME() {
                return commercialname;
            }

            /**
             * Sets the value of the commercialname property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME }
             *     
             */
            public void setCOMMERCIALNAME(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME value) {
                this.commercialname = value;
            }

            /**
             * Gets the value of the servicedescriptioninfo property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO }
             *     
             */
            public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO getSERVICEDESCRIPTIONINFO() {
                return servicedescriptioninfo;
            }

            /**
             * Sets the value of the servicedescriptioninfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO }
             *     
             */
            public void setSERVICEDESCRIPTIONINFO(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO value) {
                this.servicedescriptioninfo = value;
            }

            /**
             * Gets the value of the itemnumberinfo property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO }
             *     
             */
            public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO getITEMNUMBERINFO() {
                return itemnumberinfo;
            }

            /**
             * Sets the value of the itemnumberinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO }
             *     
             */
            public void setITEMNUMBERINFO(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO value) {
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
             *         &lt;element name="FREE_TEXT_QUALIFICATION"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TEXT_SUBJECT_QUALIFIER" type="{}unprotectedStringType"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="FREE_TEXT" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="LOCAL_COMMERCIAL_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *         &lt;element name="ICON_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                "freetextqualification",
                "freetext",
                "localcommercialname",
                "iconname"
            })
            public static class COMMERCIALNAME
                implements Serializable
            {

                @XmlElement(name = "FREE_TEXT_QUALIFICATION", required = true)
                protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION freetextqualification;
                @XmlElement(name = "FREE_TEXT", required = true)
                protected String freetext;
                @XmlElement(name = "LOCAL_COMMERCIAL_NAME")
                protected String localcommercialname;
                @XmlElement(name = "ICON_NAME")
                protected String iconname;

                /**
                 * Gets the value of the freetextqualification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION }
                 *     
                 */
                public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION getFREETEXTQUALIFICATION() {
                    return freetextqualification;
                }

                /**
                 * Sets the value of the freetextqualification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION }
                 *     
                 */
                public void setFREETEXTQUALIFICATION(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION value) {
                    this.freetextqualification = value;
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
                 * Gets the value of the localcommercialname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLOCALCOMMERCIALNAME() {
                    return localcommercialname;
                }

                /**
                 * Sets the value of the localcommercialname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLOCALCOMMERCIALNAME(String value) {
                    this.localcommercialname = value;
                }

                /**
                 * Gets the value of the iconname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getICONNAME() {
                    return iconname;
                }

                /**
                 * Sets the value of the iconname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setICONNAME(String value) {
                    this.iconname = value;
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
                 *         &lt;element name="TEXT_SUBJECT_QUALIFIER" type="{}unprotectedStringType"/&gt;
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
                    "textsubjectqualifier"
                })
                public static class FREETEXTQUALIFICATION
                    implements Serializable
                {

                    @XmlElement(name = "TEXT_SUBJECT_QUALIFIER", required = true)
                    protected String textsubjectqualifier;

                    /**
                     * Gets the value of the textsubjectqualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTEXTSUBJECTQUALIFIER() {
                        return textsubjectqualifier;
                    }

                    /**
                     * Sets the value of the textsubjectqualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTEXTSUBJECTQUALIFIER(String value) {
                        this.textsubjectqualifier = value;
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
             *         &lt;element name="ITEM_NUMBER_DETAILS"&gt;
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
                "itemnumberdetails"
            })
            public static class ITEMNUMBERINFO
                implements Serializable
            {

                @XmlElement(name = "ITEM_NUMBER_DETAILS", required = true)
                protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS itemnumberdetails;

                /**
                 * Gets the value of the itemnumberdetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS }
                 *     
                 */
                public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS getITEMNUMBERDETAILS() {
                    return itemnumberdetails;
                }

                /**
                 * Sets the value of the itemnumberdetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS }
                 *     
                 */
                public void setITEMNUMBERDETAILS(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS value) {
                    this.itemnumberdetails = value;
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
                public static class ITEMNUMBERDETAILS
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
             *         &lt;element name="ATTRIBUTE_DETAILS" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ATTRIBUTE_TYPE" type="{}unprotectedStringType"/&gt;
             *                   &lt;element name="ATTRIBUTE_DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
                "attributedetails"
            })
            public static class SERVICEATTRIBUTESINFO
                implements Serializable
            {

                @XmlElement(name = "ATTRIBUTE_DETAILS", required = true)
                protected List<LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO.ATTRIBUTEDETAILS> attributedetails;

                /**
                 * Gets the value of the attributedetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the attributedetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getATTRIBUTEDETAILS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO.ATTRIBUTEDETAILS }
                 * 
                 * 
                 */
                public List<LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO.ATTRIBUTEDETAILS> getATTRIBUTEDETAILS() {
                    if (attributedetails == null) {
                        attributedetails = new ArrayList<LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO.ATTRIBUTEDETAILS>();
                    }
                    return this.attributedetails;
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
                 *         &lt;element name="ATTRIBUTE_TYPE" type="{}unprotectedStringType"/&gt;
                 *         &lt;element name="ATTRIBUTE_DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
                    "attributetype",
                    "attributedescription"
                })
                public static class ATTRIBUTEDETAILS
                    implements Serializable
                {

                    @XmlElement(name = "ATTRIBUTE_TYPE", required = true)
                    protected String attributetype;
                    @XmlElement(name = "ATTRIBUTE_DESCRIPTION", required = true)
                    protected String attributedescription;

                    /**
                     * Gets the value of the attributetype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTETYPE() {
                        return attributetype;
                    }

                    /**
                     * Sets the value of the attributetype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTETYPE(String value) {
                        this.attributetype = value;
                    }

                    /**
                     * Gets the value of the attributedescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getATTRIBUTEDESCRIPTION() {
                        return attributedescription;
                    }

                    /**
                     * Sets the value of the attributedescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setATTRIBUTEDESCRIPTION(String value) {
                        this.attributedescription = value;
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
             *         &lt;element name="SERVICE_REQUIREMENTS_INFO"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="SERVICE_FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                   &lt;element name="SERVICE_SUB_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                   &lt;element name="SERVICE_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                   &lt;element name="SERVICE_MARKETING_CARRIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                   &lt;element name="SERVICE_NUMBER_OF_INSTANCES" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                   &lt;element name="SERVICE_CLASSIFICATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="SEAT_DETAILS" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="SEAT_CHARACTERISTICS" type="{}unprotectedStringType" maxOccurs="5"/&gt;
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
                "servicerequirementsinfo",
                "seatdetails"
            })
            public static class SERVICEDESCRIPTIONINFO
                implements Serializable
            {

                @XmlElement(name = "SERVICE_REQUIREMENTS_INFO", required = true)
                protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO servicerequirementsinfo;
                @XmlElement(name = "SEAT_DETAILS")
                protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS seatdetails;

                /**
                 * Gets the value of the servicerequirementsinfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO }
                 *     
                 */
                public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO getSERVICEREQUIREMENTSINFO() {
                    return servicerequirementsinfo;
                }

                /**
                 * Sets the value of the servicerequirementsinfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO }
                 *     
                 */
                public void setSERVICEREQUIREMENTSINFO(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO value) {
                    this.servicerequirementsinfo = value;
                }

                /**
                 * Gets the value of the seatdetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS }
                 *     
                 */
                public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS getSEATDETAILS() {
                    return seatdetails;
                }

                /**
                 * Sets the value of the seatdetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS }
                 *     
                 */
                public void setSEATDETAILS(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS value) {
                    this.seatdetails = value;
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
                 *         &lt;element name="SEAT_CHARACTERISTICS" type="{}unprotectedStringType" maxOccurs="5"/&gt;
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
                    "seatcharacteristics"
                })
                public static class SEATDETAILS
                    implements Serializable
                {

                    @XmlElement(name = "SEAT_CHARACTERISTICS", required = true)
                    protected List<String> seatcharacteristics;

                    /**
                     * Gets the value of the seatcharacteristics property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the seatcharacteristics property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSEATCHARACTERISTICS().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getSEATCHARACTERISTICS() {
                        if (seatcharacteristics == null) {
                            seatcharacteristics = new ArrayList<String>();
                        }
                        return this.seatcharacteristics;
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
                 *         &lt;element name="SERVICE_FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *         &lt;element name="SERVICE_SUB_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *         &lt;element name="SERVICE_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *         &lt;element name="SERVICE_MARKETING_CARRIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *         &lt;element name="SERVICE_NUMBER_OF_INSTANCES" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *         &lt;element name="SERVICE_CLASSIFICATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                    "servicefreetext",
                    "servicesubgroup",
                    "servicegroup",
                    "servicemarketingcarrier",
                    "servicenumberofinstances",
                    "serviceclassification"
                })
                public static class SERVICEREQUIREMENTSINFO
                    implements Serializable
                {

                    @XmlElement(name = "SERVICE_FREE_TEXT")
                    protected String servicefreetext;
                    @XmlElement(name = "SERVICE_SUB_GROUP")
                    protected String servicesubgroup;
                    @XmlElement(name = "SERVICE_GROUP")
                    protected String servicegroup;
                    @XmlElement(name = "SERVICE_MARKETING_CARRIER")
                    protected String servicemarketingcarrier;
                    @XmlElement(name = "SERVICE_NUMBER_OF_INSTANCES")
                    protected String servicenumberofinstances;
                    @XmlElement(name = "SERVICE_CLASSIFICATION")
                    protected String serviceclassification;

                    /**
                     * Gets the value of the servicefreetext property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSERVICEFREETEXT() {
                        return servicefreetext;
                    }

                    /**
                     * Sets the value of the servicefreetext property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSERVICEFREETEXT(String value) {
                        this.servicefreetext = value;
                    }

                    /**
                     * Gets the value of the servicesubgroup property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSERVICESUBGROUP() {
                        return servicesubgroup;
                    }

                    /**
                     * Sets the value of the servicesubgroup property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSERVICESUBGROUP(String value) {
                        this.servicesubgroup = value;
                    }

                    /**
                     * Gets the value of the servicegroup property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSERVICEGROUP() {
                        return servicegroup;
                    }

                    /**
                     * Sets the value of the servicegroup property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSERVICEGROUP(String value) {
                        this.servicegroup = value;
                    }

                    /**
                     * Gets the value of the servicemarketingcarrier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSERVICEMARKETINGCARRIER() {
                        return servicemarketingcarrier;
                    }

                    /**
                     * Sets the value of the servicemarketingcarrier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSERVICEMARKETINGCARRIER(String value) {
                        this.servicemarketingcarrier = value;
                    }

                    /**
                     * Gets the value of the servicenumberofinstances property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSERVICENUMBEROFINSTANCES() {
                        return servicenumberofinstances;
                    }

                    /**
                     * Sets the value of the servicenumberofinstances property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSERVICENUMBEROFINSTANCES(String value) {
                        this.servicenumberofinstances = value;
                    }

                    /**
                     * Gets the value of the serviceclassification property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSERVICECLASSIFICATION() {
                        return serviceclassification;
                    }

                    /**
                     * Sets the value of the serviceclassification property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSERVICECLASSIFICATION(String value) {
                        this.serviceclassification = value;
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
         *         &lt;element name="DATA_TYPE_INFORMATION"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SUBTYPE" type="{}unprotectedStringType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DATA_INFORMATION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="INDICATOR" type="{}unprotectedStringType"/&gt;
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
            "datatypeinformation",
            "datainformation"
        })
        public static class SERVICEOPTIONINFO
            implements Serializable
        {

            @XmlElement(name = "DATA_TYPE_INFORMATION", required = true)
            protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION datatypeinformation;
            @XmlElement(name = "DATA_INFORMATION")
            protected LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION datainformation;

            /**
             * Gets the value of the datatypeinformation property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION }
             *     
             */
            public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION getDATATYPEINFORMATION() {
                return datatypeinformation;
            }

            /**
             * Sets the value of the datatypeinformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION }
             *     
             */
            public void setDATATYPEINFORMATION(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION value) {
                this.datatypeinformation = value;
            }

            /**
             * Gets the value of the datainformation property.
             * 
             * @return
             *     possible object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION }
             *     
             */
            public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION getDATAINFORMATION() {
                return datainformation;
            }

            /**
             * Sets the value of the datainformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION }
             *     
             */
            public void setDATAINFORMATION(LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION value) {
                this.datainformation = value;
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
             *         &lt;element name="INDICATOR" type="{}unprotectedStringType"/&gt;
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
                "indicator"
            })
            public static class DATAINFORMATION
                implements Serializable
            {

                @XmlElement(name = "INDICATOR", required = true)
                protected String indicator;

                /**
                 * Gets the value of the indicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINDICATOR() {
                    return indicator;
                }

                /**
                 * Sets the value of the indicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINDICATOR(String value) {
                    this.indicator = value;
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
             *         &lt;element name="SUBTYPE" type="{}unprotectedStringType"/&gt;
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
                "subtype"
            })
            public static class DATATYPEINFORMATION
                implements Serializable
            {

                @XmlElement(name = "SUBTYPE", required = true)
                protected String subtype;

                /**
                 * Gets the value of the subtype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSUBTYPE() {
                    return subtype;
                }

                /**
                 * Sets the value of the subtype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSUBTYPE(String value) {
                    this.subtype = value;
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
     *         &lt;element name="BOUND_ID" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LIST_SERVICE_FEE_INFO_GROUP" type="{}LIST_SERVICE_FEE_INFO_GROUP_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "boundid",
        "listservicefeeinfogroup"
    })
    public static class LISTSERVICEFEEINFOPERBOUND
        implements Serializable
    {

        @XmlElement(name = "BOUND_ID", required = true)
        protected String boundid;
        @XmlElement(name = "LIST_SERVICE_FEE_INFO_GROUP")
        protected List<LISTSERVICEFEEINFOGROUPType> listservicefeeinfogroup;

        /**
         * Gets the value of the boundid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOUNDID() {
            return boundid;
        }

        /**
         * Sets the value of the boundid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOUNDID(String value) {
            this.boundid = value;
        }

        /**
         * Gets the value of the listservicefeeinfogroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listservicefeeinfogroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICEFEEINFOGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTSERVICEFEEINFOGROUPType }
         * 
         * 
         */
        public List<LISTSERVICEFEEINFOGROUPType> getLISTSERVICEFEEINFOGROUP() {
            if (listservicefeeinfogroup == null) {
                listservicefeeinfogroup = new ArrayList<LISTSERVICEFEEINFOGROUPType>();
            }
            return this.listservicefeeinfogroup;
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
     *         &lt;element name="BOUND_ID" type="{}unprotectedStringType"/&gt;
     *         &lt;element ref="{}LIST_SERVICE_FEE_REFS" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "boundid",
        "listservicefeerefs"
    })
    public static class LISTSERVICEFEEREFSPERBOUND
        implements Serializable
    {

        @XmlElement(name = "BOUND_ID", required = true)
        protected String boundid;
        @XmlElement(name = "LIST_SERVICE_FEE_REFS")
        protected List<LISTSERVICEFEEREFS> listservicefeerefs;

        /**
         * Gets the value of the boundid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOUNDID() {
            return boundid;
        }

        /**
         * Sets the value of the boundid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOUNDID(String value) {
            this.boundid = value;
        }

        /**
         * Gets the value of the listservicefeerefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listservicefeerefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICEFEEREFS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTSERVICEFEEREFS }
         * 
         * 
         */
        public List<LISTSERVICEFEEREFS> getLISTSERVICEFEEREFS() {
            if (listservicefeerefs == null) {
                listservicefeerefs = new ArrayList<LISTSERVICEFEEREFS>();
            }
            return this.listservicefeerefs;
        }

    }

}
