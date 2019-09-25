
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.DateType;


/**
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MOB_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_FEE" type="{}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DUE_DATE" type="{}DateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "mobcode",
    "code",
    "listfee",
    "duedate"
})
public class PaymentType
    implements Serializable
{

    @XmlElement(name = "MOB_CODE")
    protected String mobcode;
    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "LIST_FEE")
    protected List<AmountType> listfee;
    @XmlElement(name = "DUE_DATE")
    protected DateType duedate;

    /**
     * Gets the value of the mobcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBCODE() {
        return mobcode;
    }

    /**
     * Sets the value of the mobcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBCODE(String value) {
        this.mobcode = value;
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
     * Gets the value of the listfee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getLISTFEE() {
        if (listfee == null) {
            listfee = new ArrayList<AmountType>();
        }
        return this.listfee;
    }

    /**
     * Gets the value of the duedate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDUEDATE() {
        return duedate;
    }

    /**
     * Sets the value of the duedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDUEDATE(DateType value) {
        this.duedate = value;
    }

}
