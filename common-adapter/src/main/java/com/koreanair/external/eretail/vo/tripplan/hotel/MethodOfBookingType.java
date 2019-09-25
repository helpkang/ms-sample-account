
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
 * <p>Java class for MethodOfBookingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodOfBookingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MOB_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DEADLINE_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AMOUNT" type="{}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodOfBookingType", propOrder = {
    "mobcode",
    "deadlinedate",
    "listamount",
    "description"
})
public class MethodOfBookingType
    implements Serializable
{

    @XmlElement(name = "MOB_CODE", required = true)
    protected String mobcode;
    @XmlElement(name = "DEADLINE_DATE")
    protected DateType deadlinedate;
    @XmlElement(name = "LIST_AMOUNT")
    protected List<AmountType> listamount;
    @XmlElement(name = "DESCRIPTION")
    protected String description;

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
     * Gets the value of the deadlinedate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDEADLINEDATE() {
        return deadlinedate;
    }

    /**
     * Sets the value of the deadlinedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDEADLINEDATE(DateType value) {
        this.deadlinedate = value;
    }

    /**
     * Gets the value of the listamount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listamount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAMOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getLISTAMOUNT() {
        if (listamount == null) {
            listamount = new ArrayList<AmountType>();
        }
        return this.listamount;
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

}
