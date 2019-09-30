//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_reply_13_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the vehicle information
 * 
 * <p>Java class for VehicleInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleCharacteristic" type="{http://xml.amadeus.com/PNRACC_13_2_1A}VehicleTypeOptionType" minOccurs="0"/>
 *         &lt;element name="vehSpecialEquipment" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="vehicleInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityDetailsTypeI_187593C" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="freeTextDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}FreeTextDetailsType_187592C" minOccurs="0"/>
 *         &lt;element name="carModel" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInformationType", propOrder = {
    "vehicleCharacteristic",
    "vehSpecialEquipment",
    "vehicleInfo",
    "freeTextDetails",
    "carModel"
})
public class VehicleInformationType {

    protected VehicleTypeOptionType vehicleCharacteristic;
    protected List<String> vehSpecialEquipment;
    protected List<QuantityDetailsTypeI187593C> vehicleInfo;
    protected FreeTextDetailsType187592C freeTextDetails;
    protected String carModel;

    /**
     * Gets the value of the vehicleCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeOptionType }
     *     
     */
    public VehicleTypeOptionType getVehicleCharacteristic() {
        return vehicleCharacteristic;
    }

    /**
     * Sets the value of the vehicleCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeOptionType }
     *     
     */
    public void setVehicleCharacteristic(VehicleTypeOptionType value) {
        this.vehicleCharacteristic = value;
    }

    /**
     * Gets the value of the vehSpecialEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehSpecialEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehSpecialEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehSpecialEquipment() {
        if (vehSpecialEquipment == null) {
            vehSpecialEquipment = new ArrayList<String>();
        }
        return this.vehSpecialEquipment;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityDetailsTypeI187593C }
     * 
     * 
     */
    public List<QuantityDetailsTypeI187593C> getVehicleInfo() {
        if (vehicleInfo == null) {
            vehicleInfo = new ArrayList<QuantityDetailsTypeI187593C>();
        }
        return this.vehicleInfo;
    }

    /**
     * Gets the value of the freeTextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextDetailsType187592C }
     *     
     */
    public FreeTextDetailsType187592C getFreeTextDetails() {
        return freeTextDetails;
    }

    /**
     * Sets the value of the freeTextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextDetailsType187592C }
     *     
     */
    public void setFreeTextDetails(FreeTextDetailsType187592C value) {
        this.freeTextDetails = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

}
