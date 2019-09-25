
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Frequent flyer information  
 * 
 * <p>Java class for LIST_FREQUENT_FLYER_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FREQUENT_FLYER_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OWNER_FIRSTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OWNER_LASTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OWNER_TITLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_GDS_VALIDATED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_DATACHECK_PERFORMED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ACCOUNT_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIORITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALLIANCE_TIER_LEVEL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;maxLength value="70"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
 *         &lt;element name="MILEAGE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_EXPIRING_POINTS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_EXPIRING_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="E_VOUCHER" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PIN_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RETRIEVED_FROM" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TIER_POINTS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FREQUENT_FLYER_TYPE", propOrder = {

})
@XmlSeeAlso({
    com.koreanair.eretail.pojo.profile.commonprofileout.LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER.class
})
public class LISTFREQUENTFLYERTYPE
    implements Serializable
{

    @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
    protected BigInteger companyaccountid;
    @XmlElement(name = "OWNER_FIRSTNAME")
    protected Object ownerfirstname;
    @XmlElement(name = "OWNER_LASTNAME")
    protected Object ownerlastname;
    @XmlElement(name = "OWNER_TITLE")
    protected Object ownertitle;
    @XmlElement(name = "IS_GDS_VALIDATED")
    protected Object isgdsvalidated;
    @XmlElement(name = "IS_DATACHECK_PERFORMED")
    protected Object isdatacheckperformed;
    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected String accountnumber;
    @XmlElement(name = "ACCOUNT_LEVEL")
    protected String accountlevel;
    @XmlElement(name = "PRIORITY_CODE")
    protected String prioritycode;
    @XmlElement(name = "ALLIANCE_TIER_LEVEL")
    protected LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL alliancetierlevel;
    @XmlElement(name = "COMPANY", required = true)
    protected CODENAMEPAIRTYPE company;
    @XmlElement(name = "MILEAGE")
    protected Long mileage;
    @XmlElement(name = "FIRST_EXPIRING_POINTS")
    protected Long firstexpiringpoints;
    @XmlElement(name = "FIRST_EXPIRING_DATE")
    protected DATETYPEPROFILE firstexpiringdate;
    @XmlElement(name = "OVERDRAFT")
    protected Long overdraft;
    @XmlElement(name = "E_VOUCHER")
    protected Long evoucher;
    @XmlElement(name = "PIN_NUMBER")
    protected Object pinnumber;
    @XmlElement(name = "RETRIEVED_FROM")
    protected Object retrievedfrom;
    @XmlElement(name = "STATUS")
    protected Object status;
    @XmlElement(name = "TIER_POINTS")
    protected Object tierpoints;

    /**
     * Gets the value of the companyaccountid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOMPANYACCOUNTID() {
        return companyaccountid;
    }

    /**
     * Sets the value of the companyaccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOMPANYACCOUNTID(BigInteger value) {
        this.companyaccountid = value;
    }

    /**
     * Gets the value of the ownerfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOWNERFIRSTNAME() {
        return ownerfirstname;
    }

    /**
     * Sets the value of the ownerfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOWNERFIRSTNAME(Object value) {
        this.ownerfirstname = value;
    }

    /**
     * Gets the value of the ownerlastname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOWNERLASTNAME() {
        return ownerlastname;
    }

    /**
     * Sets the value of the ownerlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOWNERLASTNAME(Object value) {
        this.ownerlastname = value;
    }

    /**
     * Gets the value of the ownertitle property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOWNERTITLE() {
        return ownertitle;
    }

    /**
     * Sets the value of the ownertitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOWNERTITLE(Object value) {
        this.ownertitle = value;
    }

    /**
     * Gets the value of the isgdsvalidated property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISGDSVALIDATED() {
        return isgdsvalidated;
    }

    /**
     * Sets the value of the isgdsvalidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISGDSVALIDATED(Object value) {
        this.isgdsvalidated = value;
    }

    /**
     * Gets the value of the isdatacheckperformed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISDATACHECKPERFORMED() {
        return isdatacheckperformed;
    }

    /**
     * Sets the value of the isdatacheckperformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISDATACHECKPERFORMED(Object value) {
        this.isdatacheckperformed = value;
    }

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNUMBER(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the accountlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTLEVEL() {
        return accountlevel;
    }

    /**
     * Sets the value of the accountlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTLEVEL(String value) {
        this.accountlevel = value;
    }

    /**
     * Gets the value of the prioritycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITYCODE() {
        return prioritycode;
    }

    /**
     * Sets the value of the prioritycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITYCODE(String value) {
        this.prioritycode = value;
    }

    /**
     * Gets the value of the alliancetierlevel property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL }
     *     
     */
    public LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL getALLIANCETIERLEVEL() {
        return alliancetierlevel;
    }

    /**
     * Sets the value of the alliancetierlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL }
     *     
     */
    public void setALLIANCETIERLEVEL(LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL value) {
        this.alliancetierlevel = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setCOMPANY(CODENAMEPAIRTYPE value) {
        this.company = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMILEAGE() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMILEAGE(Long value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the firstexpiringpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFIRSTEXPIRINGPOINTS() {
        return firstexpiringpoints;
    }

    /**
     * Sets the value of the firstexpiringpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFIRSTEXPIRINGPOINTS(Long value) {
        this.firstexpiringpoints = value;
    }

    /**
     * Gets the value of the firstexpiringdate property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public DATETYPEPROFILE getFIRSTEXPIRINGDATE() {
        return firstexpiringdate;
    }

    /**
     * Sets the value of the firstexpiringdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public void setFIRSTEXPIRINGDATE(DATETYPEPROFILE value) {
        this.firstexpiringdate = value;
    }

    /**
     * Gets the value of the overdraft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOVERDRAFT() {
        return overdraft;
    }

    /**
     * Sets the value of the overdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOVERDRAFT(Long value) {
        this.overdraft = value;
    }

    /**
     * Gets the value of the evoucher property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEVOUCHER() {
        return evoucher;
    }

    /**
     * Sets the value of the evoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEVOUCHER(Long value) {
        this.evoucher = value;
    }

    /**
     * Gets the value of the pinnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPINNUMBER() {
        return pinnumber;
    }

    /**
     * Sets the value of the pinnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPINNUMBER(Object value) {
        this.pinnumber = value;
    }

    /**
     * Gets the value of the retrievedfrom property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRETRIEVEDFROM() {
        return retrievedfrom;
    }

    /**
     * Sets the value of the retrievedfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRETRIEVEDFROM(Object value) {
        this.retrievedfrom = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTATUS(Object value) {
        this.status = value;
    }

    /**
     * Gets the value of the tierpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTIERPOINTS() {
        return tierpoints;
    }

    /**
     * Sets the value of the tierpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTIERPOINTS(Object value) {
        this.tierpoints = value;
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
     *       &lt;all&gt;
     *         &lt;element name="CODE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;maxLength value="4"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;maxLength value="70"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ALLIANCETIERLEVEL
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
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
