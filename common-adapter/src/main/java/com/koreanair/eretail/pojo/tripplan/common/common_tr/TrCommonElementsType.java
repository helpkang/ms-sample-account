
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trCommonElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trCommonElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}trBaseElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONFIRMATION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CANCELLATION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="MBO_PRODUCT_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORIGIN_SYSTEM" type="{}trOriginSystemType" minOccurs="0"/&gt;
 *         &lt;element name="BKG_CHANNEL" type="{}trBookingChannelType" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNAL_SYSTEM" type="{}trExternalSystemType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trCommonElementsType", propOrder = {
    "confirmationnumber",
    "cancellationnumber",
    "mboproductcode",
    "originsystem",
    "bkgchannel",
    "externalsystem"
})
public class TrCommonElementsType
    extends TrBaseElementsType
    implements Serializable
{

    @XmlElement(name = "CONFIRMATION_NUMBER")
    protected String confirmationnumber;
    @XmlElement(name = "CANCELLATION_NUMBER")
    protected String cancellationnumber;
    @XmlElement(name = "MBO_PRODUCT_CODE")
    protected String mboproductcode;
    @XmlElement(name = "ORIGIN_SYSTEM")
    protected TrOriginSystemType originsystem;
    @XmlElement(name = "BKG_CHANNEL")
    protected TrBookingChannelType bkgchannel;
    @XmlElement(name = "EXTERNAL_SYSTEM")
    protected TrExternalSystemType externalsystem;

    /**
     * Gets the value of the confirmationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMATIONNUMBER() {
        return confirmationnumber;
    }

    /**
     * Sets the value of the confirmationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMATIONNUMBER(String value) {
        this.confirmationnumber = value;
    }

    /**
     * Gets the value of the cancellationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELLATIONNUMBER() {
        return cancellationnumber;
    }

    /**
     * Sets the value of the cancellationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELLATIONNUMBER(String value) {
        this.cancellationnumber = value;
    }

    /**
     * Gets the value of the mboproductcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMBOPRODUCTCODE() {
        return mboproductcode;
    }

    /**
     * Sets the value of the mboproductcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMBOPRODUCTCODE(String value) {
        this.mboproductcode = value;
    }

    /**
     * Gets the value of the originsystem property.
     * 
     * @return
     *     possible object is
     *     {@link TrOriginSystemType }
     *     
     */
    public TrOriginSystemType getORIGINSYSTEM() {
        return originsystem;
    }

    /**
     * Sets the value of the originsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrOriginSystemType }
     *     
     */
    public void setORIGINSYSTEM(TrOriginSystemType value) {
        this.originsystem = value;
    }

    /**
     * Gets the value of the bkgchannel property.
     * 
     * @return
     *     possible object is
     *     {@link TrBookingChannelType }
     *     
     */
    public TrBookingChannelType getBKGCHANNEL() {
        return bkgchannel;
    }

    /**
     * Sets the value of the bkgchannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrBookingChannelType }
     *     
     */
    public void setBKGCHANNEL(TrBookingChannelType value) {
        this.bkgchannel = value;
    }

    /**
     * Gets the value of the externalsystem property.
     * 
     * @return
     *     possible object is
     *     {@link TrExternalSystemType }
     *     
     */
    public TrExternalSystemType getEXTERNALSYSTEM() {
        return externalsystem;
    }

    /**
     * Sets the value of the externalsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrExternalSystemType }
     *     
     */
    public void setEXTERNALSYSTEM(TrExternalSystemType value) {
        this.externalsystem = value;
    }

}
