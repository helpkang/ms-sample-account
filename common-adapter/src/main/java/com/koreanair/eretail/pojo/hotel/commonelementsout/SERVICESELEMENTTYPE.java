
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESIMPLE;


/**
 * Facility Type - Available / Unavailable 
 * 
 * Code + Name (localised)
 * 
 * <p>Java class for SERVICES_ELEMENT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICES_ELEMENT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PROXIMITY" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *         &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICES_ELEMENT_TYPE", propOrder = {
    "included",
    "proximity",
    "quantity",
    "listdescription"
})
public class SERVICESELEMENTTYPE
    extends CODENAMETYPESIMPLE
    implements Serializable
{

    @XmlElement(name = "INCLUDED")
    protected Boolean included;
    @XmlElement(name = "PROXIMITY")
    protected CODENAMETYPESIMPLE proximity;
    @XmlElement(name = "QUANTITY")
    protected BigInteger quantity;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONMULTDESCTYPE> listdescription;

    /**
     * Gets the value of the included property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINCLUDED() {
        return included;
    }

    /**
     * Sets the value of the included property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINCLUDED(Boolean value) {
        this.included = value;
    }

    /**
     * Gets the value of the proximity property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public CODENAMETYPESIMPLE getPROXIMITY() {
        return proximity;
    }

    /**
     * Sets the value of the proximity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public void setPROXIMITY(CODENAMETYPESIMPLE value) {
        this.proximity = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQUANTITY() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQUANTITY(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the listdescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONMULTDESCTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONMULTDESCTYPE> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<DESCRIPTIONMULTDESCTYPE>();
        }
        return this.listdescription;
    }

}
