
package com.koreanair.external.eretail.vo.hotel.commonout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.AVAILABILITYSTATUSTYPE;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.CATEGORYTYPE;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.COMPANYTYPE1;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.DISTANCETYPE;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.GEOCODETYPE;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.HOTELSIMPLETYPESTANDARD;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.HTLAREATYPE;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.HTLPOLICIESTYPE;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.IATATYPE;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.PRICINGINFORMATIONType;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.PRODUCTCONDITIONSType;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.TRANSPORTATIONTYPE;


/**
 * This XSD type is used to represent a dupe hotel. It contains less information than other hotel types. It does not contain any content information.
 * 
 * <p>Java class for HOTEL_DUPE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_DUPE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMPANY" type="{}COMPANY_TYPE_1"/&gt;
 *         &lt;element name="HOTEL" type="{}HOTEL_SIMPLE_TYPE_STANDARD"/&gt;
 *         &lt;element ref="{}POLICIES" minOccurs="0"/&gt;
 *         &lt;element name="IATA_ATTACHED" type="{}IATA_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{}CATEGORY_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="DISTANCE" type="{}DISTANCE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="GEOCODE" type="{}GEOCODE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="AREA" type="{}HTL_AREA_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TRANSPORTATION" type="{}TRANSPORTATION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="SOURCE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="DISTRIBUTION"/&gt;
 *               &lt;enumeration value="LEISURE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_ONE_STEP_CMT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PRICING_INFORMATION" type="{}PRICING_INFORMATIONType" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_STATUS" type="{}AVAILABILITY_STATUS_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_INFO_NOT_TRUSTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}BEST_AVAILABLE_RATE" minOccurs="0"/&gt;
 *         &lt;element name="USER_CONSTRAINTS_NOT_RESPECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCT_CONDITIONS" type="{}PRODUCT_CONDITIONSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_DUPE_TYPE", propOrder = {
    "company",
    "hotel",
    "policies",
    "iataattached",
    "category",
    "distance",
    "geocode",
    "area",
    "transportation",
    "source",
    "isonestepcmt",
    "pricinginformation",
    "availabilitystatus",
    "hotelinfonottrusted",
    "bestavailablerate",
    "userconstraintsnotrespected",
    "productconditions"
})
@XmlSeeAlso({
    HOTELHBPTYPE.class
})
public class HOTELDUPETYPE {

    @XmlElement(name = "COMPANY", required = true)
    protected COMPANYTYPE1 company;
    @XmlElement(name = "HOTEL", required = true)
    protected HOTELSIMPLETYPESTANDARD hotel;
    @XmlElement(name = "POLICIES")
    protected HTLPOLICIESTYPE policies;
    @XmlElement(name = "IATA_ATTACHED")
    protected IATATYPE iataattached;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYTYPE category;
    @XmlElement(name = "DISTANCE")
    protected DISTANCETYPE distance;
    @XmlElement(name = "GEOCODE")
    protected GEOCODETYPE geocode;
    @XmlElement(name = "AREA")
    protected HTLAREATYPE area;
    @XmlElement(name = "TRANSPORTATION")
    protected TRANSPORTATIONTYPE transportation;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "IS_ONE_STEP_CMT")
    protected Boolean isonestepcmt;
    @XmlElement(name = "PRICING_INFORMATION")
    protected PRICINGINFORMATIONType pricinginformation;
    @XmlElement(name = "AVAILABILITY_STATUS")
    protected AVAILABILITYSTATUSTYPE availabilitystatus;
    @XmlElement(name = "HOTEL_INFO_NOT_TRUSTED")
    protected Boolean hotelinfonottrusted;
    @XmlElement(name = "BEST_AVAILABLE_RATE")
    protected Boolean bestavailablerate;
    @XmlElement(name = "USER_CONSTRAINTS_NOT_RESPECTED")
    protected Boolean userconstraintsnotrespected;
    @XmlElement(name = "PRODUCT_CONDITIONS")
    protected PRODUCTCONDITIONSType productconditions;

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
     *     {@link HOTELSIMPLETYPESTANDARD }
     *     
     */
    public HOTELSIMPLETYPESTANDARD getHOTEL() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELSIMPLETYPESTANDARD }
     *     
     */
    public void setHOTEL(HOTELSIMPLETYPESTANDARD value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link HTLPOLICIESTYPE }
     *     
     */
    public HTLPOLICIESTYPE getPOLICIES() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLPOLICIESTYPE }
     *     
     */
    public void setPOLICIES(HTLPOLICIESTYPE value) {
        this.policies = value;
    }

    /**
     * Gets the value of the iataattached property.
     * 
     * @return
     *     possible object is
     *     {@link IATATYPE }
     *     
     */
    public IATATYPE getIATAATTACHED() {
        return iataattached;
    }

    /**
     * Sets the value of the iataattached property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATATYPE }
     *     
     */
    public void setIATAATTACHED(IATATYPE value) {
        this.iataattached = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYTYPE }
     *     
     */
    public CATEGORYTYPE getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYTYPE }
     *     
     */
    public void setCATEGORY(CATEGORYTYPE value) {
        this.category = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link DISTANCETYPE }
     *     
     */
    public DISTANCETYPE getDISTANCE() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISTANCETYPE }
     *     
     */
    public void setDISTANCE(DISTANCETYPE value) {
        this.distance = value;
    }

    /**
     * Gets the value of the geocode property.
     * 
     * @return
     *     possible object is
     *     {@link GEOCODETYPE }
     *     
     */
    public GEOCODETYPE getGEOCODE() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEOCODETYPE }
     *     
     */
    public void setGEOCODE(GEOCODETYPE value) {
        this.geocode = value;
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the isonestepcmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISONESTEPCMT() {
        return isonestepcmt;
    }

    /**
     * Sets the value of the isonestepcmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISONESTEPCMT(Boolean value) {
        this.isonestepcmt = value;
    }

    /**
     * Gets the value of the pricinginformation property.
     * 
     * @return
     *     possible object is
     *     {@link PRICINGINFORMATIONType }
     *     
     */
    public PRICINGINFORMATIONType getPRICINGINFORMATION() {
        return pricinginformation;
    }

    /**
     * Sets the value of the pricinginformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICINGINFORMATIONType }
     *     
     */
    public void setPRICINGINFORMATION(PRICINGINFORMATIONType value) {
        this.pricinginformation = value;
    }

    /**
     * Gets the value of the availabilitystatus property.
     * 
     * @return
     *     possible object is
     *     {@link AVAILABILITYSTATUSTYPE }
     *     
     */
    public AVAILABILITYSTATUSTYPE getAVAILABILITYSTATUS() {
        return availabilitystatus;
    }

    /**
     * Sets the value of the availabilitystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVAILABILITYSTATUSTYPE }
     *     
     */
    public void setAVAILABILITYSTATUS(AVAILABILITYSTATUSTYPE value) {
        this.availabilitystatus = value;
    }

    /**
     * Gets the value of the hotelinfonottrusted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOTELINFONOTTRUSTED() {
        return hotelinfonottrusted;
    }

    /**
     * Sets the value of the hotelinfonottrusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOTELINFONOTTRUSTED(Boolean value) {
        this.hotelinfonottrusted = value;
    }

    /**
     * Gets the value of the bestavailablerate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBESTAVAILABLERATE() {
        return bestavailablerate;
    }

    /**
     * Sets the value of the bestavailablerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBESTAVAILABLERATE(Boolean value) {
        this.bestavailablerate = value;
    }

    /**
     * Gets the value of the userconstraintsnotrespected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSERCONSTRAINTSNOTRESPECTED() {
        return userconstraintsnotrespected;
    }

    /**
     * Sets the value of the userconstraintsnotrespected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSERCONSTRAINTSNOTRESPECTED(Boolean value) {
        this.userconstraintsnotrespected = value;
    }

    /**
     * Gets the value of the productconditions property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTCONDITIONSType }
     *     
     */
    public PRODUCTCONDITIONSType getPRODUCTCONDITIONS() {
        return productconditions;
    }

    /**
     * Sets the value of the productconditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTCONDITIONSType }
     *     
     */
    public void setPRODUCTCONDITIONS(PRODUCTCONDITIONSType value) {
        this.productconditions = value;
    }

}
