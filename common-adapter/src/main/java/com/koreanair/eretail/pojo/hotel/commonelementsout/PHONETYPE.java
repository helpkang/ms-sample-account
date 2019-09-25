
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * Phone / Fax Number
 * 
 * <p>Java class for PHONE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PHONE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_STRICT"/&gt;
 *         &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="COUNTRY_ACCESS_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AREA_CITY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LOCAL_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PHONE_TYPE", propOrder = {
    "type",
    "number",
    "countryaccesscode",
    "areacitycode",
    "localnumber"
})
public class PHONETYPE
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected CODENAMETYPESTRICT type;
    @XmlElement(name = "NUMBER", required = true)
    protected String number;
    @XmlElement(name = "COUNTRY_ACCESS_CODE")
    protected Object countryaccesscode;
    @XmlElement(name = "AREA_CITY_CODE")
    protected Object areacitycode;
    @XmlElement(name = "LOCAL_NUMBER")
    protected Object localnumber;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setTYPE(CODENAMETYPESTRICT value) {
        this.type = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMBER(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the countryaccesscode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOUNTRYACCESSCODE() {
        return countryaccesscode;
    }

    /**
     * Sets the value of the countryaccesscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOUNTRYACCESSCODE(Object value) {
        this.countryaccesscode = value;
    }

    /**
     * Gets the value of the areacitycode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAREACITYCODE() {
        return areacitycode;
    }

    /**
     * Sets the value of the areacitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAREACITYCODE(Object value) {
        this.areacitycode = value;
    }

    /**
     * Gets the value of the localnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLOCALNUMBER() {
        return localnumber;
    }

    /**
     * Sets the value of the localnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLOCALNUMBER(Object value) {
        this.localnumber = value;
    }

}
