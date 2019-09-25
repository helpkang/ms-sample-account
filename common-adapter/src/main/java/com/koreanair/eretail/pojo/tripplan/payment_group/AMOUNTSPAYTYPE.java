
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMOUNTS_PAY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOUNTS_PAY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOUNTS_PAY_TYPE", propOrder = {
    "amount",
    "amountwithouttax",
    "tax"
})
public class AMOUNTSPAYTYPE
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected Object amount;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX")
    protected Object amountwithouttax;
    @XmlElement(name = "TAX")
    protected Object tax;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAMOUNT(Object value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountwithouttax property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAMOUNTWITHOUTTAX() {
        return amountwithouttax;
    }

    /**
     * Sets the value of the amountwithouttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAMOUNTWITHOUTTAX(Object value) {
        this.amountwithouttax = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTAX() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTAX(Object value) {
        this.tax = value;
    }

}
