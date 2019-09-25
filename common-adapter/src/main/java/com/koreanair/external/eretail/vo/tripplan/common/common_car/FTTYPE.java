
package com.koreanair.external.eretail.vo.tripplan.common.common_car;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * FT
 * 
 * <p>Java class for FT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FT_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FT_COMPANY" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FT_TYPE", propOrder = {
    "ftcode",
    "ftcompany"
})
public class FTTYPE
    implements Serializable
{

    @XmlElement(name = "FT_CODE", required = true)
    protected String ftcode;
    @XmlElement(name = "FT_COMPANY", required = true)
    protected String ftcompany;

    /**
     * Gets the value of the ftcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTCODE() {
        return ftcode;
    }

    /**
     * Sets the value of the ftcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTCODE(String value) {
        this.ftcode = value;
    }

    /**
     * Gets the value of the ftcompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTCOMPANY() {
        return ftcompany;
    }

    /**
     * Sets the value of the ftcompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTCOMPANY(String value) {
        this.ftcompany = value;
    }

}
