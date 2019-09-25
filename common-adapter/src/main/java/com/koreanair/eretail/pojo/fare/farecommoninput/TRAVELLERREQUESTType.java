
package com.koreanair.eretail.pojo.fare.farecommoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.traveller_information.TRAVELLERINFORMATION;


/**
 * CR3923840 Factorized for reuse for automatic ticket update
 * 
 * <p>Java class for TRAVELLER_REQUEST_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_REQUEST_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="TRAVELLER" type="{}TRAVELLER_INFORMATION"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LIST_DISCOUNT" type="{}PTC_Discount_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVELLER_REQUEST_type", propOrder = {
    "id",
    "traveller",
    "listdiscount",
    "infant"
})
public class TRAVELLERREQUESTType
    implements Serializable
{

    @XmlElement(name = "ID")
    protected Object id;
    @XmlElement(name = "TRAVELLER")
    protected TRAVELLERINFORMATION traveller;
    @XmlElement(name = "LIST_DISCOUNT")
    protected List<PTCDiscountType> listdiscount;
    @XmlElement(name = "INFANT")
    protected Boolean infant;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setID(Object value) {
        this.id = value;
    }

    /**
     * Gets the value of the traveller property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELLERINFORMATION }
     *     
     */
    public TRAVELLERINFORMATION getTRAVELLER() {
        return traveller;
    }

    /**
     * Sets the value of the traveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELLERINFORMATION }
     *     
     */
    public void setTRAVELLER(TRAVELLERINFORMATION value) {
        this.traveller = value;
    }

    /**
     * Gets the value of the listdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCDiscountType }
     * 
     * 
     */
    public List<PTCDiscountType> getLISTDISCOUNT() {
        if (listdiscount == null) {
            listdiscount = new ArrayList<PTCDiscountType>();
        }
        return this.listdiscount;
    }

    /**
     * Gets the value of the infant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINFANT() {
        return infant;
    }

    /**
     * Sets the value of the infant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINFANT(Boolean value) {
        this.infant = value;
    }

}
