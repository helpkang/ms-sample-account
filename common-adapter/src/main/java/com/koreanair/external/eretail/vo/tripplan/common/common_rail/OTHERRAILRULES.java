
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
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
 *         &lt;element ref="{}RAIL_UPGRADE_RULE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROVIDER_PREFERENCE" type="{}PROVIDER_PREFERENCE_Type" minOccurs="0"/&gt;
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
    "railupgraderule",
    "listproviderpreference"
})
@XmlRootElement(name = "OTHER_RAIL_RULES")
public class OTHERRAILRULES
    implements Serializable
{

    @XmlElement(name = "RAIL_UPGRADE_RULE")
    protected RAILUPGRADERULE railupgraderule;
    @XmlElement(name = "LIST_PROVIDER_PREFERENCE")
    protected PROVIDERPREFERENCEType listproviderpreference;

    /**
     * Gets the value of the railupgraderule property.
     * 
     * @return
     *     possible object is
     *     {@link RAILUPGRADERULE }
     *     
     */
    public RAILUPGRADERULE getRAILUPGRADERULE() {
        return railupgraderule;
    }

    /**
     * Sets the value of the railupgraderule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILUPGRADERULE }
     *     
     */
    public void setRAILUPGRADERULE(RAILUPGRADERULE value) {
        this.railupgraderule = value;
    }

    /**
     * Gets the value of the listproviderpreference property.
     * 
     * @return
     *     possible object is
     *     {@link PROVIDERPREFERENCEType }
     *     
     */
    public PROVIDERPREFERENCEType getLISTPROVIDERPREFERENCE() {
        return listproviderpreference;
    }

    /**
     * Sets the value of the listproviderpreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDERPREFERENCEType }
     *     
     */
    public void setLISTPROVIDERPREFERENCE(PROVIDERPREFERENCEType value) {
        this.listproviderpreference = value;
    }

}
