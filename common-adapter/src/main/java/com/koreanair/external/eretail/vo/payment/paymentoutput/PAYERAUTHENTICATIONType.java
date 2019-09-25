
package com.koreanair.external.eretail.vo.payment.paymentoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.payment.amountcommon.AMOUNTValueType;


/**
 * <p>Java class for PAYER_AUTHENTICATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYER_AUTHENTICATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT" type="{}AMOUNTValueType"/&gt;
 *         &lt;element name="PROOF_XML" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="XID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="VERIFYENROLLMENT_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ECI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="COMMERCE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CAVV" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="COLLECTION_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="VALIDATEAUTHENTICATION_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYER_AUTHENTICATIONType", propOrder = {
    "amount",
    "proofxml",
    "xid",
    "verifyenrollmentstatus",
    "eci",
    "commerceindicator",
    "cavv",
    "collectionindicator",
    "validateauthenticationstatus"
})
public class PAYERAUTHENTICATIONType
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected AMOUNTValueType amount;
    @XmlElement(name = "PROOF_XML", required = true)
    protected Object proofxml;
    @XmlElement(name = "XID", required = true)
    protected Object xid;
    @XmlElement(name = "VERIFYENROLLMENT_STATUS", required = true)
    protected Object verifyenrollmentstatus;
    @XmlElement(name = "ECI", required = true)
    protected Object eci;
    @XmlElement(name = "COMMERCE_INDICATOR", required = true)
    protected Object commerceindicator;
    @XmlElement(name = "CAVV", required = true)
    protected Object cavv;
    @XmlElement(name = "COLLECTION_INDICATOR", required = true)
    protected Object collectionindicator;
    @XmlElement(name = "VALIDATEAUTHENTICATION_STATUS", required = true)
    protected Object validateauthenticationstatus;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setAMOUNT(AMOUNTValueType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the proofxml property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPROOFXML() {
        return proofxml;
    }

    /**
     * Sets the value of the proofxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPROOFXML(Object value) {
        this.proofxml = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXID() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXID(Object value) {
        this.xid = value;
    }

    /**
     * Gets the value of the verifyenrollmentstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVERIFYENROLLMENTSTATUS() {
        return verifyenrollmentstatus;
    }

    /**
     * Sets the value of the verifyenrollmentstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVERIFYENROLLMENTSTATUS(Object value) {
        this.verifyenrollmentstatus = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getECI() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setECI(Object value) {
        this.eci = value;
    }

    /**
     * Gets the value of the commerceindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOMMERCEINDICATOR() {
        return commerceindicator;
    }

    /**
     * Sets the value of the commerceindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOMMERCEINDICATOR(Object value) {
        this.commerceindicator = value;
    }

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCAVV() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCAVV(Object value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the collectionindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOLLECTIONINDICATOR() {
        return collectionindicator;
    }

    /**
     * Sets the value of the collectionindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOLLECTIONINDICATOR(Object value) {
        this.collectionindicator = value;
    }

    /**
     * Gets the value of the validateauthenticationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVALIDATEAUTHENTICATIONSTATUS() {
        return validateauthenticationstatus;
    }

    /**
     * Sets the value of the validateauthenticationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVALIDATEAUTHENTICATIONSTATUS(Object value) {
        this.validateauthenticationstatus = value;
    }

}
