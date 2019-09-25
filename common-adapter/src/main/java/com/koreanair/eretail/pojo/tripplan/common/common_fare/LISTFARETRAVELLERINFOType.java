
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_FARE_TRAVELLER_INFO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FARE_TRAVELLER_INFO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PTC_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IS_CUMULATIVE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_PTC" maxOccurs="2"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "LIST_FARE_TRAVELLER_INFO_Type", propOrder = {
    "travellerid",
    "isinfant",
    "discountinfo"
})
public class LISTFARETRAVELLERINFOType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected String travellerid;
    @XmlElement(name = "IS_INFANT")
    protected Boolean isinfant;
    @XmlElement(name = "DISCOUNT_INFO")
    protected LISTFARETRAVELLERINFOType.DISCOUNTINFO discountinfo;

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERID(String value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the isinfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINFANT() {
        return isinfant;
    }

    /**
     * Sets the value of the isinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINFANT(Boolean value) {
        this.isinfant = value;
    }

    /**
     * Gets the value of the discountinfo property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFARETRAVELLERINFOType.DISCOUNTINFO }
     *     
     */
    public LISTFARETRAVELLERINFOType.DISCOUNTINFO getDISCOUNTINFO() {
        return discountinfo;
    }

    /**
     * Sets the value of the discountinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFARETRAVELLERINFOType.DISCOUNTINFO }
     *     
     */
    public void setDISCOUNTINFO(LISTFARETRAVELLERINFOType.DISCOUNTINFO value) {
        this.discountinfo = value;
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
     *         &lt;element name="PTC_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IS_CUMULATIVE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_PTC" maxOccurs="2"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "ptcinfo"
    })
    public static class DISCOUNTINFO
        implements Serializable
    {

        @XmlElement(name = "PTC_INFO")
        protected LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO ptcinfo;

        /**
         * Gets the value of the ptcinfo property.
         * 
         * @return
         *     possible object is
         *     {@link LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO }
         *     
         */
        public LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO getPTCINFO() {
            return ptcinfo;
        }

        /**
         * Sets the value of the ptcinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO }
         *     
         */
        public void setPTCINFO(LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO value) {
            this.ptcinfo = value;
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
         *         &lt;element name="IS_CUMULATIVE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="LIST_PTC" maxOccurs="2"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        @XmlType(name = "", propOrder = {
            "iscumulativediscount",
            "listptc"
        })
        public static class PTCINFO
            implements Serializable
        {

            @XmlElement(name = "IS_CUMULATIVE_DISCOUNT")
            protected Boolean iscumulativediscount;
            @XmlElement(name = "LIST_PTC", required = true)
            protected List<LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO.LISTPTC> listptc;

            /**
             * Gets the value of the iscumulativediscount property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISCUMULATIVEDISCOUNT() {
                return iscumulativediscount;
            }

            /**
             * Sets the value of the iscumulativediscount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISCUMULATIVEDISCOUNT(Boolean value) {
                this.iscumulativediscount = value;
            }

            /**
             * Gets the value of the listptc property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listptc property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPTC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO.LISTPTC }
             * 
             * 
             */
            public List<LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO.LISTPTC> getLISTPTC() {
                if (listptc == null) {
                    listptc = new ArrayList<LISTFARETRAVELLERINFOType.DISCOUNTINFO.PTCINFO.LISTPTC>();
                }
                return this.listptc;
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
             *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "code",
                "name"
            })
            public static class LISTPTC
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
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

            }

        }

    }

}
