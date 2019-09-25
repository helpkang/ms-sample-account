
package com.koreanair.eretail.pojo.flexpricer.commonavailabilityoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CUSTOMREGIONType;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}OutputCityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_CUSTOM_REGION" type="{}CUSTOM_REGION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "locationcode",
    "locationname",
    "listcustomregion"
})
public class LocationType
    extends OutputCityType
    implements Serializable
{

    @XmlElement(name = "LOCATION_CODE", required = true)
    protected String locationcode;
    @XmlElement(name = "LOCATION_NAME", required = true)
    protected String locationname;
    @XmlElement(name = "LIST_CUSTOM_REGION")
    protected List<CUSTOMREGIONType> listcustomregion;

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONCODE() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONCODE(String value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the locationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONNAME() {
        return locationname;
    }

    /**
     * Sets the value of the locationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONNAME(String value) {
        this.locationname = value;
    }

    /**
     * Gets the value of the listcustomregion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcustomregion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCUSTOMREGION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUSTOMREGIONType }
     * 
     * 
     */
    public List<CUSTOMREGIONType> getLISTCUSTOMREGION() {
        if (listcustomregion == null) {
            listcustomregion = new ArrayList<CUSTOMREGIONType>();
        }
        return this.listcustomregion;
    }

}
