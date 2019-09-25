
package com.koreanair.external.eretail.vo.air.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * TODO : write describe
 * 
 * <p>Java class for LIST_ITINERARY_MILES_COST_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ITINERARY_MILES_COST_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ITINERARY_CABIN" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ITINERARY_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ITINERARY_MILES_COST_PER_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND_MILES_COST" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BOUND_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="BOUND_MILES_COST_PER_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "LIST_ITINERARY_MILES_COST_TYPE", propOrder = {
    "itinerarycabin",
    "itinerarymilescost",
    "itinerarymilescostperadult",
    "listboundmilescost"
})
public class LISTITINERARYMILESCOSTTYPE
    implements Serializable
{

    @XmlElement(name = "ITINERARY_CABIN")
    protected String itinerarycabin;
    @XmlElement(name = "ITINERARY_MILES_COST", required = true)
    protected BigInteger itinerarymilescost;
    @XmlElement(name = "ITINERARY_MILES_COST_PER_ADULT")
    protected BigInteger itinerarymilescostperadult;
    @XmlElement(name = "LIST_BOUND_MILES_COST")
    protected List<LISTITINERARYMILESCOSTTYPE.LISTBOUNDMILESCOST> listboundmilescost;

    /**
     * Gets the value of the itinerarycabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITINERARYCABIN() {
        return itinerarycabin;
    }

    /**
     * Sets the value of the itinerarycabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITINERARYCABIN(String value) {
        this.itinerarycabin = value;
    }

    /**
     * Gets the value of the itinerarymilescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITINERARYMILESCOST() {
        return itinerarymilescost;
    }

    /**
     * Sets the value of the itinerarymilescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITINERARYMILESCOST(BigInteger value) {
        this.itinerarymilescost = value;
    }

    /**
     * Gets the value of the itinerarymilescostperadult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITINERARYMILESCOSTPERADULT() {
        return itinerarymilescostperadult;
    }

    /**
     * Sets the value of the itinerarymilescostperadult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITINERARYMILESCOSTPERADULT(BigInteger value) {
        this.itinerarymilescostperadult = value;
    }

    /**
     * Gets the value of the listboundmilescost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listboundmilescost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOUNDMILESCOST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARYMILESCOSTTYPE.LISTBOUNDMILESCOST }
     * 
     * 
     */
    public List<LISTITINERARYMILESCOSTTYPE.LISTBOUNDMILESCOST> getLISTBOUNDMILESCOST() {
        if (listboundmilescost == null) {
            listboundmilescost = new ArrayList<LISTITINERARYMILESCOSTTYPE.LISTBOUNDMILESCOST>();
        }
        return this.listboundmilescost;
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
     *         &lt;element name="BOUND_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="BOUND_MILES_COST_PER_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "boundmilescost",
        "boundmilescostperadult"
    })
    public static class LISTBOUNDMILESCOST
        implements Serializable
    {

        @XmlElement(name = "BOUND_MILES_COST", required = true)
        protected BigInteger boundmilescost;
        @XmlElement(name = "BOUND_MILES_COST_PER_ADULT")
        protected BigInteger boundmilescostperadult;

        /**
         * Gets the value of the boundmilescost property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBOUNDMILESCOST() {
            return boundmilescost;
        }

        /**
         * Sets the value of the boundmilescost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBOUNDMILESCOST(BigInteger value) {
            this.boundmilescost = value;
        }

        /**
         * Gets the value of the boundmilescostperadult property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBOUNDMILESCOSTPERADULT() {
            return boundmilescostperadult;
        }

        /**
         * Sets the value of the boundmilescostperadult property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBOUNDMILESCOSTPERADULT(BigInteger value) {
            this.boundmilescostperadult = value;
        }

    }

}
