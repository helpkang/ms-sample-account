
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillbackDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillbackDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDENTIFIERS" type="{}IdentifiersType" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAYMENT_INSTRUCTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REQUESTED_FAX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="FAX"/&gt;
 *               &lt;enumeration value="CVV_FAX"/&gt;
 *               &lt;enumeration value="BOTH"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "BillbackDataType", propOrder = {
    "identifiers",
    "accountnumber",
    "paymentinstructions",
    "faxnumber",
    "requestedfax"
})
public class BillbackDataType
    implements Serializable
{

    @XmlElement(name = "IDENTIFIERS")
    protected IdentifiersType identifiers;
    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected String accountnumber;
    @XmlElement(name = "PAYMENT_INSTRUCTIONS")
    protected String paymentinstructions;
    @XmlElement(name = "FAX_NUMBER")
    protected String faxnumber;
    @XmlElement(name = "REQUESTED_FAX")
    protected String requestedfax;

    /**
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiersType }
     *     
     */
    public IdentifiersType getIDENTIFIERS() {
        return identifiers;
    }

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiersType }
     *     
     */
    public void setIDENTIFIERS(IdentifiersType value) {
        this.identifiers = value;
    }

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNUMBER(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the paymentinstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTINSTRUCTIONS() {
        return paymentinstructions;
    }

    /**
     * Sets the value of the paymentinstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTINSTRUCTIONS(String value) {
        this.paymentinstructions = value;
    }

    /**
     * Gets the value of the faxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNUMBER() {
        return faxnumber;
    }

    /**
     * Sets the value of the faxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNUMBER(String value) {
        this.faxnumber = value;
    }

    /**
     * Gets the value of the requestedfax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTEDFAX() {
        return requestedfax;
    }

    /**
     * Sets the value of the requestedfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTEDFAX(String value) {
        this.requestedfax = value;
    }

}
