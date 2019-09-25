
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
 *         &lt;element name="CHARGE_UNIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PER_PERSON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TIME_UNIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LONG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTA_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OTA_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="E_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" type="{}PRICE_TYPE_2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXType", propOrder = {
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
    "edate",
    "listprice"
})
public class TAXType
    implements Serializable
{

    @XmlElement(name = "INC_IN_BASE_AMOUNT")
    protected String incinbaseamount;
    @XmlElement(name = "CHARGE_UNIT")
    protected Object chargeunit;
    @XmlElement(name = "PER_PERSON")
    protected Object perperson;
    @XmlElement(name = "TIME_UNIT")
    protected Object timeunit;
    @XmlElement(name = "CATEGORY")
    protected Object category;
    @XmlElement(name = "CODE")
    protected Object code;
    @XmlElement(name = "PERCENTAGE")
    protected Object percentage;
    @XmlElement(name = "LONG_NAME")
    protected String longname;
    @XmlElement(name = "OTA_CODE")
    protected Object otacode;
    @XmlElement(name = "OTA_NAME")
    protected String otaname;
    @XmlElement(name = "B_DATE")
    protected Object bdate;
    @XmlElement(name = "E_DATE")
    protected Object edate;
    @XmlElement(name = "LIST_PRICE")
    protected List<PRICETYPE2> listprice;

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
     *     {@link Object }
     *     
     */
    public Object getCHARGEUNIT() {
        return chargeunit;
    }

    /**
     * Sets the value of the chargeunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCHARGEUNIT(Object value) {
        this.chargeunit = value;
    }

    /**
     * Gets the value of the perperson property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPERPERSON() {
        return perperson;
    }

    /**
     * Sets the value of the perperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPERPERSON(Object value) {
        this.perperson = value;
    }

    /**
     * Gets the value of the timeunit property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTIMEUNIT() {
        return timeunit;
    }

    /**
     * Sets the value of the timeunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTIMEUNIT(Object value) {
        this.timeunit = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCATEGORY(Object value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCODE(Object value) {
        this.code = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPERCENTAGE() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPERCENTAGE(Object value) {
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
     *     {@link Object }
     *     
     */
    public Object getOTACODE() {
        return otacode;
    }

    /**
     * Sets the value of the otacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOTACODE(Object value) {
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
     *     {@link Object }
     *     
     */
    public Object getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBDATE(Object value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEDATE(Object value) {
        this.edate = value;
    }

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRICETYPE2 }
     * 
     * 
     */
    public List<PRICETYPE2> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<PRICETYPE2>();
        }
        return this.listprice;
    }

}
