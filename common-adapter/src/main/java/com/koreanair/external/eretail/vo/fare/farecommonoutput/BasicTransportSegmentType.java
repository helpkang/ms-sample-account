
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.AIRLINEType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.BDATE;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.DecodedLocationType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.EDATE;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.EQUIPMENT;


/**
 * <p>Java class for BasicTransportSegment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicTransportSegment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SEGMENT_INDEX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID_Type" minOccurs="0"/&gt;
 *           &lt;element name="CARRIER" type="{}AIRLINE_Type" minOccurs="0"/&gt;
 *           &lt;element name="OPERATING_CARRIER" type="{}AIRLINE_Type" minOccurs="0"/&gt;
 *           &lt;element ref="{}FLIGHT_NUMBER" minOccurs="0"/&gt;
 *           &lt;element ref="{}B_DATE" minOccurs="0"/&gt;
 *           &lt;element ref="{}E_DATE" minOccurs="0"/&gt;
 *           &lt;element name="SURFACE_SECTOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element name="B_LOCATION" type="{}DecodedLocationType" minOccurs="0"/&gt;
 *           &lt;element name="E_LOCATION" type="{}DecodedLocationType" minOccurs="0"/&gt;
 *           &lt;element ref="{}B_TERMINAL" minOccurs="0"/&gt;
 *           &lt;element ref="{}E_TERMINAL" minOccurs="0"/&gt;
 *           &lt;element ref="{}EQUIPMENT" minOccurs="0"/&gt;
 *           &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *           &lt;element name="TICKETLESS_ACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicTransportSegment_Type", propOrder = {
    "segmentindex",
    "segmentid",
    "carrier",
    "operatingcarrier",
    "flightnumber",
    "bdate",
    "edate",
    "surfacesector",
    "blocation",
    "elocation",
    "bterminal",
    "eterminal",
    "equipment",
    "duration",
    "ticketlessaccess"
})
public class BasicTransportSegmentType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_INDEX")
    protected Integer segmentindex;
    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "CARRIER")
    protected AIRLINEType carrier;
    @XmlElement(name = "OPERATING_CARRIER")
    protected AIRLINEType operatingcarrier;
    @XmlElement(name = "FLIGHT_NUMBER")
    protected String flightnumber;
    @XmlElement(name = "B_DATE")
    protected BDATE bdate;
    @XmlElement(name = "E_DATE")
    protected EDATE edate;
    @XmlElement(name = "SURFACE_SECTOR")
    protected Boolean surfacesector;
    @XmlElement(name = "B_LOCATION")
    protected DecodedLocationType blocation;
    @XmlElement(name = "E_LOCATION")
    protected DecodedLocationType elocation;
    @XmlElement(name = "B_TERMINAL")
    protected String bterminal;
    @XmlElement(name = "E_TERMINAL")
    protected String eterminal;
    @XmlElement(name = "EQUIPMENT")
    protected EQUIPMENT equipment;
    @XmlElement(name = "DURATION")
    protected Integer duration;
    @XmlElement(name = "TICKETLESS_ACCESS")
    protected Boolean ticketlessaccess;

    /**
     * Gets the value of the segmentindex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSEGMENTINDEX() {
        return segmentindex;
    }

    /**
     * Sets the value of the segmentindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSEGMENTINDEX(Integer value) {
        this.segmentindex = value;
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
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link AIRLINEType }
     *     
     */
    public AIRLINEType getCARRIER() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRLINEType }
     *     
     */
    public void setCARRIER(AIRLINEType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the operatingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link AIRLINEType }
     *     
     */
    public AIRLINEType getOPERATINGCARRIER() {
        return operatingcarrier;
    }

    /**
     * Sets the value of the operatingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRLINEType }
     *     
     */
    public void setOPERATINGCARRIER(AIRLINEType value) {
        this.operatingcarrier = value;
    }

    /**
     * Gets the value of the flightnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTNUMBER() {
        return flightnumber;
    }

    /**
     * Sets the value of the flightnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTNUMBER(String value) {
        this.flightnumber = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link BDATE }
     *     
     */
    public BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDATE }
     *     
     */
    public void setBDATE(BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link EDATE }
     *     
     */
    public EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDATE }
     *     
     */
    public void setEDATE(EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the surfacesector property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSURFACESECTOR() {
        return surfacesector;
    }

    /**
     * Sets the value of the surfacesector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSURFACESECTOR(Boolean value) {
        this.surfacesector = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setBLOCATION(DecodedLocationType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setELOCATION(DecodedLocationType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bterminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTERMINAL() {
        return bterminal;
    }

    /**
     * Sets the value of the bterminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTERMINAL(String value) {
        this.bterminal = value;
    }

    /**
     * Gets the value of the eterminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETERMINAL() {
        return eterminal;
    }

    /**
     * Sets the value of the eterminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETERMINAL(String value) {
        this.eterminal = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link EQUIPMENT }
     *     
     */
    public EQUIPMENT getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQUIPMENT }
     *     
     */
    public void setEQUIPMENT(EQUIPMENT value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDURATION(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the ticketlessaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTICKETLESSACCESS() {
        return ticketlessaccess;
    }

    /**
     * Sets the value of the ticketlessaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTICKETLESSACCESS(Boolean value) {
        this.ticketlessaccess = value;
    }

}
