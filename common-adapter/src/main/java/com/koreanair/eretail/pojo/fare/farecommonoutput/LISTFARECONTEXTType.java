
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_FARE_CONTEXT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FARE_CONTEXT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OVERRIDE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}TYPE_OF_FARE_AIR" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CORPORATE_NUMBER" maxOccurs="3" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
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
@XmlType(name = "LIST_FARE_CONTEXT_Type", propOrder = {
    "override"
})
public class LISTFARECONTEXTType
    implements Serializable
{

    @XmlElement(name = "OVERRIDE")
    protected LISTFARECONTEXTType.OVERRIDE override;

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFARECONTEXTType.OVERRIDE }
     *     
     */
    public LISTFARECONTEXTType.OVERRIDE getOVERRIDE() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFARECONTEXTType.OVERRIDE }
     *     
     */
    public void setOVERRIDE(LISTFARECONTEXTType.OVERRIDE value) {
        this.override = value;
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
     *         &lt;element ref="{}TYPE_OF_FARE_AIR" minOccurs="0"/&gt;
     *         &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CORPORATE_NUMBER" maxOccurs="3" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
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
        "typeoffareair",
        "typeofcorporatefare",
        "listcorporatenumber"
    })
    public static class OVERRIDE
        implements Serializable
    {

        @XmlElement(name = "TYPE_OF_FARE_AIR")
        protected BigInteger typeoffareair;
        @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
        protected BigInteger typeofcorporatefare;
        @XmlElement(name = "LIST_CORPORATE_NUMBER")
        protected List<LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER> listcorporatenumber;

        /**
         * Gets the value of the typeoffareair property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTYPEOFFAREAIR() {
            return typeoffareair;
        }

        /**
         * Sets the value of the typeoffareair property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTYPEOFFAREAIR(BigInteger value) {
            this.typeoffareair = value;
        }

        /**
         * Gets the value of the typeofcorporatefare property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTYPEOFCORPORATEFARE() {
            return typeofcorporatefare;
        }

        /**
         * Sets the value of the typeofcorporatefare property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTYPEOFCORPORATEFARE(BigInteger value) {
            this.typeofcorporatefare = value;
        }

        /**
         * Gets the value of the listcorporatenumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcorporatenumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCORPORATENUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER }
         * 
         * 
         */
        public List<LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
            if (listcorporatenumber == null) {
                listcorporatenumber = new ArrayList<LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER>();
            }
            return this.listcorporatenumber;
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
         *         &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
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
            "corporatenumber"
        })
        public static class LISTCORPORATENUMBER
            implements Serializable
        {

            @XmlElement(name = "CORPORATE_NUMBER", required = true)
            protected String corporatenumber;

            /**
             * Gets the value of the corporatenumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCORPORATENUMBER() {
                return corporatenumber;
            }

            /**
             * Sets the value of the corporatenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCORPORATENUMBER(String value) {
                this.corporatenumber = value;
            }

        }

    }

}
