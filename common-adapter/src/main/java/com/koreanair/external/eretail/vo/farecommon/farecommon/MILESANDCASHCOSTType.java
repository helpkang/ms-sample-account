
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MILES_AND_CASH_COST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MILES_AND_CASH_COST_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CONVERTED_CASH_MILES"/&gt;
 *         &lt;element ref="{}NON_CONVERTED_AMOUNT" minOccurs="0"/&gt;
 *         &lt;element ref="{}CONVERTED_AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="RESULTING_MILES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}MINIMUM_MILES_COST" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ADDITIONAL_MILES_CASH_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}CONVERTED_CASH_MILES" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "MILES_AND_CASH_COST_Type", propOrder = {
    "convertedcashmiles",
    "nonconvertedamount",
    "convertedamount",
    "resultingmiles",
    "minimummilescost",
    "listadditionalmilescashinfo"
})
public class MILESANDCASHCOSTType
    implements Serializable
{

    @XmlElement(name = "CONVERTED_CASH_MILES", required = true)
    protected BigInteger convertedcashmiles;
    @XmlElement(name = "NON_CONVERTED_AMOUNT")
    protected NONCONVERTEDAMOUNT nonconvertedamount;
    @XmlElement(name = "CONVERTED_AMOUNT")
    protected CONVERTEDAMOUNT convertedamount;
    @XmlElement(name = "RESULTING_MILES")
    protected MILESANDCASHCOSTType.RESULTINGMILES resultingmiles;
    @XmlElement(name = "MINIMUM_MILES_COST")
    protected BigInteger minimummilescost;
    @XmlElement(name = "LIST_ADDITIONAL_MILES_CASH_INFO")
    protected List<MILESANDCASHCOSTType.LISTADDITIONALMILESCASHINFO> listadditionalmilescashinfo;

    /**
     * Gets the value of the convertedcashmiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONVERTEDCASHMILES() {
        return convertedcashmiles;
    }

    /**
     * Sets the value of the convertedcashmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONVERTEDCASHMILES(BigInteger value) {
        this.convertedcashmiles = value;
    }

    /**
     * Gets the value of the nonconvertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link NONCONVERTEDAMOUNT }
     *     
     */
    public NONCONVERTEDAMOUNT getNONCONVERTEDAMOUNT() {
        return nonconvertedamount;
    }

    /**
     * Sets the value of the nonconvertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NONCONVERTEDAMOUNT }
     *     
     */
    public void setNONCONVERTEDAMOUNT(NONCONVERTEDAMOUNT value) {
        this.nonconvertedamount = value;
    }

    /**
     * Gets the value of the convertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link CONVERTEDAMOUNT }
     *     
     */
    public CONVERTEDAMOUNT getCONVERTEDAMOUNT() {
        return convertedamount;
    }

    /**
     * Sets the value of the convertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONVERTEDAMOUNT }
     *     
     */
    public void setCONVERTEDAMOUNT(CONVERTEDAMOUNT value) {
        this.convertedamount = value;
    }

    /**
     * Gets the value of the resultingmiles property.
     * 
     * @return
     *     possible object is
     *     {@link MILESANDCASHCOSTType.RESULTINGMILES }
     *     
     */
    public MILESANDCASHCOSTType.RESULTINGMILES getRESULTINGMILES() {
        return resultingmiles;
    }

    /**
     * Sets the value of the resultingmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILESANDCASHCOSTType.RESULTINGMILES }
     *     
     */
    public void setRESULTINGMILES(MILESANDCASHCOSTType.RESULTINGMILES value) {
        this.resultingmiles = value;
    }

    /**
     * Gets the value of the minimummilescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINIMUMMILESCOST() {
        return minimummilescost;
    }

    /**
     * Sets the value of the minimummilescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINIMUMMILESCOST(BigInteger value) {
        this.minimummilescost = value;
    }

    /**
     * Gets the value of the listadditionalmilescashinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalmilescashinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALMILESCASHINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MILESANDCASHCOSTType.LISTADDITIONALMILESCASHINFO }
     * 
     * 
     */
    public List<MILESANDCASHCOSTType.LISTADDITIONALMILESCASHINFO> getLISTADDITIONALMILESCASHINFO() {
        if (listadditionalmilescashinfo == null) {
            listadditionalmilescashinfo = new ArrayList<MILESANDCASHCOSTType.LISTADDITIONALMILESCASHINFO>();
        }
        return this.listadditionalmilescashinfo;
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
     *         &lt;element ref="{}CONVERTED_CASH_MILES" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "convertedcashmiles",
        "type"
    })
    public static class LISTADDITIONALMILESCASHINFO
        implements Serializable
    {

        @XmlElement(name = "CONVERTED_CASH_MILES")
        protected BigInteger convertedcashmiles;
        @XmlElement(name = "TYPE", required = true)
        protected Object type;

        /**
         * Gets the value of the convertedcashmiles property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCONVERTEDCASHMILES() {
            return convertedcashmiles;
        }

        /**
         * Sets the value of the convertedcashmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCONVERTEDCASHMILES(BigInteger value) {
            this.convertedcashmiles = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
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
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "amount",
        "tax",
        "amountwithouttax"
    })
    public static class RESULTINGMILES
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected BigInteger amount;
        @XmlElement(name = "TAX")
        protected BigInteger tax;
        @XmlElement(name = "AMOUNT_WITHOUT_TAX")
        protected BigInteger amountwithouttax;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAMOUNT(BigInteger value) {
            this.amount = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTAX() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTAX(BigInteger value) {
            this.tax = value;
        }

        /**
         * Gets the value of the amountwithouttax property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAMOUNTWITHOUTTAX() {
            return amountwithouttax;
        }

        /**
         * Sets the value of the amountwithouttax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAMOUNTWITHOUTTAX(BigInteger value) {
            this.amountwithouttax = value;
        }

    }

}
