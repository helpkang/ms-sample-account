
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHECK_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHECK_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CHECK_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CHECK_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BANK_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHECK_INFORMATION_TYPE", propOrder = {

})
public class CHECKINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "CHECK_ID", required = true)
    protected String checkid;
    @XmlElement(name = "CHECK_NUMBER", required = true)
    protected String checknumber;
    @XmlElement(name = "BANK_ACCOUNT_ID", required = true)
    protected Object bankaccountid;

    /**
     * Gets the value of the checkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKID() {
        return checkid;
    }

    /**
     * Sets the value of the checkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKID(String value) {
        this.checkid = value;
    }

    /**
     * Gets the value of the checknumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKNUMBER() {
        return checknumber;
    }

    /**
     * Sets the value of the checknumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKNUMBER(String value) {
        this.checknumber = value;
    }

    /**
     * Gets the value of the bankaccountid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBANKACCOUNTID() {
        return bankaccountid;
    }

    /**
     * Sets the value of the bankaccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBANKACCOUNTID(Object value) {
        this.bankaccountid = value;
    }

}
