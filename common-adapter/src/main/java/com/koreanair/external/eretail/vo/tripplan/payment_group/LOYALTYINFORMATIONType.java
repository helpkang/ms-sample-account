
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CODENAMEPAIRTYPE;


/**
 * <p>Java class for LOYALTY_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOYALTY_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}LOYALTY_ACCOUNT_Group"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="IS_APPROVED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MILES_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NEED_TO_FETCH_DATA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MILES_AND_CASH_COST" type="{}MILES_AND_CASH_COST_WITH_SLIDER_PAY_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOYALTY_INFORMATION_Type", propOrder = {
    "accountnumber",
    "company",
    "expirydate",
    "isapproved",
    "milesused",
    "needtofetchdata",
    "milesandcashcost"
})
public class LOYALTYINFORMATIONType implements Serializable
{

    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected String accountnumber;
    @XmlElement(name = "COMPANY", required = true)
    protected CODENAMEPAIRTYPE company;
    @XmlElement(name = "EXPIRY_DATE")
    protected OutputDateType expirydate;
    @XmlElement(name = "IS_APPROVED")
    protected Boolean isapproved;
    @XmlElement(name = "MILES_USED")
    protected String milesused;
    @XmlElement(name = "NEED_TO_FETCH_DATA")
    protected Boolean needtofetchdata;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected MILESANDCASHCOSTWITHSLIDERPAYType milesandcashcost;

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
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setEXPIRYDATE(OutputDateType value) {
        this.expirydate = value;
    }

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
     * Gets the value of the milesused property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMILESUSED() {
        return milesused;
    }

    /**
     * Sets the value of the milesused property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMILESUSED(String value) {
        this.milesused = value;
    }

    /**
     * Gets the value of the needtofetchdata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEEDTOFETCHDATA() {
        return needtofetchdata;
    }

    /**
     * Sets the value of the needtofetchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEEDTOFETCHDATA(Boolean value) {
        this.needtofetchdata = value;
    }

    /**
     * Gets the value of the milesandcashcost property.
     * 
     * @return
     *     possible object is
     *     {@link MILESANDCASHCOSTWITHSLIDERPAYType }
     *     
     */
    public MILESANDCASHCOSTWITHSLIDERPAYType getMILESANDCASHCOST() {
        return milesandcashcost;
    }

    /**
     * Sets the value of the milesandcashcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILESANDCASHCOSTWITHSLIDERPAYType }
     *     
     */
    public void setMILESANDCASHCOST(MILESANDCASHCOSTWITHSLIDERPAYType value) {
        this.milesandcashcost = value;
    }

}
