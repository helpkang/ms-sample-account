
package com.koreanair.eretail.pojo.hotel.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Field with all occupancy information: number of adult, number of children and age for them.
 * 
 * <p>Java class for OCCUPANCYType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCCUPANCYType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OCCUPANCY_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OCCUPANCY_CHILD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CHILD_AGE" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCCUPANCYType", propOrder = {
    "occupancyadult",
    "occupancychild",
    "listchildage"
})
public class OCCUPANCYType
    implements Serializable
{

    @XmlElement(name = "OCCUPANCY_ADULT", defaultValue = "1")
    protected BigInteger occupancyadult;
    @XmlElement(name = "OCCUPANCY_CHILD", defaultValue = "0")
    protected BigInteger occupancychild;
    @XmlElement(name = "LIST_CHILD_AGE")
    protected List<BigInteger> listchildage;

    /**
     * Gets the value of the occupancyadult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOCCUPANCYADULT() {
        return occupancyadult;
    }

    /**
     * Sets the value of the occupancyadult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOCCUPANCYADULT(BigInteger value) {
        this.occupancyadult = value;
    }

    /**
     * Gets the value of the occupancychild property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOCCUPANCYCHILD() {
        return occupancychild;
    }

    /**
     * Sets the value of the occupancychild property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOCCUPANCYCHILD(BigInteger value) {
        this.occupancychild = value;
    }

    /**
     * Gets the value of the listchildage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listchildage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCHILDAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTCHILDAGE() {
        if (listchildage == null) {
            listchildage = new ArrayList<BigInteger>();
        }
        return this.listchildage;
    }

}
