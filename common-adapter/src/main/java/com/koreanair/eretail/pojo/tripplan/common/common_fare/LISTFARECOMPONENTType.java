
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_FARE_COMPONENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FARE_COMPONENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_COMPONENT_PRICE" type="{}AmountAsString_Type"/&gt;
 *         &lt;group ref="{}FROM_TO_Pair"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}FARE_COMPONENT_SEG_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}MILEAGE_INFORMATION" minOccurs="0"/&gt;
 *         &lt;element name="LIST_IATA_CHECK" type="{}IATA_CHECK_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CLASS_DIFFERENTIAL" type="{}CLASS_DIFFERENTIAL_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FARE_COMPONENT_Type", propOrder = {
    "farecomponentprice",
    "from",
    "to",
    "listsegment",
    "mileageinformation",
    "listiatacheck",
    "listclassdifferential"
})
public class LISTFARECOMPONENTType
    implements Serializable
{

    @XmlElement(name = "FARE_COMPONENT_PRICE", required = true)
    protected String farecomponentprice;
    @XmlElement(name = "FROM", required = true)
    protected String from;
    @XmlElement(name = "TO", required = true)
    protected String to;
    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<FARECOMPONENTSEGType> listsegment;
    @XmlElement(name = "MILEAGE_INFORMATION")
    protected MILEAGEINFORMATION mileageinformation;
    @XmlElement(name = "LIST_IATA_CHECK")
    protected List<IATACHECKType> listiatacheck;
    @XmlElement(name = "LIST_CLASS_DIFFERENTIAL")
    protected List<CLASSDIFFERENTIALType> listclassdifferential;

    /**
     * Gets the value of the farecomponentprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECOMPONENTPRICE() {
        return farecomponentprice;
    }

    /**
     * Sets the value of the farecomponentprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECOMPONENTPRICE(String value) {
        this.farecomponentprice = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROM() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROM(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTO() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTO(String value) {
        this.to = value;
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
     * {@link FARECOMPONENTSEGType }
     * 
     * 
     */
    public List<FARECOMPONENTSEGType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<FARECOMPONENTSEGType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the mileageinformation property.
     * 
     * @return
     *     possible object is
     *     {@link MILEAGEINFORMATION }
     *     
     */
    public MILEAGEINFORMATION getMILEAGEINFORMATION() {
        return mileageinformation;
    }

    /**
     * Sets the value of the mileageinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILEAGEINFORMATION }
     *     
     */
    public void setMILEAGEINFORMATION(MILEAGEINFORMATION value) {
        this.mileageinformation = value;
    }

    /**
     * Gets the value of the listiatacheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listiatacheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIATACHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATACHECKType }
     * 
     * 
     */
    public List<IATACHECKType> getLISTIATACHECK() {
        if (listiatacheck == null) {
            listiatacheck = new ArrayList<IATACHECKType>();
        }
        return this.listiatacheck;
    }

    /**
     * Gets the value of the listclassdifferential property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listclassdifferential property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCLASSDIFFERENTIAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CLASSDIFFERENTIALType }
     * 
     * 
     */
    public List<CLASSDIFFERENTIALType> getLISTCLASSDIFFERENTIAL() {
        if (listclassdifferential == null) {
            listclassdifferential = new ArrayList<CLASSDIFFERENTIALType>();
        }
        return this.listclassdifferential;
    }

}
