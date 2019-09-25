
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


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
 *         &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}PRICE"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                   &lt;element ref="{}EXCHANGE_RATE" minOccurs="0"/&gt;
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
    "listprice"
})
@XmlRootElement(name = "MARKUP")
public class MARKUP
    implements Serializable
{

    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<MARKUP.LISTPRICE> listprice;

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
     * {@link MARKUP.LISTPRICE }
     * 
     * 
     */
    public List<MARKUP.LISTPRICE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<MARKUP.LISTPRICE>();
        }
        return this.listprice;
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
     *         &lt;element ref="{}PRICE"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *         &lt;element ref="{}EXCHANGE_RATE" minOccurs="0"/&gt;
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
        "price",
        "currency",
        "exchangerate"
    })
    public static class LISTPRICE
        implements Serializable
    {

        @XmlElement(name = "PRICE")
        protected float price;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "EXCHANGE_RATE")
        protected BigDecimal exchangerate;

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
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXCHANGERATE() {
            return exchangerate;
        }

        /**
         * Sets the value of the exchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXCHANGERATE(BigDecimal value) {
            this.exchangerate = value;
        }

    }

}
