
package com.koreanair.external.eretail.vo.pnr.rebookpnratcoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.air.commonout.ITINERARYType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.external.eretail.vo.pnr.listcrossreference.LISTCROSSREF;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.TripplanPriceType;
import com.koreanair.external.eretail.vo.tripplan.traveller_information.TRAVELLERINFORMATION;


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
 *         &lt;element ref="{}PAGE_TICKET" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FIELD_ERROR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}TRAVELLER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BOOKED_TRIP" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PNR_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_CROSS_REF" type="{}LIST_CROSS_REF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_DOCUMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="LIST_COUPONS" maxOccurs="16" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                                 &lt;element name="NO_SHOW" type="{}couponNoShowType" minOccurs="0"/&gt;
 *                                                 &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                                 &lt;element name="AIRLINE" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                                           &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ASSOCIATED_PASSENGERS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                                       &lt;element name="PAX_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="EXPIRATION_DATE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_DISRUPTION_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="IS_DISRUPTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                       &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
 *                   &lt;element ref="{}LIST_ITINERARY" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CRYPTIC_PRICING_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_COMMERCIAL_FARE_FAMILY" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="PANEL_TYPE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;enumeration value="A"/&gt;
 *                                   &lt;enumeration value="U"/&gt;
 *                                   &lt;enumeration value="C"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SET_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="BOUND_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TRIP_FARE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRIP_PRICE" type="{}PRICE_Type"/&gt;
 *                             &lt;element name="LIST_PNR_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_TRAVELLER_TYPE" type="{}Booked_LIST_TRAVELLER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_TRAVELLER" type="{}TRAVELLER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{}LIST_DISCOUNT_CREDENTIALS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pageticket",
    "listmsg",
    "listfielderror",
    "listtraveller",
    "bookedtrip"
})
@XmlRootElement(name = "RebookPNRATCOutput")
public class RebookPNRATCOutput
    implements Serializable
{

    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_FIELD_ERROR")
    protected List<String> listfielderror;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TRAVELLERINFORMATION> listtraveller;
    @XmlElement(name = "BOOKED_TRIP")
    protected RebookPNRATCOutput.BOOKEDTRIP bookedtrip;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the pageticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGETICKET() {
        return pageticket;
    }

    /**
     * Sets the value of the pageticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGETICKET(String value) {
        this.pageticket = value;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the listfielderror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfielderror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFIELDERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFIELDERROR() {
        if (listfielderror == null) {
            listfielderror = new ArrayList<String>();
        }
        return this.listfielderror;
    }

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
     * {@link TRAVELLERINFORMATION }
     * 
     * 
     */
    public List<TRAVELLERINFORMATION> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERINFORMATION>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the bookedtrip property.
     * 
     * @return
     *     possible object is
     *     {@link RebookPNRATCOutput.BOOKEDTRIP }
     *     
     */
    public RebookPNRATCOutput.BOOKEDTRIP getBOOKEDTRIP() {
        return bookedtrip;
    }

    /**
     * Sets the value of the bookedtrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link RebookPNRATCOutput.BOOKEDTRIP }
     *     
     */
    public void setBOOKEDTRIP(RebookPNRATCOutput.BOOKEDTRIP value) {
        this.bookedtrip = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="PNR_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_CROSS_REF" type="{}LIST_CROSS_REF" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_DOCUMENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="LIST_COUPONS" maxOccurs="16" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                       &lt;element name="NO_SHOW" type="{}couponNoShowType" minOccurs="0"/&gt;
     *                                       &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                       &lt;element name="AIRLINE" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ASSOCIATED_PASSENGERS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                             &lt;element name="PAX_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="EXPIRATION_DATE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_DISRUPTION_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="IS_DISRUPTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                             &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
     *         &lt;element ref="{}LIST_ITINERARY" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CRYPTIC_PRICING_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_COMMERCIAL_FARE_FAMILY" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="PANEL_TYPE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;enumeration value="A"/&gt;
     *                         &lt;enumeration value="U"/&gt;
     *                         &lt;enumeration value="C"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SET_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="BOUND_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TRIP_FARE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRIP_PRICE" type="{}PRICE_Type"/&gt;
     *                   &lt;element name="LIST_PNR_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_TRAVELLER_TYPE" type="{}Booked_LIST_TRAVELLER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_TRAVELLER" type="{}TRAVELLER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{}LIST_DISCOUNT_CREDENTIALS" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "pnrinfo",
        "listitinerary",
        "crypticpricingcommand",
        "listcommercialfarefamily",
        "tripfare",
        "listtraveller",
        "listdiscountcredentials"
    })
    public static class BOOKEDTRIP
        implements Serializable
    {

        @XmlElement(name = "PNR_INFO")
        protected RebookPNRATCOutput.BOOKEDTRIP.PNRINFO pnrinfo;
        @XmlElement(name = "LIST_ITINERARY")
        protected List<ITINERARYType> listitinerary;
        @XmlElement(name = "CRYPTIC_PRICING_COMMAND")
        protected String crypticpricingcommand;
        @XmlElement(name = "LIST_COMMERCIAL_FARE_FAMILY")
        protected List<RebookPNRATCOutput.BOOKEDTRIP.LISTCOMMERCIALFAREFAMILY> listcommercialfarefamily;
        @XmlElement(name = "TRIP_FARE")
        protected RebookPNRATCOutput.BOOKEDTRIP.TRIPFARE tripfare;
        @XmlElement(name = "LIST_TRAVELLER")
        protected List<TRAVELLERINFORMATION> listtraveller;
        @XmlElement(name = "LIST_DISCOUNT_CREDENTIALS")
        protected List<ListDiscountCredentialsType> listdiscountcredentials;

        /**
         * Gets the value of the pnrinfo property.
         * 
         * @return
         *     possible object is
         *     {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO }
         *     
         */
        public RebookPNRATCOutput.BOOKEDTRIP.PNRINFO getPNRINFO() {
            return pnrinfo;
        }

        /**
         * Sets the value of the pnrinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO }
         *     
         */
        public void setPNRINFO(RebookPNRATCOutput.BOOKEDTRIP.PNRINFO value) {
            this.pnrinfo = value;
        }

        /**
         * Gets the value of the listitinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listitinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTITINERARY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ITINERARYType }
         * 
         * 
         */
        public List<ITINERARYType> getLISTITINERARY() {
            if (listitinerary == null) {
                listitinerary = new ArrayList<ITINERARYType>();
            }
            return this.listitinerary;
        }

        /**
         * Gets the value of the crypticpricingcommand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRYPTICPRICINGCOMMAND() {
            return crypticpricingcommand;
        }

        /**
         * Sets the value of the crypticpricingcommand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRYPTICPRICINGCOMMAND(String value) {
            this.crypticpricingcommand = value;
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
         * {@link RebookPNRATCOutput.BOOKEDTRIP.LISTCOMMERCIALFAREFAMILY }
         * 
         * 
         */
        public List<RebookPNRATCOutput.BOOKEDTRIP.LISTCOMMERCIALFAREFAMILY> getLISTCOMMERCIALFAREFAMILY() {
            if (listcommercialfarefamily == null) {
                listcommercialfarefamily = new ArrayList<RebookPNRATCOutput.BOOKEDTRIP.LISTCOMMERCIALFAREFAMILY>();
            }
            return this.listcommercialfarefamily;
        }

        /**
         * Gets the value of the tripfare property.
         * 
         * @return
         *     possible object is
         *     {@link RebookPNRATCOutput.BOOKEDTRIP.TRIPFARE }
         *     
         */
        public RebookPNRATCOutput.BOOKEDTRIP.TRIPFARE getTRIPFARE() {
            return tripfare;
        }

        /**
         * Sets the value of the tripfare property.
         * 
         * @param value
         *     allowed object is
         *     {@link RebookPNRATCOutput.BOOKEDTRIP.TRIPFARE }
         *     
         */
        public void setTRIPFARE(RebookPNRATCOutput.BOOKEDTRIP.TRIPFARE value) {
            this.tripfare = value;
        }

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
         * {@link TRAVELLERINFORMATION }
         * 
         * 
         */
        public List<TRAVELLERINFORMATION> getLISTTRAVELLER() {
            if (listtraveller == null) {
                listtraveller = new ArrayList<TRAVELLERINFORMATION>();
            }
            return this.listtraveller;
        }

        /**
         * Gets the value of the listdiscountcredentials property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdiscountcredentials property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDISCOUNTCREDENTIALS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListDiscountCredentialsType }
         * 
         * 
         */
        public List<ListDiscountCredentialsType> getLISTDISCOUNTCREDENTIALS() {
            if (listdiscountcredentials == null) {
                listdiscountcredentials = new ArrayList<ListDiscountCredentialsType>();
            }
            return this.listdiscountcredentials;
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
         *         &lt;element name="PANEL_TYPE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;enumeration value="A"/&gt;
         *               &lt;enumeration value="U"/&gt;
         *               &lt;enumeration value="C"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SET_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="BOUND_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "paneltype",
            "setindex",
            "boundid"
        })
        public static class LISTCOMMERCIALFAREFAMILY
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "PANEL_TYPE")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String paneltype;
            @XmlElement(name = "SET_INDEX")
            protected BigInteger setindex;
            @XmlElement(name = "BOUND_ID")
            protected String boundid;

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
             * Gets the value of the paneltype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPANELTYPE() {
                return paneltype;
            }

            /**
             * Sets the value of the paneltype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPANELTYPE(String value) {
                this.paneltype = value;
            }

            /**
             * Gets the value of the setindex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSETINDEX() {
                return setindex;
            }

            /**
             * Sets the value of the setindex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSETINDEX(BigInteger value) {
                this.setindex = value;
            }

            /**
             * Gets the value of the boundid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOUNDID() {
                return boundid;
            }

            /**
             * Sets the value of the boundid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOUNDID(String value) {
                this.boundid = value;
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
         *         &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIST_CROSS_REF" type="{}LIST_CROSS_REF" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_DOCUMENT" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="LIST_COUPONS" maxOccurs="16" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                             &lt;element name="NO_SHOW" type="{}couponNoShowType" minOccurs="0"/&gt;
         *                             &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                             &lt;element name="AIRLINE" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
         *                   &lt;element name="ASSOCIATED_PASSENGERS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *                   &lt;element name="PAX_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="EXPIRATION_DATE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_DISRUPTION_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="IS_DISRUPTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                   &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
            "recloc",
            "listcrossref",
            "listdocument",
            "expirationdate",
            "listdisruptionbound"
        })
        public static class PNRINFO
            implements Serializable
        {

            @XmlElement(name = "REC_LOC")
            protected String recloc;
            @XmlElement(name = "LIST_CROSS_REF")
            protected List<LISTCROSSREF> listcrossref;
            @XmlElement(name = "LIST_DOCUMENT")
            protected List<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT> listdocument;
            @XmlElement(name = "EXPIRATION_DATE")
            protected RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.EXPIRATIONDATE expirationdate;
            @XmlElement(name = "LIST_DISRUPTION_BOUND")
            protected List<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDISRUPTIONBOUND> listdisruptionbound;

            /**
             * Gets the value of the recloc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECLOC() {
                return recloc;
            }

            /**
             * Sets the value of the recloc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECLOC(String value) {
                this.recloc = value;
            }

            /**
             * Gets the value of the listcrossref property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcrossref property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCROSSREF().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTCROSSREF }
             * 
             * 
             */
            public List<LISTCROSSREF> getLISTCROSSREF() {
                if (listcrossref == null) {
                    listcrossref = new ArrayList<LISTCROSSREF>();
                }
                return this.listcrossref;
            }

            /**
             * Gets the value of the listdocument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listdocument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTDOCUMENT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT }
             * 
             * 
             */
            public List<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT> getLISTDOCUMENT() {
                if (listdocument == null) {
                    listdocument = new ArrayList<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT>();
                }
                return this.listdocument;
            }

            /**
             * Gets the value of the expirationdate property.
             * 
             * @return
             *     possible object is
             *     {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.EXPIRATIONDATE }
             *     
             */
            public RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.EXPIRATIONDATE getEXPIRATIONDATE() {
                return expirationdate;
            }

            /**
             * Sets the value of the expirationdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.EXPIRATIONDATE }
             *     
             */
            public void setEXPIRATIONDATE(RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.EXPIRATIONDATE value) {
                this.expirationdate = value;
            }

            /**
             * Gets the value of the listdisruptionbound property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listdisruptionbound property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTDISRUPTIONBOUND().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDISRUPTIONBOUND }
             * 
             * 
             */
            public List<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDISRUPTIONBOUND> getLISTDISRUPTIONBOUND() {
                if (listdisruptionbound == null) {
                    listdisruptionbound = new ArrayList<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDISRUPTIONBOUND>();
                }
                return this.listdisruptionbound;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class EXPIRATIONDATE
                implements Serializable
            {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "code", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar code;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCode(XMLGregorianCalendar value) {
                    this.code = value;
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
             *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="IS_DISRUPTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *         &lt;element name="ELIGIBLE_TO_REBOOKING" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
                "itemid",
                "isdisrupted",
                "eligibletorebooking"
            })
            public static class LISTDISRUPTIONBOUND
                implements Serializable
            {

                @XmlElement(name = "ITEM_ID", required = true)
                protected String itemid;
                @XmlElement(name = "IS_DISRUPTED")
                protected boolean isdisrupted;
                @XmlElement(name = "ELIGIBLE_TO_REBOOKING")
                protected boolean eligibletorebooking;

                /**
                 * Gets the value of the itemid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getITEMID() {
                    return itemid;
                }

                /**
                 * Sets the value of the itemid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setITEMID(String value) {
                    this.itemid = value;
                }

                /**
                 * Gets the value of the isdisrupted property.
                 * 
                 */
                public boolean isISDISRUPTED() {
                    return isdisrupted;
                }

                /**
                 * Sets the value of the isdisrupted property.
                 * 
                 */
                public void setISDISRUPTED(boolean value) {
                    this.isdisrupted = value;
                }

                /**
                 * Gets the value of the eligibletorebooking property.
                 * 
                 */
                public boolean isELIGIBLETOREBOOKING() {
                    return eligibletorebooking;
                }

                /**
                 * Sets the value of the eligibletorebooking property.
                 * 
                 */
                public void setELIGIBLETOREBOOKING(boolean value) {
                    this.eligibletorebooking = value;
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
             *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="LIST_COUPONS" maxOccurs="16" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *                   &lt;element name="NO_SHOW" type="{}couponNoShowType" minOccurs="0"/&gt;
             *                   &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                   &lt;element name="AIRLINE" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
             *         &lt;element name="ASSOCIATED_PASSENGERS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
             *         &lt;element name="PAX_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "number",
                "listcoupons",
                "associatedpassengers",
                "paxindicator"
            })
            public static class LISTDOCUMENT
                implements Serializable
            {

                @XmlElement(name = "NUMBER", required = true)
                protected String number;
                @XmlElement(name = "LIST_COUPONS")
                protected List<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS> listcoupons;
                @XmlElement(name = "ASSOCIATED_PASSENGERS")
                protected Integer associatedpassengers;
                @XmlElement(name = "PAX_INDICATOR")
                protected String paxindicator;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNUMBER() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNUMBER(String value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the listcoupons property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listcoupons property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTCOUPONS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS }
                 * 
                 * 
                 */
                public List<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS> getLISTCOUPONS() {
                    if (listcoupons == null) {
                        listcoupons = new ArrayList<RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS>();
                    }
                    return this.listcoupons;
                }

                /**
                 * Gets the value of the associatedpassengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getASSOCIATEDPASSENGERS() {
                    return associatedpassengers;
                }

                /**
                 * Sets the value of the associatedpassengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setASSOCIATEDPASSENGERS(Integer value) {
                    this.associatedpassengers = value;
                }

                /**
                 * Gets the value of the paxindicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAXINDICATOR() {
                    return paxindicator;
                }

                /**
                 * Sets the value of the paxindicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAXINDICATOR(String value) {
                    this.paxindicator = value;
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
                 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
                 *         &lt;element name="NO_SHOW" type="{}couponNoShowType" minOccurs="0"/&gt;
                 *         &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
                 *         &lt;element name="AIRLINE" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
                 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                    "status",
                    "noshow",
                    "flightnumber",
                    "airline"
                })
                public static class LISTCOUPONS
                    implements Serializable
                {

                    @XmlElement(name = "STATUS")
                    protected String status;
                    @XmlElement(name = "NO_SHOW")
                    @XmlSchemaType(name = "string")
                    protected CouponNoShowType noshow;
                    @XmlElement(name = "FLIGHT_NUMBER")
                    protected Object flightnumber;
                    @XmlElement(name = "AIRLINE")
                    protected RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS.AIRLINE airline;

                    /**
                     * Gets the value of the status property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSTATUS() {
                        return status;
                    }

                    /**
                     * Sets the value of the status property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSTATUS(String value) {
                        this.status = value;
                    }

                    /**
                     * Gets the value of the noshow property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CouponNoShowType }
                     *     
                     */
                    public CouponNoShowType getNOSHOW() {
                        return noshow;
                    }

                    /**
                     * Sets the value of the noshow property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CouponNoShowType }
                     *     
                     */
                    public void setNOSHOW(CouponNoShowType value) {
                        this.noshow = value;
                    }

                    /**
                     * Gets the value of the flightnumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getFLIGHTNUMBER() {
                        return flightnumber;
                    }

                    /**
                     * Sets the value of the flightnumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setFLIGHTNUMBER(Object value) {
                        this.flightnumber = value;
                    }

                    /**
                     * Gets the value of the airline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS.AIRLINE }
                     *     
                     */
                    public RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS.AIRLINE getAIRLINE() {
                        return airline;
                    }

                    /**
                     * Sets the value of the airline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS.AIRLINE }
                     *     
                     */
                    public void setAIRLINE(RebookPNRATCOutput.BOOKEDTRIP.PNRINFO.LISTDOCUMENT.LISTCOUPONS.AIRLINE value) {
                        this.airline = value;
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
                     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
                     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                    public static class AIRLINE
                        implements Serializable
                    {

                        @XmlElement(name = "CODE")
                        protected Object code;
                        @XmlElement(name = "NAME")
                        protected Object name;

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

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getNAME() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setNAME(Object value) {
                            this.name = value;
                        }

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
         *         &lt;element name="TRIP_PRICE" type="{}PRICE_Type"/&gt;
         *         &lt;element name="LIST_PNR_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_TRAVELLER_TYPE" type="{}Booked_LIST_TRAVELLER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "tripprice",
            "listpnrprice",
            "listtravellertype"
        })
        public static class TRIPFARE
            implements Serializable
        {

            @XmlElement(name = "TRIP_PRICE", required = true)
            protected PRICEType tripprice;
            @XmlElement(name = "LIST_PNR_PRICE")
            protected List<TripplanPriceType> listpnrprice;
            @XmlElement(name = "LIST_TRAVELLER_TYPE")
            protected List<BookedLISTTRAVELLERTYPE> listtravellertype;

            /**
             * Gets the value of the tripprice property.
             * 
             * @return
             *     possible object is
             *     {@link PRICEType }
             *     
             */
            public PRICEType getTRIPPRICE() {
                return tripprice;
            }

            /**
             * Sets the value of the tripprice property.
             * 
             * @param value
             *     allowed object is
             *     {@link PRICEType }
             *     
             */
            public void setTRIPPRICE(PRICEType value) {
                this.tripprice = value;
            }

            /**
             * Gets the value of the listpnrprice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listpnrprice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPNRPRICE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TripplanPriceType }
             * 
             * 
             */
            public List<TripplanPriceType> getLISTPNRPRICE() {
                if (listpnrprice == null) {
                    listpnrprice = new ArrayList<TripplanPriceType>();
                }
                return this.listpnrprice;
            }

            /**
             * Gets the value of the listtravellertype property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTTRAVELLERTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookedLISTTRAVELLERTYPE }
             * 
             * 
             */
            public List<BookedLISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
                if (listtravellertype == null) {
                    listtravellertype = new ArrayList<BookedLISTTRAVELLERTYPE>();
                }
                return this.listtravellertype;
            }

        }

    }

}
