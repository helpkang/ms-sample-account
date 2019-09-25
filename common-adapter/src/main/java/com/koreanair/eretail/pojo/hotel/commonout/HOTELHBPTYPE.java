
package com.koreanair.eretail.pojo.hotel.commonout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.commonelementsout.CHECKINPOLICYTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HOTELDESCRIPTIVECONTENTSUBSETTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HTLRATETYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.LISTPACKAGETYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.LISTRATE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.MARKUP;
import com.koreanair.eretail.pojo.hotel.commonelementsout.MULTIMEDIATYPE;


/**
 * This XSD type is used to represent a hotel: rate codes, prices, descriptive content, chain ...
 * 
 * <p>Java class for HOTEL_HBP_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_HBP_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}HOTEL_DUPE_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CHECK_IN_POLICY" type="{}CHECK_IN_POLICY_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="HOST_CURRENCY_CONVERTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEATURE_TO_CHECK" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_RATE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_AVAILABLE_RATE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISPLAYED_RATE" type="{}HTL_RATE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ROOM" type="{}RULES_DRIVEN_ROOM_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PACKAGE" type="{}LIST_PACKAGE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MULTIMEDIA" type="{}MULTIMEDIA_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTIVE_CONTENT" type="{}HOTEL_DESCRIPTIVE_CONTENT_SUBSET_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SPECIAL_PRICES" type="{}HOTEL_SPECIAL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}MARKUP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_HBP_TYPE", propOrder = {
    "checkinpolicy",
    "hostcurrencyconverted",
    "listfeaturetocheck",
    "listrate",
    "listavailablerate",
    "listdisplayedrate",
    "listroom",
    "listpackage",
    "multimedia",
    "descriptivecontent",
    "listspecialprices",
    "markup"
})
@XmlSeeAlso({
    HOTELMULTISOURCETYPE.class
})
public class HOTELHBPTYPE
    extends HOTELDUPETYPE
{

    @XmlElement(name = "CHECK_IN_POLICY")
    protected CHECKINPOLICYTYPE checkinpolicy;
    @XmlElement(name = "HOST_CURRENCY_CONVERTED")
    protected Boolean hostcurrencyconverted;
    @XmlElement(name = "LIST_FEATURE_TO_CHECK")
    protected List<String> listfeaturetocheck;
    @XmlElement(name = "LIST_RATE")
    protected List<LISTRATE> listrate;
    @XmlElement(name = "LIST_AVAILABLE_RATE")
    protected List<String> listavailablerate;
    @XmlElement(name = "LIST_DISPLAYED_RATE")
    protected List<HTLRATETYPE> listdisplayedrate;
    @XmlElement(name = "LIST_ROOM")
    protected List<RULESDRIVENROOMTYPE> listroom;
    @XmlElement(name = "LIST_PACKAGE")
    protected List<LISTPACKAGETYPE> listpackage;
    @XmlElement(name = "MULTIMEDIA")
    protected MULTIMEDIATYPE multimedia;
    @XmlElement(name = "DESCRIPTIVE_CONTENT")
    protected HOTELDESCRIPTIVECONTENTSUBSETTYPE descriptivecontent;
    @XmlElement(name = "LIST_SPECIAL_PRICES")
    protected List<HOTELSPECIALPRICETYPE> listspecialprices;
    @XmlElement(name = "MARKUP")
    protected MARKUP markup;

    /**
     * Gets the value of the checkinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CHECKINPOLICYTYPE }
     *     
     */
    public CHECKINPOLICYTYPE getCHECKINPOLICY() {
        return checkinpolicy;
    }

    /**
     * Sets the value of the checkinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHECKINPOLICYTYPE }
     *     
     */
    public void setCHECKINPOLICY(CHECKINPOLICYTYPE value) {
        this.checkinpolicy = value;
    }

    /**
     * Gets the value of the hostcurrencyconverted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOSTCURRENCYCONVERTED() {
        return hostcurrencyconverted;
    }

    /**
     * Sets the value of the hostcurrencyconverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOSTCURRENCYCONVERTED(Boolean value) {
        this.hostcurrencyconverted = value;
    }

    /**
     * Gets the value of the listfeaturetocheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfeaturetocheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEATURETOCHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFEATURETOCHECK() {
        if (listfeaturetocheck == null) {
            listfeaturetocheck = new ArrayList<String>();
        }
        return this.listfeaturetocheck;
    }

    /**
     * Gets the value of the listrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRATE }
     * 
     * 
     */
    public List<LISTRATE> getLISTRATE() {
        if (listrate == null) {
            listrate = new ArrayList<LISTRATE>();
        }
        return this.listrate;
    }

    /**
     * Gets the value of the listavailablerate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listavailablerate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAVAILABLERATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTAVAILABLERATE() {
        if (listavailablerate == null) {
            listavailablerate = new ArrayList<String>();
        }
        return this.listavailablerate;
    }

    /**
     * Gets the value of the listdisplayedrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdisplayedrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISPLAYEDRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTLRATETYPE }
     * 
     * 
     */
    public List<HTLRATETYPE> getLISTDISPLAYEDRATE() {
        if (listdisplayedrate == null) {
            listdisplayedrate = new ArrayList<HTLRATETYPE>();
        }
        return this.listdisplayedrate;
    }

    /**
     * Gets the value of the listroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RULESDRIVENROOMTYPE }
     * 
     * 
     */
    public List<RULESDRIVENROOMTYPE> getLISTROOM() {
        if (listroom == null) {
            listroom = new ArrayList<RULESDRIVENROOMTYPE>();
        }
        return this.listroom;
    }

    /**
     * Gets the value of the listpackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPACKAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPACKAGETYPE }
     * 
     * 
     */
    public List<LISTPACKAGETYPE> getLISTPACKAGE() {
        if (listpackage == null) {
            listpackage = new ArrayList<LISTPACKAGETYPE>();
        }
        return this.listpackage;
    }

    /**
     * Gets the value of the multimedia property.
     * 
     * @return
     *     possible object is
     *     {@link MULTIMEDIATYPE }
     *     
     */
    public MULTIMEDIATYPE getMULTIMEDIA() {
        return multimedia;
    }

    /**
     * Sets the value of the multimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIMEDIATYPE }
     *     
     */
    public void setMULTIMEDIA(MULTIMEDIATYPE value) {
        this.multimedia = value;
    }

    /**
     * Gets the value of the descriptivecontent property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELDESCRIPTIVECONTENTSUBSETTYPE }
     *     
     */
    public HOTELDESCRIPTIVECONTENTSUBSETTYPE getDESCRIPTIVECONTENT() {
        return descriptivecontent;
    }

    /**
     * Sets the value of the descriptivecontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELDESCRIPTIVECONTENTSUBSETTYPE }
     *     
     */
    public void setDESCRIPTIVECONTENT(HOTELDESCRIPTIVECONTENTSUBSETTYPE value) {
        this.descriptivecontent = value;
    }

    /**
     * Gets the value of the listspecialprices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialprices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALPRICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELSPECIALPRICETYPE }
     * 
     * 
     */
    public List<HOTELSPECIALPRICETYPE> getLISTSPECIALPRICES() {
        if (listspecialprices == null) {
            listspecialprices = new ArrayList<HOTELSPECIALPRICETYPE>();
        }
        return this.listspecialprices;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link MARKUP }
     *     
     */
    public MARKUP getMARKUP() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKUP }
     *     
     */
    public void setMARKUP(MARKUP value) {
        this.markup = value;
    }

}
