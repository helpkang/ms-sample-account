
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.FareFamilyType;
import com.koreanair.external.eretail.vo.farecommon.farecontext.LISTCORPORATENUMBER;
import com.koreanair.external.eretail.vo.farecommon.ticketchangercommonexternal.WAIVERINFORMATIONType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCLISTPTCType;


/**
 * <p>Java class for ListTravellerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListTravellerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER" maxOccurs="9"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}HAS_INFANT"/&gt;
 *                   &lt;element ref="{}IS_PRIMARY_TRAVELLER"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{}REQUESTED_TRAVELLER_TYPE"/&gt;
 *                     &lt;element name="REQUESTED_TRAVELLER_TYPE_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="LIST_REQUESTED_PTC_DISCOUNT" type="{}DISCOUNT_INFO_PTC_LIST_PTC_Type" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element ref="{}RELATIONSHIP" minOccurs="0"/&gt;
 *                   &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
 *                   &lt;element ref="{}REFERENCE" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TRAVELLER_TYPE"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                     &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="TRAVELLER_TYPE_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIST_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SEGMENT" maxOccurs="4"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="FARE_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="FARE_BREAK_POINT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="TICKET_DESIGNATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element ref="{}RBD" minOccurs="0"/&gt;
 *                             &lt;element ref="{}CABIN" minOccurs="0"/&gt;
 *                             &lt;element ref="{}LIST_CORPORATE_NUMBER" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="FARE_FAMILY" type="{}FareFamilyType"/&gt;
 *                             &lt;element ref="{}LIST_PTC_APPLIED" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_FARE_TYPES" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{}LIST_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="FARE_COMPONENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
 *         &lt;element name="FAMILY_FARE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{}FareFamilyType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_TYPE" type="{}FareTypeType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}LIST_TRAVELLER_PRICE" maxOccurs="unbounded"/&gt;
 *           &lt;element name="TRAVELLER_PRICE" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}LIST_TRAVELLER_TYPE_PRICE" maxOccurs="unbounded"/&gt;
 *           &lt;element name="TRAVELLER_TYPE_PRICE" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}REVALIDATION_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element name="WAIVER_INFORMATION" type="{}WAIVER_INFORMATION_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTravellerType", propOrder = {
    "listtraveller",
    "travellertype",
    "travellertypecode",
    "number",
    "listbound",
    "familyfare",
    "farefamily",
    "faretype",
    "listtravellerprice",
    "travellerprice",
    "listtravellertypeprice",
    "travellertypeprice",
    "revalidationindicator",
    "waiverinformation"
})
public class ListTravellerType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<ListTravellerType.LISTTRAVELLER> listtraveller;
    @XmlElement(name = "TRAVELLER_TYPE")
    protected ListTravellerType.TRAVELLERTYPE travellertype;
    @XmlElement(name = "TRAVELLER_TYPE_CODE")
    protected String travellertypecode;
    @XmlElement(name = "NUMBER", required = true)
    protected BigInteger number;
    @XmlElement(name = "LIST_BOUND")
    protected List<ListTravellerType.LISTBOUND> listbound;
    @XmlElement(name = "FAMILY_FARE")
    protected Boolean familyfare;
    @XmlElement(name = "FARE_FAMILY")
    protected FareFamilyType farefamily;
    @XmlElement(name = "FARE_TYPE")
    protected FareTypeType faretype;
    @XmlElement(name = "LIST_TRAVELLER_PRICE")
    protected List<TravellerPriceType> listtravellerprice;
    @XmlElement(name = "TRAVELLER_PRICE")
    protected ListTravellerType.TRAVELLERPRICE travellerprice;
    @XmlElement(name = "LIST_TRAVELLER_TYPE_PRICE")
    protected List<PriceType> listtravellertypeprice;
    @XmlElement(name = "TRAVELLER_TYPE_PRICE")
    protected ListTravellerType.TRAVELLERTYPEPRICE travellertypeprice;
    @XmlElement(name = "REVALIDATION_INDICATOR")
    protected Boolean revalidationindicator;
    @XmlElement(name = "WAIVER_INFORMATION")
    protected WAIVERINFORMATIONType waiverinformation;

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTravellerType.LISTTRAVELLER }
     * 
     * 
     */
    public List<ListTravellerType.LISTTRAVELLER> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<ListTravellerType.LISTTRAVELLER>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link ListTravellerType.TRAVELLERTYPE }
     *     
     */
    public ListTravellerType.TRAVELLERTYPE getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTravellerType.TRAVELLERTYPE }
     *     
     */
    public void setTRAVELLERTYPE(ListTravellerType.TRAVELLERTYPE value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the travellertypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERTYPECODE() {
        return travellertypecode;
    }

    /**
     * Sets the value of the travellertypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERTYPECODE(String value) {
        this.travellertypecode = value;
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
     * Gets the value of the listbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTravellerType.LISTBOUND }
     * 
     * 
     */
    public List<ListTravellerType.LISTBOUND> getLISTBOUND() {
        if (listbound == null) {
            listbound = new ArrayList<ListTravellerType.LISTBOUND>();
        }
        return this.listbound;
    }

    /**
     * Gets the value of the familyfare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFAMILYFARE() {
        return familyfare;
    }

    /**
     * Sets the value of the familyfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFAMILYFARE(Boolean value) {
        this.familyfare = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyType }
     *     
     */
    public FareFamilyType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyType }
     *     
     */
    public void setFAREFAMILY(FareFamilyType value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the faretype property.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeType }
     *     
     */
    public FareTypeType getFARETYPE() {
        return faretype;
    }

    /**
     * Sets the value of the faretype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeType }
     *     
     */
    public void setFARETYPE(FareTypeType value) {
        this.faretype = value;
    }

    /**
     * Gets the value of the listtravellerprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerPriceType }
     * 
     * 
     */
    public List<TravellerPriceType> getLISTTRAVELLERPRICE() {
        if (listtravellerprice == null) {
            listtravellerprice = new ArrayList<TravellerPriceType>();
        }
        return this.listtravellerprice;
    }

    /**
     * Gets the value of the travellerprice property.
     * 
     * @return
     *     possible object is
     *     {@link ListTravellerType.TRAVELLERPRICE }
     *     
     */
    public ListTravellerType.TRAVELLERPRICE getTRAVELLERPRICE() {
        return travellerprice;
    }

    /**
     * Sets the value of the travellerprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTravellerType.TRAVELLERPRICE }
     *     
     */
    public void setTRAVELLERPRICE(ListTravellerType.TRAVELLERPRICE value) {
        this.travellerprice = value;
    }

    /**
     * Gets the value of the listtravellertypeprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertypeprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPEPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getLISTTRAVELLERTYPEPRICE() {
        if (listtravellertypeprice == null) {
            listtravellertypeprice = new ArrayList<PriceType>();
        }
        return this.listtravellertypeprice;
    }

    /**
     * Gets the value of the travellertypeprice property.
     * 
     * @return
     *     possible object is
     *     {@link ListTravellerType.TRAVELLERTYPEPRICE }
     *     
     */
    public ListTravellerType.TRAVELLERTYPEPRICE getTRAVELLERTYPEPRICE() {
        return travellertypeprice;
    }

    /**
     * Sets the value of the travellertypeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTravellerType.TRAVELLERTYPEPRICE }
     *     
     */
    public void setTRAVELLERTYPEPRICE(ListTravellerType.TRAVELLERTYPEPRICE value) {
        this.travellertypeprice = value;
    }

    /**
     * Gets the value of the revalidationindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREVALIDATIONINDICATOR() {
        return revalidationindicator;
    }

    /**
     * Sets the value of the revalidationindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREVALIDATIONINDICATOR(Boolean value) {
        this.revalidationindicator = value;
    }

    /**
     * Gets the value of the waiverinformation property.
     * 
     * @return
     *     possible object is
     *     {@link WAIVERINFORMATIONType }
     *     
     */
    public WAIVERINFORMATIONType getWAIVERINFORMATION() {
        return waiverinformation;
    }

    /**
     * Sets the value of the waiverinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WAIVERINFORMATIONType }
     *     
     */
    public void setWAIVERINFORMATION(WAIVERINFORMATIONType value) {
        this.waiverinformation = value;
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
     *         &lt;element name="LIST_SEGMENT" maxOccurs="4"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="FARE_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="FARE_BREAK_POINT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="TICKET_DESIGNATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element ref="{}RBD" minOccurs="0"/&gt;
     *                   &lt;element ref="{}CABIN" minOccurs="0"/&gt;
     *                   &lt;element ref="{}LIST_CORPORATE_NUMBER" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="FARE_FAMILY" type="{}FareFamilyType"/&gt;
     *                   &lt;element ref="{}LIST_PTC_APPLIED" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_FARE_TYPES" maxOccurs="unbounded" minOccurs="0"&gt;
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
     *                   &lt;element ref="{}LIST_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="FARE_COMPONENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "listsegment"
    })
    public static class LISTBOUND
        implements Serializable
    {

        @XmlElement(name = "LIST_SEGMENT", required = true)
        protected List<ListTravellerType.LISTBOUND.LISTSEGMENT> listsegment;

        /**
         * Gets the value of the listsegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListTravellerType.LISTBOUND.LISTSEGMENT }
         * 
         * 
         */
        public List<ListTravellerType.LISTBOUND.LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<ListTravellerType.LISTBOUND.LISTSEGMENT>();
            }
            return this.listsegment;
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
         *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="FARE_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="FARE_BREAK_POINT" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="TICKET_DESIGNATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element ref="{}RBD" minOccurs="0"/&gt;
         *         &lt;element ref="{}CABIN" minOccurs="0"/&gt;
         *         &lt;element ref="{}LIST_CORPORATE_NUMBER" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="FARE_FAMILY" type="{}FareFamilyType"/&gt;
         *         &lt;element ref="{}LIST_PTC_APPLIED" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_FARE_TYPES" maxOccurs="unbounded" minOccurs="0"&gt;
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
         *         &lt;element ref="{}LIST_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="FARE_COMPONENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            "segmentid",
            "fareclass",
            "farebreakpoint",
            "ticketdesignator",
            "rbd",
            "cabin",
            "listcorporatenumber",
            "typeofcorporatefare",
            "farefamily",
            "listptcapplied",
            "listfaretypes",
            "listdiscount",
            "farecomponentid"
        })
        public static class LISTSEGMENT
            implements Serializable
        {

            @XmlElement(name = "SEGMENT_ID", required = true)
            protected BigInteger segmentid;
            @XmlElement(name = "FARE_CLASS")
            protected String fareclass;
            @XmlElement(name = "FARE_BREAK_POINT")
            protected String farebreakpoint;
            @XmlElement(name = "TICKET_DESIGNATOR")
            protected String ticketdesignator;
            @XmlElement(name = "RBD")
            protected String rbd;
            @XmlElement(name = "CABIN")
            protected String cabin;
            @XmlElement(name = "LIST_CORPORATE_NUMBER")
            protected List<LISTCORPORATENUMBER> listcorporatenumber;
            @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
            protected BigInteger typeofcorporatefare;
            @XmlElement(name = "FARE_FAMILY", required = true)
            protected FareFamilyType farefamily;
            @XmlElement(name = "LIST_PTC_APPLIED")
            protected List<LISTPTCAPPLIED> listptcapplied;
            @XmlElement(name = "LIST_FARE_TYPES")
            protected List<ListTravellerType.LISTBOUND.LISTSEGMENT.LISTFARETYPES> listfaretypes;
            @XmlElement(name = "LIST_DISCOUNT")
            protected List<LISTDISCOUNT> listdiscount;
            @XmlElement(name = "FARE_COMPONENT_ID")
            protected BigInteger farecomponentid;

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
             * Gets the value of the fareclass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFARECLASS() {
                return fareclass;
            }

            /**
             * Sets the value of the fareclass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFARECLASS(String value) {
                this.fareclass = value;
            }

            /**
             * Gets the value of the farebreakpoint property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAREBREAKPOINT() {
                return farebreakpoint;
            }

            /**
             * Sets the value of the farebreakpoint property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAREBREAKPOINT(String value) {
                this.farebreakpoint = value;
            }

            /**
             * Gets the value of the ticketdesignator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTICKETDESIGNATOR() {
                return ticketdesignator;
            }

            /**
             * Sets the value of the ticketdesignator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTICKETDESIGNATOR(String value) {
                this.ticketdesignator = value;
            }

            /**
             * Gets the value of the rbd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRBD() {
                return rbd;
            }

            /**
             * Sets the value of the rbd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRBD(String value) {
                this.rbd = value;
            }

            /**
             * Gets the value of the cabin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCABIN() {
                return cabin;
            }

            /**
             * Sets the value of the cabin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCABIN(String value) {
                this.cabin = value;
            }

            /**
             * Gets the value of the listcorporatenumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcorporatenumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCORPORATENUMBER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTCORPORATENUMBER }
             * 
             * 
             */
            public List<LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
                if (listcorporatenumber == null) {
                    listcorporatenumber = new ArrayList<LISTCORPORATENUMBER>();
                }
                return this.listcorporatenumber;
            }

            /**
             * Gets the value of the typeofcorporatefare property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTYPEOFCORPORATEFARE() {
                return typeofcorporatefare;
            }

            /**
             * Sets the value of the typeofcorporatefare property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTYPEOFCORPORATEFARE(BigInteger value) {
                this.typeofcorporatefare = value;
            }

            /**
             * Gets the value of the farefamily property.
             * 
             * @return
             *     possible object is
             *     {@link FareFamilyType }
             *     
             */
            public FareFamilyType getFAREFAMILY() {
                return farefamily;
            }

            /**
             * Sets the value of the farefamily property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFamilyType }
             *     
             */
            public void setFAREFAMILY(FareFamilyType value) {
                this.farefamily = value;
            }

            /**
             * Gets the value of the listptcapplied property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listptcapplied property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPTCAPPLIED().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTPTCAPPLIED }
             * 
             * 
             */
            public List<LISTPTCAPPLIED> getLISTPTCAPPLIED() {
                if (listptcapplied == null) {
                    listptcapplied = new ArrayList<LISTPTCAPPLIED>();
                }
                return this.listptcapplied;
            }

            /**
             * Gets the value of the listfaretypes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listfaretypes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTFARETYPES().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ListTravellerType.LISTBOUND.LISTSEGMENT.LISTFARETYPES }
             * 
             * 
             */
            public List<ListTravellerType.LISTBOUND.LISTSEGMENT.LISTFARETYPES> getLISTFARETYPES() {
                if (listfaretypes == null) {
                    listfaretypes = new ArrayList<ListTravellerType.LISTBOUND.LISTSEGMENT.LISTFARETYPES>();
                }
                return this.listfaretypes;
            }

            /**
             * The list of discount codes applying for this fare component.Gets the value of the listdiscount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTDISCOUNT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTDISCOUNT }
             * 
             * 
             */
            public List<LISTDISCOUNT> getLISTDISCOUNT() {
                if (listdiscount == null) {
                    listdiscount = new ArrayList<LISTDISCOUNT>();
                }
                return this.listdiscount;
            }

            /**
             * Gets the value of the farecomponentid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFARECOMPONENTID() {
                return farecomponentid;
            }

            /**
             * Sets the value of the farecomponentid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFARECOMPONENTID(BigInteger value) {
                this.farecomponentid = value;
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
            public static class LISTFARETYPES
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
     *         &lt;element ref="{}HAS_INFANT"/&gt;
     *         &lt;element ref="{}IS_PRIMARY_TRAVELLER"/&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{}REQUESTED_TRAVELLER_TYPE"/&gt;
     *           &lt;element name="REQUESTED_TRAVELLER_TYPE_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="LIST_REQUESTED_PTC_DISCOUNT" type="{}DISCOUNT_INFO_PTC_LIST_PTC_Type" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element ref="{}RELATIONSHIP" minOccurs="0"/&gt;
     *         &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
     *         &lt;element ref="{}REFERENCE" minOccurs="0"/&gt;
     *         &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "hasinfant",
        "isprimarytraveller",
        "requestedtravellertype",
        "requestedtravellertypecode",
        "listrequestedptcdiscount",
        "relationship",
        "travellerid",
        "reference",
        "dateofbirth"
    })
    public static class LISTTRAVELLER
        implements Serializable
    {

        @XmlElement(name = "HAS_INFANT")
        protected boolean hasinfant;
        @XmlElement(name = "IS_PRIMARY_TRAVELLER")
        protected boolean isprimarytraveller;
        @XmlElement(name = "REQUESTED_TRAVELLER_TYPE")
        protected REQUESTEDTRAVELLERTYPE requestedtravellertype;
        @XmlElement(name = "REQUESTED_TRAVELLER_TYPE_CODE")
        protected String requestedtravellertypecode;
        @XmlElement(name = "LIST_REQUESTED_PTC_DISCOUNT")
        protected List<DISCOUNTINFOPTCLISTPTCType> listrequestedptcdiscount;
        @XmlElement(name = "RELATIONSHIP")
        protected String relationship;
        @XmlElement(name = "TRAVELLER_ID")
        protected BigInteger travellerid;
        @XmlElement(name = "REFERENCE")
        protected BigInteger reference;
        @XmlElement(name = "DATE_OF_BIRTH")
        protected String dateofbirth;

        /**
         * Gets the value of the hasinfant property.
         * 
         */
        public boolean isHASINFANT() {
            return hasinfant;
        }

        /**
         * Sets the value of the hasinfant property.
         * 
         */
        public void setHASINFANT(boolean value) {
            this.hasinfant = value;
        }

        /**
         * Gets the value of the isprimarytraveller property.
         * 
         */
        public boolean isISPRIMARYTRAVELLER() {
            return isprimarytraveller;
        }

        /**
         * Sets the value of the isprimarytraveller property.
         * 
         */
        public void setISPRIMARYTRAVELLER(boolean value) {
            this.isprimarytraveller = value;
        }

        /**
         * Gets the value of the requestedtravellertype property.
         * 
         * @return
         *     possible object is
         *     {@link REQUESTEDTRAVELLERTYPE }
         *     
         */
        public REQUESTEDTRAVELLERTYPE getREQUESTEDTRAVELLERTYPE() {
            return requestedtravellertype;
        }

        /**
         * Sets the value of the requestedtravellertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link REQUESTEDTRAVELLERTYPE }
         *     
         */
        public void setREQUESTEDTRAVELLERTYPE(REQUESTEDTRAVELLERTYPE value) {
            this.requestedtravellertype = value;
        }

        /**
         * Gets the value of the requestedtravellertypecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTEDTRAVELLERTYPECODE() {
            return requestedtravellertypecode;
        }

        /**
         * Sets the value of the requestedtravellertypecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTEDTRAVELLERTYPECODE(String value) {
            this.requestedtravellertypecode = value;
        }

        /**
         * Gets the value of the listrequestedptcdiscount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrequestedptcdiscount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTREQUESTEDPTCDISCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DISCOUNTINFOPTCLISTPTCType }
         * 
         * 
         */
        public List<DISCOUNTINFOPTCLISTPTCType> getLISTREQUESTEDPTCDISCOUNT() {
            if (listrequestedptcdiscount == null) {
                listrequestedptcdiscount = new ArrayList<DISCOUNTINFOPTCLISTPTCType>();
            }
            return this.listrequestedptcdiscount;
        }

        /**
         * Gets the value of the relationship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATIONSHIP() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATIONSHIP(String value) {
            this.relationship = value;
        }

        /**
         * Gets the value of the travellerid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTRAVELLERID() {
            return travellerid;
        }

        /**
         * Sets the value of the travellerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTRAVELLERID(BigInteger value) {
            this.travellerid = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getREFERENCE() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setREFERENCE(BigInteger value) {
            this.reference = value;
        }

        /**
         * Gets the value of the dateofbirth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATEOFBIRTH() {
            return dateofbirth;
        }

        /**
         * Sets the value of the dateofbirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATEOFBIRTH(String value) {
            this.dateofbirth = value;
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
     *         &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "refnumber"
    })
    public static class TRAVELLERPRICE
        implements Serializable
    {

        @XmlElement(name = "REF_NUMBER", required = true)
        protected BigInteger refnumber;

        /**
         * Gets the value of the refnumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getREFNUMBER() {
            return refnumber;
        }

        /**
         * Sets the value of the refnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setREFNUMBER(BigInteger value) {
            this.refnumber = value;
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
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class TRAVELLERTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
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
     *         &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "refnumber"
    })
    public static class TRAVELLERTYPEPRICE
        implements Serializable
    {

        @XmlElement(name = "REF_NUMBER", required = true)
        protected BigInteger refnumber;

        /**
         * Gets the value of the refnumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getREFNUMBER() {
            return refnumber;
        }

        /**
         * Sets the value of the refnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setREFNUMBER(BigInteger value) {
            this.refnumber = value;
        }

    }

}
