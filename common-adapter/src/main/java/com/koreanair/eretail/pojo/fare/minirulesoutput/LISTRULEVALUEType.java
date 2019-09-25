
package com.koreanair.eretail.pojo.fare.minirulesoutput;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LIST_RULE_VALUE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_RULE_VALUE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}KEY"/&gt;
 *         &lt;group ref="{}KeyListValueGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_RULE_VALUE_type", propOrder = {
    "key",
    "date",
    "monetaryamount",
    "flag",
    "flagaction",
    "duration"
})
public class LISTRULEVALUEType
    implements Serializable
{

    @XmlElement(name = "KEY", required = true)
    protected String key;
    @XmlElement(name = "DATE")
    protected LISTRULEVALUEType.DATE date;
    @XmlElement(name = "MONETARY_AMOUNT")
    protected LISTRULEVALUEType.MONETARYAMOUNT monetaryamount;
    @XmlElement(name = "FLAG")
    protected Boolean flag;
    @XmlElement(name = "FLAG_ACTION")
    protected String flagaction;
    @XmlElement(name = "DURATION")
    protected DURATIONType duration;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEY() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEY(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link LISTRULEVALUEType.DATE }
     *     
     */
    public LISTRULEVALUEType.DATE getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTRULEVALUEType.DATE }
     *     
     */
    public void setDATE(LISTRULEVALUEType.DATE value) {
        this.date = value;
    }

    /**
     * Gets the value of the monetaryamount property.
     * 
     * @return
     *     possible object is
     *     {@link LISTRULEVALUEType.MONETARYAMOUNT }
     *     
     */
    public LISTRULEVALUEType.MONETARYAMOUNT getMONETARYAMOUNT() {
        return monetaryamount;
    }

    /**
     * Sets the value of the monetaryamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTRULEVALUEType.MONETARYAMOUNT }
     *     
     */
    public void setMONETARYAMOUNT(LISTRULEVALUEType.MONETARYAMOUNT value) {
        this.monetaryamount = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFLAG() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFLAG(Boolean value) {
        this.flag = value;
    }

    /**
     * Gets the value of the flagaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGACTION() {
        return flagaction;
    }

    /**
     * Sets the value of the flagaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGACTION(String value) {
        this.flagaction = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DURATIONType }
     *     
     */
    public DURATIONType getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATIONType }
     *     
     */
    public void setDURATION(DURATIONType value) {
        this.duration = value;
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
     *         &lt;element name="PRECISION" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="COMPLETE"/&gt;
     *               &lt;enumeration value="COMPLETE_SIMPLE_TIME"/&gt;
     *               &lt;enumeration value="DATE_ONLY"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VALUE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "precision",
        "value"
    })
    public static class DATE
        implements Serializable
    {

        @XmlElement(name = "PRECISION")
        protected String precision;
        @XmlElement(name = "VALUE", required = true)
        protected LISTRULEVALUEType.DATE.VALUE value;

        /**
         * Gets the value of the precision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRECISION() {
            return precision;
        }

        /**
         * Sets the value of the precision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRECISION(String value) {
            this.precision = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link LISTRULEVALUEType.DATE.VALUE }
         *     
         */
        public LISTRULEVALUEType.DATE.VALUE getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTRULEVALUEType.DATE.VALUE }
         *     
         */
        public void setVALUE(LISTRULEVALUEType.DATE.VALUE value) {
            this.value = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class VALUE
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCode(XMLGregorianCalendar value) {
                this.code = value;
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
     *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        "currency",
        "amount"
    })
    public static class MONETARYAMOUNT
        implements Serializable
    {

        @XmlElement(name = "CURRENCY")
        protected int currency;
        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;

        /**
         * Gets the value of the currency property.
         * 
         */
        public int getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         */
        public void setCURRENCY(int value) {
            this.currency = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

    }

}
