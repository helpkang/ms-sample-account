//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 06:13:51 ���� KST 
//


package com.koreanair.external.altea.vo.minirule_getfrometicketreply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiniRulesRegulPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiniRulesRegulPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mnrCatInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}CategDescrType"/>
 *         &lt;element name="mnrFCInfoGrp" maxOccurs="16">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}ReferenceInfoType_98124S"/>
 *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}PlaceLocationIdentificationType" maxOccurs="16" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mnrDateInfoGrp" maxOccurs="16" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dateInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}DateAndTimeInformationType"/>
 *                   &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}NumberOfUnitsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mnrMonInfoGrp" maxOccurs="16" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}MonetaryInformationType"/>
 *                   &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}NumberOfUnitsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mnrRestriAppInfoGrp" maxOccurs="16" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mnrRestriAppInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}StatusType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiniRulesRegulPropertiesType", propOrder = {
    "mnrCatInfo",
    "mnrFCInfoGrp",
    "mnrDateInfoGrp",
    "mnrMonInfoGrp",
    "mnrRestriAppInfoGrp"
})
public class MiniRulesRegulPropertiesType {

    @XmlElement(required = true)
    protected CategDescrType mnrCatInfo;
    @XmlElement(required = true)
    protected List<MiniRulesRegulPropertiesType.MnrFCInfoGrp> mnrFCInfoGrp;
    protected List<MiniRulesRegulPropertiesType.MnrDateInfoGrp> mnrDateInfoGrp;
    protected List<MiniRulesRegulPropertiesType.MnrMonInfoGrp> mnrMonInfoGrp;
    protected List<MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp> mnrRestriAppInfoGrp;

    /**
     * Gets the value of the mnrCatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CategDescrType }
     *     
     */
    public CategDescrType getMnrCatInfo() {
        return mnrCatInfo;
    }

    /**
     * Sets the value of the mnrCatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategDescrType }
     *     
     */
    public void setMnrCatInfo(CategDescrType value) {
        this.mnrCatInfo = value;
    }

    /**
     * Gets the value of the mnrFCInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrFCInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrFCInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrFCInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrFCInfoGrp> getMnrFCInfoGrp() {
        if (mnrFCInfoGrp == null) {
            mnrFCInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrFCInfoGrp>();
        }
        return this.mnrFCInfoGrp;
    }

    /**
     * Gets the value of the mnrDateInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrDateInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrDateInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrDateInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrDateInfoGrp> getMnrDateInfoGrp() {
        if (mnrDateInfoGrp == null) {
            mnrDateInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrDateInfoGrp>();
        }
        return this.mnrDateInfoGrp;
    }

    /**
     * Gets the value of the mnrMonInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrMonInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrMonInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrMonInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrMonInfoGrp> getMnrMonInfoGrp() {
        if (mnrMonInfoGrp == null) {
            mnrMonInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrMonInfoGrp>();
        }
        return this.mnrMonInfoGrp;
    }

    /**
     * Gets the value of the mnrRestriAppInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnrRestriAppInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnrRestriAppInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp }
     * 
     * 
     */
    public List<MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp> getMnrRestriAppInfoGrp() {
        if (mnrRestriAppInfoGrp == null) {
            mnrRestriAppInfoGrp = new ArrayList<MiniRulesRegulPropertiesType.MnrRestriAppInfoGrp>();
        }
        return this.mnrRestriAppInfoGrp;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dateInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}DateAndTimeInformationType"/>
     *         &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}NumberOfUnitsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateInfo",
        "valueInfo"
    })
    public static class MnrDateInfoGrp {

        @XmlElement(required = true)
        protected DateAndTimeInformationType dateInfo;
        protected NumberOfUnitsType valueInfo;

        /**
         * Gets the value of the dateInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DateAndTimeInformationType }
         *     
         */
        public DateAndTimeInformationType getDateInfo() {
            return dateInfo;
        }

        /**
         * Sets the value of the dateInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAndTimeInformationType }
         *     
         */
        public void setDateInfo(DateAndTimeInformationType value) {
            this.dateInfo = value;
        }

        /**
         * Gets the value of the valueInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getValueInfo() {
            return valueInfo;
        }

        /**
         * Sets the value of the valueInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setValueInfo(NumberOfUnitsType value) {
            this.valueInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="refInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}ReferenceInfoType_98124S"/>
     *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}PlaceLocationIdentificationType" maxOccurs="16" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "refInfo",
        "locationInfo"
    })
    public static class MnrFCInfoGrp {

        @XmlElement(required = true)
        protected ReferenceInfoType98124S refInfo;
        protected List<PlaceLocationIdentificationType> locationInfo;

        /**
         * Gets the value of the refInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType98124S }
         *     
         */
        public ReferenceInfoType98124S getRefInfo() {
            return refInfo;
        }

        /**
         * Sets the value of the refInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType98124S }
         *     
         */
        public void setRefInfo(ReferenceInfoType98124S value) {
            this.refInfo = value;
        }

        /**
         * Gets the value of the locationInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locationInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocationInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlaceLocationIdentificationType }
         * 
         * 
         */
        public List<PlaceLocationIdentificationType> getLocationInfo() {
            if (locationInfo == null) {
                locationInfo = new ArrayList<PlaceLocationIdentificationType>();
            }
            return this.locationInfo;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}MonetaryInformationType"/>
     *         &lt;element name="valueInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}NumberOfUnitsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "monetaryInfo",
        "valueInfo"
    })
    public static class MnrMonInfoGrp {

        @XmlElement(required = true)
        protected MonetaryInformationType monetaryInfo;
        protected NumberOfUnitsType valueInfo;

        /**
         * Gets the value of the monetaryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType }
         *     
         */
        public MonetaryInformationType getMonetaryInfo() {
            return monetaryInfo;
        }

        /**
         * Sets the value of the monetaryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType }
         *     
         */
        public void setMonetaryInfo(MonetaryInformationType value) {
            this.monetaryInfo = value;
        }

        /**
         * Gets the value of the valueInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getValueInfo() {
            return valueInfo;
        }

        /**
         * Sets the value of the valueInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setValueInfo(NumberOfUnitsType value) {
            this.valueInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mnrRestriAppInfo" type="{http://xml.amadeus.com/TMRERR_13_1_1A}StatusType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mnrRestriAppInfo"
    })
    public static class MnrRestriAppInfoGrp {

        @XmlElement(required = true)
        protected StatusType mnrRestriAppInfo;

        /**
         * Gets the value of the mnrRestriAppInfo property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getMnrRestriAppInfo() {
            return mnrRestriAppInfo;
        }

        /**
         * Sets the value of the mnrRestriAppInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setMnrRestriAppInfo(StatusType value) {
            this.mnrRestriAppInfo = value;
        }

    }

}
