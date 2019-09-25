
package com.koreanair.external.eretail.vo.pnr.listcrossreference;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_CROSS_REF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_CROSS_REF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CROSS_REF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_CROSS_REF", propOrder = {
    "crossref",
    "type"
})
public class LISTCROSSREF
    implements Serializable
{

    @XmlElement(name = "CROSS_REF", required = true)
    protected String crossref;
    @XmlElement(name = "TYPE", required = true)
    protected String type;

    /**
     * Gets the value of the crossref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCROSSREF() {
        return crossref;
    }

    /**
     * Sets the value of the crossref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCROSSREF(String value) {
        this.crossref = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

}
