//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="technicalStatusInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}StatusType_67578S" minOccurs="0"/>
 *         &lt;element name="nbOfPassengersInformation" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}NumberOfUnitsType_67575S" minOccurs="0"/>
 *         &lt;element name="travellerInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}TravellerInformationTypeI" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ErrorGroupType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="serviceFormat" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}SuccessGroupType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="allFaresInfoGroup" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FaresInfoType" maxOccurs="999" minOccurs="0"/>
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
    "technicalStatusInfo",
    "nbOfPassengersInformation",
    "travellerInfo",
    "errorGroup",
    "serviceFormat",
    "allFaresInfoGroup"
})
@XmlRootElement(name = "Service_PriceServiceViaCatalogueReply")
public class ServicePriceServiceViaCatalogueReply {

    protected StatusType67578S technicalStatusInfo;
    protected NumberOfUnitsType67575S nbOfPassengersInformation;
    protected List<TravellerInformationTypeI> travellerInfo;
    protected List<ErrorGroupType> errorGroup;
    protected List<SuccessGroupType> serviceFormat;
    protected List<FaresInfoType> allFaresInfoGroup;

    /**
     * Gets the value of the technicalStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType67578S }
     *     
     */
    public StatusType67578S getTechnicalStatusInfo() {
        return technicalStatusInfo;
    }

    /**
     * Sets the value of the technicalStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType67578S }
     *     
     */
    public void setTechnicalStatusInfo(StatusType67578S value) {
        this.technicalStatusInfo = value;
    }

    /**
     * Gets the value of the nbOfPassengersInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType67575S }
     *     
     */
    public NumberOfUnitsType67575S getNbOfPassengersInformation() {
        return nbOfPassengersInformation;
    }

    /**
     * Sets the value of the nbOfPassengersInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType67575S }
     *     
     */
    public void setNbOfPassengersInformation(NumberOfUnitsType67575S value) {
        this.nbOfPassengersInformation = value;
    }

    /**
     * Gets the value of the travellerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerInformationTypeI }
     * 
     * 
     */
    public List<TravellerInformationTypeI> getTravellerInfo() {
        if (travellerInfo == null) {
            travellerInfo = new ArrayList<TravellerInformationTypeI>();
        }
        return this.travellerInfo;
    }

    /**
     * Gets the value of the errorGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType }
     * 
     * 
     */
    public List<ErrorGroupType> getErrorGroup() {
        if (errorGroup == null) {
            errorGroup = new ArrayList<ErrorGroupType>();
        }
        return this.errorGroup;
    }

    /**
     * Gets the value of the serviceFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessGroupType }
     * 
     * 
     */
    public List<SuccessGroupType> getServiceFormat() {
        if (serviceFormat == null) {
            serviceFormat = new ArrayList<SuccessGroupType>();
        }
        return this.serviceFormat;
    }

    /**
     * Gets the value of the allFaresInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allFaresInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllFaresInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaresInfoType }
     * 
     * 
     */
    public List<FaresInfoType> getAllFaresInfoGroup() {
        if (allFaresInfoGroup == null) {
            allFaresInfoGroup = new ArrayList<FaresInfoType>();
        }
        return this.allFaresInfoGroup;
    }

}
