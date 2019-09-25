
package com.koreanair.eretail.pojo.tripplan.traveller_information_ff;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAVELLER_INFORMATION_FF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_INFORMATION_FF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PREFERENCES" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DELETED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AIR_PREFERENCES" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LIST_FREQUENT_FLYER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE_FF"&gt;
 *                                     &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
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
@XmlType(name = "TRAVELLER_INFORMATION_FF", propOrder = {
    "type",
    "travellerid",
    "listpreferences"
})
public class TRAVELLERINFORMATIONFF
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "LIST_PREFERENCES")
    protected List<TRAVELLERINFORMATIONFF.LISTPREFERENCES> listpreferences;

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
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the listpreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPREFERENCES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERINFORMATIONFF.LISTPREFERENCES }
     * 
     * 
     */
    public List<TRAVELLERINFORMATIONFF.LISTPREFERENCES> getLISTPREFERENCES() {
        if (listpreferences == null) {
            listpreferences = new ArrayList<TRAVELLERINFORMATIONFF.LISTPREFERENCES>();
        }
        return this.listpreferences;
    }


    /**
     * List of preferences
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DELETED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AIR_PREFERENCES" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_FREQUENT_FLYER" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE_FF"&gt;
     *                           &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
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
        "deletedelement",
        "airpreferences"
    })
    public static class LISTPREFERENCES
        implements Serializable
    {

        @XmlElement(name = "DELETED_ELEMENT")
        protected Boolean deletedelement;
        @XmlElement(name = "AIR_PREFERENCES")
        protected TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES airpreferences;

        /**
         * Gets the value of the deletedelement property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDELETEDELEMENT() {
            return deletedelement;
        }

        /**
         * Sets the value of the deletedelement property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDELETEDELEMENT(Boolean value) {
            this.deletedelement = value;
        }

        /**
         * Gets the value of the airpreferences property.
         * 
         * @return
         *     possible object is
         *     {@link TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES }
         *     
         */
        public TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES getAIRPREFERENCES() {
            return airpreferences;
        }

        /**
         * Sets the value of the airpreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES }
         *     
         */
        public void setAIRPREFERENCES(TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES value) {
            this.airpreferences = value;
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
         *         &lt;element name="LIST_FREQUENT_FLYER" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE_FF"&gt;
         *                 &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
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
            "listfrequentflyer"
        })
        public static class AIRPREFERENCES
            implements Serializable
        {

            @XmlElement(name = "LIST_FREQUENT_FLYER")
            protected List<TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER> listfrequentflyer;

            /**
             * Gets the value of the listfrequentflyer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listfrequentflyer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTFREQUENTFLYER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER }
             * 
             * 
             */
            public List<TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER> getLISTFREQUENTFLYER() {
                if (listfrequentflyer == null) {
                    listfrequentflyer = new ArrayList<TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER>();
                }
                return this.listfrequentflyer;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE_FF"&gt;
             *       &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LISTFREQUENTFLYER
                extends LISTFREQUENTFLYERTYPEFF
                implements Serializable
            {

                @XmlAttribute(name = "isValid")
                protected String isValid;

                /**
                 * Gets the value of the isValid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsValid() {
                    return isValid;
                }

                /**
                 * Sets the value of the isValid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsValid(String value) {
                    this.isValid = value;
                }

            }

        }

    }

}
