
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_USER_ACCOUNT_ASSOCIATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_USER_ACCOUNT_ASSOCIATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_USER_ACCOUNT_ASSOCIATION_Type", propOrder = {
    "accountid",
    "travellerid"
})
public class LISTUSERACCOUNTASSOCIATIONType
    implements Serializable
{

    @XmlElement(name = "ACCOUNT_ID", required = true)
    protected String accountid;
    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;

    /**
     * Gets the value of the accountid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTID() {
        return accountid;
    }

    /**
     * Sets the value of the accountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTID(String value) {
        this.accountid = value;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

}
