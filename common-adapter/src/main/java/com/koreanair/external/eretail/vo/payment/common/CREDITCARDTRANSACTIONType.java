
package com.koreanair.external.eretail.vo.payment.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREDIT_CARD_TRANSACTIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_CARD_TRANSACTIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CC_TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CC_AMOUNT" type="{}AMOUNTType3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDIT_CARD_TRANSACTIONType", propOrder = {
    "ccnumber",
    "cctype",
    "ccsubtype",
    "ccamount"
})
public class CREDITCARDTRANSACTIONType
    implements Serializable
{

    @XmlElement(name = "CC_NUMBER", required = true)
    protected Object ccnumber;
    @XmlElement(name = "CC_TYPE", required = true)
    protected String cctype;
    @XmlElement(name = "CC_SUBTYPE")
    protected Object ccsubtype;
    @XmlElement(name = "CC_AMOUNT")
    protected AMOUNTType3 ccamount;

    /**
     * Gets the value of the ccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCCNUMBER() {
        return ccnumber;
    }

    /**
     * Sets the value of the ccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCCNUMBER(Object value) {
        this.ccnumber = value;
    }

    /**
     * Gets the value of the cctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCTYPE() {
        return cctype;
    }

    /**
     * Sets the value of the cctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCTYPE(String value) {
        this.cctype = value;
    }

    /**
     * Gets the value of the ccsubtype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCCSUBTYPE() {
        return ccsubtype;
    }

    /**
     * Sets the value of the ccsubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCCSUBTYPE(Object value) {
        this.ccsubtype = value;
    }

    /**
     * Gets the value of the ccamount property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTType3 }
     *     
     */
    public AMOUNTType3 getCCAMOUNT() {
        return ccamount;
    }

    /**
     * Sets the value of the ccamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTType3 }
     *     
     */
    public void setCCAMOUNT(AMOUNTType3 value) {
        this.ccamount = value;
    }

}
