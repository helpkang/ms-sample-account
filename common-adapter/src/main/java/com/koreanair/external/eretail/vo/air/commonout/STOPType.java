
package com.koreanair.external.eretail.vo.air.commonout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STOP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STOP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCATION" type="{}LOCATION_Type"/&gt;
 *         &lt;element name="ARRIVAL_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="DEPARTURE_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "STOP_Type", propOrder = {
    "location",
    "arrivaldate",
    "departuredate",
    "equipment"
})
public class STOPType
    implements Serializable
{

    @XmlElement(name = "LOCATION", required = true)
    protected LOCATIONType location;
    @XmlElement(name = "ARRIVAL_DATE")
    protected String arrivaldate;
    @XmlElement(name = "DEPARTURE_DATE")
    protected String departuredate;
    @XmlElement(name = "EQUIPMENT")
    protected STOPType.EQUIPMENT equipment;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATIONType }
     *     
     */
    public LOCATIONType getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATIONType }
     *     
     */
    public void setLOCATION(LOCATIONType value) {
        this.location = value;
    }

    /**
     * Gets the value of the arrivaldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARRIVALDATE() {
        return arrivaldate;
    }

    /**
     * Sets the value of the arrivaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARRIVALDATE(String value) {
        this.arrivaldate = value;
    }

    /**
     * Gets the value of the departuredate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPARTUREDATE() {
        return departuredate;
    }

    /**
     * Sets the value of the departuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPARTUREDATE(String value) {
        this.departuredate = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link STOPType.EQUIPMENT }
     *     
     */
    public STOPType.EQUIPMENT getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOPType.EQUIPMENT }
     *     
     */
    public void setEQUIPMENT(STOPType.EQUIPMENT value) {
        this.equipment = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "name"
    })
    public static class EQUIPMENT
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }

}
