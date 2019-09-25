
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
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
 *         &lt;element name="DISCOUNT_CARD" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COMPANY" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SATURNE_FARE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "discountcard",
    "saturnefare"
})
@XmlRootElement(name = "SATURNE_INFO")
public class SATURNEINFO
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_CARD")
    protected SATURNEINFO.DISCOUNTCARD discountcard;
    @XmlElement(name = "SATURNE_FARE")
    protected boolean saturnefare;

    /**
     * Gets the value of the discountcard property.
     * 
     * @return
     *     possible object is
     *     {@link SATURNEINFO.DISCOUNTCARD }
     *     
     */
    public SATURNEINFO.DISCOUNTCARD getDISCOUNTCARD() {
        return discountcard;
    }

    /**
     * Sets the value of the discountcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SATURNEINFO.DISCOUNTCARD }
     *     
     */
    public void setDISCOUNTCARD(SATURNEINFO.DISCOUNTCARD value) {
        this.discountcard = value;
    }

    /**
     * Gets the value of the saturnefare property.
     * 
     */
    public boolean isSATURNEFARE() {
        return saturnefare;
    }

    /**
     * Sets the value of the saturnefare property.
     * 
     */
    public void setSATURNEFARE(boolean value) {
        this.saturnefare = value;
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
     *         &lt;element name="COMPANY" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
        "company",
        "number"
    })
    public static class DISCOUNTCARD
        implements Serializable
    {

        @XmlElement(name = "COMPANY", required = true)
        protected String company;
        @XmlElement(name = "NUMBER", required = true)
        protected String number;

        /**
         * Gets the value of the company property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPANY() {
            return company;
        }

        /**
         * Sets the value of the company property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPANY(String value) {
            this.company = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBER(String value) {
            this.number = value;
        }

    }

}
