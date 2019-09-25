
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_FARE_FAMILY_DESC_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FARE_FAMILY_DESC_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_FAMILY_DESC_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FARE_FAMILY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_SEGMENT_ID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID_Type"/&gt;
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
@XmlType(name = "LIST_FARE_FAMILY_DESC_SEGMENT_Type", propOrder = {
    "farefamilydescid",
    "farefamilyname",
    "listsegmentid"
})
public class LISTFAREFAMILYDESCSEGMENTType
    implements Serializable
{

    @XmlElement(name = "FARE_FAMILY_DESC_ID", required = true)
    protected String farefamilydescid;
    @XmlElement(name = "FARE_FAMILY_NAME", required = true)
    protected String farefamilyname;
    @XmlElement(name = "LIST_SEGMENT_ID")
    protected List<LISTFAREFAMILYDESCSEGMENTType.LISTSEGMENTID> listsegmentid;

    /**
     * Gets the value of the farefamilydescid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREFAMILYDESCID() {
        return farefamilydescid;
    }

    /**
     * Sets the value of the farefamilydescid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREFAMILYDESCID(String value) {
        this.farefamilydescid = value;
    }

    /**
     * Gets the value of the farefamilyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREFAMILYNAME() {
        return farefamilyname;
    }

    /**
     * Sets the value of the farefamilyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREFAMILYNAME(String value) {
        this.farefamilyname = value;
    }

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
     * {@link LISTFAREFAMILYDESCSEGMENTType.LISTSEGMENTID }
     * 
     * 
     */
    public List<LISTFAREFAMILYDESCSEGMENTType.LISTSEGMENTID> getLISTSEGMENTID() {
        if (listsegmentid == null) {
            listsegmentid = new ArrayList<LISTFAREFAMILYDESCSEGMENTType.LISTSEGMENTID>();
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
     *         &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID_Type"/&gt;
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
        "segmentid"
    })
    public static class LISTSEGMENTID
        implements Serializable
    {

        @XmlElement(name = "SEGMENT_ID", required = true)
        protected BigInteger segmentid;

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

    }

}
