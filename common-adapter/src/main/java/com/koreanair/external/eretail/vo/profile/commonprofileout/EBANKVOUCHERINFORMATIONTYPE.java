
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing the ebank voucher
 * 
 * <p>Java class for EBANK_VOUCHER_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBANK_VOUCHER_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="VOUCHER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VOUCHER_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBANK_VOUCHER_INFORMATION_TYPE", propOrder = {

})
public class EBANKVOUCHERINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "VOUCHER_ID", required = true)
    protected String voucherid;
    @XmlElement(name = "VOUCHER_VALUE", required = true)
    protected String vouchervalue;

    /**
     * Gets the value of the voucherid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOUCHERID() {
        return voucherid;
    }

    /**
     * Sets the value of the voucherid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOUCHERID(String value) {
        this.voucherid = value;
    }

    /**
     * Gets the value of the vouchervalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOUCHERVALUE() {
        return vouchervalue;
    }

    /**
     * Sets the value of the vouchervalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOUCHERVALUE(String value) {
        this.vouchervalue = value;
    }

}
