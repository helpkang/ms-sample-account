
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;choice&gt;
 *           &lt;element name="ITINERARY_CABIN" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="LIST_ITINERARY_CABIN" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ITINERARY_FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ITINERARY_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND_MILES_COST" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BOUND_FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="BOUND_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "itinerarycabin",
    "listitinerarycabin",
    "itineraryfarefamily",
    "itinerarymilescost",
    "listboundmilescost"
})
@XmlRootElement(name = "LIST_ITINERARY_MILES_COST")
public class LISTITINERARYMILESCOST
    implements Serializable
{

    @XmlElement(name = "ITINERARY_CABIN")
    protected LISTITINERARYMILESCOST.ITINERARYCABIN itinerarycabin;
    @XmlElement(name = "LIST_ITINERARY_CABIN")
    protected List<Object> listitinerarycabin;
    @XmlElement(name = "ITINERARY_FARE_FAMILY")
    protected String itineraryfarefamily;
    @XmlElement(name = "ITINERARY_MILES_COST")
    protected BigInteger itinerarymilescost;
    @XmlElement(name = "LIST_BOUND_MILES_COST")
    protected List<LISTITINERARYMILESCOST.LISTBOUNDMILESCOST> listboundmilescost;

    /**
     * Gets the value of the itinerarycabin property.
     * 
     * @return
     *     possible object is
     *     {@link LISTITINERARYMILESCOST.ITINERARYCABIN }
     *     
     */
    public LISTITINERARYMILESCOST.ITINERARYCABIN getITINERARYCABIN() {
        return itinerarycabin;
    }

    /**
     * Sets the value of the itinerarycabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTITINERARYMILESCOST.ITINERARYCABIN }
     *     
     */
    public void setITINERARYCABIN(LISTITINERARYMILESCOST.ITINERARYCABIN value) {
        this.itinerarycabin = value;
    }

    /**
     * Gets the value of the listitinerarycabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerarycabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARYCABIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLISTITINERARYCABIN() {
        if (listitinerarycabin == null) {
            listitinerarycabin = new ArrayList<Object>();
        }
        return this.listitinerarycabin;
    }

    /**
     * Gets the value of the itineraryfarefamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITINERARYFAREFAMILY() {
        return itineraryfarefamily;
    }

    /**
     * Sets the value of the itineraryfarefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITINERARYFAREFAMILY(String value) {
        this.itineraryfarefamily = value;
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
     * {@link LISTITINERARYMILESCOST.LISTBOUNDMILESCOST }
     * 
     * 
     */
    public List<LISTITINERARYMILESCOST.LISTBOUNDMILESCOST> getLISTBOUNDMILESCOST() {
        if (listboundmilescost == null) {
            listboundmilescost = new ArrayList<LISTITINERARYMILESCOST.LISTBOUNDMILESCOST>();
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ITINERARYCABIN
        implements Serializable
    {


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
     *         &lt;element name="BOUND_FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="BOUND_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "boundfarefamily",
        "boundid",
        "boundmilescost"
    })
    public static class LISTBOUNDMILESCOST
        implements Serializable
    {

        @XmlElement(name = "BOUND_FARE_FAMILY")
        protected String boundfarefamily;
        @XmlElement(name = "BOUND_ID")
        protected Integer boundid;
        @XmlElement(name = "BOUND_MILES_COST", required = true)
        protected BigInteger boundmilescost;

        /**
         * Gets the value of the boundfarefamily property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOUNDFAREFAMILY() {
            return boundfarefamily;
        }

        /**
         * Sets the value of the boundfarefamily property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOUNDFAREFAMILY(String value) {
            this.boundfarefamily = value;
        }

        /**
         * Gets the value of the boundid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBOUNDID() {
            return boundid;
        }

        /**
         * Sets the value of the boundid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBOUNDID(Integer value) {
            this.boundid = value;
        }

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

    }

}
