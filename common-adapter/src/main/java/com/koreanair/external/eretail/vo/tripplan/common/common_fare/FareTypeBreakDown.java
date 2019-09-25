
package com.koreanair.external.eretail.vo.tripplan.common.common_fare;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.REBOOKBALANCEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.REBOOKFEEType;
import com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing.TicketType;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.TripplanPriceType;


/**
 * <p>Java class for fareTypeBreakDown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareTypeBreakDown"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER_TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="HAS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_PRIMARY_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="REQUESTED_TRAVELLER_TYPE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ORIGINAL_TICKET" type="{}ticketType" minOccurs="0"/&gt;
 *                             &lt;element name="ORIGINAL_TICKET_BREAKDOWN" type="{}ticketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="TICKET" type="{}ticketType" minOccurs="0"/&gt;
 *                             &lt;element name="REBOOKED_TICKET" type="{}ticketType" minOccurs="0"/&gt;
 *                             &lt;element name="REBOOK_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
 *                             &lt;element name="COLLECT_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
 *                             &lt;element name="REFUND_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
 *                             &lt;element name="REBOOK_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
 *                             &lt;element name="NO_SHOW_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TRAVELLER_TYPE"&gt;
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
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="LIST_SEGMENT" type="{}fareListSegmentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TICKET_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_TYPE_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_PRICE_BY_ELEMENT" type="{}ListTravellerPriceByElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PREVIOUS_LIST_TRAVELLER_PRICE_BY_ELEMENT" type="{}ListTravellerPriceByElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FARE_TYPE" minOccurs="0"&gt;
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
 *                   &lt;element name="FAMILY_FARE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_FARE_INDICATOR" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="APPLICABLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="LIST_FARE_COMMAND" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FARE_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FARE_COMMAND" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_HOST_COMMAND" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FARE_HOST_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FARE_REMARKS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FARE_REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FARE_SUCCESSFUL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MANUAL_FARING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RBD" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RBD" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="STATUS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LINE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="SEGMENT_TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AIRLINE_REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_RECONFIRMABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_RECONF_NOT_RECONF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PNR_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PRICE_BY_INPUT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_FARE_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PARAMETER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_CORPORATE_NUMBER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PARAMETER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FARE_PSEUDO_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SATURNE_FARE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FARE_CONTEXT" type="{}fareContextType" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_APPLICABLE_MARKUP_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="VALIDATING_CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_TRAVELLER_INFO" type="{}LIST_FARE_TRAVELLER_INFO_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DELETED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "fareTypeBreakDown", propOrder = {
    "listtravellertype",
    "listfarecommand",
    "farecommand",
    "listfarehostcommand",
    "listfareremarks",
    "faresuccessful",
    "manualfaring",
    "listrbd",
    "listpnrprice",
    "pricebyinput",
    "saturnefare",
    "farecontext",
    "listapplicablemarkupdiscount",
    "type",
    "validatingcarrier",
    "listfaretravellerinfo",
    "deletedelement"
})
public class FareTypeBreakDown
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER_TYPE")
    protected List<FareTypeBreakDown.LISTTRAVELLERTYPE> listtravellertype;
    @XmlElement(name = "LIST_FARE_COMMAND")
    protected List<FareTypeBreakDown.LISTFARECOMMAND> listfarecommand;
    @XmlElement(name = "FARE_COMMAND")
    protected BigInteger farecommand;
    @XmlElement(name = "LIST_FARE_HOST_COMMAND")
    protected List<FareTypeBreakDown.LISTFAREHOSTCOMMAND> listfarehostcommand;
    @XmlElement(name = "LIST_FARE_REMARKS")
    protected List<FareTypeBreakDown.LISTFAREREMARKS> listfareremarks;
    @XmlElement(name = "FARE_SUCCESSFUL")
    protected Boolean faresuccessful;
    @XmlElement(name = "MANUAL_FARING")
    protected Boolean manualfaring;
    @XmlElement(name = "LIST_RBD")
    protected List<FareTypeBreakDown.LISTRBD> listrbd;
    @XmlElement(name = "LIST_PNR_PRICE")
    protected List<TripplanPriceType> listpnrprice;
    @XmlElement(name = "PRICE_BY_INPUT")
    protected FareTypeBreakDown.PRICEBYINPUT pricebyinput;
    @XmlElement(name = "SATURNE_FARE")
    protected Boolean saturnefare;
    @XmlElement(name = "FARE_CONTEXT")
    protected FareContextType farecontext;
    @XmlElement(name = "LIST_APPLICABLE_MARKUP_DISCOUNT")
    protected List<APPLICABLEFEEType> listapplicablemarkupdiscount;
    @XmlElement(name = "TYPE", required = true)
    protected Object type;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected String validatingcarrier;
    @XmlElement(name = "LIST_FARE_TRAVELLER_INFO")
    protected List<LISTFARETRAVELLERINFOType> listfaretravellerinfo;
    @XmlElement(name = "DELETED_ELEMENT")
    protected Boolean deletedelement;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link FareTypeBreakDown.LISTTRAVELLERTYPE }
     * 
     * 
     */
    public List<FareTypeBreakDown.LISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<FareTypeBreakDown.LISTTRAVELLERTYPE>();
        }
        return this.listtravellertype;
    }

    /**
     * Gets the value of the listfarecommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarecommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECOMMAND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareTypeBreakDown.LISTFARECOMMAND }
     * 
     * 
     */
    public List<FareTypeBreakDown.LISTFARECOMMAND> getLISTFARECOMMAND() {
        if (listfarecommand == null) {
            listfarecommand = new ArrayList<FareTypeBreakDown.LISTFARECOMMAND>();
        }
        return this.listfarecommand;
    }

    /**
     * Gets the value of the farecommand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFARECOMMAND() {
        return farecommand;
    }

    /**
     * Sets the value of the farecommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFARECOMMAND(BigInteger value) {
        this.farecommand = value;
    }

    /**
     * Gets the value of the listfarehostcommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarehostcommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREHOSTCOMMAND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareTypeBreakDown.LISTFAREHOSTCOMMAND }
     * 
     * 
     */
    public List<FareTypeBreakDown.LISTFAREHOSTCOMMAND> getLISTFAREHOSTCOMMAND() {
        if (listfarehostcommand == null) {
            listfarehostcommand = new ArrayList<FareTypeBreakDown.LISTFAREHOSTCOMMAND>();
        }
        return this.listfarehostcommand;
    }

    /**
     * Gets the value of the listfareremarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareremarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREREMARKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareTypeBreakDown.LISTFAREREMARKS }
     * 
     * 
     */
    public List<FareTypeBreakDown.LISTFAREREMARKS> getLISTFAREREMARKS() {
        if (listfareremarks == null) {
            listfareremarks = new ArrayList<FareTypeBreakDown.LISTFAREREMARKS>();
        }
        return this.listfareremarks;
    }

    /**
     * Gets the value of the faresuccessful property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFARESUCCESSFUL() {
        return faresuccessful;
    }

    /**
     * Sets the value of the faresuccessful property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFARESUCCESSFUL(Boolean value) {
        this.faresuccessful = value;
    }

    /**
     * Gets the value of the manualfaring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMANUALFARING() {
        return manualfaring;
    }

    /**
     * Sets the value of the manualfaring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMANUALFARING(Boolean value) {
        this.manualfaring = value;
    }

    /**
     * Gets the value of the listrbd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrbd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRBD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareTypeBreakDown.LISTRBD }
     * 
     * 
     */
    public List<FareTypeBreakDown.LISTRBD> getLISTRBD() {
        if (listrbd == null) {
            listrbd = new ArrayList<FareTypeBreakDown.LISTRBD>();
        }
        return this.listrbd;
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
     * Gets the value of the pricebyinput property.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeBreakDown.PRICEBYINPUT }
     *     
     */
    public FareTypeBreakDown.PRICEBYINPUT getPRICEBYINPUT() {
        return pricebyinput;
    }

    /**
     * Sets the value of the pricebyinput property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeBreakDown.PRICEBYINPUT }
     *     
     */
    public void setPRICEBYINPUT(FareTypeBreakDown.PRICEBYINPUT value) {
        this.pricebyinput = value;
    }

    /**
     * Gets the value of the saturnefare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSATURNEFARE() {
        return saturnefare;
    }

    /**
     * Sets the value of the saturnefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSATURNEFARE(Boolean value) {
        this.saturnefare = value;
    }

    /**
     * Gets the value of the farecontext property.
     * 
     * @return
     *     possible object is
     *     {@link FareContextType }
     *     
     */
    public FareContextType getFARECONTEXT() {
        return farecontext;
    }

    /**
     * Sets the value of the farecontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareContextType }
     *     
     */
    public void setFARECONTEXT(FareContextType value) {
        this.farecontext = value;
    }

    /**
     * Gets the value of the listapplicablemarkupdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapplicablemarkupdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPPLICABLEMARKUPDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPLICABLEFEEType }
     * 
     * 
     */
    public List<APPLICABLEFEEType> getLISTAPPLICABLEMARKUPDISCOUNT() {
        if (listapplicablemarkupdiscount == null) {
            listapplicablemarkupdiscount = new ArrayList<APPLICABLEFEEType>();
        }
        return this.listapplicablemarkupdiscount;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTYPE(Object value) {
        this.type = value;
    }

    /**
     * Gets the value of the validatingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATINGCARRIER() {
        return validatingcarrier;
    }

    /**
     * Sets the value of the validatingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATINGCARRIER(String value) {
        this.validatingcarrier = value;
    }

    /**
     * Gets the value of the listfaretravellerinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfaretravellerinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARETRAVELLERINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARETRAVELLERINFOType }
     * 
     * 
     */
    public List<LISTFARETRAVELLERINFOType> getLISTFARETRAVELLERINFO() {
        if (listfaretravellerinfo == null) {
            listfaretravellerinfo = new ArrayList<LISTFARETRAVELLERINFOType>();
        }
        return this.listfaretravellerinfo;
    }

    /**
     * Gets the value of the deletedelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDELETEDELEMENT() {
        return deletedelement;
    }

    /**
     * Sets the value of the deletedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDELETEDELEMENT(Boolean value) {
        this.deletedelement = value;
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
     *         &lt;element name="FARE_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "farecommand"
    })
    public static class LISTFARECOMMAND
        implements Serializable
    {

        @XmlElement(name = "FARE_COMMAND")
        protected String farecommand;

        /**
         * Gets the value of the farecommand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFARECOMMAND() {
            return farecommand;
        }

        /**
         * Sets the value of the farecommand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFARECOMMAND(String value) {
            this.farecommand = value;
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
     *         &lt;element name="FARE_HOST_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "farehostcommand"
    })
    public static class LISTFAREHOSTCOMMAND
        implements Serializable
    {

        @XmlElement(name = "FARE_HOST_COMMAND")
        protected String farehostcommand;

        /**
         * Gets the value of the farehostcommand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAREHOSTCOMMAND() {
            return farehostcommand;
        }

        /**
         * Sets the value of the farehostcommand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAREHOSTCOMMAND(String value) {
            this.farehostcommand = value;
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
     *         &lt;element name="FARE_REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "fareremark"
    })
    public static class LISTFAREREMARKS
        implements Serializable
    {

        @XmlElement(name = "FARE_REMARK")
        protected String fareremark;

        /**
         * Gets the value of the fareremark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAREREMARK() {
            return fareremark;
        }

        /**
         * Sets the value of the fareremark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAREREMARK(String value) {
            this.fareremark = value;
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
     *         &lt;element name="RBD" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="STATUS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LINE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SEGMENT_TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE_REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="IS_RECONFIRMABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_RECONF_NOT_RECONF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "rbd",
        "segmentid",
        "status",
        "linenumber",
        "segmenttattoo",
        "airlinerecloc",
        "isreconfirmable",
        "isreconfnotreconf"
    })
    public static class LISTRBD
        implements Serializable
    {

        @XmlElement(name = "RBD", required = true)
        protected String rbd;
        @XmlElement(name = "SEGMENT_ID", required = true)
        protected BigInteger segmentid;
        @XmlElement(name = "STATUS")
        protected FareTypeBreakDown.LISTRBD.STATUS status;
        @XmlElement(name = "LINE_NUMBER")
        protected String linenumber;
        @XmlElement(name = "SEGMENT_TATTOO")
        protected String segmenttattoo;
        @XmlElement(name = "AIRLINE_REC_LOC")
        protected String airlinerecloc;
        @XmlElement(name = "IS_RECONFIRMABLE")
        protected Boolean isreconfirmable;
        @XmlElement(name = "IS_RECONF_NOT_RECONF")
        protected Boolean isreconfnotreconf;

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
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link FareTypeBreakDown.LISTRBD.STATUS }
         *     
         */
        public FareTypeBreakDown.LISTRBD.STATUS getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareTypeBreakDown.LISTRBD.STATUS }
         *     
         */
        public void setSTATUS(FareTypeBreakDown.LISTRBD.STATUS value) {
            this.status = value;
        }

        /**
         * Gets the value of the linenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINENUMBER() {
            return linenumber;
        }

        /**
         * Sets the value of the linenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINENUMBER(String value) {
            this.linenumber = value;
        }

        /**
         * Gets the value of the segmenttattoo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEGMENTTATTOO() {
            return segmenttattoo;
        }

        /**
         * Sets the value of the segmenttattoo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEGMENTTATTOO(String value) {
            this.segmenttattoo = value;
        }

        /**
         * Gets the value of the airlinerecloc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRLINERECLOC() {
            return airlinerecloc;
        }

        /**
         * Sets the value of the airlinerecloc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRLINERECLOC(String value) {
            this.airlinerecloc = value;
        }

        /**
         * Gets the value of the isreconfirmable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISRECONFIRMABLE() {
            return isreconfirmable;
        }

        /**
         * Sets the value of the isreconfirmable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISRECONFIRMABLE(Boolean value) {
            this.isreconfirmable = value;
        }

        /**
         * Gets the value of the isreconfnotreconf property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISRECONFNOTRECONF() {
            return isreconfnotreconf;
        }

        /**
         * Sets the value of the isreconfnotreconf property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISRECONFNOTRECONF(Boolean value) {
            this.isreconfnotreconf = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class STATUS
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
     *         &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="HAS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_PRIMARY_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="REQUESTED_TRAVELLER_TYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ORIGINAL_TICKET" type="{}ticketType" minOccurs="0"/&gt;
     *                   &lt;element name="ORIGINAL_TICKET_BREAKDOWN" type="{}ticketType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="TICKET" type="{}ticketType" minOccurs="0"/&gt;
     *                   &lt;element name="REBOOKED_TICKET" type="{}ticketType" minOccurs="0"/&gt;
     *                   &lt;element name="REBOOK_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
     *                   &lt;element name="COLLECT_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
     *                   &lt;element name="REFUND_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
     *                   &lt;element name="REBOOK_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
     *                   &lt;element name="NO_SHOW_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TRAVELLER_TYPE"&gt;
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
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="LIST_SEGMENT" type="{}fareListSegmentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TICKET_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_TYPE_PRICE" type="{}tripplanPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_PRICE_BY_ELEMENT" type="{}ListTravellerPriceByElement" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PREVIOUS_LIST_TRAVELLER_PRICE_BY_ELEMENT" type="{}ListTravellerPriceByElement" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FARE_TYPE" minOccurs="0"&gt;
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
     *         &lt;element name="FAMILY_FARE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="LIST_FARE_INDICATOR" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="APPLICABLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "listtraveller",
        "travellertype",
        "number",
        "listsegment",
        "ticketindicator",
        "listtravellerprice",
        "listtravellertypeprice",
        "listtravellerpricebyelement",
        "previouslisttravellerpricebyelement",
        "faretype",
        "familyfare",
        "listfareindicator"
    })
    public static class LISTTRAVELLERTYPE
        implements Serializable
    {

        @XmlElement(name = "LIST_TRAVELLER", required = true)
        protected List<FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER> listtraveller;
        @XmlElement(name = "TRAVELLER_TYPE", required = true)
        protected FareTypeBreakDown.LISTTRAVELLERTYPE.TRAVELLERTYPE travellertype;
        @XmlElement(name = "NUMBER", required = true)
        protected BigInteger number;
        @XmlElement(name = "LIST_SEGMENT")
        protected List<FareListSegmentsType> listsegment;
        @XmlElement(name = "TICKET_INDICATOR")
        protected String ticketindicator;
        @XmlElement(name = "LIST_TRAVELLER_PRICE")
        protected List<TripplanPriceType> listtravellerprice;
        @XmlElement(name = "LIST_TRAVELLER_TYPE_PRICE")
        protected List<TripplanPriceType> listtravellertypeprice;
        @XmlElement(name = "LIST_TRAVELLER_PRICE_BY_ELEMENT")
        protected List<ListTravellerPriceByElement> listtravellerpricebyelement;
        @XmlElement(name = "PREVIOUS_LIST_TRAVELLER_PRICE_BY_ELEMENT")
        protected List<ListTravellerPriceByElement> previouslisttravellerpricebyelement;
        @XmlElement(name = "FARE_TYPE")
        protected FareTypeBreakDown.LISTTRAVELLERTYPE.FARETYPE faretype;
        @XmlElement(name = "FAMILY_FARE")
        protected Boolean familyfare;
        @XmlElement(name = "LIST_FARE_INDICATOR")
        protected List<FareTypeBreakDown.LISTTRAVELLERTYPE.LISTFAREINDICATOR> listfareindicator;

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
         * {@link FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER }
         * 
         * 
         */
        public List<FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER> getLISTTRAVELLER() {
            if (listtraveller == null) {
                listtraveller = new ArrayList<FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER>();
            }
            return this.listtraveller;
        }

        /**
         * Gets the value of the travellertype property.
         * 
         * @return
         *     possible object is
         *     {@link FareTypeBreakDown.LISTTRAVELLERTYPE.TRAVELLERTYPE }
         *     
         */
        public FareTypeBreakDown.LISTTRAVELLERTYPE.TRAVELLERTYPE getTRAVELLERTYPE() {
            return travellertype;
        }

        /**
         * Sets the value of the travellertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareTypeBreakDown.LISTTRAVELLERTYPE.TRAVELLERTYPE }
         *     
         */
        public void setTRAVELLERTYPE(FareTypeBreakDown.LISTTRAVELLERTYPE.TRAVELLERTYPE value) {
            this.travellertype = value;
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
         * {@link FareListSegmentsType }
         * 
         * 
         */
        public List<FareListSegmentsType> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<FareListSegmentsType>();
            }
            return this.listsegment;
        }

        /**
         * Gets the value of the ticketindicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETINDICATOR() {
            return ticketindicator;
        }

        /**
         * Sets the value of the ticketindicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETINDICATOR(String value) {
            this.ticketindicator = value;
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
         * {@link TripplanPriceType }
         * 
         * 
         */
        public List<TripplanPriceType> getLISTTRAVELLERPRICE() {
            if (listtravellerprice == null) {
                listtravellerprice = new ArrayList<TripplanPriceType>();
            }
            return this.listtravellerprice;
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
         * {@link TripplanPriceType }
         * 
         * 
         */
        public List<TripplanPriceType> getLISTTRAVELLERTYPEPRICE() {
            if (listtravellertypeprice == null) {
                listtravellertypeprice = new ArrayList<TripplanPriceType>();
            }
            return this.listtravellertypeprice;
        }

        /**
         * Gets the value of the listtravellerpricebyelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerpricebyelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERPRICEBYELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListTravellerPriceByElement }
         * 
         * 
         */
        public List<ListTravellerPriceByElement> getLISTTRAVELLERPRICEBYELEMENT() {
            if (listtravellerpricebyelement == null) {
                listtravellerpricebyelement = new ArrayList<ListTravellerPriceByElement>();
            }
            return this.listtravellerpricebyelement;
        }

        /**
         * Gets the value of the previouslisttravellerpricebyelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previouslisttravellerpricebyelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPREVIOUSLISTTRAVELLERPRICEBYELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListTravellerPriceByElement }
         * 
         * 
         */
        public List<ListTravellerPriceByElement> getPREVIOUSLISTTRAVELLERPRICEBYELEMENT() {
            if (previouslisttravellerpricebyelement == null) {
                previouslisttravellerpricebyelement = new ArrayList<ListTravellerPriceByElement>();
            }
            return this.previouslisttravellerpricebyelement;
        }

        /**
         * Gets the value of the faretype property.
         * 
         * @return
         *     possible object is
         *     {@link FareTypeBreakDown.LISTTRAVELLERTYPE.FARETYPE }
         *     
         */
        public FareTypeBreakDown.LISTTRAVELLERTYPE.FARETYPE getFARETYPE() {
            return faretype;
        }

        /**
         * Sets the value of the faretype property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareTypeBreakDown.LISTTRAVELLERTYPE.FARETYPE }
         *     
         */
        public void setFARETYPE(FareTypeBreakDown.LISTTRAVELLERTYPE.FARETYPE value) {
            this.faretype = value;
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
         * Gets the value of the listfareindicator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfareindicator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFAREINDICATOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareTypeBreakDown.LISTTRAVELLERTYPE.LISTFAREINDICATOR }
         * 
         * 
         */
        public List<FareTypeBreakDown.LISTTRAVELLERTYPE.LISTFAREINDICATOR> getLISTFAREINDICATOR() {
            if (listfareindicator == null) {
                listfareindicator = new ArrayList<FareTypeBreakDown.LISTTRAVELLERTYPE.LISTFAREINDICATOR>();
            }
            return this.listfareindicator;
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
        public static class FARETYPE
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="APPLICABLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "applicable"
        })
        public static class LISTFAREINDICATOR
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "APPLICABLE", required = true)
            protected String applicable;

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
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAPPLICABLE() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAPPLICABLE(String value) {
                this.applicable = value;
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
         *         &lt;element name="HAS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_PRIMARY_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="REQUESTED_TRAVELLER_TYPE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ORIGINAL_TICKET" type="{}ticketType" minOccurs="0"/&gt;
         *         &lt;element name="ORIGINAL_TICKET_BREAKDOWN" type="{}ticketType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="TICKET" type="{}ticketType" minOccurs="0"/&gt;
         *         &lt;element name="REBOOKED_TICKET" type="{}ticketType" minOccurs="0"/&gt;
         *         &lt;element name="REBOOK_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
         *         &lt;element name="COLLECT_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
         *         &lt;element name="REFUND_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
         *         &lt;element name="REBOOK_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
         *         &lt;element name="NO_SHOW_FEE" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
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
            "travellerid",
            "requestedtravellertype",
            "originalticket",
            "originalticketbreakdown",
            "ticket",
            "rebookedticket",
            "rebookbalance",
            "collectbalance",
            "refundbalance",
            "rebookfee",
            "noshowfee"
        })
        public static class LISTTRAVELLER
            implements Serializable
        {

            @XmlElement(name = "HAS_INFANT")
            protected Boolean hasinfant;
            @XmlElement(name = "IS_PRIMARY_TRAVELLER")
            protected Boolean isprimarytraveller;
            @XmlElement(name = "TRAVELLER_ID")
            protected BigInteger travellerid;
            @XmlElement(name = "REQUESTED_TRAVELLER_TYPE")
            protected FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER.REQUESTEDTRAVELLERTYPE requestedtravellertype;
            @XmlElement(name = "ORIGINAL_TICKET")
            protected TicketType originalticket;
            @XmlElement(name = "ORIGINAL_TICKET_BREAKDOWN")
            protected List<TicketType> originalticketbreakdown;
            @XmlElement(name = "TICKET")
            protected TicketType ticket;
            @XmlElement(name = "REBOOKED_TICKET")
            protected TicketType rebookedticket;
            @XmlElement(name = "REBOOK_BALANCE")
            protected REBOOKBALANCEType rebookbalance;
            @XmlElement(name = "COLLECT_BALANCE")
            protected REBOOKBALANCEType collectbalance;
            @XmlElement(name = "REFUND_BALANCE")
            protected REBOOKBALANCEType refundbalance;
            @XmlElement(name = "REBOOK_FEE")
            protected REBOOKFEEType rebookfee;
            @XmlElement(name = "NO_SHOW_FEE")
            protected REBOOKFEEType noshowfee;

            /**
             * Gets the value of the hasinfant property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHASINFANT() {
                return hasinfant;
            }

            /**
             * Sets the value of the hasinfant property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHASINFANT(Boolean value) {
                this.hasinfant = value;
            }

            /**
             * Gets the value of the isprimarytraveller property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISPRIMARYTRAVELLER() {
                return isprimarytraveller;
            }

            /**
             * Sets the value of the isprimarytraveller property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISPRIMARYTRAVELLER(Boolean value) {
                this.isprimarytraveller = value;
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
             * Gets the value of the requestedtravellertype property.
             * 
             * @return
             *     possible object is
             *     {@link FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER.REQUESTEDTRAVELLERTYPE }
             *     
             */
            public FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER.REQUESTEDTRAVELLERTYPE getREQUESTEDTRAVELLERTYPE() {
                return requestedtravellertype;
            }

            /**
             * Sets the value of the requestedtravellertype property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER.REQUESTEDTRAVELLERTYPE }
             *     
             */
            public void setREQUESTEDTRAVELLERTYPE(FareTypeBreakDown.LISTTRAVELLERTYPE.LISTTRAVELLER.REQUESTEDTRAVELLERTYPE value) {
                this.requestedtravellertype = value;
            }

            /**
             * Gets the value of the originalticket property.
             * 
             * @return
             *     possible object is
             *     {@link TicketType }
             *     
             */
            public TicketType getORIGINALTICKET() {
                return originalticket;
            }

            /**
             * Sets the value of the originalticket property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketType }
             *     
             */
            public void setORIGINALTICKET(TicketType value) {
                this.originalticket = value;
            }

            /**
             * Gets the value of the originalticketbreakdown property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the originalticketbreakdown property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getORIGINALTICKETBREAKDOWN().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketType }
             * 
             * 
             */
            public List<TicketType> getORIGINALTICKETBREAKDOWN() {
                if (originalticketbreakdown == null) {
                    originalticketbreakdown = new ArrayList<TicketType>();
                }
                return this.originalticketbreakdown;
            }

            /**
             * Gets the value of the ticket property.
             * 
             * @return
             *     possible object is
             *     {@link TicketType }
             *     
             */
            public TicketType getTICKET() {
                return ticket;
            }

            /**
             * Sets the value of the ticket property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketType }
             *     
             */
            public void setTICKET(TicketType value) {
                this.ticket = value;
            }

            /**
             * Gets the value of the rebookedticket property.
             * 
             * @return
             *     possible object is
             *     {@link TicketType }
             *     
             */
            public TicketType getREBOOKEDTICKET() {
                return rebookedticket;
            }

            /**
             * Sets the value of the rebookedticket property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketType }
             *     
             */
            public void setREBOOKEDTICKET(TicketType value) {
                this.rebookedticket = value;
            }

            /**
             * Gets the value of the rebookbalance property.
             * 
             * @return
             *     possible object is
             *     {@link REBOOKBALANCEType }
             *     
             */
            public REBOOKBALANCEType getREBOOKBALANCE() {
                return rebookbalance;
            }

            /**
             * Sets the value of the rebookbalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link REBOOKBALANCEType }
             *     
             */
            public void setREBOOKBALANCE(REBOOKBALANCEType value) {
                this.rebookbalance = value;
            }

            /**
             * Gets the value of the collectbalance property.
             * 
             * @return
             *     possible object is
             *     {@link REBOOKBALANCEType }
             *     
             */
            public REBOOKBALANCEType getCOLLECTBALANCE() {
                return collectbalance;
            }

            /**
             * Sets the value of the collectbalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link REBOOKBALANCEType }
             *     
             */
            public void setCOLLECTBALANCE(REBOOKBALANCEType value) {
                this.collectbalance = value;
            }

            /**
             * Gets the value of the refundbalance property.
             * 
             * @return
             *     possible object is
             *     {@link REBOOKBALANCEType }
             *     
             */
            public REBOOKBALANCEType getREFUNDBALANCE() {
                return refundbalance;
            }

            /**
             * Sets the value of the refundbalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link REBOOKBALANCEType }
             *     
             */
            public void setREFUNDBALANCE(REBOOKBALANCEType value) {
                this.refundbalance = value;
            }

            /**
             * Gets the value of the rebookfee property.
             * 
             * @return
             *     possible object is
             *     {@link REBOOKFEEType }
             *     
             */
            public REBOOKFEEType getREBOOKFEE() {
                return rebookfee;
            }

            /**
             * Sets the value of the rebookfee property.
             * 
             * @param value
             *     allowed object is
             *     {@link REBOOKFEEType }
             *     
             */
            public void setREBOOKFEE(REBOOKFEEType value) {
                this.rebookfee = value;
            }

            /**
             * Gets the value of the noshowfee property.
             * 
             * @return
             *     possible object is
             *     {@link REBOOKFEEType }
             *     
             */
            public REBOOKFEEType getNOSHOWFEE() {
                return noshowfee;
            }

            /**
             * Sets the value of the noshowfee property.
             * 
             * @param value
             *     allowed object is
             *     {@link REBOOKFEEType }
             *     
             */
            public void setNOSHOWFEE(REBOOKFEEType value) {
                this.noshowfee = value;
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            public static class REQUESTEDTRAVELLERTYPE
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
        public static class TRAVELLERTYPE
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
     *         &lt;element name="LIST_FARE_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PARAMETER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_CORPORATE_NUMBER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PARAMETER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FARE_PSEUDO_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "listfareparameter",
        "listcorporatenumber",
        "farepseudocity",
        "typeofcorporatefare"
    })
    public static class PRICEBYINPUT
        implements Serializable
    {

        @XmlElement(name = "LIST_FARE_PARAMETER")
        protected List<FareTypeBreakDown.PRICEBYINPUT.LISTFAREPARAMETER> listfareparameter;
        @XmlElement(name = "LIST_CORPORATE_NUMBER")
        protected List<FareTypeBreakDown.PRICEBYINPUT.LISTCORPORATENUMBER> listcorporatenumber;
        @XmlElement(name = "FARE_PSEUDO_CITY")
        protected String farepseudocity;
        @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
        protected BigInteger typeofcorporatefare;

        /**
         * Gets the value of the listfareparameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfareparameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFAREPARAMETER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareTypeBreakDown.PRICEBYINPUT.LISTFAREPARAMETER }
         * 
         * 
         */
        public List<FareTypeBreakDown.PRICEBYINPUT.LISTFAREPARAMETER> getLISTFAREPARAMETER() {
            if (listfareparameter == null) {
                listfareparameter = new ArrayList<FareTypeBreakDown.PRICEBYINPUT.LISTFAREPARAMETER>();
            }
            return this.listfareparameter;
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
         * {@link FareTypeBreakDown.PRICEBYINPUT.LISTCORPORATENUMBER }
         * 
         * 
         */
        public List<FareTypeBreakDown.PRICEBYINPUT.LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
            if (listcorporatenumber == null) {
                listcorporatenumber = new ArrayList<FareTypeBreakDown.PRICEBYINPUT.LISTCORPORATENUMBER>();
            }
            return this.listcorporatenumber;
        }

        /**
         * Gets the value of the farepseudocity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAREPSEUDOCITY() {
            return farepseudocity;
        }

        /**
         * Sets the value of the farepseudocity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAREPSEUDOCITY(String value) {
            this.farepseudocity = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PARAMETER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "parameterid"
        })
        public static class LISTCORPORATENUMBER
            implements Serializable
        {

            @XmlElement(name = "PARAMETER_ID")
            protected String parameterid;

            /**
             * Gets the value of the parameterid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPARAMETERID() {
                return parameterid;
            }

            /**
             * Sets the value of the parameterid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPARAMETERID(String value) {
                this.parameterid = value;
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
         *         &lt;element name="PARAMETER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "parameterid"
        })
        public static class LISTFAREPARAMETER
            implements Serializable
        {

            @XmlElement(name = "PARAMETER_ID")
            protected String parameterid;

            /**
             * Gets the value of the parameterid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPARAMETERID() {
                return parameterid;
            }

            /**
             * Sets the value of the parameterid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPARAMETERID(String value) {
                this.parameterid = value;
            }

        }

    }

}
