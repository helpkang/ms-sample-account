
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing the voucheraccount
 * 
 * <p>Java class for VOUCHER_ACCOUNT_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VOUCHER_ACCOUNT_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="VOUCHER_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VOUCHER_ACCOUNT_INFORMATION_TYPE", propOrder = {

})
public class VOUCHERACCOUNTINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "VOUCHER_ACCOUNT_ID", required = true)
    protected String voucheraccountid;
    @XmlElement(name = "ACCOUNT", required = true)
    protected String account;

    /**
     * Gets the value of the voucheraccountid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOUCHERACCOUNTID() {
        return voucheraccountid;
    }

    /**
     * Sets the value of the voucheraccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOUCHERACCOUNTID(String value) {
        this.voucheraccountid = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNT() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNT(String value) {
        this.account = value;
    }

}
