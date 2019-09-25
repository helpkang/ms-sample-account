
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CEM_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CEM_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CEM_ID"/&gt;
 *         &lt;element ref="{}CEM_AIRLINE_CODE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CEM_Type", propOrder = {
    "cemid",
    "cemairlinecode"
})
public class CEMType
    implements Serializable
{

    @XmlElement(name = "CEM_ID", required = true)
    protected String cemid;
    @XmlElement(name = "CEM_AIRLINE_CODE")
    protected String cemairlinecode;

    /**
     * Gets the value of the cemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEMID() {
        return cemid;
    }

    /**
     * Sets the value of the cemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEMID(String value) {
        this.cemid = value;
    }

    /**
     * Gets the value of the cemairlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEMAIRLINECODE() {
        return cemairlinecode;
    }

    /**
     * Sets the value of the cemairlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEMAIRLINECODE(String value) {
        this.cemairlinecode = value;
    }

}
