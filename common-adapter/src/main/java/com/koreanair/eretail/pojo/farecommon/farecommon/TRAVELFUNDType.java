
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAVEL_FUND_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVEL_FUND_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVEL_FUND_Type", propOrder = {
    "number",
    "expirydate",
    "firstname",
    "lastname"
})
public class TRAVELFUNDType
    implements Serializable
{

    @XmlElement(name = "NUMBER", required = true)
    protected Object number;
    @XmlElement(name = "EXPIRY_DATE", required = true)
    protected Object expirydate;
    @XmlElement(name = "FIRST_NAME")
    protected Object firstname;
    @XmlElement(name = "LAST_NAME")
    protected Object lastname;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNUMBER(Object value) {
        this.number = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXPIRYDATE(Object value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFIRSTNAME(Object value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLASTNAME(Object value) {
        this.lastname = value;
    }

}
