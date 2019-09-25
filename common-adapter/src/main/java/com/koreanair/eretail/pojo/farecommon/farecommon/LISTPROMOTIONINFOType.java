
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_PROMOTION_INFO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PROMOTION_INFO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROMOTION" type="{}INFORMATION_CONTENT_Type"/&gt;
 *         &lt;element name="PROMOTION_FARES" type="{}PROMOTION_FARES_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PROMOTION_INFO_Type", propOrder = {
    "promotion",
    "promotionfares"
})
public class LISTPROMOTIONINFOType
    implements Serializable
{

    @XmlElement(name = "PROMOTION", required = true)
    protected INFORMATIONCONTENTType promotion;
    @XmlElement(name = "PROMOTION_FARES")
    protected PROMOTIONFARESType promotionfares;

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link INFORMATIONCONTENTType }
     *     
     */
    public INFORMATIONCONTENTType getPROMOTION() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link INFORMATIONCONTENTType }
     *     
     */
    public void setPROMOTION(INFORMATIONCONTENTType value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the promotionfares property.
     * 
     * @return
     *     possible object is
     *     {@link PROMOTIONFARESType }
     *     
     */
    public PROMOTIONFARESType getPROMOTIONFARES() {
        return promotionfares;
    }

    /**
     * Sets the value of the promotionfares property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROMOTIONFARESType }
     *     
     */
    public void setPROMOTIONFARES(PROMOTIONFARESType value) {
        this.promotionfares = value;
    }

}
