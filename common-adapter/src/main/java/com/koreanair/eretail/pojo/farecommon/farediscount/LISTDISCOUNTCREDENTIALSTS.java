
package com.koreanair.eretail.pojo.farecommon.farediscount;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}DiscountCredential_Type_Travelshopper"&gt;
 *       &lt;group ref="{}FareContextCredentialData_Group"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "travellerid",
    "ptnumber",
    "paxcategory",
    "travellertype"
})
@XmlRootElement(name = "LIST_DISCOUNT_CREDENTIALS_TS")
public class LISTDISCOUNTCREDENTIALSTS
    extends DiscountCredentialTypeTravelshopper
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "PT_NUMBER")
    protected BigInteger ptnumber;
    @XmlElement(name = "PAX_CATEGORY")
    protected String paxcategory;
    @XmlElement(name = "TRAVELLER_TYPE")
    protected String travellertype;

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

    /**
     * Gets the value of the ptnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPTNUMBER() {
        return ptnumber;
    }

    /**
     * Sets the value of the ptnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPTNUMBER(BigInteger value) {
        this.ptnumber = value;
    }

    /**
     * Gets the value of the paxcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAXCATEGORY() {
        return paxcategory;
    }

    /**
     * Sets the value of the paxcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAXCATEGORY(String value) {
        this.paxcategory = value;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERTYPE(String value) {
        this.travellertype = value;
    }

}
