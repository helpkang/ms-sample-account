
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.profile.commonprofileout.CREDITCARDINFORMATIONTYPE;


/**
 * <p>Java class for PAYPAL_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYPAL_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CREDIT_CARD_INFORMATION" type="{}CREDIT_CARD_INFORMATION_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYPAL_INFORMATION_Type", propOrder = {
    "id",
    "creditcardinformation"
})
public class PAYPALINFORMATIONType implements Serializable
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "CREDIT_CARD_INFORMATION")
    protected CREDITCARDINFORMATIONTYPE creditcardinformation;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the creditcardinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITCARDINFORMATIONTYPE }
     *     
     */
    public CREDITCARDINFORMATIONTYPE getCREDITCARDINFORMATION() {
        return creditcardinformation;
    }

    /**
     * Sets the value of the creditcardinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITCARDINFORMATIONTYPE }
     *     
     */
    public void setCREDITCARDINFORMATION(CREDITCARDINFORMATIONTYPE value) {
        this.creditcardinformation = value;
    }

}
