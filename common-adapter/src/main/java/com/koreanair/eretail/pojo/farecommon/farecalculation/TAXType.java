
package com.koreanair.eretail.pojo.farecommon.farecalculation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;
import com.koreanair.eretail.pojo.farecommon.farecommon.TYPEDAMOUNTType;


/**
 * <p>Java class for TAX_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="INTERNAL_TYPE" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY_AMOUNT" type="{}TYPED_AMOUNT_Type" minOccurs="0"/&gt;
 *         &lt;element name="EXEMPTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAX_Type", propOrder = {
    "tax",
    "internaltype",
    "currencyamount",
    "exempted"
})
public class TAXType
    implements Serializable
{

    @XmlElement(name = "TAX")
    protected CodeDescriptorType tax;
    @XmlElement(name = "INTERNAL_TYPE")
    protected CodeDescriptorType internaltype;
    @XmlElement(name = "CURRENCY_AMOUNT")
    protected TYPEDAMOUNTType currencyamount;
    @XmlElement(name = "EXEMPTED")
    protected Boolean exempted;

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getTAX() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setTAX(CodeDescriptorType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the internaltype property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getINTERNALTYPE() {
        return internaltype;
    }

    /**
     * Sets the value of the internaltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setINTERNALTYPE(CodeDescriptorType value) {
        this.internaltype = value;
    }

    /**
     * Gets the value of the currencyamount property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getCURRENCYAMOUNT() {
        return currencyamount;
    }

    /**
     * Sets the value of the currencyamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setCURRENCYAMOUNT(TYPEDAMOUNTType value) {
        this.currencyamount = value;
    }

    /**
     * Gets the value of the exempted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEXEMPTED() {
        return exempted;
    }

    /**
     * Sets the value of the exempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXEMPTED(Boolean value) {
        this.exempted = value;
    }

}
