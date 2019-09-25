
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;


/**
 * List rate type
 * 
 * <p>Java class for LIST_RATE_TYPE_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_RATE_TYPE_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATE_MSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                   &lt;element ref="{}PRICE_WITH_MARKUP" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *                   &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *                   &lt;element name="ESTIMATED_FROM_TOTAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}MARKUP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_RATE_TYPE_1", propOrder = {
    "bdate",
    "edate",
    "datemsg",
    "listprice",
    "markup"
})
@XmlSeeAlso({
    LISTRATETYPE2 .class,
    LISTRATETYPE3 .class
})
public class LISTRATETYPE1
    implements Serializable
{

    @XmlElement(name = "B_DATE", required = true)
    protected LISTRATETYPE1 .BDATE bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected LISTRATETYPE1 .EDATE edate;
    @XmlElement(name = "DATE_MSG")
    protected String datemsg;
    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<LISTRATETYPE1 .LISTPRICE> listprice;
    @XmlElement(name = "MARKUP")
    protected MARKUP markup;

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link LISTRATETYPE1 .BDATE }
     *     
     */
    public LISTRATETYPE1 .BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTRATETYPE1 .BDATE }
     *     
     */
    public void setBDATE(LISTRATETYPE1 .BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link LISTRATETYPE1 .EDATE }
     *     
     */
    public LISTRATETYPE1 .EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTRATETYPE1 .EDATE }
     *     
     */
    public void setEDATE(LISTRATETYPE1 .EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the datemsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEMSG() {
        return datemsg;
    }

    /**
     * Sets the value of the datemsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEMSG(String value) {
        this.datemsg = value;
    }

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRATETYPE1 .LISTPRICE }
     * 
     * 
     */
    public List<LISTRATETYPE1 .LISTPRICE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<LISTRATETYPE1 .LISTPRICE>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link MARKUP }
     *     
     */
    public MARKUP getMARKUP() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKUP }
     *     
     */
    public void setMARKUP(MARKUP value) {
        this.markup = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
    public static class BDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
    public static class EDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
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
     *         &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *         &lt;element ref="{}PRICE_WITH_MARKUP" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
     *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
     *         &lt;element name="ESTIMATED_FROM_TOTAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "subtotal",
        "price",
        "pricewithmarkup",
        "currency",
        "exchangerate",
        "estimatedfromtotal"
    })
    public static class LISTPRICE
        implements Serializable
    {

        @XmlElement(name = "SUB_TOTAL")
        protected Float subtotal;
        @XmlElement(name = "PRICE")
        protected float price;
        @XmlElement(name = "PRICE_WITH_MARKUP")
        protected Object pricewithmarkup;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;
        @XmlElement(name = "EXCHANGE_RATE")
        protected Float exchangerate;
        @XmlElement(name = "ESTIMATED_FROM_TOTAL")
        protected Boolean estimatedfromtotal;

        /**
         * Gets the value of the subtotal property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSUBTOTAL() {
            return subtotal;
        }

        /**
         * Sets the value of the subtotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSUBTOTAL(Float value) {
            this.subtotal = value;
        }

        /**
         * Gets the value of the price property.
         * 
         */
        public float getPRICE() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         */
        public void setPRICE(float value) {
            this.price = value;
        }

        /**
         * Gets the value of the pricewithmarkup property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPRICEWITHMARKUP() {
            return pricewithmarkup;
        }

        /**
         * Sets the value of the pricewithmarkup property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPRICEWITHMARKUP(Object value) {
            this.pricewithmarkup = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the exchangerate property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getEXCHANGERATE() {
            return exchangerate;
        }

        /**
         * Sets the value of the exchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setEXCHANGERATE(Float value) {
            this.exchangerate = value;
        }

        /**
         * Gets the value of the estimatedfromtotal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isESTIMATEDFROMTOTAL() {
            return estimatedfromtotal;
        }

        /**
         * Sets the value of the estimatedfromtotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setESTIMATEDFROMTOTAL(Boolean value) {
            this.estimatedfromtotal = value;
        }

    }

}
