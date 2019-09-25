
package com.koreanair.external.eretail.vo.tripplan.common.common_car;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_CODE" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_TYPE", propOrder = {
    "idcode"
})
public class IDTYPE
    implements Serializable
{

    @XmlElement(name = "ID_CODE", required = true)
    protected String idcode;

    /**
     * Gets the value of the idcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCODE() {
        return idcode;
    }

    /**
     * Sets the value of the idcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCODE(String value) {
        this.idcode = value;
    }

}
