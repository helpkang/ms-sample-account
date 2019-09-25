
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;


/**
 * <p>Java class for EBANK_VOUCHER_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBANK_VOUCHER_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VOUCHER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VOUCHER_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ISSUE_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BALANCES" type="{}BalancesType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBANK_VOUCHER_INFORMATIONType", propOrder = {
    "voucherid",
    "vouchervalue",
    "issuedate",
    "expirydate",
    "listbalances",
    "listproperty"
})
public class EBANKVOUCHERINFORMATIONType implements Serializable
{

    @XmlElement(name = "VOUCHER_ID", required = true)
    protected String voucherid;
    @XmlElement(name = "VOUCHER_VALUE", required = true)
    protected String vouchervalue;
    @XmlElement(name = "ISSUE_DATE")
    protected OutputDateType issuedate;
    @XmlElement(name = "EXPIRY_DATE")
    protected OutputDateType expirydate;
    @XmlElement(name = "LIST_BALANCES")
    protected BalancesType listbalances;
    @XmlElement(name = "LIST_PROPERTY")
    protected List<String> listproperty;

    /**
     * Gets the value of the voucherid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOUCHERID() {
        return voucherid;
    }

    /**
     * Sets the value of the voucherid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOUCHERID(String value) {
        this.voucherid = value;
    }

    /**
     * Gets the value of the vouchervalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOUCHERVALUE() {
        return vouchervalue;
    }

    /**
     * Sets the value of the vouchervalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOUCHERVALUE(String value) {
        this.vouchervalue = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setISSUEDATE(OutputDateType value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setEXPIRYDATE(OutputDateType value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the listbalances property.
     * 
     * @return
     *     possible object is
     *     {@link BalancesType }
     *     
     */
    public BalancesType getLISTBALANCES() {
        return listbalances;
    }

    /**
     * Sets the value of the listbalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalancesType }
     *     
     */
    public void setLISTBALANCES(BalancesType value) {
        this.listbalances = value;
    }

    /**
     * Gets the value of the listproperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROPERTY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTPROPERTY() {
        if (listproperty == null) {
            listproperty = new ArrayList<String>();
        }
        return this.listproperty;
    }

}
