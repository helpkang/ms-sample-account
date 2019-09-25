
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * POR Location type.
 * 
 * <p>Java class for B_LOCATION_ITEM_TYPE_3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B_LOCATION_ITEM_TYPE_3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FACILITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FACILITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POR_CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STRUCTURED_POR_CITY" type="{}STRUTURED_POR_CITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_POI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_STRUCTURED_POI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MAP_URL_LIST_POI" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ADDRESS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B_LOCATION_ITEM_TYPE_3", propOrder = {
    "citycode",
    "cityname",
    "locationcode",
    "locationname",
    "statecode",
    "statename",
    "countrycode",
    "countryname",
    "facilitycode",
    "facilityname",
    "porcityname",
    "structuredporcity",
    "listpoi",
    "liststructuredpoi",
    "mapurllistpoi",
    "listaddress"
})
@XmlSeeAlso({
    BLOCATIONITEMTYPE1 .class,
    BLOCATIONITEMTYPE2 .class,
    BLOCATIONITEMTYPE5 .class
})
public class BLOCATIONITEMTYPE3
    implements Serializable
{

    @XmlElement(name = "CITY_CODE")
    protected String citycode;
    @XmlElement(name = "CITY_NAME")
    protected String cityname;
    @XmlElement(name = "LOCATION_CODE")
    protected String locationcode;
    @XmlElement(name = "LOCATION_NAME")
    protected String locationname;
    @XmlElement(name = "STATE_CODE")
    protected String statecode;
    @XmlElement(name = "STATE_NAME")
    protected String statename;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;
    @XmlElement(name = "COUNTRY_NAME")
    protected String countryname;
    @XmlElement(name = "FACILITY_CODE")
    protected String facilitycode;
    @XmlElement(name = "FACILITY_NAME")
    protected String facilityname;
    @XmlElement(name = "POR_CITY_NAME")
    protected String porcityname;
    @XmlElement(name = "STRUCTURED_POR_CITY")
    protected STRUTUREDPORCITY structuredporcity;
    @XmlElement(name = "LIST_POI")
    protected List<String> listpoi;
    @XmlElement(name = "LIST_STRUCTURED_POI")
    protected List<STRUTUREDPOITYPE> liststructuredpoi;
    @XmlElement(name = "MAP_URL_LIST_POI")
    protected String mapurllistpoi;
    @XmlElement(name = "LIST_ADDRESS")
    protected List<LISTADDRESS> listaddress;

    /**
     * Gets the value of the citycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYCODE() {
        return citycode;
    }

    /**
     * Sets the value of the citycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYCODE(String value) {
        this.citycode = value;
    }

    /**
     * Gets the value of the cityname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYNAME() {
        return cityname;
    }

    /**
     * Sets the value of the cityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYNAME(String value) {
        this.cityname = value;
    }

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONCODE() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONCODE(String value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the locationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONNAME() {
        return locationname;
    }

    /**
     * Sets the value of the locationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONNAME(String value) {
        this.locationname = value;
    }

    /**
     * Gets the value of the statecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATECODE() {
        return statecode;
    }

    /**
     * Sets the value of the statecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATECODE(String value) {
        this.statecode = value;
    }

    /**
     * Gets the value of the statename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATENAME() {
        return statename;
    }

    /**
     * Sets the value of the statename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATENAME(String value) {
        this.statename = value;
    }

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYCODE(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the countryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYNAME() {
        return countryname;
    }

    /**
     * Sets the value of the countryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYNAME(String value) {
        this.countryname = value;
    }

    /**
     * Gets the value of the facilitycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACILITYCODE() {
        return facilitycode;
    }

    /**
     * Sets the value of the facilitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACILITYCODE(String value) {
        this.facilitycode = value;
    }

    /**
     * Gets the value of the facilityname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACILITYNAME() {
        return facilityname;
    }

    /**
     * Sets the value of the facilityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACILITYNAME(String value) {
        this.facilityname = value;
    }

    /**
     * Gets the value of the porcityname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORCITYNAME() {
        return porcityname;
    }

    /**
     * Sets the value of the porcityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORCITYNAME(String value) {
        this.porcityname = value;
    }

    /**
     * Gets the value of the structuredporcity property.
     * 
     * @return
     *     possible object is
     *     {@link STRUTUREDPORCITY }
     *     
     */
    public STRUTUREDPORCITY getSTRUCTUREDPORCITY() {
        return structuredporcity;
    }

    /**
     * Sets the value of the structuredporcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRUTUREDPORCITY }
     *     
     */
    public void setSTRUCTUREDPORCITY(STRUTUREDPORCITY value) {
        this.structuredporcity = value;
    }

    /**
     * Gets the value of the listpoi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpoi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTPOI() {
        if (listpoi == null) {
            listpoi = new ArrayList<String>();
        }
        return this.listpoi;
    }

    /**
     * Gets the value of the liststructuredpoi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststructuredpoi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTRUCTUREDPOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRUTUREDPOITYPE }
     * 
     * 
     */
    public List<STRUTUREDPOITYPE> getLISTSTRUCTUREDPOI() {
        if (liststructuredpoi == null) {
            liststructuredpoi = new ArrayList<STRUTUREDPOITYPE>();
        }
        return this.liststructuredpoi;
    }

    /**
     * Gets the value of the mapurllistpoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAPURLLISTPOI() {
        return mapurllistpoi;
    }

    /**
     * Sets the value of the mapurllistpoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAPURLLISTPOI(String value) {
        this.mapurllistpoi = value;
    }

    /**
     * Gets the value of the listaddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDRESS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTADDRESS }
     * 
     * 
     */
    public List<LISTADDRESS> getLISTADDRESS() {
        if (listaddress == null) {
            listaddress = new ArrayList<LISTADDRESS>();
        }
        return this.listaddress;
    }

}
