
package com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Display of Commercial Agreement
 * 
 * <p>Java class for LIST_COMMERCIAL_AGREEMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_COMMERCIAL_AGREEMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE_SHARE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AIRLINE_DESIGNATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_COMMERCIAL_AGREEMENT_Type", propOrder = {
    "codesharetype",
    "airlinedesignator",
    "freetext"
})
public class LISTCOMMERCIALAGREEMENTType
    implements Serializable
{

    @XmlElement(name = "CODE_SHARE_TYPE", required = true)
    protected String codesharetype;
    @XmlElement(name = "AIRLINE_DESIGNATOR")
    protected String airlinedesignator;
    @XmlElement(name = "FREE_TEXT")
    protected String freetext;

    /**
     * Gets the value of the codesharetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESHARETYPE() {
        return codesharetype;
    }

    /**
     * Sets the value of the codesharetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESHARETYPE(String value) {
        this.codesharetype = value;
    }

    /**
     * Gets the value of the airlinedesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINEDESIGNATOR() {
        return airlinedesignator;
    }

    /**
     * Sets the value of the airlinedesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINEDESIGNATOR(String value) {
        this.airlinedesignator = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

}
