
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOUNT_SUPPLEMENTARY_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNT_SUPPLEMENTARY_DATA_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CRITERIA" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CRITERIA_SET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LIST_CRITERIA_DETAIL" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "ACCOUNT_SUPPLEMENTARY_DATA_Type", propOrder = {
    "listcriteria"
})
public class ACCOUNTSUPPLEMENTARYDATAType
    implements Serializable
{

    @XmlElement(name = "LIST_CRITERIA")
    protected List<ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA> listcriteria;

    /**
     * Gets the value of the listcriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCRITERIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA }
     * 
     * 
     */
    public List<ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA> getLISTCRITERIA() {
        if (listcriteria == null) {
            listcriteria = new ArrayList<ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA>();
        }
        return this.listcriteria;
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
     *         &lt;element name="CRITERIA_SET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LIST_CRITERIA_DETAIL" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "criteriasettype",
        "listcriteriadetail"
    })
    public static class LISTCRITERIA
        implements Serializable
    {

        @XmlElement(name = "CRITERIA_SET_TYPE", required = true)
        protected String criteriasettype;
        @XmlElement(name = "LIST_CRITERIA_DETAIL", required = true)
        protected List<ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA.LISTCRITERIADETAIL> listcriteriadetail;

        /**
         * Gets the value of the criteriasettype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRITERIASETTYPE() {
            return criteriasettype;
        }

        /**
         * Sets the value of the criteriasettype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRITERIASETTYPE(String value) {
            this.criteriasettype = value;
        }

        /**
         * Gets the value of the listcriteriadetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcriteriadetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCRITERIADETAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA.LISTCRITERIADETAIL }
         * 
         * 
         */
        public List<ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA.LISTCRITERIADETAIL> getLISTCRITERIADETAIL() {
            if (listcriteriadetail == null) {
                listcriteriadetail = new ArrayList<ACCOUNTSUPPLEMENTARYDATAType.LISTCRITERIA.LISTCRITERIADETAIL>();
            }
            return this.listcriteriadetail;
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
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        public static class LISTCRITERIADETAIL
            implements Serializable
        {

            @XmlElement(name = "KEY", required = true)
            protected Object key;
            @XmlElement(name = "VALUE")
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

    }

}
