
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROVIDER_CODE_DESCRIPTOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROVIDER_CODE_DESCRIPTOR_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CODE_DESCRIPTOR_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROVIDER_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROVIDER_CODE_DESCRIPTOR_Type", propOrder = {
    "providercode"
})
public class PROVIDERCODEDESCRIPTORType
    extends CODEDESCRIPTORType
    implements Serializable
{

    @XmlElement(name = "PROVIDER_CODE")
    protected String providercode;

    /**
     * Gets the value of the providercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERCODE() {
        return providercode;
    }

    /**
     * Sets the value of the providercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERCODE(String value) {
        this.providercode = value;
    }

}
