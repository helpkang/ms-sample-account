
package com.koreanair.external.eretail.vo.flexpricer.flexpricercommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}PANEL_TYPE"/&gt;
 *         &lt;element ref="{}PRICING_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paneltype",
    "pricingtype"
})
@XmlRootElement(name = "LIST_PRICING_TYPE")
public class LISTPRICINGTYPE
    implements Serializable
{

    @XmlElement(name = "PANEL_TYPE", required = true)
    protected String paneltype;
    @XmlElement(name = "PRICING_TYPE", required = true)
    protected String pricingtype;

    /**
     * Gets the value of the paneltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANELTYPE() {
        return paneltype;
    }

    /**
     * Sets the value of the paneltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANELTYPE(String value) {
        this.paneltype = value;
    }

    /**
     * Gets the value of the pricingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICINGTYPE() {
        return pricingtype;
    }

    /**
     * Sets the value of the pricingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICINGTYPE(String value) {
        this.pricingtype = value;
    }

}
