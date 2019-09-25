
package com.koreanair.eretail.pojo.seatmap.seatmapoutput;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.eretail.pojo.common.common.APISRULESTYPE;


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
 *         &lt;element name="LIST_MSG" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BOOL_SEATMAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AIRLINE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLIGHT" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_DATE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="B_AIRPORT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_AIRPORT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EQUIPMENT" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FLIGHT_CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ROWS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="COLS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ROW_CONFIG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COL_CONFIG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SEATS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AVAIL_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EXIT_ROWS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TOILETS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SMOKING_ROWS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BULKHEAD_ROWS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GALLEY_ROWS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UPPER_DECK_ROWS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WINGS_START" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="WINGS_END" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CABIN_COLOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "boolseatmap",
    "airline",
    "flight",
    "bdate",
    "btime",
    "bairport",
    "etime",
    "eairport",
    "equipment",
    "flightcabin",
    "rows",
    "cols",
    "rowconfig",
    "colconfig",
    "seats",
    "availseats",
    "exitrows",
    "toilets",
    "smokingrows",
    "bulkheadrows",
    "galleyrows",
    "upperdeckrows",
    "wingsstart",
    "wingsend",
    "cabincolor",
    "listexternalid",
    "frompage",
    "apismanageroutput",
    "apisrules",
    "apiscollectionmode"
})
@XmlRootElement(name = "SeatMapOutput")
public class SeatMapOutput
    implements Serializable
{

    @XmlElement(name = "LIST_MSG")
    protected List<SeatMapOutput.LISTMSG> listmsg;
    @XmlElement(name = "BOOL_SEATMAP")
    protected boolean boolseatmap;
    @XmlElement(name = "AIRLINE", required = true)
    protected SeatMapOutput.AIRLINE airline;
    @XmlElement(name = "FLIGHT", required = true)
    protected String flight;
    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "B_TIME")
    protected String btime;
    @XmlElement(name = "B_AIRPORT", required = true)
    protected SeatMapOutput.BAIRPORT bairport;
    @XmlElement(name = "E_TIME")
    protected String etime;
    @XmlElement(name = "E_AIRPORT", required = true)
    protected SeatMapOutput.EAIRPORT eairport;
    @XmlElement(name = "EQUIPMENT", required = true)
    protected String equipment;
    @XmlElement(name = "FLIGHT_CABIN", required = true)
    protected String flightcabin;
    @XmlElement(name = "ROWS", required = true)
    protected BigInteger rows;
    @XmlElement(name = "COLS", required = true)
    protected BigInteger cols;
    @XmlElement(name = "ROW_CONFIG", required = true)
    protected String rowconfig;
    @XmlElement(name = "COL_CONFIG", required = true)
    protected String colconfig;
    @XmlElement(name = "SEATS", required = true)
    protected String seats;
    @XmlElement(name = "AVAIL_SEATS", required = true)
    protected BigInteger availseats;
    @XmlElement(name = "EXIT_ROWS", required = true)
    protected String exitrows;
    @XmlElement(name = "TOILETS", required = true)
    protected String toilets;
    @XmlElement(name = "SMOKING_ROWS", required = true)
    protected String smokingrows;
    @XmlElement(name = "BULKHEAD_ROWS", required = true)
    protected String bulkheadrows;
    @XmlElement(name = "GALLEY_ROWS", required = true)
    protected String galleyrows;
    @XmlElement(name = "UPPER_DECK_ROWS", required = true)
    protected String upperdeckrows;
    @XmlElement(name = "WINGS_START", required = true)
    protected BigInteger wingsstart;
    @XmlElement(name = "WINGS_END", required = true)
    protected BigInteger wingsend;
    @XmlElement(name = "CABIN_COLOR")
    protected String cabincolor;
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
     * {@link SeatMapOutput.LISTMSG }
     * 
     * 
     */
    public List<SeatMapOutput.LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<SeatMapOutput.LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the boolseatmap property.
     * 
     */
    public boolean isBOOLSEATMAP() {
        return boolseatmap;
    }

    /**
     * Sets the value of the boolseatmap property.
     * 
     */
    public void setBOOLSEATMAP(boolean value) {
        this.boolseatmap = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link SeatMapOutput.AIRLINE }
     *     
     */
    public SeatMapOutput.AIRLINE getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatMapOutput.AIRLINE }
     *     
     */
    public void setAIRLINE(SeatMapOutput.AIRLINE value) {
        this.airline = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHT() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHT(String value) {
        this.flight = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the btime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTIME() {
        return btime;
    }

    /**
     * Sets the value of the btime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTIME(String value) {
        this.btime = value;
    }

    /**
     * Gets the value of the bairport property.
     * 
     * @return
     *     possible object is
     *     {@link SeatMapOutput.BAIRPORT }
     *     
     */
    public SeatMapOutput.BAIRPORT getBAIRPORT() {
        return bairport;
    }

    /**
     * Sets the value of the bairport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatMapOutput.BAIRPORT }
     *     
     */
    public void setBAIRPORT(SeatMapOutput.BAIRPORT value) {
        this.bairport = value;
    }

    /**
     * Gets the value of the etime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETIME() {
        return etime;
    }

    /**
     * Sets the value of the etime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETIME(String value) {
        this.etime = value;
    }

    /**
     * Gets the value of the eairport property.
     * 
     * @return
     *     possible object is
     *     {@link SeatMapOutput.EAIRPORT }
     *     
     */
    public SeatMapOutput.EAIRPORT getEAIRPORT() {
        return eairport;
    }

    /**
     * Sets the value of the eairport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatMapOutput.EAIRPORT }
     *     
     */
    public void setEAIRPORT(SeatMapOutput.EAIRPORT value) {
        this.eairport = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQUIPMENT(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the flightcabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTCABIN() {
        return flightcabin;
    }

    /**
     * Sets the value of the flightcabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTCABIN(String value) {
        this.flightcabin = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROWS() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROWS(BigInteger value) {
        this.rows = value;
    }

    /**
     * Gets the value of the cols property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOLS() {
        return cols;
    }

    /**
     * Sets the value of the cols property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOLS(BigInteger value) {
        this.cols = value;
    }

    /**
     * Gets the value of the rowconfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROWCONFIG() {
        return rowconfig;
    }

    /**
     * Sets the value of the rowconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROWCONFIG(String value) {
        this.rowconfig = value;
    }

    /**
     * Gets the value of the colconfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLCONFIG() {
        return colconfig;
    }

    /**
     * Sets the value of the colconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLCONFIG(String value) {
        this.colconfig = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEATS() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEATS(String value) {
        this.seats = value;
    }

    /**
     * Gets the value of the availseats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAVAILSEATS() {
        return availseats;
    }

    /**
     * Sets the value of the availseats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAVAILSEATS(BigInteger value) {
        this.availseats = value;
    }

    /**
     * Gets the value of the exitrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXITROWS() {
        return exitrows;
    }

    /**
     * Sets the value of the exitrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXITROWS(String value) {
        this.exitrows = value;
    }

    /**
     * Gets the value of the toilets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOILETS() {
        return toilets;
    }

    /**
     * Sets the value of the toilets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOILETS(String value) {
        this.toilets = value;
    }

    /**
     * Gets the value of the smokingrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMOKINGROWS() {
        return smokingrows;
    }

    /**
     * Sets the value of the smokingrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMOKINGROWS(String value) {
        this.smokingrows = value;
    }

    /**
     * Gets the value of the bulkheadrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBULKHEADROWS() {
        return bulkheadrows;
    }

    /**
     * Sets the value of the bulkheadrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBULKHEADROWS(String value) {
        this.bulkheadrows = value;
    }

    /**
     * Gets the value of the galleyrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGALLEYROWS() {
        return galleyrows;
    }

    /**
     * Sets the value of the galleyrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGALLEYROWS(String value) {
        this.galleyrows = value;
    }

    /**
     * Gets the value of the upperdeckrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPPERDECKROWS() {
        return upperdeckrows;
    }

    /**
     * Sets the value of the upperdeckrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPPERDECKROWS(String value) {
        this.upperdeckrows = value;
    }

    /**
     * Gets the value of the wingsstart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWINGSSTART() {
        return wingsstart;
    }

    /**
     * Sets the value of the wingsstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWINGSSTART(BigInteger value) {
        this.wingsstart = value;
    }

    /**
     * Gets the value of the wingsend property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWINGSEND() {
        return wingsend;
    }

    /**
     * Sets the value of the wingsend property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWINGSEND(BigInteger value) {
        this.wingsend = value;
    }

    /**
     * Gets the value of the cabincolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABINCOLOR() {
        return cabincolor;
    }

    /**
     * Sets the value of the cabincolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABINCOLOR(String value) {
        this.cabincolor = value;
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
    public static class AIRLINE
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
    public static class BAIRPORT
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
    public static class EAIRPORT
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "type",
        "number",
        "text"
    })
    public static class LISTMSG
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "NUMBER", required = true)
        protected BigInteger number;
        @XmlElement(name = "TEXT", required = true)
        protected String text;

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
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTEXT() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTEXT(String value) {
            this.text = value;
        }

    }

}
