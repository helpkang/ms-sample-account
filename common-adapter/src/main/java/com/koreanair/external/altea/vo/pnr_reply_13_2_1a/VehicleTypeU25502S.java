//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information about a vehicle.
 * 
 * <p>Java class for VehicleTypeU_25502S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleTypeU_25502S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehiculeDescription" type="{http://xml.amadeus.com/PNRACC_13_2_1A}VehicleInformationTypeU_46439C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleTypeU_25502S", propOrder = {
    "vehiculeDescription"
})
public class VehicleTypeU25502S {

    @XmlElement(required = true)
    protected VehicleInformationTypeU46439C vehiculeDescription;

    /**
     * Gets the value of the vehiculeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInformationTypeU46439C }
     *     
     */
    public VehicleInformationTypeU46439C getVehiculeDescription() {
        return vehiculeDescription;
    }

    /**
     * Sets the value of the vehiculeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInformationTypeU46439C }
     *     
     */
    public void setVehiculeDescription(VehicleInformationTypeU46439C value) {
        this.vehiculeDescription = value;
    }

}
