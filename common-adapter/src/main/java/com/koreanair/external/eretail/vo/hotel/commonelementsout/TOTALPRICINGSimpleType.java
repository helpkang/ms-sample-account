
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOTAL_PRICINGSimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOTAL_PRICINGSimpleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOTAL_AMOUNT_TAX_INC" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{}MARKUP" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BASE_PRICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{}MARKUP" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMOUNT_WITHOUT_TAX" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{}MARKUP" minOccurs="0"/&gt;
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
@XmlType(name = "TOTAL_PRICINGSimpleType", propOrder = {
    "totalamounttaxinc",
    "baseprice",
    "amountwithouttax"
})
@XmlSeeAlso({
    TOTALPRICINGType.class
})
public class TOTALPRICINGSimpleType
    implements Serializable
{

    @XmlElement(name = "TOTAL_AMOUNT_TAX_INC")
    protected TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC totalamounttaxinc;
    @XmlElement(name = "BASE_PRICE")
    protected TOTALPRICINGSimpleType.BASEPRICE baseprice;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX")
    protected TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX amountwithouttax;

    /**
     * Gets the value of the totalamounttaxinc property.
     * 
     * @return
     *     possible object is
     *     {@link TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC }
     *     
     */
    public TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC getTOTALAMOUNTTAXINC() {
        return totalamounttaxinc;
    }

    /**
     * Sets the value of the totalamounttaxinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC }
     *     
     */
    public void setTOTALAMOUNTTAXINC(TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC value) {
        this.totalamounttaxinc = value;
    }

    /**
     * Gets the value of the baseprice property.
     * 
     * @return
     *     possible object is
     *     {@link TOTALPRICINGSimpleType.BASEPRICE }
     *     
     */
    public TOTALPRICINGSimpleType.BASEPRICE getBASEPRICE() {
        return baseprice;
    }

    /**
     * Sets the value of the baseprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOTALPRICINGSimpleType.BASEPRICE }
     *     
     */
    public void setBASEPRICE(TOTALPRICINGSimpleType.BASEPRICE value) {
        this.baseprice = value;
    }

    /**
     * Gets the value of the amountwithouttax property.
     * 
     * @return
     *     possible object is
     *     {@link TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX }
     *     
     */
    public TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX getAMOUNTWITHOUTTAX() {
        return amountwithouttax;
    }

    /**
     * Sets the value of the amountwithouttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX }
     *     
     */
    public void setAMOUNTWITHOUTTAX(TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX value) {
        this.amountwithouttax = value;
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
     *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "listprice",
        "markup"
    })
    public static class AMOUNTWITHOUTTAX
        implements Serializable
    {

        @XmlElement(name = "LIST_PRICE")
        protected List<HTLPRICETYPE> listprice;
        @XmlElement(name = "MARKUP")
        protected MARKUP markup;

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
         * {@link HTLPRICETYPE }
         * 
         * 
         */
        public List<HTLPRICETYPE> getLISTPRICE() {
            if (listprice == null) {
                listprice = new ArrayList<HTLPRICETYPE>();
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
     *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "listprice",
        "markup"
    })
    public static class BASEPRICE
        implements Serializable
    {

        @XmlElement(name = "LIST_PRICE")
        protected List<HTLPRICETYPE> listprice;
        @XmlElement(name = "MARKUP")
        protected MARKUP markup;

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
         * {@link HTLPRICETYPE }
         * 
         * 
         */
        public List<HTLPRICETYPE> getLISTPRICE() {
            if (listprice == null) {
                listprice = new ArrayList<HTLPRICETYPE>();
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
     *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "listprice",
        "markup"
    })
    public static class TOTALAMOUNTTAXINC
        implements Serializable
    {

        @XmlElement(name = "LIST_PRICE")
        protected List<HTLPRICETYPE> listprice;
        @XmlElement(name = "MARKUP")
        protected MARKUP markup;

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
         * {@link HTLPRICETYPE }
         * 
         * 
         */
        public List<HTLPRICETYPE> getLISTPRICE() {
            if (listprice == null) {
                listprice = new ArrayList<HTLPRICETYPE>();
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

    }

}
