
package com.koreanair.eretail.pojo.common.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * generic eligibility permission
 * 
 * <p>Java class for GENERIC_ELIBILITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENERIC_ELIBILITY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENERIC_ELIBILITY", propOrder = {
    "iseligible",
    "noneligibilityreason"
})
public class GENERICELIBILITY
    implements Serializable
{

    @XmlElement(name = "IS_ELIGIBLE")
    protected Boolean iseligible;
    @XmlElement(name = "NON_ELIGIBILITY_REASON")
    protected String noneligibilityreason;

    /**
     * Gets the value of the iseligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISELIGIBLE() {
        return iseligible;
    }

    /**
     * Sets the value of the iseligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISELIGIBLE(Boolean value) {
        this.iseligible = value;
    }

    /**
     * Gets the value of the noneligibilityreason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNONELIGIBILITYREASON() {
        return noneligibilityreason;
    }

    /**
     * Sets the value of the noneligibilityreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNONELIGIBILITYREASON(String value) {
        this.noneligibilityreason = value;
    }

}
