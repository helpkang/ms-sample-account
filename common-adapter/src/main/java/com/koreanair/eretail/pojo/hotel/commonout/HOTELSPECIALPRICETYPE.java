
package com.koreanair.eretail.pojo.hotel.commonout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.eretail.pojo.hotel.common.OCCUPANCYType;
import com.koreanair.eretail.pojo.hotel.commonelementsout.ROOMTYPE1;
import com.koreanair.eretail.pojo.hotel.commonelementsout.TOTALPRICINGSimpleType;


/**
 * This type contains all special prices for an hotel. Special prices are bestPrice and worst price. Those data are returned for each hotel, for each occupancy and for each roomType.
 * 
 * <p>Java class for HOTEL_SPECIAL_PRICE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_SPECIAL_PRICE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ROOM_TYPE"/&gt;
 *         &lt;element name="GDS_ROOM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OCCUPANCY" type="{}OCCUPANCYType"/&gt;
 *         &lt;element name="BEST_PRICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRICES" type="{}TOTAL_PRICINGSimpleType"/&gt;
 *                   &lt;element name="BOOKING_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_START" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_END" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WORST_PRICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRICES" type="{}TOTAL_PRICINGSimpleType"/&gt;
 *                   &lt;element name="DATE_START" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_END" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "HOTEL_SPECIAL_PRICE_TYPE", propOrder = {
    "roomtype",
    "gdsroomtype",
    "occupancy",
    "bestprice",
    "worstprice"
})
public class HOTELSPECIALPRICETYPE {

    @XmlElement(name = "ROOM_TYPE", required = true)
    protected ROOMTYPE1 roomtype;
    @XmlElement(name = "GDS_ROOM_TYPE", required = true)
    protected String gdsroomtype;
    @XmlElement(name = "OCCUPANCY", required = true)
    protected OCCUPANCYType occupancy;
    @XmlElement(name = "BEST_PRICE")
    protected HOTELSPECIALPRICETYPE.BESTPRICE bestprice;
    @XmlElement(name = "WORST_PRICE")
    protected HOTELSPECIALPRICETYPE.WORSTPRICE worstprice;

    /**
     * Gets the value of the roomtype property.
     * 
     * @return
     *     possible object is
     *     {@link ROOMTYPE1 }
     *     
     */
    public ROOMTYPE1 getROOMTYPE() {
        return roomtype;
    }

    /**
     * Sets the value of the roomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROOMTYPE1 }
     *     
     */
    public void setROOMTYPE(ROOMTYPE1 value) {
        this.roomtype = value;
    }

    /**
     * Gets the value of the gdsroomtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSROOMTYPE() {
        return gdsroomtype;
    }

    /**
     * Sets the value of the gdsroomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSROOMTYPE(String value) {
        this.gdsroomtype = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link OCCUPANCYType }
     *     
     */
    public OCCUPANCYType getOCCUPANCY() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCCUPANCYType }
     *     
     */
    public void setOCCUPANCY(OCCUPANCYType value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the bestprice property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELSPECIALPRICETYPE.BESTPRICE }
     *     
     */
    public HOTELSPECIALPRICETYPE.BESTPRICE getBESTPRICE() {
        return bestprice;
    }

    /**
     * Sets the value of the bestprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELSPECIALPRICETYPE.BESTPRICE }
     *     
     */
    public void setBESTPRICE(HOTELSPECIALPRICETYPE.BESTPRICE value) {
        this.bestprice = value;
    }

    /**
     * Gets the value of the worstprice property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELSPECIALPRICETYPE.WORSTPRICE }
     *     
     */
    public HOTELSPECIALPRICETYPE.WORSTPRICE getWORSTPRICE() {
        return worstprice;
    }

    /**
     * Sets the value of the worstprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELSPECIALPRICETYPE.WORSTPRICE }
     *     
     */
    public void setWORSTPRICE(HOTELSPECIALPRICETYPE.WORSTPRICE value) {
        this.worstprice = value;
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
     *         &lt;element name="PRICES" type="{}TOTAL_PRICINGSimpleType"/&gt;
     *         &lt;element name="BOOKING_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DATE_START" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="DATE_END" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "prices",
        "bookingcode",
        "datestart",
        "dateend"
    })
    public static class BESTPRICE {

        @XmlElement(name = "PRICES", required = true)
        protected TOTALPRICINGSimpleType prices;
        @XmlElement(name = "BOOKING_CODE")
        protected String bookingcode;
        @XmlElement(name = "DATE_START")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datestart;
        @XmlElement(name = "DATE_END")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateend;

        /**
         * Gets the value of the prices property.
         * 
         * @return
         *     possible object is
         *     {@link TOTALPRICINGSimpleType }
         *     
         */
        public TOTALPRICINGSimpleType getPRICES() {
            return prices;
        }

        /**
         * Sets the value of the prices property.
         * 
         * @param value
         *     allowed object is
         *     {@link TOTALPRICINGSimpleType }
         *     
         */
        public void setPRICES(TOTALPRICINGSimpleType value) {
            this.prices = value;
        }

        /**
         * Gets the value of the bookingcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOOKINGCODE() {
            return bookingcode;
        }

        /**
         * Sets the value of the bookingcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOOKINGCODE(String value) {
            this.bookingcode = value;
        }

        /**
         * Gets the value of the datestart property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATESTART() {
            return datestart;
        }

        /**
         * Sets the value of the datestart property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATESTART(XMLGregorianCalendar value) {
            this.datestart = value;
        }

        /**
         * Gets the value of the dateend property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATEEND() {
            return dateend;
        }

        /**
         * Sets the value of the dateend property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATEEND(XMLGregorianCalendar value) {
            this.dateend = value;
        }

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
     *         &lt;element name="PRICES" type="{}TOTAL_PRICINGSimpleType"/&gt;
     *         &lt;element name="DATE_START" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="DATE_END" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "prices",
        "datestart",
        "dateend"
    })
    public static class WORSTPRICE {

        @XmlElement(name = "PRICES", required = true)
        protected TOTALPRICINGSimpleType prices;
        @XmlElement(name = "DATE_START")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datestart;
        @XmlElement(name = "DATE_END")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateend;

        /**
         * Gets the value of the prices property.
         * 
         * @return
         *     possible object is
         *     {@link TOTALPRICINGSimpleType }
         *     
         */
        public TOTALPRICINGSimpleType getPRICES() {
            return prices;
        }

        /**
         * Sets the value of the prices property.
         * 
         * @param value
         *     allowed object is
         *     {@link TOTALPRICINGSimpleType }
         *     
         */
        public void setPRICES(TOTALPRICINGSimpleType value) {
            this.prices = value;
        }

        /**
         * Gets the value of the datestart property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATESTART() {
            return datestart;
        }

        /**
         * Sets the value of the datestart property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATESTART(XMLGregorianCalendar value) {
            this.datestart = value;
        }

        /**
         * Gets the value of the dateend property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATEEND() {
            return dateend;
        }

        /**
         * Sets the value of the dateend property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATEEND(XMLGregorianCalendar value) {
            this.dateend = value;
        }

    }

}
