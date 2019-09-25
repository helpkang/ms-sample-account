
package com.koreanair.external.eretail.vo.hotel.reservation.common;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ListPriceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INC_IN_BASE_AMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="E"/&gt;
 *               &lt;enumeration value="I"/&gt;
 *               &lt;enumeration value="U"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CHARGE_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PER_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIME_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LONG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTA_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTA_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="E_DATE" type="{}DateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "incinbaseamount",
    "chargeunit",
    "perperson",
    "timeunit",
    "category",
    "code",
    "percentage",
    "longname",
    "otacode",
    "otaname",
    "bdate",
    "edate"
})
public class TaxType
    extends ListPriceType
    implements Serializable
{

    @XmlElement(name = "INC_IN_BASE_AMOUNT")
    protected String incinbaseamount;
    @XmlElement(name = "CHARGE_UNIT")
    protected String chargeunit;
    @XmlElement(name = "PER_PERSON")
    protected String perperson;
    @XmlElement(name = "TIME_UNIT")
    protected String timeunit;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "PERCENTAGE")
    protected BigDecimal percentage;
    @XmlElement(name = "LONG_NAME")
    protected String longname;
    @XmlElement(name = "OTA_CODE")
    protected String otacode;
    @XmlElement(name = "OTA_NAME")
    protected String otaname;
    @XmlElement(name = "B_DATE")
    protected DateType bdate;
    @XmlElement(name = "E_DATE")
    protected DateType edate;

    /**
     * Gets the value of the incinbaseamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCINBASEAMOUNT() {
        return incinbaseamount;
    }

    /**
     * Sets the value of the incinbaseamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCINBASEAMOUNT(String value) {
        this.incinbaseamount = value;
    }

    /**
     * Gets the value of the chargeunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGEUNIT() {
        return chargeunit;
    }

    /**
     * Sets the value of the chargeunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGEUNIT(String value) {
        this.chargeunit = value;
    }

    /**
     * Gets the value of the perperson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERPERSON() {
        return perperson;
    }

    /**
     * Sets the value of the perperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERPERSON(String value) {
        this.perperson = value;
    }

    /**
     * Gets the value of the timeunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMEUNIT() {
        return timeunit;
    }

    /**
     * Sets the value of the timeunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMEUNIT(String value) {
        this.timeunit = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENTAGE() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENTAGE(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the longname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLONGNAME() {
        return longname;
    }

    /**
     * Sets the value of the longname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLONGNAME(String value) {
        this.longname = value;
    }

    /**
     * Gets the value of the otacode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTACODE() {
        return otacode;
    }

    /**
     * Sets the value of the otacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTACODE(String value) {
        this.otacode = value;
    }

    /**
     * Gets the value of the otaname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTANAME() {
        return otaname;
    }

    /**
     * Sets the value of the otaname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTANAME(String value) {
        this.otaname = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBDATE(DateType value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEDATE(DateType value) {
        this.edate = value;
    }

}
