
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dual Distances - KM and MI
 * 
 * <p>Java class for DUAL_DISTANCE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DUAL_DISTANCE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_DISTANCE" type="{}DISTANCE_NODIRECTION_TYPE" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="DIRECTION" type="{}DIRECTION_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DUAL_DISTANCE_TYPE", propOrder = {
    "listdistance",
    "direction"
})
public class DUALDISTANCETYPE
    implements Serializable
{

    @XmlElement(name = "LIST_DISTANCE")
    protected List<DISTANCENODIRECTIONTYPE> listdistance;
    @XmlElement(name = "DIRECTION")
    protected DIRECTIONTYPE direction;

    /**
     * Gets the value of the listdistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISTANCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISTANCENODIRECTIONTYPE }
     * 
     * 
     */
    public List<DISTANCENODIRECTIONTYPE> getLISTDISTANCE() {
        if (listdistance == null) {
            listdistance = new ArrayList<DISTANCENODIRECTIONTYPE>();
        }
        return this.listdistance;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DIRECTIONTYPE }
     *     
     */
    public DIRECTIONTYPE getDIRECTION() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIRECTIONTYPE }
     *     
     */
    public void setDIRECTION(DIRECTIONTYPE value) {
        this.direction = value;
    }

}
