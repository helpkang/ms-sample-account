
package com.koreanair.external.eretail.vo.seatmap.seatmapoutput2;

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
import com.koreanair.external.eretail.vo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.external.eretail.vo.common.common.APISRULESTYPE;
import com.koreanair.external.eretail.vo.seatmap.seatmapoutputcommon.AIRSEGMENT;
import com.koreanair.external.eretail.vo.seatmap.seatmapoutputcommon.DICTIONARY;
import com.koreanair.external.eretail.vo.seatmap.seatmapoutputcommon.ListColumnDeckType;
import com.koreanair.external.eretail.vo.seatmap.seatmapoutputcommon.ListMsgType;


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
 *         &lt;element name="LIST_MSG" type="{}listMsgType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}DICTIONARY" minOccurs="0"/&gt;
 *         &lt;element ref="{}AIR_SEGMENT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AIRCRAFT_MAP" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}LEG_ID" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CABIN" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{}LOCATION"/&gt;
 *                             &lt;element name="LIST_COLUMN" type="{}listColumnDeckType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_ROW" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{}INDEX"/&gt;
 *                                       &lt;element ref="{}WINGS" minOccurs="0"/&gt;
 *                                       &lt;element ref="{}BUFFER" minOccurs="0"/&gt;
 *                                       &lt;element ref="{}EMPTY" minOccurs="0"/&gt;
 *                                       &lt;element name="LIST_FACILITY" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="LOCATION"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="F"/&gt;
 *                                                       &lt;enumeration value="R"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element ref="{}TYPE"/&gt;
 *                                                 &lt;element name="POSITION"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="L"/&gt;
 *                                                       &lt;enumeration value="LC"/&gt;
 *                                                       &lt;enumeration value="C"/&gt;
 *                                                       &lt;enumeration value="RC"/&gt;
 *                                                       &lt;enumeration value="R"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="LIST_COLUMN" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;choice&gt;
 *                                                   &lt;element name="SEAT"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="WINDOW_SEAT_WITHOUT_WINDOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                                             &lt;element name="STATUS"&gt;
 *                                                               &lt;simpleType&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                   &lt;enumeration value="MISSING"/&gt;
 *                                                                   &lt;enumeration value="AVAILABLE"/&gt;
 *                                                                   &lt;enumeration value="TAKEN"/&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/simpleType&gt;
 *                                                             &lt;/element&gt;
 *                                                             &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                             &lt;element name="LIST_CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                             &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                               &lt;complexType&gt;
 *                                                                 &lt;complexContent&gt;
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                     &lt;sequence&gt;
 *                                                                       &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                                                       &lt;element name="LIST_PRICE" maxOccurs="2"&gt;
 *                                                                         &lt;complexType&gt;
 *                                                                           &lt;complexContent&gt;
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                               &lt;sequence&gt;
 *                                                                                 &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                                                                 &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                               &lt;/sequence&gt;
 *                                                                             &lt;/restriction&gt;
 *                                                                           &lt;/complexContent&gt;
 *                                                                         &lt;/complexType&gt;
 *                                                                       &lt;/element&gt;
 *                                                                       &lt;element name="PRICING_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                                       &lt;element name="DOCUMENT_REUSABILITY" minOccurs="0"&gt;
 *                                                                         &lt;simpleType&gt;
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                             &lt;enumeration value="REFUNDABLE"/&gt;
 *                                                                             &lt;enumeration value="NON_REFUNDABLE"/&gt;
 *                                                                             &lt;enumeration value="EXCHANGEABLE"/&gt;
 *                                                                           &lt;/restriction&gt;
 *                                                                         &lt;/simpleType&gt;
 *                                                                       &lt;/element&gt;
 *                                                                       &lt;element name="COMMISSION" minOccurs="0"&gt;
 *                                                                         &lt;complexType&gt;
 *                                                                           &lt;complexContent&gt;
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                               &lt;sequence&gt;
 *                                                                                 &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                                                               &lt;/sequence&gt;
 *                                                                             &lt;/restriction&gt;
 *                                                                           &lt;/complexContent&gt;
 *                                                                         &lt;/complexType&gt;
 *                                                                       &lt;/element&gt;
 *                                                                     &lt;/sequence&gt;
 *                                                                   &lt;/restriction&gt;
 *                                                                 &lt;/complexContent&gt;
 *                                                               &lt;/complexType&gt;
 *                                                             &lt;/element&gt;
 *                                                           &lt;/sequence&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                   &lt;element name="FACILITY"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                           &lt;sequence&gt;
 *                                                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;/sequence&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                 &lt;/choice&gt;
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
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{}COMMERCIAL_NAME" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;group ref="{}CommonOutputGroup"/&gt;
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
    "listmsg",
    "dictionary",
    "airsegment",
    "aircraftmap",
    "listexternalid",
    "frompage",
    "apismanageroutput",
    "apisrules",
    "apiscollectionmode"
})
@XmlRootElement(name = "SeatMapOutput2")
public class SeatMapOutput2
    implements Serializable
{

    @XmlElement(name = "LIST_MSG")
    protected List<ListMsgType> listmsg;
    @XmlElement(name = "DICTIONARY")
    protected DICTIONARY dictionary;
    @XmlElement(name = "AIR_SEGMENT")
    protected List<AIRSEGMENT> airsegment;
    @XmlElement(name = "AIRCRAFT_MAP")
    protected List<SeatMapOutput2 .AIRCRAFTMAP> aircraftmap;
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
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link ListMsgType }
     * 
     * 
     */
    public List<ListMsgType> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<ListMsgType>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link DICTIONARY }
     *     
     */
    public DICTIONARY getDICTIONARY() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DICTIONARY }
     *     
     */
    public void setDICTIONARY(DICTIONARY value) {
        this.dictionary = value;
    }

    /**
     * Gets the value of the airsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAIRSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIRSEGMENT }
     * 
     * 
     */
    public List<AIRSEGMENT> getAIRSEGMENT() {
        if (airsegment == null) {
            airsegment = new ArrayList<AIRSEGMENT>();
        }
        return this.airsegment;
    }

    /**
     * Gets the value of the aircraftmap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftmap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAIRCRAFTMAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapOutput2 .AIRCRAFTMAP }
     * 
     * 
     */
    public List<SeatMapOutput2 .AIRCRAFTMAP> getAIRCRAFTMAP() {
        if (aircraftmap == null) {
            aircraftmap = new ArrayList<SeatMapOutput2 .AIRCRAFTMAP>();
        }
        return this.aircraftmap;
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
     *         &lt;element ref="{}LEG_ID" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CABIN" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{}LOCATION"/&gt;
     *                   &lt;element name="LIST_COLUMN" type="{}listColumnDeckType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_ROW" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{}INDEX"/&gt;
     *                             &lt;element ref="{}WINGS" minOccurs="0"/&gt;
     *                             &lt;element ref="{}BUFFER" minOccurs="0"/&gt;
     *                             &lt;element ref="{}EMPTY" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_FACILITY" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LOCATION"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value="F"/&gt;
     *                                             &lt;enumeration value="R"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element ref="{}TYPE"/&gt;
     *                                       &lt;element name="POSITION"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value="L"/&gt;
     *                                             &lt;enumeration value="LC"/&gt;
     *                                             &lt;enumeration value="C"/&gt;
     *                                             &lt;enumeration value="RC"/&gt;
     *                                             &lt;enumeration value="R"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LIST_COLUMN" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;choice&gt;
     *                                         &lt;element name="SEAT"&gt;
     *                                           &lt;complexType&gt;
     *                                             &lt;complexContent&gt;
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                 &lt;sequence&gt;
     *                                                   &lt;element name="WINDOW_SEAT_WITHOUT_WINDOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                                   &lt;element name="STATUS"&gt;
     *                                                     &lt;simpleType&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                         &lt;enumeration value="MISSING"/&gt;
     *                                                         &lt;enumeration value="AVAILABLE"/&gt;
     *                                                         &lt;enumeration value="TAKEN"/&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/simpleType&gt;
     *                                                   &lt;/element&gt;
     *                                                   &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                   &lt;element name="LIST_CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                                   &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                     &lt;complexType&gt;
     *                                                       &lt;complexContent&gt;
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                           &lt;sequence&gt;
     *                                                             &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                                                             &lt;element name="LIST_PRICE" maxOccurs="2"&gt;
     *                                                               &lt;complexType&gt;
     *                                                                 &lt;complexContent&gt;
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                     &lt;sequence&gt;
     *                                                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                                                                       &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                                     &lt;/sequence&gt;
     *                                                                   &lt;/restriction&gt;
     *                                                                 &lt;/complexContent&gt;
     *                                                               &lt;/complexType&gt;
     *                                                             &lt;/element&gt;
     *                                                             &lt;element name="PRICING_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                             &lt;element name="DOCUMENT_REUSABILITY" minOccurs="0"&gt;
     *                                                               &lt;simpleType&gt;
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                   &lt;enumeration value="REFUNDABLE"/&gt;
     *                                                                   &lt;enumeration value="NON_REFUNDABLE"/&gt;
     *                                                                   &lt;enumeration value="EXCHANGEABLE"/&gt;
     *                                                                 &lt;/restriction&gt;
     *                                                               &lt;/simpleType&gt;
     *                                                             &lt;/element&gt;
     *                                                             &lt;element name="COMMISSION" minOccurs="0"&gt;
     *                                                               &lt;complexType&gt;
     *                                                                 &lt;complexContent&gt;
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                     &lt;sequence&gt;
     *                                                                       &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                                                     &lt;/sequence&gt;
     *                                                                   &lt;/restriction&gt;
     *                                                                 &lt;/complexContent&gt;
     *                                                               &lt;/complexType&gt;
     *                                                             &lt;/element&gt;
     *                                                           &lt;/sequence&gt;
     *                                                         &lt;/restriction&gt;
     *                                                       &lt;/complexContent&gt;
     *                                                     &lt;/complexType&gt;
     *                                                   &lt;/element&gt;
     *                                                 &lt;/sequence&gt;
     *                                               &lt;/restriction&gt;
     *                                             &lt;/complexContent&gt;
     *                                           &lt;/complexType&gt;
     *                                         &lt;/element&gt;
     *                                         &lt;element name="FACILITY"&gt;
     *                                           &lt;complexType&gt;
     *                                             &lt;complexContent&gt;
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                 &lt;sequence&gt;
     *                                                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;/sequence&gt;
     *                                               &lt;/restriction&gt;
     *                                             &lt;/complexContent&gt;
     *                                           &lt;/complexType&gt;
     *                                         &lt;/element&gt;
     *                                       &lt;/choice&gt;
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
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{}COMMERCIAL_NAME" minOccurs="0"/&gt;
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
        "legid",
        "listcabin",
        "commercialname"
    })
    public static class AIRCRAFTMAP
        implements Serializable
    {

        @XmlElement(name = "LEG_ID")
        protected String legid;
        @XmlElement(name = "LIST_CABIN", required = true)
        protected List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN> listcabin;
        @XmlElement(name = "COMMERCIAL_NAME")
        protected Object commercialname;

        /**
         * Gets the value of the legid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLEGID() {
            return legid;
        }

        /**
         * Sets the value of the legid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLEGID(String value) {
            this.legid = value;
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
         * {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN }
         * 
         * 
         */
        public List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN> getLISTCABIN() {
            if (listcabin == null) {
                listcabin = new ArrayList<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN>();
            }
            return this.listcabin;
        }

        /**
         * Gets the value of the commercialname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCOMMERCIALNAME() {
            return commercialname;
        }

        /**
         * Sets the value of the commercialname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCOMMERCIALNAME(Object value) {
            this.commercialname = value;
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
         *         &lt;element ref="{}LOCATION"/&gt;
         *         &lt;element name="LIST_COLUMN" type="{}listColumnDeckType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_ROW" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{}INDEX"/&gt;
         *                   &lt;element ref="{}WINGS" minOccurs="0"/&gt;
         *                   &lt;element ref="{}BUFFER" minOccurs="0"/&gt;
         *                   &lt;element ref="{}EMPTY" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_FACILITY" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LOCATION"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;enumeration value="F"/&gt;
         *                                   &lt;enumeration value="R"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element ref="{}TYPE"/&gt;
         *                             &lt;element name="POSITION"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;enumeration value="L"/&gt;
         *                                   &lt;enumeration value="LC"/&gt;
         *                                   &lt;enumeration value="C"/&gt;
         *                                   &lt;enumeration value="RC"/&gt;
         *                                   &lt;enumeration value="R"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LIST_COLUMN" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;choice&gt;
         *                               &lt;element name="SEAT"&gt;
         *                                 &lt;complexType&gt;
         *                                   &lt;complexContent&gt;
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                       &lt;sequence&gt;
         *                                         &lt;element name="WINDOW_SEAT_WITHOUT_WINDOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                                         &lt;element name="STATUS"&gt;
         *                                           &lt;simpleType&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                               &lt;enumeration value="MISSING"/&gt;
         *                                               &lt;enumeration value="AVAILABLE"/&gt;
         *                                               &lt;enumeration value="TAKEN"/&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/simpleType&gt;
         *                                         &lt;/element&gt;
         *                                         &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                         &lt;element name="LIST_CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                                         &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                           &lt;complexType&gt;
         *                                             &lt;complexContent&gt;
         *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                 &lt;sequence&gt;
         *                                                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                                                   &lt;element name="LIST_PRICE" maxOccurs="2"&gt;
         *                                                     &lt;complexType&gt;
         *                                                       &lt;complexContent&gt;
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                           &lt;sequence&gt;
         *                                                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                                                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                           &lt;/sequence&gt;
         *                                                         &lt;/restriction&gt;
         *                                                       &lt;/complexContent&gt;
         *                                                     &lt;/complexType&gt;
         *                                                   &lt;/element&gt;
         *                                                   &lt;element name="PRICING_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                                   &lt;element name="DOCUMENT_REUSABILITY" minOccurs="0"&gt;
         *                                                     &lt;simpleType&gt;
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                         &lt;enumeration value="REFUNDABLE"/&gt;
         *                                                         &lt;enumeration value="NON_REFUNDABLE"/&gt;
         *                                                         &lt;enumeration value="EXCHANGEABLE"/&gt;
         *                                                       &lt;/restriction&gt;
         *                                                     &lt;/simpleType&gt;
         *                                                   &lt;/element&gt;
         *                                                   &lt;element name="COMMISSION" minOccurs="0"&gt;
         *                                                     &lt;complexType&gt;
         *                                                       &lt;complexContent&gt;
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                           &lt;sequence&gt;
         *                                                             &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                                                           &lt;/sequence&gt;
         *                                                         &lt;/restriction&gt;
         *                                                       &lt;/complexContent&gt;
         *                                                     &lt;/complexType&gt;
         *                                                   &lt;/element&gt;
         *                                                 &lt;/sequence&gt;
         *                                               &lt;/restriction&gt;
         *                                             &lt;/complexContent&gt;
         *                                           &lt;/complexType&gt;
         *                                         &lt;/element&gt;
         *                                       &lt;/sequence&gt;
         *                                     &lt;/restriction&gt;
         *                                   &lt;/complexContent&gt;
         *                                 &lt;/complexType&gt;
         *                               &lt;/element&gt;
         *                               &lt;element name="FACILITY"&gt;
         *                                 &lt;complexType&gt;
         *                                   &lt;complexContent&gt;
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                       &lt;sequence&gt;
         *                                         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;/sequence&gt;
         *                                     &lt;/restriction&gt;
         *                                   &lt;/complexContent&gt;
         *                                 &lt;/complexType&gt;
         *                               &lt;/element&gt;
         *                             &lt;/choice&gt;
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
            "location",
            "listcolumn",
            "listrow"
        })
        public static class LISTCABIN
            implements Serializable
        {

            @XmlElement(name = "LOCATION", required = true)
            protected String location;
            @XmlElement(name = "LIST_COLUMN")
            protected List<ListColumnDeckType> listcolumn;
            @XmlElement(name = "LIST_ROW")
            protected List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW> listrow;

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCATION() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCATION(String value) {
                this.location = value;
            }

            /**
             * Gets the value of the listcolumn property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcolumn property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCOLUMN().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ListColumnDeckType }
             * 
             * 
             */
            public List<ListColumnDeckType> getLISTCOLUMN() {
                if (listcolumn == null) {
                    listcolumn = new ArrayList<ListColumnDeckType>();
                }
                return this.listcolumn;
            }

            /**
             * Gets the value of the listrow property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listrow property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTROW().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW }
             * 
             * 
             */
            public List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW> getLISTROW() {
                if (listrow == null) {
                    listrow = new ArrayList<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW>();
                }
                return this.listrow;
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
             *         &lt;element ref="{}INDEX"/&gt;
             *         &lt;element ref="{}WINGS" minOccurs="0"/&gt;
             *         &lt;element ref="{}BUFFER" minOccurs="0"/&gt;
             *         &lt;element ref="{}EMPTY" minOccurs="0"/&gt;
             *         &lt;element name="LIST_FACILITY" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LOCATION"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;enumeration value="F"/&gt;
             *                         &lt;enumeration value="R"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element ref="{}TYPE"/&gt;
             *                   &lt;element name="POSITION"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;enumeration value="L"/&gt;
             *                         &lt;enumeration value="LC"/&gt;
             *                         &lt;enumeration value="C"/&gt;
             *                         &lt;enumeration value="RC"/&gt;
             *                         &lt;enumeration value="R"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="LIST_COLUMN" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;choice&gt;
             *                     &lt;element name="SEAT"&gt;
             *                       &lt;complexType&gt;
             *                         &lt;complexContent&gt;
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                             &lt;sequence&gt;
             *                               &lt;element name="WINDOW_SEAT_WITHOUT_WINDOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                               &lt;element name="STATUS"&gt;
             *                                 &lt;simpleType&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                     &lt;enumeration value="MISSING"/&gt;
             *                                     &lt;enumeration value="AVAILABLE"/&gt;
             *                                     &lt;enumeration value="TAKEN"/&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/simpleType&gt;
             *                               &lt;/element&gt;
             *                               &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                               &lt;element name="LIST_CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                               &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
             *                                 &lt;complexType&gt;
             *                                   &lt;complexContent&gt;
             *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                       &lt;sequence&gt;
             *                                         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *                                         &lt;element name="LIST_PRICE" maxOccurs="2"&gt;
             *                                           &lt;complexType&gt;
             *                                             &lt;complexContent&gt;
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                 &lt;sequence&gt;
             *                                                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *                                                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                                 &lt;/sequence&gt;
             *                                               &lt;/restriction&gt;
             *                                             &lt;/complexContent&gt;
             *                                           &lt;/complexType&gt;
             *                                         &lt;/element&gt;
             *                                         &lt;element name="PRICING_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                                         &lt;element name="DOCUMENT_REUSABILITY" minOccurs="0"&gt;
             *                                           &lt;simpleType&gt;
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                               &lt;enumeration value="REFUNDABLE"/&gt;
             *                                               &lt;enumeration value="NON_REFUNDABLE"/&gt;
             *                                               &lt;enumeration value="EXCHANGEABLE"/&gt;
             *                                             &lt;/restriction&gt;
             *                                           &lt;/simpleType&gt;
             *                                         &lt;/element&gt;
             *                                         &lt;element name="COMMISSION" minOccurs="0"&gt;
             *                                           &lt;complexType&gt;
             *                                             &lt;complexContent&gt;
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                                 &lt;sequence&gt;
             *                                                   &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                                                 &lt;/sequence&gt;
             *                                               &lt;/restriction&gt;
             *                                             &lt;/complexContent&gt;
             *                                           &lt;/complexType&gt;
             *                                         &lt;/element&gt;
             *                                       &lt;/sequence&gt;
             *                                     &lt;/restriction&gt;
             *                                   &lt;/complexContent&gt;
             *                                 &lt;/complexType&gt;
             *                               &lt;/element&gt;
             *                             &lt;/sequence&gt;
             *                           &lt;/restriction&gt;
             *                         &lt;/complexContent&gt;
             *                       &lt;/complexType&gt;
             *                     &lt;/element&gt;
             *                     &lt;element name="FACILITY"&gt;
             *                       &lt;complexType&gt;
             *                         &lt;complexContent&gt;
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                             &lt;sequence&gt;
             *                               &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;/sequence&gt;
             *                           &lt;/restriction&gt;
             *                         &lt;/complexContent&gt;
             *                       &lt;/complexType&gt;
             *                     &lt;/element&gt;
             *                   &lt;/choice&gt;
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
                "index",
                "wings",
                "buffer",
                "empty",
                "listfacility",
                "listcolumn"
            })
            public static class LISTROW
                implements Serializable
            {

                @XmlElement(name = "INDEX", required = true)
                protected String index;
                @XmlElement(name = "WINGS", defaultValue = "false")
                protected Boolean wings;
                @XmlElement(name = "BUFFER", defaultValue = "false")
                protected Boolean buffer;
                @XmlElement(name = "EMPTY", defaultValue = "false")
                protected Boolean empty;
                @XmlElement(name = "LIST_FACILITY")
                protected List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTFACILITY> listfacility;
                @XmlElement(name = "LIST_COLUMN")
                protected List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN> listcolumn;

                /**
                 * Gets the value of the index property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINDEX() {
                    return index;
                }

                /**
                 * Sets the value of the index property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINDEX(String value) {
                    this.index = value;
                }

                /**
                 * Gets the value of the wings property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isWINGS() {
                    return wings;
                }

                /**
                 * Sets the value of the wings property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setWINGS(Boolean value) {
                    this.wings = value;
                }

                /**
                 * Gets the value of the buffer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isBUFFER() {
                    return buffer;
                }

                /**
                 * Sets the value of the buffer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setBUFFER(Boolean value) {
                    this.buffer = value;
                }

                /**
                 * Gets the value of the empty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isEMPTY() {
                    return empty;
                }

                /**
                 * Sets the value of the empty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setEMPTY(Boolean value) {
                    this.empty = value;
                }

                /**
                 * Gets the value of the listfacility property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listfacility property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTFACILITY().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTFACILITY }
                 * 
                 * 
                 */
                public List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTFACILITY> getLISTFACILITY() {
                    if (listfacility == null) {
                        listfacility = new ArrayList<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTFACILITY>();
                    }
                    return this.listfacility;
                }

                /**
                 * Gets the value of the listcolumn property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listcolumn property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTCOLUMN().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN }
                 * 
                 * 
                 */
                public List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN> getLISTCOLUMN() {
                    if (listcolumn == null) {
                        listcolumn = new ArrayList<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN>();
                    }
                    return this.listcolumn;
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
                 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;choice&gt;
                 *           &lt;element name="SEAT"&gt;
                 *             &lt;complexType&gt;
                 *               &lt;complexContent&gt;
                 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                   &lt;sequence&gt;
                 *                     &lt;element name="WINDOW_SEAT_WITHOUT_WINDOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *                     &lt;element name="STATUS"&gt;
                 *                       &lt;simpleType&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                           &lt;enumeration value="MISSING"/&gt;
                 *                           &lt;enumeration value="AVAILABLE"/&gt;
                 *                           &lt;enumeration value="TAKEN"/&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/simpleType&gt;
                 *                     &lt;/element&gt;
                 *                     &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                     &lt;element name="LIST_CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *                     &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                       &lt;complexType&gt;
                 *                         &lt;complexContent&gt;
                 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                             &lt;sequence&gt;
                 *                               &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                 *                               &lt;element name="LIST_PRICE" maxOccurs="2"&gt;
                 *                                 &lt;complexType&gt;
                 *                                   &lt;complexContent&gt;
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                       &lt;sequence&gt;
                 *                                         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                 *                                         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                                       &lt;/sequence&gt;
                 *                                     &lt;/restriction&gt;
                 *                                   &lt;/complexContent&gt;
                 *                                 &lt;/complexType&gt;
                 *                               &lt;/element&gt;
                 *                               &lt;element name="PRICING_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                               &lt;element name="DOCUMENT_REUSABILITY" minOccurs="0"&gt;
                 *                                 &lt;simpleType&gt;
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                     &lt;enumeration value="REFUNDABLE"/&gt;
                 *                                     &lt;enumeration value="NON_REFUNDABLE"/&gt;
                 *                                     &lt;enumeration value="EXCHANGEABLE"/&gt;
                 *                                   &lt;/restriction&gt;
                 *                                 &lt;/simpleType&gt;
                 *                               &lt;/element&gt;
                 *                               &lt;element name="COMMISSION" minOccurs="0"&gt;
                 *                                 &lt;complexType&gt;
                 *                                   &lt;complexContent&gt;
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                       &lt;sequence&gt;
                 *                                         &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
                 *                                       &lt;/sequence&gt;
                 *                                     &lt;/restriction&gt;
                 *                                   &lt;/complexContent&gt;
                 *                                 &lt;/complexType&gt;
                 *                               &lt;/element&gt;
                 *                             &lt;/sequence&gt;
                 *                           &lt;/restriction&gt;
                 *                         &lt;/complexContent&gt;
                 *                       &lt;/complexType&gt;
                 *                     &lt;/element&gt;
                 *                   &lt;/sequence&gt;
                 *                 &lt;/restriction&gt;
                 *               &lt;/complexContent&gt;
                 *             &lt;/complexType&gt;
                 *           &lt;/element&gt;
                 *           &lt;element name="FACILITY"&gt;
                 *             &lt;complexType&gt;
                 *               &lt;complexContent&gt;
                 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                   &lt;sequence&gt;
                 *                     &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;/sequence&gt;
                 *                 &lt;/restriction&gt;
                 *               &lt;/complexContent&gt;
                 *             &lt;/complexType&gt;
                 *           &lt;/element&gt;
                 *         &lt;/choice&gt;
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
                    "index",
                    "seat",
                    "facility"
                })
                public static class LISTCOLUMN
                    implements Serializable
                {

                    @XmlElement(name = "INDEX", required = true)
                    protected String index;
                    @XmlElement(name = "SEAT")
                    protected SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT seat;
                    @XmlElement(name = "FACILITY")
                    protected SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.FACILITY facility;

                    /**
                     * Gets the value of the index property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getINDEX() {
                        return index;
                    }

                    /**
                     * Sets the value of the index property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setINDEX(String value) {
                        this.index = value;
                    }

                    /**
                     * Gets the value of the seat property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT }
                     *     
                     */
                    public SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT getSEAT() {
                        return seat;
                    }

                    /**
                     * Sets the value of the seat property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT }
                     *     
                     */
                    public void setSEAT(SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT value) {
                        this.seat = value;
                    }

                    /**
                     * Gets the value of the facility property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.FACILITY }
                     *     
                     */
                    public SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.FACILITY getFACILITY() {
                        return facility;
                    }

                    /**
                     * Sets the value of the facility property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.FACILITY }
                     *     
                     */
                    public void setFACILITY(SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.FACILITY value) {
                        this.facility = value;
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
                     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                        "type"
                    })
                    public static class FACILITY
                        implements Serializable
                    {

                        @XmlElement(name = "TYPE", required = true)
                        protected String type;

                        /**
                         * Gets the value of the type property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTYPE() {
                            return type;
                        }

                        /**
                         * Sets the value of the type property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTYPE(String value) {
                            this.type = value;
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
                     *         &lt;element name="WINDOW_SEAT_WITHOUT_WINDOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                     *         &lt;element name="STATUS"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *               &lt;enumeration value="MISSING"/&gt;
                     *               &lt;enumeration value="AVAILABLE"/&gt;
                     *               &lt;enumeration value="TAKEN"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="LIST_CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
                     *         &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                     *                   &lt;element name="LIST_PRICE" maxOccurs="2"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;complexContent&gt;
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                           &lt;sequence&gt;
                     *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                     *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                           &lt;/sequence&gt;
                     *                         &lt;/restriction&gt;
                     *                       &lt;/complexContent&gt;
                     *                     &lt;/complexType&gt;
                     *                   &lt;/element&gt;
                     *                   &lt;element name="PRICING_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *                   &lt;element name="DOCUMENT_REUSABILITY" minOccurs="0"&gt;
                     *                     &lt;simpleType&gt;
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                         &lt;enumeration value="REFUNDABLE"/&gt;
                     *                         &lt;enumeration value="NON_REFUNDABLE"/&gt;
                     *                         &lt;enumeration value="EXCHANGEABLE"/&gt;
                     *                       &lt;/restriction&gt;
                     *                     &lt;/simpleType&gt;
                     *                   &lt;/element&gt;
                     *                   &lt;element name="COMMISSION" minOccurs="0"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;complexContent&gt;
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                           &lt;sequence&gt;
                     *                             &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                        "windowseatwithoutwindow",
                        "status",
                        "occupation",
                        "listcharacteristic",
                        "listtraveller"
                    })
                    public static class SEAT
                        implements Serializable
                    {

                        @XmlElement(name = "WINDOW_SEAT_WITHOUT_WINDOW", defaultValue = "false")
                        protected Boolean windowseatwithoutwindow;
                        @XmlElement(name = "STATUS", required = true)
                        protected String status;
                        @XmlElement(name = "OCCUPATION")
                        protected String occupation;
                        @XmlElement(name = "LIST_CHARACTERISTIC")
                        protected List<Object> listcharacteristic;
                        @XmlElement(name = "LIST_TRAVELLER")
                        protected List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER> listtraveller;

                        /**
                         * Gets the value of the windowseatwithoutwindow property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isWINDOWSEATWITHOUTWINDOW() {
                            return windowseatwithoutwindow;
                        }

                        /**
                         * Sets the value of the windowseatwithoutwindow property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setWINDOWSEATWITHOUTWINDOW(Boolean value) {
                            this.windowseatwithoutwindow = value;
                        }

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
                         * Gets the value of the occupation property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOCCUPATION() {
                            return occupation;
                        }

                        /**
                         * Sets the value of the occupation property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOCCUPATION(String value) {
                            this.occupation = value;
                        }

                        /**
                         * Gets the value of the listcharacteristic property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the listcharacteristic property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getLISTCHARACTERISTIC().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getLISTCHARACTERISTIC() {
                            if (listcharacteristic == null) {
                                listcharacteristic = new ArrayList<Object>();
                            }
                            return this.listcharacteristic;
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
                         * {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER }
                         * 
                         * 
                         */
                        public List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER> getLISTTRAVELLER() {
                            if (listtraveller == null) {
                                listtraveller = new ArrayList<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER>();
                            }
                            return this.listtraveller;
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
                         *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                         *         &lt;element name="LIST_PRICE" maxOccurs="2"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;complexContent&gt;
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                 &lt;sequence&gt;
                         *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                         *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *                 &lt;/sequence&gt;
                         *               &lt;/restriction&gt;
                         *             &lt;/complexContent&gt;
                         *           &lt;/complexType&gt;
                         *         &lt;/element&gt;
                         *         &lt;element name="PRICING_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                         *         &lt;element name="DOCUMENT_REUSABILITY" minOccurs="0"&gt;
                         *           &lt;simpleType&gt;
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *               &lt;enumeration value="REFUNDABLE"/&gt;
                         *               &lt;enumeration value="NON_REFUNDABLE"/&gt;
                         *               &lt;enumeration value="EXCHANGEABLE"/&gt;
                         *             &lt;/restriction&gt;
                         *           &lt;/simpleType&gt;
                         *         &lt;/element&gt;
                         *         &lt;element name="COMMISSION" minOccurs="0"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;complexContent&gt;
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                 &lt;sequence&gt;
                         *                   &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                            "travellerid",
                            "listprice",
                            "pricingdescription",
                            "documentreusability",
                            "commission"
                        })
                        public static class LISTTRAVELLER
                            implements Serializable
                        {

                            @XmlElement(name = "TRAVELLER_ID", required = true)
                            protected Object travellerid;
                            @XmlElement(name = "LIST_PRICE", required = true)
                            protected List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.LISTPRICE> listprice;
                            @XmlElement(name = "PRICING_DESCRIPTION")
                            protected String pricingdescription;
                            @XmlElement(name = "DOCUMENT_REUSABILITY")
                            protected String documentreusability;
                            @XmlElement(name = "COMMISSION")
                            protected SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.COMMISSION commission;

                            /**
                             * Gets the value of the travellerid property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Object }
                             *     
                             */
                            public Object getTRAVELLERID() {
                                return travellerid;
                            }

                            /**
                             * Sets the value of the travellerid property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Object }
                             *     
                             */
                            public void setTRAVELLERID(Object value) {
                                this.travellerid = value;
                            }

                            /**
                             * Gets the value of the listprice property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the listprice property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getLISTPRICE().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.LISTPRICE }
                             * 
                             * 
                             */
                            public List<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.LISTPRICE> getLISTPRICE() {
                                if (listprice == null) {
                                    listprice = new ArrayList<SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.LISTPRICE>();
                                }
                                return this.listprice;
                            }

                            /**
                             * Gets the value of the pricingdescription property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPRICINGDESCRIPTION() {
                                return pricingdescription;
                            }

                            /**
                             * Sets the value of the pricingdescription property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPRICINGDESCRIPTION(String value) {
                                this.pricingdescription = value;
                            }

                            /**
                             * Gets the value of the documentreusability property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDOCUMENTREUSABILITY() {
                                return documentreusability;
                            }

                            /**
                             * Sets the value of the documentreusability property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDOCUMENTREUSABILITY(String value) {
                                this.documentreusability = value;
                            }

                            /**
                             * Gets the value of the commission property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.COMMISSION }
                             *     
                             */
                            public SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.COMMISSION getCOMMISSION() {
                                return commission;
                            }

                            /**
                             * Sets the value of the commission property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.COMMISSION }
                             *     
                             */
                            public void setCOMMISSION(SeatMapOutput2 .AIRCRAFTMAP.LISTCABIN.LISTROW.LISTCOLUMN.SEAT.LISTTRAVELLER.COMMISSION value) {
                                this.commission = value;
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
                             *         &lt;element name="COMMISSION_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                                "commissionavailable"
                            })
                            public static class COMMISSION
                                implements Serializable
                            {

                                @XmlElement(name = "COMMISSION_AVAILABLE")
                                protected Object commissionavailable;

                                /**
                                 * Gets the value of the commissionavailable property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Object }
                                 *     
                                 */
                                public Object getCOMMISSIONAVAILABLE() {
                                    return commissionavailable;
                                }

                                /**
                                 * Sets the value of the commissionavailable property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Object }
                                 *     
                                 */
                                public void setCOMMISSIONAVAILABLE(Object value) {
                                    this.commissionavailable = value;
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
                             *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                             *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                                "value",
                                "currency"
                            })
                            public static class LISTPRICE
                                implements Serializable
                            {

                                @XmlElement(name = "VALUE")
                                protected float value;
                                @XmlElement(name = "CURRENCY", required = true)
                                protected String currency;

                                /**
                                 * Gets the value of the value property.
                                 * 
                                 */
                                public float getVALUE() {
                                    return value;
                                }

                                /**
                                 * Sets the value of the value property.
                                 * 
                                 */
                                public void setVALUE(float value) {
                                    this.value = value;
                                }

                                /**
                                 * Gets the value of the currency property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCURRENCY() {
                                    return currency;
                                }

                                /**
                                 * Sets the value of the currency property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCURRENCY(String value) {
                                    this.currency = value;
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
                 *         &lt;element name="LOCATION"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;enumeration value="F"/&gt;
                 *               &lt;enumeration value="R"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element ref="{}TYPE"/&gt;
                 *         &lt;element name="POSITION"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;enumeration value="L"/&gt;
                 *               &lt;enumeration value="LC"/&gt;
                 *               &lt;enumeration value="C"/&gt;
                 *               &lt;enumeration value="RC"/&gt;
                 *               &lt;enumeration value="R"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
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
                    "location",
                    "type",
                    "position"
                })
                public static class LISTFACILITY
                    implements Serializable
                {

                    @XmlElement(name = "LOCATION", required = true)
                    protected String location;
                    @XmlElement(name = "TYPE", required = true)
                    protected String type;
                    @XmlElement(name = "POSITION", required = true)
                    protected String position;

                    /**
                     * Gets the value of the location property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLOCATION() {
                        return location;
                    }

                    /**
                     * Sets the value of the location property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLOCATION(String value) {
                        this.location = value;
                    }

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTYPE() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTYPE(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the position property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPOSITION() {
                        return position;
                    }

                    /**
                     * Sets the value of the position property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPOSITION(String value) {
                        this.position = value;
                    }

                }

            }

        }

    }

}
