
package com.koreanair.external.eretail.vo.tripplan.common.common_etr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for etrCommonElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrCommonElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrBaseElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONFIRMATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CANCELLATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MBO_PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORIGIN_SYSTEM" type="{}etrOriginSystemType" minOccurs="0"/&gt;
 *         &lt;element name="BKG_CHANNEL" type="{}etrBkgChannelType" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNAL_SYSTEM" type="{}etrExternalSystemType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrCommonElementsType", propOrder = {
    "confirmationnumber",
    "cancellationnumber",
    "mboproductcode",
    "originsystem",
    "bkgchannel",
    "externalsystem"
})
public class EtrCommonElementsType
    extends EtrBaseElementsType
    implements Serializable
{

    @XmlElement(name = "CONFIRMATION_NUMBER")
    protected String confirmationnumber;
    @XmlElement(name = "CANCELLATION_NUMBER")
    protected String cancellationnumber;
    @XmlElement(name = "MBO_PRODUCT_CODE")
    protected String mboproductcode;
    @XmlElement(name = "ORIGIN_SYSTEM")
    protected EtrOriginSystemType originsystem;
    @XmlElement(name = "BKG_CHANNEL")
    protected EtrBkgChannelType bkgchannel;
    @XmlElement(name = "EXTERNAL_SYSTEM")
    protected EtrExternalSystemType externalsystem;

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
     *     {@link EtrOriginSystemType }
     *     
     */
    public EtrOriginSystemType getORIGINSYSTEM() {
        return originsystem;
    }

    /**
     * Sets the value of the originsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrOriginSystemType }
     *     
     */
    public void setORIGINSYSTEM(EtrOriginSystemType value) {
        this.originsystem = value;
    }

    /**
     * Gets the value of the bkgchannel property.
     * 
     * @return
     *     possible object is
     *     {@link EtrBkgChannelType }
     *     
     */
    public EtrBkgChannelType getBKGCHANNEL() {
        return bkgchannel;
    }

    /**
     * Sets the value of the bkgchannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrBkgChannelType }
     *     
     */
    public void setBKGCHANNEL(EtrBkgChannelType value) {
        this.bkgchannel = value;
    }

    /**
     * Gets the value of the externalsystem property.
     * 
     * @return
     *     possible object is
     *     {@link EtrExternalSystemType }
     *     
     */
    public EtrExternalSystemType getEXTERNALSYSTEM() {
        return externalsystem;
    }

    /**
     * Sets the value of the externalsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrExternalSystemType }
     *     
     */
    public void setEXTERNALSYSTEM(EtrExternalSystemType value) {
        this.externalsystem = value;
    }

}
