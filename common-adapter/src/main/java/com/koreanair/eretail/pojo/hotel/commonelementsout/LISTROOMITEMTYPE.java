
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * List Room item type
 * 
 * <p>Java class for LIST_ROOM_ITEM_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ROOM_ITEM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ROOM_BASEType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POLICIES" type="{}HTL_POLICIES_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TOTAL_RATE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                   &lt;element name="ESTIMATED_MAX_PRICE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PROVIDER_ROOM_RATE_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MEAL" type="{}MEAL_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="BOARD_BASIS" type="{}BOARD_BASISType" minOccurs="0"/&gt;
 *         &lt;element name="BREAKFAST_INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MEAL_EXCLUDED" type="{}MEAL_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="RATE_TYPE" type="{}RATE_TYPE_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}ROOM_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}ROOM_CLASS_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}MARKUP_OVERRIDABLE" minOccurs="0"/&gt;
 *         &lt;element ref="{}MARKUP_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element name="MAX_OCCUPANCY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE" type="{}SERVICE_TYPE_DETAILS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RATE_DETAILS" type="{}RATE_DETAILS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEE" type="{}ROOM_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_IN_OUT_TIME" type="{}CHECK_IN_OUT_TIME_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="GUARANTEE_DEPOSIT" type="{}GUARANTEE_DEPOSIT_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_PRICING" type="{}TOTAL_PRICINGType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CONTACT_DETAILS" type="{}CONTACT_DETAILS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ADVANCED_BOOKING_RESTRICTIONS" type="{}ADVANCED_BOOKING_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="LENGTH_OF_STAY" type="{}MIN_MAX_LOS_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ROOM_ITEM_TYPE", propOrder = {
    "policies",
    "listtotalrate",
    "listproviderroomratedescription",
    "meal",
    "boardbasis",
    "breakfastincluded",
    "mealexcluded",
    "ratetype",
    "roomid",
    "availability",
    "roomclassid",
    "markupoverridable",
    "markupindicator",
    "maxoccupancy",
    "listservice",
    "listratedetails",
    "listfee",
    "checkinouttime",
    "guaranteedeposit",
    "totalpricing",
    "listcontactdetails",
    "advancedbookingrestrictions",
    "lengthofstay"
})
public class LISTROOMITEMTYPE
    extends ROOMBASEType
    implements Serializable
{

    @XmlElement(name = "POLICIES")
    protected HTLPOLICIESTYPE policies;
    @XmlElement(name = "LIST_TOTAL_RATE")
    protected List<LISTROOMITEMTYPE.LISTTOTALRATE> listtotalrate;
    @XmlElement(name = "LIST_PROVIDER_ROOM_RATE_DESCRIPTION")
    protected List<String> listproviderroomratedescription;
    @XmlElement(name = "MEAL")
    protected MEALTYPE meal;
    @XmlElement(name = "BOARD_BASIS")
    protected BOARDBASISType boardbasis;
    @XmlElement(name = "BREAKFAST_INCLUDED")
    protected Boolean breakfastincluded;
    @XmlElement(name = "MEAL_EXCLUDED")
    protected MEALTYPE mealexcluded;
    @XmlElement(name = "RATE_TYPE")
    protected RATETYPETYPE ratetype;
    @XmlElement(name = "ROOM_ID")
    protected String roomid;
    @XmlElement(name = "AVAILABILITY")
    protected Object availability;
    @XmlElement(name = "ROOM_CLASS_ID")
    protected String roomclassid;
    @XmlElement(name = "MARKUP_OVERRIDABLE")
    protected Object markupoverridable;
    @XmlElement(name = "MARKUP_INDICATOR")
    protected Object markupindicator;
    @XmlElement(name = "MAX_OCCUPANCY")
    protected Object maxoccupancy;
    @XmlElement(name = "LIST_SERVICE")
    protected List<SERVICETYPEDETAILS> listservice;
    @XmlElement(name = "LIST_RATE_DETAILS")
    protected List<RATEDETAILS> listratedetails;
    @XmlElement(name = "LIST_FEE")
    protected List<ROOMFEE> listfee;
    @XmlElement(name = "CHECK_IN_OUT_TIME")
    protected CHECKINOUTTIMETYPE checkinouttime;
    @XmlElement(name = "GUARANTEE_DEPOSIT")
    protected GUARANTEEDEPOSITTYPE guaranteedeposit;
    @XmlElement(name = "TOTAL_PRICING")
    protected TOTALPRICINGType totalpricing;
    @XmlElement(name = "LIST_CONTACT_DETAILS")
    protected List<CONTACTDETAILSTYPE> listcontactdetails;
    @XmlElement(name = "ADVANCED_BOOKING_RESTRICTIONS")
    protected ADVANCEDBOOKINGTYPE advancedbookingrestrictions;
    @XmlElement(name = "LENGTH_OF_STAY")
    protected MINMAXLOSTYPE lengthofstay;

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
     * Gets the value of the listtotalrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtotalrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTOTALRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTROOMITEMTYPE.LISTTOTALRATE }
     * 
     * 
     */
    public List<LISTROOMITEMTYPE.LISTTOTALRATE> getLISTTOTALRATE() {
        if (listtotalrate == null) {
            listtotalrate = new ArrayList<LISTROOMITEMTYPE.LISTTOTALRATE>();
        }
        return this.listtotalrate;
    }

    /**
     * Gets the value of the listproviderroomratedescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproviderroomratedescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROVIDERROOMRATEDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTPROVIDERROOMRATEDESCRIPTION() {
        if (listproviderroomratedescription == null) {
            listproviderroomratedescription = new ArrayList<String>();
        }
        return this.listproviderroomratedescription;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link MEALTYPE }
     *     
     */
    public MEALTYPE getMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEALTYPE }
     *     
     */
    public void setMEAL(MEALTYPE value) {
        this.meal = value;
    }

    /**
     * Gets the value of the boardbasis property.
     * 
     * @return
     *     possible object is
     *     {@link BOARDBASISType }
     *     
     */
    public BOARDBASISType getBOARDBASIS() {
        return boardbasis;
    }

    /**
     * Sets the value of the boardbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOARDBASISType }
     *     
     */
    public void setBOARDBASIS(BOARDBASISType value) {
        this.boardbasis = value;
    }

    /**
     * Gets the value of the breakfastincluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBREAKFASTINCLUDED() {
        return breakfastincluded;
    }

    /**
     * Sets the value of the breakfastincluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBREAKFASTINCLUDED(Boolean value) {
        this.breakfastincluded = value;
    }

    /**
     * Gets the value of the mealexcluded property.
     * 
     * @return
     *     possible object is
     *     {@link MEALTYPE }
     *     
     */
    public MEALTYPE getMEALEXCLUDED() {
        return mealexcluded;
    }

    /**
     * Sets the value of the mealexcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEALTYPE }
     *     
     */
    public void setMEALEXCLUDED(MEALTYPE value) {
        this.mealexcluded = value;
    }

    /**
     * Gets the value of the ratetype property.
     * 
     * @return
     *     possible object is
     *     {@link RATETYPETYPE }
     *     
     */
    public RATETYPETYPE getRATETYPE() {
        return ratetype;
    }

    /**
     * Sets the value of the ratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RATETYPETYPE }
     *     
     */
    public void setRATETYPE(RATETYPETYPE value) {
        this.ratetype = value;
    }

    /**
     * Gets the value of the roomid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROOMID() {
        return roomid;
    }

    /**
     * Sets the value of the roomid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROOMID(String value) {
        this.roomid = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAVAILABILITY() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAVAILABILITY(Object value) {
        this.availability = value;
    }

    /**
     * Gets the value of the roomclassid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROOMCLASSID() {
        return roomclassid;
    }

    /**
     * Sets the value of the roomclassid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROOMCLASSID(String value) {
        this.roomclassid = value;
    }

    /**
     * Gets the value of the markupoverridable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMARKUPOVERRIDABLE() {
        return markupoverridable;
    }

    /**
     * Sets the value of the markupoverridable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMARKUPOVERRIDABLE(Object value) {
        this.markupoverridable = value;
    }

    /**
     * Gets the value of the markupindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMARKUPINDICATOR() {
        return markupindicator;
    }

    /**
     * Sets the value of the markupindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMARKUPINDICATOR(Object value) {
        this.markupindicator = value;
    }

    /**
     * Gets the value of the maxoccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMAXOCCUPANCY() {
        return maxoccupancy;
    }

    /**
     * Sets the value of the maxoccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMAXOCCUPANCY(Object value) {
        this.maxoccupancy = value;
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
     * {@link SERVICETYPEDETAILS }
     * 
     * 
     */
    public List<SERVICETYPEDETAILS> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<SERVICETYPEDETAILS>();
        }
        return this.listservice;
    }

    /**
     * Gets the value of the listratedetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listratedetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATEDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RATEDETAILS }
     * 
     * 
     */
    public List<RATEDETAILS> getLISTRATEDETAILS() {
        if (listratedetails == null) {
            listratedetails = new ArrayList<RATEDETAILS>();
        }
        return this.listratedetails;
    }

    /**
     * Gets the value of the listfee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROOMFEE }
     * 
     * 
     */
    public List<ROOMFEE> getLISTFEE() {
        if (listfee == null) {
            listfee = new ArrayList<ROOMFEE>();
        }
        return this.listfee;
    }

    /**
     * Gets the value of the checkinouttime property.
     * 
     * @return
     *     possible object is
     *     {@link CHECKINOUTTIMETYPE }
     *     
     */
    public CHECKINOUTTIMETYPE getCHECKINOUTTIME() {
        return checkinouttime;
    }

    /**
     * Sets the value of the checkinouttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHECKINOUTTIMETYPE }
     *     
     */
    public void setCHECKINOUTTIME(CHECKINOUTTIMETYPE value) {
        this.checkinouttime = value;
    }

    /**
     * Gets the value of the guaranteedeposit property.
     * 
     * @return
     *     possible object is
     *     {@link GUARANTEEDEPOSITTYPE }
     *     
     */
    public GUARANTEEDEPOSITTYPE getGUARANTEEDEPOSIT() {
        return guaranteedeposit;
    }

    /**
     * Sets the value of the guaranteedeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GUARANTEEDEPOSITTYPE }
     *     
     */
    public void setGUARANTEEDEPOSIT(GUARANTEEDEPOSITTYPE value) {
        this.guaranteedeposit = value;
    }

    /**
     * Gets the value of the totalpricing property.
     * 
     * @return
     *     possible object is
     *     {@link TOTALPRICINGType }
     *     
     */
    public TOTALPRICINGType getTOTALPRICING() {
        return totalpricing;
    }

    /**
     * Sets the value of the totalpricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOTALPRICINGType }
     *     
     */
    public void setTOTALPRICING(TOTALPRICINGType value) {
        this.totalpricing = value;
    }

    /**
     * Gets the value of the listcontactdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACTDETAILSTYPE }
     * 
     * 
     */
    public List<CONTACTDETAILSTYPE> getLISTCONTACTDETAILS() {
        if (listcontactdetails == null) {
            listcontactdetails = new ArrayList<CONTACTDETAILSTYPE>();
        }
        return this.listcontactdetails;
    }

    /**
     * Gets the value of the advancedbookingrestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ADVANCEDBOOKINGTYPE }
     *     
     */
    public ADVANCEDBOOKINGTYPE getADVANCEDBOOKINGRESTRICTIONS() {
        return advancedbookingrestrictions;
    }

    /**
     * Sets the value of the advancedbookingrestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADVANCEDBOOKINGTYPE }
     *     
     */
    public void setADVANCEDBOOKINGRESTRICTIONS(ADVANCEDBOOKINGTYPE value) {
        this.advancedbookingrestrictions = value;
    }

    /**
     * Gets the value of the lengthofstay property.
     * 
     * @return
     *     possible object is
     *     {@link MINMAXLOSTYPE }
     *     
     */
    public MINMAXLOSTYPE getLENGTHOFSTAY() {
        return lengthofstay;
    }

    /**
     * Sets the value of the lengthofstay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MINMAXLOSTYPE }
     *     
     */
    public void setLENGTHOFSTAY(MINMAXLOSTYPE value) {
        this.lengthofstay = value;
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
     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *         &lt;element name="ESTIMATED_MAX_PRICE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "price",
        "currency",
        "estimatedmaxprice"
    })
    public static class LISTTOTALRATE
        implements Serializable
    {

        @XmlElement(name = "PRICE")
        protected float price;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "ESTIMATED_MAX_PRICE")
        protected Boolean estimatedmaxprice;

        /**
         * Gets the value of the price property.
         * 
         */
        public float getPRICE() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         */
        public void setPRICE(float value) {
            this.price = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the estimatedmaxprice property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isESTIMATEDMAXPRICE() {
            return estimatedmaxprice;
        }

        /**
         * Sets the value of the estimatedmaxprice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setESTIMATEDMAXPRICE(Boolean value) {
            this.estimatedmaxprice = value;
        }

    }

}
