
package com.koreanair.eretail.pojo.pnr.listelementtoadd;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.hotelinputgroup.ETRTYPE;
import com.koreanair.eretail.pojo.hotel.hotelinputgroup.MODIFYGROUP;
import com.koreanair.eretail.pojo.hotel.hotelinputgroup.MODIFYHOTEL;
import com.koreanair.eretail.pojo.hotel.hotelinputgroup.REQUESTEDHOTELTYPE;
import com.koreanair.eretail.pojo.hotel.hotelinputgroup.REQUESTEDROOMTYPE;
import com.koreanair.eretail.pojo.pnr.common.CORPORATENUMBERType;
import com.koreanair.eretail.pojo.pnr.common.PARAMETERIDType;
import com.koreanair.eretail.pojo.pnr.productidgroup.AirElementType;
import com.koreanair.eretail.pojo.tripplan.common.common_price.AMOUNTBREAKDOWN;
import com.koreanair.eretail.pojo.tripplan.common.common_price.AMOUNTSINTEGERTYPE;
import com.koreanair.eretail.pojo.tripplan.common.common_price.AMOUNTSTYPE;


/**
 * <p>Java class for ListElementToAddType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListElementToAddType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;group ref="{}TripPlanIdGroup"/&gt;
 *           &lt;group ref="{}ProductIdGroup"/&gt;
 *           &lt;group ref="{}HotelInputGroup2"/&gt;
 *           &lt;group ref="{}AirFareGroup"/&gt;
 *           &lt;group ref="{}MilesAndCashGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LIST_REPLACE_ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;group ref="{}TripPlanIdGroup"/&gt;
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
@XmlType(name = "ListElementToAddType", propOrder = {
    "type",
    "itemid",
    "source",
    "gdsid",
    "linenumber",
    "travelshopperticket",
    "listpricedelement",
    "listnegohotel",
    "listhotel",
    "row",
    "listroom",
    "listmodifyhotel",
    "listmodifygroup",
    "listoffersource",
    "listetrhotel",
    "typeoffare",
    "listfarereference",
    "fareid",
    "typeofbackupfare",
    "listfareparameter",
    "listfarebackupparameter",
    "listcorporatenumber",
    "backuplistcorporatenumber",
    "farecommandid",
    "backupfarecommandid",
    "forceptc",
    "milesandcashcost",
    "listreplaceelement"
})
public class ListElementToAddType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "GDS_ID")
    protected String gdsid;
    @XmlElement(name = "LINE_NUMBER")
    protected BigInteger linenumber;
    @XmlElement(name = "TRAVELSHOPPER_TICKET")
    protected Byte travelshopperticket;
    @XmlElement(name = "LIST_PRICED_ELEMENT")
    protected List<AirElementType> listpricedelement;
    @XmlElement(name = "LIST_NEGO_HOTEL")
    protected List<REQUESTEDHOTELTYPE> listnegohotel;
    @XmlElement(name = "LIST_HOTEL")
    protected List<REQUESTEDHOTELTYPE> listhotel;
    @XmlElement(name = "ROW")
    protected Object row;
    @XmlElement(name = "LIST_ROOM")
    protected List<REQUESTEDROOMTYPE> listroom;
    @XmlElement(name = "LIST_MODIFY_HOTEL")
    protected List<MODIFYHOTEL> listmodifyhotel;
    @XmlElement(name = "LIST_MODIFY_GROUP")
    protected List<MODIFYGROUP> listmodifygroup;
    @XmlElement(name = "LIST_OFFER_SOURCE")
    protected List<ListElementToAddType.LISTOFFERSOURCE> listoffersource;
    @XmlElement(name = "LIST_ETR_HOTEL")
    protected List<ETRTYPE> listetrhotel;
    @XmlElement(name = "TYPE_OF_FARE")
    protected String typeoffare;
    @XmlElement(name = "LIST_FARE_REFERENCE")
    protected List<ListElementToAddType.LISTFAREREFERENCE> listfarereference;
    @XmlElement(name = "FARE_ID")
    protected BigInteger fareid;
    @XmlElement(name = "TYPE_OF_BACKUP_FARE")
    protected String typeofbackupfare;
    @XmlElement(name = "LIST_FARE_PARAMETER")
    protected List<PARAMETERIDType> listfareparameter;
    @XmlElement(name = "LIST_FARE_BACKUP_PARAMETER")
    protected List<PARAMETERIDType> listfarebackupparameter;
    @XmlElement(name = "LIST_CORPORATE_NUMBER")
    protected List<CORPORATENUMBERType> listcorporatenumber;
    @XmlElement(name = "BACKUP_LIST_CORPORATE_NUMBER")
    protected List<CORPORATENUMBERType> backuplistcorporatenumber;
    @XmlElement(name = "FARE_COMMAND_ID")
    protected String farecommandid;
    @XmlElement(name = "BACKUP_FARE_COMMAND_ID")
    protected String backupfarecommandid;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected ListElementToAddType.MILESANDCASHCOST milesandcashcost;
    @XmlElement(name = "LIST_REPLACE_ELEMENT")
    protected List<ListElementToAddType.LISTREPLACEELEMENT> listreplaceelement;

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
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the gdsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSID() {
        return gdsid;
    }

    /**
     * Sets the value of the gdsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSID(String value) {
        this.gdsid = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLINENUMBER(BigInteger value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the travelshopperticket property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTRAVELSHOPPERTICKET() {
        return travelshopperticket;
    }

    /**
     * Sets the value of the travelshopperticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTRAVELSHOPPERTICKET(Byte value) {
        this.travelshopperticket = value;
    }

    /**
     * Gets the value of the listpricedelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricedelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICEDELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirElementType }
     * 
     * 
     */
    public List<AirElementType> getLISTPRICEDELEMENT() {
        if (listpricedelement == null) {
            listpricedelement = new ArrayList<AirElementType>();
        }
        return this.listpricedelement;
    }

    /**
     * Gets the value of the listnegohotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listnegohotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTNEGOHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUESTEDHOTELTYPE }
     * 
     * 
     */
    public List<REQUESTEDHOTELTYPE> getLISTNEGOHOTEL() {
        if (listnegohotel == null) {
            listnegohotel = new ArrayList<REQUESTEDHOTELTYPE>();
        }
        return this.listnegohotel;
    }

    /**
     * Gets the value of the listhotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listhotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUESTEDHOTELTYPE }
     * 
     * 
     */
    public List<REQUESTEDHOTELTYPE> getLISTHOTEL() {
        if (listhotel == null) {
            listhotel = new ArrayList<REQUESTEDHOTELTYPE>();
        }
        return this.listhotel;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getROW() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setROW(Object value) {
        this.row = value;
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
     * {@link REQUESTEDROOMTYPE }
     * 
     * 
     */
    public List<REQUESTEDROOMTYPE> getLISTROOM() {
        if (listroom == null) {
            listroom = new ArrayList<REQUESTEDROOMTYPE>();
        }
        return this.listroom;
    }

    /**
     * Gets the value of the listmodifyhotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmodifyhotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMODIFYHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODIFYHOTEL }
     * 
     * 
     */
    public List<MODIFYHOTEL> getLISTMODIFYHOTEL() {
        if (listmodifyhotel == null) {
            listmodifyhotel = new ArrayList<MODIFYHOTEL>();
        }
        return this.listmodifyhotel;
    }

    /**
     * Gets the value of the listmodifygroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmodifygroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMODIFYGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODIFYGROUP }
     * 
     * 
     */
    public List<MODIFYGROUP> getLISTMODIFYGROUP() {
        if (listmodifygroup == null) {
            listmodifygroup = new ArrayList<MODIFYGROUP>();
        }
        return this.listmodifygroup;
    }

    /**
     * Gets the value of the listoffersource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoffersource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOFFERSOURCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListElementToAddType.LISTOFFERSOURCE }
     * 
     * 
     */
    public List<ListElementToAddType.LISTOFFERSOURCE> getLISTOFFERSOURCE() {
        if (listoffersource == null) {
            listoffersource = new ArrayList<ListElementToAddType.LISTOFFERSOURCE>();
        }
        return this.listoffersource;
    }

    /**
     * Gets the value of the listetrhotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listetrhotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTETRHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETRTYPE }
     * 
     * 
     */
    public List<ETRTYPE> getLISTETRHOTEL() {
        if (listetrhotel == null) {
            listetrhotel = new ArrayList<ETRTYPE>();
        }
        return this.listetrhotel;
    }

    /**
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFFARE(String value) {
        this.typeoffare = value;
    }

    /**
     * Gets the value of the listfarereference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarereference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListElementToAddType.LISTFAREREFERENCE }
     * 
     * 
     */
    public List<ListElementToAddType.LISTFAREREFERENCE> getLISTFAREREFERENCE() {
        if (listfarereference == null) {
            listfarereference = new ArrayList<ListElementToAddType.LISTFAREREFERENCE>();
        }
        return this.listfarereference;
    }

    /**
     * Gets the value of the fareid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFAREID() {
        return fareid;
    }

    /**
     * Sets the value of the fareid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFAREID(BigInteger value) {
        this.fareid = value;
    }

    /**
     * Gets the value of the typeofbackupfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFBACKUPFARE() {
        return typeofbackupfare;
    }

    /**
     * Sets the value of the typeofbackupfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFBACKUPFARE(String value) {
        this.typeofbackupfare = value;
    }

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
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREPARAMETER() {
        if (listfareparameter == null) {
            listfareparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfareparameter;
    }

    /**
     * Gets the value of the listfarebackupparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarebackupparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREBACKUPPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREBACKUPPARAMETER() {
        if (listfarebackupparameter == null) {
            listfarebackupparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfarebackupparameter;
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
     * {@link CORPORATENUMBERType }
     * 
     * 
     */
    public List<CORPORATENUMBERType> getLISTCORPORATENUMBER() {
        if (listcorporatenumber == null) {
            listcorporatenumber = new ArrayList<CORPORATENUMBERType>();
        }
        return this.listcorporatenumber;
    }

    /**
     * Gets the value of the backuplistcorporatenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backuplistcorporatenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBACKUPLISTCORPORATENUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CORPORATENUMBERType }
     * 
     * 
     */
    public List<CORPORATENUMBERType> getBACKUPLISTCORPORATENUMBER() {
        if (backuplistcorporatenumber == null) {
            backuplistcorporatenumber = new ArrayList<CORPORATENUMBERType>();
        }
        return this.backuplistcorporatenumber;
    }

    /**
     * Gets the value of the farecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECOMMANDID() {
        return farecommandid;
    }

    /**
     * Sets the value of the farecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECOMMANDID(String value) {
        this.farecommandid = value;
    }

    /**
     * Gets the value of the backupfarecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKUPFARECOMMANDID() {
        return backupfarecommandid;
    }

    /**
     * Sets the value of the backupfarecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKUPFARECOMMANDID(String value) {
        this.backupfarecommandid = value;
    }

    /**
     * Gets the value of the forceptc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCEPTC() {
        return forceptc;
    }

    /**
     * Sets the value of the forceptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCEPTC(Boolean value) {
        this.forceptc = value;
    }

    /**
     * Gets the value of the milesandcashcost property.
     * 
     * @return
     *     possible object is
     *     {@link ListElementToAddType.MILESANDCASHCOST }
     *     
     */
    public ListElementToAddType.MILESANDCASHCOST getMILESANDCASHCOST() {
        return milesandcashcost;
    }

    /**
     * Sets the value of the milesandcashcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListElementToAddType.MILESANDCASHCOST }
     *     
     */
    public void setMILESANDCASHCOST(ListElementToAddType.MILESANDCASHCOST value) {
        this.milesandcashcost = value;
    }

    /**
     * Gets the value of the listreplaceelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listreplaceelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREPLACEELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListElementToAddType.LISTREPLACEELEMENT }
     * 
     * 
     */
    public List<ListElementToAddType.LISTREPLACEELEMENT> getLISTREPLACEELEMENT() {
        if (listreplaceelement == null) {
            listreplaceelement = new ArrayList<ListElementToAddType.LISTREPLACEELEMENT>();
        }
        return this.listreplaceelement;
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
     *         &lt;element name="FARE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TICKET_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
     *         &lt;element name="INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_PROPOSAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "fareid",
        "ticketgroupid",
        "travellerid",
        "infant",
        "isproposal"
    })
    public static class LISTFAREREFERENCE
        implements Serializable
    {

        @XmlElement(name = "FARE_ID", required = true)
        protected BigInteger fareid;
        @XmlElement(name = "TICKET_GROUP_ID")
        protected int ticketgroupid;
        @XmlElement(name = "TRAVELLER_ID")
        protected BigInteger travellerid;
        @XmlElement(name = "INFANT")
        protected Boolean infant;
        @XmlElement(name = "IS_PROPOSAL")
        protected Object isproposal;

        /**
         * Gets the value of the fareid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFAREID() {
            return fareid;
        }

        /**
         * Sets the value of the fareid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFAREID(BigInteger value) {
            this.fareid = value;
        }

        /**
         * Gets the value of the ticketgroupid property.
         * 
         */
        public int getTICKETGROUPID() {
            return ticketgroupid;
        }

        /**
         * Sets the value of the ticketgroupid property.
         * 
         */
        public void setTICKETGROUPID(int value) {
            this.ticketgroupid = value;
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
         * Gets the value of the infant property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isINFANT() {
            return infant;
        }

        /**
         * Sets the value of the infant property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setINFANT(Boolean value) {
            this.infant = value;
        }

        /**
         * Gets the value of the isproposal property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getISPROPOSAL() {
            return isproposal;
        }

        /**
         * Sets the value of the isproposal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setISPROPOSAL(Object value) {
            this.isproposal = value;
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
     *         &lt;element name="OFFER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "offerid"
    })
    public static class LISTOFFERSOURCE
        implements Serializable
    {

        @XmlElement(name = "OFFER_ID", required = true)
        protected Object offerid;

        /**
         * Gets the value of the offerid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOFFERID() {
            return offerid;
        }

        /**
         * Sets the value of the offerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOFFERID(Object value) {
            this.offerid = value;
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
     *       &lt;group ref="{}TripPlanIdGroup"/&gt;
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
        "source",
        "gdsid",
        "linenumber"
    })
    public static class LISTREPLACEELEMENT
        implements Serializable
    {

        @XmlElement(name = "ITEM_ID")
        protected BigInteger itemid;
        @XmlElement(name = "SOURCE")
        protected String source;
        @XmlElement(name = "GDS_ID")
        protected String gdsid;
        @XmlElement(name = "LINE_NUMBER")
        protected BigInteger linenumber;

        /**
         * Gets the value of the itemid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getITEMID() {
            return itemid;
        }

        /**
         * Sets the value of the itemid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setITEMID(BigInteger value) {
            this.itemid = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSOURCE() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSOURCE(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the gdsid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGDSID() {
            return gdsid;
        }

        /**
         * Sets the value of the gdsid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGDSID(String value) {
            this.gdsid = value;
        }

        /**
         * Gets the value of the linenumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLINENUMBER() {
            return linenumber;
        }

        /**
         * Sets the value of the linenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLINENUMBER(BigInteger value) {
            this.linenumber = value;
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
     *         &lt;group ref="{}AwardMileAndCash"/&gt;
     *         &lt;group ref="{}Currency"/&gt;
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
        "resultingmiles",
        "convertedamount",
        "nonconvertedamount",
        "convertedcashmiles",
        "minimummilescost",
        "sliderrankposition",
        "numberofsliderranks",
        "slidertype",
        "listoption",
        "currency"
    })
    public static class MILESANDCASHCOST
        implements Serializable
    {

        @XmlElement(name = "RESULTING_MILES")
        protected AMOUNTSINTEGERTYPE resultingmiles;
        @XmlElement(name = "CONVERTED_AMOUNT")
        protected AMOUNTSTYPE convertedamount;
        @XmlElement(name = "NON_CONVERTED_AMOUNT")
        protected AMOUNTBREAKDOWN nonconvertedamount;
        @XmlElement(name = "CONVERTED_CASH_MILES")
        protected Object convertedcashmiles;
        @XmlElement(name = "MINIMUM_MILES_COST")
        protected Object minimummilescost;
        @XmlElement(name = "SLIDER_RANK_POSITION")
        protected Integer sliderrankposition;
        @XmlElement(name = "NUMBER_OF_SLIDER_RANKS")
        protected Integer numberofsliderranks;
        @XmlElement(name = "SLIDER_TYPE")
        protected String slidertype;
        @XmlElement(name = "LIST_OPTION")
        protected List<String> listoption;
        @XmlElement(name = "CURRENCY")
        protected ListElementToAddType.MILESANDCASHCOST.CURRENCY currency;

        /**
         * Gets the value of the resultingmiles property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTSINTEGERTYPE }
         *     
         */
        public AMOUNTSINTEGERTYPE getRESULTINGMILES() {
            return resultingmiles;
        }

        /**
         * Sets the value of the resultingmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTSINTEGERTYPE }
         *     
         */
        public void setRESULTINGMILES(AMOUNTSINTEGERTYPE value) {
            this.resultingmiles = value;
        }

        /**
         * Gets the value of the convertedamount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTSTYPE }
         *     
         */
        public AMOUNTSTYPE getCONVERTEDAMOUNT() {
            return convertedamount;
        }

        /**
         * Sets the value of the convertedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTSTYPE }
         *     
         */
        public void setCONVERTEDAMOUNT(AMOUNTSTYPE value) {
            this.convertedamount = value;
        }

        /**
         * Gets the value of the nonconvertedamount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTBREAKDOWN }
         *     
         */
        public AMOUNTBREAKDOWN getNONCONVERTEDAMOUNT() {
            return nonconvertedamount;
        }

        /**
         * Sets the value of the nonconvertedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTBREAKDOWN }
         *     
         */
        public void setNONCONVERTEDAMOUNT(AMOUNTBREAKDOWN value) {
            this.nonconvertedamount = value;
        }

        /**
         * Gets the value of the convertedcashmiles property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONVERTEDCASHMILES() {
            return convertedcashmiles;
        }

        /**
         * Sets the value of the convertedcashmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONVERTEDCASHMILES(Object value) {
            this.convertedcashmiles = value;
        }

        /**
         * Gets the value of the minimummilescost property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMINIMUMMILESCOST() {
            return minimummilescost;
        }

        /**
         * Sets the value of the minimummilescost property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMINIMUMMILESCOST(Object value) {
            this.minimummilescost = value;
        }

        /**
         * Gets the value of the sliderrankposition property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSLIDERRANKPOSITION() {
            return sliderrankposition;
        }

        /**
         * Sets the value of the sliderrankposition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSLIDERRANKPOSITION(Integer value) {
            this.sliderrankposition = value;
        }

        /**
         * Gets the value of the numberofsliderranks property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNUMBEROFSLIDERRANKS() {
            return numberofsliderranks;
        }

        /**
         * Sets the value of the numberofsliderranks property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNUMBEROFSLIDERRANKS(Integer value) {
            this.numberofsliderranks = value;
        }

        /**
         * Gets the value of the slidertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSLIDERTYPE() {
            return slidertype;
        }

        /**
         * Sets the value of the slidertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSLIDERTYPE(String value) {
            this.slidertype = value;
        }

        /**
         * Gets the value of the listoption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listoption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTOPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTOPTION() {
            if (listoption == null) {
                listoption = new ArrayList<String>();
            }
            return this.listoption;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link ListElementToAddType.MILESANDCASHCOST.CURRENCY }
         *     
         */
        public ListElementToAddType.MILESANDCASHCOST.CURRENCY getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListElementToAddType.MILESANDCASHCOST.CURRENCY }
         *     
         */
        public void setCURRENCY(ListElementToAddType.MILESANDCASHCOST.CURRENCY value) {
            this.currency = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class CURRENCY
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

}
