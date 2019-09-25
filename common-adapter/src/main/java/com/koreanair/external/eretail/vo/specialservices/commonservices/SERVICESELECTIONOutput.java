
package com.koreanair.external.eretail.vo.specialservices.commonservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for SERVICE_SELECTION_Output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_SELECTION_Output"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_SERVICE" type="{}SERVICE_output" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SELECTION_GROUP" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SELECTION" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SERVICE_KEY" type="{}SERVICE_KEY_TYPE"/&gt;
 *                             &lt;element name="SELECTION_KEY" type="{}SELECTION_KEY_type"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PRICING_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="LIST_SERVICE_PRICE" type="{}priceAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                               &lt;element name="LIST_PRICE_SOLUTION" type="{}PRICE_SOLUTION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="LIST_TICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_TOTAL_AMOUNT" type="{}selectionTotalAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICE_SELECTION_Output", propOrder = {
    "type",
    "listservice",
    "listselectiongroup",
    "listtotalamount"
})
public class SERVICESELECTIONOutput
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "LIST_SERVICE")
    protected List<SERVICEOutput> listservice;
    @XmlElement(name = "LIST_SELECTION_GROUP")
    protected List<SERVICESELECTIONOutput.LISTSELECTIONGROUP> listselectiongroup;
    @XmlElement(name = "LIST_TOTAL_AMOUNT")
    protected List<SelectionTotalAmountType> listtotalamount;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the listservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICEOutput }
     * 
     * 
     */
    public List<SERVICEOutput> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<SERVICEOutput>();
        }
        return this.listservice;
    }

    /**
     * Gets the value of the listselectiongroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listselectiongroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSELECTIONGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELECTIONOutput.LISTSELECTIONGROUP }
     * 
     * 
     */
    public List<SERVICESELECTIONOutput.LISTSELECTIONGROUP> getLISTSELECTIONGROUP() {
        if (listselectiongroup == null) {
            listselectiongroup = new ArrayList<SERVICESELECTIONOutput.LISTSELECTIONGROUP>();
        }
        return this.listselectiongroup;
    }

    /**
     * Gets the value of the listtotalamount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtotalamount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTOTALAMOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionTotalAmountType }
     * 
     * 
     */
    public List<SelectionTotalAmountType> getLISTTOTALAMOUNT() {
        if (listtotalamount == null) {
            listtotalamount = new ArrayList<SelectionTotalAmountType>();
        }
        return this.listtotalamount;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="LIST_SELECTION" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SERVICE_KEY" type="{}SERVICE_KEY_TYPE"/&gt;
     *                   &lt;element name="SELECTION_KEY" type="{}SELECTION_KEY_type"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PRICING_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="LIST_SERVICE_PRICE" type="{}priceAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                     &lt;element name="LIST_PRICE_SOLUTION" type="{}PRICE_SOLUTION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="LIST_TICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listselection",
        "pricinginformation"
    })
    public static class LISTSELECTIONGROUP
        implements Serializable
    {

        @XmlElement(name = "LIST_SELECTION", required = true)
        protected List<SERVICESELECTIONOutput.LISTSELECTIONGROUP.LISTSELECTION> listselection;
        @XmlElement(name = "PRICING_INFORMATION")
        protected SERVICESELECTIONOutput.LISTSELECTIONGROUP.PRICINGINFORMATION pricinginformation;

        /**
         * Gets the value of the listselection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listselection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSELECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SERVICESELECTIONOutput.LISTSELECTIONGROUP.LISTSELECTION }
         * 
         * 
         */
        public List<SERVICESELECTIONOutput.LISTSELECTIONGROUP.LISTSELECTION> getLISTSELECTION() {
            if (listselection == null) {
                listselection = new ArrayList<SERVICESELECTIONOutput.LISTSELECTIONGROUP.LISTSELECTION>();
            }
            return this.listselection;
        }

        /**
         * Gets the value of the pricinginformation property.
         * 
         * @return
         *     possible object is
         *     {@link SERVICESELECTIONOutput.LISTSELECTIONGROUP.PRICINGINFORMATION }
         *     
         */
        public SERVICESELECTIONOutput.LISTSELECTIONGROUP.PRICINGINFORMATION getPRICINGINFORMATION() {
            return pricinginformation;
        }

        /**
         * Sets the value of the pricinginformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SERVICESELECTIONOutput.LISTSELECTIONGROUP.PRICINGINFORMATION }
         *     
         */
        public void setPRICINGINFORMATION(SERVICESELECTIONOutput.LISTSELECTIONGROUP.PRICINGINFORMATION value) {
            this.pricinginformation = value;
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
         *         &lt;element name="SERVICE_KEY" type="{}SERVICE_KEY_TYPE"/&gt;
         *         &lt;element name="SELECTION_KEY" type="{}SELECTION_KEY_type"/&gt;
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
            "servicekey",
            "selectionkey"
        })
        public static class LISTSELECTION
            implements Serializable
        {

            @XmlElement(name = "SERVICE_KEY", required = true)
            protected SERVICEKEYTYPE servicekey;
            @XmlElement(name = "SELECTION_KEY", required = true)
            protected SELECTIONKEYType selectionkey;

            /**
             * Gets the value of the servicekey property.
             * 
             * @return
             *     possible object is
             *     {@link SERVICEKEYTYPE }
             *     
             */
            public SERVICEKEYTYPE getSERVICEKEY() {
                return servicekey;
            }

            /**
             * Sets the value of the servicekey property.
             * 
             * @param value
             *     allowed object is
             *     {@link SERVICEKEYTYPE }
             *     
             */
            public void setSERVICEKEY(SERVICEKEYTYPE value) {
                this.servicekey = value;
            }

            /**
             * Gets the value of the selectionkey property.
             * 
             * @return
             *     possible object is
             *     {@link SELECTIONKEYType }
             *     
             */
            public SELECTIONKEYType getSELECTIONKEY() {
                return selectionkey;
            }

            /**
             * Sets the value of the selectionkey property.
             * 
             * @param value
             *     allowed object is
             *     {@link SELECTIONKEYType }
             *     
             */
            public void setSELECTIONKEY(SELECTIONKEYType value) {
                this.selectionkey = value;
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
         *         &lt;choice&gt;
         *           &lt;element name="LIST_SERVICE_PRICE" type="{}priceAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *           &lt;element name="LIST_PRICE_SOLUTION" type="{}PRICE_SOLUTION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="LIST_TICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "listserviceprice",
            "listpricesolution",
            "listticketnumber"
        })
        public static class PRICINGINFORMATION
            implements Serializable
        {

            @XmlElement(name = "LIST_SERVICE_PRICE")
            protected List<PriceAmountType> listserviceprice;
            @XmlElement(name = "LIST_PRICE_SOLUTION")
            protected List<PRICESOLUTIONTYPE> listpricesolution;
            @XmlElement(name = "LIST_TICKET_NUMBER")
            protected List<Object> listticketnumber;

            /**
             * Gets the value of the listserviceprice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listserviceprice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTSERVICEPRICE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PriceAmountType }
             * 
             * 
             */
            public List<PriceAmountType> getLISTSERVICEPRICE() {
                if (listserviceprice == null) {
                    listserviceprice = new ArrayList<PriceAmountType>();
                }
                return this.listserviceprice;
            }

            /**
             * Gets the value of the listpricesolution property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listpricesolution property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPRICESOLUTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PRICESOLUTIONTYPE }
             * 
             * 
             */
            public List<PRICESOLUTIONTYPE> getLISTPRICESOLUTION() {
                if (listpricesolution == null) {
                    listpricesolution = new ArrayList<PRICESOLUTIONTYPE>();
                }
                return this.listpricesolution;
            }

            /**
             * Gets the value of the listticketnumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listticketnumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTTICKETNUMBER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getLISTTICKETNUMBER() {
                if (listticketnumber == null) {
                    listticketnumber = new ArrayList<Object>();
                }
                return this.listticketnumber;
            }

        }

    }

}
