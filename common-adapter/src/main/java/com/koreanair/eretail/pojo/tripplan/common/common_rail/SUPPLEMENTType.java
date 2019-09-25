
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * <p>Java class for SUPPLEMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUPPLEMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REQUESTED_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUPPLEMENT_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="IN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND_TATTOO" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUPPLEMENT_Type", propOrder = {
    "code",
    "type",
    "description",
    "requestedquantity",
    "bdate",
    "amount",
    "currency",
    "availabilitystatus",
    "supplementid",
    "inpackage",
    "itemid",
    "segmentid",
    "provideritemid",
    "providersegmentid",
    "listboundtattoo",
    "tattoo"
})
public class SUPPLEMENTType
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "REQUESTED_QUANTITY")
    protected Integer requestedquantity;
    @XmlElement(name = "B_DATE")
    protected SUPPLEMENTType.BDATE bdate;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "AVAILABILITY_STATUS")
    protected String availabilitystatus;
    @XmlElement(name = "SUPPLEMENT_ID", required = true)
    protected String supplementid;
    @XmlElement(name = "IN_PACKAGE")
    protected Integer inpackage;
    @XmlElement(name = "ITEM_ID")
    protected String itemid;
    @XmlElement(name = "SEGMENT_ID")
    protected String segmentid;
    @XmlElement(name = "PROVIDER_ITEM_ID")
    protected String provideritemid;
    @XmlElement(name = "PROVIDER_SEGMENT_ID")
    protected String providersegmentid;
    @XmlElement(name = "LIST_BOUND_TATTOO")
    protected List<String> listboundtattoo;
    @XmlElement(name = "TATTOO")
    protected String tattoo;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the requestedquantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getREQUESTEDQUANTITY() {
        return requestedquantity;
    }

    /**
     * Sets the value of the requestedquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setREQUESTEDQUANTITY(Integer value) {
        this.requestedquantity = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link SUPPLEMENTType.BDATE }
     *     
     */
    public SUPPLEMENTType.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUPPLEMENTType.BDATE }
     *     
     */
    public void setBDATE(SUPPLEMENTType.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCURRENCY(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the availabilitystatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYSTATUS() {
        return availabilitystatus;
    }

    /**
     * Sets the value of the availabilitystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYSTATUS(String value) {
        this.availabilitystatus = value;
    }

    /**
     * Gets the value of the supplementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLEMENTID() {
        return supplementid;
    }

    /**
     * Sets the value of the supplementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLEMENTID(String value) {
        this.supplementid = value;
    }

    /**
     * Gets the value of the inpackage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINPACKAGE() {
        return inpackage;
    }

    /**
     * Sets the value of the inpackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINPACKAGE(Integer value) {
        this.inpackage = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMID(String value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTID(String value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the provideritemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERITEMID() {
        return provideritemid;
    }

    /**
     * Sets the value of the provideritemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERITEMID(String value) {
        this.provideritemid = value;
    }

    /**
     * Gets the value of the providersegmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERSEGMENTID() {
        return providersegmentid;
    }

    /**
     * Sets the value of the providersegmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERSEGMENTID(String value) {
        this.providersegmentid = value;
    }

    /**
     * Gets the value of the listboundtattoo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listboundtattoo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOUNDTATTOO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTBOUNDTATTOO() {
        if (listboundtattoo == null) {
            listboundtattoo = new ArrayList<String>();
        }
        return this.listboundtattoo;
    }

    /**
     * Gets the value of the tattoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTATTOO() {
        return tattoo;
    }

    /**
     * Sets the value of the tattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTATTOO(String value) {
        this.tattoo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }

}
