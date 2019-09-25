
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="COMPLEX_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCT_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ITINERARY_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KEY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TO_BE_ASSISTED_PERSON" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="TYPE_OF_ASSISTED_PERSON" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ASSISTED_PERSON_STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                   &lt;element name="WHEELCHAIR_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WHEELCHAIR_CATEGORY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WHEELCHAIR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="WHEELCHAIR_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="HAS_WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="IS_COLLAPSIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="BATTERY_TYPE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WHEELCHAIR_STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                   &lt;element name="DEAF_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="IS_DEAF" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                             &lt;element name="HAS_GUIDE_DOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BLIND_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="IS_BLIND" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                             &lt;element name="HAS_GUIDE_DOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DISABLED_PASSENGER" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="IS_DISABLED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                             &lt;element name="DISABLED_PAX_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="STRETCHER_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="IS_ON_STRETCHER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ANIMAL" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="ANIMAL_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="ANIMAL_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WEIGHT" type="{}WEIGHT_TYPE_PROFILE" minOccurs="0"/&gt;
 *                   &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DIMENSION" type="{}DIMENSION_TYPE_PROFILE" minOccurs="0"/&gt;
 *                   &lt;element name="IN_CABIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SPORT_EQUIPMENT_LUGGAGE" type="{}SPORT_EQUIPMENT_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MEAL_REQUESTED" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ADDITIONAL_LUGGAGE" type="{}LUGGAGE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE" type="{}SERVICE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "complexid",
    "segmentid",
    "elementid",
    "producttype",
    "itinerarytype",
    "listsegmentid",
    "keyid",
    "tobeassistedperson",
    "listanimal",
    "listsportequipmentluggage",
    "mealrequested",
    "listadditionalluggage",
    "listservice"
})
@XmlRootElement(name = "LIST_ADDITIONAL_INFORMATION")
public class LISTADDITIONALINFORMATION
    implements Serializable
{

    @XmlElement(name = "COMPLEX_ID")
    protected Object complexid;
    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "ELEMENT_ID")
    protected Object elementid;
    @XmlElement(name = "PRODUCT_TYPE")
    protected Object producttype;
    @XmlElement(name = "ITINERARY_TYPE")
    protected Object itinerarytype;
    @XmlElement(name = "LIST_SEGMENT_ID")
    protected List<BigInteger> listsegmentid;
    @XmlElement(name = "KEY_ID")
    protected String keyid;
    @XmlElement(name = "TO_BE_ASSISTED_PERSON")
    protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON tobeassistedperson;
    @XmlElement(name = "LIST_ANIMAL")
    protected List<LISTADDITIONALINFORMATION.LISTANIMAL> listanimal;
    @XmlElement(name = "LIST_SPORT_EQUIPMENT_LUGGAGE")
    protected List<SPORTEQUIPMENTType> listsportequipmentluggage;
    @XmlElement(name = "MEAL_REQUESTED")
    protected LISTADDITIONALINFORMATION.MEALREQUESTED mealrequested;
    @XmlElement(name = "LIST_ADDITIONAL_LUGGAGE")
    protected List<LUGGAGEType> listadditionalluggage;
    @XmlElement(name = "LIST_SERVICE")
    protected List<SERVICEType> listservice;

    /**
     * Gets the value of the complexid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOMPLEXID() {
        return complexid;
    }

    /**
     * Sets the value of the complexid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOMPLEXID(Object value) {
        this.complexid = value;
    }

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the elementid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getELEMENTID() {
        return elementid;
    }

    /**
     * Sets the value of the elementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setELEMENTID(Object value) {
        this.elementid = value;
    }

    /**
     * Gets the value of the producttype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRODUCTTYPE() {
        return producttype;
    }

    /**
     * Sets the value of the producttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRODUCTTYPE(Object value) {
        this.producttype = value;
    }

    /**
     * Gets the value of the itinerarytype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getITINERARYTYPE() {
        return itinerarytype;
    }

    /**
     * Sets the value of the itinerarytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setITINERARYTYPE(Object value) {
        this.itinerarytype = value;
    }

    /**
     * Gets the value of the listsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTSEGMENTID() {
        if (listsegmentid == null) {
            listsegmentid = new ArrayList<BigInteger>();
        }
        return this.listsegmentid;
    }

    /**
     * Gets the value of the keyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYID() {
        return keyid;
    }

    /**
     * Sets the value of the keyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYID(String value) {
        this.keyid = value;
    }

    /**
     * Gets the value of the tobeassistedperson property.
     * 
     * @return
     *     possible object is
     *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON }
     *     
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON getTOBEASSISTEDPERSON() {
        return tobeassistedperson;
    }

    /**
     * Sets the value of the tobeassistedperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON }
     *     
     */
    public void setTOBEASSISTEDPERSON(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON value) {
        this.tobeassistedperson = value;
    }

    /**
     * Gets the value of the listanimal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listanimal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTANIMAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTADDITIONALINFORMATION.LISTANIMAL }
     * 
     * 
     */
    public List<LISTADDITIONALINFORMATION.LISTANIMAL> getLISTANIMAL() {
        if (listanimal == null) {
            listanimal = new ArrayList<LISTADDITIONALINFORMATION.LISTANIMAL>();
        }
        return this.listanimal;
    }

    /**
     * Gets the value of the listsportequipmentluggage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsportequipmentluggage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPORTEQUIPMENTLUGGAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPORTEQUIPMENTType }
     * 
     * 
     */
    public List<SPORTEQUIPMENTType> getLISTSPORTEQUIPMENTLUGGAGE() {
        if (listsportequipmentluggage == null) {
            listsportequipmentluggage = new ArrayList<SPORTEQUIPMENTType>();
        }
        return this.listsportequipmentluggage;
    }

    /**
     * Gets the value of the mealrequested property.
     * 
     * @return
     *     possible object is
     *     {@link LISTADDITIONALINFORMATION.MEALREQUESTED }
     *     
     */
    public LISTADDITIONALINFORMATION.MEALREQUESTED getMEALREQUESTED() {
        return mealrequested;
    }

    /**
     * Sets the value of the mealrequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTADDITIONALINFORMATION.MEALREQUESTED }
     *     
     */
    public void setMEALREQUESTED(LISTADDITIONALINFORMATION.MEALREQUESTED value) {
        this.mealrequested = value;
    }

    /**
     * Gets the value of the listadditionalluggage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalluggage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALLUGGAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LUGGAGEType }
     * 
     * 
     */
    public List<LUGGAGEType> getLISTADDITIONALLUGGAGE() {
        if (listadditionalluggage == null) {
            listadditionalluggage = new ArrayList<LUGGAGEType>();
        }
        return this.listadditionalluggage;
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
     * {@link SERVICEType }
     * 
     * 
     */
    public List<SERVICEType> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<SERVICEType>();
        }
        return this.listservice;
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
     *       &lt;all&gt;
     *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="ANIMAL_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ANIMAL_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WEIGHT" type="{}WEIGHT_TYPE_PROFILE" minOccurs="0"/&gt;
     *         &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DIMENSION" type="{}DIMENSION_TYPE_PROFILE" minOccurs="0"/&gt;
     *         &lt;element name="IN_CABIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTANIMAL
        implements Serializable
    {

        @XmlElement(name = "INDEX", required = true)
        protected BigInteger index;
        @XmlElement(name = "ANIMAL_ID")
        protected Object animalid;
        @XmlElement(name = "ANIMAL_TYPE")
        protected LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE animaltype;
        @XmlElement(name = "WEIGHT")
        protected WEIGHTTYPEPROFILE weight;
        @XmlElement(name = "DETAILS")
        protected String details;
        @XmlElement(name = "DIMENSION")
        protected DIMENSIONTYPEPROFILE dimension;
        @XmlElement(name = "IN_CABIN")
        protected Boolean incabin;
        @XmlElement(name = "STATUS")
        protected CODENAMEPAIRTYPE status;
        @XmlElement(name = "NUMBER", required = true)
        protected BigInteger number;

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getINDEX() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setINDEX(BigInteger value) {
            this.index = value;
        }

        /**
         * Gets the value of the animalid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getANIMALID() {
            return animalid;
        }

        /**
         * Sets the value of the animalid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setANIMALID(Object value) {
            this.animalid = value;
        }

        /**
         * Gets the value of the animaltype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE }
         *     
         */
        public LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE getANIMALTYPE() {
            return animaltype;
        }

        /**
         * Sets the value of the animaltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE }
         *     
         */
        public void setANIMALTYPE(LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE value) {
            this.animaltype = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link WEIGHTTYPEPROFILE }
         *     
         */
        public WEIGHTTYPEPROFILE getWEIGHT() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link WEIGHTTYPEPROFILE }
         *     
         */
        public void setWEIGHT(WEIGHTTYPEPROFILE value) {
            this.weight = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDETAILS() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDETAILS(String value) {
            this.details = value;
        }

        /**
         * Gets the value of the dimension property.
         * 
         * @return
         *     possible object is
         *     {@link DIMENSIONTYPEPROFILE }
         *     
         */
        public DIMENSIONTYPEPROFILE getDIMENSION() {
            return dimension;
        }

        /**
         * Sets the value of the dimension property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIMENSIONTYPEPROFILE }
         *     
         */
        public void setDIMENSION(DIMENSIONTYPEPROFILE value) {
            this.dimension = value;
        }

        /**
         * Gets the value of the incabin property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isINCABIN() {
            return incabin;
        }

        /**
         * Sets the value of the incabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setINCABIN(Boolean value) {
            this.incabin = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public CODENAMEPAIRTYPE getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public void setSTATUS(CODENAMEPAIRTYPE value) {
            this.status = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBER(BigInteger value) {
            this.number = value;
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ANIMALTYPE
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
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "number"
    })
    public static class MEALREQUESTED
        implements Serializable
    {

        @XmlElement(name = "NUMBER", required = true)
        protected BigInteger number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBER(BigInteger value) {
            this.number = value;
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
     *       &lt;all&gt;
     *         &lt;element name="TYPE_OF_ASSISTED_PERSON" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ASSISTED_PERSON_STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *         &lt;element name="WHEELCHAIR_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WHEELCHAIR_CATEGORY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WHEELCHAIR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="WHEELCHAIR_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="HAS_WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="IS_COLLAPSIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="BATTERY_TYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WHEELCHAIR_STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *         &lt;element name="DEAF_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="IS_DEAF" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *                   &lt;element name="HAS_GUIDE_DOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BLIND_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="IS_BLIND" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *                   &lt;element name="HAS_GUIDE_DOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DISABLED_PASSENGER" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="IS_DISABLED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *                   &lt;element name="DISABLED_PAX_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="STRETCHER_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="IS_ON_STRETCHER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class TOBEASSISTEDPERSON
        implements Serializable
    {

        @XmlElement(name = "TYPE_OF_ASSISTED_PERSON")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON typeofassistedperson;
        @XmlElement(name = "ASSISTED_PERSON_STATUS")
        protected CODENAMEPAIRTYPE assistedpersonstatus;
        @XmlElement(name = "WHEELCHAIR_TYPE")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE wheelchairtype;
        @XmlElement(name = "WHEELCHAIR_CATEGORY")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY wheelchaircategory;
        @XmlElement(name = "WHEELCHAIR_NUMBER")
        protected BigInteger wheelchairnumber;
        @XmlElement(name = "WHEELCHAIR_INFORMATION")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION wheelchairinformation;
        @XmlElement(name = "WHEELCHAIR_STATUS")
        protected CODENAMEPAIRTYPE wheelchairstatus;
        @XmlElement(name = "DEAF_INFORMATION")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION deafinformation;
        @XmlElement(name = "BLIND_INFORMATION")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION blindinformation;
        @XmlElement(name = "DISABLED_PASSENGER")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER disabledpassenger;
        @XmlElement(name = "STRETCHER_INFORMATION")
        protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION stretcherinformation;

        /**
         * Gets the value of the typeofassistedperson property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON getTYPEOFASSISTEDPERSON() {
            return typeofassistedperson;
        }

        /**
         * Sets the value of the typeofassistedperson property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON }
         *     
         */
        public void setTYPEOFASSISTEDPERSON(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON value) {
            this.typeofassistedperson = value;
        }

        /**
         * Gets the value of the assistedpersonstatus property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public CODENAMEPAIRTYPE getASSISTEDPERSONSTATUS() {
            return assistedpersonstatus;
        }

        /**
         * Sets the value of the assistedpersonstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public void setASSISTEDPERSONSTATUS(CODENAMEPAIRTYPE value) {
            this.assistedpersonstatus = value;
        }

        /**
         * Gets the value of the wheelchairtype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE getWHEELCHAIRTYPE() {
            return wheelchairtype;
        }

        /**
         * Sets the value of the wheelchairtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE }
         *     
         */
        public void setWHEELCHAIRTYPE(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE value) {
            this.wheelchairtype = value;
        }

        /**
         * Gets the value of the wheelchaircategory property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY getWHEELCHAIRCATEGORY() {
            return wheelchaircategory;
        }

        /**
         * Sets the value of the wheelchaircategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY }
         *     
         */
        public void setWHEELCHAIRCATEGORY(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY value) {
            this.wheelchaircategory = value;
        }

        /**
         * Gets the value of the wheelchairnumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWHEELCHAIRNUMBER() {
            return wheelchairnumber;
        }

        /**
         * Sets the value of the wheelchairnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWHEELCHAIRNUMBER(BigInteger value) {
            this.wheelchairnumber = value;
        }

        /**
         * Gets the value of the wheelchairinformation property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION getWHEELCHAIRINFORMATION() {
            return wheelchairinformation;
        }

        /**
         * Sets the value of the wheelchairinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION }
         *     
         */
        public void setWHEELCHAIRINFORMATION(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION value) {
            this.wheelchairinformation = value;
        }

        /**
         * Gets the value of the wheelchairstatus property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public CODENAMEPAIRTYPE getWHEELCHAIRSTATUS() {
            return wheelchairstatus;
        }

        /**
         * Sets the value of the wheelchairstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public void setWHEELCHAIRSTATUS(CODENAMEPAIRTYPE value) {
            this.wheelchairstatus = value;
        }

        /**
         * Gets the value of the deafinformation property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION getDEAFINFORMATION() {
            return deafinformation;
        }

        /**
         * Sets the value of the deafinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION }
         *     
         */
        public void setDEAFINFORMATION(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION value) {
            this.deafinformation = value;
        }

        /**
         * Gets the value of the blindinformation property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION getBLINDINFORMATION() {
            return blindinformation;
        }

        /**
         * Sets the value of the blindinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION }
         *     
         */
        public void setBLINDINFORMATION(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION value) {
            this.blindinformation = value;
        }

        /**
         * Gets the value of the disabledpassenger property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER getDISABLEDPASSENGER() {
            return disabledpassenger;
        }

        /**
         * Sets the value of the disabledpassenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER }
         *     
         */
        public void setDISABLEDPASSENGER(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER value) {
            this.disabledpassenger = value;
        }

        /**
         * Gets the value of the stretcherinformation property.
         * 
         * @return
         *     possible object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION }
         *     
         */
        public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION getSTRETCHERINFORMATION() {
            return stretcherinformation;
        }

        /**
         * Sets the value of the stretcherinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION }
         *     
         */
        public void setSTRETCHERINFORMATION(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION value) {
            this.stretcherinformation = value;
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
         *       &lt;all&gt;
         *         &lt;element name="IS_BLIND" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
         *         &lt;element name="HAS_GUIDE_DOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class BLINDINFORMATION
            implements Serializable
        {

            @XmlElement(name = "IS_BLIND")
            protected boolean isblind;
            @XmlElement(name = "STATUS")
            protected CODENAMEPAIRTYPE status;
            @XmlElement(name = "HAS_GUIDE_DOG")
            protected Boolean hasguidedog;

            /**
             * Gets the value of the isblind property.
             * 
             */
            public boolean isISBLIND() {
                return isblind;
            }

            /**
             * Sets the value of the isblind property.
             * 
             */
            public void setISBLIND(boolean value) {
                this.isblind = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public CODENAMEPAIRTYPE getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public void setSTATUS(CODENAMEPAIRTYPE value) {
                this.status = value;
            }

            /**
             * Gets the value of the hasguidedog property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHASGUIDEDOG() {
                return hasguidedog;
            }

            /**
             * Sets the value of the hasguidedog property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHASGUIDEDOG(Boolean value) {
                this.hasguidedog = value;
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
         *       &lt;all&gt;
         *         &lt;element name="IS_DEAF" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
         *         &lt;element name="HAS_GUIDE_DOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class DEAFINFORMATION
            implements Serializable
        {

            @XmlElement(name = "IS_DEAF")
            protected boolean isdeaf;
            @XmlElement(name = "STATUS")
            protected CODENAMEPAIRTYPE status;
            @XmlElement(name = "HAS_GUIDE_DOG")
            protected Boolean hasguidedog;

            /**
             * Gets the value of the isdeaf property.
             * 
             */
            public boolean isISDEAF() {
                return isdeaf;
            }

            /**
             * Sets the value of the isdeaf property.
             * 
             */
            public void setISDEAF(boolean value) {
                this.isdeaf = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public CODENAMEPAIRTYPE getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public void setSTATUS(CODENAMEPAIRTYPE value) {
                this.status = value;
            }

            /**
             * Gets the value of the hasguidedog property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHASGUIDEDOG() {
                return hasguidedog;
            }

            /**
             * Sets the value of the hasguidedog property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHASGUIDEDOG(Boolean value) {
                this.hasguidedog = value;
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
         *       &lt;all&gt;
         *         &lt;element name="IS_DISABLED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
         *         &lt;element name="DISABLED_PAX_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class DISABLEDPASSENGER
            implements Serializable
        {

            @XmlElement(name = "IS_DISABLED")
            protected boolean isdisabled;
            @XmlElement(name = "STATUS")
            protected CODENAMEPAIRTYPE status;
            @XmlElement(name = "DISABLED_PAX_DETAILS")
            protected String disabledpaxdetails;

            /**
             * Gets the value of the isdisabled property.
             * 
             */
            public boolean isISDISABLED() {
                return isdisabled;
            }

            /**
             * Sets the value of the isdisabled property.
             * 
             */
            public void setISDISABLED(boolean value) {
                this.isdisabled = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public CODENAMEPAIRTYPE getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public void setSTATUS(CODENAMEPAIRTYPE value) {
                this.status = value;
            }

            /**
             * Gets the value of the disabledpaxdetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISABLEDPAXDETAILS() {
                return disabledpaxdetails;
            }

            /**
             * Sets the value of the disabledpaxdetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISABLEDPAXDETAILS(String value) {
                this.disabledpaxdetails = value;
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
         *       &lt;all&gt;
         *         &lt;element name="IS_ON_STRETCHER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class STRETCHERINFORMATION
            implements Serializable
        {

            @XmlElement(name = "IS_ON_STRETCHER")
            protected boolean isonstretcher;
            @XmlElement(name = "STATUS")
            protected CODENAMEPAIRTYPE status;

            /**
             * Gets the value of the isonstretcher property.
             * 
             */
            public boolean isISONSTRETCHER() {
                return isonstretcher;
            }

            /**
             * Sets the value of the isonstretcher property.
             * 
             */
            public void setISONSTRETCHER(boolean value) {
                this.isonstretcher = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public CODENAMEPAIRTYPE getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public void setSTATUS(CODENAMEPAIRTYPE value) {
                this.status = value;
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class TYPEOFASSISTEDPERSON
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class WHEELCHAIRCATEGORY
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
         *       &lt;all&gt;
         *         &lt;element name="HAS_WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="IS_COLLAPSIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="BATTERY_TYPE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class WHEELCHAIRINFORMATION
            implements Serializable
        {

            @XmlElement(name = "HAS_WHEELCHAIR")
            protected boolean haswheelchair;
            @XmlElement(name = "IS_COLLAPSIBLE")
            protected Boolean iscollapsible;
            @XmlElement(name = "IS_MANUAL")
            protected Boolean ismanual;
            @XmlElement(name = "HEIGHT")
            protected BigInteger height;
            @XmlElement(name = "LENGTH")
            protected BigInteger length;
            @XmlElement(name = "WIDTH")
            protected BigInteger width;
            @XmlElement(name = "WEIGHT")
            protected BigInteger weight;
            @XmlElement(name = "BATTERY_TYPE")
            protected LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE batterytype;

            /**
             * Gets the value of the haswheelchair property.
             * 
             */
            public boolean isHASWHEELCHAIR() {
                return haswheelchair;
            }

            /**
             * Sets the value of the haswheelchair property.
             * 
             */
            public void setHASWHEELCHAIR(boolean value) {
                this.haswheelchair = value;
            }

            /**
             * Gets the value of the iscollapsible property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISCOLLAPSIBLE() {
                return iscollapsible;
            }

            /**
             * Sets the value of the iscollapsible property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISCOLLAPSIBLE(Boolean value) {
                this.iscollapsible = value;
            }

            /**
             * Gets the value of the ismanual property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISMANUAL() {
                return ismanual;
            }

            /**
             * Sets the value of the ismanual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISMANUAL(Boolean value) {
                this.ismanual = value;
            }

            /**
             * Gets the value of the height property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getHEIGHT() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setHEIGHT(BigInteger value) {
                this.height = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLENGTH() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLENGTH(BigInteger value) {
                this.length = value;
            }

            /**
             * Gets the value of the width property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWIDTH() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWIDTH(BigInteger value) {
                this.width = value;
            }

            /**
             * Gets the value of the weight property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWEIGHT() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWEIGHT(BigInteger value) {
                this.weight = value;
            }

            /**
             * Gets the value of the batterytype property.
             * 
             * @return
             *     possible object is
             *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE }
             *     
             */
            public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE getBATTERYTYPE() {
                return batterytype;
            }

            /**
             * Sets the value of the batterytype property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE }
             *     
             */
            public void setBATTERYTYPE(LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE value) {
                this.batterytype = value;
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class BATTERYTYPE
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class WHEELCHAIRTYPE
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
