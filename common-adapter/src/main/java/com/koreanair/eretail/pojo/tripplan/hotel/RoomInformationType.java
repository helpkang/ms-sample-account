
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}InternalRoomInformationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HOLD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIVATE_ON_REQUEST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PASSENGER_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}InternalPassengerInformationType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OCCUPANCY_ADULT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="OCCUPANCY_CHILD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CHILD_AGE" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomInformationType", propOrder = {
    "holdid",
    "privateonrequest",
    "passengerinfo"
})
public class RoomInformationType
    extends InternalRoomInformationType
    implements Serializable
{

    @XmlElement(name = "HOLD_ID")
    protected String holdid;
    @XmlElement(name = "PRIVATE_ON_REQUEST")
    protected Boolean privateonrequest;
    @XmlElement(name = "PASSENGER_INFO")
    protected RoomInformationType.PASSENGERINFO passengerinfo;

    /**
     * Gets the value of the holdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLDID() {
        return holdid;
    }

    /**
     * Sets the value of the holdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLDID(String value) {
        this.holdid = value;
    }

    /**
     * Gets the value of the privateonrequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRIVATEONREQUEST() {
        return privateonrequest;
    }

    /**
     * Sets the value of the privateonrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRIVATEONREQUEST(Boolean value) {
        this.privateonrequest = value;
    }

    /**
     * Gets the value of the passengerinfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoomInformationType.PASSENGERINFO }
     *     
     */
    public RoomInformationType.PASSENGERINFO getPASSENGERINFO() {
        return passengerinfo;
    }

    /**
     * Sets the value of the passengerinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomInformationType.PASSENGERINFO }
     *     
     */
    public void setPASSENGERINFO(RoomInformationType.PASSENGERINFO value) {
        this.passengerinfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}InternalPassengerInformationType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OCCUPANCY_ADULT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="OCCUPANCY_CHILD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CHILD_AGE" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "occupancyadult",
        "occupancychild",
        "listchildage"
    })
    public static class PASSENGERINFO
        extends InternalPassengerInformationType
        implements Serializable
    {

        @XmlElement(name = "OCCUPANCY_ADULT")
        protected Integer occupancyadult;
        @XmlElement(name = "OCCUPANCY_CHILD")
        protected Integer occupancychild;
        @XmlElement(name = "LIST_CHILD_AGE", type = Integer.class)
        protected List<Integer> listchildage;

        /**
         * Gets the value of the occupancyadult property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOCCUPANCYADULT() {
            return occupancyadult;
        }

        /**
         * Sets the value of the occupancyadult property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOCCUPANCYADULT(Integer value) {
            this.occupancyadult = value;
        }

        /**
         * Gets the value of the occupancychild property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOCCUPANCYCHILD() {
            return occupancychild;
        }

        /**
         * Sets the value of the occupancychild property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOCCUPANCYCHILD(Integer value) {
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
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getLISTCHILDAGE() {
            if (listchildage == null) {
                listchildage = new ArrayList<Integer>();
            }
            return this.listchildage;
        }

    }

}
