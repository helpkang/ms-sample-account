
package com.koreanair.external.eretail.vo.tripplan.common.common_car;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUESTED_RATE_CATEGORY" type="{}requestedRateCategory" minOccurs="0"/&gt;
 *         &lt;element name="RATE_TYPE_CATEGORY" type="{}rateTypeCategory" minOccurs="0"/&gt;
 *         &lt;element name="RATE_QUALIFIER" type="{}rateQualifier" minOccurs="0"/&gt;
 *         &lt;element name="INDICATORS" type="{}indicators" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateCategory", propOrder = {
    "requestedratecategory",
    "ratetypecategory",
    "ratequalifier",
    "indicators"
})
public class RateCategory
    implements Serializable
{

    @XmlElement(name = "REQUESTED_RATE_CATEGORY")
    @XmlSchemaType(name = "string")
    protected RequestedRateCategory requestedratecategory;
    @XmlElement(name = "RATE_TYPE_CATEGORY")
    protected BigInteger ratetypecategory;
    @XmlElement(name = "RATE_QUALIFIER")
    @XmlSchemaType(name = "string")
    protected RateQualifier ratequalifier;
    @XmlElement(name = "INDICATORS")
    protected Indicators indicators;

    /**
     * Gets the value of the requestedratecategory property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedRateCategory }
     *     
     */
    public RequestedRateCategory getREQUESTEDRATECATEGORY() {
        return requestedratecategory;
    }

    /**
     * Sets the value of the requestedratecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedRateCategory }
     *     
     */
    public void setREQUESTEDRATECATEGORY(RequestedRateCategory value) {
        this.requestedratecategory = value;
    }

    /**
     * Gets the value of the ratetypecategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRATETYPECATEGORY() {
        return ratetypecategory;
    }

    /**
     * Sets the value of the ratetypecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRATETYPECATEGORY(BigInteger value) {
        this.ratetypecategory = value;
    }

    /**
     * Gets the value of the ratequalifier property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifier }
     *     
     */
    public RateQualifier getRATEQUALIFIER() {
        return ratequalifier;
    }

    /**
     * Sets the value of the ratequalifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifier }
     *     
     */
    public void setRATEQUALIFIER(RateQualifier value) {
        this.ratequalifier = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link Indicators }
     *     
     */
    public Indicators getINDICATORS() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indicators }
     *     
     */
    public void setINDICATORS(Indicators value) {
        this.indicators = value;
    }

}
