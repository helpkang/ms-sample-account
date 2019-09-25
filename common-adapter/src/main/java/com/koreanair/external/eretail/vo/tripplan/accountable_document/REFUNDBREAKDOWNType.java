
package com.koreanair.external.eretail.vo.tripplan.accountable_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.AmountType;


/**
 * <p>Java class for REFUND_BREAKDOWN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REFUND_BREAKDOWN_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BREAKDOWN_ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT_DETAILS" type="{}amountType"/&gt;
 *                   &lt;element name="LIST_ASSOCIATIONS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ASSOCIATION" maxOccurs="2"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="LIST"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ELEMENT" type="{}REFUND_BREAKDOWN_ASSOCIATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REFUND_BREAKDOWN_Type", propOrder = {
    "breakdownelement"
})
public class REFUNDBREAKDOWNType
    implements Serializable
{

    @XmlElement(name = "BREAKDOWN_ELEMENT")
    protected List<REFUNDBREAKDOWNType.BREAKDOWNELEMENT> breakdownelement;

    /**
     * Gets the value of the breakdownelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakdownelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBREAKDOWNELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REFUNDBREAKDOWNType.BREAKDOWNELEMENT }
     * 
     * 
     */
    public List<REFUNDBREAKDOWNType.BREAKDOWNELEMENT> getBREAKDOWNELEMENT() {
        if (breakdownelement == null) {
            breakdownelement = new ArrayList<REFUNDBREAKDOWNType.BREAKDOWNELEMENT>();
        }
        return this.breakdownelement;
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
     *         &lt;element name="AMOUNT_DETAILS" type="{}amountType"/&gt;
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
     *                             &lt;element name="LIST"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ELEMENT" type="{}REFUND_BREAKDOWN_ASSOCIATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "amountdetails",
        "listassociations"
    })
    public static class BREAKDOWNELEMENT
        implements Serializable
    {

        @XmlElement(name = "AMOUNT_DETAILS", required = true)
        protected AmountType amountdetails;
        @XmlElement(name = "LIST_ASSOCIATIONS")
        protected REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS listassociations;

        /**
         * Gets the value of the amountdetails property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAMOUNTDETAILS() {
            return amountdetails;
        }

        /**
         * Sets the value of the amountdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAMOUNTDETAILS(AmountType value) {
            this.amountdetails = value;
        }

        /**
         * Gets the value of the listassociations property.
         * 
         * @return
         *     possible object is
         *     {@link REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS }
         *     
         */
        public REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS getLISTASSOCIATIONS() {
            return listassociations;
        }

        /**
         * Sets the value of the listassociations property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS }
         *     
         */
        public void setLISTASSOCIATIONS(REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS value) {
            this.listassociations = value;
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
         *                   &lt;element name="LIST"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ELEMENT" type="{}REFUND_BREAKDOWN_ASSOCIATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            protected List<REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION> association;

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
             * {@link REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION }
             * 
             * 
             */
            public List<REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION> getASSOCIATION() {
                if (association == null) {
                    association = new ArrayList<REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION>();
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
             *         &lt;element name="LIST"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ELEMENT" type="{}REFUND_BREAKDOWN_ASSOCIATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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

                @XmlElement(name = "LIST", required = true)
                protected REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION.LIST list;

                /**
                 * Gets the value of the list property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION.LIST }
                 *     
                 */
                public REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION.LIST getLIST() {
                    return list;
                }

                /**
                 * Sets the value of the list property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION.LIST }
                 *     
                 */
                public void setLIST(REFUNDBREAKDOWNType.BREAKDOWNELEMENT.LISTASSOCIATIONS.ASSOCIATION.LIST value) {
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
                 *         &lt;element name="ELEMENT" type="{}REFUND_BREAKDOWN_ASSOCIATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                    protected List<REFUNDBREAKDOWNASSOCIATIONType> element;

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
                     * {@link REFUNDBREAKDOWNASSOCIATIONType }
                     * 
                     * 
                     */
                    public List<REFUNDBREAKDOWNASSOCIATIONType> getELEMENT() {
                        if (element == null) {
                            element = new ArrayList<REFUNDBREAKDOWNASSOCIATIONType>();
                        }
                        return this.element;
                    }

                }

            }

        }

    }

}
