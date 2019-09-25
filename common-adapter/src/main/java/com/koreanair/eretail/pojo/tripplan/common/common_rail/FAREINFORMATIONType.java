
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains all informations related to fare (fare class, fare flexibility...)
 * 
 * <p>Java class for FARE_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SEGMENT_ID" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CONDITION" type="{}CODE_DESCRIPTOR_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROVIDER_FARE_GROUP" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RATE_TYPE" type="{}CODE_DESCRIPTOR_Type"/&gt;
 *         &lt;element name="FLEXIBILITY_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_CLASS" type="{}PROVIDER_CODE_DESCRIPTOR_Type" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RESERVATION_TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="POSSIBLE"/&gt;
 *               &lt;enumeration value="IMPOSSIBLE"/&gt;
 *               &lt;enumeration value="MANDATORY"/&gt;
 *               &lt;enumeration value="ADVISED"/&gt;
 *               &lt;enumeration value="possible"/&gt;
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
@XmlType(name = "FARE_INFORMATION_Type", propOrder = {
    "listsegmentid",
    "listtravellerid",
    "listcondition",
    "listproviderfaregroup",
    "ratetype",
    "flexibilitytype",
    "fareclass",
    "farefamily",
    "reservationtype"
})
public class FAREINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "LIST_SEGMENT_ID", required = true)
    protected List<String> listsegmentid;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<String> listtravellerid;
    @XmlElement(name = "LIST_CONDITION")
    protected List<CODEDESCRIPTORType> listcondition;
    @XmlElement(name = "LIST_PROVIDER_FARE_GROUP")
    protected List<String> listproviderfaregroup;
    @XmlElement(name = "RATE_TYPE", required = true)
    protected CODEDESCRIPTORType ratetype;
    @XmlElement(name = "FLEXIBILITY_TYPE")
    protected String flexibilitytype;
    @XmlElement(name = "FARE_CLASS")
    protected PROVIDERCODEDESCRIPTORType fareclass;
    @XmlElement(name = "FARE_FAMILY")
    protected String farefamily;
    @XmlElement(name = "RESERVATION_TYPE", required = true)
    protected String reservationtype;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSEGMENTID() {
        if (listsegmentid == null) {
            listsegmentid = new ArrayList<String>();
        }
        return this.listsegmentid;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<String>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the listcondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONDITION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODEDESCRIPTORType }
     * 
     * 
     */
    public List<CODEDESCRIPTORType> getLISTCONDITION() {
        if (listcondition == null) {
            listcondition = new ArrayList<CODEDESCRIPTORType>();
        }
        return this.listcondition;
    }

    /**
     * Gets the value of the listproviderfaregroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproviderfaregroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROVIDERFAREGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTPROVIDERFAREGROUP() {
        if (listproviderfaregroup == null) {
            listproviderfaregroup = new ArrayList<String>();
        }
        return this.listproviderfaregroup;
    }

    /**
     * Gets the value of the ratetype property.
     * 
     * @return
     *     possible object is
     *     {@link CODEDESCRIPTORType }
     *     
     */
    public CODEDESCRIPTORType getRATETYPE() {
        return ratetype;
    }

    /**
     * Sets the value of the ratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODEDESCRIPTORType }
     *     
     */
    public void setRATETYPE(CODEDESCRIPTORType value) {
        this.ratetype = value;
    }

    /**
     * Gets the value of the flexibilitytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLEXIBILITYTYPE() {
        return flexibilitytype;
    }

    /**
     * Sets the value of the flexibilitytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLEXIBILITYTYPE(String value) {
        this.flexibilitytype = value;
    }

    /**
     * Gets the value of the fareclass property.
     * 
     * @return
     *     possible object is
     *     {@link PROVIDERCODEDESCRIPTORType }
     *     
     */
    public PROVIDERCODEDESCRIPTORType getFARECLASS() {
        return fareclass;
    }

    /**
     * Sets the value of the fareclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDERCODEDESCRIPTORType }
     *     
     */
    public void setFARECLASS(PROVIDERCODEDESCRIPTORType value) {
        this.fareclass = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREFAMILY(String value) {
        this.farefamily = value;
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

}
