
package com.koreanair.eretail.pojo.air.airavailabilityoutputavailability;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.air.common.LISTITINERARYMILESCOSTTYPE;
import com.koreanair.eretail.pojo.air.commonout.AVAILABILITYType;
import com.koreanair.eretail.pojo.air.commonout.CABINType;
import com.koreanair.eretail.pojo.air.commonout.TRAVELLERType;
import com.koreanair.eretail.pojo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.eretail.pojo.common.common.APISRULESTYPE;
import com.koreanair.eretail.pojo.common.common.LISTMSG;
import com.koreanair.eretail.pojo.common.common.LISTPROPOSEFAREDISCOUNT;
import com.koreanair.eretail.pojo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.eretail.pojo.profile.commonprofileout.LISTFREQUENTFLYERTYPE;


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
 *         &lt;element ref="{}LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_AVAILABILITY" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FIELD_ERROR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}DEFAULT_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ALLOWED_CABIN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PROPOSE_FARE_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}RESTRICTION" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ITINERARY_MILES_COST" type="{}LIST_ITINERARY_MILES_COST_TYPE" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonOutputGroup"/&gt;
 *         &lt;element name="FLOW_SIGNATURE" type="{}FLOW_SIGNATURE_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SEGMENT_ID" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID_TYPE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="SEGMENT_ID"/&gt;
 *                                   &lt;enumeration value="SEGMENT_TATTOO"/&gt;
 *                                   &lt;enumeration value="LINE_NUMBER"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ID_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
 *         &lt;element name="TEMPLATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CLID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_CARRIER_CODE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVEL_SPONSOR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
 *               &lt;/extension&gt;
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
    "listtraveller",
    "listavailability",
    "listmsg",
    "listfielderror",
    "defaultcabin",
    "listallowedcabin",
    "listproposefarediscount",
    "restriction",
    "listitinerarymilescost",
    "listexternalid",
    "frompage",
    "apismanageroutput",
    "apisrules",
    "apiscollectionmode",
    "flowsignature",
    "listbound",
    "template",
    "listclid",
    "travelsponsor"
})
@XmlRootElement(name = "AirAvailabilityOutputAvailability")
public class AirAvailabilityOutputAvailability
    implements Serializable
{

    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TRAVELLERType> listtraveller;
    @XmlElement(name = "LIST_AVAILABILITY", required = true)
    protected List<AVAILABILITYType> listavailability;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_FIELD_ERROR")
    protected List<String> listfielderror;
    @XmlElement(name = "DEFAULT_CABIN")
    protected String defaultcabin;
    @XmlElement(name = "LIST_ALLOWED_CABIN")
    protected List<CABINType> listallowedcabin;
    @XmlElement(name = "LIST_PROPOSE_FARE_DISCOUNT")
    protected List<LISTPROPOSEFAREDISCOUNT> listproposefarediscount;
    @XmlElement(name = "RESTRICTION")
    protected Boolean restriction;
    @XmlElement(name = "LIST_ITINERARY_MILES_COST")
    protected List<LISTITINERARYMILESCOSTTYPE> listitinerarymilescost;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<Object> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "APIS_MANAGER_OUTPUT")
    protected APISMANAGEROUTPUTTYPE apismanageroutput;
    @XmlElement(name = "APIS_RULES")
    protected APISRULESTYPE apisrules;
    @XmlElement(name = "APIS_COLLECTION_MODE")
    protected Object apiscollectionmode;
    @XmlElement(name = "FLOW_SIGNATURE")
    protected FLOWSIGNATUREType flowsignature;
    @XmlElement(name = "LIST_BOUND")
    protected List<AirAvailabilityOutputAvailability.LISTBOUND> listbound;
    @XmlElement(name = "TEMPLATE")
    protected String template;
    @XmlElement(name = "LIST_CLID")
    protected List<AirAvailabilityOutputAvailability.LISTCLID> listclid;
    @XmlElement(name = "TRAVEL_SPONSOR")
    protected AirAvailabilityOutputAvailability.TRAVELSPONSOR travelsponsor;
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
     * {@link TRAVELLERType }
     * 
     * 
     */
    public List<TRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the listavailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listavailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAVAILABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AVAILABILITYType }
     * 
     * 
     */
    public List<AVAILABILITYType> getLISTAVAILABILITY() {
        if (listavailability == null) {
            listavailability = new ArrayList<AVAILABILITYType>();
        }
        return this.listavailability;
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
     * Gets the value of the defaultcabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTCABIN() {
        return defaultcabin;
    }

    /**
     * Sets the value of the defaultcabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTCABIN(String value) {
        this.defaultcabin = value;
    }

    /**
     * Gets the value of the listallowedcabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listallowedcabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTALLOWEDCABIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CABINType }
     * 
     * 
     */
    public List<CABINType> getLISTALLOWEDCABIN() {
        if (listallowedcabin == null) {
            listallowedcabin = new ArrayList<CABINType>();
        }
        return this.listallowedcabin;
    }

    /**
     * Gets the value of the listproposefarediscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproposefarediscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROPOSEFAREDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPROPOSEFAREDISCOUNT }
     * 
     * 
     */
    public List<LISTPROPOSEFAREDISCOUNT> getLISTPROPOSEFAREDISCOUNT() {
        if (listproposefarediscount == null) {
            listproposefarediscount = new ArrayList<LISTPROPOSEFAREDISCOUNT>();
        }
        return this.listproposefarediscount;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESTRICTION() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESTRICTION(Boolean value) {
        this.restriction = value;
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
     * {@link LISTITINERARYMILESCOSTTYPE }
     * 
     * 
     */
    public List<LISTITINERARYMILESCOSTTYPE> getLISTITINERARYMILESCOST() {
        if (listitinerarymilescost == null) {
            listitinerarymilescost = new ArrayList<LISTITINERARYMILESCOSTTYPE>();
        }
        return this.listitinerarymilescost;
    }

    /**
     * Gets the value of the listexternalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<Object>();
        }
        return this.listexternalid;
    }

    /**
     * Gets the value of the frompage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROMPAGE() {
        return frompage;
    }

    /**
     * Sets the value of the frompage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROMPAGE(Object value) {
        this.frompage = value;
    }

    /**
     * Gets the value of the apismanageroutput property.
     * 
     * @return
     *     possible object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public APISMANAGEROUTPUTTYPE getAPISMANAGEROUTPUT() {
        return apismanageroutput;
    }

    /**
     * Sets the value of the apismanageroutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public void setAPISMANAGEROUTPUT(APISMANAGEROUTPUTTYPE value) {
        this.apismanageroutput = value;
    }

    /**
     * Gets the value of the apisrules property.
     * 
     * @return
     *     possible object is
     *     {@link APISRULESTYPE }
     *     
     */
    public APISRULESTYPE getAPISRULES() {
        return apisrules;
    }

    /**
     * Sets the value of the apisrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRULESTYPE }
     *     
     */
    public void setAPISRULES(APISRULESTYPE value) {
        this.apisrules = value;
    }

    /**
     * Gets the value of the apiscollectionmode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCOLLECTIONMODE() {
        return apiscollectionmode;
    }

    /**
     * Sets the value of the apiscollectionmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCOLLECTIONMODE(Object value) {
        this.apiscollectionmode = value;
    }

    /**
     * Gets the value of the flowsignature property.
     * 
     * @return
     *     possible object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public FLOWSIGNATUREType getFLOWSIGNATURE() {
        return flowsignature;
    }

    /**
     * Sets the value of the flowsignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public void setFLOWSIGNATURE(FLOWSIGNATUREType value) {
        this.flowsignature = value;
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
     * {@link AirAvailabilityOutputAvailability.LISTBOUND }
     * 
     * 
     */
    public List<AirAvailabilityOutputAvailability.LISTBOUND> getLISTBOUND() {
        if (listbound == null) {
            listbound = new ArrayList<AirAvailabilityOutputAvailability.LISTBOUND>();
        }
        return this.listbound;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPLATE() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPLATE(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the listclid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listclid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCLID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAvailabilityOutputAvailability.LISTCLID }
     * 
     * 
     */
    public List<AirAvailabilityOutputAvailability.LISTCLID> getLISTCLID() {
        if (listclid == null) {
            listclid = new ArrayList<AirAvailabilityOutputAvailability.LISTCLID>();
        }
        return this.listclid;
    }

    /**
     * Gets the value of the travelsponsor property.
     * 
     * @return
     *     possible object is
     *     {@link AirAvailabilityOutputAvailability.TRAVELSPONSOR }
     *     
     */
    public AirAvailabilityOutputAvailability.TRAVELSPONSOR getTRAVELSPONSOR() {
        return travelsponsor;
    }

    /**
     * Sets the value of the travelsponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirAvailabilityOutputAvailability.TRAVELSPONSOR }
     *     
     */
    public void setTRAVELSPONSOR(AirAvailabilityOutputAvailability.TRAVELSPONSOR value) {
        this.travelsponsor = value;
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
     *         &lt;element name="LIST_SEGMENT_ID" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID_TYPE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="SEGMENT_ID"/&gt;
     *                         &lt;enumeration value="SEGMENT_TATTOO"/&gt;
     *                         &lt;enumeration value="LINE_NUMBER"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ID_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "listsegmentid"
    })
    public static class LISTBOUND
        implements Serializable
    {

        @XmlElement(name = "LIST_SEGMENT_ID", required = true)
        protected List<AirAvailabilityOutputAvailability.LISTBOUND.LISTSEGMENTID> listsegmentid;

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
         * {@link AirAvailabilityOutputAvailability.LISTBOUND.LISTSEGMENTID }
         * 
         * 
         */
        public List<AirAvailabilityOutputAvailability.LISTBOUND.LISTSEGMENTID> getLISTSEGMENTID() {
            if (listsegmentid == null) {
                listsegmentid = new ArrayList<AirAvailabilityOutputAvailability.LISTBOUND.LISTSEGMENTID>();
            }
            return this.listsegmentid;
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
         *         &lt;element name="ID_TYPE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="SEGMENT_ID"/&gt;
         *               &lt;enumeration value="SEGMENT_TATTOO"/&gt;
         *               &lt;enumeration value="LINE_NUMBER"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ID_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "idtype",
            "idvalue"
        })
        public static class LISTSEGMENTID
            implements Serializable
        {

            @XmlElement(name = "ID_TYPE", required = true)
            protected String idtype;
            @XmlElement(name = "ID_VALUE", required = true)
            protected Object idvalue;

            /**
             * Gets the value of the idtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDTYPE() {
                return idtype;
            }

            /**
             * Sets the value of the idtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDTYPE(String value) {
                this.idtype = value;
            }

            /**
             * Gets the value of the idvalue property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getIDVALUE() {
                return idvalue;
            }

            /**
             * Sets the value of the idvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setIDVALUE(Object value) {
                this.idvalue = value;
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
     *         &lt;element name="LIST_CARRIER_CODE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "listcarriercode",
        "clididentifier"
    })
    public static class LISTCLID
        implements Serializable
    {

        @XmlElement(name = "LIST_CARRIER_CODE", required = true)
        protected List<AirAvailabilityOutputAvailability.LISTCLID.LISTCARRIERCODE> listcarriercode;
        @XmlElement(name = "CLID_IDENTIFIER", required = true)
        protected Object clididentifier;

        /**
         * Gets the value of the listcarriercode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcarriercode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCARRIERCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAvailabilityOutputAvailability.LISTCLID.LISTCARRIERCODE }
         * 
         * 
         */
        public List<AirAvailabilityOutputAvailability.LISTCLID.LISTCARRIERCODE> getLISTCARRIERCODE() {
            if (listcarriercode == null) {
                listcarriercode = new ArrayList<AirAvailabilityOutputAvailability.LISTCLID.LISTCARRIERCODE>();
            }
            return this.listcarriercode;
        }

        /**
         * Gets the value of the clididentifier property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCLIDIDENTIFIER() {
            return clididentifier;
        }

        /**
         * Sets the value of the clididentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCLIDIDENTIFIER(Object value) {
            this.clididentifier = value;
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
         *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "carriercode"
        })
        public static class LISTCARRIERCODE
            implements Serializable
        {

            @XmlElement(name = "CARRIER_CODE", required = true)
            protected Object carriercode;

            /**
             * Gets the value of the carriercode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCARRIERCODE() {
                return carriercode;
            }

            /**
             * Sets the value of the carriercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCARRIERCODE(Object value) {
                this.carriercode = value;
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
     *     &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TRAVELSPONSOR
        extends LISTFREQUENTFLYERTYPE
        implements Serializable
    {


    }

}
