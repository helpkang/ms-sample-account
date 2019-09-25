
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.FAREFAMILYFareType;


/**
 * <p>Java class for LIST_FP_ALTERNATE_TRIP_ELEMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FP_ALTERNATE_TRIP_ELEMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PNR" type="{}LIST_ALTERNATE_PNR_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TRIP_PRICE" type="{}ALTERNATE_CONVERTED_BALANCE_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}RECOMMENDATION_ID"/&gt;
 *         &lt;element name="LIST_BOUND" type="{}LIST_BOUND_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}ALTERNATE_FARE_FAMILY"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FP_ALTERNATE_TRIP_ELEMENT_Type", propOrder = {
    "listpnr",
    "listtripprice",
    "recommendationid",
    "listbound",
    "alternatefarefamily"
})
public class LISTFPALTERNATETRIPELEMENTType
    implements Serializable
{

    @XmlElement(name = "LIST_PNR", required = true)
    protected List<LISTALTERNATEPNRType> listpnr;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<ALTERNATECONVERTEDBALANCEType> listtripprice;
    @XmlElement(name = "RECOMMENDATION_ID", required = true)
    protected BigInteger recommendationid;
    @XmlElement(name = "LIST_BOUND", required = true)
    protected List<LISTBOUNDType> listbound;
    @XmlElement(name = "ALTERNATE_FARE_FAMILY", required = true)
    protected FAREFAMILYFareType alternatefarefamily;

    /**
     * Gets the value of the listpnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTALTERNATEPNRType }
     * 
     * 
     */
    public List<LISTALTERNATEPNRType> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<LISTALTERNATEPNRType>();
        }
        return this.listpnr;
    }

    /**
     * Gets the value of the listtripprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ALTERNATECONVERTEDBALANCEType }
     * 
     * 
     */
    public List<ALTERNATECONVERTEDBALANCEType> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<ALTERNATECONVERTEDBALANCEType>();
        }
        return this.listtripprice;
    }

    /**
     * Gets the value of the recommendationid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECOMMENDATIONID() {
        return recommendationid;
    }

    /**
     * Sets the value of the recommendationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECOMMENDATIONID(BigInteger value) {
        this.recommendationid = value;
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
     * {@link LISTBOUNDType }
     * 
     * 
     */
    public List<LISTBOUNDType> getLISTBOUND() {
        if (listbound == null) {
            listbound = new ArrayList<LISTBOUNDType>();
        }
        return this.listbound;
    }

    /**
     * Gets the value of the alternatefarefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public FAREFAMILYFareType getALTERNATEFAREFAMILY() {
        return alternatefarefamily;
    }

    /**
     * Sets the value of the alternatefarefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public void setALTERNATEFAREFAMILY(FAREFAMILYFareType value) {
        this.alternatefarefamily = value;
    }

}
