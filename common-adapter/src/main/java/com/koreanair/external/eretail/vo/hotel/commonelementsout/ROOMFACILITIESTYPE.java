
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROOM_FACILITIES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROOM_FACILITIES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_GUEST_ROOM" type="{}GUEST_ROOM_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MAX_OCCUPANCY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROOM_FACILITIES_TYPE", propOrder = {
    "listguestroom",
    "maxoccupancy"
})
public class ROOMFACILITIESTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_GUEST_ROOM")
    protected List<GUESTROOMTYPE> listguestroom;
    @XmlElement(name = "MAX_OCCUPANCY")
    protected BigInteger maxoccupancy;

    /**
     * Gets the value of the listguestroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listguestroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGUESTROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GUESTROOMTYPE }
     * 
     * 
     */
    public List<GUESTROOMTYPE> getLISTGUESTROOM() {
        if (listguestroom == null) {
            listguestroom = new ArrayList<GUESTROOMTYPE>();
        }
        return this.listguestroom;
    }

    /**
     * Gets the value of the maxoccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMAXOCCUPANCY() {
        return maxoccupancy;
    }

    /**
     * Sets the value of the maxoccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMAXOCCUPANCY(BigInteger value) {
        this.maxoccupancy = value;
    }

}
