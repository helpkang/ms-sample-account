
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.COMMERCIALFAREFAMILYType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTITINERARYMILESCOST;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommon.TRIPDURATIONRANGE;


/**
 * <p>Java class for SearchDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_DESTINATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TRIP_TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="O"/&gt;
 *               &lt;enumeration value="R"/&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="M"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARRANGE_BY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="D"/&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value="P"/&gt;
 *               &lt;enumeration value="T"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DISPLAY_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICING_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="I"/&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="O"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRIP_DURATION" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRIP_DURATION_RANGE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ITINERARY_MILES_COST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DIRECT_NON_STOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_COMMERCIAL_FARE_FAMILY" type="{}COMMERCIAL_FARE_FAMILY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_LIGHT_FARE_FAMILY" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}BOUND_TO_MODIFY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDataType", propOrder = {
    "listdestination",
    "triptype",
    "arrangeby",
    "displaytype",
    "pricingtype",
    "tripduration",
    "tripdurationrange",
    "listitinerarymilescost",
    "directnonstop",
    "listcommercialfarefamily",
    "listlightfarefamily",
    "boundtomodify"
})
public class SearchDataType
    implements Serializable
{

    @XmlElement(name = "LIST_DESTINATION")
    protected List<ListDestinationType> listdestination;
    @XmlElement(name = "TRIP_TYPE", required = true)
    protected String triptype;
    @XmlElement(name = "ARRANGE_BY")
    protected String arrangeby;
    @XmlElement(name = "DISPLAY_TYPE")
    protected BigInteger displaytype;
    @XmlElement(name = "PRICING_TYPE")
    protected String pricingtype;
    @XmlElement(name = "TRIP_DURATION")
    protected BigInteger tripduration;
    @XmlElement(name = "TRIP_DURATION_RANGE")
    protected TRIPDURATIONRANGE tripdurationrange;
    @XmlElement(name = "LIST_ITINERARY_MILES_COST")
    protected List<LISTITINERARYMILESCOST> listitinerarymilescost;
    @XmlElement(name = "DIRECT_NON_STOP")
    protected Boolean directnonstop;
    @XmlElement(name = "LIST_COMMERCIAL_FARE_FAMILY")
    protected List<COMMERCIALFAREFAMILYType> listcommercialfarefamily;
    @XmlElement(name = "LIST_LIGHT_FARE_FAMILY")
    protected List<SearchDataType.LISTLIGHTFAREFAMILY> listlightfarefamily;
    @XmlElement(name = "BOUND_TO_MODIFY")
    protected Boolean boundtomodify;

    /**
     * Gets the value of the listdestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESTINATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListDestinationType }
     * 
     * 
     */
    public List<ListDestinationType> getLISTDESTINATION() {
        if (listdestination == null) {
            listdestination = new ArrayList<ListDestinationType>();
        }
        return this.listdestination;
    }

    /**
     * Gets the value of the triptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIPTYPE() {
        return triptype;
    }

    /**
     * Sets the value of the triptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIPTYPE(String value) {
        this.triptype = value;
    }

    /**
     * Gets the value of the arrangeby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARRANGEBY() {
        return arrangeby;
    }

    /**
     * Sets the value of the arrangeby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARRANGEBY(String value) {
        this.arrangeby = value;
    }

    /**
     * Gets the value of the displaytype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDISPLAYTYPE() {
        return displaytype;
    }

    /**
     * Sets the value of the displaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDISPLAYTYPE(BigInteger value) {
        this.displaytype = value;
    }

    /**
     * Gets the value of the pricingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICINGTYPE() {
        return pricingtype;
    }

    /**
     * Sets the value of the pricingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICINGTYPE(String value) {
        this.pricingtype = value;
    }

    /**
     * Gets the value of the tripduration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRIPDURATION() {
        return tripduration;
    }

    /**
     * Sets the value of the tripduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRIPDURATION(BigInteger value) {
        this.tripduration = value;
    }

    /**
     * Gets the value of the tripdurationrange property.
     * 
     * @return
     *     possible object is
     *     {@link TRIPDURATIONRANGE }
     *     
     */
    public TRIPDURATIONRANGE getTRIPDURATIONRANGE() {
        return tripdurationrange;
    }

    /**
     * Sets the value of the tripdurationrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPDURATIONRANGE }
     *     
     */
    public void setTRIPDURATIONRANGE(TRIPDURATIONRANGE value) {
        this.tripdurationrange = value;
    }

    /**
     * Gets the value of the listitinerarymilescost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerarymilescost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARYMILESCOST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARYMILESCOST }
     * 
     * 
     */
    public List<LISTITINERARYMILESCOST> getLISTITINERARYMILESCOST() {
        if (listitinerarymilescost == null) {
            listitinerarymilescost = new ArrayList<LISTITINERARYMILESCOST>();
        }
        return this.listitinerarymilescost;
    }

    /**
     * Gets the value of the directnonstop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIRECTNONSTOP() {
        return directnonstop;
    }

    /**
     * Sets the value of the directnonstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIRECTNONSTOP(Boolean value) {
        this.directnonstop = value;
    }

    /**
     * Gets the value of the listcommercialfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommercialfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMERCIALFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMMERCIALFAREFAMILYType }
     * 
     * 
     */
    public List<COMMERCIALFAREFAMILYType> getLISTCOMMERCIALFAREFAMILY() {
        if (listcommercialfarefamily == null) {
            listcommercialfarefamily = new ArrayList<COMMERCIALFAREFAMILYType>();
        }
        return this.listcommercialfarefamily;
    }

    /**
     * Gets the value of the listlightfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlightfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLIGHTFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchDataType.LISTLIGHTFAREFAMILY }
     * 
     * 
     */
    public List<SearchDataType.LISTLIGHTFAREFAMILY> getLISTLIGHTFAREFAMILY() {
        if (listlightfarefamily == null) {
            listlightfarefamily = new ArrayList<SearchDataType.LISTLIGHTFAREFAMILY>();
        }
        return this.listlightfarefamily;
    }

    /**
     * Gets the value of the boundtomodify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOUNDTOMODIFY() {
        return boundtomodify;
    }

    /**
     * Sets the value of the boundtomodify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOUNDTOMODIFY(Boolean value) {
        this.boundtomodify = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "code"
    })
    public static class LISTLIGHTFAREFAMILY
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected Object code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCODE(Object value) {
            this.code = value;
        }

    }

}
