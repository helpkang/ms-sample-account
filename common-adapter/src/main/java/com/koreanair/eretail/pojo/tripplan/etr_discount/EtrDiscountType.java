
package com.koreanair.eretail.pojo.tripplan.etr_discount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Fare discount information
 * 
 * <p>Java class for etrDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrDiscountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT" maxOccurs="3" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMER" type="{}customerInfo"/&gt;
 *                   &lt;element name="VALIDITY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SERVICE_PROVIDER" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "etrDiscountType", propOrder = {
    "description",
    "discount"
})
public class EtrDiscountType
    implements Serializable
{

    @XmlElement(name = "DESCRIPTION")
    protected Object description;
    @XmlElement(name = "DISCOUNT")
    protected List<EtrDiscountType.DISCOUNT> discount;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDESCRIPTION(Object value) {
        this.description = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtrDiscountType.DISCOUNT }
     * 
     * 
     */
    public List<EtrDiscountType.DISCOUNT> getDISCOUNT() {
        if (discount == null) {
            discount = new ArrayList<EtrDiscountType.DISCOUNT>();
        }
        return this.discount;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMER" type="{}customerInfo"/&gt;
     *         &lt;element name="VALIDITY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SERVICE_PROVIDER" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "code",
        "percentage",
        "index",
        "customer",
        "validity",
        "serviceprovider"
    })
    public static class DISCOUNT
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected Object code;
        @XmlElement(name = "PERCENTAGE")
        protected Object percentage;
        @XmlElement(name = "INDEX")
        protected Object index;
        @XmlElement(name = "CUSTOMER", required = true)
        protected CustomerInfo customer;
        @XmlElement(name = "VALIDITY")
        protected EtrDiscountType.DISCOUNT.VALIDITY validity;
        @XmlElement(name = "SERVICE_PROVIDER")
        protected EtrDiscountType.DISCOUNT.SERVICEPROVIDER serviceprovider;

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
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPERCENTAGE() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPERCENTAGE(Object value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINDEX() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINDEX(Object value) {
            this.index = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerInfo }
         *     
         */
        public CustomerInfo getCUSTOMER() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerInfo }
         *     
         */
        public void setCUSTOMER(CustomerInfo value) {
            this.customer = value;
        }

        /**
         * Gets the value of the validity property.
         * 
         * @return
         *     possible object is
         *     {@link EtrDiscountType.DISCOUNT.VALIDITY }
         *     
         */
        public EtrDiscountType.DISCOUNT.VALIDITY getVALIDITY() {
            return validity;
        }

        /**
         * Sets the value of the validity property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrDiscountType.DISCOUNT.VALIDITY }
         *     
         */
        public void setVALIDITY(EtrDiscountType.DISCOUNT.VALIDITY value) {
            this.validity = value;
        }

        /**
         * Gets the value of the serviceprovider property.
         * 
         * @return
         *     possible object is
         *     {@link EtrDiscountType.DISCOUNT.SERVICEPROVIDER }
         *     
         */
        public EtrDiscountType.DISCOUNT.SERVICEPROVIDER getSERVICEPROVIDER() {
            return serviceprovider;
        }

        /**
         * Sets the value of the serviceprovider property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrDiscountType.DISCOUNT.SERVICEPROVIDER }
         *     
         */
        public void setSERVICEPROVIDER(EtrDiscountType.DISCOUNT.SERVICEPROVIDER value) {
            this.serviceprovider = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "code"
        })
        public static class SERVICEPROVIDER
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected Object code;

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
         *         &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "startdate",
            "enddate"
        })
        public static class VALIDITY
            implements Serializable
        {

            @XmlElement(name = "START_DATE")
            protected Object startdate;
            @XmlElement(name = "END_DATE")
            protected Object enddate;

            /**
             * Gets the value of the startdate property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSTARTDATE() {
                return startdate;
            }

            /**
             * Sets the value of the startdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSTARTDATE(Object value) {
                this.startdate = value;
            }

            /**
             * Gets the value of the enddate property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getENDDATE() {
                return enddate;
            }

            /**
             * Sets the value of the enddate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setENDDATE(Object value) {
                this.enddate = value;
            }

        }

    }

}
