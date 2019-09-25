
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}CollectionInfoGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionInfoType", propOrder = {
    "documenttype",
    "collectableas",
    "taxcode"
})
public class CollectionInfoType
    implements Serializable
{

    @XmlElement(name = "DOCUMENT_TYPE", required = true)
    protected String documenttype;
    @XmlElement(name = "COLLECTABLE_AS")
    protected String collectableas;
    @XmlElement(name = "TAX_CODE")
    protected String taxcode;

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTTYPE(String value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the collectableas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLLECTABLEAS() {
        return collectableas;
    }

    /**
     * Sets the value of the collectableas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLLECTABLEAS(String value) {
        this.collectableas = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXCODE() {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXCODE(String value) {
        this.taxcode = value;
    }

}
