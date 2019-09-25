
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOMMODATION_PREFERENCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOMMODATION_PREFERENCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="RDP_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RDP_TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="RDP_SUB_TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PROFILE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="UI_LABEL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="UI_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IS_DISPLAYED_IN_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_SELECTABLE_FOR_BOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOMMODATION_PREFERENCE_Type", propOrder = {
    "id",
    "rdpcode",
    "rdptype",
    "rdpsubtype",
    "profilecode",
    "uilabel",
    "uigroup",
    "priority",
    "isdisplayedinpnr",
    "isselectableforbooking"
})
public class ACCOMMODATIONPREFERENCEType
    implements Serializable
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "RDP_CODE")
    protected String rdpcode;
    @XmlElement(name = "RDP_TYPE", required = true)
    protected String rdptype;
    @XmlElement(name = "RDP_SUB_TYPE", required = true)
    protected String rdpsubtype;
    @XmlElement(name = "PROFILE_CODE")
    protected String profilecode;
    @XmlElement(name = "UI_LABEL")
    protected String uilabel;
    @XmlElement(name = "UI_GROUP")
    protected String uigroup;
    @XmlElement(name = "PRIORITY")
    protected BigInteger priority;
    @XmlElement(name = "IS_DISPLAYED_IN_PNR")
    protected Boolean isdisplayedinpnr;
    @XmlElement(name = "IS_SELECTABLE_FOR_BOOKING")
    protected Boolean isselectableforbooking;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the rdpcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDPCODE() {
        return rdpcode;
    }

    /**
     * Sets the value of the rdpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDPCODE(String value) {
        this.rdpcode = value;
    }

    /**
     * Gets the value of the rdptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDPTYPE() {
        return rdptype;
    }

    /**
     * Sets the value of the rdptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDPTYPE(String value) {
        this.rdptype = value;
    }

    /**
     * Gets the value of the rdpsubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDPSUBTYPE() {
        return rdpsubtype;
    }

    /**
     * Sets the value of the rdpsubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDPSUBTYPE(String value) {
        this.rdpsubtype = value;
    }

    /**
     * Gets the value of the profilecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFILECODE() {
        return profilecode;
    }

    /**
     * Sets the value of the profilecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFILECODE(String value) {
        this.profilecode = value;
    }

    /**
     * Gets the value of the uilabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUILABEL() {
        return uilabel;
    }

    /**
     * Sets the value of the uilabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUILABEL(String value) {
        this.uilabel = value;
    }

    /**
     * Gets the value of the uigroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIGROUP() {
        return uigroup;
    }

    /**
     * Sets the value of the uigroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIGROUP(String value) {
        this.uigroup = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRIORITY(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the isdisplayedinpnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISDISPLAYEDINPNR() {
        return isdisplayedinpnr;
    }

    /**
     * Sets the value of the isdisplayedinpnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISDISPLAYEDINPNR(Boolean value) {
        this.isdisplayedinpnr = value;
    }

    /**
     * Gets the value of the isselectableforbooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSELECTABLEFORBOOKING() {
        return isselectableforbooking;
    }

    /**
     * Sets the value of the isselectableforbooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSELECTABLEFORBOOKING(Boolean value) {
        this.isselectableforbooking = value;
    }

}
