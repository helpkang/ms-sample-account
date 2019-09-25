
package com.koreanair.eretail.pojo.specialservices.commonservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service configuration information. Retrieve from DB, service catalogue...
 * 
 * <p>Java class for ASSOCIATION_MODE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASSOCIATION_MODE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ITINERARY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PASSENGER_ASSOCIATED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASSOCIATION_MODE_TYPE", propOrder = {

})
public class ASSOCIATIONMODETYPE
    implements Serializable
{

    @XmlElement(name = "ITINERARY", required = true)
    protected ASSOCIATIONMODETYPE.ITINERARY itinerary;
    @XmlElement(name = "PASSENGER_ASSOCIATED")
    protected boolean passengerassociated;

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link ASSOCIATIONMODETYPE.ITINERARY }
     *     
     */
    public ASSOCIATIONMODETYPE.ITINERARY getITINERARY() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSOCIATIONMODETYPE.ITINERARY }
     *     
     */
    public void setITINERARY(ASSOCIATIONMODETYPE.ITINERARY value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the passengerassociated property.
     * 
     */
    public boolean isPASSENGERASSOCIATED() {
        return passengerassociated;
    }

    /**
     * Sets the value of the passengerassociated property.
     * 
     */
    public void setPASSENGERASSOCIATED(boolean value) {
        this.passengerassociated = value;
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
     *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "product",
        "type"
    })
    public static class ITINERARY
        implements Serializable
    {

        @XmlElement(name = "PRODUCT", required = true)
        protected String product;
        @XmlElement(name = "TYPE")
        protected String type;

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCT() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCT(String value) {
            this.product = value;
        }

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

    }

}
