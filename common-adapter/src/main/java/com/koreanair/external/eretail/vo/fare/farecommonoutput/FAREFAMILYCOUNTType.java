
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FARE_FAMILY_COUNT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_FAMILY_COUNT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_FAMILY" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_FAMILY_COUNT_Type", propOrder = {
    "farefamily",
    "count"
})
public class FAREFAMILYCOUNTType
    implements Serializable
{

    @XmlElement(name = "FARE_FAMILY", required = true)
    protected String farefamily;
    @XmlElement(name = "COUNT")
    protected BigInteger count;

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREFAMILY(String value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOUNT() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOUNT(BigInteger value) {
        this.count = value;
    }

}
