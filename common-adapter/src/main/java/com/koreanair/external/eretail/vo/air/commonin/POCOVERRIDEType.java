
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Explicitely define the POC to use for all requests. Strictly Internal Use Only 
 * 
 * <p>Java class for POC_OVERRIDE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POC_OVERRIDE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISABLE_SERVICE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="B_LOCATION" type="{}BOOKED_LOCATION_Type"/&gt;
 *         &lt;element ref="{}B_DATE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POC_OVERRIDE_Type", propOrder = {
    "disableservice",
    "blocation",
    "bdate"
})
public class POCOVERRIDEType
    implements Serializable
{

    @XmlElement(name = "DISABLE_SERVICE")
    protected Boolean disableservice;
    @XmlElement(name = "B_LOCATION", required = true)
    protected BOOKEDLOCATIONType blocation;
    @XmlElement(name = "B_DATE")
    protected String bdate;

    /**
     * Gets the value of the disableservice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISABLESERVICE() {
        return disableservice;
    }

    /**
     * Sets the value of the disableservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISABLESERVICE(Boolean value) {
        this.disableservice = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDLOCATIONType }
     *     
     */
    public BOOKEDLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDLOCATIONType }
     *     
     */
    public void setBLOCATION(BOOKEDLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Boarding date
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

}
