
package com.koreanair.eretail.pojo.hotel.hotelinputgroup;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REQUESTED_HOTEL_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUESTED_HOTEL_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIST_ROOM" type="{}REQUESTED_ROOM_TYPE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUESTED_HOTEL_TYPE", propOrder = {
    "row",
    "listroom"
})
public class REQUESTEDHOTELTYPE
    implements Serializable
{

    @XmlElement(name = "ROW", required = true)
    protected BigInteger row;
    @XmlElement(name = "LIST_ROOM", required = true)
    protected List<REQUESTEDROOMTYPE> listroom;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROW() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROW(BigInteger value) {
        this.row = value;
    }

    /**
     * Gets the value of the listroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUESTEDROOMTYPE }
     * 
     * 
     */
    public List<REQUESTEDROOMTYPE> getLISTROOM() {
        if (listroom == null) {
            listroom = new ArrayList<REQUESTEDROOMTYPE>();
        }
        return this.listroom;
    }

}
