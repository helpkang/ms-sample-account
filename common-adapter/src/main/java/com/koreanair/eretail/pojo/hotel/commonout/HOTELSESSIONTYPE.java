
package com.koreanair.eretail.pojo.hotel.commonout;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents an hotel in the HotelStoreInSessionOutput. Introduced by CR2534072
 * 
 * <p>Java class for HOTEL_SESSION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_SESSION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIST_ROOM" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_SESSION_TYPE", propOrder = {
    "row",
    "listroom"
})
public class HOTELSESSIONTYPE {

    @XmlElement(name = "ROW", required = true)
    protected BigInteger row;
    @XmlElement(name = "LIST_ROOM", required = true)
    protected List<HOTELSESSIONTYPE.LISTROOM> listroom;

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
     * {@link HOTELSESSIONTYPE.LISTROOM }
     * 
     * 
     */
    public List<HOTELSESSIONTYPE.LISTROOM> getLISTROOM() {
        if (listroom == null) {
            listroom = new ArrayList<HOTELSESSIONTYPE.LISTROOM>();
        }
        return this.listroom;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "row"
    })
    public static class LISTROOM {

        @XmlElement(name = "ROW", required = true)
        protected BigInteger row;

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

    }

}
