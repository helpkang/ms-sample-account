
package com.koreanair.external.eretail.vo.air.commonout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the type of the cabin of the flight.
 * 
 * <p>Java class for AWARD_FLIGHT_CABIN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWARD_FLIGHT_CABIN_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABIN" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_RBD" type="{}RBD_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWARD_FLIGHT_CABIN_Type", propOrder = {
    "cabin",
    "status",
    "listrbd"
})
public class AWARDFLIGHTCABINType
    implements Serializable
{

    @XmlElement(name = "CABIN", required = true)
    protected String cabin;
    @XmlElement(name = "STATUS", required = true)
    protected String status;
    @XmlElement(name = "LIST_RBD", required = true)
    protected List<RBDType> listrbd;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABIN() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABIN(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the listrbd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrbd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRBD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RBDType }
     * 
     * 
     */
    public List<RBDType> getLISTRBD() {
        if (listrbd == null) {
            listrbd = new ArrayList<RBDType>();
        }
        return this.listrbd;
    }

}
