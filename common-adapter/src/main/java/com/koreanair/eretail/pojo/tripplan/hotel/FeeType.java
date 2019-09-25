
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.reservation.common.DateType;
import com.koreanair.eretail.pojo.hotel.reservation.common.ListPriceType;


/**
 * <p>Java class for FeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ListPriceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="E_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="CHARGE_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DETAIL" type="{}ExtendedDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
    "type",
    "subtype",
    "name",
    "inclusive",
    "percentage",
    "bdate",
    "edate",
    "chargeunit",
    "listdetail"
})
public class FeeType
    extends ListPriceType
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "SUB_TYPE")
    protected String subtype;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "INCLUSIVE")
    protected String inclusive;
    @XmlElement(name = "PERCENTAGE")
    protected BigDecimal percentage;
    @XmlElement(name = "B_DATE")
    protected DateType bdate;
    @XmlElement(name = "E_DATE")
    protected DateType edate;
    @XmlElement(name = "CHARGE_UNIT")
    protected String chargeunit;
    @XmlElement(name = "LIST_DETAIL")
    protected List<ExtendedDescriptionType> listdetail;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTYPE(String value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the inclusive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCLUSIVE() {
        return inclusive;
    }

    /**
     * Sets the value of the inclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCLUSIVE(String value) {
        this.inclusive = value;
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
     * Gets the value of the listdetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDETAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedDescriptionType }
     * 
     * 
     */
    public List<ExtendedDescriptionType> getLISTDETAIL() {
        if (listdetail == null) {
            listdetail = new ArrayList<ExtendedDescriptionType>();
        }
        return this.listdetail;
    }

}
