
package com.koreanair.external.eretail.vo.tripplan.common.common_technical_ids;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Common technnical IDs information. This structure would be present in output only if there is at least one non-empty field.
 * 
 * <p>Java class for TechnicalIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalIds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TECHNICAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GDS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GDS_ID_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalIds", propOrder = {
    "technicalid",
    "gds",
    "gdsid",
    "gdsidtype",
    "linenumber"
})
public class TechnicalIds
    implements Serializable
{

    @XmlElement(name = "TECHNICAL_ID")
    protected String technicalid;
    @XmlElement(name = "GDS")
    protected String gds;
    @XmlElement(name = "GDS_ID")
    protected String gdsid;
    @XmlElement(name = "GDS_ID_TYPE")
    protected String gdsidtype;
    @XmlElement(name = "LINE_NUMBER")
    protected BigInteger linenumber;

    /**
     * Gets the value of the technicalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTECHNICALID() {
        return technicalid;
    }

    /**
     * Sets the value of the technicalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTECHNICALID(String value) {
        this.technicalid = value;
    }

    /**
     * Gets the value of the gds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDS() {
        return gds;
    }

    /**
     * Sets the value of the gds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDS(String value) {
        this.gds = value;
    }

    /**
     * Gets the value of the gdsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSID() {
        return gdsid;
    }

    /**
     * Sets the value of the gdsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSID(String value) {
        this.gdsid = value;
    }

    /**
     * Gets the value of the gdsidtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSIDTYPE() {
        return gdsidtype;
    }

    /**
     * Sets the value of the gdsidtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSIDTYPE(String value) {
        this.gdsidtype = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLINENUMBER(BigInteger value) {
        this.linenumber = value;
    }

}
