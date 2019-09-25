
package com.koreanair.eretail.pojo.tripplan.accountable_document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_REDEMPTION_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_REDEMPTION_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CERTIFICATES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="MILES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_REDEMPTION_INFORMATIONType", propOrder = {
    "accountnumber",
    "certificates",
    "miles"
})
public class LISTREDEMPTIONINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected Object accountnumber;
    @XmlElement(name = "CERTIFICATES")
    protected Object certificates;
    @XmlElement(name = "MILES")
    protected Object miles;

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACCOUNTNUMBER(Object value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCERTIFICATES() {
        return certificates;
    }

    /**
     * Sets the value of the certificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCERTIFICATES(Object value) {
        this.certificates = value;
    }

    /**
     * Gets the value of the miles property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMILES() {
        return miles;
    }

    /**
     * Sets the value of the miles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMILES(Object value) {
        this.miles = value;
    }

}
