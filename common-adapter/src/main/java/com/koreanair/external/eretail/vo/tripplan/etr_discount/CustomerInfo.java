
package com.koreanair.external.eretail.vo.tripplan.etr_discount;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Customer information
 * 
 * <p>Java class for customerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PASSENGER_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CARD_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "customerInfo", propOrder = {
    "passengertypecode",
    "dateofbirth",
    "cardinfo"
})
public class CustomerInfo
    implements Serializable
{

    @XmlElement(name = "PASSENGER_TYPE_CODE")
    protected Object passengertypecode;
    @XmlElement(name = "DATE_OF_BIRTH")
    protected Object dateofbirth;
    @XmlElement(name = "CARD_INFO")
    protected CustomerInfo.CARDINFO cardinfo;

    /**
     * Gets the value of the passengertypecode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPASSENGERTYPECODE() {
        return passengertypecode;
    }

    /**
     * Sets the value of the passengertypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPASSENGERTYPECODE(Object value) {
        this.passengertypecode = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDATEOFBIRTH(Object value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the cardinfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo.CARDINFO }
     *     
     */
    public CustomerInfo.CARDINFO getCARDINFO() {
        return cardinfo;
    }

    /**
     * Sets the value of the cardinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo.CARDINFO }
     *     
     */
    public void setCARDINFO(CustomerInfo.CARDINFO value) {
        this.cardinfo = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "type",
        "cardnumber"
    })
    public static class CARDINFO
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected Object type;
        @XmlElement(name = "CARD_NUMBER")
        protected Object cardnumber;

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

        /**
         * Gets the value of the cardnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCARDNUMBER() {
            return cardnumber;
        }

        /**
         * Sets the value of the cardnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCARDNUMBER(Object value) {
            this.cardnumber = value;
        }

    }

}
