
package com.koreanair.external.eretail.vo.payment.frauddatadetails;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fraud data information from XML input
 * 
 * <p>Java class for FRAUD_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FRAUD_DATA_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IP_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FINGER_PRINT_BD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRAUD_DATA_Type", propOrder = {
    "ipaddress",
    "fingerprintbd"
})
public class FRAUDDATAType
    implements Serializable
{

    @XmlElement(name = "IP_ADDRESS")
    protected Object ipaddress;
    @XmlElement(name = "FINGER_PRINT_BD")
    protected String fingerprintbd;

    /**
     * Gets the value of the ipaddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIPADDRESS() {
        return ipaddress;
    }

    /**
     * Sets the value of the ipaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIPADDRESS(Object value) {
        this.ipaddress = value;
    }

    /**
     * Gets the value of the fingerprintbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINGERPRINTBD() {
        return fingerprintbd;
    }

    /**
     * Sets the value of the fingerprintbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINGERPRINTBD(String value) {
        this.fingerprintbd = value;
    }

}
