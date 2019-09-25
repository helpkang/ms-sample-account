
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type"/&gt;
 *         &lt;element name="TRAIN_NUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="B_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="B_PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="E_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="E_PLATFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="E_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EQUIPMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SERVICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MEAL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;enumeration value="P"/&gt;
 *                         &lt;enumeration value="M"/&gt;
 *                         &lt;enumeration value="D"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE_SUPPLEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_Type" minOccurs="0"/&gt;
 *         &lt;element name="RESERVATION_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RESERVATION_POSSIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RESERVATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEASON_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CABIN" type="{}TRAIN_CABIN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_SEAT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CARRIAGE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COMPARTMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COMPARTMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COMPARTMENT_SIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SEAT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MEAL" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_SEATING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
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
 *         &lt;element name="CLOSE_TO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WAGON_NUMBER" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="SEAT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="E_TICKETING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}DISPLAY_RANK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENT_Type", propOrder = {
    "traincompany",
    "trainnumber",
    "blocation",
    "bplatform",
    "elocation",
    "eplatform",
    "bdate",
    "edate",
    "equipment",
    "listservice",
    "meal",
    "pricesupplement",
    "traincabin",
    "reservationmandatory",
    "reservationpossible",
    "reservationtype",
    "seasoninformation",
    "listcabin",
    "listtravellerseat",
    "closeto",
    "segmentid",
    "eticketing",
    "displayrank"
})
public class SEGMENTType
    implements Serializable
{

    @XmlElement(name = "TRAIN_COMPANY", required = true)
    protected TRAINCOMPANYType traincompany;
    @XmlElement(name = "TRAIN_NUMBER", required = true)
    protected String trainnumber;
    @XmlElement(name = "B_LOCATION", required = true)
    protected RAILLOCATIONType blocation;
    @XmlElement(name = "B_PLATFORM")
    protected String bplatform;
    @XmlElement(name = "E_LOCATION", required = true)
    protected RAILLOCATIONType elocation;
    @XmlElement(name = "E_PLATFORM")
    protected String eplatform;
    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected String edate;
    @XmlElement(name = "EQUIPMENT")
    protected SEGMENTType.EQUIPMENT equipment;
    @XmlElement(name = "LIST_SERVICE")
    protected List<SEGMENTType.LISTSERVICE> listservice;
    @XmlElement(name = "MEAL")
    protected SEGMENTType.MEAL meal;
    @XmlElement(name = "PRICE_SUPPLEMENT")
    protected String pricesupplement;
    @XmlElement(name = "TRAIN_CABIN")
    protected TRAINCABINType traincabin;
    @XmlElement(name = "RESERVATION_MANDATORY")
    protected Boolean reservationmandatory;
    @XmlElement(name = "RESERVATION_POSSIBLE")
    protected Boolean reservationpossible;
    @XmlElement(name = "RESERVATION_TYPE")
    protected String reservationtype;
    @XmlElement(name = "SEASON_INFORMATION")
    protected String seasoninformation;
    @XmlElement(name = "LIST_CABIN")
    protected List<TRAINCABINType> listcabin;
    @XmlElement(name = "LIST_TRAVELLER_SEAT")
    protected List<SEGMENTType.LISTTRAVELLERSEAT> listtravellerseat;
    @XmlElement(name = "CLOSE_TO")
    protected SEGMENTType.CLOSETO closeto;
    @XmlElement(name = "SEGMENT_ID")
    protected Object segmentid;
    @XmlElement(name = "E_TICKETING")
    protected Boolean eticketing;
    @XmlElement(name = "DISPLAY_RANK")
    protected String displayrank;

    /**
     * Gets the value of the traincompany property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINCOMPANYType }
     *     
     */
    public TRAINCOMPANYType getTRAINCOMPANY() {
        return traincompany;
    }

    /**
     * Sets the value of the traincompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINCOMPANYType }
     *     
     */
    public void setTRAINCOMPANY(TRAINCOMPANYType value) {
        this.traincompany = value;
    }

    /**
     * Gets the value of the trainnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAINNUMBER() {
        return trainnumber;
    }

    /**
     * Sets the value of the trainnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAINNUMBER(String value) {
        this.trainnumber = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setBLOCATION(RAILLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the bplatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPLATFORM() {
        return bplatform;
    }

    /**
     * Sets the value of the bplatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPLATFORM(String value) {
        this.bplatform = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setELOCATION(RAILLOCATIONType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the eplatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPLATFORM() {
        return eplatform;
    }

    /**
     * Sets the value of the eplatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPLATFORM(String value) {
        this.eplatform = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDATE(String value) {
        this.edate = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link SEGMENTType.EQUIPMENT }
     *     
     */
    public SEGMENTType.EQUIPMENT getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEGMENTType.EQUIPMENT }
     *     
     */
    public void setEQUIPMENT(SEGMENTType.EQUIPMENT value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the listservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTType.LISTSERVICE }
     * 
     * 
     */
    public List<SEGMENTType.LISTSERVICE> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<SEGMENTType.LISTSERVICE>();
        }
        return this.listservice;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link SEGMENTType.MEAL }
     *     
     */
    public SEGMENTType.MEAL getMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEGMENTType.MEAL }
     *     
     */
    public void setMEAL(SEGMENTType.MEAL value) {
        this.meal = value;
    }

    /**
     * Gets the value of the pricesupplement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICESUPPLEMENT() {
        return pricesupplement;
    }

    /**
     * Sets the value of the pricesupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICESUPPLEMENT(String value) {
        this.pricesupplement = value;
    }

    /**
     * Gets the value of the traincabin property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINCABINType }
     *     
     */
    public TRAINCABINType getTRAINCABIN() {
        return traincabin;
    }

    /**
     * Sets the value of the traincabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINCABINType }
     *     
     */
    public void setTRAINCABIN(TRAINCABINType value) {
        this.traincabin = value;
    }

    /**
     * Gets the value of the reservationmandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESERVATIONMANDATORY() {
        return reservationmandatory;
    }

    /**
     * Sets the value of the reservationmandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESERVATIONMANDATORY(Boolean value) {
        this.reservationmandatory = value;
    }

    /**
     * Gets the value of the reservationpossible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESERVATIONPOSSIBLE() {
        return reservationpossible;
    }

    /**
     * Sets the value of the reservationpossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESERVATIONPOSSIBLE(Boolean value) {
        this.reservationpossible = value;
    }

    /**
     * Gets the value of the reservationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVATIONTYPE() {
        return reservationtype;
    }

    /**
     * Sets the value of the reservationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVATIONTYPE(String value) {
        this.reservationtype = value;
    }

    /**
     * Gets the value of the seasoninformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEASONINFORMATION() {
        return seasoninformation;
    }

    /**
     * Sets the value of the seasoninformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEASONINFORMATION(String value) {
        this.seasoninformation = value;
    }

    /**
     * Gets the value of the listcabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCABIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINCABINType }
     * 
     * 
     */
    public List<TRAINCABINType> getLISTCABIN() {
        if (listcabin == null) {
            listcabin = new ArrayList<TRAINCABINType>();
        }
        return this.listcabin;
    }

    /**
     * Gets the value of the listtravellerseat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerseat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERSEAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTType.LISTTRAVELLERSEAT }
     * 
     * 
     */
    public List<SEGMENTType.LISTTRAVELLERSEAT> getLISTTRAVELLERSEAT() {
        if (listtravellerseat == null) {
            listtravellerseat = new ArrayList<SEGMENTType.LISTTRAVELLERSEAT>();
        }
        return this.listtravellerseat;
    }

    /**
     * Gets the value of the closeto property.
     * 
     * @return
     *     possible object is
     *     {@link SEGMENTType.CLOSETO }
     *     
     */
    public SEGMENTType.CLOSETO getCLOSETO() {
        return closeto;
    }

    /**
     * Sets the value of the closeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEGMENTType.CLOSETO }
     *     
     */
    public void setCLOSETO(SEGMENTType.CLOSETO value) {
        this.closeto = value;
    }

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSEGMENTID(Object value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the eticketing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETICKETING() {
        return eticketing;
    }

    /**
     * Sets the value of the eticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETICKETING(Boolean value) {
        this.eticketing = value;
    }

    /**
     * Gets the value of the displayrank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRANK() {
        return displayrank;
    }

    /**
     * Sets the value of the displayrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRANK(String value) {
        this.displayrank = value;
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
     *         &lt;element name="WAGON_NUMBER" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="SEAT_NUMBER" type="{}unprotectedStringType"/&gt;
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
        "wagonnumber",
        "seatnumber"
    })
    public static class CLOSETO
        implements Serializable
    {

        @XmlElement(name = "WAGON_NUMBER", required = true)
        protected String wagonnumber;
        @XmlElement(name = "SEAT_NUMBER", required = true)
        protected String seatnumber;

        /**
         * Gets the value of the wagonnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAGONNUMBER() {
            return wagonnumber;
        }

        /**
         * Sets the value of the wagonnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAGONNUMBER(String value) {
            this.wagonnumber = value;
        }

        /**
         * Gets the value of the seatnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEATNUMBER() {
            return seatnumber;
        }

        /**
         * Sets the value of the seatnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEATNUMBER(String value) {
            this.seatnumber = value;
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
     *         &lt;element name="CODE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;minLength value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
    public static class EQUIPMENT
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
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
    public static class LISTSERVICE
        implements Serializable
    {

        @XmlElement(name = "CODE")
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
     *         &lt;element name="CARRIAGE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPARTMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPARTMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPARTMENT_SIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SEAT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MEAL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_SEATING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
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
        "carriagenumber",
        "compartmentnumber",
        "compartmenttype",
        "compartmentsize",
        "seatnumber",
        "meal",
        "listseatinginfo"
    })
    public static class LISTTRAVELLERSEAT
        implements Serializable
    {

        @XmlElement(name = "CARRIAGE_NUMBER")
        protected String carriagenumber;
        @XmlElement(name = "COMPARTMENT_NUMBER")
        protected String compartmentnumber;
        @XmlElement(name = "COMPARTMENT_TYPE")
        protected String compartmenttype;
        @XmlElement(name = "COMPARTMENT_SIZE")
        protected String compartmentsize;
        @XmlElement(name = "SEAT_NUMBER")
        protected String seatnumber;
        @XmlElement(name = "MEAL")
        protected SEGMENTType.LISTTRAVELLERSEAT.MEAL meal;
        @XmlElement(name = "LIST_SEATING_INFO")
        protected List<SEGMENTType.LISTTRAVELLERSEAT.LISTSEATINGINFO> listseatinginfo;

        /**
         * Gets the value of the carriagenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARRIAGENUMBER() {
            return carriagenumber;
        }

        /**
         * Sets the value of the carriagenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARRIAGENUMBER(String value) {
            this.carriagenumber = value;
        }

        /**
         * Gets the value of the compartmentnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPARTMENTNUMBER() {
            return compartmentnumber;
        }

        /**
         * Sets the value of the compartmentnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPARTMENTNUMBER(String value) {
            this.compartmentnumber = value;
        }

        /**
         * Gets the value of the compartmenttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPARTMENTTYPE() {
            return compartmenttype;
        }

        /**
         * Sets the value of the compartmenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPARTMENTTYPE(String value) {
            this.compartmenttype = value;
        }

        /**
         * Gets the value of the compartmentsize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPARTMENTSIZE() {
            return compartmentsize;
        }

        /**
         * Sets the value of the compartmentsize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPARTMENTSIZE(String value) {
            this.compartmentsize = value;
        }

        /**
         * Gets the value of the seatnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEATNUMBER() {
            return seatnumber;
        }

        /**
         * Sets the value of the seatnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEATNUMBER(String value) {
            this.seatnumber = value;
        }

        /**
         * Gets the value of the meal property.
         * 
         * @return
         *     possible object is
         *     {@link SEGMENTType.LISTTRAVELLERSEAT.MEAL }
         *     
         */
        public SEGMENTType.LISTTRAVELLERSEAT.MEAL getMEAL() {
            return meal;
        }

        /**
         * Sets the value of the meal property.
         * 
         * @param value
         *     allowed object is
         *     {@link SEGMENTType.LISTTRAVELLERSEAT.MEAL }
         *     
         */
        public void setMEAL(SEGMENTType.LISTTRAVELLERSEAT.MEAL value) {
            this.meal = value;
        }

        /**
         * Gets the value of the listseatinginfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listseatinginfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEATINGINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SEGMENTType.LISTTRAVELLERSEAT.LISTSEATINGINFO }
         * 
         * 
         */
        public List<SEGMENTType.LISTTRAVELLERSEAT.LISTSEATINGINFO> getLISTSEATINGINFO() {
            if (listseatinginfo == null) {
                listseatinginfo = new ArrayList<SEGMENTType.LISTTRAVELLERSEAT.LISTSEATINGINFO>();
            }
            return this.listseatinginfo;
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
        public static class LISTSEATINGINFO
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
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class MEAL
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
     *         &lt;element name="CODE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;enumeration value="P"/&gt;
     *               &lt;enumeration value="M"/&gt;
     *               &lt;enumeration value="D"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
    public static class MEAL
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
