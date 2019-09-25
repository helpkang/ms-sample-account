
package com.koreanair.eretail.pojo.pnr.rebookpnratcoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRICE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}BOOKED_CURRENCY_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRICE_Type", propOrder = {
    "amount",
    "amountwithouttax",
    "tax",
    "currency"
})
public class PRICEType
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX")
    protected String amountwithouttax;
    @XmlElement(name = "TAX")
    protected String tax;
    @XmlElement(name = "CURRENCY", required = true)
    protected BOOKEDCURRENCYType currency;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountwithouttax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNTWITHOUTTAX() {
        return amountwithouttax;
    }

    /**
     * Sets the value of the amountwithouttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNTWITHOUTTAX(String value) {
        this.amountwithouttax = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAX() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAX(String value) {
        this.tax = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDCURRENCYType }
     *     
     */
    public BOOKEDCURRENCYType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDCURRENCYType }
     *     
     */
    public void setCURRENCY(BOOKEDCURRENCYType value) {
        this.currency = value;
    }

}
