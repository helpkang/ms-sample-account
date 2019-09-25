
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_TYPEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_TYPEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MOB_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DEADLINE_DATE" type="{}dateType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AMOUNT" type="{}AMOUNT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MOB_TYPEType", propOrder = {
    "mobcode",
    "deadlinedate",
    "listamount",
    "description"
})
public class MOBTYPEType
    implements Serializable
{

    @XmlElement(name = "MOB_CODE", required = true)
    protected String mobcode;
    @XmlElement(name = "DEADLINE_DATE")
    protected String deadlinedate;
    @XmlElement(name = "LIST_AMOUNT")
    protected List<AMOUNTTYPE> listamount;
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
     *     {@link String }
     *     
     */
    public String getDEADLINEDATE() {
        return deadlinedate;
    }

    /**
     * Sets the value of the deadlinedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEADLINEDATE(String value) {
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
     * {@link AMOUNTTYPE }
     * 
     * 
     */
    public List<AMOUNTTYPE> getLISTAMOUNT() {
        if (listamount == null) {
            listamount = new ArrayList<AMOUNTTYPE>();
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
