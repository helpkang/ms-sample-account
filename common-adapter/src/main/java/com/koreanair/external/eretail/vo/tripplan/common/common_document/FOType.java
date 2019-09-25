
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_FAFH" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}FAFH_Type"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TKT_SEQUENCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ET_CPN_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="MILES" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="PENALTY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FO_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FROM_TSM" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_DISRUPTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_INVOLUNTARY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="INITIAL_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FO_Type", propOrder = {
    "listfafh",
    "foelementid",
    "fromtsm",
    "isdisrupted",
    "isinvoluntary",
    "freetext",
    "initialelement"
})
public class FOType
    implements Serializable
{

    @XmlElement(name = "LIST_FAFH")
    protected List<FOType.LISTFAFH> listfafh;
    @XmlElement(name = "FO_ELEMENT_ID")
    protected String foelementid;
    @XmlElement(name = "FROM_TSM", defaultValue = "false")
    protected Object fromtsm;
    @XmlElement(name = "IS_DISRUPTED")
    protected Boolean isdisrupted;
    @XmlElement(name = "IS_INVOLUNTARY")
    protected Boolean isinvoluntary;
    @XmlElement(name = "FREE_TEXT")
    protected String freetext;
    @XmlElement(name = "INITIAL_ELEMENT")
    protected Boolean initialelement;

    /**
     * Gets the value of the listfafh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfafh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAFH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOType.LISTFAFH }
     * 
     * 
     */
    public List<FOType.LISTFAFH> getLISTFAFH() {
        if (listfafh == null) {
            listfafh = new ArrayList<FOType.LISTFAFH>();
        }
        return this.listfafh;
    }

    /**
     * Gets the value of the foelementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOELEMENTID() {
        return foelementid;
    }

    /**
     * Sets the value of the foelementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOELEMENTID(String value) {
        this.foelementid = value;
    }

    /**
     * Gets the value of the fromtsm property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROMTSM() {
        return fromtsm;
    }

    /**
     * Sets the value of the fromtsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROMTSM(Object value) {
        this.fromtsm = value;
    }

    /**
     * Gets the value of the isdisrupted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISDISRUPTED() {
        return isdisrupted;
    }

    /**
     * Sets the value of the isdisrupted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISDISRUPTED(Boolean value) {
        this.isdisrupted = value;
    }

    /**
     * Gets the value of the isinvoluntary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINVOLUNTARY() {
        return isinvoluntary;
    }

    /**
     * Sets the value of the isinvoluntary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINVOLUNTARY(Boolean value) {
        this.isinvoluntary = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

    /**
     * Gets the value of the initialelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINITIALELEMENT() {
        return initialelement;
    }

    /**
     * Sets the value of the initialelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINITIALELEMENT(Boolean value) {
        this.initialelement = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}FAFH_Type"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TKT_SEQUENCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ET_CPN_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MILES" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PENALTY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tktsequence",
        "etcpnindicator",
        "miles",
        "penalty"
    })
    public static class LISTFAFH
        extends FAFHType
        implements Serializable
    {

        @XmlElement(name = "TKT_SEQUENCE")
        protected String tktsequence;
        @XmlElement(name = "ET_CPN_INDICATOR")
        protected String etcpnindicator;
        @XmlElement(name = "MILES")
        protected String miles;
        @XmlElement(name = "PENALTY")
        protected String penalty;

        /**
         * Gets the value of the tktsequence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTKTSEQUENCE() {
            return tktsequence;
        }

        /**
         * Sets the value of the tktsequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTKTSEQUENCE(String value) {
            this.tktsequence = value;
        }

        /**
         * Gets the value of the etcpnindicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getETCPNINDICATOR() {
            return etcpnindicator;
        }

        /**
         * Sets the value of the etcpnindicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setETCPNINDICATOR(String value) {
            this.etcpnindicator = value;
        }

        /**
         * Gets the value of the miles property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMILES() {
            return miles;
        }

        /**
         * Sets the value of the miles property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMILES(String value) {
            this.miles = value;
        }

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPENALTY() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPENALTY(String value) {
            this.penalty = value;
        }

    }

}
