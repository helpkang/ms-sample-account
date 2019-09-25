
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESIMPLE;


/**
 * <p>Java class for MEETING_ROOM_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MEETING_ROOM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAPACITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DIMENSION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UNIT" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ROOM_CONFIGURATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *                   &lt;element name="MAX_OCCUPANCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FACILITY" type="{}FACILITY_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEETING_ROOM_TYPE", propOrder = {
    "capacity",
    "name",
    "listdescription",
    "dimension",
    "listroomconfiguration",
    "listfacility"
})
public class MEETINGROOMTYPE
    implements Serializable
{

    @XmlElement(name = "CAPACITY")
    protected String capacity;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONMULTDESCTYPE> listdescription;
    @XmlElement(name = "DIMENSION")
    protected MEETINGROOMTYPE.DIMENSION dimension;
    @XmlElement(name = "LIST_ROOM_CONFIGURATION")
    protected List<MEETINGROOMTYPE.LISTROOMCONFIGURATION> listroomconfiguration;
    @XmlElement(name = "LIST_FACILITY")
    protected List<FACILITYTYPE> listfacility;

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACITY() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACITY(String value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
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

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link MEETINGROOMTYPE.DIMENSION }
     *     
     */
    public MEETINGROOMTYPE.DIMENSION getDIMENSION() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEETINGROOMTYPE.DIMENSION }
     *     
     */
    public void setDIMENSION(MEETINGROOMTYPE.DIMENSION value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the listroomconfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroomconfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOMCONFIGURATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MEETINGROOMTYPE.LISTROOMCONFIGURATION }
     * 
     * 
     */
    public List<MEETINGROOMTYPE.LISTROOMCONFIGURATION> getLISTROOMCONFIGURATION() {
        if (listroomconfiguration == null) {
            listroomconfiguration = new ArrayList<MEETINGROOMTYPE.LISTROOMCONFIGURATION>();
        }
        return this.listroomconfiguration;
    }

    /**
     * Gets the value of the listfacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFACILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FACILITYTYPE }
     * 
     * 
     */
    public List<FACILITYTYPE> getLISTFACILITY() {
        if (listfacility == null) {
            listfacility = new ArrayList<FACILITYTYPE>();
        }
        return this.listfacility;
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
     *         &lt;element name="AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UNIT" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
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
        "area",
        "height",
        "length",
        "width",
        "unit"
    })
    public static class DIMENSION
        implements Serializable
    {

        @XmlElement(name = "AREA")
        protected String area;
        @XmlElement(name = "HEIGHT")
        protected String height;
        @XmlElement(name = "LENGTH")
        protected String length;
        @XmlElement(name = "WIDTH")
        protected String width;
        @XmlElement(name = "UNIT")
        protected CODENAMETYPESIMPLE unit;

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAREA() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAREA(String value) {
            this.area = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHEIGHT() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHEIGHT(String value) {
            this.height = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLENGTH() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLENGTH(String value) {
            this.length = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWIDTH() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWIDTH(String value) {
            this.width = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public CODENAMETYPESIMPLE getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public void setUNIT(CODENAMETYPESIMPLE value) {
            this.unit = value;
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
     *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
     *         &lt;element name="MAX_OCCUPANCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "type",
        "maxoccupancy"
    })
    public static class LISTROOMCONFIGURATION
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected CODENAMETYPESIMPLE type;
        @XmlElement(name = "MAX_OCCUPANCY")
        protected String maxoccupancy;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public CODENAMETYPESIMPLE getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public void setTYPE(CODENAMETYPESIMPLE value) {
            this.type = value;
        }

        /**
         * Gets the value of the maxoccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAXOCCUPANCY() {
            return maxoccupancy;
        }

        /**
         * Sets the value of the maxoccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAXOCCUPANCY(String value) {
            this.maxoccupancy = value;
        }

    }

}
