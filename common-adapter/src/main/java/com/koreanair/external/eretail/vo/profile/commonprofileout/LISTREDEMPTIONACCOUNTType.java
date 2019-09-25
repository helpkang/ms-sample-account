
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_REDEMPTION_ACCOUNTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_REDEMPTION_ACCOUNTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REDEMPTION_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FREQUENT_FLYER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{}LIST_STATUS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWARD_CODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PACKAGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROMOTION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAMILY_POOLING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_REDEMPTION_ACCOUNTType", propOrder = {
    "redemptionaccountid",
    "frequentflyerid",
    "liststatus",
    "approvalcode",
    "awardcode",
    "packagecode",
    "promotioncode",
    "familypooling",
    "comment",
    "functionalid"
})
@XmlSeeAlso({
    com.koreanair.external.eretail.vo.profile.commonprofileout.LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT.class
})
public class LISTREDEMPTIONACCOUNTType
    implements Serializable
{

    @XmlElement(name = "REDEMPTION_ACCOUNT_ID")
    protected BigInteger redemptionaccountid;
    @XmlElement(name = "FREQUENT_FLYER_ID", required = true)
    protected BigInteger frequentflyerid;
    @XmlElement(name = "LIST_STATUS")
    protected List<LISTSTATUS> liststatus;
    @XmlElement(name = "APPROVAL_CODE")
    protected String approvalcode;
    @XmlElement(name = "AWARD_CODE")
    protected LISTREDEMPTIONACCOUNTType.AWARDCODE awardcode;
    @XmlElement(name = "PACKAGE_CODE")
    protected String packagecode;
    @XmlElement(name = "PROMOTION_CODE")
    protected String promotioncode;
    @XmlElement(name = "FAMILY_POOLING")
    protected Boolean familypooling;
    @XmlElement(name = "COMMENT")
    protected String comment;
    @XmlElement(name = "FUNCTIONAL_ID")
    protected String functionalid;

    /**
     * Gets the value of the redemptionaccountid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREDEMPTIONACCOUNTID() {
        return redemptionaccountid;
    }

    /**
     * Sets the value of the redemptionaccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREDEMPTIONACCOUNTID(BigInteger value) {
        this.redemptionaccountid = value;
    }

    /**
     * Gets the value of the frequentflyerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFREQUENTFLYERID() {
        return frequentflyerid;
    }

    /**
     * Sets the value of the frequentflyerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFREQUENTFLYERID(BigInteger value) {
        this.frequentflyerid = value;
    }

    /**
     * Gets the value of the liststatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSTATUS }
     * 
     * 
     */
    public List<LISTSTATUS> getLISTSTATUS() {
        if (liststatus == null) {
            liststatus = new ArrayList<LISTSTATUS>();
        }
        return this.liststatus;
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
     * Gets the value of the awardcode property.
     * 
     * @return
     *     possible object is
     *     {@link LISTREDEMPTIONACCOUNTType.AWARDCODE }
     *     
     */
    public LISTREDEMPTIONACCOUNTType.AWARDCODE getAWARDCODE() {
        return awardcode;
    }

    /**
     * Sets the value of the awardcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTREDEMPTIONACCOUNTType.AWARDCODE }
     *     
     */
    public void setAWARDCODE(LISTREDEMPTIONACCOUNTType.AWARDCODE value) {
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the functionalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONALID() {
        return functionalid;
    }

    /**
     * Sets the value of the functionalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONALID(String value) {
        this.functionalid = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name"
    })
    public static class AWARDCODE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }

}
