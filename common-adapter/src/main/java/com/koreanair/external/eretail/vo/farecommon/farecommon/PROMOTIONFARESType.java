
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROMOTION_FARES_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROMOTION_FARES_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CORPORATE" type="{}INFORMATION_CONTENT_Type" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGE" type="{}MESSAGE_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROMOTION_FARES_Type", propOrder = {
    "corporate",
    "message"
})
public class PROMOTIONFARESType
    implements Serializable
{

    @XmlElement(name = "CORPORATE")
    protected INFORMATIONCONTENTType corporate;
    @XmlElement(name = "MESSAGE")
    protected MESSAGEType message;

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link INFORMATIONCONTENTType }
     *     
     */
    public INFORMATIONCONTENTType getCORPORATE() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link INFORMATIONCONTENTType }
     *     
     */
    public void setCORPORATE(INFORMATIONCONTENTType value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MESSAGEType }
     *     
     */
    public MESSAGEType getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MESSAGEType }
     *     
     */
    public void setMESSAGE(MESSAGEType value) {
        this.message = value;
    }

}
