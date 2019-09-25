
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;


/**
 * <p>Java class for APPROVAL_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APPROVAL_DATA_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_APPROVED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="APPROVAL_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="APPROVAL_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="AUTOMATIC"/&gt;
 *               &lt;enumeration value="MANUAL"/&gt;
 *               &lt;enumeration value="EXTERNAL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="THREEDS_DATA" type="{}THREEDS_DATA_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPROVAL_DATA_Type", propOrder = {
    "isapproved",
    "approvalcode",
    "approvaldate",
    "approvaltype",
    "threedsdata"
})
public class APPROVALDATAType
    implements Serializable
{

    @XmlElement(name = "IS_APPROVED")
    protected Boolean isapproved;
    @XmlElement(name = "APPROVAL_CODE")
    protected String approvalcode;
    @XmlElement(name = "APPROVAL_DATE")
    protected OutputDateType approvaldate;
    @XmlElement(name = "APPROVAL_TYPE")
    protected String approvaltype;
    @XmlElement(name = "THREEDS_DATA")
    protected THREEDSDATAType threedsdata;

    /**
     * Gets the value of the isapproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISAPPROVED() {
        return isapproved;
    }

    /**
     * Sets the value of the isapproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISAPPROVED(Boolean value) {
        this.isapproved = value;
    }

    /**
     * Gets the value of the approvalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPROVALCODE() {
        return approvalcode;
    }

    /**
     * Sets the value of the approvalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPROVALCODE(String value) {
        this.approvalcode = value;
    }

    /**
     * Gets the value of the approvaldate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getAPPROVALDATE() {
        return approvaldate;
    }

    /**
     * Sets the value of the approvaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setAPPROVALDATE(OutputDateType value) {
        this.approvaldate = value;
    }

    /**
     * Gets the value of the approvaltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPROVALTYPE() {
        return approvaltype;
    }

    /**
     * Sets the value of the approvaltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPROVALTYPE(String value) {
        this.approvaltype = value;
    }

    /**
     * Gets the value of the threedsdata property.
     * 
     * @return
     *     possible object is
     *     {@link THREEDSDATAType }
     *     
     */
    public THREEDSDATAType getTHREEDSDATA() {
        return threedsdata;
    }

    /**
     * Sets the value of the threedsdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link THREEDSDATAType }
     *     
     */
    public void setTHREEDSDATA(THREEDSDATAType value) {
        this.threedsdata = value;
    }

}
