
package com.koreanair.external.eretail.vo.profile.apisinformationoutput;

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
 *       &lt;all&gt;
 *         &lt;element name="APIS_AIRLINE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="FA"/&gt;
 *               &lt;enumeration value="PA"/&gt;
 *               &lt;enumeration value="AA"/&gt;
 *               &lt;enumeration value="NO_APIS"/&gt;
 *               &lt;enumeration value="CUSTOM"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APIS_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "LIST_APIS_COUNTRIES")
public class LISTAPISCOUNTRIES
    implements Serializable
{

    @XmlElement(name = "APIS_AIRLINE", required = true)
    protected String apisairline;
    @XmlElement(name = "APIS_COUNTRY", required = true)
    protected String apiscountry;

    /**
     * Gets the value of the apisairline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPISAIRLINE() {
        return apisairline;
    }

    /**
     * Sets the value of the apisairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPISAIRLINE(String value) {
        this.apisairline = value;
    }

    /**
     * Gets the value of the apiscountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPISCOUNTRY() {
        return apiscountry;
    }

    /**
     * Sets the value of the apiscountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPISCOUNTRY(String value) {
        this.apiscountry = value;
    }

}
