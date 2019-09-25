
package com.koreanair.eretail.pojo.pnr.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CORPORATE_NUMBER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CORPORATE_NUMBER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CORPORATE_NUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;pattern value="[0-9]{6}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CORPORATE_NUMBER_Type", propOrder = {
    "corporatenumber"
})
public class CORPORATENUMBERType {

    @XmlElement(name = "CORPORATE_NUMBER", required = true)
    protected String corporatenumber;

    /**
     * Gets the value of the corporatenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORPORATENUMBER() {
        return corporatenumber;
    }

    /**
     * Sets the value of the corporatenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORPORATENUMBER(String value) {
        this.corporatenumber = value;
    }

}
