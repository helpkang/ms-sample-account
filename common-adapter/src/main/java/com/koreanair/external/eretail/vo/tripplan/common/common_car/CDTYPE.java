
package com.koreanair.external.eretail.vo.tripplan.common.common_car;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CD_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CD_CODE" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CD_TYPE", propOrder = {
    "cdcode"
})
public class CDTYPE
    implements Serializable
{

    @XmlElement(name = "CD_CODE", required = true)
    protected String cdcode;

    /**
     * Gets the value of the cdcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDCODE() {
        return cdcode;
    }

    /**
     * Sets the value of the cdcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDCODE(String value) {
        this.cdcode = value;
    }

}
