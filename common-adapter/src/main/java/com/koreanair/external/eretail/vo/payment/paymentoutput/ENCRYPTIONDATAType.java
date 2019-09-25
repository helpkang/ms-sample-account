
package com.koreanair.external.eretail.vo.payment.paymentoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ENCRYPTION_DATAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENCRYPTION_DATAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ENC_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ENC_CC" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ENCODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ENC_TIME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CHECKSUM" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CHECKSUM_CHARSET" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENCRYPTION_DATAType", propOrder = {
    "enctype",
    "enccc",
    "encode",
    "enctime",
    "checksum",
    "checksumcharset"
})
public class ENCRYPTIONDATAType
    implements Serializable
{

    @XmlElement(name = "ENC_TYPE", required = true)
    protected Object enctype;
    @XmlElement(name = "ENC_CC", required = true)
    protected Object enccc;
    @XmlElement(name = "ENCODE", required = true)
    protected Object encode;
    @XmlElement(name = "ENC_TIME", required = true)
    protected Object enctime;
    @XmlElement(name = "CHECKSUM", required = true)
    protected Object checksum;
    @XmlElement(name = "CHECKSUM_CHARSET", required = true)
    protected Object checksumcharset;

    /**
     * Gets the value of the enctype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENCTYPE() {
        return enctype;
    }

    /**
     * Sets the value of the enctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENCTYPE(Object value) {
        this.enctype = value;
    }

    /**
     * Gets the value of the enccc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENCCC() {
        return enccc;
    }

    /**
     * Sets the value of the enccc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENCCC(Object value) {
        this.enccc = value;
    }

    /**
     * Gets the value of the encode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENCODE() {
        return encode;
    }

    /**
     * Sets the value of the encode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENCODE(Object value) {
        this.encode = value;
    }

    /**
     * Gets the value of the enctime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENCTIME() {
        return enctime;
    }

    /**
     * Sets the value of the enctime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENCTIME(Object value) {
        this.enctime = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCHECKSUM() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCHECKSUM(Object value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the checksumcharset property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCHECKSUMCHARSET() {
        return checksumcharset;
    }

    /**
     * Sets the value of the checksumcharset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCHECKSUMCHARSET(Object value) {
        this.checksumcharset = value;
    }

}
