
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESTRICT;


/**
 * Hotel type: complex type
 * 
 * <p>Java class for HOTEL_TYPE_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_TYPE_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMPANY" type="{}COMPANY_TYPE_1"/&gt;
 *         &lt;element name="HOTEL" type="{}HOTEL_SIMPLE_TYPE"/&gt;
 *         &lt;element name="AREA" type="{}HTL_AREA_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TRANSPORTATION" type="{}TRANSPORTATION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_IN_POLICY" type="{}CHECK_IN_POLICY_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="RATE_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CORPORATE_ID_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEATURE_TO_CHECK" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_RATE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GEOCODE" type="{}GEOCODE_TYPE_STRING" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}CODE_NAME_TYPE_STRICT"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE_DETAIL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "HOTEL_TYPE_1", propOrder = {
    "company",
    "hotel",
    "area",
    "transportation",
    "checkinpolicy",
    "ratechange",
    "corporateidrequired",
    "listfeaturetocheck",
    "listrate",
    "geocode",
    "category",
    "type"
})
public class HOTELTYPE1
    implements Serializable
{

    @XmlElement(name = "COMPANY", required = true)
    protected COMPANYTYPE1 company;
    @XmlElement(name = "HOTEL", required = true)
    protected HOTELSIMPLETYPE hotel;
    @XmlElement(name = "AREA")
    protected HTLAREATYPE area;
    @XmlElement(name = "TRANSPORTATION")
    protected TRANSPORTATIONTYPE transportation;
    @XmlElement(name = "CHECK_IN_POLICY")
    protected CHECKINPOLICYTYPE checkinpolicy;
    @XmlElement(name = "RATE_CHANGE")
    protected Boolean ratechange;
    @XmlElement(name = "CORPORATE_ID_REQUIRED")
    protected Boolean corporateidrequired;
    @XmlElement(name = "LIST_FEATURE_TO_CHECK")
    protected List<String> listfeaturetocheck;
    @XmlElement(name = "LIST_RATE")
    protected List<LISTRATE> listrate;
    @XmlElement(name = "GEOCODE")
    protected GEOCODETYPESTRING geocode;
    @XmlElement(name = "CATEGORY")
    protected CODENAMETYPESTRICT category;
    @XmlElement(name = "TYPE")
    protected HOTELTYPE1 .TYPE type;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link COMPANYTYPE1 }
     *     
     */
    public COMPANYTYPE1 getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPANYTYPE1 }
     *     
     */
    public void setCOMPANY(COMPANYTYPE1 value) {
        this.company = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELSIMPLETYPE }
     *     
     */
    public HOTELSIMPLETYPE getHOTEL() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELSIMPLETYPE }
     *     
     */
    public void setHOTEL(HOTELSIMPLETYPE value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link HTLAREATYPE }
     *     
     */
    public HTLAREATYPE getAREA() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLAREATYPE }
     *     
     */
    public void setAREA(HTLAREATYPE value) {
        this.area = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSPORTATIONTYPE }
     *     
     */
    public TRANSPORTATIONTYPE getTRANSPORTATION() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSPORTATIONTYPE }
     *     
     */
    public void setTRANSPORTATION(TRANSPORTATIONTYPE value) {
        this.transportation = value;
    }

    /**
     * Gets the value of the checkinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CHECKINPOLICYTYPE }
     *     
     */
    public CHECKINPOLICYTYPE getCHECKINPOLICY() {
        return checkinpolicy;
    }

    /**
     * Sets the value of the checkinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHECKINPOLICYTYPE }
     *     
     */
    public void setCHECKINPOLICY(CHECKINPOLICYTYPE value) {
        this.checkinpolicy = value;
    }

    /**
     * Gets the value of the ratechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRATECHANGE() {
        return ratechange;
    }

    /**
     * Sets the value of the ratechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRATECHANGE(Boolean value) {
        this.ratechange = value;
    }

    /**
     * Gets the value of the corporateidrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCORPORATEIDREQUIRED() {
        return corporateidrequired;
    }

    /**
     * Sets the value of the corporateidrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCORPORATEIDREQUIRED(Boolean value) {
        this.corporateidrequired = value;
    }

    /**
     * Gets the value of the listfeaturetocheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfeaturetocheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEATURETOCHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFEATURETOCHECK() {
        if (listfeaturetocheck == null) {
            listfeaturetocheck = new ArrayList<String>();
        }
        return this.listfeaturetocheck;
    }

    /**
     * Gets the value of the listrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRATE }
     * 
     * 
     */
    public List<LISTRATE> getLISTRATE() {
        if (listrate == null) {
            listrate = new ArrayList<LISTRATE>();
        }
        return this.listrate;
    }

    /**
     * Gets the value of the geocode property.
     * 
     * @return
     *     possible object is
     *     {@link GEOCODETYPESTRING }
     *     
     */
    public GEOCODETYPESTRING getGEOCODE() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEOCODETYPESTRING }
     *     
     */
    public void setGEOCODE(GEOCODETYPESTRING value) {
        this.geocode = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setCATEGORY(CODENAMETYPESTRICT value) {
        this.category = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELTYPE1 .TYPE }
     *     
     */
    public HOTELTYPE1 .TYPE getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELTYPE1 .TYPE }
     *     
     */
    public void setTYPE(HOTELTYPE1 .TYPE value) {
        this.type = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}CODE_NAME_TYPE_STRICT"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE_DETAIL" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "codedetail"
    })
    public static class TYPE
        extends CODENAMETYPESTRICT
        implements Serializable
    {

        @XmlElement(name = "CODE_DETAIL")
        protected String codedetail;

        /**
         * Gets the value of the codedetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODEDETAIL() {
            return codedetail;
        }

        /**
         * Sets the value of the codedetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODEDETAIL(String value) {
            this.codedetail = value;
        }

    }

}
