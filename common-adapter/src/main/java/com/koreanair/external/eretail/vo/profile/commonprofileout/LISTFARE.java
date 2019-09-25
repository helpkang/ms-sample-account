
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISCOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}INDEX_TYPE"/&gt;
 *                   &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FORMATTED_TOUR_CODE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}INDEX_TYPE"/&gt;
 *                   &lt;element name="TOUR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_STAFF_TOUR_CODE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}INDEX_TYPE"/&gt;
 *                   &lt;element name="STAFF_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STAFF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RELATIVE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FREEFLOW_TOUR_CODE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}INDEX_TYPE"/&gt;
 *                   &lt;element name="FREEFLOW_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SHADOW_DESTINATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SERVICE_FEE_MODEL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="AIR_FEE_MODEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AIR_FEE_MODEL_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GENERIC_FEE_MODEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GENERIC_FEE_MODEL_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_COMMISSION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}INDEX_TYPE"/&gt;
 *                   &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PRICE_OVERRIDE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}INDEX_TYPE"/&gt;
 *                   &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ENDORSEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}INDEX_TYPE"/&gt;
 *                   &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
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
@XmlType(name = "", propOrder = {
    "segmentid",
    "listdiscount",
    "listformattedtourcode",
    "liststafftourcode",
    "listfreeflowtourcode",
    "shadowdestination",
    "servicefeemodel",
    "listcommission",
    "listpriceoverride",
    "listendorsement"
})
@XmlRootElement(name = "LIST_FARE")
public class LISTFARE
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "LIST_DISCOUNT")
    protected List<LISTFARE.LISTDISCOUNT> listdiscount;
    @XmlElement(name = "LIST_FORMATTED_TOUR_CODE")
    protected List<LISTFARE.LISTFORMATTEDTOURCODE> listformattedtourcode;
    @XmlElement(name = "LIST_STAFF_TOUR_CODE")
    protected List<LISTFARE.LISTSTAFFTOURCODE> liststafftourcode;
    @XmlElement(name = "LIST_FREEFLOW_TOUR_CODE")
    protected List<LISTFARE.LISTFREEFLOWTOURCODE> listfreeflowtourcode;
    @XmlElement(name = "SHADOW_DESTINATION")
    protected LISTFARE.SHADOWDESTINATION shadowdestination;
    @XmlElement(name = "SERVICE_FEE_MODEL")
    protected LISTFARE.SERVICEFEEMODEL servicefeemodel;
    @XmlElement(name = "LIST_COMMISSION")
    protected List<LISTFARE.LISTCOMMISSION> listcommission;
    @XmlElement(name = "LIST_PRICE_OVERRIDE")
    protected List<LISTFARE.LISTPRICEOVERRIDE> listpriceoverride;
    @XmlElement(name = "LIST_ENDORSEMENT")
    protected List<LISTFARE.LISTENDORSEMENT> listendorsement;

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
     * Gets the value of the listdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARE.LISTDISCOUNT }
     * 
     * 
     */
    public List<LISTFARE.LISTDISCOUNT> getLISTDISCOUNT() {
        if (listdiscount == null) {
            listdiscount = new ArrayList<LISTFARE.LISTDISCOUNT>();
        }
        return this.listdiscount;
    }

    /**
     * Gets the value of the listformattedtourcode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listformattedtourcode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFORMATTEDTOURCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARE.LISTFORMATTEDTOURCODE }
     * 
     * 
     */
    public List<LISTFARE.LISTFORMATTEDTOURCODE> getLISTFORMATTEDTOURCODE() {
        if (listformattedtourcode == null) {
            listformattedtourcode = new ArrayList<LISTFARE.LISTFORMATTEDTOURCODE>();
        }
        return this.listformattedtourcode;
    }

    /**
     * Gets the value of the liststafftourcode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststafftourcode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTAFFTOURCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARE.LISTSTAFFTOURCODE }
     * 
     * 
     */
    public List<LISTFARE.LISTSTAFFTOURCODE> getLISTSTAFFTOURCODE() {
        if (liststafftourcode == null) {
            liststafftourcode = new ArrayList<LISTFARE.LISTSTAFFTOURCODE>();
        }
        return this.liststafftourcode;
    }

    /**
     * Gets the value of the listfreeflowtourcode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfreeflowtourcode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFREEFLOWTOURCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARE.LISTFREEFLOWTOURCODE }
     * 
     * 
     */
    public List<LISTFARE.LISTFREEFLOWTOURCODE> getLISTFREEFLOWTOURCODE() {
        if (listfreeflowtourcode == null) {
            listfreeflowtourcode = new ArrayList<LISTFARE.LISTFREEFLOWTOURCODE>();
        }
        return this.listfreeflowtourcode;
    }

    /**
     * Gets the value of the shadowdestination property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFARE.SHADOWDESTINATION }
     *     
     */
    public LISTFARE.SHADOWDESTINATION getSHADOWDESTINATION() {
        return shadowdestination;
    }

    /**
     * Sets the value of the shadowdestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFARE.SHADOWDESTINATION }
     *     
     */
    public void setSHADOWDESTINATION(LISTFARE.SHADOWDESTINATION value) {
        this.shadowdestination = value;
    }

    /**
     * Gets the value of the servicefeemodel property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFARE.SERVICEFEEMODEL }
     *     
     */
    public LISTFARE.SERVICEFEEMODEL getSERVICEFEEMODEL() {
        return servicefeemodel;
    }

    /**
     * Sets the value of the servicefeemodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFARE.SERVICEFEEMODEL }
     *     
     */
    public void setSERVICEFEEMODEL(LISTFARE.SERVICEFEEMODEL value) {
        this.servicefeemodel = value;
    }

    /**
     * Gets the value of the listcommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMISSION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARE.LISTCOMMISSION }
     * 
     * 
     */
    public List<LISTFARE.LISTCOMMISSION> getLISTCOMMISSION() {
        if (listcommission == null) {
            listcommission = new ArrayList<LISTFARE.LISTCOMMISSION>();
        }
        return this.listcommission;
    }

    /**
     * Gets the value of the listpriceoverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpriceoverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICEOVERRIDE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARE.LISTPRICEOVERRIDE }
     * 
     * 
     */
    public List<LISTFARE.LISTPRICEOVERRIDE> getLISTPRICEOVERRIDE() {
        if (listpriceoverride == null) {
            listpriceoverride = new ArrayList<LISTFARE.LISTPRICEOVERRIDE>();
        }
        return this.listpriceoverride;
    }

    /**
     * Gets the value of the listendorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listendorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTENDORSEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARE.LISTENDORSEMENT }
     * 
     * 
     */
    public List<LISTFARE.LISTENDORSEMENT> getLISTENDORSEMENT() {
        if (listendorsement == null) {
            listendorsement = new ArrayList<LISTFARE.LISTENDORSEMENT>();
        }
        return this.listendorsement;
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
     *       &lt;all&gt;
     *         &lt;element ref="{}INDEX_TYPE"/&gt;
     *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTCOMMISSION
        implements Serializable
    {

        @XmlElement(name = "INDEX_TYPE", required = true)
        protected INDEXTYPE indextype;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;
        @XmlElement(name = "PROVIDER_CODE")
        protected String providercode;

        /**
         * Gets the value of the indextype property.
         * 
         * @return
         *     possible object is
         *     {@link INDEXTYPE }
         *     
         */
        public INDEXTYPE getINDEXTYPE() {
            return indextype;
        }

        /**
         * Sets the value of the indextype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INDEXTYPE }
         *     
         */
        public void setINDEXTYPE(INDEXTYPE value) {
            this.indextype = value;
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
         * Gets the value of the providercode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDERCODE() {
            return providercode;
        }

        /**
         * Sets the value of the providercode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDERCODE(String value) {
            this.providercode = value;
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
     *       &lt;all&gt;
     *         &lt;element ref="{}INDEX_TYPE"/&gt;
     *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTDISCOUNT
        implements Serializable
    {

        @XmlElement(name = "INDEX_TYPE", required = true)
        protected INDEXTYPE indextype;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;

        /**
         * Gets the value of the indextype property.
         * 
         * @return
         *     possible object is
         *     {@link INDEXTYPE }
         *     
         */
        public INDEXTYPE getINDEXTYPE() {
            return indextype;
        }

        /**
         * Sets the value of the indextype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INDEXTYPE }
         *     
         */
        public void setINDEXTYPE(INDEXTYPE value) {
            this.indextype = value;
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
     *       &lt;all&gt;
     *         &lt;element ref="{}INDEX_TYPE"/&gt;
     *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTENDORSEMENT
        implements Serializable
    {

        @XmlElement(name = "INDEX_TYPE", required = true)
        protected INDEXTYPE indextype;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;

        /**
         * Gets the value of the indextype property.
         * 
         * @return
         *     possible object is
         *     {@link INDEXTYPE }
         *     
         */
        public INDEXTYPE getINDEXTYPE() {
            return indextype;
        }

        /**
         * Sets the value of the indextype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INDEXTYPE }
         *     
         */
        public void setINDEXTYPE(INDEXTYPE value) {
            this.indextype = value;
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
     *       &lt;all&gt;
     *         &lt;element ref="{}INDEX_TYPE"/&gt;
     *         &lt;element name="TOUR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTFORMATTEDTOURCODE
        implements Serializable
    {

        @XmlElement(name = "INDEX_TYPE", required = true)
        protected INDEXTYPE indextype;
        @XmlElement(name = "TOUR_TYPE")
        protected String tourtype;
        @XmlElement(name = "YEAR")
        protected String year;
        @XmlElement(name = "PROVIDER")
        protected String provider;
        @XmlElement(name = "APPROVAL_CODE")
        protected String approvalcode;
        @XmlElement(name = "PARTY_ID")
        protected String partyid;

        /**
         * Gets the value of the indextype property.
         * 
         * @return
         *     possible object is
         *     {@link INDEXTYPE }
         *     
         */
        public INDEXTYPE getINDEXTYPE() {
            return indextype;
        }

        /**
         * Sets the value of the indextype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INDEXTYPE }
         *     
         */
        public void setINDEXTYPE(INDEXTYPE value) {
            this.indextype = value;
        }

        /**
         * Gets the value of the tourtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOURTYPE() {
            return tourtype;
        }

        /**
         * Sets the value of the tourtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOURTYPE(String value) {
            this.tourtype = value;
        }

        /**
         * Gets the value of the year property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYEAR() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYEAR(String value) {
            this.year = value;
        }

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDER(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the approvalcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPPROVALCODE() {
            return approvalcode;
        }

        /**
         * Sets the value of the approvalcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPPROVALCODE(String value) {
            this.approvalcode = value;
        }

        /**
         * Gets the value of the partyid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARTYID() {
            return partyid;
        }

        /**
         * Sets the value of the partyid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARTYID(String value) {
            this.partyid = value;
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
     *       &lt;all&gt;
     *         &lt;element ref="{}INDEX_TYPE"/&gt;
     *         &lt;element name="FREEFLOW_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTFREEFLOWTOURCODE
        implements Serializable
    {

        @XmlElement(name = "INDEX_TYPE", required = true)
        protected INDEXTYPE indextype;
        @XmlElement(name = "FREEFLOW_TYPE")
        protected String freeflowtype;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;

        /**
         * Gets the value of the indextype property.
         * 
         * @return
         *     possible object is
         *     {@link INDEXTYPE }
         *     
         */
        public INDEXTYPE getINDEXTYPE() {
            return indextype;
        }

        /**
         * Sets the value of the indextype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INDEXTYPE }
         *     
         */
        public void setINDEXTYPE(INDEXTYPE value) {
            this.indextype = value;
        }

        /**
         * Gets the value of the freeflowtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFREEFLOWTYPE() {
            return freeflowtype;
        }

        /**
         * Sets the value of the freeflowtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFREEFLOWTYPE(String value) {
            this.freeflowtype = value;
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
     *       &lt;all&gt;
     *         &lt;element ref="{}INDEX_TYPE"/&gt;
     *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTPRICEOVERRIDE
        implements Serializable
    {

        @XmlElement(name = "INDEX_TYPE", required = true)
        protected INDEXTYPE indextype;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;
        @XmlElement(name = "PROVIDER_CODE")
        protected String providercode;

        /**
         * Gets the value of the indextype property.
         * 
         * @return
         *     possible object is
         *     {@link INDEXTYPE }
         *     
         */
        public INDEXTYPE getINDEXTYPE() {
            return indextype;
        }

        /**
         * Sets the value of the indextype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INDEXTYPE }
         *     
         */
        public void setINDEXTYPE(INDEXTYPE value) {
            this.indextype = value;
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
         * Gets the value of the providercode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDERCODE() {
            return providercode;
        }

        /**
         * Sets the value of the providercode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDERCODE(String value) {
            this.providercode = value;
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
     *       &lt;all&gt;
     *         &lt;element ref="{}INDEX_TYPE"/&gt;
     *         &lt;element name="STAFF_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STAFF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RELATIVE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTSTAFFTOURCODE
        implements Serializable
    {

        @XmlElement(name = "INDEX_TYPE", required = true)
        protected INDEXTYPE indextype;
        @XmlElement(name = "STAFF_TYPE")
        protected String stafftype;
        @XmlElement(name = "PROVIDER")
        protected String provider;
        @XmlElement(name = "STAFF_NUMBER")
        protected String staffnumber;
        @XmlElement(name = "RELATIVE_NUMBER")
        protected String relativenumber;

        /**
         * Gets the value of the indextype property.
         * 
         * @return
         *     possible object is
         *     {@link INDEXTYPE }
         *     
         */
        public INDEXTYPE getINDEXTYPE() {
            return indextype;
        }

        /**
         * Sets the value of the indextype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INDEXTYPE }
         *     
         */
        public void setINDEXTYPE(INDEXTYPE value) {
            this.indextype = value;
        }

        /**
         * Gets the value of the stafftype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTAFFTYPE() {
            return stafftype;
        }

        /**
         * Sets the value of the stafftype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTAFFTYPE(String value) {
            this.stafftype = value;
        }

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDER(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the staffnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTAFFNUMBER() {
            return staffnumber;
        }

        /**
         * Sets the value of the staffnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTAFFNUMBER(String value) {
            this.staffnumber = value;
        }

        /**
         * Gets the value of the relativenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATIVENUMBER() {
            return relativenumber;
        }

        /**
         * Sets the value of the relativenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATIVENUMBER(String value) {
            this.relativenumber = value;
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
     *       &lt;all&gt;
     *         &lt;element name="AIR_FEE_MODEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AIR_FEE_MODEL_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GENERIC_FEE_MODEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GENERIC_FEE_MODEL_LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SERVICEFEEMODEL
        implements Serializable
    {

        @XmlElement(name = "AIR_FEE_MODEL")
        protected String airfeemodel;
        @XmlElement(name = "AIR_FEE_MODEL_LABEL")
        protected String airfeemodellabel;
        @XmlElement(name = "GENERIC_FEE_MODEL")
        protected String genericfeemodel;
        @XmlElement(name = "GENERIC_FEE_MODEL_LABEL")
        protected String genericfeemodellabel;

        /**
         * Gets the value of the airfeemodel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRFEEMODEL() {
            return airfeemodel;
        }

        /**
         * Sets the value of the airfeemodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRFEEMODEL(String value) {
            this.airfeemodel = value;
        }

        /**
         * Gets the value of the airfeemodellabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRFEEMODELLABEL() {
            return airfeemodellabel;
        }

        /**
         * Sets the value of the airfeemodellabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRFEEMODELLABEL(String value) {
            this.airfeemodellabel = value;
        }

        /**
         * Gets the value of the genericfeemodel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENERICFEEMODEL() {
            return genericfeemodel;
        }

        /**
         * Sets the value of the genericfeemodel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENERICFEEMODEL(String value) {
            this.genericfeemodel = value;
        }

        /**
         * Gets the value of the genericfeemodellabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENERICFEEMODELLABEL() {
            return genericfeemodellabel;
        }

        /**
         * Sets the value of the genericfeemodellabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENERICFEEMODELLABEL(String value) {
            this.genericfeemodellabel = value;
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
     *       &lt;all&gt;
     *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SHADOWDESTINATION
        implements Serializable
    {

        @XmlElement(name = "FREE_TEXT")
        protected String freetext;

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

    }

}
