
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentityDocumentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocumentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IDENTITY_DOCUMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocumentInformationType", propOrder = {
    "index",
    "identitydocumentid"
})
public class IdentityDocumentInformationType
    implements Serializable
{

    @XmlElement(name = "INDEX")
    protected Integer index;
    @XmlElement(name = "IDENTITY_DOCUMENT_ID")
    protected String identitydocumentid;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINDEX(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the identitydocumentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTITYDOCUMENTID() {
        return identitydocumentid;
    }

    /**
     * Sets the value of the identitydocumentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTITYDOCUMENTID(String value) {
        this.identitydocumentid = value;
    }

}
