
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;


/**
 * <p>Java class for ServiceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AIRLINE_NAME" type="{}CodeDescriptorType"/&gt;
 *         &lt;element name="MONETARY_AMOUNT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CURRENCY" type="{}CodeDescriptorType"/&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "ServiceInfoType", propOrder = {
    "type",
    "subtype",
    "indicator",
    "description",
    "airlinename",
    "monetaryamount"
})
public class ServiceInfoType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "SUB_TYPE")
    protected Object subtype;
    @XmlElement(name = "INDICATOR")
    protected Object indicator;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected Object description;
    @XmlElement(name = "AIRLINE_NAME", required = true)
    protected CodeDescriptorType airlinename;
    @XmlElement(name = "MONETARY_AMOUNT")
    protected ServiceInfoType.MONETARYAMOUNT monetaryamount;

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

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSUBTYPE(Object value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINDICATOR() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINDICATOR(Object value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDESCRIPTION(Object value) {
        this.description = value;
    }

    /**
     * Gets the value of the airlinename property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getAIRLINENAME() {
        return airlinename;
    }

    /**
     * Sets the value of the airlinename property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setAIRLINENAME(CodeDescriptorType value) {
        this.airlinename = value;
    }

    /**
     * Gets the value of the monetaryamount property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoType.MONETARYAMOUNT }
     *     
     */
    public ServiceInfoType.MONETARYAMOUNT getMONETARYAMOUNT() {
        return monetaryamount;
    }

    /**
     * Sets the value of the monetaryamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoType.MONETARYAMOUNT }
     *     
     */
    public void setMONETARYAMOUNT(ServiceInfoType.MONETARYAMOUNT value) {
        this.monetaryamount = value;
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
     *         &lt;element name="CURRENCY" type="{}CodeDescriptorType"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "currency",
        "value"
    })
    public static class MONETARYAMOUNT
        implements Serializable
    {

        @XmlElement(name = "CURRENCY", required = true)
        protected CodeDescriptorType currency;
        @XmlElement(name = "VALUE", required = true)
        protected Object value;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CodeDescriptorType }
         *     
         */
        public CodeDescriptorType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeDescriptorType }
         *     
         */
        public void setCURRENCY(CodeDescriptorType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVALUE(Object value) {
            this.value = value;
        }

    }

}
