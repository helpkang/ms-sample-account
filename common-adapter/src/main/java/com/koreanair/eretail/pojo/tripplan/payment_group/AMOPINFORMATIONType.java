
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMOP_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOP_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VALIDATION_STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NEW"/&gt;
 *               &lt;enumeration value="PENDING"/&gt;
 *               &lt;enumeration value="APPROVED"/&gt;
 *               &lt;enumeration value="DENIED"/&gt;
 *               &lt;enumeration value="ERROR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ASYNC_REFERENCE" type="{}ASYNC_REFERENCE_Type" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOP_INFORMATION_Type", propOrder = {

})
public class AMOPINFORMATIONType implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "VALIDATION_STATUS")
    protected String validationstatus;
    @XmlElement(name = "ASYNC_REFERENCE")
    protected ASYNCREFERENCEType asyncreference;

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
     * Gets the value of the validationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATIONSTATUS() {
        return validationstatus;
    }

    /**
     * Sets the value of the validationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATIONSTATUS(String value) {
        this.validationstatus = value;
    }

    /**
     * Gets the value of the asyncreference property.
     * 
     * @return
     *     possible object is
     *     {@link ASYNCREFERENCEType }
     *     
     */
    public ASYNCREFERENCEType getASYNCREFERENCE() {
        return asyncreference;
    }

    /**
     * Sets the value of the asyncreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASYNCREFERENCEType }
     *     
     */
    public void setASYNCREFERENCE(ASYNCREFERENCEType value) {
        this.asyncreference = value;
    }

}
