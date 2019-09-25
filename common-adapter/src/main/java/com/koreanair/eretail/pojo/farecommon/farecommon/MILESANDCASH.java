
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}CONVERTED_CASH_MILES"/&gt;
 *         &lt;element ref="{}NON_CONVERTED_AMOUNTS" minOccurs="0"/&gt;
 *         &lt;element ref="{}CONVERTED_AMOUNTS" minOccurs="0"/&gt;
 *         &lt;element name="RESULTING_MILES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TOTAL_TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
    "convertedcashmiles",
    "nonconvertedamounts",
    "convertedamounts",
    "resultingmiles"
})
@XmlRootElement(name = "MILES_AND_CASH")
public class MILESANDCASH
    implements Serializable
{

    @XmlElement(name = "CONVERTED_CASH_MILES", required = true)
    protected BigInteger convertedcashmiles;
    @XmlElement(name = "NON_CONVERTED_AMOUNTS")
    protected NONCONVERTEDAMOUNTS nonconvertedamounts;
    @XmlElement(name = "CONVERTED_AMOUNTS")
    protected CONVERTEDAMOUNTS convertedamounts;
    @XmlElement(name = "RESULTING_MILES")
    protected MILESANDCASH.RESULTINGMILES resultingmiles;

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
     * Gets the value of the nonconvertedamounts property.
     * 
     * @return
     *     possible object is
     *     {@link NONCONVERTEDAMOUNTS }
     *     
     */
    public NONCONVERTEDAMOUNTS getNONCONVERTEDAMOUNTS() {
        return nonconvertedamounts;
    }

    /**
     * Sets the value of the nonconvertedamounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NONCONVERTEDAMOUNTS }
     *     
     */
    public void setNONCONVERTEDAMOUNTS(NONCONVERTEDAMOUNTS value) {
        this.nonconvertedamounts = value;
    }

    /**
     * Gets the value of the convertedamounts property.
     * 
     * @return
     *     possible object is
     *     {@link CONVERTEDAMOUNTS }
     *     
     */
    public CONVERTEDAMOUNTS getCONVERTEDAMOUNTS() {
        return convertedamounts;
    }

    /**
     * Sets the value of the convertedamounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONVERTEDAMOUNTS }
     *     
     */
    public void setCONVERTEDAMOUNTS(CONVERTEDAMOUNTS value) {
        this.convertedamounts = value;
    }

    /**
     * Gets the value of the resultingmiles property.
     * 
     * @return
     *     possible object is
     *     {@link MILESANDCASH.RESULTINGMILES }
     *     
     */
    public MILESANDCASH.RESULTINGMILES getRESULTINGMILES() {
        return resultingmiles;
    }

    /**
     * Sets the value of the resultingmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILESANDCASH.RESULTINGMILES }
     *     
     */
    public void setRESULTINGMILES(MILESANDCASH.RESULTINGMILES value) {
        this.resultingmiles = value;
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
     *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TOTAL_TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "totalamount",
        "totaltax",
        "amountwithouttax"
    })
    public static class RESULTINGMILES
        implements Serializable
    {

        @XmlElement(name = "TOTAL_AMOUNT", required = true)
        protected BigInteger totalamount;
        @XmlElement(name = "TOTAL_TAX")
        protected BigInteger totaltax;
        @XmlElement(name = "AMOUNT_WITHOUT_TAX")
        protected BigInteger amountwithouttax;

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTOTALAMOUNT(BigInteger value) {
            this.totalamount = value;
        }

        /**
         * Gets the value of the totaltax property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTOTALTAX() {
            return totaltax;
        }

        /**
         * Sets the value of the totaltax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTOTALTAX(BigInteger value) {
            this.totaltax = value;
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
