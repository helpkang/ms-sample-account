
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;


/**
 * <p>Java class for trBoundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trBoundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NAME" type="{}trAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="CODE" type="{}trAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADDRESS" type="{}trAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trBoundType", propOrder = {
    "datetime",
    "location",
    "address"
})
@XmlSeeAlso({
    TrOutBoundType.class
})
public class TrBoundType
    implements Serializable
{

    @XmlElement(name = "DATE_TIME")
    protected OutputDateType datetime;
    @XmlElement(name = "LOCATION")
    protected TrBoundType.LOCATION location;
    @XmlElement(name = "ADDRESS")
    protected TrAddressType address;

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getDATETIME() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setDATETIME(OutputDateType value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link TrBoundType.LOCATION }
     *     
     */
    public TrBoundType.LOCATION getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrBoundType.LOCATION }
     *     
     */
    public void setLOCATION(TrBoundType.LOCATION value) {
        this.location = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link TrAddressType }
     *     
     */
    public TrAddressType getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrAddressType }
     *     
     */
    public void setADDRESS(TrAddressType value) {
        this.address = value;
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
     *         &lt;element name="NAME" type="{}trAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="CODE" type="{}trAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "name",
        "code",
        "type"
    })
    public static class LOCATION
        implements Serializable
    {

        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "TYPE")
        protected String type;

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
