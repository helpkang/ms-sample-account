
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LENGTH_OF_STAY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LENGTH_OF_STAY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUMBER_OF_DAYS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{}PROVIDER_DESCRIPTION" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LENGTH_OF_STAY", propOrder = {
    "numberofdays",
    "providerdescription"
})
public class LENGTHOFSTAY
    implements Serializable
{

    @XmlElement(name = "NUMBER_OF_DAYS", required = true)
    protected BigInteger numberofdays;
    @XmlElement(name = "PROVIDER_DESCRIPTION")
    protected String providerdescription;

    /**
     * Gets the value of the numberofdays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFDAYS() {
        return numberofdays;
    }

    /**
     * Sets the value of the numberofdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFDAYS(BigInteger value) {
        this.numberofdays = value;
    }

    /**
     * Gets the value of the providerdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERDESCRIPTION() {
        return providerdescription;
    }

    /**
     * Sets the value of the providerdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERDESCRIPTION(String value) {
        this.providerdescription = value;
    }

}
