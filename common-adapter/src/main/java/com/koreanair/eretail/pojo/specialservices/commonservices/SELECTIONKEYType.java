
package com.koreanair.eretail.pojo.specialservices.commonservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eligbility Key built from ITI and PAX association mode.
 * 
 * <p>Java class for SELECTION_KEY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SELECTION_KEY_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ELIGIBILITY_KEY" type="{}ELIGIBILITY_KEY_type"/&gt;
 *         &lt;element name="SELECTION_INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SELECTION_KEY_type", propOrder = {

})
public class SELECTIONKEYType
    implements Serializable
{

    @XmlElement(name = "ELIGIBILITY_KEY", required = true)
    protected ELIGIBILITYKEYType eligibilitykey;
    @XmlElement(name = "SELECTION_INDEX", required = true)
    protected String selectionindex;

    /**
     * Gets the value of the eligibilitykey property.
     * 
     * @return
     *     possible object is
     *     {@link ELIGIBILITYKEYType }
     *     
     */
    public ELIGIBILITYKEYType getELIGIBILITYKEY() {
        return eligibilitykey;
    }

    /**
     * Sets the value of the eligibilitykey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELIGIBILITYKEYType }
     *     
     */
    public void setELIGIBILITYKEY(ELIGIBILITYKEYType value) {
        this.eligibilitykey = value;
    }

    /**
     * Gets the value of the selectionindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELECTIONINDEX() {
        return selectionindex;
    }

    /**
     * Sets the value of the selectionindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELECTIONINDEX(String value) {
        this.selectionindex = value;
    }

}
