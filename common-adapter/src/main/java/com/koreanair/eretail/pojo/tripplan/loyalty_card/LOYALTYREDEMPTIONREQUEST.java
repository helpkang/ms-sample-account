
package com.koreanair.eretail.pojo.tripplan.loyalty_card;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOYALTY_REDEMPTION_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOYALTY_REDEMPTION_REQUEST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}LOYALTY_REQUEST"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AWARD_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PACKAGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROMOTION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAMILY_POOLING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOYALTY_REDEMPTION_REQUEST", propOrder = {
    "awardcode",
    "packagecode",
    "promotioncode",
    "familypooling",
    "approvalcode"
})
@XmlSeeAlso({
    LOYALTYUPGRADEREQUEST.class
})
public class LOYALTYREDEMPTIONREQUEST
    extends LOYALTYREQUEST
    implements Serializable
{

    @XmlElement(name = "AWARD_CODE")
    protected String awardcode;
    @XmlElement(name = "PACKAGE_CODE")
    protected String packagecode;
    @XmlElement(name = "PROMOTION_CODE")
    protected String promotioncode;
    @XmlElement(name = "FAMILY_POOLING")
    protected Boolean familypooling;
    @XmlElement(name = "APPROVAL_CODE")
    protected String approvalcode;

    /**
     * Gets the value of the awardcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWARDCODE() {
        return awardcode;
    }

    /**
     * Sets the value of the awardcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWARDCODE(String value) {
        this.awardcode = value;
    }

    /**
     * Gets the value of the packagecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGECODE() {
        return packagecode;
    }

    /**
     * Sets the value of the packagecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGECODE(String value) {
        this.packagecode = value;
    }

    /**
     * Gets the value of the promotioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMOTIONCODE() {
        return promotioncode;
    }

    /**
     * Sets the value of the promotioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMOTIONCODE(String value) {
        this.promotioncode = value;
    }

    /**
     * Gets the value of the familypooling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFAMILYPOOLING() {
        return familypooling;
    }

    /**
     * Sets the value of the familypooling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFAMILYPOOLING(Boolean value) {
        this.familypooling = value;
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

}
