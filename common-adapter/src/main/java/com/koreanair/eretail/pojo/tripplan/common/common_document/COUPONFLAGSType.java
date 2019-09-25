
package com.koreanair.eretail.pojo.tripplan.common.common_document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COUPON_FLAGSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COUPON_FLAGSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_REFUNDABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_INTERLINEABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_EXCHANGEABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_CONSUMED_AT_ISSUANCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COUPON_FLAGSType", propOrder = {
    "isrefundable",
    "isinterlineable",
    "isexchangeable",
    "isconsumedatissuance"
})
public class COUPONFLAGSType
    implements Serializable
{

    @XmlElement(name = "IS_REFUNDABLE")
    protected Object isrefundable;
    @XmlElement(name = "IS_INTERLINEABLE")
    protected Object isinterlineable;
    @XmlElement(name = "IS_EXCHANGEABLE")
    protected Object isexchangeable;
    @XmlElement(name = "IS_CONSUMED_AT_ISSUANCE")
    protected Object isconsumedatissuance;

    /**
     * Gets the value of the isrefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISREFUNDABLE() {
        return isrefundable;
    }

    /**
     * Sets the value of the isrefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISREFUNDABLE(Object value) {
        this.isrefundable = value;
    }

    /**
     * Gets the value of the isinterlineable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISINTERLINEABLE() {
        return isinterlineable;
    }

    /**
     * Sets the value of the isinterlineable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISINTERLINEABLE(Object value) {
        this.isinterlineable = value;
    }

    /**
     * Gets the value of the isexchangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISEXCHANGEABLE() {
        return isexchangeable;
    }

    /**
     * Sets the value of the isexchangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISEXCHANGEABLE(Object value) {
        this.isexchangeable = value;
    }

    /**
     * Gets the value of the isconsumedatissuance property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISCONSUMEDATISSUANCE() {
        return isconsumedatissuance;
    }

    /**
     * Sets the value of the isconsumedatissuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISCONSUMEDATISSUANCE(Object value) {
        this.isconsumedatissuance = value;
    }

}
